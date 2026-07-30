package kotlinx.coroutines.sync;

import com.clevertap.android.sdk.Constants;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;
import p149l.jee0;
import p149l.kee0;
import p149l.qkq0;
import p149l.uwp;
import p149l.whh0;
import p149l.yfh0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a5\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086H\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012\"\u0014\u0010\u0017\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012\"\u0014\u0010\u0019\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012\"\u0014\u0010\u001b\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u000e¨\u0006\u001c"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/jee0;", "Lkotlin/Function0;", "action", RXScreenCaptureService.KEY_INDEX, "(Ll/jee0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "Ll/kee0;", "prev", "h", "(JLl/kee0;)Ll/kee0;", "", "a", "I", "MAX_SPIN_CYCLES", "Ll/yfh0;", "b", "Ll/yfh0;", "PERMIT", "c", "TAKEN", Constants.INAPP_DATA_TAG, "BROKEN", "e", "CANCELLED", "f", "SEGMENT_SIZE", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class SemaphoreKt {

    /* JADX INFO: renamed from: a */
    public static final int f66992a = whh0.m203219e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final yfh0 f66993b = new yfh0("PERMIT");

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final yfh0 f66994c = new yfh0("TAKEN");

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final yfh0 f66995d = new yfh0("BROKEN");

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final yfh0 f66996e = new yfh0("CANCELLED");

    /* JADX INFO: renamed from: f */
    public static final int f66997f = whh0.m203219e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    /* JADX INFO: renamed from: h */
    public static final kee0 m94391h(long j, kee0 kee0Var) {
        return new kee0(j, kee0Var, 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: i */
    public static final <T> Object m94392i(@NotNull jee0 jee0Var, @NotNull Function0<? extends T> function0, @NotNull Continuation<? super T> continuation) throws Throwable {
        SemaphoreKt$withPermit$1 semaphoreKt$withPermit$1;
        if (continuation instanceof SemaphoreKt$withPermit$1) {
            semaphoreKt$withPermit$1 = (SemaphoreKt$withPermit$1) continuation;
            int i = semaphoreKt$withPermit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                semaphoreKt$withPermit$1.label = i - Integer.MIN_VALUE;
            } else {
                semaphoreKt$withPermit$1 = new SemaphoreKt$withPermit$1(continuation);
            }
        } else {
            semaphoreKt$withPermit$1 = new SemaphoreKt$withPermit$1(continuation);
        }
        Object obj = semaphoreKt$withPermit$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = semaphoreKt$withPermit$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj);
            semaphoreKt$withPermit$1.L$0 = jee0Var;
            semaphoreKt$withPermit$1.L$1 = function0;
            semaphoreKt$withPermit$1.label = 1;
            if (jee0Var.mo94373b(semaphoreKt$withPermit$1) == objM196133e) {
                return objM196133e;
            }
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            function0 = (Function0) semaphoreKt$withPermit$1.L$1;
            jee0Var = (jee0) semaphoreKt$withPermit$1.L$0;
            ResultKt.m87239b(obj);
        }
        try {
            return function0.invoke();
        } finally {
            InlineMarker.m87483b(1);
            jee0Var.release();
            InlineMarker.m87482a(1);
        }
    }
}
