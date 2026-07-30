package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.AbstractC16310d8;

/* JADX INFO: renamed from: l.b8 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b2\u0006\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0011\u0010\u0012R8\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000b2\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000b8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0$8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, m87232d2 = {"Ll/b8;", "Ll/d8;", j6f.LATITUDE_SOUTH, "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "h", "()Ll/d8;", "", "size", "", RXScreenCaptureService.KEY_INDEX, "(I)[Ll/d8;", "f", "slot", "", "j", "(Ll/d8;)V", "<set-?>", "a", "[Ll/d8;", BLiveStormDanmakuGiftResourceType.f44444l, "()[Ll/d8;", "slots", "b", "I", "k", "()I", "nCollectors", "c", "nextIndex", "Ll/d4g0;", Constants.INAPP_DATA_TAG, "Ll/d4g0;", "_subscriptionCount", "Ll/gvf0;", "g", "()Ll/gvf0;", "subscriptionCount", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public abstract class AbstractC15825b8<S extends AbstractC16310d8<?>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public S[] slots;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int nCollectors;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int nextIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public d4g0 _subscriptionCount;

    @NotNull
    /* JADX INFO: renamed from: f */
    public final S m100705f() {
        S s;
        d4g0 d4g0Var;
        synchronized (this) {
            try {
                S[] sArr = this.slots;
                if (sArr == null) {
                    sArr = (S[]) mo94150i(2);
                    this.slots = sArr;
                } else if (this.nCollectors >= sArr.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    this.slots = (S[]) ((AbstractC16310d8[]) objArrCopyOf);
                    sArr = (S[]) ((AbstractC16310d8[]) objArrCopyOf);
                }
                int i = this.nextIndex;
                do {
                    s = sArr[i];
                    if (s == null) {
                        s = (S) mo94149h();
                        sArr[i] = s;
                    }
                    i++;
                    if (i >= sArr.length) {
                        i = 0;
                    }
                    s.getClass();
                } while (!s.mo110260a(this));
                this.nextIndex = i;
                this.nCollectors++;
                d4g0Var = this._subscriptionCount;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (d4g0Var != null) {
            d4g0Var.m109985X(1);
        }
        return s;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final gvf0<Integer> m100706g() {
        d4g0 d4g0Var;
        synchronized (this) {
            d4g0Var = this._subscriptionCount;
            if (d4g0Var == null) {
                d4g0Var = new d4g0(this.nCollectors);
                this._subscriptionCount = d4g0Var;
            }
        }
        return d4g0Var;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public abstract S mo94149h();

    @NotNull
    /* JADX INFO: renamed from: i */
    public abstract S[] mo94150i(int size);

    /* JADX INFO: renamed from: j */
    public final void m100707j(@NotNull S slot) {
        d4g0 d4g0Var;
        int i;
        Continuation<Unit>[] continuationArrMo110261b;
        synchronized (this) {
            try {
                int i2 = this.nCollectors - 1;
                this.nCollectors = i2;
                d4g0Var = this._subscriptionCount;
                if (i2 == 0) {
                    this.nextIndex = 0;
                }
                slot.getClass();
                continuationArrMo110261b = slot.mo110261b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation<Unit> continuation : continuationArrMo110261b) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m223820constructorimpl(Unit.INSTANCE));
            }
        }
        if (d4g0Var != null) {
            d4g0Var.m109985X(-1);
        }
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getNCollectors() {
        return this.nCollectors;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final S[] m100709l() {
        return this.slots;
    }
}
