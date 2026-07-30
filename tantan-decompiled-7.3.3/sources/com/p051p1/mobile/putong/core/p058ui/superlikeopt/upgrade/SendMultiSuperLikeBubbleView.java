package com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade.SendMultiSuperLikeBubbleView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bnl0;
import p153l.x20;
import p153l.zoe0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010 \u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001c¨\u0006!"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/superlikeopt/upgrade/SendMultiSuperLikeBubbleView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "num", "Ll/x20;", "onConfirm", "c", "(ILl/x20;)V", "Landroid/view/View;", OMSTemplateModeType.view, "b", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "get_superlike_count", "()Landroid/widget/TextView;", "set_superlike_count", "(Landroid/widget/TextView;)V", "_superlike_count", "get_send", "set_send", "_send", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class SendMultiSuperLikeBubbleView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public TextView _superlike_count;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public TextView _send;

    public /* synthetic */ SendMultiSuperLikeBubbleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: a */
    public static void m56950a(x20 x20Var, View view) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m56951b(View view) {
        zoe0.m220750a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m56952c(int num, @Nullable final x20 onConfirm) {
        TextView textView = get_superlike_count();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        textView.setText(String.format("%s个超级喜欢！", Arrays.copyOf(new Object[]{Integer.valueOf(num)}, 1)));
        bnl0.m105509E0(get_send(), new View.OnClickListener() { // from class: l.yoe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SendMultiSuperLikeBubbleView.m56950a(onConfirm, view);
            }
        });
    }

    @NotNull
    public final TextView get_send() {
        TextView textView = this._send;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_send");
        return null;
    }

    @NotNull
    public final TextView get_superlike_count() {
        TextView textView = this._superlike_count;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_superlike_count");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56951b(this);
    }

    public final void set_send(@NotNull TextView textView) {
        textView.getClass();
        this._send = textView;
    }

    public final void set_superlike_count(@NotNull TextView textView) {
        textView.getClass();
        this._superlike_count = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMultiSuperLikeBubbleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMultiSuperLikeBubbleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMultiSuperLikeBubbleView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
