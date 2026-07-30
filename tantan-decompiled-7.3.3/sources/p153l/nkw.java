package p153l;

import com.hellogroup.p036mk.core.log.core.MKLogLevel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 3}, m88122k = 3, m88123mv = {1, 1, 16})
public final /* synthetic */ class nkw {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f142484a;

    static {
        int[] iArr = new int[MKLogLevel.values().length];
        f142484a = iArr;
        iArr[MKLogLevel.DEBUG.ordinal()] = 1;
        iArr[MKLogLevel.WARNING.ordinal()] = 2;
        iArr[MKLogLevel.INFO.ordinal()] = 3;
        iArr[MKLogLevel.ERROR.ordinal()] = 4;
    }
}
