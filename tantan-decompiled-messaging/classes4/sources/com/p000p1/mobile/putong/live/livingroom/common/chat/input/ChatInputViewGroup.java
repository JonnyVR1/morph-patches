package com.p000p1.mobile.putong.live.livingroom.common.chat.input;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R?\u0010\u001e\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/p1/mobile/putong/live/livingroom/common/chat/input/ChatInputViewGroup;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attributeSet", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "w", "h", "oldw", "oldh", "", "onSizeChanged", "(IIII)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "size", "a", "Lkotlin/jvm/functions/Function1;", "getHeightChangeAction", "()Lkotlin/jvm/functions/Function1;", "setHeightChangeAction", "(Lkotlin/jvm/functions/Function1;)V", "heightChangeAction", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatInputViewGroup extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public Function1<? super Integer, Unit> heightChangeAction;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatInputViewGroup(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }

    @Nullable
    public final Function1<Integer, Unit> getHeightChangeAction() {
        return this.heightChangeAction;
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        Function1<? super Integer, Unit> function1 = this.heightChangeAction;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(h));
        }
    }

    public final void setHeightChangeAction(@Nullable Function1<? super Integer, Unit> function1) {
        this.heightChangeAction = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatInputViewGroup(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputViewGroup(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
