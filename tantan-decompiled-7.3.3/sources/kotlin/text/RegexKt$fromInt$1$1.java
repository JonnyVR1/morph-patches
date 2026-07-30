package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p153l.yri;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class RegexKt$fromInt$1$1 implements Function1<Enum<Object>, Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67308a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(Enum<Object> r2) {
        yri yriVar = (yri) r2;
        return Boolean.valueOf((this.f67308a & yriVar.getMask()) == yriVar.getValue());
    }
}
