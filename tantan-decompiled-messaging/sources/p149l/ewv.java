package p149l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R!\u0010\u0016\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0014j\b\u0012\u0004\u0012\u00028\u0000`\u00150\u00138\u0002X\u0082\u0004¨\u0006\u0017"}, m87232d2 = {"Ll/ewv;", "", "E", "", "singleConsumer", "<init>", "(Z)V", "", "b", "()V", "element", "a", "(Ljava/lang/Object;)Z", "e", "()Ljava/lang/Object;", "", "c", "()I", "size", "Lkotlinx/atomicfu/AtomicRef;", "Ll/fwv;", "Lkotlinx/coroutines/internal/Core;", "_cur", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public class ewv<E> {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f93542a = AtomicReferenceFieldUpdater.newUpdater(ewv.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public ewv(boolean z) {
        this._cur$volatile = new fwv(8, z);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m118522a(@NotNull E element) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f93542a;
        while (true) {
            fwv fwvVar = (fwv) atomicReferenceFieldUpdater.get(this);
            int iM123561a = fwvVar.m123561a(element);
            if (iM123561a == 0) {
                return true;
            }
            if (iM123561a == 1) {
                C21643z7.m217426a(f93542a, this, fwvVar, fwvVar.m123570l());
            } else if (iM123561a == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m118523b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f93542a;
        while (true) {
            fwv fwvVar = (fwv) atomicReferenceFieldUpdater.get(this);
            if (fwvVar.m123564d()) {
                return;
            } else {
                C21643z7.m217426a(f93542a, this, fwvVar, fwvVar.m123570l());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m118524c() {
        return ((fwv) f93542a.get(this)).m123567g();
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final E m118525e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f93542a;
        while (true) {
            fwv fwvVar = (fwv) atomicReferenceFieldUpdater.get(this);
            E e = (E) fwvVar.m123571m();
            if (e != fwv.f99689g) {
                return e;
            }
            C21643z7.m217426a(f93542a, this, fwvVar, fwvVar.m123570l());
        }
    }
}
