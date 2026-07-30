package com.p000p1.mobile.putong.core.p004ui.visitor.myvisitors;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.visitor.myvisitors.MyVisitorsMenuView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.MyVisitorsShowType;
import com.p1.mobile.putong.data.tenum.TEnum;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.b3c0;
import l.e30;
import l.j760;
import l.k6c0;
import l.s220;
import l.svq;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00101\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\u0012R\u0018\u00104\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00103¨\u00065"}, d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsMenuView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "e", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/View;", "view", "d", "(Landroid/view/View;)V", "h", "Lcom/p1/mobile/putong/core/data/MyVisitorsShowType;", "showType", "g", "(Lcom/p1/mobile/putong/core/data/MyVisitorsShowType;)V", "", "expand", "f", "(Z)V", "Lv/VText;", "a", "Lv/VText;", "get_name", "()Lv/VText;", "set_name", "(Lv/VText;)V", "_name", "Lv/VImage;", "b", "Lv/VImage;", "get_filter_ic", "()Lv/VImage;", "set_filter_ic", "(Lv/VImage;)V", "_filter_ic", "c", "Landroid/view/View;", "get_anchor", "()Landroid/view/View;", "set_anchor", "_anchor", "Landroid/widget/PopupWindow;", "Landroid/widget/PopupWindow;", "menuPopupWindow", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MyVisitorsMenuView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VText _name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VImage _filter_ic;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public View _anchor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PopupWindow menuPopupWindow;

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public MyVisitorsMenuView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public static void m11588b(MyVisitorsMenuView myVisitorsMenuView, MyVisitorsShowType myVisitorsShowType, MyVisitorsShowType myVisitorsShowType2) {
        String str;
        myVisitorsShowType2.getClass();
        PopupWindow popupWindow = myVisitorsMenuView.menuPopupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        if (TEnum.equals(myVisitorsShowType, myVisitorsShowType2)) {
            return;
        }
        if (TEnum.equals(myVisitorsShowType2, "hidden")) {
            str = "hide_records";
        } else {
            str = TEnum.equals(myVisitorsShowType2, "visitTime") ? "time_rank" : CameraSticker.CATEGORY_DEFAULT_FILTER;
        }
        zvf0.u("e_my_visitor_isee_options", "p_my_visitor_isee", new j760[]{vwb.Y("options", str)});
        CoreModule.f1534c.f3657n2.m22269d4(myVisitorsShowType2, true, null);
        myVisitorsMenuView.m11594g(myVisitorsShowType2);
        myVisitorsMenuView.m11593f(false);
    }

    /* JADX INFO: renamed from: c */
    public static void m11589c(MyVisitorsMenuView myVisitorsMenuView, Act act, View view) {
        zvf0.r("e_my_visitor_isee_filter", "p_my_visitor_isee");
        myVisitorsMenuView.m11595h(act);
    }

    /* JADX INFO: renamed from: i */
    public static final void m11590i(MyVisitorsMenuView myVisitorsMenuView) {
        myVisitorsMenuView.m11593f(false);
    }

    /* JADX INFO: renamed from: d */
    public final void m11591d(View view) {
        s220.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m11592e(@NotNull final Act act) {
        act.getClass();
        m11593f(false);
        MyVisitorsShowType myVisitorsShowTypeM22245F3 = CoreModule.f1534c.f3657n2.m22245F3();
        myVisitorsShowTypeM22245F3.getClass();
        m11594g(myVisitorsShowTypeM22245F3);
        xdl0.L(get_filter_ic(), new View.OnClickListener() { // from class: l.p220
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyVisitorsMenuView.m11589c(this.f18558a, act, view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m11593f(boolean expand) {
        if (expand) {
            get_filter_ic().setImageResource(b3c0.I5);
        } else {
            get_filter_ic().setImageResource(b3c0.H5);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m11594g(MyVisitorsShowType showType) {
        if (TEnum.equals(showType, "hidden")) {
            get_name().setText("已对其隐藏足迹");
        } else if (TEnum.equals(showType, "visitTime")) {
            get_name().setText("按时间排序");
        } else {
            get_name().setText("默认排序");
        }
    }

    @NotNull
    public final View get_anchor() {
        View view = this._anchor;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_anchor");
        return null;
    }

    @NotNull
    public final VImage get_filter_ic() {
        VImage vImage = this._filter_ic;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_filter_ic");
        return null;
    }

    @NotNull
    public final VText get_name() {
        VText vText = this._name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_name");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m11595h(Act act) {
        if (this.menuPopupWindow == null) {
            this.menuPopupWindow = new PopupWindow((Context) act);
        }
        PopupWindow popupWindow = this.menuPopupWindow;
        if (popupWindow == null || !popupWindow.isShowing()) {
            m11593f(true);
            View viewInflate = act.inflater().inflate(k6c0.U1, (ViewGroup) null, false);
            viewInflate.getClass();
            MyVisitorMenuPopupView myVisitorMenuPopupView = (MyVisitorMenuPopupView) viewInflate;
            final MyVisitorsShowType myVisitorsShowTypeM22245F3 = CoreModule.f1534c.f3657n2.m22245F3();
            myVisitorsShowTypeM22245F3.getClass();
            myVisitorMenuPopupView.m11551e(myVisitorsShowTypeM22245F3, new e30() { // from class: l.q220
                public final void call(Object obj) {
                    MyVisitorsMenuView.m11588b(this.f19530a, myVisitorsShowTypeM22245F3, (MyVisitorsShowType) obj);
                }
            });
            PopupWindow popupWindow2 = this.menuPopupWindow;
            if (popupWindow2 != null) {
                popupWindow2.setWidth(-2);
                popupWindow2.setHeight(-2);
                popupWindow2.setContentView(myVisitorMenuPopupView);
                popupWindow2.setOutsideTouchable(true);
                popupWindow2.setTouchable(true);
                popupWindow2.setFocusable(true);
                popupWindow2.setClippingEnabled(false);
                popupWindow2.setBackgroundDrawable(new ColorDrawable(0));
                popupWindow2.getContentView().measure(0, 0);
                int measuredWidth = popupWindow2.getContentView().getMeasuredWidth();
                int iC = svq.c(16);
                popupWindow2.showAsDropDown(get_filter_ic(), (-measuredWidth) + iC, -iC, 53);
                popupWindow2.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.r220
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        MyVisitorsMenuView.m11590i(this.f20262a);
                    }
                });
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m11591d(this);
    }

    public final void set_anchor(@NotNull View view) {
        view.getClass();
        this._anchor = view;
    }

    public final void set_filter_ic(@NotNull VImage vImage) {
        vImage.getClass();
        this._filter_ic = vImage;
    }

    public final void set_name(@NotNull VText vText) {
        vText.getClass();
        this._name = vText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MyVisitorsMenuView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ MyVisitorsMenuView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
