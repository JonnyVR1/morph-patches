package com.p046p1.mobile.putong.p065ui.permission;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import p133rx.C22306c;
import p149l.d30;
import p149l.e16;
import p149l.e30;
import p149l.mkd0;
import p149l.o460;
import p149l.uj60;
import p149l.v4e;
import p149l.w4e;
import p149l.x4e;

/* JADX INFO: loaded from: classes11.dex */
public class PermissionHelper {

    /* JADX INFO: renamed from: a */
    public static final String[] f54616a = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};

    public enum PermissionDeniedReason {
        PermissionCancelForRequest,
        GoToSettingPage,
        PermissionCancelForSetting,
        Null,
        Unknown
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.permission.PermissionHelper$a */
    public static class C13128a {

        /* JADX INFO: renamed from: a */
        public String[] f54617a;

        /* JADX INFO: renamed from: b */
        public InterfaceC13129b f54618b;

        /* JADX INFO: renamed from: c */
        public v4e f54619c;

        /* JADX INFO: renamed from: d */
        public w4e f54620d;

        /* JADX INFO: renamed from: e */
        public x4e f54621e;

        /* JADX INFO: renamed from: f */
        public boolean f54622f;

        /* JADX INFO: renamed from: g */
        public boolean f54623g;

        /* JADX INFO: renamed from: h */
        public boolean f54624h;

        /* JADX INFO: renamed from: i */
        public boolean f54625i;

        /* JADX INFO: renamed from: j */
        public int f54626j;

        /* JADX INFO: renamed from: com.p1.mobile.putong.ui.permission.PermissionHelper$a$a */
        public class a implements InterfaceC13129b {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Activity f54627a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ List f54628b;

            public a(Activity activity, List list) {
                this.f54627a = activity;
                this.f54628b = list;
            }

            @Override // com.p046p1.mobile.putong.p065ui.permission.PermissionHelper.InterfaceC13129b
            /* JADX INFO: renamed from: a */
            public void mo79906a(boolean z, PermissionDeniedReason permissionDeniedReason) {
                C13128a.this.m79890h(this.f54627a, this.f54628b, z, permissionDeniedReason);
            }
        }

        public C13128a() {
            this.f54617a = new String[0];
            this.f54618b = null;
            this.f54619c = null;
            this.f54620d = null;
            this.f54621e = null;
            this.f54622f = true;
            this.f54623g = false;
            this.f54624h = false;
            this.f54625i = true;
            this.f54626j = 0;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m79885c(d30 d30Var, e30 e30Var, boolean z, PermissionDeniedReason permissionDeniedReason) {
            if (z) {
                if (d30Var != null) {
                    d30Var.call();
                }
            } else if (e30Var != null) {
                e30Var.call(permissionDeniedReason);
            }
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Boolean m79887e() throws Exception {
            return Boolean.valueOf(PermissionHelper.m79881b(this.f54617a));
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m79888f(Activity activity, Boolean bool) {
            if (bool.booleanValue() || o460.m162554g() < 23) {
                if (NullChecker.m81303a(this.f54618b)) {
                    this.f54618b.mo79906a(true, PermissionDeniedReason.Null);
                }
            } else {
                if (activity.isFinishing()) {
                    return;
                }
                m79890h(activity, m79889g(this.f54617a), true, PermissionDeniedReason.Null);
            }
        }

        /* JADX INFO: renamed from: g */
        public final List<List<String>> m79889g(String[] strArr) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set<List<String>> setKeySet = uj60.f176739c.keySet();
            for (String str : strArr) {
                List<String> arrayList = new ArrayList<>();
                for (List<String> list : setKeySet) {
                    if (list.contains(str)) {
                        arrayList = list;
                        break;
                    }
                }
                List arrayList2 = (List) linkedHashMap.get(arrayList);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(str);
                linkedHashMap.put(arrayList, arrayList2);
            }
            return new ArrayList(linkedHashMap.values());
        }

        /* JADX INFO: renamed from: h */
        public final void m79890h(@NonNull Activity activity, List<List<String>> list, boolean z, PermissionDeniedReason permissionDeniedReason) {
            if (!z || list.isEmpty()) {
                if (NullChecker.m81303a(this.f54618b)) {
                    this.f54618b.mo79906a(z, permissionDeniedReason);
                    return;
                }
                return;
            }
            String[] strArr = (String[]) list.remove(0).toArray(new String[0]);
            if (Build.VERSION.SDK_INT == 33) {
                ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
                if (arrayList.contains("android.permission.READ_EXTERNAL_STORAGE") && arrayList.contains("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    arrayList.remove("android.permission.READ_EXTERNAL_STORAGE");
                    arrayList.remove("android.permission.WRITE_EXTERNAL_STORAGE");
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                } else if (arrayList.contains("android.permission.READ_EXTERNAL_STORAGE")) {
                    arrayList.remove("android.permission.READ_EXTERNAL_STORAGE");
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                } else if (arrayList.contains("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    arrayList.remove("android.permission.WRITE_EXTERNAL_STORAGE");
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                }
                strArr = (String[]) arrayList.toArray(new String[0]);
            }
            PermissionRequestFragment.m79916t(strArr, new a(activity, list), this.f54619c, this.f54620d, this.f54621e, this.f54622f, this.f54623g, this.f54624h, this.f54625i, this.f54626j, null).m79927u(activity.getFragmentManager());
        }

        /* JADX INFO: renamed from: i */
        public void m79891i(@NonNull final Activity activity) {
            C22306c.fromCallable(new Callable() { // from class: l.pj60
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f149717a.m79887e();
                }
            }).compose(mkd0.m154951C()).subscribe(mkd0.m154955G(new e30() { // from class: l.qj60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f154898a.m79888f(activity, (Boolean) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: j */
        public C13128a m79892j(boolean z) {
            this.f54625i = z;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C13128a m79893k(boolean z) {
            this.f54622f = z;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C13128a m79894l(InterfaceC13129b interfaceC13129b) {
            this.f54618b = interfaceC13129b;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C13128a m79895m(final d30 d30Var, final e30<PermissionDeniedReason> e30Var) {
            if (d30Var == null && e30Var == null) {
                this.f54618b = null;
                return this;
            }
            this.f54618b = new InterfaceC13129b() { // from class: l.oj60
                @Override // com.p046p1.mobile.putong.p065ui.permission.PermissionHelper.InterfaceC13129b
                /* JADX INFO: renamed from: a */
                public final void mo79906a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                    PermissionHelper.C13128a.m79885c(d30Var, e30Var, z, permissionDeniedReason);
                }
            };
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C13128a m79896n(e30<PermissionDeniedReason> e30Var) {
            return m79895m(null, e30Var);
        }

        /* JADX INFO: renamed from: o */
        public C13128a m79897o(d30 d30Var) {
            return m79895m(d30Var, null);
        }

        /* JADX INFO: renamed from: p */
        public C13128a m79898p(v4e v4eVar) {
            this.f54619c = v4eVar;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C13128a m79899q(List<String> list) {
            this.f54617a = list == null ? new String[0] : (String[]) list.toArray(new String[0]);
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C13128a m79900r(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            this.f54617a = strArr;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C13128a m79901s(InterfaceC13130c interfaceC13130c) {
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C13128a m79902t(w4e w4eVar) {
            this.f54620d = w4eVar;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C13128a m79903u(boolean z) {
            this.f54624h = z;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C13128a m79904v(x4e x4eVar) {
            this.f54621e = x4eVar;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C13128a m79905w(boolean z) {
            this.f54623g = z;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.permission.PermissionHelper$b */
    public interface InterfaceC13129b {
        /* JADX INFO: renamed from: a */
        void mo79906a(boolean z, PermissionDeniedReason permissionDeniedReason);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.permission.PermissionHelper$c */
    public interface InterfaceC13130c {
    }

    /* JADX INFO: renamed from: a */
    public static CharSequence m79880a(String str) {
        try {
            PackageManager packageManager = App.f15369e.getPackageManager();
            return packageManager.getPermissionGroupInfo(str, 0).loadLabel(packageManager);
        } catch (PackageManager.NameNotFoundException e) {
            if ("android.permission.BLUETOOTH_CONNECT".equals(str)) {
                return App.f15369e.getString(R$string.f17302A0);
            }
            if (Build.VERSION.SDK_INT >= 33) {
                if ("android.permission.READ_MEDIA_VIDEO".equals(str) || "android.permission.READ_MEDIA_IMAGES".equals(str) || "android.permission.READ_MEDIA_VISUAL_USER_SELECTED".equals(str)) {
                    return App.f15369e.getString(R$string.f17461l0);
                }
                if ("android.permission.READ_MEDIA_AUDIO".equals(str)) {
                    return App.f15369e.getString(R$string.f17426e0);
                }
                if ("android.permission.POST_NOTIFICATIONS".equals(str)) {
                    return App.f15369e.getString(R$string.f17456k0);
                }
            }
            CrashHelper.m81296c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m79881b(String... strArr) {
        for (String str : strArr) {
            if (Build.VERSION.SDK_INT == 33 && ("android.permission.READ_EXTERNAL_STORAGE".equals(str) || "android.permission.WRITE_EXTERNAL_STORAGE".equals(str))) {
                if (e16.m114373a(App.f15369e, "android.permission.READ_MEDIA_VIDEO") != 0 || e16.m114373a(App.f15369e, "android.permission.READ_MEDIA_IMAGES") != 0) {
                    return false;
                }
            } else if (e16.m114373a(App.f15369e, str) != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static C13128a m79882c() {
        return new C13128a();
    }
}
