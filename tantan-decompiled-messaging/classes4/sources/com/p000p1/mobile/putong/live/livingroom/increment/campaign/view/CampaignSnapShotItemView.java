package com.p000p1.mobile.putong.live.livingroom.increment.campaign.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignSnapShotItemView;
import com.p1.mobile.putong.live.base.data.BLiveCampaign;
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
import p002l.be4;
import p002l.vd4;
import p002l.yd4;
import v.VFrame;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010!\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/campaign/view/CampaignSnapShotItemView;", "Lv/VFrame;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveCampaign;", "campaign", "Ll/vd4;", "presenter", "u", "(Lcom/p1/mobile/putong/live/base/data/BLiveCampaign;Ll/vd4;)V", "Landroid/graphics/Bitmap;", "bitmap", "setBg", "(Landroid/graphics/Bitmap;)V", "Landroid/view/View;", "view", "s", "(Landroid/view/View;)V", "a", "Lcom/p1/mobile/putong/live/livingroom/increment/campaign/view/CampaignSnapShotItemView;", "get_container", "()Lcom/p1/mobile/putong/live/livingroom/increment/campaign/view/CampaignSnapShotItemView;", "set_container", "(Lcom/p1/mobile/putong/live/livingroom/increment/campaign/view/CampaignSnapShotItemView;)V", "_container", "Lv/VImage;", "b", "Lv/VImage;", "get_image", "()Lv/VImage;", "set_image", "(Lv/VImage;)V", "_image", "Ll/be4;", "c", "Lkotlin/Lazy;", "getViewHelper", "()Ll/be4;", "viewHelper", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        this.viewHelper = LazyKt__LazyJVMKt.a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.xd4
            public final Object invoke() {
                return CampaignSnapShotItemView.m6974p(this.f22236a);
            }
        });
    }

    private final be4 getViewHelper() {
        return (be4) this.viewHelper.getValue();
    }

    /* JADX INFO: renamed from: p */
    public static be4 m6974p(CampaignSnapShotItemView campaignSnapShotItemView) {
        return new be4(campaignSnapShotItemView.get_image());
    }

    @NotNull
    public final CampaignSnapShotItemView get_container() {
        CampaignSnapShotItemView campaignSnapShotItemView = this._container;
        if (campaignSnapShotItemView != null) {
            return campaignSnapShotItemView;
        }
        Intrinsics.r("_container");
        return null;
    }

    @NotNull
    public final VImage get_image() {
        VImage vImage = this._image;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_image");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6975s(this);
    }

    /* JADX INFO: renamed from: s */
    public final void m6975s(View view) {
        yd4.m26651a(this, view);
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
    public final void m6976u(@NotNull BLiveCampaign campaign, @NotNull vd4 presenter) {
        campaign.getClass();
        presenter.getClass();
        be4 viewHelper = getViewHelper();
        String strMo14489A0 = presenter.m25547E2().mo14489A0();
        strMo14489A0.getClass();
        viewHelper.m10316d(campaign, strMo14489A0);
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
