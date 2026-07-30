package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.AbstractC21534y7;

/* JADX INFO: renamed from: l.w7 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b2\u0006\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0011\u0010\u0012R8\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000b2\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000b8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0$8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, m88121d2 = {"Ll/w7;", "Ll/y7;", p7f.LATITUDE_SOUTH, "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "h", "()Ll/y7;", "", "size", "", RXScreenCaptureService.KEY_INDEX, "(I)[Ll/y7;", "f", "slot", "", "j", "(Ll/y7;)V", "<set-?>", "a", "[Ll/y7;", BLiveStormDanmakuGiftResourceType.f45292l, "()[Ll/y7;", "slots", "b", "I", "k", "()I", "nCollectors", "c", "nextIndex", "Ll/lcg0;", Constants.INAPP_DATA_TAG, "Ll/lcg0;", "_subscriptionCount", "Ll/p3g0;", "g", "()Ll/p3g0;", "subscriptionCount", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public abstract class AbstractC21042w7<S extends AbstractC21534y7<?>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public S[] slots;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int nCollectors;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int nextIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public lcg0 _subscriptionCount;

    @NotNull
    /* JADX INFO: renamed from: f */
    public final S m205207f() {
        S s;
        lcg0 lcg0Var;
        synchronized (this) {
            try {
                S[] sArr = this.slots;
                if (sArr == null) {
                    sArr = (S[]) mo95043i(2);
                    this.slots = sArr;
                } else if (this.nCollectors >= sArr.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    this.slots = (S[]) ((AbstractC21534y7[]) objArrCopyOf);
                    sArr = (S[]) ((AbstractC21534y7[]) objArrCopyOf);
                }
                int i = this.nextIndex;
                do {
                    s = sArr[i];
                    if (s == null) {
                        s = (S) mo95042h();
                        sArr[i] = s;
                    }
                    i++;
                    if (i >= sArr.length) {
                        i = 0;
                    }
                    s.getClass();
                } while (!s.mo156925a(this));
                this.nextIndex = i;
                this.nCollectors++;
                lcg0Var = this._subscriptionCount;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (lcg0Var != null) {
            lcg0Var.m153682X(1);
        }
        return s;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final p3g0<Integer> m205208g() {
        lcg0 lcg0Var;
        synchronized (this) {
            lcg0Var = this._subscriptionCount;
            if (lcg0Var == null) {
                lcg0Var = new lcg0(this.nCollectors);
                this._subscriptionCount = lcg0Var;
            }
        }
        return lcg0Var;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public abstract S mo95042h();

    @NotNull
    /* JADX INFO: renamed from: i */
    public abstract S[] mo95043i(int size);

    /* JADX INFO: renamed from: j */
    public final void m205209j(@NotNull S slot) {
        lcg0 lcg0Var;
        int i;
        Continuation<Unit>[] continuationArrMo156926b;
        synchronized (this) {
            try {
                int i2 = this.nCollectors - 1;
                this.nCollectors = i2;
                lcg0Var = this._subscriptionCount;
                if (i2 == 0) {
                    this.nextIndex = 0;
                }
                slot.getClass();
                continuationArrMo156926b = slot.mo156926b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation<Unit> continuation : continuationArrMo156926b) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m225066constructorimpl(Unit.INSTANCE));
            }
        }
        if (lcg0Var != null) {
            lcg0Var.m153682X(-1);
        }
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getNCollectors() {
        return this.nCollectors;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final S[] m205211l() {
        return this.slots;
    }
}
