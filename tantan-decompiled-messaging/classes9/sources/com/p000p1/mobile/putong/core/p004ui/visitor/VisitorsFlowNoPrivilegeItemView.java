package com.p000p1.mobile.putong.core.p004ui.visitor;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.camera.TTCameraConfig;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.visitor.VisitorsFlowNoPrivilegeItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.UnPrivilegedVisitor;
import com.p1.mobile.putong.data.User;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import l.e30;
import l.e51;
import l.j760;
import l.p8m0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.qib0;
import p006l.y5m0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010$\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00108\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u0010/\u001a\u0004\b6\u00101\"\u0004\b7\u00103R\"\u0010<\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010/\u001a\u0004\b:\u00101\"\u0004\b;\u00103R\"\u0010C\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010J\u001a\u00020D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/VisitorsFlowNoPrivilegeItemView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Lcom/p1/mobile/android/app/Act;", "act", "Ll/y5m0;", "visitorItem", "position", "Lcom/p1/mobile/putong/core/ui/visitor/a$a;", "callback", "g", "(Lcom/p1/mobile/android/app/Act;Ll/y5m0;ILcom/p1/mobile/putong/core/ui/visitor/a$a;)V", "Landroid/view/View;", "view", "f", "(Landroid/view/View;)V", "a", "Lcom/p1/mobile/putong/core/ui/visitor/VisitorsFlowNoPrivilegeItemView;", "get_root", "()Lcom/p1/mobile/putong/core/ui/visitor/VisitorsFlowNoPrivilegeItemView;", "set_root", "(Lcom/p1/mobile/putong/core/ui/visitor/VisitorsFlowNoPrivilegeItemView;)V", "_root", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "get_image", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "get_active_infos", "()Landroid/widget/TextView;", "set_active_infos", "(Landroid/widget/TextView;)V", "_active_infos", "d", "get_visitor_count", "set_visitor_count", "_visitor_count", "e", "get_reason_infos", "set_reason_infos", "_reason_infos", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "get_o_diamond_visitor_ic", "()Landroid/widget/ImageView;", "set_o_diamond_visitor_ic", "(Landroid/widget/ImageView;)V", "_o_diamond_visitor_ic", "", "Ljava/lang/String;", "getClickType", "()Ljava/lang/String;", "setClickType", "(Ljava/lang/String;)V", "clickType", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VisitorsFlowNoPrivilegeItemView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VisitorsFlowNoPrivilegeItemView _root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VDraweeView _image;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public TextView _active_infos;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _visitor_count;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _reason_infos;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public ImageView _o_diamond_visitor_ic;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public String clickType;

    public /* synthetic */ VisitorsFlowNoPrivilegeItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: a */
    public static void m11342a(VisitorsFlowNoPrivilegeItemView visitorsFlowNoPrivilegeItemView, View view) {
        visitorsFlowNoPrivilegeItemView.clickType = TTCameraConfig.TYPE_ID_CARD_AVATAR;
        visitorsFlowNoPrivilegeItemView.get_root().callOnClick();
    }

    /* JADX INFO: renamed from: b */
    public static void m11343b(VisitorsFlowNoPrivilegeItemView visitorsFlowNoPrivilegeItemView, int i, final Act act, final AbstractC0481a.a aVar, View view) {
        zvf0.u("e_visitor_click_infos", "p_my_visitor", new j760[]{vwb.Y("visitor_click_type", TextUtils.isEmpty(visitorsFlowNoPrivilegeItemView.clickType) ? "title" : visitorsFlowNoPrivilegeItemView.clickType), vwb.Y("user_index", String.valueOf(i + 1)), vwb.Y("visitor_button_text", ""), vwb.Y("visitor_user_title", visitorsFlowNoPrivilegeItemView.get_reason_infos().getText()), vwb.Y("visitor_user_sub_title", ((Object) visitorsFlowNoPrivilegeItemView.get_active_infos().getText()) + " · " + ((Object) visitorsFlowNoPrivilegeItemView.get_visitor_count().getText()))});
        visitorsFlowNoPrivilegeItemView.clickType = "";
        CoreModule.m1854P().m11711g().m6958Og(act, "p_navigation_visit,button_pull", new e30() { // from class: l.n8m0
            public final void call(Object obj) {
                VisitorsFlowNoPrivilegeItemView.m11347h(act, aVar, (PurchaseType) obj);
            }
        }, null, null, Privilege.oDiamondVisitor);
    }

    /* JADX INFO: renamed from: e */
    public static void m11346e(VisitorsFlowNoPrivilegeItemView visitorsFlowNoPrivilegeItemView, View view) {
        visitorsFlowNoPrivilegeItemView.clickType = "button";
        visitorsFlowNoPrivilegeItemView.get_root().callOnClick();
    }

    /* JADX INFO: renamed from: h */
    public static final void m11347h(Act act, final AbstractC0481a.a aVar, PurchaseType purchaseType) {
        e51.H(act, new Runnable() { // from class: l.o8m0
            @Override // java.lang.Runnable
            public final void run() {
                VisitorsFlowNoPrivilegeItemView.m11348i(aVar);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: i */
    public static final void m11348i(AbstractC0481a.a aVar) {
        aVar.getData();
    }

    /* JADX INFO: renamed from: f */
    public final void m11349f(View view) {
        p8m0.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final void m11350g(@NotNull final Act act, @NotNull y5m0 visitorItem, final int position, @NotNull final AbstractC0481a.a callback) {
        act.getClass();
        visitorItem.getClass();
        callback.getClass();
        UnPrivilegedVisitor unPrivilegedVisitor = visitorItem.f28036d;
        unPrivilegedVisitor.getClass();
        User userM22248I3 = CoreModule.f1534c.f3657n2.m22248I3(unPrivilegedVisitor.userId);
        String str = "";
        if (userM22248I3 == null) {
            get_reason_infos().setText("【异常用户】");
            get_active_infos().setText("");
            get_visitor_count().setText("");
            qib0.f19782G.o(get_image());
            get_root().setOnClickListener(null);
            return;
        }
        if (visitorItem.f28037e) {
            qib0.f19782G.m12749O(get_image(), userM22248I3.fp().profileBig().formatted(), 2, 30);
        } else {
            qib0.f19782G.m12748N0(get_image(), userM22248I3.fp().profile480().formatted(), false);
        }
        get_reason_infos().setText(VisitorsUnPrivilegeView.m11359k(unPrivilegedVisitor).toString());
        get_active_infos().setText(VisitorsUnPrivilegeView.m11357i(unPrivilegedVisitor, userM22248I3).toString());
        int i = unPrivilegedVisitor.visitCount;
        if (i > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("访问%s次", Arrays.copyOf(new Object[]{C0485e.INSTANCE.m11492g(i)}, 1));
        }
        get_visitor_count().setText(str);
        xdl0.E0(get_root(), new View.OnClickListener() { // from class: l.k8m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VisitorsFlowNoPrivilegeItemView.m11343b(this.f15654a, position, act, callback, view);
            }
        });
        xdl0.E0(get_image(), new View.OnClickListener() { // from class: l.l8m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VisitorsFlowNoPrivilegeItemView.m11342a(this.f16268a, view);
            }
        });
        xdl0.E0(get_o_diamond_visitor_ic(), new View.OnClickListener() { // from class: l.m8m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VisitorsFlowNoPrivilegeItemView.m11346e(this.f16858a, view);
            }
        });
    }

    @NotNull
    public final String getClickType() {
        return this.clickType;
    }

    @NotNull
    public final TextView get_active_infos() {
        TextView textView = this._active_infos;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_active_infos");
        return null;
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
    public final ImageView get_o_diamond_visitor_ic() {
        ImageView imageView = this._o_diamond_visitor_ic;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_o_diamond_visitor_ic");
        return null;
    }

    @NotNull
    public final TextView get_reason_infos() {
        TextView textView = this._reason_infos;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_reason_infos");
        return null;
    }

    @NotNull
    public final VisitorsFlowNoPrivilegeItemView get_root() {
        VisitorsFlowNoPrivilegeItemView visitorsFlowNoPrivilegeItemView = this._root;
        if (visitorsFlowNoPrivilegeItemView != null) {
            return visitorsFlowNoPrivilegeItemView;
        }
        Intrinsics.r("_root");
        return null;
    }

    @NotNull
    public final TextView get_visitor_count() {
        TextView textView = this._visitor_count;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_visitor_count");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m11349f(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(widthMeasureSpec) * 1.33f), 1073741824));
    }

    public final void setClickType(@NotNull String str) {
        str.getClass();
        this.clickType = str;
    }

    public final void set_active_infos(@NotNull TextView textView) {
        textView.getClass();
        this._active_infos = textView;
    }

    public final void set_image(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._image = vDraweeView;
    }

    public final void set_o_diamond_visitor_ic(@NotNull ImageView imageView) {
        imageView.getClass();
        this._o_diamond_visitor_ic = imageView;
    }

    public final void set_reason_infos(@NotNull TextView textView) {
        textView.getClass();
        this._reason_infos = textView;
    }

    public final void set_root(@NotNull VisitorsFlowNoPrivilegeItemView visitorsFlowNoPrivilegeItemView) {
        visitorsFlowNoPrivilegeItemView.getClass();
        this._root = visitorsFlowNoPrivilegeItemView;
    }

    public final void set_visitor_count(@NotNull TextView textView) {
        textView.getClass();
        this._visitor_count = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VisitorsFlowNoPrivilegeItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VisitorsFlowNoPrivilegeItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.clickType = "";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VisitorsFlowNoPrivilegeItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
