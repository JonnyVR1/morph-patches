package org.eclipse.jetty.util.resource;

import java.io.File;
import java.io.IOException;
import java.net.JarURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: classes2.dex */
class JarFileResource extends JarResource {
    private static final Logger LOG = Log.getLogger((Class<?>) JarFileResource.class);
    private boolean _directory;
    private JarEntry _entry;
    private boolean _exists;
    private File _file;
    private JarFile _jarFile;
    private String _jarUrl;
    private String[] _list;
    private String _path;

    public JarFileResource(URL url) {
        super(url);
    }

    public static Resource getNonCachingResource(Resource resource) {
        return !(resource instanceof JarFileResource) ? resource : new JarFileResource(((JarFileResource) resource).getURL(), false);
    }

    private List<String> listEntries() {
        checkConnection();
        ArrayList arrayList = new ArrayList(32);
        JarFile jarFile = this._jarFile;
        if (jarFile == null) {
            try {
                JarURLConnection jarURLConnection = (JarURLConnection) new URL(this._jarUrl).openConnection();
                jarURLConnection.setUseCaches(getUseCaches());
                jarFile = jarURLConnection.getJarFile();
            } catch (Exception e) {
                e.printStackTrace();
                LOG.ignore(e);
            }
        }
        Enumeration<JarEntry> enumerationEntries = jarFile.entries();
        String str = this._urlString;
        String strSubstring = str.substring(str.indexOf("!/") + 2);
        while (enumerationEntries.hasMoreElements()) {
            String strReplace = enumerationEntries.nextElement().getName().replace('\\', '/');
            if (strReplace.startsWith(strSubstring) && strReplace.length() != strSubstring.length()) {
                String strSubstring2 = strReplace.substring(strSubstring.length());
                int iIndexOf = strSubstring2.indexOf(47);
                if (iIndexOf >= 0) {
                    if (iIndexOf != 0 || strSubstring2.length() != 1) {
                        strSubstring2 = iIndexOf == 0 ? strSubstring2.substring(iIndexOf + 1, strSubstring2.length()) : strSubstring2.substring(0, iIndexOf + 1);
                        if (arrayList.contains(strSubstring2)) {
                        }
                    }
                }
                arrayList.add(strSubstring2);
            }
        }
        return arrayList;
    }

    @Override // org.eclipse.jetty.util.resource.JarResource, org.eclipse.jetty.util.resource.URLResource
    public boolean checkConnection() {
        try {
            super.checkConnection();
            if (this._jarConnection == null) {
                this._entry = null;
                this._file = null;
                this._jarFile = null;
                this._list = null;
            }
            return this._jarFile != null;
        } catch (Throwable th) {
            if (this._jarConnection == null) {
                this._entry = null;
                this._file = null;
                this._jarFile = null;
                this._list = null;
            }
            throw th;
        }
    }

    @Override // org.eclipse.jetty.util.resource.Resource
    public String encode(String str) {
        return str;
    }

