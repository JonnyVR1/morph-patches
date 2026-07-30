package com.p000p1.mobile.putong.core.p004ui.quickaudio.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.putong.core.ui.onlinematch.view.OnlineMatchBaseCardView;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.User;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import l.bt0;
import l.c4g0;
import l.e30;
import l.eqh0;
import l.f30;
import l.jo0;
import l.kpb0;
import l.mkd0;
import l.t100;
import l.xdl0;
import p006l.qib0;
import p006l.z2c0;
import rx.c;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class QuickAudioCardView extends OnlineMatchBaseCardView {

    /* JADX INFO: renamed from: a */
    public VLinear f5288a;

    /* JADX INFO: renamed from: b */
    public VImage f5289b;

    /* JADX INFO: renamed from: c */
    public VText f5290c;

    /* JADX INFO: renamed from: d */
    public VText f5291d;

    /* JADX INFO: renamed from: e */
    public VImage f5292e;

    /* JADX INFO: renamed from: f */
    public VRelative f5293f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f5294g;

    /* JADX INFO: renamed from: h */
    public VText f5295h;

    /* JADX INFO: renamed from: i */
    public TextView f5296i;

    /* JADX INFO: renamed from: j */
    public VText f5297j;

    /* JADX INFO: renamed from: k */
    public SVGAnimationView f5298k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f5299l;

    /* JADX INFO: renamed from: m */
    public VText f5300m;

    /* JADX INFO: renamed from: n */
    public String f5301n;

    /* JADX INFO: renamed from: o */
    public c4g0 f5302o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.quickaudio.view.QuickAudioCardView$a */
    public class C0253a extends AnimListener {
        public C0253a() {
        }

        public void onFinished() {
            super.onFinished();
            QuickAudioCardView.this.e();
        }
    }

    public QuickAudioCardView(Context context) {
        super(context);
        this.f5301n = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m7957n(int i) {
        if (i > t100.d(500.0f)) {
            return;
        }
        int i2 = (i * 345) / 600;
        ViewGroup.LayoutParams layoutParams = this.f5292e.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i2;
        this.f5292e.setLayoutParams(layoutParams);
        int i3 = (i * 317) / 600;
        ViewGroup.LayoutParams layoutParams2 = this.f5293f.getLayoutParams();
        layoutParams2.width = (i3 * 220) / 317;
        layoutParams2.height = i3;
        this.f5293f.setLayoutParams(layoutParams2);
        xdl0.X(this.f5292e, (i * 155) / 600);
        xdl0.X(this.f5293f, (i * 178) / 600);
        e();
    }

    /* JADX INFO: renamed from: q */
    private void m7958q() {
        this.f5298k.stopAnimation(false);
        this.f5301n = "";
        mkd0.z(this.f5302o);
    }

    /* JADX INFO: renamed from: f */
    public void m7959f(final QuickChatCardWrapper quickChatCardWrapper, final f30<Boolean, String> f30Var) {
        User user = quickChatCardWrapper.getUser();
        if (NullChecker.a(user) && !TextUtils.equals(this.f5301n, ((DbObject) user).id)) {
            xdl0.M(this.f5295h, true);
            this.f5295h.setTypeface(eqh0.c(3), 1);
            qib0.f19782G.m12749O(this.f5294g, user.fp().profileSmall().formatted(), 2, 5);
            String str = user.isFemale() ? "她" : "他";
            this.f5291d.setText(String.format("%s和你还蛮合适的，去和%s聊聊吧！", str, str));
            this.f5296i.setText(user.name);
            if (user.isIdAndPicBothVerified()) {
                this.f5296i.setCompoundDrawablesWithIntrinsicBounds(0, 0, z2c0.f28568D, 0);
            } else {
                boolean zIsPicVerificationVerified = user.isPicVerificationVerified();
                TextView textView = this.f5296i;
                if (zIsPicVerificationVerified) {
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, z2c0.f28594z, 0);
                } else {
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
            }
            xdl0.l0(this.f5296i, 0, false, false);
            xdl0.M(this.f5297j, true);
            StringBuilder sb = new StringBuilder();
            CoreBusinessService coreBusinessServiceM11706a = CoreModule.m1854P().m11706a();
            Location location = user.location;
            String strM5322Ob = coreBusinessServiceM11706a.m5322Ob(location.distance, location.region.city);
            if (!TextUtils.isEmpty(strM5322Ob)) {
                sb.append(strM5322Ob);
                sb.append(" · ");
            }
            sb.append(CoreModule.m1854P().m11706a().m5507qj(user));
            this.f5297j.setText(sb.toString());
            this.f5300m.setText("立即接听 5s");
            this.f5302o = c.interval(1L, TimeUnit.SECONDS).take(6).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.hpb0
                public final void call(Object obj) {
                    this.f14006a.m7961o(quickChatCardWrapper, (Long) obj);
                }
            }));
            xdl0.E0(this.f5300m, new View.OnClickListener() { // from class: l.ipb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f30Var.call(Boolean.FALSE, "");
                }
            });
            if (!TextUtils.equals(this.f5301n, ((DbObject) user).id)) {
                bt0.l(this.f5293f, bt0.i, 200L, 600L, new AccelerateDecelerateInterpolator(), new float[]{1.0f, 0.96f, 1.0f}).start();
                final String strM5532tc = CoreModule.m1854P().m11706a().m5532tc();
                this.f5293f.postDelayed(new Runnable() { // from class: l.jpb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f15317a.m7962p(strM5532tc);
                    }
                }, 300L);
            }
            this.f5301n = ((DbObject) user).id;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m7960l(View view) {
        kpb0.a(this, view);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m7961o(QuickChatCardWrapper quickChatCardWrapper, Long l2) {
        this.f5300m.setText(String.format("立即接听 %ss", Long.valueOf(5 - l2.longValue())));
        if (l2.longValue() >= 5) {
            CoreModule.f1534c.f3662p1.m1983u3();
            quickChatCardWrapper.consume();
            m7958q();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        m7958q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7960l(this);
        final int iX0 = (((((xdl0.x0(getContext()) - xdl0.I(getContext())) - xdl0.F0()) - t100.d(44.0f)) - t100.d(56.0f)) - t100.d(24.0f)) - t100.d(12.0f);
        if (iX0 >= t100.d(600.0f)) {
            int iD = iX0 - t100.d(640.0f);
            if (iD > 0) {
                int i = iD / 2;
                xdl0.X(this.f5292e, t100.d(155.0f) + i);
                xdl0.X(this.f5293f, t100.d(168.0f) + i);
                xdl0.U(this.f5300m, t100.d(46.0f));
            }
        } else {
            int iD2 = t100.d(500.0f);
            VLinear vLinear = this.f5288a;
            if (iX0 >= iD2) {
                xdl0.X(vLinear, t100.d(5.0f));
                xdl0.X(this.f5289b, t100.d(10.0f));
                xdl0.X(this.f5292e, t100.d(130.0f));
                xdl0.X(this.f5293f, t100.d(143.0f));
            } else {
                xdl0.X(vLinear, 0);
                xdl0.X(this.f5289b, t100.d(2.0f));
            }
        }
        this.f5290c.getPaint().setFakeBoldText(true);
        this.f5300m.getPaint().setFakeBoldText(true);
        post(new Runnable() { // from class: l.gpb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13426a.m7957n(iX0);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m7962p(String str) {
        SVGALoader.with(getContext()).from(str).repeatCount(-1).animListener(new C0253a()).into(this.f5298k);
        this.f5298k.startAnimation();
    }

    public QuickAudioCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5301n = "";
    }
}
