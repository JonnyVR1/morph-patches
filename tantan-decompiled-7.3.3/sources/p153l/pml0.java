package p153l;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"Landroid/view/View;", "Ll/ker;", "lifecycleOwner", "", "b", "(Landroid/view/View;Ll/ker;)V", "a", "(Landroid/view/View;)Ll/ker;", "lifecycle-runtime_release"}, m88122k = 2, m88123mv = {2, 0, 0}, m88125xi = 48)
@JvmName
public final class pml0 {
    @JvmName
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final ker m172954a(@NotNull View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(vdc0.f183585a);
            ker kerVar = tag instanceof ker ? (ker) tag : null;
            if (kerVar != null) {
                return kerVar;
            }
            Object objM168235a = oml0.m168235a(view);
            view = objM168235a instanceof View ? (View) objM168235a : null;
        }
        return null;
    }

    @JvmName
    /* JADX INFO: renamed from: b */
    public static final void m172955b(@NotNull View view, @Nullable ker kerVar) {
        view.getClass();
        view.setTag(vdc0.f183585a, kerVar);
    }
}
