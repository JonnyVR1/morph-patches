package p149l;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class zqx {

    /* JADX INFO: renamed from: a */
    public View f204434a;

    /* JADX INFO: renamed from: b */
    public Activity f204435b;

    /* JADX INFO: renamed from: c */
    public boolean f204436c;

    /* JADX INFO: renamed from: d */
    public boolean f204437d;

    /* JADX INFO: renamed from: e */
    public d30 f204438e;

    /* JADX INFO: renamed from: f */
    public e30<PermissionHelper.PermissionDeniedReason> f204439f;

    /* JADX INFO: renamed from: g */
    public x4e f204440g;

    /* JADX INFO: renamed from: h */
    public w4e f204441h;

    /* JADX INFO: renamed from: i */
    public v4e f204442i;

    /* JADX INFO: renamed from: k */
    public static boolean m219898k() {
        return Build.VERSION.SDK_INT >= 34;
    }

    /* JADX INFO: renamed from: d */
    public void m219899d(@NonNull Activity activity, @Nullable View view, @NonNull d30 d30Var, @Nullable e30<PermissionHelper.PermissionDeniedReason> e30Var, @Nullable x4e x4eVar, @Nullable w4e w4eVar, @Nullable v4e v4eVar) {
        m219900e(activity, view, true, true, d30Var, e30Var, x4eVar, w4eVar, v4eVar);
    }

    /* JADX INFO: renamed from: e */
    public void m219900e(@NonNull Activity activity, @Nullable View view, final boolean z, final boolean z2, @NonNull d30 d30Var, @Nullable e30<PermissionHelper.PermissionDeniedReason> e30Var, @Nullable x4e x4eVar, @Nullable w4e w4eVar, @Nullable v4e v4eVar) {
        if (!m219898k()) {
            upk0.m194883a("You should not use this here, please check!");
            return;
        }
        this.f204435b = activity;
        this.f204434a = view;
        this.f204438e = d30Var;
        this.f204436c = z;
        this.f204437d = z2;
        this.f204439f = e30Var;
        this.f204440g = x4eVar;
        this.f204441h = w4eVar;
        this.f204442i = v4eVar;
        if (NullChecker.m81303a(view)) {
            view.setOnClickListener(new View.OnClickListener() { // from class: l.wqx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f187741a.m219901f(z2, z, view2);
                }
            });
        }
        m219904i(true);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m219901f(boolean z, boolean z2, View view) {
        String[] strArr;
        if (z && z2) {
            strArr = new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"};
        } else if (z) {
            strArr = new String[]{"android.permission.READ_MEDIA_VIDEO"};
        } else {
            strArr = z2 ? new String[]{"android.permission.READ_MEDIA_IMAGES"} : null;
        }
        m219905j(strArr);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m219902g() {
        m219904i(false);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m219903h(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        m219904i(false);
    }

    /* JADX INFO: renamed from: i */
    public final void m219904i(boolean z) {
        String[] strArr;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && ((!this.f204436c || e16.m114373a(this.f204435b, "android.permission.READ_MEDIA_IMAGES") == 0) && (!this.f204437d || e16.m114373a(this.f204435b, "android.permission.READ_MEDIA_VIDEO") == 0))) {
            if (NullChecker.m81303a(this.f204434a)) {
                this.f204434a.setVisibility(8);
            }
            this.f204438e.call();
            return;
        }
        if (i >= 34 && e16.m114373a(this.f204435b, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
            if (NullChecker.m81303a(this.f204434a)) {
                this.f204434a.setVisibility(0);
            }
            this.f204438e.call();
            return;
        }
        if (e16.m114373a(this.f204435b, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            if (NullChecker.m81303a(this.f204434a)) {
                this.f204434a.setVisibility(8);
            }
            this.f204438e.call();
            return;
        }
        View view = this.f204434a;
        if (!z) {
            if (NullChecker.m81303a(view)) {
                this.f204434a.setVisibility(0);
            }
            e30<PermissionHelper.PermissionDeniedReason> e30Var = this.f204439f;
            if (e30Var != null) {
                e30Var.call(PermissionHelper.PermissionDeniedReason.PermissionCancelForRequest);
                return;
            }
            return;
        }
        if (NullChecker.m81303a(view)) {
            this.f204434a.setVisibility(8);
        }
        if (i >= 34) {
            boolean z2 = this.f204437d;
            if (z2 && this.f204436c) {
                strArr = new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"};
            } else if (z2) {
                strArr = new String[]{"android.permission.READ_MEDIA_VIDEO"};
            } else {
                strArr = this.f204436c ? new String[]{"android.permission.READ_MEDIA_IMAGES"} : null;
            }
        } else {
            strArr = new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
        }
        m219905j(strArr);
    }

    /* JADX INFO: renamed from: j */
    public final void m219905j(String... strArr) {
        PermissionHelper.m79882c().m79900r(strArr).m79905w(false).m79903u(false).m79895m(new d30() { // from class: l.xqx
            @Override // p149l.d30
            public final void call() {
                this.f194058a.m219902g();
            }
        }, new e30() { // from class: l.yqx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199619a.m219903h((PermissionHelper.PermissionDeniedReason) obj);
            }
        }).m79898p(this.f204442i).m79902t(this.f204441h).m79904v(this.f204440g).m79891i(this.f204435b);
    }
}
