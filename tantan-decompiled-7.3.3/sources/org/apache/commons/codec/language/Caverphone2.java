package org.apache.commons.codec.language;

import com.clevertap.android.sdk.Constants;
import com.cosmos.photon.push.util.NetUtil;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.Locale;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
public class Caverphone2 extends AbstractCaverphone {
    private static final String TEN_1 = "1111111111";

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        if (str == null || str.length() == 0) {
            return TEN_1;
        }
        return (str.toLowerCase(Locale.ENGLISH).replaceAll("[^a-z]", "").replaceAll("e$", "").replaceAll("^cough", "cou2f").replaceAll("^rough", "rou2f").replaceAll("^tough", "tou2f").replaceAll("^enough", "enou2f").replaceAll("^trough", "trou2f").replaceAll("^gn", "2n").replaceAll("mb$", "m2").replaceAll("cq", "2q").replaceAll("ci", "si").replaceAll("ce", "se").replaceAll("cy", "sy").replaceAll("tch", "2ch").replaceAll("c", "k").replaceAll("q", "k").replaceAll(BaseSei.f14624X, "k").replaceAll(ResourceDirection.f39656v, "f").replaceAll("dg", NetUtil.NETWORK_CLASS_2G).replaceAll("tio", "sio").replaceAll("tia", "sia").replaceAll(Constants.INAPP_DATA_TAG, Constants.KEY_T).replaceAll("ph", "fh").replaceAll("b", "p").replaceAll("sh", "s2").replaceAll(BaseSei.f14626Z, BLiveStormDanmakuGiftResourceType.f45294s).replaceAll("^[aeiou]", "A").replaceAll("[aeiou]", "3").replaceAll("j", BaseSei.f14625Y).replaceAll("^y3", "Y3").replaceAll("^y", "A").replaceAll(BaseSei.f14625Y, "3").replaceAll("3gh3", "3kh3").replaceAll("gh", com.tencent.connect.common.Constants.VIA_REPORT_TYPE_DATALINE).replaceAll("g", "k").replaceAll("s+", p7f.LATITUDE_SOUTH).replaceAll("t+", p7f.GPS_DIRECTION_TRUE).replaceAll("p+", "P").replaceAll("k+", "K").replaceAll("f+", "F").replaceAll("m+", "M").replaceAll("n+", "N").replaceAll("w3", "W3").replaceAll("wh3", "Wh3").replaceAll("w$", "3").replaceAll("w", "2").replaceAll("^h", "A").replaceAll("h", "2").replaceAll("r3", "R3").replaceAll("r$", "3").replaceAll("r", "2").replaceAll("l3", "L3").replaceAll("l$", "3").replaceAll(BLiveStormDanmakuGiftResourceType.f45292l, "2").replaceAll("2", "").replaceAll("3$", "A").replaceAll("3", "") + TEN_1).substring(0, 10);
    }
}
