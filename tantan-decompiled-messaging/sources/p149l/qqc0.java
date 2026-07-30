package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.data.RemoteDeleteAction;
import com.p046p1.mobile.putong.data.RemoteDeleteConfig;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class qqc0 {

    /* JADX INFO: renamed from: a */
    public static final uqd0 f155879a = new uqd0("Remote_Delete_Actions", "");

    /* JADX INFO: renamed from: b */
    public static final ArrayList<String> f155880b;

    /* JADX INFO: renamed from: c */
    public static List<Integer> f155881c;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f155880b = arrayList;
        f155881c = null;
        String parent = App.f15369e.getFilesDir().getParent();
        arrayList.add(parent + "/databases/");
        arrayList.add(parent + "/shared_prefs/putongPref.xml");
        arrayList.add(parent + "/shared_prefs/putongPref_backup.xml");
        arrayList.add(parent + "/shared_prefs/preferences.xml");
        arrayList.add(parent + "/shared_prefs/preferences_backup.xml");
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m175890b(RemoteDeleteAction remoteDeleteAction, RemoteDeleteAction remoteDeleteAction2) {
        return remoteDeleteAction.version - remoteDeleteAction2.version;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m175891c(File file) {
        try {
            if (file.isDirectory()) {
                file.getName();
                rhi.m179367k(file);
            } else if (file.isFile()) {
                file.getName();
                rhi.m179369m(file.getAbsolutePath());
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m175892d(RemoteConfig.ConfigStep configStep) {
        try {
            RemoteDeleteConfig remoteDeleteConfig = (RemoteDeleteConfig) RemoteConfig.m79298x().m79333v("android_delete_config", RemoteDeleteConfig.JSON_ADAPTER);
            if (NullChecker.m81303a(remoteDeleteConfig)) {
                List<RemoteDeleteAction> list = remoteDeleteConfig.actions;
                if (NullChecker.m81303a(list)) {
                    m175902n();
                    Collections.sort(list, new Comparator() { // from class: l.lqc0
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return qqc0.m175890b((RemoteDeleteAction) obj, (RemoteDeleteAction) obj2);
                        }
                    });
                    Iterator<RemoteDeleteAction> it = list.iterator();
                    while (it.hasNext()) {
                        m175896h(it.next());
                    }
                }
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ boolean m175895g(final File file) {
        if (vwb.m200346r(f155880b, new w9j() { // from class: l.pqc0
            @Override // p149l.w9j
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
    public static void m175896h(RemoteDeleteAction remoteDeleteAction) {
        try {
            if (NullChecker.m81303a(f155881c) && f155881c.contains(Integer.valueOf(remoteDeleteAction.version))) {
                return;
            }
            m175900l(App.f15369e.getFilesDir().getParent(), remoteDeleteAction.dataFiles);
            m175900l(App.f15369e.getExternalFilesDir(null).getParent(), remoteDeleteAction.externalFiles);
            m175898j(App.f15369e.getFilesDir().getParent(), remoteDeleteAction.dataDirs);
            m175898j(App.f15369e.getExternalFilesDir(null).getParent(), remoteDeleteAction.externalDirs);
            if (f155881c == null) {
                f155881c = new ArrayList();
            }
            f155881c.add(Integer.valueOf(remoteDeleteAction.version));
            uqd0 uqd0Var = f155879a;
            uqd0Var.put(uqd0Var.get() + remoteDeleteAction.version + "@version@");
            uqd0Var.get();
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m175897i(File file) {
        if (file == null || !file.exists() || !file.isDirectory()) {
            if (file != null) {
                file.getAbsolutePath();
            }
        } else {
            File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: l.nqc0
                @Override // java.io.FileFilter
                public final boolean accept(File file2) {
                    return qqc0.m175895g(file2);
                }
            });
            if (NullChecker.m81303a(fileArrListFiles)) {
                vwb.m200287A(fileArrListFiles, new e30() { // from class: l.oqc0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        qqc0.m175891c((File) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m175898j(String str, List<String> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                m175897i(new File(str, it.next()));
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m175899k(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        final File file = new File(str, str2);
        if (vwb.m200337m(f155880b, new w9j() { // from class: l.mqc0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(file.getAbsolutePath().startsWith((String) obj));
            }
        })) {
            file.getAbsolutePath();
        } else {
            file.getAbsolutePath();
            rhi.m179369m(file.getAbsolutePath());
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m175900l(String str, List<String> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                m175899k(str, it.next());
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m175901m() {
        RemoteConfig.m79284Y().filter(new w9j() { // from class: l.jqc0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                RemoteConfig.ConfigStep configStep = (RemoteConfig.ConfigStep) obj;
                return Boolean.valueOf(configStep == RemoteConfig.ConfigStep.DEVICE || configStep == RemoteConfig.ConfigStep.USER);
            }
        }).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.kqc0
            @Override // p149l.e30
            public final void call(Object obj) {
                qqc0.m175892d((RemoteConfig.ConfigStep) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public static void m175902n() {
        String str = f155879a.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] strArrSplit = str.split("@version@");
        if (strArrSplit.length > 0) {
            f155881c = new ArrayList();
            for (String str2 : strArrSplit) {
                f155881c.add(Integer.valueOf(Integer.parseInt(str2)));
            }
        }
    }
}
