package com.p051p1.mobile.putong.core.p058ui.onlinematch.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import org.spongycastle.crypto.tls.CipherSuite;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.gt0;
import p153l.q8g0;
import p153l.qa00;
import p153l.uqb0;
import p153l.vu50;
import p153l.vxd0;
import p153l.wtd0;
import p153l.z20;

/* JADX INFO: loaded from: classes4.dex */
public class OnlineMatchNewUiCardView extends OnlineMatchBaseCardView {

    /* JADX INFO: renamed from: a */
    public VLinear f33576a;

    /* JADX INFO: renamed from: b */
    public VImage f33577b;

    /* JADX INFO: renamed from: c */
    public VText f33578c;

    /* JADX INFO: renamed from: d */
    public VText f33579d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f33580e;

    /* JADX INFO: renamed from: f */
    public VRelative f33581f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f33582g;

    /* JADX INFO: renamed from: h */
    public VText f33583h;

    /* JADX INFO: renamed from: i */
    public VText f33584i;

    /* JADX INFO: renamed from: j */
    public VText f33585j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f33586k;

    /* JADX INFO: renamed from: l */
    public VText f33587l;

    /* JADX INFO: renamed from: m */
    public String f33588m;

    /* JADX INFO: renamed from: n */
    public final vxd0 f33589n;

    public OnlineMatchNewUiCardView(Context context) {
        super(context);
        this.f33588m = "";
        this.f33589n = new vxd0("onlineMatchCardNewUiBlurRadius", 5);
    }

    /* JADX INFO: renamed from: l */
    private void m51525l(final z20<Boolean, String> z20Var) {
        bnl0.m105509E0(this.f33587l, new View.OnClickListener() { // from class: l.su50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z20Var.call(Boolean.FALSE, "");
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.onlinematch.view.OnlineMatchBaseCardView
    /* JADX INFO: renamed from: f */
    public void mo51489f(QuickChatCardWrapper quickChatCardWrapper, z20<Boolean, String> z20Var) {
        User user = quickChatCardWrapper.getUser();
        if (NullChecker.m82486a(user)) {
            bnl0.m105524M(this.f33583h, CoreModule.f18264c.f20330N0.m32968i3(user, wtd0.m207832d(user)));
            uqb0.f180374G.m127120O(this.f33582g, user.m61308fp().profileSmall().formatted(), 2, this.f33589n.get().intValue());
            this.f33584i.setText(user.name);
            if (user.isIdAndPicBothVerified()) {
                this.f33584i.setCompoundDrawablesWithIntrinsicBounds(0, 0, dbc0.f86259Iq, 0);
            } else {
                boolean zIsPicVerificationVerified = user.isPicVerificationVerified();
                VText vText = this.f33584i;
                if (zIsPicVerificationVerified) {
                    vText.setCompoundDrawablesWithIntrinsicBounds(0, 0, dbc0.f86103Du, 0);
                } else {
                    vText.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
            }
            bnl0.m105566l0(this.f33584i, 0, false, false);
            bnl0.m105524M(this.f33585j, true);
            StringBuilder sb = new StringBuilder();
            Location location = user.location;
            String strM51402C = C8772a.m51402C(location.distance, location.region.city);
            if (!TextUtils.isEmpty(strM51402C)) {
                sb.append(strM51402C);
                sb.append(" · ");
            }
            sb.append(String.format("%1$s · %2$s", C8772a.m51407H(user), q8g0.m175804j0(user.profile.zodiac)));
            this.f33585j.setText(sb.toString());
            this.f33587l.setText(String.format("和%s聊聊", user.isFemale() ? "她" : "他"));
            m51525l(z20Var);
            if (!TextUtils.equals(this.f33588m, user.f56859id)) {
                gt0.m132166l(this.f33581f, gt0.f106354i, 200L, 600L, new AccelerateDecelerateInterpolator(), 1.0f, 0.96f, 1.0f).start();
                this.f33581f.postDelayed(new Runnable() { // from class: l.ru50
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f164901a.m51528n();
                    }
                }, 300L);
            }
            this.f33588m = user.f56859id;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m51526k(View view) {
        vu50.m202776a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m51527m(int i) {
        if (i > qa00.m175859d(500.0f)) {
            return;
        }
        int i2 = (i * 345) / 600;
        ViewGroup.LayoutParams layoutParams = this.f33580e.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i2;
        this.f33580e.setLayoutParams(layoutParams);
        int i3 = (i * 317) / 600;
        ViewGroup.LayoutParams layoutParams2 = this.f33581f.getLayoutParams();
        layoutParams2.width = (i3 * 220) / 317;
        layoutParams2.height = i3;
        this.f33581f.setLayoutParams(layoutParams2);
        bnl0.m105540X(this.f33580e, (i * CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA) / 600);
        bnl0.m105540X(this.f33581f, (i * 178) / 600);
        m51488e();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m51528n() {
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/b6726e7d-58d7-4b1d-97e5-48172706796c10.svga").repeatCount(1).into(this.f33580e);
        this.f33580e.startAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33580e.stopAnimation(false);
        this.f33588m = "";
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51526k(this);
        final int iM105590x0 = (((((bnl0.m105590x0(getContext()) - bnl0.m105516I(getContext())) - bnl0.m105511F0()) - qa00.m175859d(44.0f)) - qa00.m175859d(56.0f)) - qa00.m175859d(24.0f)) - qa00.m175859d(12.0f);
        if (iM105590x0 >= qa00.m175859d(600.0f)) {
            int iM175859d = iM105590x0 - qa00.m175859d(640.0f);
            if (iM175859d > 0) {
                int i = iM175859d / 2;
                bnl0.m105540X(this.f33580e, qa00.m175859d(155.0f) + i);
                bnl0.m105540X(this.f33581f, qa00.m175859d(168.0f) + i);
                bnl0.m105537U(this.f33587l, qa00.m175859d(46.0f));
            }
        } else {
            int iM175859d2 = qa00.m175859d(500.0f);
            VLinear vLinear = this.f33576a;
            if (iM105590x0 >= iM175859d2) {
                bnl0.m105540X(vLinear, qa00.m175859d(5.0f));
                bnl0.m105540X(this.f33577b, qa00.m175859d(10.0f));
                bnl0.m105540X(this.f33580e, qa00.m175859d(130.0f));
                bnl0.m105540X(this.f33581f, qa00.m175859d(143.0f));
            } else {
                bnl0.m105540X(vLinear, 0);
                bnl0.m105540X(this.f33577b, qa00.m175859d(2.0f));
            }
        }
        this.f33578c.getPaint().setFakeBoldText(true);
        this.f33587l.getPaint().setFakeBoldText(true);
        this.f33584i.setTypeface(Typeface.DEFAULT_BOLD);
        post(new Runnable() { // from class: l.qu50
            @Override // java.lang.Runnable
            public final void run() {
                this.f159521a.m51527m(iM105590x0);
            }
        });
    }

    public OnlineMatchNewUiCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33588m = "";
        this.f33589n = new vxd0("onlineMatchCardNewUiBlurRadius", 5);
    }
}
