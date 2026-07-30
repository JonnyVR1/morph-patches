package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p149l.cpi;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class RegexKt$fromInt$1$1 implements Function1<Enum<Object>, Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66634a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(Enum<Object> r2) {
        cpi cpiVar = (cpi) r2;
        return Boolean.valueOf((this.f66634a & cpiVar.getMask()) == cpiVar.getValue());
    }
}
