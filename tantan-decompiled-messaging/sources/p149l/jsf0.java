package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.live.base.data.BLiveColor;
import com.p046p1.mobile.putong.live.base.data.BLivePictureUrl;
import com.p046p1.mobile.putong.live.base.data.BLiveSkinConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveTopBarBackground;
import com.p046p1.mobile.putong.live.base.data.BLiveTopBarConfig;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.skin.ToolBarSkinView;
import com.p046p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import p147v.VPager;

/* JADX INFO: loaded from: classes13.dex */
public class jsf0 implements s7m<fsf0> {

    /* JADX INFO: renamed from: a */
    public final PutongAct f119499a;

    /* JADX INFO: renamed from: b */
    public final TabLayout f119500b;

    /* JADX INFO: renamed from: c */
    public final View f119501c;

    /* JADX INFO: renamed from: d */
    public final ToolBarSkinView f119502d;

    /* JADX INFO: renamed from: e */
    public final AnimEffectPlayer f119503e;

    /* JADX INFO: renamed from: f */
    public fsf0 f119504f;

    /* JADX INFO: renamed from: g */
    public final VPager f119505g;

    /* JADX INFO: renamed from: h */
    public BLiveSkinConfig f119506h;

    /* JADX INFO: renamed from: l.jsf0$a */
    public class C17851a extends ym2 {
        public C17851a() {
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            if (ngmVar == null || ngmVar.getWidth() == 0) {
                return;
            }
            float height = (ngmVar.getHeight() * 1.0f) / ngmVar.getWidth();
            ViewGroup.LayoutParams layoutParams = jsf0.this.f119502d.f45023c.getLayoutParams();
            layoutParams.width = xdl0.f192403e;
            layoutParams.height = (int) (xdl0.m208412y0() * height);
            jsf0.this.f119502d.f45023c.setLayoutParams(layoutParams);
        }
    }

    public jsf0(TabLayout tabLayout, View view, ToolBarSkinView toolBarSkinView, NoSaveStateViewPager noSaveStateViewPager, AnimEffectPlayer animEffectPlayer, Act act) {
        this.f119499a = (PutongAct) act;
        this.f119500b = tabLayout;
        this.f119501c = view;
        this.f119502d = toolBarSkinView;
        this.f119505g = noSaveStateViewPager;
        this.f119503e = animEffectPlayer;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f119499a;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f119499a;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(fsf0 fsf0Var) {
        this.f119504f = fsf0Var;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m143035f(String str) {
        int iM193307B = uep0.m193307B(str);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{yb2.m213884i(uep0.m193307B(str), 2)});
        int iM186890d = t100.m186890d(27.0f);
        int i = t100.f167259h;
        layerDrawable.setLayerInset(0, iM186890d, i, t100.m186890d(27.0f), i);
        this.f119500b.setSelectedTabIndicatorColor(iM193307B);
        this.f119500b.setSelectedTabIndicator(layerDrawable);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m143036i(String str) {
        this.f119502d.f45023c.setBackground(yb2.m213884i(uep0.m193307B(str), 0));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m143037j(String str) {
        hxs.m133409v("context_square", this.f119502d.f45023c, str, xdl0.m208412y0(), t100.f167230E, false, false, false, new C17851a());
    }

    /* JADX INFO: renamed from: k */
    public void m143038k(boolean z) {
        this.f119499a.setTransparentStatusBar();
    }

    /* JADX INFO: renamed from: l */
    public void m143039l(boolean z) {
        if (lor.m150808m()) {
            return;
        }
        if (!z) {
            xdl0.m208344M(this.f119503e, false);
            this.f119503e.pauseAnimation();
            BLiveSkinConfig bLiveSkinConfig = this.f119506h;
            if (bLiveSkinConfig != null) {
                m143041n(bLiveSkinConfig);
                return;
            }
            return;
        }
        this.f119499a.setTransparentStatusBar();
        this.f119503e.setLayoutParams(new FrameLayout.LayoutParams(xdl0.f192403e, t100.m186890d(92.0f) + xdl0.m208331F0()));
        xdl0.m208344M(this.f119503e, true);
        this.f119503e.mo68497g("https://auto.tancdn.com/v1/raw/bd5067f0-fa5a-4faf-bd72-06636f0c4d5610.pdf", -1, null, true);
        this.f119505g.setBackgroundColor(this.f119499a.color(g1c0.f100148c));
        this.f119502d.setBackgroundColor(this.f119499a.color(g1c0.f100148c));
    }

    /* JADX INFO: renamed from: m */
    public final void m143040m(BLiveColor bLiveColor) {
        if (bLiveColor == null) {
            return;
        }
        this.f119499a.setStatusBarColor(Color.parseColor(bLiveColor.startColor));
        GradientDrawable gradientDrawableM213886k = yb2.m213886k(uep0.m193307B(bLiveColor.startColor), uep0.m193307B(bLiveColor.endColor), 0, GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawableM213886k.setAlpha((int) (bLiveColor.alpha * 255.0d));
        this.f119501c.setBackground(gradientDrawableM213886k);
    }

    /* JADX INFO: renamed from: n */
    public void m143041n(BLiveSkinConfig bLiveSkinConfig) {
        this.f119506h = bLiveSkinConfig;
        m143042p(bLiveSkinConfig.topTabBarConfig);
        m143040m(bLiveSkinConfig.backgroundConfig);
    }

    /* JADX INFO: renamed from: p */
    public final void m143042p(BLiveTopBarConfig bLiveTopBarConfig) {
        if (bLiveTopBarConfig == null) {
            return;
        }
        if (!TextUtils.isEmpty(bLiveTopBarConfig.personalCenterIcon)) {
            this.f119504f.m151642F2().LiveHomeMenuEvent.skinConfig().mo172463j(bLiveTopBarConfig.personalCenterIcon);
        }
        if (bLiveTopBarConfig.startLiveConfig != null) {
            this.f119504f.m151642F2().LiveHomeStartLiveEvent.startLiveSkinEvent().mo172463j(bLiveTopBarConfig.startLiveConfig);
        }
        if (!TextUtils.isEmpty(bLiveTopBarConfig.multiCallPartyIcon)) {
            this.f119504f.m151642F2().LiveHomeMenuEvent.multiCallPartyIcon().mo172463j(bLiveTopBarConfig.multiCallPartyIcon);
        }
        if (!TextUtils.isEmpty(bLiveTopBarConfig.searchIcon)) {
            this.f119504f.m151642F2().LiveHomeMenuEvent.searchIcon().mo172463j(bLiveTopBarConfig.searchIcon);
        }
        m143044s(bLiveTopBarConfig.background);
        m143043q(bLiveTopBarConfig);
    }

    /* JADX INFO: renamed from: q */
    public final void m143043q(BLiveTopBarConfig bLiveTopBarConfig) {
        if (bLiveTopBarConfig == null) {
            return;
        }
        w8u.m202211n(bLiveTopBarConfig.slideBarColor, new e30() { // from class: l.gsf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104175a.m143035f((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m143044s(BLiveTopBarBackground bLiveTopBarBackground) {
        if (bLiveTopBarBackground == null) {
            return;
        }
        w8u.m202211n(bLiveTopBarBackground.color, new e30() { // from class: l.hsf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109322a.m143036i((String) obj);
            }
        });
        BLivePictureUrl bLivePictureUrl = bLiveTopBarBackground.pictureUrl;
        if (bLivePictureUrl != null) {
            w8u.m202211n(bLivePictureUrl.getOptionUrl(), new e30() { // from class: l.isf0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f114760a.m143037j((String) obj);
                }
            });
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
