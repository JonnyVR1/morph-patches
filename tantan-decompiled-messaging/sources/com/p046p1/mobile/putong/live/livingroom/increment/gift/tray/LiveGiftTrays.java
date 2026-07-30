package com.p046p1.mobile.putong.live.livingroom.increment.gift.tray;

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
import com.p046p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlFlyMicEffectConfig;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.C12836e;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p046p1.mobile.putong.live.livingroom.view.LiveGiftTrayView;
import p149l.e30;
import p149l.l9e;
import p149l.nls;
import p149l.s7m;
import p149l.wrj;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGiftTrays extends LinearLayout implements s7m<LiveGiftTraysPresenter> {

    /* JADX INFO: renamed from: a */
    public LiveGiftTrays f50128a;

    /* JADX INFO: renamed from: b */
    public LiveGiftTrayView f50129b;

    /* JADX INFO: renamed from: c */
    public LiveGiftTrayView f50130c;

    /* JADX INFO: renamed from: d */
    public LiveGiftTraysPresenter f50131d;

    public LiveGiftTrays(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m74187q(View view) {
        this.f50131d.m74246y4(this.f50129b.getUserId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m74188s(View view) {
        this.f50131d.m74246y4(this.f50130c.getUserId());
    }

    /* JADX INFO: renamed from: z */
    private void m74189z(GiftTrayData giftTrayData) {
        wrj.m205201H(giftTrayData);
        if (giftTrayData.m74166s()) {
            this.f50131d.m74244v4(giftTrayData);
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m74190A(LiveGiftTrayView liveGiftTrayView) {
        liveGiftTrayView.m76509Y0();
    }

    /* JADX INFO: renamed from: B */
    public void m74191B(LiveGiftTraysPresenter.TrayType trayType, GiftTrayData giftTrayData, boolean z) {
        m74198m(trayType).m76511a1(giftTrayData, new e30() { // from class: l.kks
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123593a.m74203w((GiftTrayData) obj);
            }
        });
        m74198m(trayType).setRewardPlayAction(new e30() { // from class: l.lks
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128598a.m74204x((C12836e.b) obj);
            }
        });
        m74190A(m74198m(trayType));
        if (z && trayType == LiveGiftTraysPresenter.TrayType.top) {
            m74189z(giftTrayData);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m74192C() {
        this.f50129b.m76512e1();
        this.f50130c.m76512e1();
        xdl0.m208329E0(this.f50129b.f51948e, null);
        xdl0.m208329E0(this.f50130c.f51948e, null);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: E */
    public boolean m74193E(LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray intlLuckyGiftTray) {
        if (this.f50129b.m76505K0() && TextUtils.equals(this.f50129b.getPlayingComboId(), intlLuckyGiftTray.getComboId())) {
            this.f50129b.m76508X0(intlLuckyGiftTray);
            return true;
        }
        if (!this.f50130c.m76505K0() || !TextUtils.equals(this.f50130c.getPlayingComboId(), intlLuckyGiftTray.getComboId())) {
            return false;
        }
        this.f50130c.m76508X0(intlLuckyGiftTray);
        return true;
    }

    @Override // p149l.s7m
    public void destroy() {
        m74192C();
    }

    @Override // android.view.View
    public Animation getAnimation() {
        return super.getAnimation();
    }

    /* JADX INFO: renamed from: i */
    public final void m74194i(View view) {
        nls.m160075a(this, view);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2] */
    public void init() {
        this.f50129b.f51948e.setOnClickListener(new View.OnClickListener() { // from class: l.gks
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103226a.m74187q(view);
            }
        });
        this.f50130c.f51948e.setOnClickListener(new View.OnClickListener() { // from class: l.hks
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108265a.m74188s(view);
            }
        });
        LiveGiftTraysPresenter liveGiftTraysPresenter = this.f50131d;
        if (liveGiftTraysPresenter == null || !liveGiftTraysPresenter.m206027E2().m132112Z0()) {
            return;
        }
        this.f50129b.setComboPlayCallBack(new e30() { // from class: l.iks
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113723a.m74201u((BLiveIntlFlyMicEffectConfig) obj);
            }
        });
        this.f50130c.setComboPlayCallBack(new e30() { // from class: l.jks
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118409a.m74202v((BLiveIntlFlyMicEffectConfig) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public boolean m74195j(GiftTrayData giftTrayData) {
        if (giftTrayData.m74171x()) {
            return false;
        }
        if (giftTrayData.f50108n.equals(this.f50129b.getPlayingComboId())) {
            this.f50129b.m76502D0(giftTrayData);
            return true;
        }
        if (!giftTrayData.f50108n.equals(this.f50130c.getPlayingComboId())) {
            return false;
        }
        this.f50130c.m76502D0(giftTrayData);
        return true;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(LiveGiftTraysPresenter liveGiftTraysPresenter) {
        this.f50131d = liveGiftTraysPresenter;
    }

    /* JADX INFO: renamed from: l */
    public void m74197l(@NonNull String str) {
        if (!TextUtils.isEmpty(str) && this.f50129b.m76504J0(str)) {
            this.f50129b.m76507U0();
        }
    }

    /* JADX INFO: renamed from: m */
    public LiveGiftTrayView m74198m(LiveGiftTraysPresenter.TrayType trayType) {
        return trayType == LiveGiftTraysPresenter.TrayType.top ? this.f50129b : this.f50130c;
    }

    /* JADX INFO: renamed from: n */
    public boolean m74199n(GiftTrayData giftTrayData) {
        GiftTrayData.GiftPriority playingGiftPriority;
        GiftTrayData.GiftPriority giftPriorityM74162i = giftTrayData.m74162i();
        if (giftPriorityM74162i == GiftTrayData.GiftPriority.ownLuxury) {
            GiftTrayData.GiftPriority playingGiftPriority2 = this.f50129b.getPlayingGiftPriority();
            if (playingGiftPriority2 == null || !this.f50129b.m76505K0()) {
                return false;
            }
            if (playingGiftPriority2 != GiftTrayData.GiftPriority.otherLuxury && playingGiftPriority2 != GiftTrayData.GiftPriority.otherNormal && playingGiftPriority2 != GiftTrayData.GiftPriority.owmNormal) {
                return false;
            }
            this.f50129b.m76503I0();
            return true;
        }
        if (giftPriorityM74162i != GiftTrayData.GiftPriority.owmNormal) {
            if (giftPriorityM74162i != GiftTrayData.GiftPriority.otherLuxury || (playingGiftPriority = this.f50129b.getPlayingGiftPriority()) == null || !this.f50129b.m76505K0() || playingGiftPriority != GiftTrayData.GiftPriority.otherNormal) {
                return false;
            }
            this.f50129b.m76503I0();
            return false;
        }
        GiftTrayData.GiftPriority playingGiftPriority3 = this.f50130c.getPlayingGiftPriority();
        if (playingGiftPriority3 != null && this.f50130c.m76505K0() && playingGiftPriority3 == GiftTrayData.GiftPriority.otherNormal) {
            this.f50130c.m76503I0();
            return true;
        }
        GiftTrayData.GiftPriority playingGiftPriority4 = this.f50129b.getPlayingGiftPriority();
        if (playingGiftPriority4 == null || !this.f50129b.m76505K0() || playingGiftPriority4 != GiftTrayData.GiftPriority.otherNormal) {
            return false;
        }
        this.f50129b.m76503I0();
        return true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74194i(this);
    }

    /* JADX INFO: renamed from: p */
    public boolean m74200p(LiveGiftTraysPresenter.TrayType trayType) {
        if (trayType == LiveGiftTraysPresenter.TrayType.top) {
            return this.f50129b.m76505K0();
        }
        if (trayType == LiveGiftTraysPresenter.TrayType.bottom) {
            return this.f50130c.m76505K0();
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m74201u(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig) {
        this.f50131d.m206028F2().VoiceFlyEvent.playFlyMicAnim().mo172463j(bLiveIntlFlyMicEffectConfig);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m74202v(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig) {
        this.f50131d.m206028F2().VoiceFlyEvent.playFlyMicAnim().mo172463j(bLiveIntlFlyMicEffectConfig);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m74203w(GiftTrayData giftTrayData) {
        LiveGiftTraysPresenter liveGiftTraysPresenter = this.f50131d;
        if (liveGiftTraysPresenter != null) {
            liveGiftTraysPresenter.m74242t4(giftTrayData);
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m74204x(C12836e.b bVar) {
        LiveGiftTraysPresenter liveGiftTraysPresenter = this.f50131d;
        if (liveGiftTraysPresenter != null) {
            liveGiftTraysPresenter.m74241s4(bVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: y */
    public void m74205y(int i) {
        LiveGiftTraysPresenter liveGiftTraysPresenter = this.f50131d;
        if (liveGiftTraysPresenter != null && !liveGiftTraysPresenter.m206027E2().m132112Z0() && !this.f50131d.m206027E2().mo97490p()) {
            ViewGroup viewGroup = (ViewGroup) this.f50128a.getParent();
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = l9e.f127089m - i;
                viewGroup.setLayoutParams(layoutParams);
                return;
            }
        }
        this.f50128a.setTranslationY(i);
    }

    public LiveGiftTrays(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGiftTrays(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
