package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.LayoutDesc;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.ProfileButton;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lp90 {

    /* JADX INFO: renamed from: a */
    public final int f133027a = 100;

    /* JADX INFO: renamed from: b */
    public LayoutDesc f133028b;

    /* JADX INFO: renamed from: c */
    public Context f133029c;

    /* JADX INFO: renamed from: d */
    public View f133030d;

    public lp90(Context context, LayoutDesc layoutDesc) {
        this.f133028b = layoutDesc;
        this.f133029c = context;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: b */
    public void m155164b(final View view) {
        view.setOnTouchListener(new View.OnTouchListener() { // from class: l.kp90
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return this.f127841a.m155168i(view, view2, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public View mo155165c() {
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public LayoutDesc m155166d() {
        return this.f133028b;
    }

    /* JADX INFO: renamed from: e */
    public abstract ProfileButton mo112044e(ProfileButton.ProfileButtonType profileButtonType);

    /* JADX INFO: renamed from: f */
    public ProfileButton mo155167f(ProfileButton.ProfileButtonType profileButtonType, LayoutDesc.ComboType comboType) {
        return mo112044e(profileButtonType);
    }

    /* JADX INFO: renamed from: g */
    public abstract View mo112045g();

    /* JADX INFO: renamed from: h */
    public void mo112046h(View view) {
        if (NullChecker.m82486a(this.f133028b)) {
            tu2.m192703a("[core][profile]", "button layout initView : comboType :" + this.f133028b.m53572a().toString());
            if (this.f133028b.m53572a() == LayoutDesc.ComboType.None) {
                bnl0.m105524M(view, false);
            } else {
                bnl0.m105524M(view, true);
                mo112047j(this.f133028b);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean m155168i(View view, View view2, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            view.animate().scaleX(0.875f).scaleY(0.875f).setDuration(100L).start();
            return false;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        }
        view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        return false;
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo112047j(LayoutDesc layoutDesc);

    /* JADX INFO: renamed from: k */
    public View m155169k() {
        if (this.f133030d == null) {
            tu2.m192703a("[core][profile]", "button layout inflate");
            View viewMo112045g = mo112045g();
            this.f133030d = viewMo112045g;
            mo112046h(viewMo112045g);
        }
        return this.f133030d;
    }

    /* JADX INFO: renamed from: l */
    public void m155170l(@NonNull LayoutDesc layoutDesc) {
        if (this.f133028b.m53572a() != layoutDesc.m53572a()) {
            this.f133028b = layoutDesc;
            tu2.m192703a("[core][profile]", "button layout update layout: comboType :" + layoutDesc.m53572a().toString());
            LayoutDesc.ComboType comboTypeM53572a = layoutDesc.m53572a();
            LayoutDesc.ComboType comboType = LayoutDesc.ComboType.None;
            View view = this.f133030d;
            if (comboTypeM53572a == comboType) {
                bnl0.m105524M(view, false);
            } else {
                bnl0.m105524M(view, true);
                mo112047j(layoutDesc);
            }
        }
    }
}
