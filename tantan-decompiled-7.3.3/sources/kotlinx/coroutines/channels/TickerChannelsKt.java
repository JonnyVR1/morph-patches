package kotlinx.coroutines.channels;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import kotlinx.coroutines.DelayKt;
import p153l.AbstractC16728e8;
import p153l.C16923f8;
import p153l.sme0;
import p153l.uyp;
import p153l.wtq0;
import p153l.y4f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a.\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007\u001a.\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0082@¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, m88121d2 = {"", "delayMillis", "initialDelayMillis", "Ll/sme0;", "", "channel", Constants.INAPP_DATA_TAG, "(JJLl/sme0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class TickerChannelsKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (kotlinx.coroutines.DelayKt.m94502b(r6, r0) == r1) goto L28;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007c -> B:14:0x0034). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m94880c(long j, long j2, sme0<? super Unit> sme0Var, Continuation<? super Unit> continuation) throws Throwable {
        TickerChannelsKt$fixedDelayTicker$1 tickerChannelsKt$fixedDelayTicker$1;
        sme0<? super Unit> sme0Var2;
        if (continuation instanceof TickerChannelsKt$fixedDelayTicker$1) {
            tickerChannelsKt$fixedDelayTicker$1 = (TickerChannelsKt$fixedDelayTicker$1) continuation;
            int i = tickerChannelsKt$fixedDelayTicker$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tickerChannelsKt$fixedDelayTicker$1.label = i - Integer.MIN_VALUE;
            } else {
                tickerChannelsKt$fixedDelayTicker$1 = new TickerChannelsKt$fixedDelayTicker$1(continuation);
            }
        } else {
            tickerChannelsKt$fixedDelayTicker$1 = new TickerChannelsKt$fixedDelayTicker$1(continuation);
        }
        Object obj = tickerChannelsKt$fixedDelayTicker$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = tickerChannelsKt$fixedDelayTicker$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            tickerChannelsKt$fixedDelayTicker$1.L$0 = sme0Var;
            tickerChannelsKt$fixedDelayTicker$1.J$0 = j;
            tickerChannelsKt$fixedDelayTicker$1.label = 1;
            if (DelayKt.m94502b(j2, tickerChannelsKt$fixedDelayTicker$1) != objM198688e) {
            }
            return objM198688e;
        }
        if (i2 == 1) {
            j = tickerChannelsKt$fixedDelayTicker$1.J$0;
            sme0Var = (sme0) tickerChannelsKt$fixedDelayTicker$1.L$0;
            ResultKt.m88128b(obj);
        } else if (i2 == 2) {
            j = tickerChannelsKt$fixedDelayTicker$1.J$0;
            sme0Var2 = (sme0) tickerChannelsKt$fixedDelayTicker$1.L$0;
            ResultKt.m88128b(obj);
            tickerChannelsKt$fixedDelayTicker$1.L$0 = sme0Var2;
            tickerChannelsKt$fixedDelayTicker$1.J$0 = j;
            tickerChannelsKt$fixedDelayTicker$1.label = 3;
        } else {
            if (i2 != 3) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = tickerChannelsKt$fixedDelayTicker$1.J$0;
            sme0Var2 = (sme0) tickerChannelsKt$fixedDelayTicker$1.L$0;
            ResultKt.m88128b(obj);
        }
        sme0Var = sme0Var2;
        Unit unit = Unit.INSTANCE;
        tickerChannelsKt$fixedDelayTicker$1.L$0 = sme0Var;
        tickerChannelsKt$fixedDelayTicker$1.J$0 = j;
        tickerChannelsKt$fixedDelayTicker$1.label = 2;
        if (sme0Var.mo94679E(unit, tickerChannelsKt$fixedDelayTicker$1) != objM198688e) {
            sme0Var2 = sme0Var;
            tickerChannelsKt$fixedDelayTicker$1.L$0 = sme0Var2;
            tickerChannelsKt$fixedDelayTicker$1.J$0 = j;
            tickerChannelsKt$fixedDelayTicker$1.label = 3;
        }
        return objM198688e;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:47:0x0100  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f9, code lost:
    
        if (kotlinx.coroutines.DelayKt.m94502b(r4, r1) == r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0112, code lost:
    
        if (kotlinx.coroutines.DelayKt.m94502b(r4, r1) == r2) goto L49;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fc -> B:31:0x00aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0112 -> B:15:0x003d). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m94881d(long j, long j2, sme0<? super Unit> sme0Var, Continuation<? super Unit> continuation) throws Throwable {
        TickerChannelsKt$fixedPeriodTicker$1 tickerChannelsKt$fixedPeriodTicker$1;
        sme0 sme0Var2;
        long j3;
        long j4;
        long jM214206d;
        long j5;
        sme0 sme0Var3;
        long j6;
        AbstractC16728e8 abstractC16728e8;
        long jNanoTime;
        long jM88487c;
        char c;
        char c2;
        long j7;
        Unit unit;
        if (continuation instanceof TickerChannelsKt$fixedPeriodTicker$1) {
            tickerChannelsKt$fixedPeriodTicker$1 = (TickerChannelsKt$fixedPeriodTicker$1) continuation;
            int i = tickerChannelsKt$fixedPeriodTicker$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tickerChannelsKt$fixedPeriodTicker$1.label = i - Integer.MIN_VALUE;
            } else {
                tickerChannelsKt$fixedPeriodTicker$1 = new TickerChannelsKt$fixedPeriodTicker$1(continuation);
            }
        } else {
            tickerChannelsKt$fixedPeriodTicker$1 = new TickerChannelsKt$fixedPeriodTicker$1(continuation);
        }
        Object obj = tickerChannelsKt$fixedPeriodTicker$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = tickerChannelsKt$fixedPeriodTicker$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            AbstractC16728e8 abstractC16728e9 = C16923f8.f97691a;
            long jM119781a = (abstractC16728e9 != null ? abstractC16728e9.m119781a() : System.nanoTime()) + y4f.m214206d(j2);
            sme0Var2 = sme0Var;
            tickerChannelsKt$fixedPeriodTicker$1.L$0 = sme0Var2;
            j3 = j;
            tickerChannelsKt$fixedPeriodTicker$1.J$0 = j3;
            tickerChannelsKt$fixedPeriodTicker$1.J$1 = jM119781a;
            tickerChannelsKt$fixedPeriodTicker$1.label = 1;
            if (DelayKt.m94502b(j2, tickerChannelsKt$fixedPeriodTicker$1) != objM198688e) {
                j4 = jM119781a;
            }
            return objM198688e;
        }
        if (i2 == 1) {
            j4 = tickerChannelsKt$fixedPeriodTicker$1.J$1;
            long j8 = tickerChannelsKt$fixedPeriodTicker$1.J$0;
            sme0 sme0Var4 = (sme0) tickerChannelsKt$fixedPeriodTicker$1.L$0;
            ResultKt.m88128b(obj);
            sme0Var2 = sme0Var4;
            j3 = j8;
        } else {
            if (i2 == 2) {
                j5 = tickerChannelsKt$fixedPeriodTicker$1.J$1;
                j6 = tickerChannelsKt$fixedPeriodTicker$1.J$0;
                sme0Var3 = (sme0) tickerChannelsKt$fixedPeriodTicker$1.L$0;
                ResultKt.m88128b(obj);
                abstractC16728e8 = C16923f8.f97691a;
                if (abstractC16728e8 != null) {
                    jNanoTime = abstractC16728e8.m119781a();
                } else {
                    jNanoTime = System.nanoTime();
                }
                jM88487c = C15274a.m88487c(j6 - jNanoTime, 0L);
                if (jM88487c == 0) {
                    c = 3;
                    long jM214205c = y4f.m214205c(jM88487c);
                    tickerChannelsKt$fixedPeriodTicker$1.L$0 = sme0Var3;
                    tickerChannelsKt$fixedPeriodTicker$1.J$0 = j6;
                    tickerChannelsKt$fixedPeriodTicker$1.J$1 = j5;
                    c2 = 4;
                    tickerChannelsKt$fixedPeriodTicker$1.label = 4;
                } else {
                    c = 3;
                    long jM214205c2 = y4f.m214205c(jM88487c);
                    tickerChannelsKt$fixedPeriodTicker$1.L$0 = sme0Var3;
                    tickerChannelsKt$fixedPeriodTicker$1.J$0 = j6;
                    tickerChannelsKt$fixedPeriodTicker$1.J$1 = j5;
                    c2 = 4;
                    tickerChannelsKt$fixedPeriodTicker$1.label = 4;
                }
                return objM198688e;
            }
            if (i2 == 3) {
                j5 = tickerChannelsKt$fixedPeriodTicker$1.J$1;
                long j9 = tickerChannelsKt$fixedPeriodTicker$1.J$0;
                sme0Var3 = (sme0) tickerChannelsKt$fixedPeriodTicker$1.L$0;
                ResultKt.m88128b(obj);
                char c3 = 3;
                long j10 = j9;
                jM214206d = j5;
                j4 = j10;
                sme0Var2 = sme0Var3;
                j7 = j4 + jM214206d;
                unit = Unit.INSTANCE;
                tickerChannelsKt$fixedPeriodTicker$1.L$0 = sme0Var2;
                tickerChannelsKt$fixedPeriodTicker$1.J$0 = j7;
                tickerChannelsKt$fixedPeriodTicker$1.J$1 = jM214206d;
                tickerChannelsKt$fixedPeriodTicker$1.label = 2;
                if (sme0Var2.mo94679E(unit, tickerChannelsKt$fixedPeriodTicker$1) != objM198688e) {
                    long j11 = jM214206d;
                    j6 = j7;
                    j5 = j11;
                    sme0Var3 = sme0Var2;
                    abstractC16728e8 = C16923f8.f97691a;
                    if (abstractC16728e8 != null) {
                        jNanoTime = abstractC16728e8.m119781a();
                    } else {
                        jNanoTime = System.nanoTime();
                    }
                    jM88487c = C15274a.m88487c(j6 - jNanoTime, 0L);
                    if (jM88487c == 0 || j5 == 0) {
                        c = 3;
                        long jM214205c3 = y4f.m214205c(jM88487c);
                        tickerChannelsKt$fixedPeriodTicker$1.L$0 = sme0Var3;
                        tickerChannelsKt$fixedPeriodTicker$1.J$0 = j6;
                        tickerChannelsKt$fixedPeriodTicker$1.J$1 = j5;
                        c2 = 4;
                        tickerChannelsKt$fixedPeriodTicker$1.label = 4;
                    } else {
                        long j12 = j5 - ((jNanoTime - j6) % j5);
                        j9 = jNanoTime + j12;
                        long jM214205c4 = y4f.m214205c(j12);
                        tickerChannelsKt$fixedPeriodTicker$1.L$0 = sme0Var3;
                        tickerChannelsKt$fixedPeriodTicker$1.J$0 = j9;
                        tickerChannelsKt$fixedPeriodTicker$1.J$1 = j5;
                        c3 = 3;
                        tickerChannelsKt$fixedPeriodTicker$1.label = 3;
                    }
                }
                return objM198688e;
            }
            if (i2 != 4) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j5 = tickerChannelsKt$fixedPeriodTicker$1.J$1;
            j6 = tickerChannelsKt$fixedPeriodTicker$1.J$0;
            sme0Var3 = (sme0) tickerChannelsKt$fixedPeriodTicker$1.L$0;
            ResultKt.m88128b(obj);
            c2 = 4;
            c = 3;
        }
        long j13 = j6;
        jM214206d = j5;
        j4 = j13;
        sme0Var2 = sme0Var3;
        j7 = j4 + jM214206d;
        unit = Unit.INSTANCE;
        tickerChannelsKt$fixedPeriodTicker$1.L$0 = sme0Var2;
        tickerChannelsKt$fixedPeriodTicker$1.J$0 = j7;
        tickerChannelsKt$fixedPeriodTicker$1.J$1 = jM214206d;
        tickerChannelsKt$fixedPeriodTicker$1.label = 2;
        if (sme0Var2.mo94679E(unit, tickerChannelsKt$fixedPeriodTicker$1) != objM198688e) {
            long j14 = jM214206d;
            j6 = j7;
            j5 = j14;
            sme0Var3 = sme0Var2;
            abstractC16728e8 = C16923f8.f97691a;
            if (abstractC16728e8 != null) {
                jNanoTime = abstractC16728e8.m119781a();
            } else {
                jNanoTime = System.nanoTime();
            }
            jM88487c = C15274a.m88487c(j6 - jNanoTime, 0L);
            if (jM88487c == 0) {
                c = 3;
                long jM214205c5 = y4f.m214205c(jM88487c);
                tickerChannelsKt$fixedPeriodTicker$1.L$0 = sme0Var3;
                tickerChannelsKt$fixedPeriodTicker$1.J$0 = j6;
                tickerChannelsKt$fixedPeriodTicker$1.J$1 = j5;
                c2 = 4;
                tickerChannelsKt$fixedPeriodTicker$1.label = 4;
            } else {
                c = 3;
                long jM214205c6 = y4f.m214205c(jM88487c);
                tickerChannelsKt$fixedPeriodTicker$1.L$0 = sme0Var3;
                tickerChannelsKt$fixedPeriodTicker$1.J$0 = j6;
                tickerChannelsKt$fixedPeriodTicker$1.J$1 = j5;
                c2 = 4;
                tickerChannelsKt$fixedPeriodTicker$1.label = 4;
            }
        }
        return objM198688e;
        jM214206d = y4f.m214206d(j3);
        j7 = j4 + jM214206d;
        unit = Unit.INSTANCE;
        tickerChannelsKt$fixedPeriodTicker$1.L$0 = sme0Var2;
        tickerChannelsKt$fixedPeriodTicker$1.J$0 = j7;
        tickerChannelsKt$fixedPeriodTicker$1.J$1 = jM214206d;
        tickerChannelsKt$fixedPeriodTicker$1.label = 2;
        if (sme0Var2.mo94679E(unit, tickerChannelsKt$fixedPeriodTicker$1) != objM198688e) {
            long j15 = jM214206d;
            j6 = j7;
            j5 = j15;
            sme0Var3 = sme0Var2;
            abstractC16728e8 = C16923f8.f97691a;
            if (abstractC16728e8 != null) {
                jNanoTime = abstractC16728e8.m119781a();
            } else {
                jNanoTime = System.nanoTime();
            }
            jM88487c = C15274a.m88487c(j6 - jNanoTime, 0L);
            if (jM88487c == 0) {
                c = 3;
                long jM214205c7 = y4f.m214205c(jM88487c);
                tickerChannelsKt$fixedPeriodTicker$1.L$0 = sme0Var3;
                tickerChannelsKt$fixedPeriodTicker$1.J$0 = j6;
                tickerChannelsKt$fixedPeriodTicker$1.J$1 = j5;
                c2 = 4;
                tickerChannelsKt$fixedPeriodTicker$1.label = 4;
            } else {
                c = 3;
                long jM214205c8 = y4f.m214205c(jM88487c);
                tickerChannelsKt$fixedPeriodTicker$1.L$0 = sme0Var3;
                tickerChannelsKt$fixedPeriodTicker$1.J$0 = j6;
                tickerChannelsKt$fixedPeriodTicker$1.J$1 = j5;
                c2 = 4;
                tickerChannelsKt$fixedPeriodTicker$1.label = 4;
            }
        }
        return objM198688e;
    }
}
