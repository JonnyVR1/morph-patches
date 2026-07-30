package com.p046p1.mobile.putong.core.p053ui.onlinematch.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import org.spongycastle.crypto.tls.CipherSuite;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p149l.bt0;
import p149l.f30;
import p149l.i0g0;
import p149l.pm50;
import p149l.qib0;
import p149l.t100;
import p149l.tpd0;
import p149l.uld0;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class OnlineMatchNewUiCardView extends OnlineMatchBaseCardView {

    /* JADX INFO: renamed from: a */
    public VLinear f32728a;

    /* JADX INFO: renamed from: b */
    public VImage f32729b;

    /* JADX INFO: renamed from: c */
    public VText f32730c;

    /* JADX INFO: renamed from: d */
    public VText f32731d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f32732e;

    /* JADX INFO: renamed from: f */
    public VRelative f32733f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f32734g;

    /* JADX INFO: renamed from: h */
    public VText f32735h;

    /* JADX INFO: renamed from: i */
    public VText f32736i;

    /* JADX INFO: renamed from: j */
    public VText f32737j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f32738k;

    /* JADX INFO: renamed from: l */
    public VText f32739l;

    /* JADX INFO: renamed from: m */
    public String f32740m;

    /* JADX INFO: renamed from: n */
    public final tpd0 f32741n;

    public OnlineMatchNewUiCardView(Context context) {
        super(context);
        this.f32740m = "";
        this.f32741n = new tpd0("onlineMatchCardNewUiBlurRadius", 5);
    }

    /* JADX INFO: renamed from: l */
    private void m50342l(final f30<Boolean, String> f30Var) {
        xdl0.m208329E0(this.f32739l, new View.OnClickListener() { // from class: l.mm50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f30Var.call(Boolean.FALSE, "");
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.onlinematch.view.OnlineMatchBaseCardView
    /* JADX INFO: renamed from: f */
    public void mo50306f(QuickChatCardWrapper quickChatCardWrapper, f30<Boolean, String> f30Var) {
        User user = quickChatCardWrapper.getUser();
        if (NullChecker.m81303a(user)) {
            xdl0.m208344M(this.f32735h, CoreModule.f17545c.f19588N0.m31965i3(user, uld0.m194219d(user)));
            qib0.f154691G.m102336O(this.f32734g, user.m60124fp().profileSmall().formatted(), 2, this.f32741n.get().intValue());
            this.f32736i.setText(user.name);
            if (user.isIdAndPicBothVerified()) {
                this.f32736i.setCompoundDrawablesWithIntrinsicBounds(0, 0, x2c0.f189805Up, 0);
            } else {
                boolean zIsPicVerificationVerified = user.isPicVerificationVerified();
                VText vText = this.f32736i;
                if (zIsPicVerificationVerified) {
                    vText.setCompoundDrawablesWithIntrinsicBounds(0, 0, x2c0.f189654Pt, 0);
                } else {
                    vText.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
            }
            xdl0.m208386l0(this.f32736i, 0, false, false);
            xdl0.m208344M(this.f32737j, true);
            StringBuilder sb = new StringBuilder();
            Location location = user.location;
            String strM50219C = C8609a.m50219C(location.distance, location.region.city);
            if (!TextUtils.isEmpty(strM50219C)) {
                sb.append(strM50219C);
                sb.append(" · ");
            }
            sb.append(String.format("%1$s · %2$s", C8609a.m50224H(user), i0g0.m133869j0(user.profile.zodiac)));
            this.f32737j.setText(sb.toString());
            this.f32739l.setText(String.format("和%s聊聊", user.isFemale() ? "她" : "他"));
            m50342l(f30Var);
            if (!TextUtils.equals(this.f32740m, user.f56011id)) {
                bt0.m103739l(this.f32733f, bt0.f77162i, 200L, 600L, new AccelerateDecelerateInterpolator(), 1.0f, 0.96f, 1.0f).start();
                this.f32733f.postDelayed(new Runnable() { // from class: l.lm50
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f128772a.m50345n();
                    }
                }, 300L);
            }
            this.f32740m = user.f56011id;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m50343k(View view) {
        pm50.m170297a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m50344m(int i) {
        if (i > t100.m186890d(500.0f)) {
            return;
        }
        int i2 = (i * 345) / 600;
        ViewGroup.LayoutParams layoutParams = this.f32732e.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i2;
        this.f32732e.setLayoutParams(layoutParams);
        int i3 = (i * 317) / 600;
        ViewGroup.LayoutParams layoutParams2 = this.f32733f.getLayoutParams();
        layoutParams2.width = (i3 * 220) / 317;
        layoutParams2.height = i3;
        this.f32733f.setLayoutParams(layoutParams2);
        xdl0.m208360X(this.f32732e, (i * CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA) / 600);
        xdl0.m208360X(this.f32733f, (i * 178) / 600);
        m50305e();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m50345n() {
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/b6726e7d-58d7-4b1d-97e5-48172706796c10.svga").repeatCount(1).into(this.f32732e);
        this.f32732e.startAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32732e.stopAnimation(false);
        this.f32740m = "";
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50343k(this);
        final int iM208410x0 = (((((xdl0.m208410x0(getContext()) - xdl0.m208336I(getContext())) - xdl0.m208331F0()) - t100.m186890d(44.0f)) - t100.m186890d(56.0f)) - t100.m186890d(24.0f)) - t100.m186890d(12.0f);
        if (iM208410x0 >= t100.m186890d(600.0f)) {
            int iM186890d = iM208410x0 - t100.m186890d(640.0f);
            if (iM186890d > 0) {
                int i = iM186890d / 2;
                xdl0.m208360X(this.f32732e, t100.m186890d(155.0f) + i);
                xdl0.m208360X(this.f32733f, t100.m186890d(168.0f) + i);
                xdl0.m208357U(this.f32739l, t100.m186890d(46.0f));
            }
        } else {
            int iM186890d2 = t100.m186890d(500.0f);
            VLinear vLinear = this.f32728a;
            if (iM208410x0 >= iM186890d2) {
                xdl0.m208360X(vLinear, t100.m186890d(5.0f));
                xdl0.m208360X(this.f32729b, t100.m186890d(10.0f));
                xdl0.m208360X(this.f32732e, t100.m186890d(130.0f));
                xdl0.m208360X(this.f32733f, t100.m186890d(143.0f));
            } else {
                xdl0.m208360X(vLinear, 0);
                xdl0.m208360X(this.f32729b, t100.m186890d(2.0f));
            }
        }
        this.f32730c.getPaint().setFakeBoldText(true);
        this.f32739l.getPaint().setFakeBoldText(true);
        this.f32736i.setTypeface(Typeface.DEFAULT_BOLD);
        post(new Runnable() { // from class: l.km50
            @Override // java.lang.Runnable
            public final void run() {
                this.f123736a.m50344m(iM208410x0);
            }
        });
    }

    public OnlineMatchNewUiCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32740m = "";
        this.f32741n = new tpd0("onlineMatchCardNewUiBlurRadius", 5);
    }
}
