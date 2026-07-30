package com.p046p1.mobile.putong.core.p053ui.profile.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.vip.VipAct;
import com.p046p1.mobile.putong.core.util.CertificationUtil;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import p147v.VImage;
import p147v.VLinear_FillerMeasure;
import p147v.VText;
import p149l.f6c0;
import p149l.jjb0;
import p149l.khl0;
import p149l.p5l;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class HomeCardTopNameViewBar extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f34125a;

    /* JADX INFO: renamed from: b */
    public VLinear_FillerMeasure f34126b;

    /* JADX INFO: renamed from: c */
    public VText f34127c;

    /* JADX INFO: renamed from: d */
    public VImage f34128d;

    /* JADX INFO: renamed from: e */
    public ODiamondTagLabel f34129e;

    /* JADX INFO: renamed from: f */
    public VImage f34130f;

    /* JADX INFO: renamed from: g */
    public View f34131g;

    public HomeCardTopNameViewBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View viewInflate = View.inflate(getContext(), f6c0.f95635X0, null);
        this.f34131g = viewInflate;
        viewInflate.setLayoutParams(new FrameLayout.LayoutParams(-1, t100.m186890d(44.0f)));
        addView(this.f34131g);
        m52919c(this.f34131g);
    }

    /* JADX INFO: renamed from: c */
    public final void m52919c(View view) {
        p5l.m167490a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m52920d(View view) {
        xdl0.m208326D(getContext()).startActivity(VipAct.m56237b2(getContext(), khl0.m145975a("diamond")));
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m52921e(View view) {
        xdl0.m208326D(getContext()).startActivity(VipAct.m56237b2(getContext(), khl0.m145975a("platinum")));
    }

    /* JADX INFO: renamed from: f */
    public final void m52922f(VText vText, User user) {
        vText.setTypeface(Typeface.DEFAULT_BOLD);
        vText.setText(user.name);
    }

    /* JADX INFO: renamed from: g */
    public void m52923g(User user) {
        xdl0.m208344M(this.f34129e, false);
        xdl0.m208344M(this.f34130f, false);
        if (user.isMe() && user.isHideIconFromSVipWithMe()) {
            return;
        }
        if (user.isMe() || !user.isHideIconFromSVip()) {
            if (user.isODiamond()) {
                xdl0.m208344M(this.f34129e, true);
                this.f34129e.m79167o0();
                xdl0.m208329E0(this.f34129e, new View.OnClickListener() { // from class: l.n5l
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f137218a.m52920d(view);
                    }
                });
            } else if (user.isPlatinum()) {
                xdl0.m208344M(this.f34129e, true);
                this.f34129e.m79164l0();
                xdl0.m208329E0(this.f34129e, new View.OnClickListener() { // from class: l.o5l
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f141916a.m52921e(view);
                    }
                });
            } else {
                xdl0.m208344M(this.f34130f, true);
                CoreModule.m29935P().m94654e().mo34986o7(getContext(), user, this.f34130f, true, false);
                ViewGroup.LayoutParams layoutParams = this.f34130f.getLayoutParams();
                layoutParams.width = -2;
                this.f34130f.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m52924h(User user) {
        if (user == null) {
            return;
        }
        m52922f(this.f34127c, user);
        m52923g(user);
        m52925i(user);
    }

    /* JADX INFO: renamed from: i */
    public final void m52925i(User user) {
        if (jjb0.m141784b()) {
            int iM58150i = CertificationUtil.m58150i(user, true);
            VImage vImage = this.f34128d;
            if (iM58150i == -1) {
                xdl0.m208344M(vImage, false);
            } else {
                xdl0.m208344M(vImage, true);
                this.f34128d.setImageResource(iM58150i);
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
