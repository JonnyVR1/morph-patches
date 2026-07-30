package com.p051p1.mobile.putong.core.p058ui.visitor.myvisitors;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VLinear;
import p153l.ba20;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010#\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016¨\u0006$"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsFooterView;", "Lv/VLinear;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Q", "Landroid/view/View;", OMSTemplateModeType.view, "P", "(Landroid/view/View;)V", "Lv/VImage;", "c", "Lv/VImage;", "get_left", "()Lv/VImage;", "set_left", "(Lv/VImage;)V", "_left", "Landroid/widget/TextView;", Constants.INAPP_DATA_TAG, "Landroid/widget/TextView;", "get_text", "()Landroid/widget/TextView;", "set_text", "(Landroid/widget/TextView;)V", "_text", "e", "get_right", "set_right", "_right", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class MyVisitorsFooterView extends VLinear {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VImage _left;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _text;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VImage _right;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public MyVisitorsFooterView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: P */
    public final void m59218P(View view) {
        ba20.m103147a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public final void m59219Q() {
        get_text().setText("没有更多我看过的人");
    }

    @NotNull
    public final VImage get_left() {
        VImage vImage = this._left;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_left");
        return null;
    }

    @NotNull
    public final VImage get_right() {
        VImage vImage = this._right;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_right");
        return null;
    }

    @NotNull
    public final TextView get_text() {
        TextView textView = this._text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_text");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m59218P(this);
    }

    public final void set_left(@NotNull VImage vImage) {
        vImage.getClass();
        this._left = vImage;
    }

    public final void set_right(@NotNull VImage vImage) {
        vImage.getClass();
        this._right = vImage;
    }

    public final void set_text(@NotNull TextView textView) {
        textView.getClass();
        this._text = textView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MyVisitorsFooterView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ MyVisitorsFooterView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
