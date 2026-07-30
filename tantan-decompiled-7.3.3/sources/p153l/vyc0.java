package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.data.RemoteDeleteAction;
import com.p051p1.mobile.putong.data.RemoteDeleteConfig;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class vyc0 {

    /* JADX INFO: renamed from: a */
    public static final wyd0 f186354a = new wyd0("Remote_Delete_Actions", "");

    /* JADX INFO: renamed from: b */
    public static final ArrayList<String> f186355b;

    /* JADX INFO: renamed from: c */
    public static List<Integer> f186356c;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f186355b = arrayList;
        f186356c = null;
        String parent = App.f16088e.getFilesDir().getParent();
        arrayList.add(parent + "/databases/");
        arrayList.add(parent + "/shared_prefs/putongPref.xml");
        arrayList.add(parent + "/shared_prefs/putongPref_backup.xml");
        arrayList.add(parent + "/shared_prefs/preferences.xml");
        arrayList.add(parent + "/shared_prefs/preferences_backup.xml");
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m203956b(RemoteDeleteAction remoteDeleteAction, RemoteDeleteAction remoteDeleteAction2) {
        return remoteDeleteAction.version - remoteDeleteAction2.version;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m203957c(File file) {
        try {
            if (file.isDirectory()) {
                file.getName();
                oki.m168023k(file);
            } else if (file.isFile()) {
                file.getName();
                oki.m168025m(file.getAbsolutePath());
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m203958d(RemoteConfig.ConfigStep configStep) {
        try {
            RemoteDeleteConfig remoteDeleteConfig = (RemoteDeleteConfig) RemoteConfig.m80481x().m80516v("android_delete_config", RemoteDeleteConfig.JSON_ADAPTER);
            if (NullChecker.m82486a(remoteDeleteConfig)) {
                List<RemoteDeleteAction> list = remoteDeleteConfig.actions;
                if (NullChecker.m82486a(list)) {
                    m203968n();
                    Collections.sort(list, new Comparator() { // from class: l.qyc0
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return vyc0.m203956b((RemoteDeleteAction) obj, (RemoteDeleteAction) obj2);
                        }
                    });
                    Iterator<RemoteDeleteAction> it = list.iterator();
                    while (it.hasNext()) {
                        m203962h(it.next());
                    }
                }
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ boolean m203961g(final File file) {
        if (jyb.m147529r(f186355b, new qcj() { // from class: l.uyc0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(file.getAbsolutePath().startsWith((String) obj));
            }
        }) == null) {
            return true;
        }
        file.getName();
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static void m203962h(RemoteDeleteAction remoteDeleteAction) {
        try {
            if (NullChecker.m82486a(f186356c) && f186356c.contains(Integer.valueOf(remoteDeleteAction.version))) {
                return;
            }
            m203966l(App.f16088e.getFilesDir().getParent(), remoteDeleteAction.dataFiles);
            m203966l(App.f16088e.getExternalFilesDir(null).getParent(), remoteDeleteAction.externalFiles);
            m203964j(App.f16088e.getFilesDir().getParent(), remoteDeleteAction.dataDirs);
            m203964j(App.f16088e.getExternalFilesDir(null).getParent(), remoteDeleteAction.externalDirs);
            if (f186356c == null) {
                f186356c = new ArrayList();
            }
            f186356c.add(Integer.valueOf(remoteDeleteAction.version));
            wyd0 wyd0Var = f186354a;
            wyd0Var.put(wyd0Var.get() + remoteDeleteAction.version + "@version@");
            wyd0Var.get();
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m203963i(File file) {
        if (file == null || !file.exists() || !file.isDirectory()) {
            if (file != null) {
                file.getAbsolutePath();
            }
        } else {
            File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: l.syc0
                @Override // java.io.FileFilter
                public final boolean accept(File file2) {
                    return vyc0.m203961g(file2);
                }
            });
            if (NullChecker.m82486a(fileArrListFiles)) {
                jyb.m147470A(fileArrListFiles, new y20() { // from class: l.tyc0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        vyc0.m203957c((File) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m203964j(String str, List<String> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                m203963i(new File(str, it.next()));
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m203965k(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        final File file = new File(str, str2);
        if (jyb.m147520m(f186355b, new qcj() { // from class: l.ryc0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(file.getAbsolutePath().startsWith((String) obj));
            }
        })) {
            file.getAbsolutePath();
        } else {
            file.getAbsolutePath();
            oki.m168025m(file.getAbsolutePath());
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m203966l(String str, List<String> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                m203965k(str, it.next());
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m203967m() {
        RemoteConfig.m80467Y().filter(new qcj() { // from class: l.oyc0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                RemoteConfig.ConfigStep configStep = (RemoteConfig.ConfigStep) obj;
                return Boolean.valueOf(configStep == RemoteConfig.ConfigStep.DEVICE || configStep == RemoteConfig.ConfigStep.USER);
            }
        }).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.pyc0
            @Override // p153l.y20
            public final void call(Object obj) {
                vyc0.m203958d((RemoteConfig.ConfigStep) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public static void m203968n() {
        String str = f186354a.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] strArrSplit = str.split("@version@");
        if (strArrSplit.length > 0) {
            f186356c = new ArrayList();
            for (String str2 : strArrSplit) {
                f186356c.add(Integer.valueOf(Integer.parseInt(str2)));
            }
        }
    }
}
