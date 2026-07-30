package com.p051p1.mobile.putong.live.base.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.momo.xeengine.gift.GiftEntity;
import com.momo.xeengine.gift.GiftPlayer;
import com.momo.xeengine.gift.GiftPlayerListener;
import com.momo.xeengine.gift.GiftPlayerType;
import com.momo.xeengine.gift.GiftView;
import com.p051p1.mobile.putong.live.base.data.BLiveDynamicEffectExtend;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.jyb;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class XEGiftView extends GiftView {

    /* JADX INFO: renamed from: a */
    public GiftPlayer f45673a;

    /* JADX INFO: renamed from: b */
    public String f45674b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.view.XEGiftView$a */
    public class C12647a implements GiftPlayerListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftPlayerListener f45675a;

        public C12647a(GiftPlayerListener giftPlayerListener) {
            this.f45675a = giftPlayerListener;
        }

        @Override // com.momo.xeengine.gift.GiftPlayerListener
        public void onGiftPlayCanceled(@NotNull GiftPlayer giftPlayer, @NotNull GiftEntity giftEntity) {
            XEGiftView.this.f45674b = null;
            this.f45675a.onGiftPlayCanceled(giftPlayer, giftEntity);
        }

        @Override // com.momo.xeengine.gift.GiftPlayerListener
        public void onGiftPlayFailed(@NotNull GiftPlayer giftPlayer, @NotNull GiftEntity giftEntity, int i, @NotNull String str) {
            XEGiftView.this.f45674b = null;
            this.f45675a.onGiftPlayFailed(giftPlayer, giftEntity, i, str);
        }

        @Override // com.momo.xeengine.gift.GiftPlayerListener
        public void onGiftPlayFinished(@NotNull GiftPlayer giftPlayer, @NotNull GiftEntity giftEntity, @Nullable String str) {
            XEGiftView.this.f45674b = null;
            this.f45675a.onGiftPlayFinished(giftPlayer, giftEntity, str);
        }

        @Override // com.momo.xeengine.gift.GiftPlayerListener
        public void onGiftPrepared(@NotNull GiftPlayer giftPlayer, @NotNull GiftEntity giftEntity) {
            this.f45675a.onGiftPrepared(giftPlayer, giftEntity);
        }
    }

    public XEGiftView(Context context) {
        super(context);
        m70022e();
    }

    /* JADX INFO: renamed from: e */
    public final void m70022e() {
        if (this.f45673a == null) {
            GiftPlayer giftPlayer = new GiftPlayer(this);
            this.f45673a = giftPlayer;
            giftPlayer.setLogEnable(true);
            this.f45673a.setPlayerType(GiftPlayerType.Auto);
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m70023f() {
        GiftPlayer giftPlayer = this.f45673a;
        if (giftPlayer != null) {
            return giftPlayer.isPlaying();
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public boolean m70024g(String str) {
        return TextUtils.equals(this.f45674b, str) && m70023f();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m70025h(BLiveDynamicEffectExtend bLiveDynamicEffectExtend) {
        this.f45673a.updateExtendValues(bLiveDynamicEffectExtend.key, bLiveDynamicEffectExtend.value);
    }

    /* JADX INFO: renamed from: i */
    public void m70026i(GiftEntity giftEntity) {
        m70022e();
        this.f45674b = giftEntity.getPath();
        this.f45673a.play(giftEntity);
    }

    /* JADX INFO: renamed from: j */
    public void m70027j() {
        GiftPlayer giftPlayer = this.f45673a;
        if (giftPlayer != null) {
            giftPlayer.stop();
        }
        this.f45674b = null;
    }

    /* JADX INFO: renamed from: k */
    public void m70028k(List<BLiveDynamicEffectExtend> list) {
        if (this.f45673a != null) {
            jyb.m147537z(list, new y20() { // from class: l.olq0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f147863a.m70025h((BLiveDynamicEffectExtend) obj);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70022e();
    }

    public void setListener(GiftPlayerListener giftPlayerListener) {
        m70022e();
        this.f45673a.setListener(new C12647a(giftPlayerListener));
    }

    public XEGiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m70022e();
    }

    public XEGiftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m70022e();
    }
}
