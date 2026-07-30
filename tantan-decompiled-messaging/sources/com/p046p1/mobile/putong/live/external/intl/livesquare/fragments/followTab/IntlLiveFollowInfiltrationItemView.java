package com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.followTab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.Careers;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.ActivitySuggests;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VLinear;
import p147v.VText;
import p149l.i3o;
import p149l.m8o;
import p149l.mtn;
import p149l.sun;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!R\"\u0010(\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010/\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00106\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010:\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00103\"\u0004\b9\u00105R\"\u0010>\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u00101\u001a\u0004\b<\u00103\"\u0004\b=\u00105R$\u0010D\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010\u001d¨\u0006E"}, m87232d2 = {"Lcom/p1/mobile/putong/live/external/intl/livesquare/fragments/followTab/IntlLiveFollowInfiltrationItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attributeSet", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Ll/i3o;", "presenter", "Ll/mtn;", "liveActivitiesInfo", "c", "(Ll/i3o;Ll/mtn;)V", "Lcom/p1/mobile/putong/live/base/data/ActivitySuggests;", Careers.f38732it, "b", "(Lcom/p1/mobile/putong/live/base/data/ActivitySuggests;)V", "Landroid/view/View;", OMSTemplateModeType.view, "a", "(Landroid/view/View;)V", "Lv/VText;", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "Lv/VLinear;", "Lv/VLinear;", "get_hor", "()Lv/VLinear;", "set_hor", "(Lv/VLinear;)V", "_hor", "Lcom/p1/mobile/putong/live/external/intl/livesquare/fragments/followTab/IntlLiveFollowInfiltrationItemPicView;", "Lcom/p1/mobile/putong/live/external/intl/livesquare/fragments/followTab/IntlLiveFollowInfiltrationItemPicView;", "get_hor_item_1", "()Lcom/p1/mobile/putong/live/external/intl/livesquare/fragments/followTab/IntlLiveFollowInfiltrationItemPicView;", "set_hor_item_1", "(Lcom/p1/mobile/putong/live/external/intl/livesquare/fragments/followTab/IntlLiveFollowInfiltrationItemPicView;)V", "_hor_item_1", Constants.INAPP_DATA_TAG, "get_hor_item_2", "set_hor_item_2", "_hor_item_2", "e", "get_hor_item_3", "set_hor_item_3", "_hor_item_3", "f", "Lcom/p1/mobile/putong/live/base/data/ActivitySuggests;", "getLiveSuggests", "()Lcom/p1/mobile/putong/live/base/data/ActivitySuggests;", "setLiveSuggests", "liveSuggests", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class IntlLiveFollowInfiltrationItemView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VLinear _hor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public IntlLiveFollowInfiltrationItemPicView _hor_item_1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public IntlLiveFollowInfiltrationItemPicView _hor_item_2;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public IntlLiveFollowInfiltrationItemPicView _hor_item_3;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public ActivitySuggests liveSuggests;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntlLiveFollowInfiltrationItemView(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m70078a(View view) {
        sun.m186016a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m70079b(@NotNull ActivitySuggests it) {
        it.getClass();
        this.liveSuggests = it;
    }

    /* JADX INFO: renamed from: c */
    public final void m70080c(@NotNull i3o presenter, @NotNull mtn liveActivitiesInfo) {
        int i;
        int i2;
        presenter.getClass();
        liveActivitiesInfo.getClass();
        m8o m8oVar = liveActivitiesInfo.m156320l().get(this.liveSuggests);
        if (m8oVar != null) {
            IntlLiveFollowInfiltrationItemPicView intlLiveFollowInfiltrationItemPicView = get_hor_item_1();
            int i3 = 4;
            if (m8oVar.m153487a().size() < 1) {
                i = 4;
            } else {
                get_hor_item_1().m70077d(presenter, m8oVar.m153487a().get(0), liveActivitiesInfo, this.liveSuggests, 0);
                i = 0;
            }
            intlLiveFollowInfiltrationItemPicView.setVisibility(i);
            IntlLiveFollowInfiltrationItemPicView intlLiveFollowInfiltrationItemPicView2 = get_hor_item_2();
            if (m8oVar.m153487a().size() < 2) {
                i2 = 4;
            } else {
                get_hor_item_2().m70077d(presenter, m8oVar.m153487a().get(1), liveActivitiesInfo, this.liveSuggests, 1);
                i2 = 0;
            }
            intlLiveFollowInfiltrationItemPicView2.setVisibility(i2);
            IntlLiveFollowInfiltrationItemPicView intlLiveFollowInfiltrationItemPicView3 = get_hor_item_3();
            if (m8oVar.m153487a().size() >= 3) {
                get_hor_item_3().m70077d(presenter, m8oVar.m153487a().get(2), liveActivitiesInfo, this.liveSuggests, 2);
                i3 = 0;
            }
            intlLiveFollowInfiltrationItemPicView3.setVisibility(i3);
            ActivitySuggests activitySuggests = this.liveSuggests;
            if (activitySuggests != null) {
                get_title().setText(activitySuggests.category);
            }
        }
    }

    @Nullable
    public final ActivitySuggests getLiveSuggests() {
        return this.liveSuggests;
    }

    @NotNull
    public final VLinear get_hor() {
        VLinear vLinear = this._hor;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_hor");
        return null;
    }

    @NotNull
    public final IntlLiveFollowInfiltrationItemPicView get_hor_item_1() {
        IntlLiveFollowInfiltrationItemPicView intlLiveFollowInfiltrationItemPicView = this._hor_item_1;
        if (intlLiveFollowInfiltrationItemPicView != null) {
            return intlLiveFollowInfiltrationItemPicView;
        }
        Intrinsics.m87502r("_hor_item_1");
        return null;
    }

    @NotNull
    public final IntlLiveFollowInfiltrationItemPicView get_hor_item_2() {
        IntlLiveFollowInfiltrationItemPicView intlLiveFollowInfiltrationItemPicView = this._hor_item_2;
        if (intlLiveFollowInfiltrationItemPicView != null) {
            return intlLiveFollowInfiltrationItemPicView;
        }
        Intrinsics.m87502r("_hor_item_2");
        return null;
    }

    @NotNull
    public final IntlLiveFollowInfiltrationItemPicView get_hor_item_3() {
        IntlLiveFollowInfiltrationItemPicView intlLiveFollowInfiltrationItemPicView = this._hor_item_3;
        if (intlLiveFollowInfiltrationItemPicView != null) {
            return intlLiveFollowInfiltrationItemPicView;
        }
        Intrinsics.m87502r("_hor_item_3");
        return null;
    }

    @NotNull
    public final VText get_title() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70078a(this);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        measureChildWithMargins(get_title(), widthMeasureSpec, 0, heightMeasureSpec, 0);
        ViewGroup.LayoutParams layoutParams = get_title().getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int measuredHeight = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + get_title().getMeasuredHeight();
        int size = (View.MeasureSpec.getSize(widthMeasureSpec) - xdl0.m208407w(30.0f)) / 3;
        setMeasuredDimension(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight + size, 1073741824));
        measureChildWithMargins(get_hor(), widthMeasureSpec, 0, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
    }

    public final void setLiveSuggests(@Nullable ActivitySuggests activitySuggests) {
        this.liveSuggests = activitySuggests;
    }

    public final void set_hor(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._hor = vLinear;
    }

    public final void set_hor_item_1(@NotNull IntlLiveFollowInfiltrationItemPicView intlLiveFollowInfiltrationItemPicView) {
        intlLiveFollowInfiltrationItemPicView.getClass();
        this._hor_item_1 = intlLiveFollowInfiltrationItemPicView;
    }

    public final void set_hor_item_2(@NotNull IntlLiveFollowInfiltrationItemPicView intlLiveFollowInfiltrationItemPicView) {
        intlLiveFollowInfiltrationItemPicView.getClass();
        this._hor_item_2 = intlLiveFollowInfiltrationItemPicView;
    }

    public final void set_hor_item_3(@NotNull IntlLiveFollowInfiltrationItemPicView intlLiveFollowInfiltrationItemPicView) {
        intlLiveFollowInfiltrationItemPicView.getClass();
        this._hor_item_3 = intlLiveFollowInfiltrationItemPicView;
    }

    public final void set_title(@NotNull VText vText) {
        vText.getClass();
        this._title = vText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntlLiveFollowInfiltrationItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlLiveFollowInfiltrationItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
