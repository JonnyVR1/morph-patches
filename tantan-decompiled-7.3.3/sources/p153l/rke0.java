package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.rke0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\rJ)\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\rR\u000b\u0010!\u001a\u00020 8\u0002X\u0082\u0004¨\u0006\""}, m88121d2 = {"Ll/rke0;", p7f.LATITUDE_SOUTH, "Ll/qt5;", "Ll/hx40;", "", "id", "prev", "", "pointers", "<init>", "(JLl/rke0;I)V", "", "u", "()Z", "p", FirebaseAnalytics.Param.INDEX, "", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", "", BLiveStormDanmakuGiftResourceType.f45294s, "(ILjava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", Constants.KEY_T, "()V", "c", "J", "r", "()I", "numberOfSlots", "k", "isRemoved", "Lkotlinx/atomicfu/AtomicInt;", "cleanedAndPointers", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public abstract class rke0<S extends rke0<S>> extends qt5<S> implements hx40 {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f163561d = AtomicIntegerFieldUpdater.newUpdater(rke0.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    public final long id;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public rke0(long j, @Nullable S s, int i) {
        super(s);
        this.id = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // p153l.qt5
    /* JADX INFO: renamed from: k */
    public boolean mo177900k() {
        return f163561d.get(this) == mo172932r() && !m177901l();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m181784p() {
        return f163561d.addAndGet(this, -65536) == mo172932r() && !m177901l();
    }

    /* JADX INFO: renamed from: r */
    public abstract int mo172932r();

    /* JADX INFO: renamed from: s */
    public abstract void mo172933s(int index, @Nullable Throwable cause, @NotNull CoroutineContext context);

    /* JADX INFO: renamed from: t */
    public final void m181785t() {
        if (f163561d.incrementAndGet(this) == mo172932r()) {
            m177903n();
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m181786u() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f163561d;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i == mo172932r() && !m177901l()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
