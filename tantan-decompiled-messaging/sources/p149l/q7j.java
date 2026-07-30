package p149l;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m87232d2 = {"Ll/q7j;", "Ll/d1q;", "Landroid/view/ViewGroup;", "Lkotlin/Function0;", "", "clickAction", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "o", "()I", "itemView", "I", "(Landroid/view/ViewGroup;)V", "a", "Lkotlin/jvm/functions/Function0;", "getClickAction", "()Lkotlin/jvm/functions/Function0;", "setClickAction", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class q7j extends d1q<ViewGroup> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public Function0<Unit> clickAction;

    public q7j(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.clickAction = function0;
    }

    /* JADX INFO: renamed from: H */
    public static Unit m173276H(q7j q7jVar, View view) {
        view.getClass();
        q7jVar.clickAction.invoke();
        return Unit.INSTANCE;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo70566u(@NotNull ViewGroup itemView) {
        itemView.getClass();
        super.mo70566u(itemView);
        cxq.m109105c(itemView, new Function1() { // from class: l.p7j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q7j.m173276H(this.f147519a, (View) obj);
            }
        });
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168016E8;
    }
}
