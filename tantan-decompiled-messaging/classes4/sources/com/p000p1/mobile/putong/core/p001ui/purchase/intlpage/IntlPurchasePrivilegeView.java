package com.p000p1.mobile.putong.core.p001ui.purchase.intlpage;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.b1c0;
import l.c7p;
import l.dyo;
import l.ftd0;
import l.qib0;
import l.sab0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010)\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePrivilegeView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "b", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;)V", "Landroid/view/View;", "view", "a", "(Landroid/view/View;)V", "c", "", "url", "d", "(Ljava/lang/String;)V", "e", "(Lcom/p1/mobile/putong/core/data/Privilege;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "get_container", "()Landroid/widget/FrameLayout;", "set_container", "(Landroid/widget/FrameLayout;)V", "_container", "Lv/VText;", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class IntlPurchasePrivilegeView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public FrameLayout _container;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _title;

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public IntlPurchasePrivilegeView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m4510a(View view) {
        c7p.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m4511b(@NotNull PurchaseType purchaseType, @Nullable Privilege privilege) {
        purchaseType.getClass();
        m4514e(privilege, purchaseType);
        m4512c(purchaseType, privilege);
    }

    /* JADX INFO: renamed from: c */
    public final void m4512c(PurchaseType purchaseType, Privilege privilege) {
        String strK = dyo.b(purchaseType, privilege).k();
        if (strK != null) {
            m4513d(strK);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4513d(String url) {
        View vDraweeView = new VDraweeView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, 0, 0, 0);
        layoutParams.gravity = 17;
        vDraweeView.setLayoutParams(layoutParams);
        vDraweeView.getHierarchy().w(ftd0.e);
        get_container().removeAllViews();
        get_container().addView(vDraweeView);
        qib0.G.L0(vDraweeView, url);
    }

    /* JADX INFO: renamed from: e */
    public final void m4514e(Privilege privilege, PurchaseType purchaseType) {
        int color;
        VText vText = get_title();
        if (sab0.v(purchaseType)) {
            color = Color.parseColor("#F9E7FF");
        } else {
            color = sab0.q(purchaseType) ? Color.parseColor("#E8CA8A") : CoreModule.b.getResources().getColor(b1c0.g);
        }
        vText.setTextColor(color);
        get_title().setText(dyo.a(privilege).t());
    }

    @NotNull
    public final FrameLayout get_container() {
        FrameLayout frameLayout = this._container;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_container");
        return null;
    }

    @NotNull
    public final VText get_title() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_title");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4510a(this);
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
