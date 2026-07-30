package com.p046p1.mobile.putong.live.livingroom.increment.gift.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftSkin;
import com.p046p1.mobile.putong.live.base.webview.LiveMkWebView;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
import p147v.VDraweeView;
import p149l.bt0;
import p149l.dt0;
import p149l.e30;
import p149l.epj;
import p149l.hxs;
import p149l.i3c0;
import p149l.mep0;
import p149l.ngm;
import p149l.s7m;
import p149l.t100;
import p149l.xdl0;
import p149l.ym2;
import p149l.yoj;
import p149l.znj;

/* JADX INFO: loaded from: classes4.dex */
public class GiftDialogSkinView extends FrameLayout implements s7m<yoj<?>> {

    /* JADX INFO: renamed from: l */
    public static final int f50322l = t100.m186890d(30.0f);

    /* JADX INFO: renamed from: a */
    public VDraweeView f50323a;

    /* JADX INFO: renamed from: b */
    public ViewStub f50324b;

    /* JADX INFO: renamed from: c */
    public LiveMkWebView f50325c;

    /* JADX INFO: renamed from: d */
    public yoj<?> f50326d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f50327e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f50328f;

    /* JADX INFO: renamed from: g */
    public AnimatorSet f50329g;

    /* JADX INFO: renamed from: h */
    public AnimatorSet f50330h;

    /* JADX INFO: renamed from: i */
    public int f50331i;

    /* JADX INFO: renamed from: j */
    public boolean f50332j;

    /* JADX INFO: renamed from: k */
    public String f50333k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogSkinView$a */
    public class C12844a extends ym2 {
        public C12844a() {
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            if (ngmVar == null) {
                return;
            }
            int iM208412y0 = (int) (xdl0.m208412y0() * (ngmVar.getHeight() / ngmVar.getWidth()));
            xdl0.m208325C0(GiftDialogSkinView.this.f50323a, iM208412y0);
            GiftDialogSkinView.this.f50331i = iM208412y0;
            GiftDialogSkinView.this.m74473M();
        }
    }

    public GiftDialogSkinView(@NonNull Context context) {
        super(context);
        this.f50332j = false;
    }

    /* JADX INFO: renamed from: E */
    private void m74455E() {
        LiveMkWebView liveMkWebView = this.f50325c;
        if (liveMkWebView == null) {
            return;
        }
        liveMkWebView.m68867p();
        this.f50325c = null;
    }

