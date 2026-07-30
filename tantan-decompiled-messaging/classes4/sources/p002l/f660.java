package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import kotlin.Metadata;
import l.jtk;
import l.kvc0;
import l.t100;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll/f660;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/view/View;", "targetView", "", "bubbleFlag", "", "a", "(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f660 {

    @NotNull
    public static final f660 INSTANCE = new f660();

    /* JADX INFO: renamed from: a */
    public final void m12952a(@NotNull Context context, @NotNull View targetView, @NotNull String bubbleFlag) {
        context.getClass();
        targetView.getClass();
        bubbleFlag.getClass();
        d.l().u(new a(context).k(new int[]{kvc0.a(h1c0.f11814p0)}).s(LayoutInflater.from(context).inflate(t6c0.f19938n1, (ViewGroup) null)).v(t100.d(16.0f)).x(-t100.d(5.0f)).q(jtk.D).b(3000L).e(true), targetView, bubbleFlag);
    }
}
