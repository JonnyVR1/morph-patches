package com.p051p1.mobile.putong.p070ui.permission;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import p137rx.C22421c;
import p153l.as60;
import p153l.j26;
import p153l.j6e;
import p153l.k6e;
import p153l.l6e;
import p153l.psd0;
import p153l.uc60;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes10.dex */
public class PermissionHelper {

    /* JADX INFO: renamed from: a */
    public static final String[] f55464a = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};

    public enum PermissionDeniedReason {
        PermissionCancelForRequest,
        GoToSettingPage,
        PermissionCancelForSetting,
        Null,
        Unknown
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.permission.PermissionHelper$a */
    public static class C13291a {

        /* JADX INFO: renamed from: a */
        public String[] f55465a;

        /* JADX INFO: renamed from: b */
        public InterfaceC13292b f55466b;

        /* JADX INFO: renamed from: c */
        public j6e f55467c;

        /* JADX INFO: renamed from: d */
        public k6e f55468d;

        /* JADX INFO: renamed from: e */
        public l6e f55469e;

        /* JADX INFO: renamed from: f */
        public boolean f55470f;

        /* JADX INFO: renamed from: g */
        public boolean f55471g;

        /* JADX INFO: renamed from: h */
        public boolean f55472h;

        /* JADX INFO: renamed from: i */
        public boolean f55473i;

        /* JADX INFO: renamed from: j */
        public int f55474j;

        /* JADX INFO: renamed from: com.p1.mobile.putong.ui.permission.PermissionHelper$a$a */
        public class a implements InterfaceC13292b {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Activity f55475a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ List f55476b;

            public a(Activity activity, List list) {
                this.f55475a = activity;
                this.f55476b = list;
            }

            @Override // com.p051p1.mobile.putong.p070ui.permission.PermissionHelper.InterfaceC13292b
            /* JADX INFO: renamed from: a */
            public void mo81089a(boolean z, PermissionDeniedReason permissionDeniedReason) {
                C13291a.this.m81073h(this.f55475a, this.f55476b, z, permissionDeniedReason);
            }
        }

        public C13291a() {
            this.f55465a = new String[0];
            this.f55466b = null;
            this.f55467c = null;
            this.f55468d = null;
            this.f55469e = null;
            this.f55470f = true;
            this.f55471g = false;
            this.f55472h = false;
            this.f55473i = true;
            this.f55474j = 0;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m81068c(x20 x20Var, y20 y20Var, boolean z, PermissionDeniedReason permissionDeniedReason) {
            if (z) {
                if (x20Var != null) {
                    x20Var.call();
                }
            } else if (y20Var != null) {
                y20Var.call(permissionDeniedReason);
            }
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Boolean m81070e() throws Exception {
            return Boolean.valueOf(PermissionHelper.m81064b(this.f55465a));
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m81071f(Activity activity, Boolean bool) {
            if (bool.booleanValue() || uc60.m195384g() < 23) {
                if (NullChecker.m82486a(this.f55466b)) {
                    this.f55466b.mo81089a(true, PermissionDeniedReason.Null);
                }
            } else {
                if (activity.isFinishing()) {
                    return;
                }
                m81073h(activity, m81072g(this.f55465a), true, PermissionDeniedReason.Null);
            }
        }

        /* JADX INFO: renamed from: g */
        public final List<List<String>> m81072g(String[] strArr) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set<List<String>> setKeySet = as60.f73083c.keySet();
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
        public final void m81073h(@NonNull Activity activity, List<List<String>> list, boolean z, PermissionDeniedReason permissionDeniedReason) {
            if (!z || list.isEmpty()) {
                if (NullChecker.m82486a(this.f55466b)) {
                    this.f55466b.mo81089a(z, permissionDeniedReason);
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
            PermissionRequestFragment.m81099t(strArr, new a(activity, list), this.f55467c, this.f55468d, this.f55469e, this.f55470f, this.f55471g, this.f55472h, this.f55473i, this.f55474j, null).m81110u(activity.getFragmentManager());
        }

        /* JADX INFO: renamed from: i */
        public void m81074i(@NonNull final Activity activity) {
            C22421c.fromCallable(new Callable() { // from class: l.ur60
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f180572a.m81070e();
                }
            }).compose(psd0.m173592C()).subscribe(psd0.m173596G(new y20() { // from class: l.vr60
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f185435a.m81071f(activity, (Boolean) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: j */
        public C13291a m81075j(boolean z) {
            this.f55473i = z;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C13291a m81076k(boolean z) {
            this.f55470f = z;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C13291a m81077l(InterfaceC13292b interfaceC13292b) {
            this.f55466b = interfaceC13292b;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C13291a m81078m(final x20 x20Var, final y20<PermissionDeniedReason> y20Var) {
            if (x20Var == null && y20Var == null) {
                this.f55466b = null;
                return this;
            }
            this.f55466b = new InterfaceC13292b() { // from class: l.tr60
                @Override // com.p051p1.mobile.putong.p070ui.permission.PermissionHelper.InterfaceC13292b
                /* JADX INFO: renamed from: a */
                public final void mo81089a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                    PermissionHelper.C13291a.m81068c(x20Var, y20Var, z, permissionDeniedReason);
                }
            };
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C13291a m81079n(y20<PermissionDeniedReason> y20Var) {
            return m81078m(null, y20Var);
        }

        /* JADX INFO: renamed from: o */
        public C13291a m81080o(x20 x20Var) {
            return m81078m(x20Var, null);
        }

        /* JADX INFO: renamed from: p */
        public C13291a m81081p(j6e j6eVar) {
            this.f55467c = j6eVar;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C13291a m81082q(List<String> list) {
            this.f55465a = list == null ? new String[0] : (String[]) list.toArray(new String[0]);
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C13291a m81083r(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            this.f55465a = strArr;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C13291a m81084s(InterfaceC13293c interfaceC13293c) {
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C13291a m81085t(k6e k6eVar) {
            this.f55468d = k6eVar;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C13291a m81086u(boolean z) {
            this.f55472h = z;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C13291a m81087v(l6e l6eVar) {
            this.f55469e = l6eVar;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C13291a m81088w(boolean z) {
            this.f55471g = z;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.permission.PermissionHelper$b */
    public interface InterfaceC13292b {
        /* JADX INFO: renamed from: a */
        void mo81089a(boolean z, PermissionDeniedReason permissionDeniedReason);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.permission.PermissionHelper$c */
    public interface InterfaceC13293c {
    }

    /* JADX INFO: renamed from: a */
    public static CharSequence m81063a(String str) {
        try {
            PackageManager packageManager = App.f16088e.getPackageManager();
            return packageManager.getPermissionGroupInfo(str, 0).loadLabel(packageManager);
        } catch (PackageManager.NameNotFoundException e) {
            if ("android.permission.BLUETOOTH_CONNECT".equals(str)) {
                return App.f16088e.getString(R$string.f18021A0);
            }
            if (Build.VERSION.SDK_INT >= 33) {
                if ("android.permission.READ_MEDIA_VIDEO".equals(str) || "android.permission.READ_MEDIA_IMAGES".equals(str) || "android.permission.READ_MEDIA_VISUAL_USER_SELECTED".equals(str)) {
                    return App.f16088e.getString(R$string.f18180l0);
                }
                if ("android.permission.READ_MEDIA_AUDIO".equals(str)) {
                    return App.f16088e.getString(R$string.f18145e0);
                }
                if ("android.permission.POST_NOTIFICATIONS".equals(str)) {
                    return App.f16088e.getString(R$string.f18175k0);
                }
            }
            CrashHelper.m82479c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m81064b(String... strArr) {
        for (String str : strArr) {
            if (Build.VERSION.SDK_INT == 33 && ("android.permission.READ_EXTERNAL_STORAGE".equals(str) || "android.permission.WRITE_EXTERNAL_STORAGE".equals(str))) {
                if (j26.m143188a(App.f16088e, "android.permission.READ_MEDIA_VIDEO") != 0 || j26.m143188a(App.f16088e, "android.permission.READ_MEDIA_IMAGES") != 0) {
                    return false;
                }
            } else if (j26.m143188a(App.f16088e, str) != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static C13291a m81065c() {
        return new C13291a();
    }
}
