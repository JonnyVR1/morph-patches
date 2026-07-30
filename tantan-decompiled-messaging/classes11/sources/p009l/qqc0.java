package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.RemoteDeleteAction;
import com.p1.mobile.putong.data.RemoteDeleteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import l.e30;
import l.mkd0;
import l.rhi;
import l.uqd0;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qqc0 {

    /* JADX INFO: renamed from: a */
    public static final uqd0 f19445a = new uqd0("Remote_Delete_Actions", "");

    /* JADX INFO: renamed from: b */
    public static final ArrayList<String> f19446b;

    /* JADX INFO: renamed from: c */
    public static List<Integer> f19447c;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f19446b = arrayList;
        f19447c = null;
        String parent = App.e.getFilesDir().getParent();
        arrayList.add(parent + "/databases/");
        arrayList.add(parent + "/shared_prefs/putongPref.xml");
        arrayList.add(parent + "/shared_prefs/putongPref_backup.xml");
        arrayList.add(parent + "/shared_prefs/preferences.xml");
        arrayList.add(parent + "/shared_prefs/preferences_backup.xml");
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m21143b(RemoteDeleteAction remoteDeleteAction, RemoteDeleteAction remoteDeleteAction2) {
        return remoteDeleteAction.version - remoteDeleteAction2.version;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m21144c(File file) {
        try {
            if (file.isDirectory()) {
                file.getName();
                rhi.k(file);
            } else if (file.isFile()) {
                file.getName();
                rhi.m(file.getAbsolutePath());
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m21145d(RemoteConfig.ConfigStep configStep) {
        try {
            RemoteDeleteConfig remoteDeleteConfig = (RemoteDeleteConfig) RemoteConfig.m9619x().m9654v("android_delete_config", RemoteDeleteConfig.JSON_ADAPTER);
            if (NullChecker.a(remoteDeleteConfig)) {
                List list = remoteDeleteConfig.actions;
                if (NullChecker.a(list)) {
                    m21155n();
                    Collections.sort(list, new Comparator() { // from class: l.lqc0
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return qqc0.m21143b((RemoteDeleteAction) obj, (RemoteDeleteAction) obj2);
                        }
                    });
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        m21149h((RemoteDeleteAction) it.next());
                    }
                }
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ boolean m21148g(final File file) {
        if (vwb.r(f19446b, new w9j() { // from class: l.pqc0
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
    public static void m21149h(RemoteDeleteAction remoteDeleteAction) {
        try {
            if (NullChecker.a(f19447c) && f19447c.contains(Integer.valueOf(remoteDeleteAction.version))) {
                return;
            }
            m21153l(App.e.getFilesDir().getParent(), remoteDeleteAction.dataFiles);
            m21153l(App.e.getExternalFilesDir(null).getParent(), remoteDeleteAction.externalFiles);
            m21151j(App.e.getFilesDir().getParent(), remoteDeleteAction.dataDirs);
            m21151j(App.e.getExternalFilesDir(null).getParent(), remoteDeleteAction.externalDirs);
            if (f19447c == null) {
                f19447c = new ArrayList();
            }
            f19447c.add(Integer.valueOf(remoteDeleteAction.version));
            uqd0 uqd0Var = f19445a;
            uqd0Var.put(((String) uqd0Var.get()) + remoteDeleteAction.version + "@version@");
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m21150i(File file) {
        if (file == null || !file.exists() || !file.isDirectory()) {
            if (file != null) {
                file.getAbsolutePath();
            }
        } else {
            File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: l.nqc0
                @Override // java.io.FileFilter
                public final boolean accept(File file2) {
                    return qqc0.m21148g(file2);
                }
            });
            if (NullChecker.a(fileArrListFiles)) {
                vwb.A(fileArrListFiles, new e30() { // from class: l.oqc0
                    public final void call(Object obj) {
                        qqc0.m21144c((File) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m21151j(String str, List<String> list) {
        if (vwb.J(list)) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                m21150i(new File(str, it.next()));
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m21152k(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        final File file = new File(str, str2);
        if (vwb.m(f19446b, new w9j() { // from class: l.mqc0
            public final Object call(Object obj) {
                return Boolean.valueOf(file.getAbsolutePath().startsWith((String) obj));
            }
        })) {
            file.getAbsolutePath();
        } else {
            file.getAbsolutePath();
            rhi.m(file.getAbsolutePath());
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m21153l(String str, List<String> list) {
        if (vwb.J(list)) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                m21152k(str, it.next());
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m21154m() {
        RemoteConfig.m9605Y().filter(new w9j() { // from class: l.jqc0
            public final Object call(Object obj) {
                RemoteConfig.ConfigStep configStep = (RemoteConfig.ConfigStep) obj;
                return Boolean.valueOf(configStep == RemoteConfig.ConfigStep.DEVICE || configStep == RemoteConfig.ConfigStep.USER);
            }
        }).take(1).subscribe(mkd0.G(new e30() { // from class: l.kqc0
            public final void call(Object obj) {
                qqc0.m21145d((RemoteConfig.ConfigStep) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public static void m21155n() {
        String str = (String) f19445a.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] strArrSplit = str.split("@version@");
        if (strArrSplit.length > 0) {
            f19447c = new ArrayList();
            for (String str2 : strArrSplit) {
                f19447c.add(Integer.valueOf(Integer.parseInt(str2)));
            }
        }
    }
}
