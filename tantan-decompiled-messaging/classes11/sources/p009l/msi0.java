package p009l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.DrawableRes;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.pushbubble.SimplePushBubble;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import l.e6c0;
import l.h0m;
import l.hdb0;
import l.nu0;
import l.t100;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ll/msi0;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "ctx", "", "str", "", "leftIconRes", "", "b", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/Integer;)V", "Landroid/content/Context;", "", "a", "(Landroid/content/Context;)Z", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class msi0 {

    @NotNull
    public static final msi0 INSTANCE = new msi0();

    /* JADX INFO: renamed from: a */
    public final boolean m18584a(@Nullable Context ctx) {
        if (ctx == null) {
            return false;
        }
        if (!(ctx instanceof Act)) {
            return true;
        }
        Act act = (Act) ctx;
        return (act.isFinishing() || act.isDestroyed()) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final void m18585b(@NotNull Act ctx, @Nullable String str, @DrawableRes @Nullable Integer leftIconRes) {
        ctx.getClass();
        if (m18584a(ctx)) {
            VText vTextInflate = LayoutInflater.from(ctx).inflate(e6c0.c, (ViewGroup) null);
            vTextInflate.getClass();
            VText vText = vTextInflate;
            vText.setText(str);
            if (leftIconRes != null) {
                vText.setCompoundDrawablePadding(t100.i);
                Drawable drawableB = nu0.b(ctx, leftIconRes.intValue());
                if (drawableB != null) {
                    vText.setCompoundDrawablesWithIntrinsicBounds(drawableB, (Drawable) null, (Drawable) null, (Drawable) null);
                }
            }
            hdb0.c().i(new SimplePushBubble.a(ctx, vText).y(new ViewGroup.LayoutParams(-1, -2)).z(new h0m("common_intl_birthday_hint_layout")).s());
        }
    }
}
