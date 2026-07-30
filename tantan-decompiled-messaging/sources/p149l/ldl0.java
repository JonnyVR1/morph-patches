package p149l;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"Landroid/view/View;", "Ll/jcr;", "lifecycleOwner", "", "b", "(Landroid/view/View;Ll/jcr;)V", "a", "(Landroid/view/View;)Ll/jcr;", "lifecycle-runtime_release"}, m87233k = 2, m87234mv = {2, 0, 0}, m87236xi = 48)
@JvmName
public final class ldl0 {
    @JvmName
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final jcr m149446a(@NotNull View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(q5c0.f152754a);
            jcr jcrVar = tag instanceof jcr ? (jcr) tag : null;
            if (jcrVar != null) {
                return jcrVar;
            }
            Object objM145647a = kdl0.m145647a(view);
            view = objM145647a instanceof View ? (View) objM145647a : null;
        }
        return null;
    }

    @JvmName
    /* JADX INFO: renamed from: b */
    public static final void m149447b(@NotNull View view, @Nullable jcr jcrVar) {
        view.getClass();
        view.setTag(q5c0.f152754a, jcrVar);
    }
}
