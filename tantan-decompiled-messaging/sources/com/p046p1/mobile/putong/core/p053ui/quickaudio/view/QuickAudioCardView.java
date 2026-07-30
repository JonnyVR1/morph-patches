package com.p046p1.mobile.putong.core.p053ui.quickaudio.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p046p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.view.OnlineMatchBaseCardView;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.User;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import org.spongycastle.crypto.tls.CipherSuite;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p149l.bt0;
import p149l.c4g0;
import p149l.e30;
import p149l.eqh0;
import p149l.f30;
import p149l.jo0;
import p149l.kpb0;
import p149l.mkd0;
import p149l.qib0;
import p149l.t100;
import p149l.xdl0;
import p149l.z2c0;

/* JADX INFO: loaded from: classes9.dex */
public class QuickAudioCardView extends OnlineMatchBaseCardView {

    /* JADX INFO: renamed from: a */
    public VLinear f35507a;

    /* JADX INFO: renamed from: b */
    public VImage f35508b;

    /* JADX INFO: renamed from: c */
    public VText f35509c;

    /* JADX INFO: renamed from: d */
    public VText f35510d;

    /* JADX INFO: renamed from: e */
    public VImage f35511e;

    /* JADX INFO: renamed from: f */
    public VRelative f35512f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f35513g;

    /* JADX INFO: renamed from: h */
    public VText f35514h;

    /* JADX INFO: renamed from: i */
    public TextView f35515i;

    /* JADX INFO: renamed from: j */
    public VText f35516j;

    /* JADX INFO: renamed from: k */
    public SVGAnimationView f35517k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f35518l;

    /* JADX INFO: renamed from: m */
    public VText f35519m;

    /* JADX INFO: renamed from: n */
    public String f35520n;

