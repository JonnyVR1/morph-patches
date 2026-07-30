package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, m88121d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "<init>", "()V", "", "f", "()J", "c", "J", "reading", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@WasExperimental
@SourceDebugExtension
public final class TestTimeSource extends AbstractLongTimeSource {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public long reading;

    public TestTimeSource() {
        super(DurationUnit.NANOSECONDS);
        m94393e();
    }

    @Override // kotlin.time.AbstractLongTimeSource
    /* JADX INFO: renamed from: f, reason: from getter */
    public long getReading() {
        return this.reading;
    }
}
