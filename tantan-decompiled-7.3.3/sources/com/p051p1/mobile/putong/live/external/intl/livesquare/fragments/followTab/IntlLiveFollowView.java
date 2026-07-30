package com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.followTab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.ViewGroupKt;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.ActivitySuggests;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.followTab.IntlLiveFollowView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.i5o;
import p153l.ldc0;
import p153l.mvn;
import p153l.qa00;
import p153l.vwn;
import p153l.xec0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\"\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0019R\"\u0010)\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00100\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00107\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010;\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u0010$\u001a\u0004\b9\u0010&\"\u0004\b:\u0010(R\"\u0010?\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010\u001e\u001a\u0004\b=\u0010 \"\u0004\b>\u0010\u0019R\"\u0010C\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010\u001e\u001a\u0004\bA\u0010 \"\u0004\bB\u0010\u0019¨\u0006D"}, m88121d2 = {"Lcom/p1/mobile/putong/live/external/intl/livesquare/fragments/followTab/IntlLiveFollowView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attributeSet", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Ll/i5o;", "presenter", "Ll/mvn;", "liveActivitiesInfo", Constants.INAPP_DATA_TAG, "(Ll/i5o;Ll/mvn;)V", "Landroid/view/View;", OMSTemplateModeType.view, "b", "(Landroid/view/View;)V", "", "c", "(Ll/mvn;)Z", "a", "Landroid/view/View;", "get_top_divide", "()Landroid/view/View;", "set_top_divide", "_top_divide", "Lv/VLinear;", "Lv/VLinear;", "get_infiltration_top", "()Lv/VLinear;", "set_infiltration_top", "(Lv/VLinear;)V", "_infiltration_top", "Lv/VImage;", "Lv/VImage;", "get_infiltration_top_refresh", "()Lv/VImage;", "set_infiltration_top_refresh", "(Lv/VImage;)V", "_infiltration_top_refresh", "Lv/VText;", "Lv/VText;", "get_infiltration_top_change_one", "()Lv/VText;", "set_infiltration_top_change_one", "(Lv/VText;)V", "_infiltration_top_change_one", "e", "get_content", "set_content", "_content", "f", "get_bottom_empty", "set_bottom_empty", "_bottom_empty", "g", "get_bottom_divide", "set_bottom_divide", "_bottom_divide", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class IntlLiveFollowView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public View _top_divide;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VLinear _infiltration_top;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VImage _infiltration_top_refresh;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _infiltration_top_change_one;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VLinear _content;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public View _bottom_empty;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public View _bottom_divide;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntlLiveFollowView(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public static void m71264a(i5o i5oVar, View view) {
        i5oVar.m138749k3();
    }

    /* JADX INFO: renamed from: b */
    public final void m71265b(View view) {
        vwn.m203170a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m71266c(mvn liveActivitiesInfo) {
        if (get_content().getChildCount() == 0 || get_content().getChildCount() != liveActivitiesInfo.m160288h().size()) {
            return false;
        }
        List<ActivitySuggests> listM160288h = liveActivitiesInfo.m160288h();
        listM160288h.getClass();
        for (ActivitySuggests activitySuggests : listM160288h) {
            int childCount = get_content().getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (!Intrinsics.m88377d(activitySuggests.f45170id, get_content().getChildAt(i).getTag(ldc0.f131490O0))) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m71267d(@NotNull final i5o presenter, @NotNull mvn liveActivitiesInfo) {
        presenter.getClass();
        liveActivitiesInfo.getClass();
        if (!m71266c(liveActivitiesInfo)) {
            get_content().removeAllViews();
            List<ActivitySuggests> listM160288h = liveActivitiesInfo.m160288h();
            listM160288h.getClass();
            for (ActivitySuggests activitySuggests : listM160288h) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(xec0.f193778F, (ViewGroup) null);
                viewInflate.getClass();
                IntlLiveFollowInfiltrationItemView intlLiveFollowInfiltrationItemView = (IntlLiveFollowInfiltrationItemView) viewInflate;
                activitySuggests.getClass();
                intlLiveFollowInfiltrationItemView.m71262b(activitySuggests);
                intlLiveFollowInfiltrationItemView.setTag(ldc0.f131490O0, activitySuggests.f45170id);
                get_content().addView(intlLiveFollowInfiltrationItemView);
            }
        }
        for (View view : ViewGroupKt.m1330b(get_content())) {
            view.getClass();
            ((IntlLiveFollowInfiltrationItemView) view).m71263c(presenter, liveActivitiesInfo);
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.uwn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                IntlLiveFollowView.m71264a(presenter, view2);
            }
        };
        get_infiltration_top_refresh().setOnClickListener(onClickListener);
        get_infiltration_top_change_one().setOnClickListener(onClickListener);
        int iM160290j = liveActivitiesInfo.m160290j();
        bnl0.m105524M(get_bottom_divide(), iM160290j > 0);
        bnl0.m105524M(get_bottom_empty(), iM160290j == 0);
        bnl0.m105524M(get_top_divide(), iM160290j > 0);
        ViewGroup.LayoutParams layoutParams = get_infiltration_top().getLayoutParams();
        layoutParams.getClass();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        if (iM160290j == 0) {
            layoutParams2.topMargin = 0;
        } else {
            layoutParams2.topMargin = qa00.f156330q;
        }
        get_infiltration_top().setLayoutParams(layoutParams2);
    }

    @NotNull
    public final View get_bottom_divide() {
        View view = this._bottom_divide;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_bottom_divide");
        return null;
    }

    @NotNull
    public final View get_bottom_empty() {
        View view = this._bottom_empty;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_bottom_empty");
        return null;
    }

    @NotNull
    public final VLinear get_content() {
        VLinear vLinear = this._content;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_content");
        return null;
    }

    @NotNull
    public final VLinear get_infiltration_top() {
        VLinear vLinear = this._infiltration_top;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_infiltration_top");
        return null;
    }

    @NotNull
    public final VText get_infiltration_top_change_one() {
        VText vText = this._infiltration_top_change_one;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_infiltration_top_change_one");
        return null;
    }

    @NotNull
    public final VImage get_infiltration_top_refresh() {
        VImage vImage = this._infiltration_top_refresh;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_infiltration_top_refresh");
        return null;
    }

    @NotNull
    public final View get_top_divide() {
        View view = this._top_divide;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_top_divide");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71265b(this);
    }

    public final void set_bottom_divide(@NotNull View view) {
        view.getClass();
        this._bottom_divide = view;
    }

    public final void set_bottom_empty(@NotNull View view) {
        view.getClass();
        this._bottom_empty = view;
    }

    public final void set_content(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._content = vLinear;
    }

    public final void set_infiltration_top(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._infiltration_top = vLinear;
    }

    public final void set_infiltration_top_change_one(@NotNull VText vText) {
        vText.getClass();
        this._infiltration_top_change_one = vText;
    }

    public final void set_infiltration_top_refresh(@NotNull VImage vImage) {
        vImage.getClass();
        this._infiltration_top_refresh = vImage;
    }

    public final void set_top_divide(@NotNull View view) {
        view.getClass();
        this._top_divide = view;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntlLiveFollowView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlLiveFollowView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
