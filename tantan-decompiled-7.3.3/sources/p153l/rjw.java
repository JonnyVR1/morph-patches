package p153l;

import com.hellogroup.fep.base.FepLogLevel;
import com.hellogroup.fep.base.FepLogModuleType;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 3}, m88122k = 3, m88123mv = {1, 1, 16})
public final /* synthetic */ class rjw {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f163522a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f163523b;

    static {
        int[] iArr = new int[FepLogModuleType.values().length];
        f163522a = iArr;
        iArr[FepLogModuleType.config.ordinal()] = 1;
        iArr[FepLogModuleType.offlinepkg.ordinal()] = 2;
        iArr[FepLogModuleType.grey.ordinal()] = 3;
        int[] iArr2 = new int[FepLogLevel.values().length];
        f163523b = iArr2;
        iArr2[FepLogLevel.info.ordinal()] = 1;
        iArr2[FepLogLevel.warning.ordinal()] = 2;
        iArr2[FepLogLevel.error.ordinal()] = 3;
    }
}
