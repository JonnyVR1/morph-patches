package androidx.work;

import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p149l.j6f;
import p149l.jfd0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"<anonymous>", j6f.GPS_DIRECTION_TRUE, "", "TArray", RXScreenCaptureService.KEY_INDEX, "", "invoke", "(I)Ljava/lang/Object;", "androidx/work/Data$getTypedArray$1"}, m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class Data$getStringArray$$inlined$getTypedArray$1 extends Lambda implements Function1<Integer, String> {
    final /* synthetic */ Object $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Data$getStringArray$$inlined$getTypedArray$1(Object obj) {
        super(1);
        this.$value = obj;
    }

    public final String invoke(int i) {
        Object obj = ((Object[]) this.$value)[i];
        if (obj != null) {
            return (String) obj;
        }
        jfd0.m141176a("null cannot be cast to non-null type kotlin.String");
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ String invoke(Integer num) {
        return invoke(num.intValue());
    }
}
