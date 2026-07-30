package com.p000p1.mobile.putong.live.livingroom.voice.intl.share;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.g5c0;
import l.t6c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fR\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/intl/share/IntlShareCardItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "a", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "getShareImage", "()Landroid/widget/ImageView;", "setShareImage", "(Landroid/widget/ImageView;)V", "shareImage", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "getShareName", "()Landroid/widget/TextView;", "setShareName", "(Landroid/widget/TextView;)V", "shareName", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IntlShareCardItemView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public ImageView shareImage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public TextView shareName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlShareCardItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(getContext()).inflate(t6c0.x2, (ViewGroup) this, true);
        m8670a();
    }

    /* JADX INFO: renamed from: a */
    public final void m8670a() {
        View viewFindViewById = findViewById(g5c0.P5);
        viewFindViewById.getClass();
        setShareImage((ImageView) viewFindViewById);
        View viewFindViewById2 = findViewById(g5c0.Q5);
        viewFindViewById2.getClass();
        setShareName((TextView) viewFindViewById2);
    }

    @NotNull
    public final ImageView getShareImage() {
        ImageView imageView = this.shareImage;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("shareImage");
        return null;
    }

    @NotNull
    public final TextView getShareName() {
        TextView textView = this.shareName;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("shareName");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8670a();
    }

    public final void setShareImage(@NotNull ImageView imageView) {
        imageView.getClass();
        this.shareImage = imageView;
    }

    public final void setShareName(@NotNull TextView textView) {
        textView.getClass();
        this.shareName = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlShareCardItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlShareCardItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ IntlShareCardItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
