package com.p051p1.mobile.putong.live.external.internal.vchat.module.campaign.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.campaign.view.LiveVChatCampaignSnapShotItemView;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VFrame;
import p151v.VImage;
import p153l.bf4;
import p153l.niu;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001f\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, m88121d2 = {"Lcom/p1/mobile/putong/live/external/internal/vchat/module/campaign/view/LiveVChatCampaignSnapShotItemView;", "Lv/VFrame;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveCampaign;", "campaign", "u", "(Lcom/p1/mobile/putong/live/base/data/BLiveCampaign;)V", "Landroid/graphics/Bitmap;", "bitmap", "setBg", "(Landroid/graphics/Bitmap;)V", "Landroid/view/View;", OMSTemplateModeType.view, BLiveStormDanmakuGiftResourceType.f45294s, "(Landroid/view/View;)V", "a", "Lcom/p1/mobile/putong/live/external/internal/vchat/module/campaign/view/LiveVChatCampaignSnapShotItemView;", "get_container", "()Lcom/p1/mobile/putong/live/external/internal/vchat/module/campaign/view/LiveVChatCampaignSnapShotItemView;", "set_container", "(Lcom/p1/mobile/putong/live/external/internal/vchat/module/campaign/view/LiveVChatCampaignSnapShotItemView;)V", "_container", "Lv/VImage;", "b", "Lv/VImage;", "get_image", "()Lv/VImage;", "set_image", "(Lv/VImage;)V", "_image", "Ll/bf4;", "c", "Lkotlin/Lazy;", "getViewHelper", "()Ll/bf4;", "viewHelper", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class LiveVChatCampaignSnapShotItemView extends VFrame {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public LiveVChatCampaignSnapShotItemView _container;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VImage _image;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveVChatCampaignSnapShotItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.viewHelper = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.miu
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveVChatCampaignSnapShotItemView.m70528p(this.f137020a);
            }
        });
    }

    private final bf4 getViewHelper() {
        return (bf4) this.viewHelper.getValue();
    }

    /* JADX INFO: renamed from: p */
    public static bf4 m70528p(LiveVChatCampaignSnapShotItemView liveVChatCampaignSnapShotItemView) {
        return new bf4(liveVChatCampaignSnapShotItemView.get_image());
    }

    @NotNull
    public final LiveVChatCampaignSnapShotItemView get_container() {
        LiveVChatCampaignSnapShotItemView liveVChatCampaignSnapShotItemView = this._container;
        if (liveVChatCampaignSnapShotItemView != null) {
            return liveVChatCampaignSnapShotItemView;
        }
        Intrinsics.m88391r("_container");
        return null;
    }

    @NotNull
    public final VImage get_image() {
        VImage vImage = this._image;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_image");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70529s(this);
    }

    /* JADX INFO: renamed from: s */
    public final void m70529s(View view) {
        niu.m163310a(this, view);
    }

    public final void setBg(@NotNull Bitmap bitmap) {
        bitmap.getClass();
        get_image().setImageBitmap(bitmap);
    }

    public final void set_container(@NotNull LiveVChatCampaignSnapShotItemView liveVChatCampaignSnapShotItemView) {
        liveVChatCampaignSnapShotItemView.getClass();
        this._container = liveVChatCampaignSnapShotItemView;
    }

    public final void set_image(@NotNull VImage vImage) {
        vImage.getClass();
        this._image = vImage;
    }

    /* JADX INFO: renamed from: u */
    public final void m70530u(@NotNull BLiveCampaign campaign) {
        campaign.getClass();
        getViewHelper().m103873b(campaign);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveVChatCampaignSnapShotItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveVChatCampaignSnapShotItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ LiveVChatCampaignSnapShotItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
