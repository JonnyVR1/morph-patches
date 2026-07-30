package p153l;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\bJ9\u0010\u000f\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\n2\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0014"}, m88121d2 = {"Ll/tl5;", p7f.GPS_DIRECTION_TRUE, "", "<init>", "()V", "observer", "", "a", "(Ljava/lang/Object;)V", "c", "Lkotlin/Function1;", "block", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onError", "b", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "observers", "HelloFoundation_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class tl5<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CopyOnWriteArrayList<T> observers = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: a */
    public final void m191605a(T observer) {
        if (this.observers.contains(observer)) {
            return;
        }
        this.observers.add(observer);
    }

    /* JADX INFO: renamed from: b */
    public final void m191606b(@NotNull Function1<? super T, Unit> block, @NotNull Function1<? super Exception, Unit> onError) {
        block.getClass();
        onError.getClass();
        Iterator<T> it = this.observers.iterator();
        while (it.hasNext()) {
            try {
                block.invoke(it.next());
            } catch (Exception e) {
                onError.invoke(e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m191607c(T observer) {
        this.observers.remove(observer);
    }
}