    @Override // org.eclipse.jetty.util.resource.JarResource, org.eclipse.jetty.util.resource.URLResource, org.eclipse.jetty.util.resource.Resource
    public boolean exists() {
        JarFile jarFile;
        boolean z = true;
        if (this._exists) {
            return true;
        }
        if (this._urlString.endsWith("!/")) {
            String str = this._urlString;
            try {
                return Resource.newResource(str.substring(4, str.length() - 2)).exists();
            } catch (Exception e) {
                LOG.ignore(e);
                return false;
            }
        }
        boolean zCheckConnection = checkConnection();
        if (this._jarUrl != null && this._path == null) {
            this._directory = zCheckConnection;
            return true;
        }
        if (zCheckConnection) {
            jarFile = this._jarFile;
        } else {
            try {
                JarURLConnection jarURLConnection = (JarURLConnection) new URL(this._jarUrl).openConnection();
                jarURLConnection.setUseCaches(getUseCaches());
                jarFile = jarURLConnection.getJarFile();
            } catch (Exception e2) {
                LOG.ignore(e2);
                jarFile = null;
            }
        }
        if (jarFile != null && this._entry == null && !this._directory) {
            Enumeration<JarEntry> enumerationEntries = jarFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                JarEntry jarEntryNextElement = enumerationEntries.nextElement();
                String strReplace = jarEntryNextElement.getName().replace('\\', '/');
                if (!strReplace.equals(this._path)) {
                    boolean zEndsWith = this._path.endsWith("/");
                    String str2 = this._path;
                    if (!zEndsWith) {
                        if (strReplace.startsWith(str2) && strReplace.length() > this._path.length() && strReplace.charAt(this._path.length()) == '/') {
                            this._directory = true;
                            break;
                        }
                    } else if (strReplace.startsWith(str2)) {
                        this._directory = true;
                        break;
                    }
                } else {
                    this._entry = jarEntryNextElement;
                    this._directory = this._path.endsWith("/");
                    break;
                }
            }
            if (this._directory && !this._urlString.endsWith("/")) {
                this._urlString += "/";
                try {
                    this._url = new URL(this._urlString);
                } catch (MalformedURLException e3) {
                    LOG.warn(e3);
                }
            }
        }
        if (!this._directory && this._entry == null) {
            z = false;
        }
        this._exists = z;
        return z;
    }

    @Override // org.eclipse.jetty.util.resource.URLResource, org.eclipse.jetty.util.resource.Resource
    public boolean isContainedIn(Resource resource) throws MalformedURLException {
        String strSubstring = this._urlString;
        int iIndexOf = strSubstring.indexOf("!/");
        if (iIndexOf > 0) {
            strSubstring = strSubstring.substring(0, iIndexOf);
        }
        if (strSubstring.startsWith("jar:")) {
            strSubstring = strSubstring.substring(4);
        }
        return new URL(strSubstring).sameFile(resource.getURL());
    }

    @Override // org.eclipse.jetty.util.resource.URLResource, org.eclipse.jetty.util.resource.Resource
    public boolean isDirectory() {
        if (this._urlString.endsWith("/")) {
            return true;
        }
        return exists() && this._directory;
    }

    @Override // org.eclipse.jetty.util.resource.URLResource, org.eclipse.jetty.util.resource.Resource
    public long lastModified() {
        JarEntry jarEntry;
        if (!checkConnection() || this._file == null) {
            return -1L;
        }
        return (!exists() || (jarEntry = this._entry) == null) ? this._file.lastModified() : jarEntry.getTime();
    }

    @Override // org.eclipse.jetty.util.resource.URLResource, org.eclipse.jetty.util.resource.Resource
    public long length() {
        JarEntry jarEntry;
        if (isDirectory() || (jarEntry = this._entry) == null) {
            return -1L;
        }
        return jarEntry.getSize();
    }

    @Override // org.eclipse.jetty.util.resource.URLResource, org.eclipse.jetty.util.resource.Resource
    public synchronized String[] list() {
        List<String> listListEntries;
        if (isDirectory() && this._list == null) {
            try {
                listListEntries = listEntries();
            } catch (Exception e) {
                LOG.warn("Retrying list:" + e, new Object[0]);
                LOG.debug(e);
                release();
                listListEntries = listEntries();
            }
            if (listListEntries != null) {
                String[] strArr = new String[listListEntries.size()];
                this._list = strArr;
                listListEntries.toArray(strArr);
            }
        }
        return this._list;
    }

    @Override // org.eclipse.jetty.util.resource.JarResource
    public synchronized void newConnection() throws IOException {
        try {
            super.newConnection();
            this._entry = null;
            this._file = null;
            this._jarFile = null;
            this._list = null;
            int iIndexOf = this._urlString.indexOf("!/") + 2;
            this._jarUrl = this._urlString.substring(0, iIndexOf);
            String strSubstring = this._urlString.substring(iIndexOf);
            this._path = strSubstring;
            if (strSubstring.length() == 0) {
                this._path = null;
            }
            this._jarFile = this._jarConnection.getJarFile();
            this._file = new File(this._jarFile.getName());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // org.eclipse.jetty.util.resource.JarResource, org.eclipse.jetty.util.resource.URLResource, org.eclipse.jetty.util.resource.Resource
    public synchronized void release() {
        this._list = null;
        this._entry = null;
        this._file = null;
        this._jarFile = null;
        super.release();
    }

    public JarFileResource(URL url, boolean z) {
        super(url, z);
    }
}
