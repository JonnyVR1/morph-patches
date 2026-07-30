package com.p046p1.mobile.putong.core.p053ui.profile.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileCustomBar;
import com.p046p1.mobile.putong.core.util.CertificationUtil;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import p147v.VImage;
import p147v.VLinear_FillerMeasure;
import p147v.VText;
import p149l.aj90;
import p149l.d30;
import p149l.f6c0;
import p149l.jjb0;
import p149l.t100;
import p149l.upa;
import p149l.x2c0;
import p149l.xdl0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileCustomBar extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f34147a;

    /* JADX INFO: renamed from: b */
    public View f34148b;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f34149c;

    /* JADX INFO: renamed from: d */
    public ImageView f34150d;

    /* JADX INFO: renamed from: e */
    public VLinear_FillerMeasure f34151e;

    /* JADX INFO: renamed from: f */
    public VText f34152f;

    /* JADX INFO: renamed from: g */
    public VImage f34153g;

    /* JADX INFO: renamed from: h */
    public ODiamondTagLabel f34154h;

    /* JADX INFO: renamed from: i */
    public VImage f34155i;

    /* JADX INFO: renamed from: j */
    public VText f34156j;

    /* JADX INFO: renamed from: k */
    public VText f34157k;

    /* JADX INFO: renamed from: l */
    public VImage f34158l;

    /* JADX INFO: renamed from: m */
    public VImage f34159m;

    /* JADX INFO: renamed from: n */
    public View f34160n;

    /* JADX INFO: renamed from: o */
    public View f34161o;

    public ProfileCustomBar(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m52943a(d30 d30Var, View view) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m52944b(d30 d30Var, View view) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m52945c(View view) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m52946d(d30 d30Var, View view) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m52947e(View view) {
        aj90.m96971a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m52948f(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f < 0.1d) {
            this.f34151e.setVisibility(4);
        } else {
            float f2 = f + (1.4f * f);
            float f3 = f2 <= 1.0f ? f2 : 1.0f;
            this.f34151e.setVisibility(0);
            f = f3;
        }
        this.f34151e.setAlpha(f);
    }

    /* JADX INFO: renamed from: g */
    public void m52949g(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f < 0.1d) {
            this.f34149c.setVisibility(4);
            this.f34147a.setOnClickListener(null);
            this.f34147a.setClickable(false);
        } else {
            float f2 = f + (1.4f * f);
            float f3 = f2 <= 1.0f ? f2 : 1.0f;
            this.f34149c.setVisibility(0);
            this.f34147a.setOnClickListener(new View.OnClickListener() { // from class: l.zi90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileCustomBar.m52945c(view);
                }
            });
            f = f3;
        }
        this.f34149c.setAlpha(f);
        this.f34148b.setAlpha(f);
        this.f34160n.setAlpha(f);
    }

    /* JADX INFO: renamed from: h */
    public void m52950h(User user, String str, boolean z) {
        xdl0.m208344M(this.f34151e, z);
        xdl0.m208344M(this.f34156j, !z);
        if (!z) {
            m52951i(this.f34156j, user, str);
            return;
        }
        m52951i(this.f34152f, user, str);
        m52952j(user);
        m52955m(user);
    }

    /* JADX INFO: renamed from: i */
    public final void m52951i(VText vText, User user, String str) {
        vText.setTypeface(Typeface.DEFAULT_BOLD);
        if (user.isBannedNew() || user.isAccountCancellation()) {
            vText.setText(user.publicId);
        } else {
            vText.setText(user.name);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m52952j(User user) {
        xdl0.m208344M(this.f34154h, false);
        xdl0.m208344M(this.f34155i, false);
        if (user.isMe() && user.isHideIconFromSVipWithMe()) {
            return;
        }
        if (user.isMe() || !user.isHideIconFromSVip()) {
            if (user.isODiamond()) {
                xdl0.m208344M(this.f34154h, true);
                this.f34154h.m79167o0();
                return;
            }
            if (user.isPlatinum()) {
                xdl0.m208344M(this.f34154h, true);
                this.f34154h.m79164l0();
                return;
            }
            xdl0.m208344M(this.f34155i, true);
            CoreModule.m29935P().m94654e().mo34986o7(getContext(), user, this.f34155i, true, false);
            ViewGroup.LayoutParams layoutParams = this.f34155i.getLayoutParams();
            layoutParams.width = -2;
            this.f34155i.setLayoutParams(layoutParams);
            this.f34155i.setClickable(false);
            this.f34155i.setEnabled(false);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m52953k(User user, String str, boolean z, boolean z2) {
        m52954l(user, str, z, z2, false);
    }

    /* JADX INFO: renamed from: l */
    public void m52954l(User user, String str, boolean z, boolean z2, boolean z3) {
        if (user == null) {
            return;
        }
        xdl0.m208370d0(this.f34156j, t100.m186890d(20.0f));
        xdl0.m208374f0(this.f34156j, t100.m186890d(2.0f));
        m52950h(user, str, z3);
        if (user.isMe() && !z && z2) {
            xdl0.m208344M(this.f34159m, true);
        } else {
            xdl0.m208344M(this.f34159m, false);
        }
        xdl0.m208344M(this.f34158l, false);
    }

    /* JADX INFO: renamed from: m */
    public final void m52955m(User user) {
        if (jjb0.m141784b()) {
            int iM58150i = CertificationUtil.m58150i(user, true);
            VImage vImage = this.f34153g;
            if (iM58150i == -1) {
                xdl0.m208344M(vImage, false);
            } else {
                xdl0.m208344M(vImage, true);
                this.f34153g.setImageResource(iM58150i);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m52956n() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f34157k.getLayoutParams();
        marginLayoutParams.rightMargin = t100.f167261j;
        this.f34157k.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: o */
    public void m52957o() {
        xdl0.m208345M0(this.f34157k, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (this.f34161o == null) {
            View viewInflate = View.inflate(getContext(), f6c0.f96031u9, null);
            this.f34161o = viewInflate;
            viewInflate.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            addView(this.f34161o);
            m52947e(this.f34161o);
        }
        if (upa.m194670M3()) {
            this.f34159m.setImageResource(x2c0.f189271Dl);
            this.f34152f.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
    }

    public void setBackCallBack(final d30 d30Var) {
        this.f34150d.setOnClickListener(new View.OnClickListener() { // from class: l.wi90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileCustomBar.m52943a(d30Var, view);
            }
        });
    }

    public void setEditCallBack(final d30 d30Var) {
        this.f34159m.setOnClickListener(new View.OnClickListener() { // from class: l.xi90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileCustomBar.m52946d(d30Var, view);
            }
        });
    }

    public void setMoreCallBack(final d30 d30Var) {
        this.f34158l.setOnClickListener(new View.OnClickListener() { // from class: l.yi90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileCustomBar.m52944b(d30Var, view);
            }
        });
    }

    public ProfileCustomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProfileCustomBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
