package com.p051p1.mobile.putong.core.p058ui.profile.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileCustomBar;
import com.p051p1.mobile.putong.core.util.CertificationUtil;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import p151v.VImage;
import p151v.VLinear_FillerMeasure;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.er90;
import p153l.gra;
import p153l.kec0;
import p153l.nrb0;
import p153l.qa00;
import p153l.x20;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileCustomBar extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f34995a;

    /* JADX INFO: renamed from: b */
    public View f34996b;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f34997c;

    /* JADX INFO: renamed from: d */
    public ImageView f34998d;

    /* JADX INFO: renamed from: e */
    public VLinear_FillerMeasure f34999e;

    /* JADX INFO: renamed from: f */
    public VText f35000f;

    /* JADX INFO: renamed from: g */
    public VImage f35001g;

    /* JADX INFO: renamed from: h */
    public ODiamondTagLabel f35002h;

    /* JADX INFO: renamed from: i */
    public VImage f35003i;

    /* JADX INFO: renamed from: j */
    public VText f35004j;

    /* JADX INFO: renamed from: k */
    public VText f35005k;

    /* JADX INFO: renamed from: l */
    public VImage f35006l;

    /* JADX INFO: renamed from: m */
    public VImage f35007m;

    /* JADX INFO: renamed from: n */
    public View f35008n;

    /* JADX INFO: renamed from: o */
    public View f35009o;

    public ProfileCustomBar(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m54126a(x20 x20Var, View view) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m54127b(x20 x20Var, View view) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m54128c(View view) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m54129d(x20 x20Var, View view) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m54130e(View view) {
        er90.m122137a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m54131f(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f < 0.1d) {
            this.f34999e.setVisibility(4);
        } else {
            float f2 = f + (1.4f * f);
            float f3 = f2 <= 1.0f ? f2 : 1.0f;
            this.f34999e.setVisibility(0);
            f = f3;
        }
        this.f34999e.setAlpha(f);
    }

    /* JADX INFO: renamed from: g */
    public void m54132g(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f < 0.1d) {
            this.f34997c.setVisibility(4);
            this.f34995a.setOnClickListener(null);
            this.f34995a.setClickable(false);
        } else {
            float f2 = f + (1.4f * f);
            float f3 = f2 <= 1.0f ? f2 : 1.0f;
            this.f34997c.setVisibility(0);
            this.f34995a.setOnClickListener(new View.OnClickListener() { // from class: l.dr90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileCustomBar.m54128c(view);
                }
            });
            f = f3;
        }
        this.f34997c.setAlpha(f);
        this.f34996b.setAlpha(f);
        this.f35008n.setAlpha(f);
    }

    /* JADX INFO: renamed from: h */
    public void m54133h(User user, String str, boolean z) {
        bnl0.m105524M(this.f34999e, z);
        bnl0.m105524M(this.f35004j, !z);
        if (!z) {
            m54134i(this.f35004j, user, str);
            return;
        }
        m54134i(this.f35000f, user, str);
        m54135j(user);
        m54138m(user);
    }

    /* JADX INFO: renamed from: i */
    public final void m54134i(VText vText, User user, String str) {
        vText.setTypeface(Typeface.DEFAULT_BOLD);
        if (user.isBannedNew() || user.isAccountCancellation()) {
            vText.setText(user.publicId);
        } else {
            vText.setText(user.name);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m54135j(User user) {
        bnl0.m105524M(this.f35002h, false);
        bnl0.m105524M(this.f35003i, false);
        if (user.isMe() && user.isHideIconFromSVipWithMe()) {
            return;
        }
        if (user.isMe() || !user.isHideIconFromSVip()) {
            if (user.isODiamond()) {
                bnl0.m105524M(this.f35002h, true);
                this.f35002h.m80350o0();
                return;
            }
            if (user.isPlatinum()) {
                bnl0.m105524M(this.f35002h, true);
                this.f35002h.m80347l0();
                return;
            }
            bnl0.m105524M(this.f35003i, true);
            CoreModule.m30933P().m143408e().mo35989o7(getContext(), user, this.f35003i, true, false);
            ViewGroup.LayoutParams layoutParams = this.f35003i.getLayoutParams();
            layoutParams.width = -2;
            this.f35003i.setLayoutParams(layoutParams);
            this.f35003i.setClickable(false);
            this.f35003i.setEnabled(false);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m54136k(User user, String str, boolean z, boolean z2) {
        m54137l(user, str, z, z2, false);
    }

    /* JADX INFO: renamed from: l */
    public void m54137l(User user, String str, boolean z, boolean z2, boolean z3) {
        if (user == null) {
            return;
        }
        bnl0.m105550d0(this.f35004j, qa00.m175859d(20.0f));
        bnl0.m105554f0(this.f35004j, qa00.m175859d(2.0f));
        m54133h(user, str, z3);
        if (user.isMe() && !z && z2) {
            bnl0.m105524M(this.f35007m, true);
        } else {
            bnl0.m105524M(this.f35007m, false);
        }
        bnl0.m105524M(this.f35006l, false);
    }

    /* JADX INFO: renamed from: m */
    public final void m54138m(User user) {
        if (nrb0.m164466b()) {
            int iM59333i = CertificationUtil.m59333i(user, true);
            VImage vImage = this.f35001g;
            if (iM59333i == -1) {
                bnl0.m105524M(vImage, false);
            } else {
                bnl0.m105524M(vImage, true);
                this.f35001g.setImageResource(iM59333i);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m54139n() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f35005k.getLayoutParams();
        marginLayoutParams.rightMargin = qa00.f156323j;
        this.f35005k.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: o */
    public void m54140o() {
        bnl0.m105525M0(this.f35005k, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (this.f35009o == null) {
            View viewInflate = View.inflate(getContext(), kec0.f125342B9, null);
            this.f35009o = viewInflate;
            viewInflate.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            addView(this.f35009o);
            m54130e(this.f35009o);
        }
        if (gra.m131601M3()) {
            this.f35007m.setImageResource(dbc0.f87389rm);
            this.f35000f.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
    }

    public void setBackCallBack(final x20 x20Var) {
        this.f34998d.setOnClickListener(new View.OnClickListener() { // from class: l.ar90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileCustomBar.m54126a(x20Var, view);
            }
        });
    }

    public void setEditCallBack(final x20 x20Var) {
        this.f35007m.setOnClickListener(new View.OnClickListener() { // from class: l.br90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileCustomBar.m54129d(x20Var, view);
            }
        });
    }

    public void setMoreCallBack(final x20 x20Var) {
        this.f35006l.setOnClickListener(new View.OnClickListener() { // from class: l.cr90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileCustomBar.m54127b(x20Var, view);
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
