package kotlinx.coroutines;

import com.p046p1.mobile.putong.data.RelationshipStatus;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import p149l.ff4;
import p149l.j6f;
import p149l.l9r;
import p149l.rnj0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JY\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b2'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r¢\u0006\u0002\b\u00102\u0006\u0010\u0011\u001a\u0002H\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000eH\u0087\u0002¢\u0006\u0002\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0007j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, m87232d2 = {"Lkotlinx/coroutines/CoroutineStart;", "", "(Ljava/lang/String;I)V", "isLazy", "", "isLazy$annotations", "()V", "()Z", "invoke", "", "R", j6f.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "receiver", "completion", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", RelationshipStatus.DEFAULT, "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public enum CoroutineStart {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

    /* JADX INFO: renamed from: kotlinx.coroutines.CoroutineStart$a */
    @Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    public /* synthetic */ class C15395a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66678a;

        static {
            int[] iArr = new int[CoroutineStart.values().length];
            try {
                iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoroutineStart.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoroutineStart.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f66678a = iArr;
        }
    }

    @NotNull
    public static EnumEntries<CoroutineStart> getEntries() {
        return $ENTRIES;
    }

    public static /* synthetic */ void isLazy$annotations() {
    }

    public final <R, T> void invoke(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> block, R receiver, @NotNull Continuation<? super T> completion) throws Throwable {
        int i = C15395a.f66678a[ordinal()];
        if (i == 1) {
            ff4.m121108d(block, receiver, completion, null, 4, null);
            return;
        }
        if (i == 2) {
            ContinuationKt.m87359a(block, receiver, completion);
        } else if (i == 3) {
            rnj0.m180069a(block, receiver, completion);
        } else {
            if (i == 4) {
                return;
            }
            l9r.m149037a();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }
}
