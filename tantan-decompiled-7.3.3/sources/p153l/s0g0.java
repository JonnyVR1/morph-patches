package p153l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.live.base.data.BLiveColor;
import com.p051p1.mobile.putong.live.base.data.BLivePictureUrl;
import com.p051p1.mobile.putong.live.base.data.BLiveSkinConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveTopBarBackground;
import com.p051p1.mobile.putong.live.base.data.BLiveTopBarConfig;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.skin.ToolBarSkinView;
import com.p051p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import p151v.VPager;

/* JADX INFO: loaded from: classes9.dex */
public class s0g0 implements iam<o0g0> {

    /* JADX INFO: renamed from: a */
    public final PutongAct f165689a;

    /* JADX INFO: renamed from: b */
    public final TabLayout f165690b;

    /* JADX INFO: renamed from: c */
    public final View f165691c;

    /* JADX INFO: renamed from: d */
    public final ToolBarSkinView f165692d;

    /* JADX INFO: renamed from: e */
    public final AnimEffectPlayer f165693e;

    /* JADX INFO: renamed from: f */
    public o0g0 f165694f;

    /* JADX INFO: renamed from: g */
    public final VPager f165695g;

    /* JADX INFO: renamed from: h */
    public BLiveSkinConfig f165696h;

    /* JADX INFO: renamed from: l.s0g0$a */
    public class C19947a extends fn2 {
        public C19947a() {
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            if (qimVar == null || qimVar.getWidth() == 0) {
                return;
            }
            float height = (qimVar.getHeight() * 1.0f) / qimVar.getWidth();
            ViewGroup.LayoutParams layoutParams = s0g0.this.f165692d.f45871c.getLayoutParams();
            layoutParams.width = bnl0.f77544e;
            layoutParams.height = (int) (bnl0.m105592y0() * height);
            s0g0.this.f165692d.f45871c.setLayoutParams(layoutParams);
        }
    }

