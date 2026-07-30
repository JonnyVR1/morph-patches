package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.LayoutDesc;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.ProfileButton;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hh90 {

    /* JADX INFO: renamed from: a */
    public final int f107689a = 100;

    /* JADX INFO: renamed from: b */
    public LayoutDesc f107690b;

    /* JADX INFO: renamed from: c */
    public Context f107691c;

    /* JADX INFO: renamed from: d */
    public View f107692d;

    public hh90(Context context, LayoutDesc layoutDesc) {
        this.f107690b = layoutDesc;
        this.f107691c = context;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: b */
    public void m130941b(final View view) {
        view.setOnTouchListener(new View.OnTouchListener() { // from class: l.gh90
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return this.f102639a.m130943i(view, view2, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public View mo122154c() {
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public LayoutDesc m130942d() {
        return this.f107690b;
    }

    /* JADX INFO: renamed from: e */
    public abstract ProfileButton mo114662e(ProfileButton.ProfileButtonType profileButtonType);

    /* JADX INFO: renamed from: f */
    public ProfileButton mo122155f(ProfileButton.ProfileButtonType profileButtonType, LayoutDesc.ComboType comboType) {
        return mo114662e(profileButtonType);
    }

    /* JADX INFO: renamed from: g */
    public abstract View mo114663g();

    /* JADX INFO: renamed from: h */
    public void mo114664h(View view) {
        if (NullChecker.m81303a(this.f107690b)) {
            du2.m113670a("[core][profile]", "button layout initView : comboType :" + this.f107690b.m52389a().toString());
            if (this.f107690b.m52389a() == LayoutDesc.ComboType.None) {
                xdl0.m208344M(view, false);
            } else {
                xdl0.m208344M(view, true);
                mo114665j(this.f107690b);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean m130943i(View view, View view2, MotionEvent motionEvent) {
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
    public abstract void mo114665j(LayoutDesc layoutDesc);

    /* JADX INFO: renamed from: k */
    public View m130944k() {
        if (this.f107692d == null) {
            du2.m113670a("[core][profile]", "button layout inflate");
            View viewMo114663g = mo114663g();
            this.f107692d = viewMo114663g;
            mo114664h(viewMo114663g);
        }
        return this.f107692d;
    }

    /* JADX INFO: renamed from: l */
    public void m130945l(@NonNull LayoutDesc layoutDesc) {
        if (this.f107690b.m52389a() != layoutDesc.m52389a()) {
            this.f107690b = layoutDesc;
            du2.m113670a("[core][profile]", "button layout update layout: comboType :" + layoutDesc.m52389a().toString());
            LayoutDesc.ComboType comboTypeM52389a = layoutDesc.m52389a();
            LayoutDesc.ComboType comboType = LayoutDesc.ComboType.None;
            View view = this.f107692d;
            if (comboTypeM52389a == comboType) {
                xdl0.m208344M(view, false);
            } else {
                xdl0.m208344M(view, true);
                mo114665j(layoutDesc);
            }
        }
    }
}
