package com.p051p1.mobile.putong.core.p058ui.profile.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.vip.VipAct;
import com.p051p1.mobile.putong.core.util.CertificationUtil;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import p151v.VImage;
import p151v.VLinear_FillerMeasure;
import p151v.VText;
import p153l.bnl0;
import p153l.f8l;
import p153l.kec0;
import p153l.nrb0;
import p153l.oql0;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class HomeCardTopNameViewBar extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f34973a;

    /* JADX INFO: renamed from: b */
    public VLinear_FillerMeasure f34974b;

    /* JADX INFO: renamed from: c */
    public VText f34975c;

    /* JADX INFO: renamed from: d */
    public VImage f34976d;

    /* JADX INFO: renamed from: e */
    public ODiamondTagLabel f34977e;

    /* JADX INFO: renamed from: f */
    public VImage f34978f;

    /* JADX INFO: renamed from: g */
    public View f34979g;

    public HomeCardTopNameViewBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View viewInflate = View.inflate(getContext(), kec0.f125689X0, null);
        this.f34979g = viewInflate;
        viewInflate.setLayoutParams(new FrameLayout.LayoutParams(-1, qa00.m175859d(44.0f)));
        addView(this.f34979g);
        m54102c(this.f34979g);
    }

    /* JADX INFO: renamed from: c */
    public final void m54102c(View view) {
        f8l.m124552a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m54103d(View view) {
        bnl0.m105506D(getContext()).startActivity(VipAct.m57420c2(getContext(), oql0.m168817a("diamond")));
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m54104e(View view) {
        bnl0.m105506D(getContext()).startActivity(VipAct.m57420c2(getContext(), oql0.m168817a("platinum")));
    }

    /* JADX INFO: renamed from: f */
    public final void m54105f(VText vText, User user) {
        vText.setTypeface(Typeface.DEFAULT_BOLD);
        vText.setText(user.name);
    }

    /* JADX INFO: renamed from: g */
    public void m54106g(User user) {
        bnl0.m105524M(this.f34977e, false);
        bnl0.m105524M(this.f34978f, false);
        if (user.isMe() && user.isHideIconFromSVipWithMe()) {
            return;
        }
        if (user.isMe() || !user.isHideIconFromSVip()) {
            if (user.isODiamond()) {
                bnl0.m105524M(this.f34977e, true);
                this.f34977e.m80350o0();
                bnl0.m105509E0(this.f34977e, new View.OnClickListener() { // from class: l.d8l
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f85651a.m54103d(view);
                    }
                });
            } else if (user.isPlatinum()) {
                bnl0.m105524M(this.f34977e, true);
                this.f34977e.m80347l0();
                bnl0.m105509E0(this.f34977e, new View.OnClickListener() { // from class: l.e8l
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f92548a.m54104e(view);
                    }
                });
            } else {
                bnl0.m105524M(this.f34978f, true);
                CoreModule.m30933P().m143408e().mo35989o7(getContext(), user, this.f34978f, true, false);
                ViewGroup.LayoutParams layoutParams = this.f34978f.getLayoutParams();
                layoutParams.width = -2;
                this.f34978f.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m54107h(User user) {
        if (user == null) {
            return;
        }
        m54105f(this.f34975c, user);
        m54106g(user);
        m54108i(user);
    }

    /* JADX INFO: renamed from: i */
    public final void m54108i(User user) {
        if (nrb0.m164466b()) {
            int iM59333i = CertificationUtil.m59333i(user, true);
            VImage vImage = this.f34976d;
            if (iM59333i == -1) {
                bnl0.m105524M(vImage, false);
            } else {
                bnl0.m105524M(vImage, true);
                this.f34976d.setImageResource(iM59333i);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public HomeCardTopNameViewBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HomeCardTopNameViewBar(Context context) {
        this(context, null);
    }
}
