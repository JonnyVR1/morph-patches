package io.agora.rtc2.video;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
class VideoCaptureFormatParser {
    public static VideoCaptureFormat[] fromString(String str) {
        VideoCaptureFormat videoCaptureFormatFromString;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split("/")) {
            if (str2 != null && !str2.isEmpty() && (videoCaptureFormatFromString = VideoCaptureFormat.fromString(str2)) != null) {
                arrayList.add(videoCaptureFormatFromString);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (VideoCaptureFormat[]) arrayList.toArray(new VideoCaptureFormat[arrayList.size()]);
    }

    public static String toString(VideoCaptureFormat[] videoCaptureFormatArr) {
        String strConcat = "";
        if (videoCaptureFormatArr == null) {
            return "";
        }
        for (int i = 0; i < videoCaptureFormatArr.length; i++) {
            strConcat = strConcat + videoCaptureFormatArr[i].toString();
            if (i != videoCaptureFormatArr.length - 1) {
                strConcat = strConcat.concat("/");
            }
        }
        return strConcat;
    }
}