    /* JADX INFO: renamed from: o */
    public c4g0 f35521o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.quickaudio.view.QuickAudioCardView$a */
    public class C8817a extends AnimListener {
        public C8817a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            QuickAudioCardView.this.m50305e();
        }
    }

    public QuickAudioCardView(Context context) {
        super(context);
        this.f35520n = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m54608n(int i) {
        if (i > t100.m186890d(500.0f)) {
            return;
        }
        int i2 = (i * 345) / 600;
        ViewGroup.LayoutParams layoutParams = this.f35511e.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i2;
        this.f35511e.setLayoutParams(layoutParams);
        int i3 = (i * 317) / 600;
        ViewGroup.LayoutParams layoutParams2 = this.f35512f.getLayoutParams();
        layoutParams2.width = (i3 * 220) / 317;
        layoutParams2.height = i3;
        this.f35512f.setLayoutParams(layoutParams2);
        xdl0.m208360X(this.f35511e, (i * CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA) / 600);
        xdl0.m208360X(this.f35512f, (i * 178) / 600);
        m50305e();
    }

    /* JADX INFO: renamed from: q */
    private void m54609q() {
        this.f35517k.stopAnimation(false);
        this.f35520n = "";
        mkd0.m154992z(this.f35521o);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.onlinematch.view.OnlineMatchBaseCardView
    /* JADX INFO: renamed from: f */
    public void mo50306f(final QuickChatCardWrapper quickChatCardWrapper, final f30<Boolean, String> f30Var) {
        User user = quickChatCardWrapper.getUser();
        if (NullChecker.m81303a(user) && !TextUtils.equals(this.f35520n, user.f56011id)) {
            xdl0.m208344M(this.f35514h, true);
            this.f35514h.setTypeface(eqh0.m117752c(3), 1);
            qib0.f154691G.m102336O(this.f35513g, user.m60124fp().profileSmall().formatted(), 2, 5);
            String str = user.isFemale() ? "她" : "他";
            this.f35510d.setText(String.format("%s和你还蛮合适的，去和%s聊聊吧！", str, str));
            this.f35515i.setText(user.name);
            if (user.isIdAndPicBothVerified()) {
                this.f35515i.setCompoundDrawablesWithIntrinsicBounds(0, 0, z2c0.f201192D, 0);
            } else {
                boolean zIsPicVerificationVerified = user.isPicVerificationVerified();
                TextView textView = this.f35515i;
                if (zIsPicVerificationVerified) {
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, z2c0.f201218z, 0);
                } else {
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
            }
            xdl0.m208386l0(this.f35515i, 0, false, false);
            xdl0.m208344M(this.f35516j, true);
            StringBuilder sb = new StringBuilder();
            CoreBusinessService coreBusinessServiceM94651a = CoreModule.m29935P().m94651a();
            Location location = user.location;
            String strMo33385Ob = coreBusinessServiceM94651a.mo33385Ob(location.distance, location.region.city);
            if (!TextUtils.isEmpty(strMo33385Ob)) {
                sb.append(strMo33385Ob);
                sb.append(" · ");
            }
            sb.append(CoreModule.m29935P().m94651a().mo33570qj(user));
            this.f35516j.setText(sb.toString());
            this.f35519m.setText("立即接听 5s");
            this.f35521o = C22306c.interval(1L, TimeUnit.SECONDS).take(6).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.hpb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f108906a.m54611o(quickChatCardWrapper, (Long) obj);
                }
            }));
            xdl0.m208329E0(this.f35519m, new View.OnClickListener() { // from class: l.ipb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f30Var.call(Boolean.FALSE, "");
                }
            });
            if (!TextUtils.equals(this.f35520n, user.f56011id)) {
                bt0.m103739l(this.f35512f, bt0.f77162i, 200L, 600L, new AccelerateDecelerateInterpolator(), 1.0f, 0.96f, 1.0f).start();
                final String strMo33595tc = CoreModule.m29935P().m94651a().mo33595tc();
                this.f35512f.postDelayed(new Runnable() { // from class: l.jpb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f119144a.m54612p(strMo33595tc);
                    }
                }, 300L);
            }
            this.f35520n = user.f56011id;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m54610l(View view) {
        kpb0.m146838a(this, view);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m54611o(QuickChatCardWrapper quickChatCardWrapper, Long l2) {
        this.f35519m.setText(String.format("立即接听 %ss", Long.valueOf(5 - l2.longValue())));
        if (l2.longValue() >= 5) {
            CoreModule.f17545c.f19673p1.m30055u3();
            quickChatCardWrapper.consume();
            m54609q();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m54609q();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54610l(this);
        final int iM208410x0 = (((((xdl0.m208410x0(getContext()) - xdl0.m208336I(getContext())) - xdl0.m208331F0()) - t100.m186890d(44.0f)) - t100.m186890d(56.0f)) - t100.m186890d(24.0f)) - t100.m186890d(12.0f);
        if (iM208410x0 >= t100.m186890d(600.0f)) {
            int iM186890d = iM208410x0 - t100.m186890d(640.0f);
            if (iM186890d > 0) {
                int i = iM186890d / 2;
                xdl0.m208360X(this.f35511e, t100.m186890d(155.0f) + i);
                xdl0.m208360X(this.f35512f, t100.m186890d(168.0f) + i);
                xdl0.m208357U(this.f35519m, t100.m186890d(46.0f));
            }
        } else {
            int iM186890d2 = t100.m186890d(500.0f);
            VLinear vLinear = this.f35507a;
            if (iM208410x0 >= iM186890d2) {
                xdl0.m208360X(vLinear, t100.m186890d(5.0f));
                xdl0.m208360X(this.f35508b, t100.m186890d(10.0f));
                xdl0.m208360X(this.f35511e, t100.m186890d(130.0f));
                xdl0.m208360X(this.f35512f, t100.m186890d(143.0f));
            } else {
                xdl0.m208360X(vLinear, 0);
                xdl0.m208360X(this.f35508b, t100.m186890d(2.0f));
            }
        }
        this.f35509c.getPaint().setFakeBoldText(true);
        this.f35519m.getPaint().setFakeBoldText(true);
        post(new Runnable() { // from class: l.gpb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f103775a.m54608n(iM208410x0);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m54612p(String str) {
        SVGALoader.with(getContext()).from(str).repeatCount(-1).animListener(new C8817a()).into(this.f35517k);
        this.f35517k.startAnimation();
    }

    public QuickAudioCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35520n = "";
    }
}
