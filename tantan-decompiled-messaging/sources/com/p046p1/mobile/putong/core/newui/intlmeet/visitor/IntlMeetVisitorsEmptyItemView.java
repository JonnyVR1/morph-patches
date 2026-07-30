package com.p046p1.mobile.putong.core.newui.intlmeet.visitor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;
import p149l.wjo;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0018\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006)"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorsEmptyItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "a", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorsEmptyItemView;", "get_root", "()Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorsEmptyItemView;", "set_root", "(Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorsEmptyItemView;)V", "_root", "Landroid/widget/ImageView;", "b", "Landroid/widget/ImageView;", "get_empty_img", "()Landroid/widget/ImageView;", "set_empty_img", "(Landroid/widget/ImageView;)V", "_empty_img", "Lv/VText;", "c", "Lv/VText;", "get_empty_tv", "()Lv/VText;", "set_empty_tv", "(Lv/VText;)V", "_empty_tv", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class IntlMeetVisitorsEmptyItemView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public IntlMeetVisitorsEmptyItemView _root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public ImageView _empty_img;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _empty_tv;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlMeetVisitorsEmptyItemView(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m39510a(View view) {
        wjo.m203479a(this, view);
    }

    @NotNull
    public final ImageView get_empty_img() {
        ImageView imageView = this._empty_img;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_empty_img");
        return null;
    }

    @NotNull
    public final VText get_empty_tv() {
        VText vText = this._empty_tv;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_empty_tv");
        return null;
    }

    @NotNull
    public final IntlMeetVisitorsEmptyItemView get_root() {
        IntlMeetVisitorsEmptyItemView intlMeetVisitorsEmptyItemView = this._root;
        if (intlMeetVisitorsEmptyItemView != null) {
            return intlMeetVisitorsEmptyItemView;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39510a(this);
        zvf0.m220403y("e_intl_meet_null_toast", "p_intl_meet_view", MapsKt.mapOf(new Pair("null_view", "visitor_list")));
    }

    public final void set_empty_img(@NotNull ImageView imageView) {
        imageView.getClass();
        this._empty_img = imageView;
    }

    public final void set_empty_tv(@NotNull VText vText) {
        vText.getClass();
        this._empty_tv = vText;
    }

    public final void set_root(@NotNull IntlMeetVisitorsEmptyItemView intlMeetVisitorsEmptyItemView) {
        intlMeetVisitorsEmptyItemView.getClass();
        this._root = intlMeetVisitorsEmptyItemView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlMeetVisitorsEmptyItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlMeetVisitorsEmptyItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
