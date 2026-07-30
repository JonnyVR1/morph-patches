package com.p000p1.mobile.putong.core.p001ui.profile.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileCustomBar;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.util.CertificationUtil;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.newui.view.ODiamondTagLabel;
import l.aj90;
import l.d30;
import l.f6c0;
import l.jjb0;
import l.t100;
import l.upa;
import l.x2c0;
import l.xdl0;
import v.VImage;
import v.VLinear_FillerMeasure;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileCustomBar extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f1969a;

    /* JADX INFO: renamed from: b */
    public View f1970b;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f1971c;

    /* JADX INFO: renamed from: d */
    public ImageView f1972d;

    /* JADX INFO: renamed from: e */
    public VLinear_FillerMeasure f1973e;

    /* JADX INFO: renamed from: f */
    public VText f1974f;

    /* JADX INFO: renamed from: g */
    public VImage f1975g;

    /* JADX INFO: renamed from: h */
    public ODiamondTagLabel f1976h;

    /* JADX INFO: renamed from: i */
    public VImage f1977i;

    /* JADX INFO: renamed from: j */
    public VText f1978j;

    /* JADX INFO: renamed from: k */
    public VText f1979k;

    /* JADX INFO: renamed from: l */
    public VImage f1980l;

    /* JADX INFO: renamed from: m */
    public VImage f1981m;

    /* JADX INFO: renamed from: n */
    public View f1982n;

    /* JADX INFO: renamed from: o */
    public View f1983o;

    public ProfileCustomBar(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3501a(d30 d30Var, View view) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m3502b(d30 d30Var, View view) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m3503c(View view) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m3504d(d30 d30Var, View view) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3505e(View view) {
        aj90.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m3506f(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f < 0.1d) {
            this.f1973e.setVisibility(4);
        } else {
            float f2 = f + (1.4f * f);
            float f3 = f2 <= 1.0f ? f2 : 1.0f;
            this.f1973e.setVisibility(0);
            f = f3;
        }
        this.f1973e.setAlpha(f);
    }

    /* JADX INFO: renamed from: g */
    public void m3507g(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f < 0.1d) {
            this.f1971c.setVisibility(4);
            this.f1969a.setOnClickListener(null);
            this.f1969a.setClickable(false);
        } else {
            float f2 = f + (1.4f * f);
            float f3 = f2 <= 1.0f ? f2 : 1.0f;
            this.f1971c.setVisibility(0);
            this.f1969a.setOnClickListener(new View.OnClickListener() { // from class: l.zi90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileCustomBar.m3503c(view);
                }
            });
            f = f3;
        }
        this.f1971c.setAlpha(f);
        this.f1970b.setAlpha(f);
        this.f1982n.setAlpha(f);
    }

    /* JADX INFO: renamed from: h */
    public void m3508h(User user, String str, boolean z) {
        xdl0.M(this.f1973e, z);
        xdl0.M(this.f1978j, !z);
        if (!z) {
            m3509i(this.f1978j, user, str);
            return;
        }
        m3509i(this.f1974f, user, str);
        m3510j(user);
        m3513m(user);
    }

    /* JADX INFO: renamed from: i */
    public final void m3509i(VText vText, User user, String str) {
        vText.setTypeface(Typeface.DEFAULT_BOLD);
        if (user.isBannedNew() || user.isAccountCancellation()) {
            vText.setText(user.publicId);
        } else {
            vText.setText(user.name);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m3510j(User user) {
        xdl0.M(this.f1976h, false);
        xdl0.M(this.f1977i, false);
        if (user.isMe() && user.isHideIconFromSVipWithMe()) {
            return;
        }
        if (user.isMe() || !user.isHideIconFromSVip()) {
            if (user.isODiamond()) {
                xdl0.M(this.f1976h, true);
                this.f1976h.o0();
                return;
            }
            if (user.isPlatinum()) {
                xdl0.M(this.f1976h, true);
                this.f1976h.l0();
                return;
            }
            xdl0.M(this.f1977i, true);
            CoreModule.P().e().o7(getContext(), user, this.f1977i, true, false);
            ViewGroup.LayoutParams layoutParams = this.f1977i.getLayoutParams();
            layoutParams.width = -2;
            this.f1977i.setLayoutParams(layoutParams);
            this.f1977i.setClickable(false);
            this.f1977i.setEnabled(false);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m3511k(User user, String str, boolean z, boolean z2) {
        m3512l(user, str, z, z2, false);
    }

    /* JADX INFO: renamed from: l */
    public void m3512l(User user, String str, boolean z, boolean z2, boolean z3) {
        if (user == null) {
            return;
        }
        xdl0.d0(this.f1978j, t100.d(20.0f));
        xdl0.f0(this.f1978j, t100.d(2.0f));
        m3508h(user, str, z3);
        if (user.isMe() && !z && z2) {
            xdl0.M(this.f1981m, true);
        } else {
            xdl0.M(this.f1981m, false);
        }
        xdl0.M(this.f1980l, false);
    }

    /* JADX INFO: renamed from: m */
    public final void m3513m(User user) {
        if (jjb0.b()) {
            int i = CertificationUtil.i(user, true);
            VImage vImage = this.f1975g;
            if (i == -1) {
                xdl0.M(vImage, false);
            } else {
                xdl0.M(vImage, true);
                this.f1975g.setImageResource(i);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m3514n() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1979k.getLayoutParams();
        marginLayoutParams.rightMargin = t100.j;
        this.f1979k.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: o */
    public void m3515o() {
        xdl0.M0(this.f1979k, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (this.f1983o == null) {
            View viewInflate = View.inflate(getContext(), f6c0.u9, null);
            this.f1983o = viewInflate;
            viewInflate.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            addView(this.f1983o);
            m3505e(this.f1983o);
        }
        if (upa.M3()) {
            this.f1981m.setImageResource(x2c0.Dl);
            this.f1974f.setTextColor(-16777216);
        }
    }

    public void setBackCallBack(final d30 d30Var) {
        this.f1972d.setOnClickListener(new View.OnClickListener() { // from class: l.wi90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileCustomBar.m3501a(d30Var, view);
            }
        });
    }

    public void setEditCallBack(final d30 d30Var) {
        this.f1981m.setOnClickListener(new View.OnClickListener() { // from class: l.xi90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileCustomBar.m3504d(d30Var, view);
            }
        });
    }

    public void setMoreCallBack(final d30 d30Var) {
        this.f1980l.setOnClickListener(new View.OnClickListener() { // from class: l.yi90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileCustomBar.m3502b(d30Var, view);
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
