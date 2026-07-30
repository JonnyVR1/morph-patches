package p002l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.LayoutDesc;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.ProfileButton;
import com.tantanapp.common.utils.NullChecker;
import l.du2;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class hh90 {

    /* JADX INFO: renamed from: a */
    public final int f12032a = 100;

    /* JADX INFO: renamed from: b */
    public LayoutDesc f12033b;

    /* JADX INFO: renamed from: c */
    public Context f12034c;

    /* JADX INFO: renamed from: d */
    public View f12035d;

    public hh90(Context context, LayoutDesc layoutDesc) {
        this.f12033b = layoutDesc;
        this.f12034c = context;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: b */
    public void m14367b(final View view) {
        view.setOnTouchListener(new View.OnTouchListener() { // from class: l.gh90
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return this.f11437a.m14369i(view, view2, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public View mo13303c() {
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public LayoutDesc m14368d() {
        return this.f12033b;
    }

    /* JADX INFO: renamed from: e */
    public abstract ProfileButton mo12175e(ProfileButton.ProfileButtonType profileButtonType);

    /* JADX INFO: renamed from: f */
    public ProfileButton mo13304f(ProfileButton.ProfileButtonType profileButtonType, LayoutDesc.ComboType comboType) {
        return mo12175e(profileButtonType);
    }

    /* JADX INFO: renamed from: g */
    public abstract View mo12176g();

    /* JADX INFO: renamed from: h */
    public void mo12177h(View view) {
        if (NullChecker.a(this.f12033b)) {
            du2.a("[core][profile]", "button layout initView : comboType :" + this.f12033b.m2923a().toString());
            if (this.f12033b.m2923a() == LayoutDesc.ComboType.None) {
                xdl0.M(view, false);
            } else {
                xdl0.M(view, true);
                mo12178j(this.f12033b);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean m14369i(View view, View view2, MotionEvent motionEvent) {
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
    public abstract void mo12178j(LayoutDesc layoutDesc);

    /* JADX INFO: renamed from: k */
    public View m14370k() {
        if (this.f12035d == null) {
            du2.a("[core][profile]", "button layout inflate");
            View viewMo12176g = mo12176g();
            this.f12035d = viewMo12176g;
            mo12177h(viewMo12176g);
        }
        return this.f12035d;
    }

    /* JADX INFO: renamed from: l */
    public void m14371l(@NonNull LayoutDesc layoutDesc) {
        if (this.f12033b.m2923a() != layoutDesc.m2923a()) {
            this.f12033b = layoutDesc;
            du2.a("[core][profile]", "button layout update layout: comboType :" + layoutDesc.m2923a().toString());
            LayoutDesc.ComboType comboTypeM2923a = layoutDesc.m2923a();
            LayoutDesc.ComboType comboType = LayoutDesc.ComboType.None;
            View view = this.f12035d;
            if (comboTypeM2923a == comboType) {
                xdl0.M(view, false);
            } else {
                xdl0.M(view, true);
                mo12178j(layoutDesc);
            }
        }
    }
}
