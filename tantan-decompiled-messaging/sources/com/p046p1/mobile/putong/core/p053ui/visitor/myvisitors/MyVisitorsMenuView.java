package com.p046p1.mobile.putong.core.p053ui.visitor.myvisitors;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.MyVisitorsShowType;
import com.p046p1.mobile.putong.core.data.Options;
import com.p046p1.mobile.putong.core.p053ui.visitor.myvisitors.MyVisitorsMenuView;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VText;
import p149l.b3c0;
import p149l.e30;
import p149l.k6c0;
import p149l.s220;
import p149l.svq;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00101\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\u0012R\u0018\u00104\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00103¨\u00065"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsMenuView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "e", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/View;", OMSTemplateModeType.view, Constants.INAPP_DATA_TAG, "(Landroid/view/View;)V", "h", "Lcom/p1/mobile/putong/core/data/MyVisitorsShowType;", "showType", "g", "(Lcom/p1/mobile/putong/core/data/MyVisitorsShowType;)V", "", "expand", "f", "(Z)V", "Lv/VText;", "a", "Lv/VText;", "get_name", "()Lv/VText;", "set_name", "(Lv/VText;)V", "_name", "Lv/VImage;", "b", "Lv/VImage;", "get_filter_ic", "()Lv/VImage;", "set_filter_ic", "(Lv/VImage;)V", "_filter_ic", "c", "Landroid/view/View;", "get_anchor", "()Landroid/view/View;", "set_anchor", "_anchor", "Landroid/widget/PopupWindow;", "Landroid/widget/PopupWindow;", "menuPopupWindow", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public MyVisitorsMenuView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: b */
    public static void m58064b(MyVisitorsMenuView myVisitorsMenuView, MyVisitorsShowType myVisitorsShowType, MyVisitorsShowType myVisitorsShowType2) {
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
            str = TEnum.equals(myVisitorsShowType2, "visitTime") ? "time_rank" : "default";
        }
        zvf0.m220399u("e_my_visitor_isee_options", "p_my_visitor_isee", vwb.m200311Y(Options.TYPE, str));
        CoreModule.f17545c.f19668n2.m175453d4(myVisitorsShowType2, true, null);
        myVisitorsMenuView.m58070g(myVisitorsShowType2);
        myVisitorsMenuView.m58069f(false);
    }

    /* JADX INFO: renamed from: c */
    public static void m58065c(MyVisitorsMenuView myVisitorsMenuView, Act act, View view) {
        zvf0.m220396r("e_my_visitor_isee_filter", "p_my_visitor_isee");
        myVisitorsMenuView.m58071h(act);
    }

    /* JADX INFO: renamed from: i */
    public static final void m58066i(MyVisitorsMenuView myVisitorsMenuView) {
        myVisitorsMenuView.m58069f(false);
    }

    /* JADX INFO: renamed from: d */
    public final void m58067d(View view) {
        s220.m182054a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m58068e(@NotNull final Act act) {
        act.getClass();
        m58069f(false);
        MyVisitorsShowType myVisitorsShowTypeM175429F3 = CoreModule.f17545c.f19668n2.m175429F3();
        myVisitorsShowTypeM175429F3.getClass();
        m58070g(myVisitorsShowTypeM175429F3);
        xdl0.m208342L(get_filter_ic(), new View.OnClickListener() { // from class: l.p220
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyVisitorsMenuView.m58065c(this.f146798a, act, view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m58069f(boolean expand) {
        if (expand) {
            get_filter_ic().setImageResource(b3c0.f72882I5);
        } else {
            get_filter_ic().setImageResource(b3c0.f72875H5);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m58070g(MyVisitorsShowType showType) {
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
        Intrinsics.m87502r("_anchor");
        return null;
    }

    @NotNull
    public final VImage get_filter_ic() {
        VImage vImage = this._filter_ic;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_filter_ic");
        return null;
    }

    @NotNull
    public final VText get_name() {
        VText vText = this._name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_name");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m58071h(Act act) {
        if (this.menuPopupWindow == null) {
            this.menuPopupWindow = new PopupWindow(act);
        }
        PopupWindow popupWindow = this.menuPopupWindow;
        if (popupWindow == null || !popupWindow.isShowing()) {
            m58069f(true);
            View viewInflate = act.inflater().inflate(k6c0.f121341U1, (ViewGroup) null, false);
            viewInflate.getClass();
            MyVisitorMenuPopupView myVisitorMenuPopupView = (MyVisitorMenuPopupView) viewInflate;
            final MyVisitorsShowType myVisitorsShowTypeM175429F3 = CoreModule.f17545c.f19668n2.m175429F3();
            myVisitorsShowTypeM175429F3.getClass();
            myVisitorMenuPopupView.m58027e(myVisitorsShowTypeM175429F3, new e30() { // from class: l.q220
                @Override // p149l.e30
                public final void call(Object obj) {
                    MyVisitorsMenuView.m58064b(this.f152196a, myVisitorsShowTypeM175429F3, (MyVisitorsShowType) obj);
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
                int iM186103c = svq.m186103c(16);
                popupWindow2.showAsDropDown(get_filter_ic(), (-measuredWidth) + iM186103c, -iM186103c, 53);
                popupWindow2.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.r220
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        MyVisitorsMenuView.m58066i(this.f157358a);
                    }
                });
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58067d(this);
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
