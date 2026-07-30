package p153l;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m88121d2 = {"Ll/kaj;", "Ll/d3q;", "Landroid/view/ViewGroup;", "Lkotlin/Function0;", "", "clickAction", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "o", "()I", "itemView", "I", "(Landroid/view/ViewGroup;)V", "a", "Lkotlin/jvm/functions/Function0;", "getClickAction", "()Lkotlin/jvm/functions/Function0;", "setClickAction", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class kaj extends d3q<ViewGroup> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public Function0<Unit> clickAction;

    public kaj(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.clickAction = function0;
    }

    /* JADX INFO: renamed from: H */
    public static Unit m148987H(kaj kajVar, View view) {
        view.getClass();
        kajVar.clickAction.invoke();
        return Unit.INSTANCE;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo71749u(@NotNull ViewGroup itemView) {
        itemView.getClass();
        super.mo71749u(itemView);
        czq.m113347c(itemView, new Function1() { // from class: l.jaj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return kaj.m148987H(this.f118988a, (View) obj);
            }
        });
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198748E8;
    }
}
