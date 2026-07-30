package com.momo.xengine.media;

import com.momo.xeengine.gift.GiftLogEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class PictureDiffenceUtil {
    private String getHashCode(@NotNull byte[] bArr) {
        int i = 0;
        for (byte b : bArr) {
            i += b;
        }
        int length = i / bArr.length;
        String strConcat = "";
        for (byte b2 : bArr) {
            strConcat = b2 >= length ? strConcat.concat(GiftLogEvent.EVENT_ID_PLAY_SUCCESS) : strConcat.concat("0");
        }
        return strConcat;
    }

    public boolean isTwoPictureSame(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        String hashCode = getHashCode(bArr);
        String hashCode2 = getHashCode(bArr2);
        if (hashCode != null && hashCode2 != null) {
            int length = hashCode.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (hashCode.charAt(i2) != hashCode2.charAt(i2)) {
                    i++;
                }
            }
            if (i <= 5) {
                return true;
            }
        }
        return false;
    }
}
