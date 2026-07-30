package com.p051p1.mobile.putong.core.p058ui.purchase.intlpage;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VText;
import p153l.c9p;
import p153l.d0p;
import p153l.h1e0;
import p153l.h9c0;
import p153l.uqb0;
import p153l.wib0;
import p153l.wlj;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010)\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006*"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePrivilegeView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "b", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;)V", "Landroid/view/View;", OMSTemplateModeType.view, "a", "(Landroid/view/View;)V", "c", "", "url", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)V", "e", "(Lcom/p1/mobile/putong/core/data/Privilege;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "get_container", "()Landroid/widget/FrameLayout;", "set_container", "(Landroid/widget/FrameLayout;)V", "_container", "Lv/VText;", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class IntlPurchasePrivilegeView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public FrameLayout _container;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _title;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public IntlPurchasePrivilegeView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m55127a(View view) {
        c9p.m108454a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m55128b(@NotNull PurchaseType purchaseType, @Nullable Privilege privilege) {
        purchaseType.getClass();
        m55131e(privilege, purchaseType);
        m55129c(purchaseType, privilege);
    }

    /* JADX INFO: renamed from: c */
    public final void m55129c(PurchaseType purchaseType, Privilege privilege) {
        String strM96305k = d0p.m113420b(purchaseType, privilege).m96305k();
        if (strM96305k != null) {
            m55130d(strM96305k);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m55130d(String url) {
        SimpleDraweeView vDraweeView = new VDraweeView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, 0, 0, 0);
        layoutParams.gravity = 17;
        vDraweeView.setLayoutParams(layoutParams);
        ((wlj) vDraweeView.getHierarchy()).m207062w(h1e0.f107448e);
        get_container().removeAllViews();
        get_container().addView(vDraweeView);
        uqb0.f180374G.m127115L0(vDraweeView, url);
    }

    /* JADX INFO: renamed from: e */
    public final void m55131e(Privilege privilege, PurchaseType purchaseType) {
        int color;
        VText vText = get_title();
        if (wib0.m206578v(purchaseType)) {
            color = Color.parseColor("#F9E7FF");
        } else {
            color = wib0.m206573q(purchaseType) ? Color.parseColor("#E8CA8A") : CoreModule.f18263b.getResources().getColor(h9c0.f108369g);
        }
        vText.setTextColor(color);
        get_title().setText(d0p.m113419a(privilege).m96314t());
    }

    @NotNull
    public final FrameLayout get_container() {
        FrameLayout frameLayout = this._container;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_container");
        return null;
    }

    @NotNull
    public final VText get_title() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55127a(this);
    }

    public final void set_container(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._container = frameLayout;
    }

    public final void set_title(@NotNull VText vText) {
        vText.getClass();
        this._title = vText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlPurchasePrivilegeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ IntlPurchasePrivilegeView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
