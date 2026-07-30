package p153l;

import com.hellogroup.fep.feppkg.internal.core.CheckPolicy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 3}, m88122k = 3, m88123mv = {1, 1, 16})
public final /* synthetic */ class dhi {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f88528a;

    static {
        int[] iArr = new int[CheckPolicy.values().length];
        f88528a = iArr;
        iArr[CheckPolicy.LOCAL_ONLY.ordinal()] = 1;
        iArr[CheckPolicy.NO_UPDATE.ordinal()] = 2;
        iArr[CheckPolicy.NORMAL.ordinal()] = 3;
        iArr[CheckPolicy.FORCE_UPDATE.ordinal()] = 4;
    }
}
