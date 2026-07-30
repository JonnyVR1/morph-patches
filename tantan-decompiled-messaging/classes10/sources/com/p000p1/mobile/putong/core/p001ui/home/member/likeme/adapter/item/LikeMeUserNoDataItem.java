package com.p000p1.mobile.putong.core.p001ui.home.member.likeme.adapter.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003l.zcr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0018\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/p1/mobile/putong/core/ui/home/member/likeme/adapter/item/LikeMeUserNoDataItem;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "b", "Landroid/view/View;", "view", "a", "(Landroid/view/View;)V", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "get_no_data_icon", "()Landroid/widget/ImageView;", "set_no_data_icon", "(Landroid/widget/ImageView;)V", "_no_data_icon", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_no_more_text", "()Landroid/widget/TextView;", "set_no_more_text", "(Landroid/widget/TextView;)V", "_no_more_text", "member_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class LikeMeUserNoDataItem extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public ImageView _no_data_icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public TextView _no_more_text;

    public /* synthetic */ LikeMeUserNoDataItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: a */
    public final void m3459a(View view) {
        zcr.m11387a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m3460b() {
        get_no_more_text().setText("当前筛选没有内容，换个标签试试");
    }

    @NotNull
    public final ImageView get_no_data_icon() {
        ImageView imageView = this._no_data_icon;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_no_data_icon");
        return null;
    }

    @NotNull
    public final TextView get_no_more_text() {
        TextView textView = this._no_more_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_no_more_text");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3459a(this);
    }

    public final void set_no_data_icon(@NotNull ImageView imageView) {
        imageView.getClass();
        this._no_data_icon = imageView;
    }

    public final void set_no_more_text(@NotNull TextView textView) {
        textView.getClass();
        this._no_more_text = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LikeMeUserNoDataItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LikeMeUserNoDataItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LikeMeUserNoDataItem(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
