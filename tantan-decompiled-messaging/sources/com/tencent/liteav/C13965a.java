package com.tencent.liteav;

import com.core.glcore.util.ErrorCode;
import com.tencent.connect.common.Constants;
import com.tencent.liteav.audio.TXCAudioEngine;
import com.tencent.liteav.basic.module.StatusBucket;
import com.tencent.liteav.basic.module.TXCStatus;
import io.agora.rtc2.internal.RtcEngineEvent;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.tencent.liteav.a */
/* JADX INFO: loaded from: classes2.dex */
public class C13965a {
    /* JADX INFO: renamed from: a */
    public static void m82644a(String str, ArrayList<String> arrayList) {
        StatusBucket status = TXCAudioEngine.getInstance().getStatus(1);
        TXCStatus.m82995a(str, RtcEngineEvent.EvtType.EVT_LOCAL_VIDEO_STAT, Integer.valueOf(status.getIntStatus("18446744073709551615", 10001)));
        TXCStatus.m82995a(str, ErrorCode.BGMIX_RUNNING_FAILED, Integer.valueOf(status.getIntStatus("18446744073709551615", 10002)));
        TXCStatus.m82995a(str, 14017, Integer.valueOf(status.getIntStatus("18446744073709551615", 10000)));
        TXCStatus.m82995a(str, RtcEngineEvent.EvtType.EVT_FIRST_REMOTE_VIDEO_FRAME, Integer.valueOf(status.getIntStatus("18446744073709551615", 10003)));
        TXCStatus.m82995a(str, 14006, Integer.valueOf(status.getIntStatus("18446744073709551615", 10004)));
        TXCStatus.m82995a(str, 14018, Integer.valueOf(status.getIntStatus("18446744073709551615", 10005)));
        TXCStatus.m82995a(str, 18029, Integer.valueOf(status.getIntStatus("18446744073709551615", 10006)));
        if (arrayList == null) {
            return;
        }
        for (String str2 : arrayList) {
            int intStatus = status.getIntStatus(str2, Constants.REQUEST_COMMON_CHANNEL);
            int intStatus2 = status.getIntStatus(str2, 10115);
            TXCStatus.m82995a(str2, 18031, Integer.valueOf(intStatus));
            TXCStatus.m82995a(str2, 18032, Integer.valueOf(intStatus2));
            int i = 0;
            TXCStatus.m82995a(str2, 2001, Integer.valueOf(intStatus2 > 0 ? intStatus / intStatus2 : 0));
            TXCStatus.m82995a(str2, 2002, Integer.valueOf(intStatus2));
            TXCStatus.m82995a(str2, 2005, Integer.valueOf(intStatus2));
            TXCStatus.m82995a(str2, 2004, Integer.valueOf(status.getIntStatus(str2, 10300)));
            TXCStatus.m82995a(str2, 2008, Integer.valueOf(status.getIntStatus(str2, Constants.REQUEST_BIND_GROUP)));
            TXCStatus.m82995a(str2, 2010, Integer.valueOf(status.getIntStatus(str2, Constants.REQUEST_SEND_TO_MY_COMPUTER)));
            TXCStatus.m82995a(str2, 2007, Integer.valueOf(status.getIntStatus(str2, Constants.REQUEST_QQ_FAVORITES)));
            TXCStatus.m82995a(str2, 2011, Integer.valueOf(status.getIntStatus(str2, Constants.REQUEST_SHARE_TO_TROOP_BAR)));
            TXCStatus.m82995a(str2, 18001, Integer.valueOf(status.getIntStatus(str2, Constants.REQUEST_QQ_SHARE)));
            TXCStatus.m82995a(str2, 18002, Integer.valueOf(status.getIntStatus(str2, Constants.REQUEST_QZONE_SHARE)));
            TXCStatus.m82995a(str2, 18006, Integer.valueOf(status.getIntStatus(str2, 10202)));
            TXCStatus.m82995a(str2, 18007, Integer.valueOf(status.getIntStatus(str2, 10203)));
            TXCStatus.m82995a(str2, 18008, Integer.valueOf(status.getIntStatus(str2, 10204)));
            TXCStatus.m82995a(str2, 18015, Integer.valueOf(status.getIntStatus(str2, 10205)));
            TXCStatus.m82995a(str2, 18013, Integer.valueOf(status.getIntStatus(str2, 10206)));
            int intStatus3 = status.getIntStatus(str2, 10203);
            int intStatus4 = status.getIntStatus(str2, 10202);
            if (intStatus4 > 0) {
                i = (intStatus3 * 100) / intStatus4;
            }
            TXCStatus.m82995a(str2, 18014, Integer.valueOf(i));
            TXCStatus.m82995a(str2, 18023, Integer.valueOf(status.getIntStatus(str2, 10200)));
            TXCStatus.m82995a(str2, 18026, Integer.valueOf(status.getIntStatus(str2, Constants.REQUEST_EDIT_DYNAMIC_AVATAR)));
            TXCStatus.m82995a(str2, 18027, Integer.valueOf(status.getIntStatus(str2, Constants.REQUEST_JOIN_GROUP)));
            TXCStatus.m82995a(str2, 18028, Integer.valueOf(status.getIntStatus(str2, 10201)));
            TXCStatus.m82995a(str2, 18030, Integer.valueOf(status.getIntStatus(str2, Constants.REQUEST_GUILD)));
            TXCStatus.m82995a(str2, 18003, Integer.valueOf(status.getIntStatus(str2, 10100)));
            TXCStatus.m82995a(str2, TXLiteAVCode.EVT_VOD_PLAY_SEEK_COMPLETE, Integer.valueOf(status.getIntStatus(str2, 10100)));
            TXCStatus.m82995a(str2, TXLiteAVCode.EVT_VIDEO_DECODER_CACHE_TOO_MANY_FRAMES, Integer.valueOf(status.getIntStatus(str2, 10101)));
            TXCStatus.m82995a(str2, 18016, Integer.valueOf(status.getIntStatus(str2, Constants.REQUEST_APPBAR)));
            TXCStatus.m82995a(str2, 18009, Integer.valueOf(status.getIntStatus(str2, 10207)));
            TXCStatus.m82995a(str2, 18010, Integer.valueOf(status.getIntStatus(str2, 10208)));
            TXCStatus.m82995a(str2, 18012, Integer.valueOf(status.getIntStatus(str2, 10209)));
            TXCStatus.m82995a(str2, TXLiteAVCode.EVT_HW_DECODER_START_SUCC, Integer.valueOf(status.getIntStatus(str2, Constants.REQUEST_EDIT_EMOTION)));
        }
    }
}