    public s0g0(TabLayout tabLayout, View view, ToolBarSkinView toolBarSkinView, NoSaveStateViewPager noSaveStateViewPager, AnimEffectPlayer animEffectPlayer, Act act) {
        this.f165689a = (PutongAct) act;
        this.f165690b = tabLayout;
        this.f165691c = view;
        this.f165692d = toolBarSkinView;
        this.f165695g = noSaveStateViewPager;
        this.f165693e = animEffectPlayer;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f165689a;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f165689a;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(o0g0 o0g0Var) {
        this.f165694f = o0g0Var;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m183941f(String str) {
        int iM216917B = ynp0.m216917B(str);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{fc2.m124979i(ynp0.m216917B(str), 2)});
        int iM175859d = qa00.m175859d(27.0f);
        int i = qa00.f156321h;
        layerDrawable.setLayerInset(0, iM175859d, i, qa00.m175859d(27.0f), i);
        this.f165690b.setSelectedTabIndicatorColor(iM216917B);
        this.f165690b.setSelectedTabIndicator(layerDrawable);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m183942i(String str) {
        this.f165692d.f45871c.setBackground(fc2.m124979i(ynp0.m216917B(str), 0));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m183943j(String str) {
        izs.m142871v("context_square", this.f165692d.f45871c, str, bnl0.m105592y0(), qa00.f156292E, false, false, false, new C19947a());
    }

    /* JADX INFO: renamed from: k */
    public void m183944k(boolean z) {
        this.f165689a.setTransparentStatusBar();
    }

    /* JADX INFO: renamed from: l */
    public void m183945l(boolean z) {
        if (mqr.m159593m()) {
            return;
        }
        if (!z) {
            bnl0.m105524M(this.f165693e, false);
            this.f165693e.pauseAnimation();
            BLiveSkinConfig bLiveSkinConfig = this.f165696h;
            if (bLiveSkinConfig != null) {
                m183947n(bLiveSkinConfig);
                return;
            }
            return;
        }
        this.f165689a.setTransparentStatusBar();
        this.f165693e.setLayoutParams(new FrameLayout.LayoutParams(bnl0.f77544e, qa00.m175859d(92.0f) + bnl0.m105511F0()));
        bnl0.m105524M(this.f165693e, true);
        this.f165693e.mo69680g("https://auto.tancdn.com/v1/raw/bd5067f0-fa5a-4faf-bd72-06636f0c4d5610.pdf", -1, null, true);
        this.f165695g.setBackgroundColor(this.f165689a.color(m9c0.f135378c));
        this.f165692d.setBackgroundColor(this.f165689a.color(m9c0.f135378c));
    }

    /* JADX INFO: renamed from: m */
    public final void m183946m(BLiveColor bLiveColor) {
        if (bLiveColor == null) {
            return;
        }
        this.f165689a.setStatusBarColor(Color.parseColor(bLiveColor.startColor));
        GradientDrawable gradientDrawableM124981k = fc2.m124981k(ynp0.m216917B(bLiveColor.startColor), ynp0.m216917B(bLiveColor.endColor), 0, GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawableM124981k.setAlpha((int) (bLiveColor.alpha * 255.0d));
        this.f165691c.setBackground(gradientDrawableM124981k);
    }

    /* JADX INFO: renamed from: n */
    public void m183947n(BLiveSkinConfig bLiveSkinConfig) {
        this.f165696h = bLiveSkinConfig;
        m183948p(bLiveSkinConfig.topTabBarConfig);
        m183946m(bLiveSkinConfig.backgroundConfig);
    }

    /* JADX INFO: renamed from: p */
    public final void m183948p(BLiveTopBarConfig bLiveTopBarConfig) {
        if (bLiveTopBarConfig == null) {
            return;
        }
        if (!TextUtils.isEmpty(bLiveTopBarConfig.personalCenterIcon)) {
            this.f165694f.m160238F2().LiveHomeMenuEvent.skinConfig().mo199273j(bLiveTopBarConfig.personalCenterIcon);
        }
        if (bLiveTopBarConfig.startLiveConfig != null) {
            this.f165694f.m160238F2().LiveHomeStartLiveEvent.startLiveSkinEvent().mo199273j(bLiveTopBarConfig.startLiveConfig);
        }
        if (!TextUtils.isEmpty(bLiveTopBarConfig.multiCallPartyIcon)) {
            this.f165694f.m160238F2().LiveHomeMenuEvent.multiCallPartyIcon().mo199273j(bLiveTopBarConfig.multiCallPartyIcon);
        }
        if (!TextUtils.isEmpty(bLiveTopBarConfig.searchIcon)) {
            this.f165694f.m160238F2().LiveHomeMenuEvent.searchIcon().mo199273j(bLiveTopBarConfig.searchIcon);
        }
        m183950s(bLiveTopBarConfig.background);
        m183949q(bLiveTopBarConfig);
    }

    /* JADX INFO: renamed from: q */
    public final void m183949q(BLiveTopBarConfig bLiveTopBarConfig) {
        if (bLiveTopBarConfig == null) {
            return;
        }
        xau.m209904n(bLiveTopBarConfig.slideBarColor, new y20() { // from class: l.p0g0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150048a.m183941f((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m183950s(BLiveTopBarBackground bLiveTopBarBackground) {
        if (bLiveTopBarBackground == null) {
            return;
        }
        xau.m209904n(bLiveTopBarBackground.color, new y20() { // from class: l.q0g0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155052a.m183942i((String) obj);
            }
        });
        BLivePictureUrl bLivePictureUrl = bLiveTopBarBackground.pictureUrl;
        if (bLivePictureUrl != null) {
            xau.m209904n(bLivePictureUrl.getOptionUrl(), new y20() { // from class: l.r0g0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f160631a.m183943j((String) obj);
                }
            });
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
