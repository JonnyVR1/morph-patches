package com.p051p1.mobile.putong.core.p058ui.visitor.myvisitors;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.MyVisitorsShowType;
import com.p051p1.mobile.putong.core.p058ui.visitor.myvisitors.MyVisitorMenuPopupView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.f9c0;
import p153l.u920;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010/\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b-\u0010\u0019\"\u0004\b.\u0010\u001bR\"\u00102\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b0\u0010!\"\u0004\b1\u0010#R\"\u00106\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u0010'\u001a\u0004\b4\u0010)\"\u0004\b5\u0010+R\"\u0010:\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u0010\u0017\u001a\u0004\b8\u0010\u0019\"\u0004\b9\u0010\u001bR\"\u0010>\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010\u001f\u001a\u0004\b<\u0010!\"\u0004\b=\u0010#R\"\u0010B\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010'\u001a\u0004\b@\u0010)\"\u0004\bA\u0010+¨\u0006C"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorMenuPopupView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/data/MyVisitorsShowType;", "showType", "Ll/y20;", "callback", "e", "(Lcom/p1/mobile/putong/core/data/MyVisitorsShowType;Ll/y20;)V", "Landroid/view/View;", OMSTemplateModeType.view, Constants.INAPP_DATA_TAG, "(Landroid/view/View;)V", "Lv/VLinear;", "a", "Lv/VLinear;", "get_sort_default_layout", "()Lv/VLinear;", "set_sort_default_layout", "(Lv/VLinear;)V", "_sort_default_layout", "Lv/VText;", "b", "Lv/VText;", "get_sort_default_text", "()Lv/VText;", "set_sort_default_text", "(Lv/VText;)V", "_sort_default_text", "Lv/VImage;", "c", "Lv/VImage;", "get_sort_default_check", "()Lv/VImage;", "set_sort_default_check", "(Lv/VImage;)V", "_sort_default_check", "get_sort_time_layout", "set_sort_time_layout", "_sort_time_layout", "get_sort_time_text", "set_sort_time_text", "_sort_time_text", "f", "get_sort_time_check", "set_sort_time_check", "_sort_time_check", "g", "get_sort_hide_footprint_layout", "set_sort_hide_footprint_layout", "_sort_hide_footprint_layout", "h", "get_sort_hide_footprint_text", "set_sort_hide_footprint_text", "_sort_hide_footprint_text", RXScreenCaptureService.KEY_INDEX, "get_sort_hide_footprint_check", "set_sort_hide_footprint_check", "_sort_hide_footprint_check", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class MyVisitorMenuPopupView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VLinear _sort_default_layout;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _sort_default_text;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VImage _sort_default_check;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VLinear _sort_time_layout;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _sort_time_text;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VImage _sort_time_check;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VLinear _sort_hide_footprint_layout;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _sort_hide_footprint_text;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VImage _sort_hide_footprint_check;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public MyVisitorMenuPopupView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public static void m59206a(y20 y20Var, View view) {
        y20Var.call(MyVisitorsShowType.get("visitTime"));
    }

    /* JADX INFO: renamed from: b */
    public static void m59207b(y20 y20Var, View view) {
        y20Var.call(MyVisitorsShowType.get("visitTimes"));
    }

    /* JADX INFO: renamed from: c */
    public static void m59208c(y20 y20Var, View view) {
        y20Var.call(MyVisitorsShowType.get("hidden"));
    }

    /* JADX INFO: renamed from: d */
    public final void m59209d(View view) {
        u920.m195073a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m59210e(@NotNull MyVisitorsShowType showType, @NotNull final y20<MyVisitorsShowType> callback) {
        showType.getClass();
        callback.getClass();
        bnl0.m105509E0(get_sort_default_layout(), new View.OnClickListener() { // from class: l.r920
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyVisitorMenuPopupView.m59207b(callback, view);
            }
        });
        bnl0.m105509E0(get_sort_time_layout(), new View.OnClickListener() { // from class: l.s920
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyVisitorMenuPopupView.m59206a(callback, view);
            }
        });
        bnl0.m105509E0(get_sort_hide_footprint_layout(), new View.OnClickListener() { // from class: l.t920
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyVisitorMenuPopupView.m59208c(callback, view);
            }
        });
        if (TEnum.equals(showType, "hidden")) {
            get_sort_default_text().setTextColor(getResources().getColor(f9c0.f97857b));
            bnl0.m105525M0(get_sort_default_check(), false);
            get_sort_time_text().setTextColor(getResources().getColor(f9c0.f97857b));
            bnl0.m105525M0(get_sort_time_check(), false);
            get_sort_hide_footprint_text().setTextColor(getResources().getColor(f9c0.f97859d));
            bnl0.m105525M0(get_sort_hide_footprint_check(), true);
            return;
        }
        if (TEnum.equals(showType, "visitTime")) {
            get_sort_default_text().setTextColor(getResources().getColor(f9c0.f97857b));
            bnl0.m105525M0(get_sort_default_check(), false);
            get_sort_time_text().setTextColor(getResources().getColor(f9c0.f97859d));
            bnl0.m105525M0(get_sort_time_check(), true);
            get_sort_hide_footprint_text().setTextColor(getResources().getColor(f9c0.f97857b));
            bnl0.m105525M0(get_sort_hide_footprint_check(), false);
            return;
        }
        get_sort_default_text().setTextColor(getResources().getColor(f9c0.f97859d));
        bnl0.m105525M0(get_sort_default_check(), true);
        get_sort_time_text().setTextColor(getResources().getColor(f9c0.f97857b));
        bnl0.m105525M0(get_sort_time_check(), false);
        get_sort_hide_footprint_text().setTextColor(getResources().getColor(f9c0.f97857b));
        bnl0.m105525M0(get_sort_hide_footprint_check(), false);
    }

    @NotNull
    public final VImage get_sort_default_check() {
        VImage vImage = this._sort_default_check;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_sort_default_check");
        return null;
    }

    @NotNull
    public final VLinear get_sort_default_layout() {
        VLinear vLinear = this._sort_default_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_sort_default_layout");
        return null;
    }

    @NotNull
    public final VText get_sort_default_text() {
        VText vText = this._sort_default_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_sort_default_text");
        return null;
    }

    @NotNull
    public final VImage get_sort_hide_footprint_check() {
        VImage vImage = this._sort_hide_footprint_check;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_sort_hide_footprint_check");
        return null;
    }

    @NotNull
    public final VLinear get_sort_hide_footprint_layout() {
        VLinear vLinear = this._sort_hide_footprint_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_sort_hide_footprint_layout");
        return null;
    }

    @NotNull
    public final VText get_sort_hide_footprint_text() {
        VText vText = this._sort_hide_footprint_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_sort_hide_footprint_text");
        return null;
    }

    @NotNull
    public final VImage get_sort_time_check() {
        VImage vImage = this._sort_time_check;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_sort_time_check");
        return null;
    }

    @NotNull
    public final VLinear get_sort_time_layout() {
        VLinear vLinear = this._sort_time_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_sort_time_layout");
        return null;
    }

    @NotNull
    public final VText get_sort_time_text() {
        VText vText = this._sort_time_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_sort_time_text");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m59209d(this);
    }

    public final void set_sort_default_check(@NotNull VImage vImage) {
        vImage.getClass();
        this._sort_default_check = vImage;
    }

    public final void set_sort_default_layout(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._sort_default_layout = vLinear;
    }

    public final void set_sort_default_text(@NotNull VText vText) {
        vText.getClass();
        this._sort_default_text = vText;
    }

    public final void set_sort_hide_footprint_check(@NotNull VImage vImage) {
        vImage.getClass();
        this._sort_hide_footprint_check = vImage;
    }

    public final void set_sort_hide_footprint_layout(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._sort_hide_footprint_layout = vLinear;
    }

    public final void set_sort_hide_footprint_text(@NotNull VText vText) {
        vText.getClass();
        this._sort_hide_footprint_text = vText;
    }

    public final void set_sort_time_check(@NotNull VImage vImage) {
        vImage.getClass();
        this._sort_time_check = vImage;
    }

    public final void set_sort_time_layout(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._sort_time_layout = vLinear;
    }

    public final void set_sort_time_text(@NotNull VText vText) {
        vText.getClass();
        this._sort_time_text = vText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MyVisitorMenuPopupView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ MyVisitorMenuPopupView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
