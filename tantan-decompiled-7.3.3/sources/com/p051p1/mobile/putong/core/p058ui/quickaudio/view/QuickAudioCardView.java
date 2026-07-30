package com.p051p1.mobile.putong.core.p058ui.quickaudio.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p051p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.view.OnlineMatchBaseCardView;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.User;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import org.spongycastle.crypto.tls.CipherSuite;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.fbc0;
import p153l.fo0;
import p153l.gt0;
import p153l.kcg0;
import p153l.lyh0;
import p153l.oxb0;
import p153l.psd0;
import p153l.qa00;
import p153l.uqb0;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes12.dex */
public class QuickAudioCardView extends OnlineMatchBaseCardView {

    /* JADX INFO: renamed from: a */
    public VLinear f36355a;

    /* JADX INFO: renamed from: b */
    public VImage f36356b;

    /* JADX INFO: renamed from: c */
    public VText f36357c;

    /* JADX INFO: renamed from: d */
    public VText f36358d;

    /* JADX INFO: renamed from: e */
    public VImage f36359e;

    /* JADX INFO: renamed from: f */
    public VRelative f36360f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f36361g;

    /* JADX INFO: renamed from: h */
    public VText f36362h;

    /* JADX INFO: renamed from: i */
    public TextView f36363i;

    /* JADX INFO: renamed from: j */
    public VText f36364j;

    /* JADX INFO: renamed from: k */
    public SVGAnimationView f36365k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f36366l;

    /* JADX INFO: renamed from: m */
    public VText f36367m;

    /* JADX INFO: renamed from: n */
    public String f36368n;

