package com.p046p1.mobile.putong.live.base.vap.textureview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TextureView;
import com.p046p1.mobile.putong.core.data.GameIdentity;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ep0;
import p149l.fp0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m87232d2 = {"Lcom/p1/mobile/putong/live/base/vap/textureview/InnerTextureView;", "Landroid/view/TextureView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Ll/ep0;", "a", "Ll/ep0;", "getPlayer", "()Ll/ep0;", "setPlayer", "(Ll/ep0;)V", GameIdentity.player, "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class InnerTextureView extends TextureView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public ep0 player;

    public /* synthetic */ InnerTextureView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
        ep0 ep0Var;
        fp0 pluginManager;
        ep0 ep0Var2 = this.player;
        if (ep0Var2 == null || !ep0Var2.m117542o() || ev == null || (ep0Var = this.player) == null || (pluginManager = ep0Var.getPluginManager()) == null || !pluginManager.m122549e(ev)) {
            return super.dispatchTouchEvent(ev);
        }
        return true;
    }

    @Nullable
    public final ep0 getPlayer() {
        return this.player;
    }

    public final void setPlayer(@Nullable ep0 ep0Var) {
        this.player = ep0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InnerTextureView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InnerTextureView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InnerTextureView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
