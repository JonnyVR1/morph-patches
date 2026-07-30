package p153l;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class wzx {

    /* JADX INFO: renamed from: a */
    public View f191839a;

    /* JADX INFO: renamed from: b */
    public Activity f191840b;

    /* JADX INFO: renamed from: c */
    public boolean f191841c;

    /* JADX INFO: renamed from: d */
    public boolean f191842d;

    /* JADX INFO: renamed from: e */
    public x20 f191843e;

    /* JADX INFO: renamed from: f */
    public y20<PermissionHelper.PermissionDeniedReason> f191844f;

    /* JADX INFO: renamed from: g */
    public l6e f191845g;

    /* JADX INFO: renamed from: h */
    public k6e f191846h;

    /* JADX INFO: renamed from: i */
    public j6e f191847i;

    /* JADX INFO: renamed from: k */
    public static boolean m208784k() {
        return Build.VERSION.SDK_INT >= 34;
    }

    /* JADX INFO: renamed from: d */
    public void m208785d(@NonNull Activity activity, @Nullable View view, @NonNull x20 x20Var, @Nullable y20<PermissionHelper.PermissionDeniedReason> y20Var, @Nullable l6e l6eVar, @Nullable k6e k6eVar, @Nullable j6e j6eVar) {
        m208786e(activity, view, true, true, x20Var, y20Var, l6eVar, k6eVar, j6eVar);
    }

    /* JADX INFO: renamed from: e */
    public void m208786e(@NonNull Activity activity, @Nullable View view, final boolean z, final boolean z2, @NonNull x20 x20Var, @Nullable y20<PermissionHelper.PermissionDeniedReason> y20Var, @Nullable l6e l6eVar, @Nullable k6e k6eVar, @Nullable j6e j6eVar) {
        if (!m208784k()) {
            azk0.m101074a("You should not use this here, please check!");
            return;
        }
        this.f191840b = activity;
        this.f191839a = view;
        this.f191843e = x20Var;
        this.f191841c = z;
        this.f191842d = z2;
        this.f191844f = y20Var;
        this.f191845g = l6eVar;
        this.f191846h = k6eVar;
        this.f191847i = j6eVar;
        if (NullChecker.m82486a(view)) {
            view.setOnClickListener(new View.OnClickListener() { // from class: l.tzx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f176827a.m208787f(z2, z, view2);
                }
            });
        }
        m208790i(true);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m208787f(boolean z, boolean z2, View view) {
        String[] strArr;
        if (z && z2) {
            strArr = new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"};
        } else if (z) {
            strArr = new String[]{"android.permission.READ_MEDIA_VIDEO"};
        } else {
            strArr = z2 ? new String[]{"android.permission.READ_MEDIA_IMAGES"} : null;
        }
        m208791j(strArr);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m208788g() {
        m208790i(false);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m208789h(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        m208790i(false);
    }

    /* JADX INFO: renamed from: i */
    public final void m208790i(boolean z) {
        String[] strArr;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && ((!this.f191841c || j26.m143188a(this.f191840b, "android.permission.READ_MEDIA_IMAGES") == 0) && (!this.f191842d || j26.m143188a(this.f191840b, "android.permission.READ_MEDIA_VIDEO") == 0))) {
            if (NullChecker.m82486a(this.f191839a)) {
                this.f191839a.setVisibility(8);
            }
            this.f191843e.call();
            return;
        }
        if (i >= 34 && j26.m143188a(this.f191840b, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
            if (NullChecker.m82486a(this.f191839a)) {
                this.f191839a.setVisibility(0);
            }
            this.f191843e.call();
            return;
        }
        if (j26.m143188a(this.f191840b, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            if (NullChecker.m82486a(this.f191839a)) {
                this.f191839a.setVisibility(8);
            }
            this.f191843e.call();
            return;
        }
        View view = this.f191839a;
        if (!z) {
            if (NullChecker.m82486a(view)) {
                this.f191839a.setVisibility(0);
            }
            y20<PermissionHelper.PermissionDeniedReason> y20Var = this.f191844f;
            if (y20Var != null) {
                y20Var.call(PermissionHelper.PermissionDeniedReason.PermissionCancelForRequest);
                return;
            }
            return;
        }
        if (NullChecker.m82486a(view)) {
            this.f191839a.setVisibility(8);
        }
        if (i >= 34) {
            boolean z2 = this.f191842d;
            if (z2 && this.f191841c) {
                strArr = new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"};
            } else if (z2) {
                strArr = new String[]{"android.permission.READ_MEDIA_VIDEO"};
            } else {
                strArr = this.f191841c ? new String[]{"android.permission.READ_MEDIA_IMAGES"} : null;
            }
        } else {
            strArr = new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
        }
        m208791j(strArr);
    }

    /* JADX INFO: renamed from: j */
    public final void m208791j(String... strArr) {
        PermissionHelper.m81065c().m81083r(strArr).m81088w(false).m81086u(false).m81078m(new x20() { // from class: l.uzx
            @Override // p153l.x20
            public final void call() {
                this.f181818a.m208788g();
            }
        }, new y20() { // from class: l.vzx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186518a.m208789h((PermissionHelper.PermissionDeniedReason) obj);
            }
        }).m81081p(this.f191847i).m81085t(this.f191846h).m81087v(this.f191845g).m81074i(this.f191840b);
    }
}
