package p153l;

import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.momo.mcamera.mask.BigEyeFilter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\b\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {"Landroid/view/View;", "Lkotlin/Function1;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "c", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "", BigEyeFilter.UNIFORM_SCALE, "b", "(Landroid/view/View;F)V", "utils_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class czq {
    /* JADX INFO: renamed from: a */
    public static void m113345a(Function1 function1, View view) {
        function1.invoke(view);
    }

    /* JADX INFO: renamed from: b */
    public static final void m113346b(@NotNull View view, float f) {
        view.getClass();
        bnl0.m105582t0(view, f);
    }

    /* JADX INFO: renamed from: c */
    public static final void m113347c(@NotNull View view, @Nullable final Function1<? super View, Unit> function1) {
        view.getClass();
        bnl0.m105509E0(view, function1 != null ? new View.OnClickListener() { // from class: l.bzq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                czq.m113345a(function1, view2);
            }
        } : null);
    }
}
