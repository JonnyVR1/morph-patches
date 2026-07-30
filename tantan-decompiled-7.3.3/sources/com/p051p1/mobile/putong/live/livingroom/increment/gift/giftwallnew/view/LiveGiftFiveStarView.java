package com.p051p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bnl0;
import p153l.ijs;
import p153l.jyb;
import p153l.n3d0;
import p153l.obc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\"\u0010(\u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR\"\u0010,\u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR\"\u00100\u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010\u001b\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001fR\"\u00107\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u0010<\u001a\n 9*\u0004\u0018\u000108088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010>\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010;R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR&\u0010G\u001a\u0012\u0012\u0004\u0012\u00020\u00190Cj\b\u0012\u0004\u0012\u00020\u0019`D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/gift/giftwallnew/view/LiveGiftFiveStarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "starCount", "j0", "(I)V", "k0", "onDetachedFromWindow", "Landroid/view/View;", OMSTemplateModeType.view, "h0", "(Landroid/view/View;)V", RXScreenCaptureService.KEY_INDEX, "i0", "(I)Landroid/view/View;", "Landroid/widget/ImageView;", Constants.INAPP_DATA_TAG, "Landroid/widget/ImageView;", "get_star_1", "()Landroid/widget/ImageView;", "set_star_1", "(Landroid/widget/ImageView;)V", "_star_1", "e", "get_star_2", "set_star_2", "_star_2", "f", "get_star_3", "set_star_3", "_star_3", "g", "get_star_4", "set_star_4", "_star_4", "h", "get_star_5", "set_star_5", "_star_5", "Lcom/tantan/library/svga/SVGAnimationView;", "Lcom/tantan/library/svga/SVGAnimationView;", "get_five_star_svga", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_five_star_svga", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_five_star_svga", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "j", "Landroid/graphics/drawable/Drawable;", "selectRes", "k", "unSelectRes", "", BLiveStormDanmakuGiftResourceType.f45292l, "Ljava/lang/String;", "fiveStarSvga", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "m", "Ljava/util/ArrayList;", "starList", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class LiveGiftFiveStarView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ImageView _star_1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public ImageView _star_2;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public ImageView _star_3;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public ImageView _star_4;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public ImageView _star_5;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public SVGAnimationView _five_star_svga;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public Drawable selectRes;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public Drawable unSelectRes;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public String fiveStarSvga;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public ArrayList<ImageView> starList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveGiftFiveStarView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.selectRes = n3d0.m161278b(obc0.f146496t2);
        this.fiveStarSvga = "https://fe-static.tancdn.com/v1/raw/0b380f38-5985-421f-8da0-40cb706c571c12.svga";
        ArrayList<ImageView> arrayListM147507f0 = jyb.m147507f0(new ImageView[0]);
        arrayListM147507f0.getClass();
        this.starList = arrayListM147507f0;
    }

    @NotNull
    public final SVGAnimationView get_five_star_svga() {
        SVGAnimationView sVGAnimationView = this._five_star_svga;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_five_star_svga");
        return null;
    }

    @NotNull
    public final ImageView get_star_1() {
        ImageView imageView = this._star_1;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_star_1");
        return null;
    }

    @NotNull
    public final ImageView get_star_2() {
        ImageView imageView = this._star_2;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_star_2");
        return null;
    }

    @NotNull
    public final ImageView get_star_3() {
        ImageView imageView = this._star_3;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_star_3");
        return null;
    }

    @NotNull
    public final ImageView get_star_4() {
        ImageView imageView = this._star_4;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_star_4");
        return null;
    }

    @NotNull
    public final ImageView get_star_5() {
        ImageView imageView = this._star_5;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_star_5");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m74849h0(View view) {
        ijs.m140240a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final View m74850i0(int i) {
        ImageView imageView = this.starList.get(i - 1);
        imageView.getClass();
        return imageView;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m74851j0(int starCount) {
        if (starCount < 0 || starCount >= 5) {
            if (starCount == 5) {
                for (int i = 1; i < 6; i++) {
                    bnl0.m105524M(m74850i0(i), false);
                }
                bnl0.m105524M(get_five_star_svga(), true);
                Context context = getContext();
                context.getClass();
                SVGALoader.with(context).from(this.fiveStarSvga).repeatCount(-1).into(get_five_star_svga());
                return;
            }
            return;
        }
        bnl0.m105524M(get_five_star_svga(), false);
        for (int i2 = 1; i2 < 6; i2++) {
            bnl0.m105524M(m74850i0(i2), true);
            if (i2 <= starCount) {
                m74850i0(i2).setBackground(this.selectRes);
            } else if (this.unSelectRes == null) {
                bnl0.m105524M(m74850i0(i2), false);
            } else {
                m74850i0(i2).setBackground(this.unSelectRes);
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m74852k0(int starCount) {
        int i = 0;
        for (Object obj : this.starList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ViewGroup.LayoutParams layoutParams = ((ImageView) obj).getLayoutParams();
            layoutParams.getClass();
            ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) layoutParams;
            ((ViewGroup.MarginLayoutParams) c0221a).width = qa00.m175859d(22.0f);
            ((ViewGroup.MarginLayoutParams) c0221a).height = qa00.m175859d(22.0f);
            if (i != this.starList.size() - 1) {
                ((ViewGroup.MarginLayoutParams) c0221a).rightMargin = qa00.m175859d(4.0f);
            }
            i = i2;
        }
        ViewGroup.LayoutParams layoutParams2 = get_five_star_svga().getLayoutParams();
        layoutParams2.width = qa00.m175859d(135.0f);
        layoutParams2.height = qa00.f156333t;
        this.selectRes = n3d0.m161278b(obc0.f146484s2);
        this.unSelectRes = n3d0.m161278b(obc0.f146366i4);
        this.fiveStarSvga = "https://fe-static.tancdn.com/v1/raw/28034a79-5a06-4c7e-bf55-e61fd2d495c713.svga";
        m74851j0(starCount);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SVGAnimationView.stopAnimation$default(get_five_star_svga(), false, 1, null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74849h0(this);
        ArrayList<ImageView> arrayListM147507f0 = jyb.m147507f0(get_star_1(), get_star_2(), get_star_3(), get_star_4(), get_star_5());
        arrayListM147507f0.getClass();
        this.starList = arrayListM147507f0;
    }

    public final void set_five_star_svga(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._five_star_svga = sVGAnimationView;
    }

    public final void set_star_1(@NotNull ImageView imageView) {
        imageView.getClass();
        this._star_1 = imageView;
    }

    public final void set_star_2(@NotNull ImageView imageView) {
        imageView.getClass();
        this._star_2 = imageView;
    }

    public final void set_star_3(@NotNull ImageView imageView) {
        imageView.getClass();
        this._star_3 = imageView;
    }

    public final void set_star_4(@NotNull ImageView imageView) {
        imageView.getClass();
        this._star_4 = imageView;
    }

    public final void set_star_5(@NotNull ImageView imageView) {
        imageView.getClass();
        this._star_5 = imageView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveGiftFiveStarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveGiftFiveStarView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ LiveGiftFiveStarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
