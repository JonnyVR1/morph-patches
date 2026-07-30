package p153l;

import kotlin.Metadata;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 3}, m88122k = 3, m88123mv = {1, 1, 16})
public final /* synthetic */ class il20 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f115518a;

    static {
        int[] iArr = new int[Protocol.values().length];
        f115518a = iArr;
        iArr[Protocol.QUIC.ordinal()] = 1;
        iArr[Protocol.HTTP_1_1.ordinal()] = 2;
        iArr[Protocol.HTTP_1_0.ordinal()] = 3;
        iArr[Protocol.HTTP_2.ordinal()] = 4;
        iArr[Protocol.H2_PRIOR_KNOWLEDGE.ordinal()] = 5;
    }
}
