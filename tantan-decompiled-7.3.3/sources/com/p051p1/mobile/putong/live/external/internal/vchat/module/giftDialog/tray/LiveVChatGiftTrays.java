package com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.tray;

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
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftTrayView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter;
import p153l.bnl0;
import p153l.iam;
import p153l.jnu;
import p153l.nns;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatGiftTrays extends LinearLayout implements iam<nns> {

    /* JADX INFO: renamed from: a */
    public LiveVChatGiftTrays f45992a;

    /* JADX INFO: renamed from: b */
    public LiveVChatGiftTrayView f45993b;

    /* JADX INFO: renamed from: c */
    public LiveVChatGiftTrayView f45994c;

    /* JADX INFO: renamed from: d */
    public nns f45995d;

    public LiveVChatGiftTrays(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: m */
    private void m70532m(GiftTrayData giftTrayData) {
        if (giftTrayData.m75349s()) {
            this.f45995d.m163972B3(giftTrayData);
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: b */
    public final void m70533b(View view) {
        jnu.m146287a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public boolean m70534c(GiftTrayData giftTrayData) {
        if (giftTrayData.m75354x()) {
            return false;
        }
        if (giftTrayData.f50956n.equals(this.f45993b.getPlayingComboId())) {
            this.f45993b.m70737y0(giftTrayData);
            return true;
        }
        if (!giftTrayData.f50956n.equals(this.f45994c.getPlayingComboId())) {
            return false;
        }
        this.f45994c.m70737y0(giftTrayData);
        return true;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(nns nnsVar) {
        this.f45995d = nnsVar;
    }

    @Override // p153l.iam
    public void destroy() {
        m70544q();
    }

    /* JADX INFO: renamed from: e */
    public void m70536e(@NonNull String str) {
        if (!TextUtils.isEmpty(str) && this.f45993b.m70721G0(str)) {
            this.f45993b.m70730Q0();
        }
    }

    /* JADX INFO: renamed from: f */
    public LiveVChatGiftTrayView m70537f(LiveGiftTraysPresenter.TrayType trayType) {
        return trayType == LiveGiftTraysPresenter.TrayType.top ? this.f45993b : this.f45994c;
    }

    @Override // android.view.View
    public Animation getAnimation() {
        return super.getAnimation();
    }

    /* JADX INFO: renamed from: i */
    public boolean m70538i(GiftTrayData giftTrayData) {
        GiftTrayData.GiftPriority playingGiftPriority;
        GiftTrayData.GiftPriority giftPriorityM75345i = giftTrayData.m75345i();
        if (giftPriorityM75345i == GiftTrayData.GiftPriority.ownLuxury) {
            GiftTrayData.GiftPriority playingGiftPriority2 = this.f45993b.getPlayingGiftPriority();
            if (playingGiftPriority2 == null || !this.f45993b.m70722H0()) {
                return false;
            }
            if (playingGiftPriority2 != GiftTrayData.GiftPriority.otherLuxury && playingGiftPriority2 != GiftTrayData.GiftPriority.otherNormal && playingGiftPriority2 != GiftTrayData.GiftPriority.owmNormal) {
                return false;
            }
            this.f45993b.m70720E0();
            return true;
        }
        if (giftPriorityM75345i != GiftTrayData.GiftPriority.owmNormal) {
            if (giftPriorityM75345i != GiftTrayData.GiftPriority.otherLuxury || (playingGiftPriority = this.f45993b.getPlayingGiftPriority()) == null || !this.f45993b.m70722H0() || playingGiftPriority != GiftTrayData.GiftPriority.otherNormal) {
                return false;
            }
            this.f45993b.m70720E0();
            return false;
        }
        GiftTrayData.GiftPriority playingGiftPriority3 = this.f45994c.getPlayingGiftPriority();
        if (playingGiftPriority3 != null && this.f45994c.m70722H0() && playingGiftPriority3 == GiftTrayData.GiftPriority.otherNormal) {
            this.f45994c.m70720E0();
            return true;
        }
        GiftTrayData.GiftPriority playingGiftPriority4 = this.f45993b.getPlayingGiftPriority();
        if (playingGiftPriority4 == null || !this.f45993b.m70722H0() || playingGiftPriority4 != GiftTrayData.GiftPriority.otherNormal) {
            return false;
        }
        this.f45993b.m70720E0();
        return true;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m70539j(LiveGiftTraysPresenter.TrayType trayType) {
        if (trayType == LiveGiftTraysPresenter.TrayType.top) {
            return this.f45993b.m70722H0();
        }
        if (trayType == LiveGiftTraysPresenter.TrayType.bottom) {
            return this.f45994c.m70722H0();
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m70540k(GiftTrayData giftTrayData) {
        nns nnsVar = this.f45995d;
        if (nnsVar != null) {
            nnsVar.m163994y3(giftTrayData);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m70541l(int i) {
        this.f45992a.setTranslationY(i);
    }

    /* JADX INFO: renamed from: n */
    public final void m70542n(LiveVChatGiftTrayView liveVChatGiftTrayView) {
        liveVChatGiftTrayView.m70732S0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70533b(this);
    }

    /* JADX INFO: renamed from: p */
    public void m70543p(LiveGiftTraysPresenter.TrayType trayType, GiftTrayData giftTrayData, boolean z) {
        m70537f(trayType).m70734U0(giftTrayData, new y20() { // from class: l.inu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116001a.m70540k((GiftTrayData) obj);
            }
        });
        m70542n(m70537f(trayType));
        if (z && trayType == LiveGiftTraysPresenter.TrayType.top) {
            m70532m(giftTrayData);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m70544q() {
        this.f45993b.m70735X0();
        this.f45994c.m70735X0();
        bnl0.m105509E0(this.f45993b.f46082e, null);
        bnl0.m105509E0(this.f45994c.f46082e, null);
    }

    public LiveVChatGiftTrays(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatGiftTrays(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
