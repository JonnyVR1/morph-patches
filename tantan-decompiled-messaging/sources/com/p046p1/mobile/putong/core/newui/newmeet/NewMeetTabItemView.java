package com.p046p1.mobile.putong.core.newui.newmeet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VOnlineIndicator;
import p147v.VText;
import p149l.lj30;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\fJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010&\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010-\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00104\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010;\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010B\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006C"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/newmeet/NewMeetTabItemView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "", "text", "e", "(Ljava/lang/CharSequence;)V", "", "show", "f", "(Z)V", "c", "()Z", "", "count", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)V", "b", "Landroid/view/View;", OMSTemplateModeType.view, "a", "(Landroid/view/View;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_content_container", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_content_container", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_content_container", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_title_tv", "()Landroid/widget/TextView;", "set_title_tv", "(Landroid/widget/TextView;)V", "_title_tv", "Landroidx/legacy/widget/Space;", "Landroidx/legacy/widget/Space;", "get_red_dot_reference_point", "()Landroidx/legacy/widget/Space;", "set_red_dot_reference_point", "(Landroidx/legacy/widget/Space;)V", "_red_dot_reference_point", "Lv/VOnlineIndicator;", "Lv/VOnlineIndicator;", "get_red_dot", "()Lv/VOnlineIndicator;", "set_red_dot", "(Lv/VOnlineIndicator;)V", "_red_dot", "Lv/VText;", "Lv/VText;", "get_num_badge_tv", "()Lv/VText;", "set_num_badge_tv", "(Lv/VText;)V", "_num_badge_tv", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class NewMeetTabItemView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public ConstraintLayout _content_container;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public TextView _title_tv;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public Space _red_dot_reference_point;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VOnlineIndicator _red_dot;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _num_badge_tv;

    public /* synthetic */ NewMeetTabItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: a */
    public final void m42755a(View view) {
        lj30.m149954a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m42756b() {
        xdl0.m208344M(get_num_badge_tv(), false);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m42757c() {
        return xdl0.m208349O0(get_red_dot()) || xdl0.m208349O0(get_num_badge_tv());
    }

    /* JADX INFO: renamed from: d */
    public final void m42758d(@NotNull String count) {
        count.getClass();
        get_num_badge_tv().setText(count);
        xdl0.m208344M(get_num_badge_tv(), true);
        xdl0.m208344M(get_red_dot(), false);
    }

    /* JADX INFO: renamed from: e */
    public final void m42759e(@NotNull CharSequence text) {
        text.getClass();
        get_title_tv().setText(text);
    }

    /* JADX INFO: renamed from: f */
    public final void m42760f(boolean show) {
        xdl0.m208344M(get_red_dot(), show);
    }

    @NotNull
    public final ConstraintLayout get_content_container() {
        ConstraintLayout constraintLayout = this._content_container;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_content_container");
        return null;
    }

    @NotNull
    public final VText get_num_badge_tv() {
        VText vText = this._num_badge_tv;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_num_badge_tv");
        return null;
    }

    @NotNull
    public final VOnlineIndicator get_red_dot() {
        VOnlineIndicator vOnlineIndicator = this._red_dot;
        if (vOnlineIndicator != null) {
            return vOnlineIndicator;
        }
        Intrinsics.m87502r("_red_dot");
        return null;
    }

    @NotNull
    public final Space get_red_dot_reference_point() {
        Space space = this._red_dot_reference_point;
        if (space != null) {
            return space;
        }
        Intrinsics.m87502r("_red_dot_reference_point");
        return null;
    }

    @NotNull
    public final TextView get_title_tv() {
        TextView textView = this._title_tv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_title_tv");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42755a(this);
    }

    public final void set_content_container(@NotNull ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        this._content_container = constraintLayout;
    }

    public final void set_num_badge_tv(@NotNull VText vText) {
        vText.getClass();
        this._num_badge_tv = vText;
    }

    public final void set_red_dot(@NotNull VOnlineIndicator vOnlineIndicator) {
        vOnlineIndicator.getClass();
        this._red_dot = vOnlineIndicator;
    }

    public final void set_red_dot_reference_point(@NotNull Space space) {
        space.getClass();
        this._red_dot_reference_point = space;
    }

    public final void set_title_tv(@NotNull TextView textView) {
        textView.getClass();
        this._title_tv = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewMeetTabItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewMeetTabItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewMeetTabItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
