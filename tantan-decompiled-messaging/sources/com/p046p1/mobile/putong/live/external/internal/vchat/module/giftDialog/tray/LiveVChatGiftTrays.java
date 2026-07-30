package com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.tray;

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
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftTrayView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter;
import p149l.e30;
import p149l.ilu;
import p149l.mls;
import p149l.s7m;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatGiftTrays extends LinearLayout implements s7m<mls> {

    /* JADX INFO: renamed from: a */
    public LiveVChatGiftTrays f45144a;

    /* JADX INFO: renamed from: b */
    public LiveVChatGiftTrayView f45145b;

    /* JADX INFO: renamed from: c */
    public LiveVChatGiftTrayView f45146c;

    /* JADX INFO: renamed from: d */
    public mls f45147d;

    public LiveVChatGiftTrays(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: m */
    private void m69349m(GiftTrayData giftTrayData) {
        if (giftTrayData.m74166s()) {
            this.f45147d.m155258B3(giftTrayData);
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: b */
    public final void m69350b(View view) {
        ilu.m137054a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public boolean m69351c(GiftTrayData giftTrayData) {
        if (giftTrayData.m74171x()) {
            return false;
        }
        if (giftTrayData.f50108n.equals(this.f45145b.getPlayingComboId())) {
            this.f45145b.m69554y0(giftTrayData);
            return true;
        }
        if (!giftTrayData.f50108n.equals(this.f45146c.getPlayingComboId())) {
            return false;
        }
        this.f45146c.m69554y0(giftTrayData);
        return true;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(mls mlsVar) {
        this.f45147d = mlsVar;
    }

    @Override // p149l.s7m
    public void destroy() {
        m69361q();
    }

    /* JADX INFO: renamed from: e */
    public void m69353e(@NonNull String str) {
        if (!TextUtils.isEmpty(str) && this.f45145b.m69538G0(str)) {
            this.f45145b.m69547Q0();
        }
    }

    /* JADX INFO: renamed from: f */
    public LiveVChatGiftTrayView m69354f(LiveGiftTraysPresenter.TrayType trayType) {
        return trayType == LiveGiftTraysPresenter.TrayType.top ? this.f45145b : this.f45146c;
    }

    @Override // android.view.View
    public Animation getAnimation() {
        return super.getAnimation();
    }

    /* JADX INFO: renamed from: i */
    public boolean m69355i(GiftTrayData giftTrayData) {
        GiftTrayData.GiftPriority playingGiftPriority;
        GiftTrayData.GiftPriority giftPriorityM74162i = giftTrayData.m74162i();
        if (giftPriorityM74162i == GiftTrayData.GiftPriority.ownLuxury) {
            GiftTrayData.GiftPriority playingGiftPriority2 = this.f45145b.getPlayingGiftPriority();
            if (playingGiftPriority2 == null || !this.f45145b.m69539H0()) {
                return false;
            }
            if (playingGiftPriority2 != GiftTrayData.GiftPriority.otherLuxury && playingGiftPriority2 != GiftTrayData.GiftPriority.otherNormal && playingGiftPriority2 != GiftTrayData.GiftPriority.owmNormal) {
                return false;
            }
            this.f45145b.m69537E0();
            return true;
        }
        if (giftPriorityM74162i != GiftTrayData.GiftPriority.owmNormal) {
            if (giftPriorityM74162i != GiftTrayData.GiftPriority.otherLuxury || (playingGiftPriority = this.f45145b.getPlayingGiftPriority()) == null || !this.f45145b.m69539H0() || playingGiftPriority != GiftTrayData.GiftPriority.otherNormal) {
                return false;
            }
            this.f45145b.m69537E0();
            return false;
        }
        GiftTrayData.GiftPriority playingGiftPriority3 = this.f45146c.getPlayingGiftPriority();
        if (playingGiftPriority3 != null && this.f45146c.m69539H0() && playingGiftPriority3 == GiftTrayData.GiftPriority.otherNormal) {
            this.f45146c.m69537E0();
            return true;
        }
        GiftTrayData.GiftPriority playingGiftPriority4 = this.f45145b.getPlayingGiftPriority();
        if (playingGiftPriority4 == null || !this.f45145b.m69539H0() || playingGiftPriority4 != GiftTrayData.GiftPriority.otherNormal) {
            return false;
        }
        this.f45145b.m69537E0();
        return true;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m69356j(LiveGiftTraysPresenter.TrayType trayType) {
        if (trayType == LiveGiftTraysPresenter.TrayType.top) {
            return this.f45145b.m69539H0();
        }
        if (trayType == LiveGiftTraysPresenter.TrayType.bottom) {
            return this.f45146c.m69539H0();
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m69357k(GiftTrayData giftTrayData) {
        mls mlsVar = this.f45147d;
        if (mlsVar != null) {
            mlsVar.m155280y3(giftTrayData);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m69358l(int i) {
        this.f45144a.setTranslationY(i);
    }

    /* JADX INFO: renamed from: n */
    public final void m69359n(LiveVChatGiftTrayView liveVChatGiftTrayView) {
        liveVChatGiftTrayView.m69549S0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69350b(this);
    }

    /* JADX INFO: renamed from: p */
    public void m69360p(LiveGiftTraysPresenter.TrayType trayType, GiftTrayData giftTrayData, boolean z) {
        m69354f(trayType).m69551U0(giftTrayData, new e30() { // from class: l.hlu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108375a.m69357k((GiftTrayData) obj);
            }
        });
        m69359n(m69354f(trayType));
        if (z && trayType == LiveGiftTraysPresenter.TrayType.top) {
            m69349m(giftTrayData);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m69361q() {
        this.f45145b.m69552X0();
        this.f45146c.m69552X0();
        xdl0.m208329E0(this.f45145b.f45234e, null);
        xdl0.m208329E0(this.f45146c.f45234e, null);
    }

    public LiveVChatGiftTrays(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatGiftTrays(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
