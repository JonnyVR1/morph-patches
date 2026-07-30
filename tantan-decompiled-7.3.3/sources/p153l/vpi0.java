package p153l;

import com.immomo.molive.apm.temp.TempSummary;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e\"\u0004\b\f\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/vpi0;", "", "Lcom/immomo/molive/apm/temp/TempSummary$TempType;", "type", "", "tempValue", "<init>", "(Lcom/immomo/molive/apm/temp/TempSummary$TempType;I)V", "a", "Lcom/immomo/molive/apm/temp/TempSummary$TempType;", "getType", "()Lcom/immomo/molive/apm/temp/TempSummary$TempType;", "b", "I", "()I", "(I)V", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class vpi0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final TempSummary.TempType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int tempValue;

    public vpi0(@NotNull TempSummary.TempType tempType, int i) {
        tempType.getClass();
        this.type = tempType;
        this.tempValue = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getTempValue() {
        return this.tempValue;
    }

    /* JADX INFO: renamed from: b */
    public final void m202238b(int i) {
        this.tempValue = i;
    }
}
