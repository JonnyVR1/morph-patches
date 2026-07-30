package com.p000p1.mobile.putong.p004ui.permission;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.common.R;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import l.d30;
import l.e16;
import l.e30;
import l.mkd0;
import l.o460;
import p009l.uj60;
import p009l.v4e;
import p009l.w4e;
import p009l.x4e;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class PermissionHelper {

    /* JADX INFO: renamed from: a */
    public static final String[] f8222a = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};

    public enum PermissionDeniedReason {
        PermissionCancelForRequest,
        GoToSettingPage,
        PermissionCancelForSetting,
        Null,
        Unknown
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.permission.PermissionHelper$a */
    public static class C0530a {

        /* JADX INFO: renamed from: a */
        public String[] f8223a;

        /* JADX INFO: renamed from: b */
        public InterfaceC0531b f8224b;

        /* JADX INFO: renamed from: c */
        public v4e f8225c;

        /* JADX INFO: renamed from: d */
        public w4e f8226d;

        /* JADX INFO: renamed from: e */
        public x4e f8227e;

        /* JADX INFO: renamed from: f */
        public boolean f8228f;

        /* JADX INFO: renamed from: g */
        public boolean f8229g;

        /* JADX INFO: renamed from: h */
        public boolean f8230h;

        /* JADX INFO: renamed from: i */
        public boolean f8231i;

        /* JADX INFO: renamed from: j */
        public int f8232j;

        /* JADX INFO: renamed from: com.p1.mobile.putong.ui.permission.PermissionHelper$a$a */
        public class a implements InterfaceC0531b {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Activity f8233a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ List f8234b;

            public a(Activity activity, List list) {
                this.f8233a = activity;
                this.f8234b = list;
            }

            @Override // com.p000p1.mobile.putong.p004ui.permission.PermissionHelper.InterfaceC0531b
            /* JADX INFO: renamed from: a */
            public void mo10235a(boolean z, PermissionDeniedReason permissionDeniedReason) {
                C0530a.this.m10219h(this.f8233a, this.f8234b, z, permissionDeniedReason);
            }
        }

        public C0530a() {
            this.f8223a = new String[0];
            this.f8224b = null;
            this.f8225c = null;
            this.f8226d = null;
            this.f8227e = null;
            this.f8228f = true;
            this.f8229g = false;
            this.f8230h = false;
            this.f8231i = true;
            this.f8232j = 0;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m10214c(d30 d30Var, e30 e30Var, boolean z, PermissionDeniedReason permissionDeniedReason) {
            if (z) {
                if (d30Var != null) {
                    d30Var.call();
                }
            } else if (e30Var != null) {
                e30Var.call(permissionDeniedReason);
            }
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Boolean m10216e() throws Exception {
            return Boolean.valueOf(PermissionHelper.m10210b(this.f8223a));
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m10217f(Activity activity, Boolean bool) {
            if (bool.booleanValue() || o460.g() < 23) {
                if (NullChecker.a(this.f8224b)) {
                    this.f8224b.mo10235a(true, PermissionDeniedReason.Null);
                }
            } else {
                if (activity.isFinishing()) {
                    return;
                }
                m10219h(activity, m10218g(this.f8223a), true, PermissionDeniedReason.Null);
            }
        }

        /* JADX INFO: renamed from: g */
        public final List<List<String>> m10218g(String[] strArr) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set<List<String>> setKeySet = uj60.f21212c.keySet();
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
        public final void m10219h(@NonNull Activity activity, List<List<String>> list, boolean z, PermissionDeniedReason permissionDeniedReason) {
            if (!z || list.isEmpty()) {
                if (NullChecker.a(this.f8224b)) {
                    this.f8224b.mo10235a(z, permissionDeniedReason);
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
            PermissionRequestFragment.m10245t(strArr, new a(activity, list), this.f8225c, this.f8226d, this.f8227e, this.f8228f, this.f8229g, this.f8230h, this.f8231i, this.f8232j, null).m10256u(activity.getFragmentManager());
        }

        /* JADX INFO: renamed from: i */
        public void m10220i(@NonNull final Activity activity) {
            c.fromCallable(new Callable() { // from class: l.pj60
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f18735a.m10216e();
                }
            }).compose(mkd0.C()).subscribe(mkd0.G(new e30() { // from class: l.qj60
                public final void call(Object obj) {
                    this.f19358a.m10217f(activity, (Boolean) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: j */
        public C0530a m10221j(boolean z) {
            this.f8231i = z;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C0530a m10222k(boolean z) {
            this.f8228f = z;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C0530a m10223l(InterfaceC0531b interfaceC0531b) {
            this.f8224b = interfaceC0531b;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C0530a m10224m(final d30 d30Var, final e30<PermissionDeniedReason> e30Var) {
            if (d30Var == null && e30Var == null) {
                this.f8224b = null;
                return this;
            }
            this.f8224b = new InterfaceC0531b() { // from class: l.oj60
                @Override // com.p000p1.mobile.putong.p004ui.permission.PermissionHelper.InterfaceC0531b
                /* JADX INFO: renamed from: a */
                public final void mo10235a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                    PermissionHelper.C0530a.m10214c(d30Var, e30Var, z, permissionDeniedReason);
                }
            };
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C0530a m10225n(e30<PermissionDeniedReason> e30Var) {
            return m10224m(null, e30Var);
        }

        /* JADX INFO: renamed from: o */
        public C0530a m10226o(d30 d30Var) {
            return m10224m(d30Var, null);
        }

        /* JADX INFO: renamed from: p */
        public C0530a m10227p(v4e v4eVar) {
            this.f8225c = v4eVar;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C0530a m10228q(List<String> list) {
            this.f8223a = list == null ? new String[0] : (String[]) list.toArray(new String[0]);
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C0530a m10229r(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            this.f8223a = strArr;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C0530a m10230s(InterfaceC0532c interfaceC0532c) {
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C0530a m10231t(w4e w4eVar) {
            this.f8226d = w4eVar;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C0530a m10232u(boolean z) {
            this.f8230h = z;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C0530a m10233v(x4e x4eVar) {
            this.f8227e = x4eVar;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C0530a m10234w(boolean z) {
            this.f8229g = z;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.permission.PermissionHelper$b */
    public interface InterfaceC0531b {
        /* JADX INFO: renamed from: a */
        void mo10235a(boolean z, PermissionDeniedReason permissionDeniedReason);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.permission.PermissionHelper$c */
    public interface InterfaceC0532c {
    }

    /* JADX INFO: renamed from: a */
    public static CharSequence m10209a(String str) {
        try {
            PackageManager packageManager = App.e.getPackageManager();
            return packageManager.getPermissionGroupInfo(str, 0).loadLabel(packageManager);
        } catch (PackageManager.NameNotFoundException e) {
            if ("android.permission.BLUETOOTH_CONNECT".equals(str)) {
                return App.e.getString(R.string.A0);
            }
            if (Build.VERSION.SDK_INT >= 33) {
                if ("android.permission.READ_MEDIA_VIDEO".equals(str) || "android.permission.READ_MEDIA_IMAGES".equals(str) || "android.permission.READ_MEDIA_VISUAL_USER_SELECTED".equals(str)) {
                    return App.e.getString(R.string.l0);
                }
                if ("android.permission.READ_MEDIA_AUDIO".equals(str)) {
                    return App.e.getString(R.string.e0);
                }
                if ("android.permission.POST_NOTIFICATIONS".equals(str)) {
                    return App.e.getString(R.string.k0);
                }
            }
            CrashHelper.c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10210b(String... strArr) {
        for (String str : strArr) {
            if (Build.VERSION.SDK_INT == 33 && ("android.permission.READ_EXTERNAL_STORAGE".equals(str) || "android.permission.WRITE_EXTERNAL_STORAGE".equals(str))) {
                if (e16.a(App.e, "android.permission.READ_MEDIA_VIDEO") != 0 || e16.a(App.e, "android.permission.READ_MEDIA_IMAGES") != 0) {
                    return false;
                }
            } else if (e16.a(App.e, str) != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static C0530a m10211c() {
        return new C0530a();
    }
}
