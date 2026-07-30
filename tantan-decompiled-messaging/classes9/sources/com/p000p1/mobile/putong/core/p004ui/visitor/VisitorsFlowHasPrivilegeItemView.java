package com.p000p1.mobile.putong.core.p004ui.visitor;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.visitor.VisitorsFlowHasPrivilegeItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.data.User;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import l.j8m0;
import l.mqi0;
import l.sb90;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.qib0;
import p006l.y5m0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 R\"\u0010'\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010.\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00105\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010<\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010?\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u00107\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R\"\u0010C\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u00107\u001a\u0004\bA\u00109\"\u0004\bB\u0010;R\"\u0010G\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u00107\u001a\u0004\bE\u00109\"\u0004\bF\u0010;R\"\u0010K\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u00107\u001a\u0004\bI\u00109\"\u0004\bJ\u0010;¨\u0006L"}, d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/VisitorsFlowHasPrivilegeItemView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Lcom/p1/mobile/android/app/Act;", "act", "Ll/y5m0;", "visitorItem", "c", "(Lcom/p1/mobile/android/app/Act;Ll/y5m0;)V", "Landroid/view/View;", "view", "b", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/data/User;", "user", "e", "(Lcom/p1/mobile/putong/data/User;)V", "d", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;)V", "a", "Lcom/p1/mobile/putong/core/ui/visitor/VisitorsFlowHasPrivilegeItemView;", "get_root", "()Lcom/p1/mobile/putong/core/ui/visitor/VisitorsFlowHasPrivilegeItemView;", "set_root", "(Lcom/p1/mobile/putong/core/ui/visitor/VisitorsFlowHasPrivilegeItemView;)V", "_root", "Lv/VDraweeView;", "Lv/VDraweeView;", "get_image", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "get_online_ic", "()Landroid/widget/ImageView;", "set_online_ic", "(Landroid/widget/ImageView;)V", "_online_ic", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_active_infos", "()Landroid/widget/TextView;", "set_active_infos", "(Landroid/widget/TextView;)V", "_active_infos", "get_visitor_count", "set_visitor_count", "_visitor_count", "f", "get_name", "set_name", "_name", "g", "get_age", "set_age", "_age", "h", "get_visit_time_infos", "set_visit_time_infos", "_visit_time_infos", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VisitorsFlowHasPrivilegeItemView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VisitorsFlowHasPrivilegeItemView _root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VDraweeView _image;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ImageView _online_ic;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _active_infos;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _visitor_count;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public TextView _name;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public TextView _age;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public TextView _visit_time_infos;

    public /* synthetic */ VisitorsFlowHasPrivilegeItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: a */
    public static void m11337a(Act act, y5m0 y5m0Var, View view) {
        act.startActivity(CoreModule.m1854P().m11706a().m5465jr(act, y5m0Var.f28034b.userId, "moment_visitor", false));
    }

    /* JADX INFO: renamed from: b */
    public final void m11338b(View view) {
        j8m0.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m11339c(@NotNull final Act act, @NotNull final y5m0 visitorItem) {
        act.getClass();
        visitorItem.getClass();
        User userM22248I3 = CoreModule.f1534c.f3657n2.m22248I3(visitorItem.f28034b.userId);
        String str = "";
        if (userM22248I3 == null) {
            get_name().setText("【异常用户】");
            get_age().setText("");
            get_active_infos().setText("");
            get_visitor_count().setText("");
            get_visit_time_infos().setText("");
            qib0.f19782G.o(get_image());
            xdl0.M(get_online_ic(), false);
            get_root().setOnClickListener(null);
            return;
        }
        if (sb90.Companion.c(userM22248I3)) {
            qib0.f19782G.m12749O(get_image(), userM22248I3.fp().profileBig().formatted(), 2, 30);
        } else {
            qib0.f19782G.m12748N0(get_image(), userM22248I3.fp().profile480().formatted(), false);
        }
        m11340d(act, userM22248I3);
        m11341e(userM22248I3);
        int i = visitorItem.f28034b.visitCount;
        if (i > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("访问%s次", Arrays.copyOf(new Object[]{C0485e.INSTANCE.m11492g(i)}, 1));
        }
        get_visitor_count().setText(str);
        get_visit_time_infos().setText(C0485e.INSTANCE.m11494i(mqi0.o(), visitorItem.f28034b.lastVisitTime));
        xdl0.E0(get_root(), new View.OnClickListener() { // from class: l.i8m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VisitorsFlowHasPrivilegeItemView.m11337a(act, visitorItem, view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m11340d(Act act, User user) {
        xdl0.M(get_online_ic(), false);
        get_active_infos().setText("");
        if (!CoreModule.f1534c.f3550E0.m26492w3(user)) {
            String string = act.getString(R.string.q1);
            string.getClass();
            if (TextUtils.equals(string, mqi0.G(user.location.updatedTime))) {
                xdl0.M(get_online_ic(), true);
                get_active_infos().setText("当前在线");
                return;
            }
        }
        get_active_infos().setText(C0485e.INSTANCE.m11496k(user));
    }

    /* JADX INFO: renamed from: e */
    public final void m11341e(User user) {
        get_name().setText(user.name);
        get_age().setText("");
        if (CoreModule.m1851K().hideAge(user)) {
            return;
        }
        get_age().setText(" · " + user.age);
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
    public final TextView get_age() {
        TextView textView = this._age;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_age");
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
    public final TextView get_name() {
        TextView textView = this._name;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_name");
        return null;
    }

    @NotNull
    public final ImageView get_online_ic() {
        ImageView imageView = this._online_ic;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_online_ic");
        return null;
    }

    @NotNull
    public final VisitorsFlowHasPrivilegeItemView get_root() {
        VisitorsFlowHasPrivilegeItemView visitorsFlowHasPrivilegeItemView = this._root;
        if (visitorsFlowHasPrivilegeItemView != null) {
            return visitorsFlowHasPrivilegeItemView;
        }
        Intrinsics.r("_root");
        return null;
    }

    @NotNull
    public final TextView get_visit_time_infos() {
        TextView textView = this._visit_time_infos;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_visit_time_infos");
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
        m11338b(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(widthMeasureSpec) * 1.33f), 1073741824));
    }

    public final void set_active_infos(@NotNull TextView textView) {
        textView.getClass();
        this._active_infos = textView;
    }

    public final void set_age(@NotNull TextView textView) {
        textView.getClass();
        this._age = textView;
    }

    public final void set_image(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._image = vDraweeView;
    }

    public final void set_name(@NotNull TextView textView) {
        textView.getClass();
        this._name = textView;
    }

    public final void set_online_ic(@NotNull ImageView imageView) {
        imageView.getClass();
        this._online_ic = imageView;
    }

    public final void set_root(@NotNull VisitorsFlowHasPrivilegeItemView visitorsFlowHasPrivilegeItemView) {
        visitorsFlowHasPrivilegeItemView.getClass();
        this._root = visitorsFlowHasPrivilegeItemView;
    }

    public final void set_visit_time_infos(@NotNull TextView textView) {
        textView.getClass();
        this._visit_time_infos = textView;
    }

    public final void set_visitor_count(@NotNull TextView textView) {
        textView.getClass();
        this._visitor_count = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VisitorsFlowHasPrivilegeItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VisitorsFlowHasPrivilegeItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VisitorsFlowHasPrivilegeItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
