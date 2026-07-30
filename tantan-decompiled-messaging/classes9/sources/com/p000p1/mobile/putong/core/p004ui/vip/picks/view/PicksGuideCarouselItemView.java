package com.p000p1.mobile.putong.core.p004ui.vip.picks.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.b3c0;
import l.be70;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.jjb0;
import p006l.qib0;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksGuideCarouselItemView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "", "showFemaleStyle", "Lcom/p1/mobile/putong/data/User;", "user", "b", "(ZLcom/p1/mobile/putong/data/User;)V", "Landroid/view/View;", "view", "a", "(Landroid/view/View;)V", "Lv/VDraweeView;", "Lv/VDraweeView;", "get_image", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "Lv/VImage;", "Lv/VImage;", "get_verification", "()Lv/VImage;", "set_verification", "(Lv/VImage;)V", "_verification", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PicksGuideCarouselItemView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VDraweeView _image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VImage _verification;

    public /* synthetic */ PicksGuideCarouselItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: a */
    public final void m10265a(View view) {
        be70.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m10266b(boolean showFemaleStyle, @NotNull User user) {
        user.getClass();
        get_image().getHierarchy().D(showFemaleStyle ? b3c0.N1 : b3c0.O1);
        qib0.f19782G.m12744L0(get_image(), user.fp().profile180().formatted());
        if (jjb0.m17487b()) {
            qib0.f19804b0.f17707b.showUserVerificationLogo(getContext(), user, get_verification());
            return;
        }
        if (!CoreModule.m1854P().m11706a().m5317O()) {
            xdl0.M(get_verification(), false);
            return;
        }
        if (user.isIdAndPicBothVerified()) {
            get_verification().setBackgroundResource(b3c0.v5);
        } else {
            get_verification().setBackgroundResource(b3c0.k6);
        }
        xdl0.M(get_verification(), true);
    }

    @NotNull
    public final VDraweeView get_image() {
        VDraweeView vDraweeView = this._image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_image");
        return null;
    }

    @NotNull
    public final VImage get_verification() {
        VImage vImage = this._verification;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_verification");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10265a(this);
    }

    public final void set_image(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._image = vDraweeView;
    }

    public final void set_verification(@NotNull VImage vImage) {
        vImage.getClass();
        this._verification = vImage;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PicksGuideCarouselItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PicksGuideCarouselItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PicksGuideCarouselItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
