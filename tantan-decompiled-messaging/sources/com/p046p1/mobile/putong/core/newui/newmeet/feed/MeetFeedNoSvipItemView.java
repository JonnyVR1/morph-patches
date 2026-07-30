package com.p046p1.mobile.putong.core.newui.newmeet.feed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.businessdata.meet.AbsMeetListData;
import com.p046p1.mobile.putong.core.businessdata.meet.IMeetListData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedImageItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedNoSvipItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedSeeItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedVideoItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetGuideToSwipeCardItemData;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.MeetFeedNoSvipItemView;
import com.p046p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFragPresenter;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.d30;
import p149l.g2y;
import p149l.u0y;
import p149l.vwb;
import p149l.x0y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010,\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u001eR\"\u00103\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00064"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/newmeet/feed/MeetFeedNoSvipItemView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/businessdata/meet/MeetFeedNoSvipItemData;", "itemData", "Ll/d30;", "viewClickAction", "Lkotlin/Function0;", "clickAction", "Lcom/p1/mobile/putong/core/newui/newmeet/frag/meet/NewMeetFragPresenter;", "presenter", "e", "(Lcom/p1/mobile/putong/core/businessdata/meet/MeetFeedNoSvipItemData;Ll/d30;Lkotlin/jvm/functions/Function0;Lcom/p1/mobile/putong/core/newui/newmeet/frag/meet/NewMeetFragPresenter;)V", "Lcom/p1/mobile/putong/core/businessdata/meet/IMeetListData;", "data", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/businessdata/meet/IMeetListData;)I", "Landroid/view/View;", OMSTemplateModeType.view, "c", "(Landroid/view/View;)V", "Landroid/widget/LinearLayout;", "a", "Landroid/widget/LinearLayout;", "get_container", "()Landroid/widget/LinearLayout;", "set_container", "(Landroid/widget/LinearLayout;)V", "_container", "b", "Landroid/view/View;", "get_cover", "()Landroid/view/View;", "set_cover", "_cover", "Landroid/widget/Button;", "Landroid/widget/Button;", "get_unlock", "()Landroid/widget/Button;", "set_unlock", "(Landroid/widget/Button;)V", "_unlock", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class MeetFeedNoSvipItemView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public LinearLayout _container;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public View _cover;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public Button _unlock;

    public /* synthetic */ MeetFeedNoSvipItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: a */
    public static void m42821a(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m42823f(d30 d30Var, View view) {
        d30Var.call();
    }

    /* JADX INFO: renamed from: c */
    public final void m42824c(View view) {
        x0y.m206654a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final int m42825d(@NotNull IMeetListData data) {
        data.getClass();
        if (data instanceof MeetGuideToSwipeCardItemData) {
            return 7;
        }
        if (data instanceof MeetFeedImageItemData) {
            return 1;
        }
        if (data instanceof MeetFeedVideoItemData) {
            return 2;
        }
        if (data instanceof MeetFeedSeeItemData) {
            return 4;
        }
        if (data instanceof MeetFeedUserItemData) {
            return 5;
        }
        return data instanceof MeetFeedNoSvipItemData ? 8 : -1;
    }

    /* JADX INFO: renamed from: e */
    public final void m42826e(@NotNull MeetFeedNoSvipItemData itemData, @NotNull final d30 viewClickAction, @Nullable final Function0<Unit> clickAction, @NotNull NewMeetFragPresenter presenter) {
        itemData.getClass();
        viewClickAction.getClass();
        presenter.getClass();
        get_container().removeAllViews();
        if (vwb.m200296J(itemData.feedList)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        List<IMeetListData> list = itemData.feedList;
        list.getClass();
        for (IMeetListData iMeetListData : list) {
            LinearLayout linearLayout = get_container();
            iMeetListData.getClass();
            MeetFeedBaseItemView meetFeedBaseItemViewM191366b = u0y.m191366b(linearLayout, m42825d(iMeetListData));
            meetFeedBaseItemViewM191366b.m42808B0((AbsMeetListData) iMeetListData, presenter);
            get_container().addView(meetFeedBaseItemViewM191366b);
            if (!CoreModule.m29935P().m94656g().mo35011Fs()) {
                get_cover().setOnClickListener(new View.OnClickListener() { // from class: l.v0y
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MeetFeedNoSvipItemView.m42823f(viewClickAction, view);
                    }
                });
            }
        }
        get_unlock().setOnClickListener(new View.OnClickListener() { // from class: l.w0y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeetFeedNoSvipItemView.m42821a(clickAction, view);
            }
        });
    }

    @NotNull
    public final LinearLayout get_container() {
        LinearLayout linearLayout = this._container;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_container");
        return null;
    }

    @NotNull
    public final View get_cover() {
        View view = this._cover;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_cover");
        return null;
    }

    @NotNull
    public final Button get_unlock() {
        Button button = this._unlock;
        if (button != null) {
            return button;
        }
        Intrinsics.m87502r("_unlock");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42824c(this);
        Button button = get_unlock();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        button.setText(String.format("开通%s，解锁%s", Arrays.copyOf(new Object[]{"SVIP", g2y.m124191a()}, 2)));
    }

    public final void set_container(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this._container = linearLayout;
    }

    public final void set_cover(@NotNull View view) {
        view.getClass();
        this._cover = view;
    }

    public final void set_unlock(@NotNull Button button) {
        button.getClass();
        this._unlock = button;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MeetFeedNoSvipItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MeetFeedNoSvipItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MeetFeedNoSvipItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
