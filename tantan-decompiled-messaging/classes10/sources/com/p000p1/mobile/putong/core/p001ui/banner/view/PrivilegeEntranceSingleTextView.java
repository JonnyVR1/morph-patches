package com.p000p1.mobile.putong.core.p001ui.banner.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003l.k490;
import p003l.t0m;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010#\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016¨\u0006$"}, d2 = {"Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Ll/t0m;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Landroid/view/View;", "view", "h0", "(Landroid/view/View;)V", "Lv/VImage;", "d", "Lv/VImage;", "get_texture", "()Lv/VImage;", "set_texture", "(Lv/VImage;)V", "_texture", "Lv/VText;", "e", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "f", "get_go", "set_go", "_go", "pay_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class PrivilegeEntranceSingleTextView extends ConstraintLayout implements t0m {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VImage _texture;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VImage _go;

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public PrivilegeEntranceSingleTextView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    @NotNull
    public final VImage get_go() {
        VImage vImage = this._go;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_go");
        return null;
    }

    @NotNull
    public final VImage get_texture() {
        VImage vImage = this._texture;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_texture");
        return null;
    }

    @NotNull
    public final VText get_title() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_title");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m1695h0(View view) {
        k490.m7529a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m1695h0(this);
    }

    public final void set_go(@NotNull VImage vImage) {
        vImage.getClass();
        this._go = vImage;
    }

    public final void set_texture(@NotNull VImage vImage) {
        vImage.getClass();
        this._texture = vImage;
    }

    public final void set_title(@NotNull VText vText) {
        vText.getClass();
        this._title = vText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PrivilegeEntranceSingleTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ PrivilegeEntranceSingleTextView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
