package com.p046p1.mobile.putong.live.livingroom.increment.campaign.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignSnapShotItemView;
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
import p147v.VFrame;
import p147v.VImage;
import p149l.be4;
import p149l.vd4;
import p149l.yd4;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010!\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/campaign/view/CampaignSnapShotItemView;", "Lv/VFrame;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveCampaign;", "campaign", "Ll/vd4;", "presenter", "u", "(Lcom/p1/mobile/putong/live/base/data/BLiveCampaign;Ll/vd4;)V", "Landroid/graphics/Bitmap;", "bitmap", "setBg", "(Landroid/graphics/Bitmap;)V", "Landroid/view/View;", OMSTemplateModeType.view, BLiveStormDanmakuGiftResourceType.f44446s, "(Landroid/view/View;)V", "a", "Lcom/p1/mobile/putong/live/livingroom/increment/campaign/view/CampaignSnapShotItemView;", "get_container", "()Lcom/p1/mobile/putong/live/livingroom/increment/campaign/view/CampaignSnapShotItemView;", "set_container", "(Lcom/p1/mobile/putong/live/livingroom/increment/campaign/view/CampaignSnapShotItemView;)V", "_container", "Lv/VImage;", "b", "Lv/VImage;", "get_image", "()Lv/VImage;", "set_image", "(Lv/VImage;)V", "_image", "Ll/be4;", "c", "Lkotlin/Lazy;", "getViewHelper", "()Ll/be4;", "viewHelper", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public class CampaignSnapShotItemView extends VFrame {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public CampaignSnapShotItemView _container;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VImage _image;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CampaignSnapShotItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.viewHelper = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.xd4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CampaignSnapShotItemView.m73432p(this.f192293a);
            }
        });
    }

    private final be4 getViewHelper() {
        return (be4) this.viewHelper.getValue();
    }

    /* JADX INFO: renamed from: p */
    public static be4 m73432p(CampaignSnapShotItemView campaignSnapShotItemView) {
        return new be4(campaignSnapShotItemView.get_image());
    }

    @NotNull
    public final CampaignSnapShotItemView get_container() {
        CampaignSnapShotItemView campaignSnapShotItemView = this._container;
        if (campaignSnapShotItemView != null) {
            return campaignSnapShotItemView;
        }
        Intrinsics.m87502r("_container");
        return null;
    }

    @NotNull
    public final VImage get_image() {
        VImage vImage = this._image;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_image");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73433s(this);
    }

    /* JADX INFO: renamed from: s */
    public final void m73433s(View view) {
        yd4.m214213a(this, view);
    }

    public final void setBg(@NotNull Bitmap bitmap) {
        bitmap.getClass();
        get_image().setImageBitmap(bitmap);
    }

    public final void set_container(@NotNull CampaignSnapShotItemView campaignSnapShotItemView) {
        campaignSnapShotItemView.getClass();
        this._container = campaignSnapShotItemView;
    }

    public final void set_image(@NotNull VImage vImage) {
        vImage.getClass();
        this._image = vImage;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: u */
    public final void m73434u(@NotNull BLiveCampaign campaign, @NotNull vd4 presenter) {
        campaign.getClass();
        presenter.getClass();
        be4 viewHelper = getViewHelper();
        String strMo132054A0 = presenter.m206027E2().mo132054A0();
        strMo132054A0.getClass();
        viewHelper.m101319d(campaign, strMo132054A0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CampaignSnapShotItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CampaignSnapShotItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ CampaignSnapShotItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
