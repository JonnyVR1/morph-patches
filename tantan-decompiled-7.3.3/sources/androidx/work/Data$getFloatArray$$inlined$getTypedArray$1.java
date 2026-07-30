package androidx.work;

import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p153l.mnd0;
import p153l.p7f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"<anonymous>", p7f.GPS_DIRECTION_TRUE, "", "TArray", RXScreenCaptureService.KEY_INDEX, "", "invoke", "(I)Ljava/lang/Object;", "androidx/work/Data$getTypedArray$1"}, m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class Data$getFloatArray$$inlined$getTypedArray$1 extends Lambda implements Function1<Integer, Float> {
    final /* synthetic */ Object $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Data$getFloatArray$$inlined$getTypedArray$1(Object obj) {
        super(1);
        this.$value = obj;
    }

    public final Float invoke(int i) {
        Object obj = ((Object[]) this.$value)[i];
        if (obj != null) {
            return (Float) obj;
        }
        mnd0.m159157a("null cannot be cast to non-null type kotlin.Float");
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Float, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Float invoke(Integer num) {
        return invoke(num.intValue());
    }
}
