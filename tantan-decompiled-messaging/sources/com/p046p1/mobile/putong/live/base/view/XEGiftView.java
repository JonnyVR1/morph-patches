package com.p046p1.mobile.putong.live.base.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.momo.xeengine.gift.GiftEntity;
import com.momo.xeengine.gift.GiftPlayer;
import com.momo.xeengine.gift.GiftPlayerListener;
import com.momo.xeengine.gift.GiftPlayerType;
import com.momo.xeengine.gift.GiftView;
import com.p046p1.mobile.putong.live.base.data.BLiveDynamicEffectExtend;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.e30;
import p149l.vwb;

/* JADX INFO: loaded from: classes13.dex */
public class XEGiftView extends GiftView {

    /* JADX INFO: renamed from: a */
    public GiftPlayer f44825a;

    /* JADX INFO: renamed from: b */
    public String f44826b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.view.XEGiftView$a */
    public class C12484a implements GiftPlayerListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftPlayerListener f44827a;

        public C12484a(GiftPlayerListener giftPlayerListener) {
            this.f44827a = giftPlayerListener;
        }

        @Override // com.momo.xeengine.gift.GiftPlayerListener
        public void onGiftPlayCanceled(@NotNull GiftPlayer giftPlayer, @NotNull GiftEntity giftEntity) {
            XEGiftView.this.f44826b = null;
            this.f44827a.onGiftPlayCanceled(giftPlayer, giftEntity);
        }

        @Override // com.momo.xeengine.gift.GiftPlayerListener
        public void onGiftPlayFailed(@NotNull GiftPlayer giftPlayer, @NotNull GiftEntity giftEntity, int i, @NotNull String str) {
            XEGiftView.this.f44826b = null;
            this.f44827a.onGiftPlayFailed(giftPlayer, giftEntity, i, str);
        }

        @Override // com.momo.xeengine.gift.GiftPlayerListener
        public void onGiftPlayFinished(@NotNull GiftPlayer giftPlayer, @NotNull GiftEntity giftEntity, @Nullable String str) {
            XEGiftView.this.f44826b = null;
            this.f44827a.onGiftPlayFinished(giftPlayer, giftEntity, str);
        }

        @Override // com.momo.xeengine.gift.GiftPlayerListener
        public void onGiftPrepared(@NotNull GiftPlayer giftPlayer, @NotNull GiftEntity giftEntity) {
            this.f44827a.onGiftPrepared(giftPlayer, giftEntity);
        }
    }

    public XEGiftView(Context context) {
        super(context);
        m68839e();
    }

    /* JADX INFO: renamed from: e */
    public final void m68839e() {
        if (this.f44825a == null) {
            GiftPlayer giftPlayer = new GiftPlayer(this);
            this.f44825a = giftPlayer;
            giftPlayer.setLogEnable(true);
            this.f44825a.setPlayerType(GiftPlayerType.Auto);
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m68840f() {
        GiftPlayer giftPlayer = this.f44825a;
        if (giftPlayer != null) {
            return giftPlayer.isPlaying();
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public boolean m68841g(String str) {
        return TextUtils.equals(this.f44826b, str) && m68840f();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m68842h(BLiveDynamicEffectExtend bLiveDynamicEffectExtend) {
        this.f44825a.updateExtendValues(bLiveDynamicEffectExtend.key, bLiveDynamicEffectExtend.value);
    }

    /* JADX INFO: renamed from: i */
    public void m68843i(GiftEntity giftEntity) {
        m68839e();
        this.f44826b = giftEntity.getPath();
        this.f44825a.play(giftEntity);
    }

    /* JADX INFO: renamed from: j */
    public void m68844j() {
        GiftPlayer giftPlayer = this.f44825a;
        if (giftPlayer != null) {
            giftPlayer.stop();
        }
        this.f44826b = null;
    }

    /* JADX INFO: renamed from: k */
    public void m68845k(List<BLiveDynamicEffectExtend> list) {
        if (this.f44825a != null) {
            vwb.m200354z(list, new e30() { // from class: l.jcq0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f117342a.m68842h((BLiveDynamicEffectExtend) obj);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m68839e();
    }

    public void setListener(GiftPlayerListener giftPlayerListener) {
        m68839e();
        this.f44825a.setListener(new C12484a(giftPlayerListener));
    }

    public XEGiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m68839e();
    }

    public XEGiftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m68839e();
    }
}