    private void setSchemaAction(final BLiveGiftSkin bLiveGiftSkin) {
        boolean zIsEmpty = TextUtils.isEmpty(bLiveGiftSkin.top.schema);
        VDraweeView vDraweeView = this.f50323a;
        if (zIsEmpty) {
            vDraweeView.setOnClickListener(null);
        } else {
            vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.zoj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f204124a.m74463A(bLiveGiftSkin, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m74463A(BLiveGiftSkin bLiveGiftSkin, View view) {
        this.f50326d.mo129310p3(200, bLiveGiftSkin.top.schema);
    }

    /* JADX INFO: renamed from: B */
    public final void m74464B(final String str, final VDraweeView vDraweeView) {
        if (vDraweeView.getWidth() == 0) {
            vDraweeView.post(new Runnable() { // from class: l.apj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f71053a.m74488y(str, vDraweeView);
                }
            });
        } else {
            m74488y(str, vDraweeView);
        }
    }

    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final void m74488y(String str, VDraweeView vDraweeView) {
        hxs.m133408u("context_livingAct", vDraweeView, str, vDraweeView.getWidth(), vDraweeView.getHeight());
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: F */
    public void m74466F() {
        int i;
        dt0.m113503C(this.f50330h);
        dt0.m113503C(this.f50329g);
        this.f50330h = null;
        this.f50329g = null;
        if (xdl0.m208349O0(this) && (i = this.f50331i) != 0) {
            xdl0.m208325C0(this, i);
        }
        m74479m();
    }

    /* JADX INFO: renamed from: G */
    public final void m74467G(BLiveGiftSkin bLiveGiftSkin) {
        if (TextUtils.isEmpty(bLiveGiftSkin.f44383bg.url)) {
            this.f50327e.setBackgroundResource(i3c0.f111173t7);
            this.f50327e.setController(null);
        } else {
            m74464B(bLiveGiftSkin.f44383bg.url, this.f50327e);
            this.f50327e.setBackgroundResource(0);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m74468H(final BLiveGiftSkin bLiveGiftSkin) {
        xdl0.m208345M0(this.f50323a, false);
        if (TextUtils.isEmpty(bLiveGiftSkin.top.url)) {
            return;
        }
        if (this.f50325c == null) {
            m74485v(bLiveGiftSkin.top.url);
        }
        xdl0.m208344M(this.f50325c, true);
        this.f50325c.m68874w(bLiveGiftSkin.top.url);
        int iM74483s = m74483s(bLiveGiftSkin);
        xdl0.m208325C0(this.f50325c, iM74483s);
        this.f50331i = iM74483s;
        this.f50326d.m215517M3(new e30() { // from class: l.cpj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81942a.m74489z(bLiveGiftSkin, (String) obj);
            }
        });
        m74473M();
    }

    /* JADX INFO: renamed from: I */
    public final void m74469I(BLiveGiftSkin bLiveGiftSkin) {
        this.f50332j = !TextUtils.isEmpty(bLiveGiftSkin.top.url);
        if (bLiveGiftSkin.isH5Type()) {
            m74468H(bLiveGiftSkin);
        } else {
            m74470J(bLiveGiftSkin);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m74470J(BLiveGiftSkin bLiveGiftSkin) {
        xdl0.m208345M0(this.f50323a, !TextUtils.isEmpty(bLiveGiftSkin.top.url));
        LiveMkWebView liveMkWebView = this.f50325c;
        if (liveMkWebView != null) {
            xdl0.m208344M(liveMkWebView, false);
        }
        setSchemaAction(bLiveGiftSkin);
        if (TextUtils.isEmpty(bLiveGiftSkin.top.url)) {
            return;
        }
        hxs.m133409v("context_livingAct", this.f50323a, bLiveGiftSkin.top.url, 0, 0, false, true, false, new C12844a());
    }

    /* JADX INFO: renamed from: K */
    public final void m74471K(BLiveGiftSkin bLiveGiftSkin) {
        if (TextUtils.isEmpty(bLiveGiftSkin.interlayer.url)) {
            this.f50328f.setController(null);
        } else {
            m74464B(bLiveGiftSkin.interlayer.url, this.f50328f);
        }
        xdl0.m208345M0(this.f50328f, !TextUtils.isEmpty(bLiveGiftSkin.interlayer.url));
    }

    /* JADX INFO: renamed from: L */
    public void m74472L(BLiveGiftSkin bLiveGiftSkin) {
        if (bLiveGiftSkin == null) {
            m74479m();
            return;
        }
        if (TextUtils.equals(this.f50333k, bLiveGiftSkin.f44384id)) {
            return;
        }
        this.f50333k = bLiveGiftSkin.f44384id;
        setAlpha(1.0f);
        xdl0.m208344M(this, true);
        m74467G(bLiveGiftSkin);
        m74471K(bLiveGiftSkin);
        m74469I(bLiveGiftSkin);
    }

    /* JADX INFO: renamed from: M */
    public final void m74473M() {
        yoj<?> yojVar = this.f50326d;
        if (yojVar == null) {
            return;
        }
        if (((Boolean) yojVar.m129297F3(new znj(700))).booleanValue()) {
            this.f50326d.m206028F2().GiftDialogEventGroup.giftDialogHeightChange().m172467p();
        }
        int i = this.f50331i;
        if (i != 0) {
            xdl0.m208325C0(this, i);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m74474N() {
        if (xdl0.m208349O0(this)) {
            if (this.f50330h == null) {
                this.f50330h = m74481p();
            }
            if (this.f50330h.isRunning()) {
                return;
            }
            this.f50330h.start();
        }
    }

    /* JADX INFO: renamed from: O */
    public void m74475O() {
        if (xdl0.m208349O0(this)) {
            if (this.f50329g == null) {
                this.f50329g = m74482q();
            }
            if (this.f50329g.isRunning()) {
                return;
            }
            this.f50329g.start();
        }
    }

    @Override // p149l.s7m
    public void destroy() {
        m74455E();
    }

    public int getTopSkinHeight() {
        if (xdl0.m208349O0(this)) {
            return this.f50331i - f50322l;
        }
        return 0;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m74476j(View view) {
        epj.m117644a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public void m74477k(VDraweeView vDraweeView, VDraweeView vDraweeView2) {
        this.f50327e = vDraweeView;
        this.f50328f = vDraweeView2;
        mep0.m154301c1(vDraweeView, 0, 0, 0, -t100.m186890d(24.0f), t100.m186890d(24.0f));
        mep0.m154301c1(vDraweeView2, 0, 0, 0, -t100.m186890d(24.0f), t100.m186890d(24.0f));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(yoj<?> yojVar) {
        this.f50326d = yojVar;
    }

    /* JADX INFO: renamed from: m */
    public final void m74479m() {
        VDraweeView vDraweeView = this.f50328f;
        if (vDraweeView != null) {
            vDraweeView.setController(null);
        }
        VDraweeView vDraweeView2 = this.f50327e;
        if (vDraweeView2 != null) {
            vDraweeView2.setController(null);
        }
        VDraweeView vDraweeView3 = this.f50323a;
        if (vDraweeView3 != null) {
            vDraweeView3.setController(null);
        }
        LiveMkWebView liveMkWebView = this.f50325c;
        if (liveMkWebView != null) {
            liveMkWebView.m68873v();
            xdl0.m208325C0(this.f50325c, 0);
        }
        xdl0.m208344M(this, false);
        this.f50333k = "";
    }

    /* JADX INFO: renamed from: n */
    public void m74480n() {
        LiveMkWebView liveMkWebView = this.f50325c;
        if (liveMkWebView == null || !xdl0.m208349O0(liveMkWebView)) {
            return;
        }
        m74479m();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74476j(this);
    }

    /* JADX INFO: renamed from: p */
    public final AnimatorSet m74481p() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f50331i, 1);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.bpj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f76642a.m74486w(valueAnimator);
            }
        });
        Animator animatorM103741n = bt0.m103741n(this, View.ALPHA, 1.0f, 0.0f);
        animatorM103741n.setDuration(100L);
        animatorSet.playTogether(valueAnimatorOfInt, animatorM103741n);
        return animatorSet;
    }

    /* JADX INFO: renamed from: q */
    public final AnimatorSet m74482q() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1, this.f50331i);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.dpj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f87287a.m74487x(valueAnimator);
            }
        });
        Animator animatorM103741n = bt0.m103741n(this, View.ALPHA, 0.0f, 1.0f);
        animatorM103741n.setDuration(100L);
        animatorSet.playTogether(valueAnimatorOfInt, animatorM103741n);
        return animatorSet;
    }

    /* JADX INFO: renamed from: s */
    public final int m74483s(BLiveGiftSkin bLiveGiftSkin) {
        Uri uri = Uri.parse(bLiveGiftSkin.top.url);
        try {
            return (int) (xdl0.m208412y0() / (Integer.parseInt(uri.getQueryParameter("topSkinWidth")) / Integer.parseInt(uri.getQueryParameter("topSkinHeight"))));
        } catch (Exception unused) {
            return t100.m186890d(80.0f);
        }
    }

    /* JADX INFO: renamed from: u */
    public boolean m74484u() {
        return this.f50332j;
    }

    /* JADX INFO: renamed from: v */
    public final void m74485v(String str) {
        LiveMkWebView liveMkWebView = (LiveMkWebView) this.f50324b.inflate();
        this.f50325c = liveMkWebView;
        CommonH5Builder.BgType bgType = CommonH5Builder.BgType.TRAN_BG;
        liveMkWebView.m68876y(true, str, bgType);
        this.f50325c.setWithProgressView(false);
        this.f50325c.setWithErrorView(false);
        this.f50325c.setVerticalScrollBarEnable(false);
        this.f50325c.setWebViewBg(bgType);
        mep0.m154301c1(this.f50325c, 0, 0, 0, -t100.m186890d(24.0f), t100.m186890d(24.0f));
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m74486w(ValueAnimator valueAnimator) {
        xdl0.m208325C0(this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m74487x(ValueAnimator valueAnimator) {
        xdl0.m208325C0(this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m74489z(BLiveGiftSkin bLiveGiftSkin, String str) {
        this.f50325c.m68862k((PutongAct) this.f50326d.act(), str, bLiveGiftSkin.top.url);
    }

    public GiftDialogSkinView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50332j = false;
    }

    public GiftDialogSkinView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50332j = false;
    }
}
