package com.p000p1.mobile.putong.core.p001ui.onlinematch.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.p001ui.onlinematch.C0034a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.f30;
import l.i0g0;
import l.pm50;
import l.qib0;
import l.t100;
import l.tpd0;
import l.uld0;
import l.x2c0;
import l.xdl0;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class OnlineMatchNewUiCardView extends OnlineMatchBaseCardView {

    /* JADX INFO: renamed from: a */
    public VLinear f550a;

    /* JADX INFO: renamed from: b */
    public VImage f551b;

    /* JADX INFO: renamed from: c */
    public VText f552c;

    /* JADX INFO: renamed from: d */
    public VText f553d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f554e;

    /* JADX INFO: renamed from: f */
    public VRelative f555f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f556g;

    /* JADX INFO: renamed from: h */
    public VText f557h;

    /* JADX INFO: renamed from: i */
    public VText f558i;

    /* JADX INFO: renamed from: j */
    public VText f559j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f560k;

    /* JADX INFO: renamed from: l */
    public VText f561l;

    /* JADX INFO: renamed from: m */
    public String f562m;

    /* JADX INFO: renamed from: n */
    public final tpd0 f563n;

    public OnlineMatchNewUiCardView(Context context) {
        super(context);
        this.f562m = "";
        this.f563n = new tpd0("onlineMatchCardNewUiBlurRadius", 5);
    }

    /* JADX INFO: renamed from: l */
    private void m773l(final f30<Boolean, String> f30Var) {
        xdl0.E0(this.f561l, new View.OnClickListener() { // from class: l.mm50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f30Var.call(Boolean.FALSE, "");
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.onlinematch.view.OnlineMatchBaseCardView
    /* JADX INFO: renamed from: f */
    public void mo737f(QuickChatCardWrapper quickChatCardWrapper, f30<Boolean, String> f30Var) {
        User user = quickChatCardWrapper.getUser();
        if (NullChecker.a(user)) {
            xdl0.M(this.f557h, CoreModule.c.N0.i3(user, uld0.d(user)));
            qib0.G.O(this.f556g, user.fp().profileSmall().formatted(), 2, ((Integer) this.f563n.get()).intValue());
            this.f558i.setText(user.name);
            if (user.isIdAndPicBothVerified()) {
                this.f558i.setCompoundDrawablesWithIntrinsicBounds(0, 0, x2c0.Up, 0);
            } else {
                boolean zIsPicVerificationVerified = user.isPicVerificationVerified();
                VText vText = this.f558i;
                if (zIsPicVerificationVerified) {
                    vText.setCompoundDrawablesWithIntrinsicBounds(0, 0, x2c0.Pt, 0);
                } else {
                    vText.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
            }
            xdl0.l0(this.f558i, 0, false, false);
            xdl0.M(this.f559j, true);
            StringBuilder sb = new StringBuilder();
            Location location = user.location;
            String strM650C = C0034a.m650C(location.distance, location.region.city);
            if (!TextUtils.isEmpty(strM650C)) {
                sb.append(strM650C);
                sb.append(" · ");
            }
            sb.append(String.format("%1$s · %2$s", C0034a.m655H(user), i0g0.j0(user.profile.zodiac)));
            this.f559j.setText(sb.toString());
            this.f561l.setText(String.format("和%s聊聊", user.isFemale() ? "她" : "他"));
            m773l(f30Var);
            if (!TextUtils.equals(this.f562m, ((DbObject) user).id)) {
                bt0.l(this.f555f, bt0.i, 200L, 600L, new AccelerateDecelerateInterpolator(), new float[]{1.0f, 0.96f, 1.0f}).start();
                this.f555f.postDelayed(new Runnable() { // from class: l.lm50
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f14952a.m776n();
                    }
                }, 300L);
            }
            this.f562m = ((DbObject) user).id;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m774k(View view) {
        pm50.a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m775m(int i) {
        if (i > t100.d(500.0f)) {
            return;
        }
        int i2 = (i * 345) / 600;
        ViewGroup.LayoutParams layoutParams = this.f554e.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i2;
        this.f554e.setLayoutParams(layoutParams);
        int i3 = (i * 317) / 600;
        ViewGroup.LayoutParams layoutParams2 = this.f555f.getLayoutParams();
        layoutParams2.width = (i3 * 220) / 317;
        layoutParams2.height = i3;
        this.f555f.setLayoutParams(layoutParams2);
        xdl0.X(this.f554e, (i * 155) / 600);
        xdl0.X(this.f555f, (i * 178) / 600);
        m736e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m776n() {
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/b6726e7d-58d7-4b1d-97e5-48172706796c10.svga").repeatCount(1).into(this.f554e);
        this.f554e.startAnimation();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        this.f554e.stopAnimation(false);
        this.f562m = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m774k(this);
        final int iX0 = (((((xdl0.x0(getContext()) - xdl0.I(getContext())) - xdl0.F0()) - t100.d(44.0f)) - t100.d(56.0f)) - t100.d(24.0f)) - t100.d(12.0f);
        if (iX0 >= t100.d(600.0f)) {
            int iD = iX0 - t100.d(640.0f);
            if (iD > 0) {
                int i = iD / 2;
                xdl0.X(this.f554e, t100.d(155.0f) + i);
                xdl0.X(this.f555f, t100.d(168.0f) + i);
                xdl0.U(this.f561l, t100.d(46.0f));
            }
        } else {
            int iD2 = t100.d(500.0f);
            VLinear vLinear = this.f550a;
            if (iX0 >= iD2) {
                xdl0.X(vLinear, t100.d(5.0f));
                xdl0.X(this.f551b, t100.d(10.0f));
                xdl0.X(this.f554e, t100.d(130.0f));
                xdl0.X(this.f555f, t100.d(143.0f));
            } else {
                xdl0.X(vLinear, 0);
                xdl0.X(this.f551b, t100.d(2.0f));
            }
        }
        this.f552c.getPaint().setFakeBoldText(true);
        this.f561l.getPaint().setFakeBoldText(true);
        this.f558i.setTypeface(Typeface.DEFAULT_BOLD);
        post(new Runnable() { // from class: l.km50
            @Override // java.lang.Runnable
            public final void run() {
                this.f14379a.m775m(iX0);
            }
        });
    }

    public OnlineMatchNewUiCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f562m = "";
        this.f563n = new tpd0("onlineMatchCardNewUiBlurRadius", 5);
    }
}
