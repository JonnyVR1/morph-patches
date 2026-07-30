package com.p000p1.mobile.putong.core.p001ui.profile.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.vip.VipAct;
import com.p1.mobile.putong.core.util.CertificationUtil;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.newui.view.ODiamondTagLabel;
import l.f6c0;
import l.jjb0;
import l.khl0;
import l.p5l;
import l.t100;
import l.xdl0;
import v.VImage;
import v.VLinear_FillerMeasure;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class HomeCardTopNameViewBar extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f1947a;

    /* JADX INFO: renamed from: b */
    public VLinear_FillerMeasure f1948b;

    /* JADX INFO: renamed from: c */
    public VText f1949c;

    /* JADX INFO: renamed from: d */
    public VImage f1950d;

    /* JADX INFO: renamed from: e */
    public ODiamondTagLabel f1951e;

    /* JADX INFO: renamed from: f */
    public VImage f1952f;

    /* JADX INFO: renamed from: g */
    public View f1953g;

    public HomeCardTopNameViewBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View viewInflate = View.inflate(getContext(), f6c0.X0, null);
        this.f1953g = viewInflate;
        viewInflate.setLayoutParams(new FrameLayout.LayoutParams(-1, t100.d(44.0f)));
        addView(this.f1953g);
        m3474c(this.f1953g);
    }

    /* JADX INFO: renamed from: c */
    public final void m3474c(View view) {
        p5l.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m3475d(View view) {
        xdl0.D(getContext()).startActivity(VipAct.b2(getContext(), khl0.a("diamond")));
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m3476e(View view) {
        xdl0.D(getContext()).startActivity(VipAct.b2(getContext(), khl0.a("platinum")));
    }

    /* JADX INFO: renamed from: f */
    public final void m3477f(VText vText, User user) {
        vText.setTypeface(Typeface.DEFAULT_BOLD);
        vText.setText(user.name);
    }

    /* JADX INFO: renamed from: g */
    public void m3478g(User user) {
        xdl0.M(this.f1951e, false);
        xdl0.M(this.f1952f, false);
        if (user.isMe() && user.isHideIconFromSVipWithMe()) {
            return;
        }
        if (user.isMe() || !user.isHideIconFromSVip()) {
            if (user.isODiamond()) {
                xdl0.M(this.f1951e, true);
                this.f1951e.o0();
                xdl0.E0(this.f1951e, new View.OnClickListener() { // from class: l.n5l
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f15830a.m3475d(view);
                    }
                });
            } else if (user.isPlatinum()) {
                xdl0.M(this.f1951e, true);
                this.f1951e.l0();
                xdl0.E0(this.f1951e, new View.OnClickListener() { // from class: l.o5l
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f16371a.m3476e(view);
                    }
                });
            } else {
                xdl0.M(this.f1952f, true);
                CoreModule.P().e().o7(getContext(), user, this.f1952f, true, false);
                ViewGroup.LayoutParams layoutParams = this.f1952f.getLayoutParams();
                layoutParams.width = -2;
                this.f1952f.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m3479h(User user) {
        if (user == null) {
            return;
        }
        m3477f(this.f1949c, user);
        m3478g(user);
        m3480i(user);
    }

    /* JADX INFO: renamed from: i */
    public final void m3480i(User user) {
        if (jjb0.b()) {
            int i = CertificationUtil.i(user, true);
            VImage vImage = this.f1950d;
            if (i == -1) {
                xdl0.M(vImage, false);
            } else {
                xdl0.M(vImage, true);
                this.f1950d.setImageResource(i);
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