    /* JADX INFO: renamed from: o */
    public kcg0 f36369o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.quickaudio.view.QuickAudioCardView$a */
    public class C8980a extends AnimListener {
        public C8980a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            QuickAudioCardView.this.m51488e();
        }
    }

    public QuickAudioCardView(Context context) {
        super(context);
        this.f36368n = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m55791n(int i) {
        if (i > qa00.m175859d(500.0f)) {
            return;
        }
        int i2 = (i * 345) / 600;
        ViewGroup.LayoutParams layoutParams = this.f36359e.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i2;
        this.f36359e.setLayoutParams(layoutParams);
        int i3 = (i * 317) / 600;
        ViewGroup.LayoutParams layoutParams2 = this.f36360f.getLayoutParams();
        layoutParams2.width = (i3 * 220) / 317;
        layoutParams2.height = i3;
        this.f36360f.setLayoutParams(layoutParams2);
        bnl0.m105540X(this.f36359e, (i * CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA) / 600);
        bnl0.m105540X(this.f36360f, (i * 178) / 600);
        m51488e();
    }

    /* JADX INFO: renamed from: q */
    private void m55792q() {
        this.f36365k.stopAnimation(false);
        this.f36368n = "";
        psd0.m173633z(this.f36369o);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.onlinematch.view.OnlineMatchBaseCardView
    /* JADX INFO: renamed from: f */
    public void mo51489f(final QuickChatCardWrapper quickChatCardWrapper, final z20<Boolean, String> z20Var) {
        User user = quickChatCardWrapper.getUser();
        if (NullChecker.m82486a(user) && !TextUtils.equals(this.f36368n, user.f56859id)) {
            bnl0.m105524M(this.f36362h, true);
            this.f36362h.setTypeface(lyh0.m156283c(3), 1);
            uqb0.f180374G.m127120O(this.f36361g, user.m61308fp().profileSmall().formatted(), 2, 5);
            String str = user.isFemale() ? "她" : "他";
            this.f36358d.setText(String.format("%s和你还蛮合适的，去和%s聊聊吧！", str, str));
            this.f36363i.setText(user.name);
            if (user.isIdAndPicBothVerified()) {
                this.f36363i.setCompoundDrawablesWithIntrinsicBounds(0, 0, fbc0.f98061D, 0);
            } else {
                boolean zIsPicVerificationVerified = user.isPicVerificationVerified();
                TextView textView = this.f36363i;
                if (zIsPicVerificationVerified) {
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, fbc0.f98087z, 0);
                } else {
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
            }
            bnl0.m105566l0(this.f36363i, 0, false, false);
            bnl0.m105524M(this.f36364j, true);
            StringBuilder sb = new StringBuilder();
            CoreBusinessService coreBusinessServiceM143405a = CoreModule.m30933P().m143405a();
            Location location = user.location;
            String strMo34388Ob = coreBusinessServiceM143405a.mo34388Ob(location.distance, location.region.city);
            if (!TextUtils.isEmpty(strMo34388Ob)) {
                sb.append(strMo34388Ob);
                sb.append(" · ");
            }
            sb.append(CoreModule.m30933P().m143405a().mo34573qj(user));
            this.f36364j.setText(sb.toString());
            this.f36367m.setText("立即接听 5s");
            this.f36369o = C22421c.interval(1L, TimeUnit.SECONDS).take(6).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.lxb0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f133916a.m55794o(quickChatCardWrapper, (Long) obj);
                }
            }));
            bnl0.m105509E0(this.f36367m, new View.OnClickListener() { // from class: l.mxb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    z20Var.call(Boolean.FALSE, "");
                }
            });
            if (!TextUtils.equals(this.f36368n, user.f56859id)) {
                gt0.m132166l(this.f36360f, gt0.f106354i, 200L, 600L, new AccelerateDecelerateInterpolator(), 1.0f, 0.96f, 1.0f).start();
                final String strMo34598tc = CoreModule.m30933P().m143405a().mo34598tc();
                this.f36360f.postDelayed(new Runnable() { // from class: l.nxb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f144106a.m55795p(strMo34598tc);
                    }
                }, 300L);
            }
            this.f36368n = user.f56859id;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m55793l(View view) {
        oxb0.m169684a(this, view);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m55794o(QuickChatCardWrapper quickChatCardWrapper, Long l2) {
        this.f36367m.setText(String.format("立即接听 %ss", Long.valueOf(5 - l2.longValue())));
        if (l2.longValue() >= 5) {
            CoreModule.f18264c.f20415p1.m31053u3();
            quickChatCardWrapper.consume();
            m55792q();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m55792q();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55793l(this);
        final int iM105590x0 = (((((bnl0.m105590x0(getContext()) - bnl0.m105516I(getContext())) - bnl0.m105511F0()) - qa00.m175859d(44.0f)) - qa00.m175859d(56.0f)) - qa00.m175859d(24.0f)) - qa00.m175859d(12.0f);
        if (iM105590x0 >= qa00.m175859d(600.0f)) {
            int iM175859d = iM105590x0 - qa00.m175859d(640.0f);
            if (iM175859d > 0) {
                int i = iM175859d / 2;
                bnl0.m105540X(this.f36359e, qa00.m175859d(155.0f) + i);
                bnl0.m105540X(this.f36360f, qa00.m175859d(168.0f) + i);
                bnl0.m105537U(this.f36367m, qa00.m175859d(46.0f));
            }
        } else {
            int iM175859d2 = qa00.m175859d(500.0f);
            VLinear vLinear = this.f36355a;
            if (iM105590x0 >= iM175859d2) {
                bnl0.m105540X(vLinear, qa00.m175859d(5.0f));
                bnl0.m105540X(this.f36356b, qa00.m175859d(10.0f));
                bnl0.m105540X(this.f36359e, qa00.m175859d(130.0f));
                bnl0.m105540X(this.f36360f, qa00.m175859d(143.0f));
            } else {
                bnl0.m105540X(vLinear, 0);
                bnl0.m105540X(this.f36356b, qa00.m175859d(2.0f));
            }
        }
        this.f36357c.getPaint().setFakeBoldText(true);
        this.f36367m.getPaint().setFakeBoldText(true);
        post(new Runnable() { // from class: l.kxb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f129183a.m55791n(iM105590x0);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m55795p(String str) {
        SVGALoader.with(getContext()).from(str).repeatCount(-1).animListener(new C8980a()).into(this.f36365k);
        this.f36365k.startAnimation();
    }

    public QuickAudioCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36368n = "";
    }
}
