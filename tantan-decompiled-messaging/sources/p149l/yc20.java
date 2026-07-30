package p149l;

import kotlin.Metadata;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87230bv = {1, 0, 3}, m87233k = 3, m87234mv = {1, 1, 16})
public final /* synthetic */ class yc20 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f197408a;

    static {
        int[] iArr = new int[Protocol.values().length];
        f197408a = iArr;
        iArr[Protocol.QUIC.ordinal()] = 1;
        iArr[Protocol.HTTP_1_1.ordinal()] = 2;
        iArr[Protocol.HTTP_1_0.ordinal()] = 3;
        iArr[Protocol.HTTP_2.ordinal()] = 4;
        iArr[Protocol.H2_PRIOR_KNOWLEDGE.ordinal()] = 5;
    }
}
