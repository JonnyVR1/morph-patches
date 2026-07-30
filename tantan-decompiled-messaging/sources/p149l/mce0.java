package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.mce0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\rJ)\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\rR\u000b\u0010!\u001a\u00020 8\u0002X\u0082\u0004¨\u0006\""}, m87232d2 = {"Ll/mce0;", j6f.LATITUDE_SOUTH, "Ll/ms5;", "Ll/to40;", "", "id", "prev", "", "pointers", "<init>", "(JLl/mce0;I)V", "", "u", "()Z", "p", FirebaseAnalytics.Param.INDEX, "", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", "", BLiveStormDanmakuGiftResourceType.f44446s, "(ILjava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", Constants.KEY_T, "()V", "c", "J", "r", "()I", "numberOfSlots", "k", "isRemoved", "Lkotlinx/atomicfu/AtomicInt;", "cleanedAndPointers", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public abstract class mce0<S extends mce0<S>> extends ms5<S> implements to40 {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f133098d = AtomicIntegerFieldUpdater.newUpdater(mce0.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    public final long id;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public mce0(long j, @Nullable S s, int i) {
        super(s);
        this.id = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // p149l.ms5
    /* JADX INFO: renamed from: k */
    public boolean mo153991k() {
        return f133098d.get(this) == mo145769r() && !m156115l();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m153992p() {
        return f133098d.addAndGet(this, -65536) == mo145769r() && !m156115l();
    }

    /* JADX INFO: renamed from: r */
    public abstract int mo145769r();

    /* JADX INFO: renamed from: s */
    public abstract void mo145770s(int index, @Nullable Throwable cause, @NotNull CoroutineContext context);

    /* JADX INFO: renamed from: t */
    public final void m153993t() {
        if (f133098d.incrementAndGet(this) == mo145769r()) {
            m156117n();
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m153994u() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f133098d;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i == mo145769r() && !m156115l()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
