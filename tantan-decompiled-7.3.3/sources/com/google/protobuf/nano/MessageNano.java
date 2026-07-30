package com.google.protobuf.nano;

import android.database.Cursor;
import android.util.Base64;
import androidx.annotation.Keep;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import p153l.jyb;
import p153l.o100;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MessageNano {
    public volatile int cachedSize = -1;

    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v15, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v18, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Keep
    public static Object[] debug_reconstructFromData(String str) {
        ?? Decode;
        String[] strArrSplit = str.replaceAll("\\n", "").split("\\{");
        ?? r0 = new Object[strArrSplit.length - 1];
        for (int i = 1; i < strArrSplit.length; i++) {
            if (strArrSplit[i].startsWith("n")) {
                Decode = 0;
            } else if (strArrSplit[i].startsWith(RXScreenCaptureService.KEY_INDEX)) {
                Decode = Integer.valueOf(Integer.parseInt(jyb.m147512i(strArrSplit[i], 1)));
            } else if (strArrSplit[i].startsWith("f")) {
                Decode = Float.valueOf(Float.parseFloat(jyb.m147512i(strArrSplit[i], 1)));
            } else if (strArrSplit[i].startsWith(BLiveStormDanmakuGiftResourceType.f45294s)) {
                Decode = Base64.decode(jyb.m147512i(strArrSplit[i], 1), 1);
                try {
                    Decode = new String((byte[]) Decode, jyb.f123125a);
                } catch (Exception unused) {
                }
            } else if (strArrSplit[i].startsWith("b")) {
                Decode = Base64.decode(jyb.m147512i(strArrSplit[i], 1), 1);
            } else {
                Decode = 0;
            }
            r0[i - 1] = Decode;
        }
        return r0;
    }

    public static void reportError(Exception exc, Cursor cursor) {
        if (cursor != null) {
            try {
                int columnCount = cursor.getColumnCount();
                for (int i = 0; i < columnCount; i++) {
                    if (!cursor.isNull(i)) {
                        int type = cursor.getType(i);
                        if (type == 1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(RXScreenCaptureService.KEY_INDEX);
                            sb.append(Long.toString(cursor.getLong(i)));
                        } else if (type == 2) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("f");
                            sb2.append(Float.toString(cursor.getFloat(i)));
                        } else if (type == 3) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(BLiveStormDanmakuGiftResourceType.f45294s);
                            sb3.append(Base64.encodeToString(cursor.getBlob(i), 1));
                        } else {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("b");
                            sb4.append(Base64.encodeToString(cursor.getBlob(i), 1));
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // 
    /* JADX INFO: renamed from: clone */
    public MessageNano mo225055clone() throws CloneNotSupportedException {
        return (MessageNano) super.clone();
    }

    public String toString() {
        return o100.m165572d(this);
    }
}
