package com.p000p1.mobile.putong.core.newui.intlmeet.tribe;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.xdl0;
import l.zco;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010)\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u001bR\"\u0010/\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\u0013R\"\u00102\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u0010\u0017¨\u00065"}, d2 = {"Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetFrag2TabView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "", "text", "k0", "(Ljava/lang/CharSequence;)V", "count", "j0", "(I)V", "", "current", "i0", "(Z)V", "Landroid/view/View;", "view", "h0", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "d", "Landroid/widget/TextView;", "get_title_tv", "()Landroid/widget/TextView;", "set_title_tv", "(Landroid/widget/TextView;)V", "_title_tv", "e", "Landroid/view/View;", "get_red_dot", "()Landroid/view/View;", "set_red_dot", "_red_dot", "f", "I", "getRedDotCount", "()I", "setRedDotCount", "redDotCount", "g", "Z", "isCurrent", "()Z", "setCurrent", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IntlMeetFrag2TabView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _title_tv;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public View _red_dot;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int redDotCount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isCurrent;

    public /* synthetic */ IntlMeetFrag2TabView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final int getRedDotCount() {
        return this.redDotCount;
    }

    @NotNull
    public final View get_red_dot() {
        View view = this._red_dot;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_red_dot");
        return null;
    }

    @NotNull
    public final TextView get_title_tv() {
        TextView textView = this._title_tv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_title_tv");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m3488h0(View view) {
        zco.a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m3489i0(boolean current) {
        this.isCurrent = current;
        if (current || this.redDotCount <= 0) {
            xdl0.M(get_red_dot(), false);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m3490j0(int count) {
        this.redDotCount = count;
        xdl0.M(get_red_dot(), !this.isCurrent && this.redDotCount > 0);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m3491k0(@NotNull CharSequence text) {
        text.getClass();
        get_title_tv().setText(text);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3488h0(this);
    }

    public final void setCurrent(boolean z) {
        this.isCurrent = z;
    }

    public final void setRedDotCount(int i) {
        this.redDotCount = i;
    }

    public final void set_red_dot(@NotNull View view) {
        view.getClass();
        this._red_dot = view;
    }

    public final void set_title_tv(@NotNull TextView textView) {
        textView.getClass();
        this._title_tv = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlMeetFrag2TabView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlMeetFrag2TabView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlMeetFrag2TabView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
