package org.eclipse.jetty.security;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import javax.security.auth.Subject;
import org.eclipse.jetty.server.UserIdentity;
import org.eclipse.jetty.util.Scanner;
import org.eclipse.jetty.util.component.AbstractLifeCycle;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.util.security.Credential;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class PropertyUserStore extends AbstractLifeCycle {
    private static final Logger LOG = Log.getLogger((Class<?>) PropertyUserStore.class);
    private String _config;
    private Resource _configResource;
    private List<UserListener> _listeners;
    private Scanner _scanner;
    private int _refreshInterval = 0;
    private IdentityService _identityService = new DefaultIdentityService();
    private boolean _firstLoad = true;
    private final List<String> _knownUsers = new ArrayList();
    private final Map<String, UserIdentity> _knownUserIdentities = new HashMap();

    public interface UserListener {
        void remove(String str);

        void update(String str, Credential credential, String[] strArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadUsers() throws IOException {
        String strTrim;
        if (this._config == null) {
            return;
        }
        Logger logger = LOG;
        if (logger.isDebugEnabled()) {
            logger.debug("Load " + this + " from " + this._config, new Object[0]);
        }
        Properties properties = new Properties();
        if (getConfigResource().exists()) {
            properties.load(getConfigResource().getInputStream());
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : properties.entrySet()) {
            String strTrim2 = ((String) entry.getKey()).trim();
            String strTrim3 = ((String) entry.getValue()).trim();
            int iIndexOf = strTrim3.indexOf(44);
            if (iIndexOf > 0) {
                strTrim = strTrim3.substring(iIndexOf + 1).trim();
                strTrim3 = strTrim3.substring(0, iIndexOf).trim();
            } else {
                strTrim = null;
            }
            if (strTrim2 != null && strTrim2.length() > 0 && strTrim3 != null && strTrim3.length() > 0) {
                String[] strArrSplit = IdentityService.NO_ROLES;
                if (strTrim != null && strTrim.length() > 0) {
                    strArrSplit = strTrim.split(",");
                }
                hashSet.add(strTrim2);
                Credential credential = Credential.getCredential(strTrim3);
                MappedLoginService.KnownUser knownUser = new MappedLoginService.KnownUser(strTrim2, credential);
                Subject subject = new Subject();
                subject.getPrincipals().add(knownUser);
                subject.getPrivateCredentials().add(credential);
                if (strTrim != null) {
                    for (String str : strArrSplit) {
                        subject.getPrincipals().add(new MappedLoginService.RolePrincipal(str));
                    }
                }
                subject.setReadOnly();
                this._knownUserIdentities.put(strTrim2, this._identityService.newUserIdentity(subject, knownUser, strArrSplit));
                notifyUpdate(strTrim2, credential, strArrSplit);
            }
        }
        synchronized (this._knownUsers) {
            try {
                if (!this._firstLoad) {
                    for (String str2 : this._knownUsers) {
                        if (!hashSet.contains(str2)) {
                            this._knownUserIdentities.remove(str2);
                            notifyRemove(str2);
                        }
                    }
                }
                this._knownUsers.clear();
                this._knownUsers.addAll(hashSet);
            } catch (Throwable th) {
                throw th;
            }
        }
        this._firstLoad = false;
    }

    private void notifyRemove(String str) {
        List<UserListener> list = this._listeners;
        if (list != null) {
            Iterator<UserListener> it = list.iterator();
            while (it.hasNext()) {
                it.next().remove(str);
            }
        }
    }

    private void notifyUpdate(String str, Credential credential, String[] strArr) {
        List<UserListener> list = this._listeners;
        if (list != null) {
            Iterator<UserListener> it = list.iterator();
            while (it.hasNext()) {
                it.next().update(str, credential, strArr);
            }
        }
    }

    @Override // org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        super.doStart();
        if (getRefreshInterval() <= 0) {
            loadUsers();
            return;
        }
        Scanner scanner = new Scanner();
        this._scanner = scanner;
        scanner.setScanInterval(getRefreshInterval());
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(getConfigResource().getFile().getParentFile());
        this._scanner.setScanDirs(arrayList);
        this._scanner.setFilenameFilter(new FilenameFilter() { // from class: org.eclipse.jetty.security.PropertyUserStore.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                try {
                    return new File(file, str).compareTo(PropertyUserStore.this.getConfigResource().getFile()) == 0;
                } catch (IOException unused) {
                }
            }
        });
        this._scanner.addListener(new Scanner.BulkListener() { // from class: org.eclipse.jetty.security.PropertyUserStore.2
            @Override // org.eclipse.jetty.util.Scanner.BulkListener
            public void filesChanged(List<String> list) throws Exception {
                if (list != null && !list.isEmpty() && list.size() == 1 && Resource.newResource(list.get(0)).getFile().equals(PropertyUserStore.this._configResource.getFile())) {
                    PropertyUserStore.this.loadUsers();
                }
            }

            public String toString() {
                return "PropertyUserStore$Scanner";
            }
        });
        this._scanner.setReportExistingFilesOnStartup(true);
        this._scanner.setRecursive(false);
        this._scanner.start();
    }

    @Override // org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStop() throws Exception {
        super.doStop();
        Scanner scanner = this._scanner;
        if (scanner != null) {
            scanner.stop();
        }
        this._scanner = null;
    }

    public String getConfig() {
        return this._config;
    }

    public Resource getConfigResource() throws IOException {
        if (this._configResource == null) {
            this._configResource = Resource.newResource(this._config);
        }
        return this._configResource;
    }

    public int getRefreshInterval() {
        return this._refreshInterval;
    }

    public UserIdentity getUserIdentity(String str) {
        return this._knownUserIdentities.get(str);
    }

    public void registerUserListener(UserListener userListener) {
        if (this._listeners == null) {
            this._listeners = new ArrayList();
        }
        this._listeners.add(userListener);
    }

    public void setConfig(String str) {
        this._config = str;
    }

    public void setRefreshInterval(int i) {
        this._refreshInterval = i;
    }
}
