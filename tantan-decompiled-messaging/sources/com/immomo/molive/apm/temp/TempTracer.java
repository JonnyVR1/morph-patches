package com.immomo.molive.apm.temp;

import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.text.DecimalFormat;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p149l.mr2;
import p149l.vh2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m87232d2 = {"Lcom/immomo/molive/apm/temp/TempTracer;", "Ll/mr2;", "Lcom/immomo/molive/apm/temp/TempSummary;", "Ll/vh2;", "tempConfig", "<init>", "(Ll/vh2;)V", "j", "()Lcom/immomo/molive/apm/temp/TempSummary;", "", RXScreenCaptureService.KEY_INDEX, "()Z", "Ljava/text/DecimalFormat;", "e", "Ljava/text/DecimalFormat;", "getDf", "()Ljava/text/DecimalFormat;", "df", "f", "Lkotlin/Lazy;", "h", "tempSummary", "g", "Ll/vh2;", "getTempConfig", "()Ll/vh2;", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class TempTracer extends mr2<TempSummary> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final DecimalFormat df;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy tempSummary;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final vh2 tempConfig;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TempTracer(@NotNull vh2 vh2Var) {
        super(vh2Var);
        vh2Var.getClass();
        this.tempConfig = vh2Var;
        this.df = new DecimalFormat("#.#");
        this.tempSummary = LazyKt__LazyJVMKt.m87229b(new Function0<TempSummary>() { // from class: com.immomo.molive.apm.temp.TempTracer$tempSummary$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TempSummary invoke() {
                return new TempSummary(null, null, null, 7, null);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final TempSummary m18583h() {
        return (TempSummary) this.tempSummary.getValue();
    }

    /* JADX INFO: renamed from: i */
    public boolean m18584i() {
        return TempUtils.INSTANCE.m18593h();
    }

    @Override // p149l.mr2
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public TempSummary mo18567c() {
        TempUtils tempUtils = TempUtils.INSTANCE;
        int iM18588c = tempUtils.m18588c();
        int iM18590e = tempUtils.m18590e();
        int iM18586a = tempUtils.m18586a();
        m18583h().getCupTemp().m198320b(iM18588c);
        m18583h().getSkinTemp().m198320b(iM18590e);
        m18583h().getBatteryTemp().m198320b(iM18586a);
        return m18583h();
    }
}
