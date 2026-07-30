package com.p046p1.mobile.putong.core.p053ui.purchase.page;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.AutoVDraweeView;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.d3c0;
import p149l.qib0;
import p149l.x7b0;
import p149l.zz6;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0019\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006)"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePrivilegeCommonStyleView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "b", "(Lcom/p1/mobile/putong/core/data/Privilege;)V", "Landroid/view/View;", OMSTemplateModeType.view, "a", "(Landroid/view/View;)V", "Lv/VDraweeView;", "Lv/VDraweeView;", "get_avatar_right", "()Lv/VDraweeView;", "set_avatar_right", "(Lv/VDraweeView;)V", "_avatar_right", "Lv/AutoVDraweeView;", "Lv/AutoVDraweeView;", "get_avatar_left", "()Lv/AutoVDraweeView;", "set_avatar_left", "(Lv/AutoVDraweeView;)V", "_avatar_left", "Lv/VImage;", "c", "Lv/VImage;", "get_icon", "()Lv/VImage;", "set_icon", "(Lv/VImage;)V", "_icon", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class PurchasePrivilegeCommonStyleView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VDraweeView _avatar_right;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public AutoVDraweeView _avatar_left;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VImage _icon;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.page.PurchasePrivilegeCommonStyleView$a */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C8785a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34953a;

        static {
            int[] iArr = new int[Privilege.values().length];
            try {
                iArr[Privilege.vip_super_like.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Privilege.vip_independent_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Privilege.online_match_tickets.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Privilege.oDiamondGreetings.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f34953a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PurchasePrivilegeCommonStyleView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m54180a(View view) {
        x7b0.m207255a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m54181b(@NotNull Privilege privilege) {
        privilege.getClass();
        get_avatar_left().setImageUrl(CoreModule.m29935P().m94651a().mo33639zj(CoreModule.f17545c.f19639e0.m169527p9()));
        int i = C8785a.f34953a[privilege.ordinal()];
        if (i == 1 || i == 2) {
            qib0.f154691G.m102354Y0(get_avatar_right(), zz6.m221004u0() ? d3c0.f83632K4 : d3c0.f83618J4);
            get_icon().setImageResource(d3c0.f83548E4);
        } else if (i == 3) {
            qib0.f154691G.m102354Y0(get_avatar_right(), zz6.m221004u0() ? d3c0.f83604I4 : d3c0.f83590H4);
            get_icon().setImageResource(d3c0.f83534D4);
        } else {
            if (i != 4) {
                return;
            }
            qib0.f154691G.m102354Y0(get_avatar_right(), zz6.m221004u0() ? d3c0.f83576G4 : d3c0.f83562F4);
            get_icon().setImageResource(d3c0.f83506B4);
        }
    }

    @NotNull
    public final AutoVDraweeView get_avatar_left() {
        AutoVDraweeView autoVDraweeView = this._avatar_left;
        if (autoVDraweeView != null) {
            return autoVDraweeView;
        }
        Intrinsics.m87502r("_avatar_left");
        return null;
    }

    @NotNull
    public final VDraweeView get_avatar_right() {
        VDraweeView vDraweeView = this._avatar_right;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_avatar_right");
        return null;
    }

    @NotNull
    public final VImage get_icon() {
        VImage vImage = this._icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_icon");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54180a(this);
    }

    public final void set_avatar_left(@NotNull AutoVDraweeView autoVDraweeView) {
        autoVDraweeView.getClass();
        this._avatar_left = autoVDraweeView;
    }

    public final void set_avatar_right(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._avatar_right = vDraweeView;
    }

    public final void set_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._icon = vImage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PurchasePrivilegeCommonStyleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ PurchasePrivilegeCommonStyleView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
