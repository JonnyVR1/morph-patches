package p009l;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e16;
import l.e30;
import l.upk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zqx {

    /* JADX INFO: renamed from: a */
    public View f23839a;

    /* JADX INFO: renamed from: b */
    public Activity f23840b;

    /* JADX INFO: renamed from: c */
    public boolean f23841c;

    /* JADX INFO: renamed from: d */
    public boolean f23842d;

    /* JADX INFO: renamed from: e */
    public d30 f23843e;

    /* JADX INFO: renamed from: f */
    public e30<PermissionHelper.PermissionDeniedReason> f23844f;

    /* JADX INFO: renamed from: g */
    public x4e f23845g;

    /* JADX INFO: renamed from: h */
    public w4e f23846h;

    /* JADX INFO: renamed from: i */
    public v4e f23847i;

    /* JADX INFO: renamed from: k */
    public static boolean m25938k() {
        return Build.VERSION.SDK_INT >= 34;
    }

    /* JADX INFO: renamed from: d */
    public void m25939d(@NonNull Activity activity, @Nullable View view, @NonNull d30 d30Var, @Nullable e30<PermissionHelper.PermissionDeniedReason> e30Var, @Nullable x4e x4eVar, @Nullable w4e w4eVar, @Nullable v4e v4eVar) {
        m25940e(activity, view, true, true, d30Var, e30Var, x4eVar, w4eVar, v4eVar);
    }

    /* JADX INFO: renamed from: e */
    public void m25940e(@NonNull Activity activity, @Nullable View view, final boolean z, final boolean z2, @NonNull d30 d30Var, @Nullable e30<PermissionHelper.PermissionDeniedReason> e30Var, @Nullable x4e x4eVar, @Nullable w4e w4eVar, @Nullable v4e v4eVar) {
        if (!m25938k()) {
            upk0.a("You should not use this here, please check!");
            return;
        }
        this.f23840b = activity;
        this.f23839a = view;
        this.f23843e = d30Var;
        this.f23841c = z;
        this.f23842d = z2;
        this.f23844f = e30Var;
        this.f23845g = x4eVar;
        this.f23846h = w4eVar;
        this.f23847i = v4eVar;
        if (NullChecker.a(view)) {
            view.setOnClickListener(new View.OnClickListener() { // from class: l.wqx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f22286a.m25941f(z2, z, view2);
                }
            });
        }
        m25944i(true);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m25941f(boolean z, boolean z2, View view) {
        String[] strArr;
        if (z && z2) {
            strArr = new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"};
        } else if (z) {
            strArr = new String[]{"android.permission.READ_MEDIA_VIDEO"};
        } else {
            strArr = z2 ? new String[]{"android.permission.READ_MEDIA_IMAGES"} : null;
        }
        m25945j(strArr);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m25942g() {
        m25944i(false);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m25943h(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        m25944i(false);
    }

    /* JADX INFO: renamed from: i */
    public final void m25944i(boolean z) {
        String[] strArr;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && ((!this.f23841c || e16.a(this.f23840b, "android.permission.READ_MEDIA_IMAGES") == 0) && (!this.f23842d || e16.a(this.f23840b, "android.permission.READ_MEDIA_VIDEO") == 0))) {
            if (NullChecker.a(this.f23839a)) {
                this.f23839a.setVisibility(8);
            }
            this.f23843e.call();
            return;
        }
        if (i >= 34 && e16.a(this.f23840b, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
            if (NullChecker.a(this.f23839a)) {
                this.f23839a.setVisibility(0);
            }
            this.f23843e.call();
            return;
        }
        if (e16.a(this.f23840b, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            if (NullChecker.a(this.f23839a)) {
                this.f23839a.setVisibility(8);
            }
            this.f23843e.call();
            return;
        }
        View view = this.f23839a;
        if (!z) {
            if (NullChecker.a(view)) {
                this.f23839a.setVisibility(0);
            }
            e30<PermissionHelper.PermissionDeniedReason> e30Var = this.f23844f;
            if (e30Var != null) {
                e30Var.call(PermissionHelper.PermissionDeniedReason.PermissionCancelForRequest);
                return;
            }
            return;
        }
        if (NullChecker.a(view)) {
            this.f23839a.setVisibility(8);
        }
        if (i >= 34) {
            boolean z2 = this.f23842d;
            if (z2 && this.f23841c) {
                strArr = new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"};
            } else if (z2) {
                strArr = new String[]{"android.permission.READ_MEDIA_VIDEO"};
            } else {
                strArr = this.f23841c ? new String[]{"android.permission.READ_MEDIA_IMAGES"} : null;
            }
        } else {
            strArr = new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
        }
        m25945j(strArr);
    }

    /* JADX INFO: renamed from: j */
    public final void m25945j(String... strArr) {
        PermissionHelper.m10211c().m10229r(strArr).m10234w(false).m10232u(false).m10224m(new d30() { // from class: l.xqx
            public final void call() {
                this.f22695a.m25942g();
            }
        }, new e30() { // from class: l.yqx
            public final void call(Object obj) {
                this.f23212a.m25943h((PermissionHelper.PermissionDeniedReason) obj);
            }
        }).m10227p(this.f23847i).m10231t(this.f23846h).m10233v(this.f23845g).m10220i(this.f23840b);
    }
}
