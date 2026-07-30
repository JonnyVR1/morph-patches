package com.p051p1.mobile.putong.live.livingroom.increment.gift.tray;

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
import com.p051p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlFlyMicEffectConfig;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.C12999e;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p051p1.mobile.putong.live.livingroom.view.LiveGiftTrayView;
import p153l.bnl0;
import p153l.iam;
import p153l.muj;
import p153l.ons;
import p153l.pae;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGiftTrays extends LinearLayout implements iam<LiveGiftTraysPresenter> {

    /* JADX INFO: renamed from: a */
    public LiveGiftTrays f50976a;

    /* JADX INFO: renamed from: b */
    public LiveGiftTrayView f50977b;

    /* JADX INFO: renamed from: c */
    public LiveGiftTrayView f50978c;

    /* JADX INFO: renamed from: d */
    public LiveGiftTraysPresenter f50979d;

    public LiveGiftTrays(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m75370q(View view) {
        this.f50979d.m75429y4(this.f50977b.getUserId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m75371s(View view) {
        this.f50979d.m75429y4(this.f50978c.getUserId());
    }

    /* JADX INFO: renamed from: z */
    private void m75372z(GiftTrayData giftTrayData) {
        muj.m160165H(giftTrayData);
        if (giftTrayData.m75349s()) {
            this.f50979d.m75427v4(giftTrayData);
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m75373A(LiveGiftTrayView liveGiftTrayView) {
        liveGiftTrayView.m77692Y0();
    }

    /* JADX INFO: renamed from: B */
    public void m75374B(LiveGiftTraysPresenter.TrayType trayType, GiftTrayData giftTrayData, boolean z) {
        m75381m(trayType).m77694a1(giftTrayData, new y20() { // from class: l.lms
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132716a.m75386w((GiftTrayData) obj);
            }
        });
        m75381m(trayType).setRewardPlayAction(new y20() { // from class: l.mms
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137633a.m75387x((C12999e.b) obj);
            }
        });
        m75373A(m75381m(trayType));
        if (z && trayType == LiveGiftTraysPresenter.TrayType.top) {
            m75372z(giftTrayData);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m75375C() {
        this.f50977b.m77695e1();
        this.f50978c.m77695e1();
        bnl0.m105509E0(this.f50977b.f52796e, null);
        bnl0.m105509E0(this.f50978c.f52796e, null);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: E */
    public boolean m75376E(LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray intlLuckyGiftTray) {
        if (this.f50977b.m77688K0() && TextUtils.equals(this.f50977b.getPlayingComboId(), intlLuckyGiftTray.getComboId())) {
            this.f50977b.m77691X0(intlLuckyGiftTray);
            return true;
        }
        if (!this.f50978c.m77688K0() || !TextUtils.equals(this.f50978c.getPlayingComboId(), intlLuckyGiftTray.getComboId())) {
            return false;
        }
        this.f50978c.m77691X0(intlLuckyGiftTray);
        return true;
    }

    @Override // p153l.iam
    public void destroy() {
        m75375C();
    }

    @Override // android.view.View
    public Animation getAnimation() {
        return super.getAnimation();
    }

    /* JADX INFO: renamed from: i */
    public final void m75377i(View view) {
        ons.m168349a(this, view);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [l.oo2] */
    public void init() {
        this.f50977b.f52796e.setOnClickListener(new View.OnClickListener() { // from class: l.hms
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110663a.m75370q(view);
            }
        });
        this.f50978c.f52796e.setOnClickListener(new View.OnClickListener() { // from class: l.ims
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115830a.m75371s(view);
            }
        });
        LiveGiftTraysPresenter liveGiftTraysPresenter = this.f50979d;
        if (liveGiftTraysPresenter == null || !liveGiftTraysPresenter.m213810E2().m168498Z0()) {
            return;
        }
        this.f50977b.setComboPlayCallBack(new y20() { // from class: l.jms
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121708a.m75384u((BLiveIntlFlyMicEffectConfig) obj);
            }
        });
        this.f50978c.setComboPlayCallBack(new y20() { // from class: l.kms
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127532a.m75385v((BLiveIntlFlyMicEffectConfig) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public boolean m75378j(GiftTrayData giftTrayData) {
        if (giftTrayData.m75354x()) {
            return false;
        }
        if (giftTrayData.f50956n.equals(this.f50977b.getPlayingComboId())) {
            this.f50977b.m77685D0(giftTrayData);
            return true;
        }
        if (!giftTrayData.f50956n.equals(this.f50978c.getPlayingComboId())) {
            return false;
        }
        this.f50978c.m77685D0(giftTrayData);
        return true;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(LiveGiftTraysPresenter liveGiftTraysPresenter) {
        this.f50979d = liveGiftTraysPresenter;
    }

    /* JADX INFO: renamed from: l */
    public void m75380l(@NonNull String str) {
        if (!TextUtils.isEmpty(str) && this.f50977b.m77687J0(str)) {
            this.f50977b.m77690U0();
        }
    }

    /* JADX INFO: renamed from: m */
    public LiveGiftTrayView m75381m(LiveGiftTraysPresenter.TrayType trayType) {
        return trayType == LiveGiftTraysPresenter.TrayType.top ? this.f50977b : this.f50978c;
    }

    /* JADX INFO: renamed from: n */
    public boolean m75382n(GiftTrayData giftTrayData) {
        GiftTrayData.GiftPriority playingGiftPriority;
        GiftTrayData.GiftPriority giftPriorityM75345i = giftTrayData.m75345i();
        if (giftPriorityM75345i == GiftTrayData.GiftPriority.ownLuxury) {
            GiftTrayData.GiftPriority playingGiftPriority2 = this.f50977b.getPlayingGiftPriority();
            if (playingGiftPriority2 == null || !this.f50977b.m77688K0()) {
                return false;
            }
            if (playingGiftPriority2 != GiftTrayData.GiftPriority.otherLuxury && playingGiftPriority2 != GiftTrayData.GiftPriority.otherNormal && playingGiftPriority2 != GiftTrayData.GiftPriority.owmNormal) {
                return false;
            }
            this.f50977b.m77686I0();
            return true;
        }
        if (giftPriorityM75345i != GiftTrayData.GiftPriority.owmNormal) {
            if (giftPriorityM75345i != GiftTrayData.GiftPriority.otherLuxury || (playingGiftPriority = this.f50977b.getPlayingGiftPriority()) == null || !this.f50977b.m77688K0() || playingGiftPriority != GiftTrayData.GiftPriority.otherNormal) {
                return false;
            }
            this.f50977b.m77686I0();
            return false;
        }
        GiftTrayData.GiftPriority playingGiftPriority3 = this.f50978c.getPlayingGiftPriority();
        if (playingGiftPriority3 != null && this.f50978c.m77688K0() && playingGiftPriority3 == GiftTrayData.GiftPriority.otherNormal) {
            this.f50978c.m77686I0();
            return true;
        }
        GiftTrayData.GiftPriority playingGiftPriority4 = this.f50977b.getPlayingGiftPriority();
        if (playingGiftPriority4 == null || !this.f50977b.m77688K0() || playingGiftPriority4 != GiftTrayData.GiftPriority.otherNormal) {
            return false;
        }
        this.f50977b.m77686I0();
        return true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75377i(this);
    }

    /* JADX INFO: renamed from: p */
    public boolean m75383p(LiveGiftTraysPresenter.TrayType trayType) {
        if (trayType == LiveGiftTraysPresenter.TrayType.top) {
            return this.f50977b.m77688K0();
        }
        if (trayType == LiveGiftTraysPresenter.TrayType.bottom) {
            return this.f50978c.m77688K0();
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m75384u(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig) {
        this.f50979d.m213811F2().VoiceFlyEvent.playFlyMicAnim().mo199273j(bLiveIntlFlyMicEffectConfig);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m75385v(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig) {
        this.f50979d.m213811F2().VoiceFlyEvent.playFlyMicAnim().mo199273j(bLiveIntlFlyMicEffectConfig);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m75386w(GiftTrayData giftTrayData) {
        LiveGiftTraysPresenter liveGiftTraysPresenter = this.f50979d;
        if (liveGiftTraysPresenter != null) {
            liveGiftTraysPresenter.m75425t4(giftTrayData);
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m75387x(C12999e.b bVar) {
        LiveGiftTraysPresenter liveGiftTraysPresenter = this.f50979d;
        if (liveGiftTraysPresenter != null) {
            liveGiftTraysPresenter.m75424s4(bVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: y */
    public void m75388y(int i) {
        LiveGiftTraysPresenter liveGiftTraysPresenter = this.f50979d;
        if (liveGiftTraysPresenter != null && !liveGiftTraysPresenter.m213810E2().m168498Z0() && !this.f50979d.m213810E2().mo118373p()) {
            ViewGroup viewGroup = (ViewGroup) this.f50976a.getParent();
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = pae.f151269m - i;
                viewGroup.setLayoutParams(layoutParams);
                return;
            }
        }
        this.f50976a.setTranslationY(i);
    }

    public LiveGiftTrays(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGiftTrays(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
