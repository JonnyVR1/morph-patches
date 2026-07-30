package com.p000p1.mobile.putong.live.livingroom.increment.gift.tray;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.C0425e;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage;
import com.p1.mobile.putong.live.base.data.BLiveIntlFlyMicEffectConfig;
import com.p1.mobile.putong.live.livingroom.view.LiveGiftTrayView;
import l.e30;
import l.l9e;
import l.s7m;
import l.xdl0;
import p002l.nls;
import p002l.wrj;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveGiftTrays extends LinearLayout implements s7m<LiveGiftTraysPresenter> {

    /* JADX INFO: renamed from: a */
    public LiveGiftTrays f6170a;

    /* JADX INFO: renamed from: b */
    public LiveGiftTrayView f6171b;

    /* JADX INFO: renamed from: c */
    public LiveGiftTrayView f6172c;

    /* JADX INFO: renamed from: d */
    public LiveGiftTraysPresenter f6173d;

    public LiveGiftTrays(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m7754q(View view) {
        this.f6173d.m7817y4(this.f6171b.getUserId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m7755s(View view) {
        this.f6173d.m7817y4(this.f6172c.getUserId());
    }

    /* JADX INFO: renamed from: z */
    private void m7756z(GiftTrayData giftTrayData) {
        wrj.m25373H(giftTrayData);
        if (giftTrayData.m7731s()) {
            this.f6173d.m7815v4(giftTrayData);
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m7757A(LiveGiftTrayView liveGiftTrayView) {
        liveGiftTrayView.Y0();
    }

    /* JADX INFO: renamed from: B */
    public void m7758B(LiveGiftTraysPresenter.TrayType trayType, GiftTrayData giftTrayData, boolean z) {
        m7767m(trayType).a1(giftTrayData, new e30() { // from class: l.kks
            public final void call(Object obj) {
                this.f14368a.m7772w((GiftTrayData) obj);
            }
        });
        m7767m(trayType).setRewardPlayAction(new e30() { // from class: l.lks
            public final void call(Object obj) {
                this.f14917a.m7773x((C0425e.b) obj);
            }
        });
        m7757A(m7767m(trayType));
        if (z && trayType == LiveGiftTraysPresenter.TrayType.top) {
            m7756z(giftTrayData);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m7759C() {
        this.f6171b.e1();
        this.f6172c.e1();
        xdl0.E0(this.f6171b.e, (View.OnClickListener) null);
        xdl0.E0(this.f6172c.e, (View.OnClickListener) null);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m7760C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: E */
    public boolean m7761E(LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray intlLuckyGiftTray) {
        if (this.f6171b.K0() && TextUtils.equals(this.f6171b.getPlayingComboId(), intlLuckyGiftTray.getComboId())) {
            this.f6171b.X0(intlLuckyGiftTray);
            return true;
        }
        if (!this.f6172c.K0() || !TextUtils.equals(this.f6172c.getPlayingComboId(), intlLuckyGiftTray.getComboId())) {
            return false;
        }
        this.f6172c.X0(intlLuckyGiftTray);
        return true;
    }

    public void destroy() {
        m7759C();
    }

    @Override // android.view.View
    public Animation getAnimation() {
        return super.getAnimation();
    }

    /* JADX INFO: renamed from: i */
    public final void m7762i(View view) {
        nls.m18863a(this, view);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2] */
    public void init() {
        this.f6171b.e.setOnClickListener(new View.OnClickListener() { // from class: l.gks
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11488a.m7754q(view);
            }
        });
        this.f6172c.e.setOnClickListener(new View.OnClickListener() { // from class: l.hks
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12097a.m7755s(view);
            }
        });
        LiveGiftTraysPresenter liveGiftTraysPresenter = this.f6173d;
        if (liveGiftTraysPresenter == null || !liveGiftTraysPresenter.m25547E2().m14548Z0()) {
            return;
        }
        this.f6171b.setComboPlayCallBack(new e30() { // from class: l.iks
            public final void call(Object obj) {
                this.f13292a.m7770u((BLiveIntlFlyMicEffectConfig) obj);
            }
        });
        this.f6172c.setComboPlayCallBack(new e30() { // from class: l.jks
            public final void call(Object obj) {
                this.f13853a.m7771v((BLiveIntlFlyMicEffectConfig) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public boolean m7764j(GiftTrayData giftTrayData) {
        if (giftTrayData.m7736x()) {
            return false;
        }
        if (giftTrayData.f6150n.equals(this.f6171b.getPlayingComboId())) {
            this.f6171b.D0(giftTrayData);
            return true;
        }
        if (!giftTrayData.f6150n.equals(this.f6172c.getPlayingComboId())) {
            return false;
        }
        this.f6172c.D0(giftTrayData);
        return true;
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m7763i1(LiveGiftTraysPresenter liveGiftTraysPresenter) {
        this.f6173d = liveGiftTraysPresenter;
    }

    /* JADX INFO: renamed from: l */
    public void m7766l(@NonNull String str) {
        if (!TextUtils.isEmpty(str) && this.f6171b.J0(str)) {
            this.f6171b.U0();
        }
    }

    /* JADX INFO: renamed from: m */
    public LiveGiftTrayView m7767m(LiveGiftTraysPresenter.TrayType trayType) {
        return trayType == LiveGiftTraysPresenter.TrayType.top ? this.f6171b : this.f6172c;
    }

    /* JADX INFO: renamed from: n */
    public boolean m7768n(GiftTrayData giftTrayData) {
        GiftTrayData.GiftPriority playingGiftPriority;
        GiftTrayData.GiftPriority giftPriorityM7727i = giftTrayData.m7727i();
        if (giftPriorityM7727i == GiftTrayData.GiftPriority.ownLuxury) {
            GiftTrayData.GiftPriority playingGiftPriority2 = this.f6171b.getPlayingGiftPriority();
            if (playingGiftPriority2 == null || !this.f6171b.K0()) {
                return false;
            }
            if (playingGiftPriority2 != GiftTrayData.GiftPriority.otherLuxury && playingGiftPriority2 != GiftTrayData.GiftPriority.otherNormal && playingGiftPriority2 != GiftTrayData.GiftPriority.owmNormal) {
                return false;
            }
            this.f6171b.I0();
            return true;
        }
        if (giftPriorityM7727i != GiftTrayData.GiftPriority.owmNormal) {
            if (giftPriorityM7727i != GiftTrayData.GiftPriority.otherLuxury || (playingGiftPriority = this.f6171b.getPlayingGiftPriority()) == null || !this.f6171b.K0() || playingGiftPriority != GiftTrayData.GiftPriority.otherNormal) {
                return false;
            }
            this.f6171b.I0();
            return false;
        }
        GiftTrayData.GiftPriority playingGiftPriority3 = this.f6172c.getPlayingGiftPriority();
        if (playingGiftPriority3 != null && this.f6172c.K0() && playingGiftPriority3 == GiftTrayData.GiftPriority.otherNormal) {
            this.f6172c.I0();
            return true;
        }
        GiftTrayData.GiftPriority playingGiftPriority4 = this.f6171b.getPlayingGiftPriority();
        if (playingGiftPriority4 == null || !this.f6171b.K0() || playingGiftPriority4 != GiftTrayData.GiftPriority.otherNormal) {
            return false;
        }
        this.f6171b.I0();
        return true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7762i(this);
    }

    /* JADX INFO: renamed from: p */
    public boolean m7769p(LiveGiftTraysPresenter.TrayType trayType) {
        if (trayType == LiveGiftTraysPresenter.TrayType.top) {
            return this.f6171b.K0();
        }
        if (trayType == LiveGiftTraysPresenter.TrayType.bottom) {
            return this.f6172c.K0();
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m7770u(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig) {
        this.f6173d.m25548F2().VoiceFlyEvent.playFlyMicAnim().j(bLiveIntlFlyMicEffectConfig);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m7771v(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig) {
        this.f6173d.m25548F2().VoiceFlyEvent.playFlyMicAnim().j(bLiveIntlFlyMicEffectConfig);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m7772w(GiftTrayData giftTrayData) {
        LiveGiftTraysPresenter liveGiftTraysPresenter = this.f6173d;
        if (liveGiftTraysPresenter != null) {
            liveGiftTraysPresenter.m7813t4(giftTrayData);
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m7773x(C0425e.b bVar) {
        LiveGiftTraysPresenter liveGiftTraysPresenter = this.f6173d;
        if (liveGiftTraysPresenter != null) {
            liveGiftTraysPresenter.m7811s4(bVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: y */
    public void m7774y(int i) {
        LiveGiftTraysPresenter liveGiftTraysPresenter = this.f6173d;
        if (liveGiftTraysPresenter != null && !liveGiftTraysPresenter.m25547E2().m14548Z0() && !this.f6173d.m25547E2().mo9893p()) {
            ViewGroup viewGroup = (ViewGroup) this.f6170a.getParent();
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = l9e.m - i;
                viewGroup.setLayoutParams(layoutParams);
                return;
            }
        }
        this.f6170a.setTranslationY(i);
    }

    public LiveGiftTrays(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGiftTrays(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
