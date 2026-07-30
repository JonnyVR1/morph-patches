package p153l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DrawableRes;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.pushbubble.SimplePushBubble;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Ll/p1j0;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "ctx", "", "str", "", "leftIconRes", "", "b", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/Integer;)V", "Landroid/content/Context;", "", "a", "(Landroid/content/Context;)Z", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class p1j0 {

    @NotNull
    public static final p1j0 INSTANCE = new p1j0();

    /* JADX INFO: renamed from: a */
    public final boolean m170209a(@Nullable Context ctx) {
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
    public final void m170210b(@NotNull Act ctx, @Nullable String str, @DrawableRes @Nullable Integer leftIconRes) {
        ctx.getClass();
        if (m170209a(ctx)) {
            View viewInflate = LayoutInflater.from(ctx).inflate(jec0.f120457c, (ViewGroup) null);
            viewInflate.getClass();
            VText vText = (VText) viewInflate;
            vText.setText(str);
            if (leftIconRes != null) {
                vText.setCompoundDrawablePadding(qa00.f156322i);
                Drawable drawableM192702b = tu0.m192702b(ctx, leftIconRes.intValue());
                if (drawableM192702b != null) {
                    vText.setCompoundDrawablesWithIntrinsicBounds(drawableM192702b, (Drawable) null, (Drawable) null, (Drawable) null);
                }
            }
            llb0.m154703c().m154710i(new SimplePushBubble.C4523a(ctx, vText).m22174y(new ViewGroup.LayoutParams(-1, -2)).m22175z(new b3m("common_intl_birthday_hint_layout")).m22168s());
        }
    }
}
