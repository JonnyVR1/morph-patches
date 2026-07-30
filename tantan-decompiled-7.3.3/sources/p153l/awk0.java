package p153l;

import com.google.android.exoplayer2.PlaybackException;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageContent;
import com.p051p1.mobile.putong.data.PushMessageCustom;

/* JADX INFO: loaded from: classes9.dex */
public class awk0 {
    /* JADX INFO: renamed from: a */
    public static void m100674a(String str) {
        PushMessage pushMessageNew_ = PushMessage.new_();
        pushMessageNew_.intent = "video.chat.notify.push";
        pushMessageNew_.content = PushMessageContent.new_();
        pushMessageNew_.messageCustom = PushMessageCustom.new_();
        pushMessageNew_.priority = 1;
        pushMessageNew_.stackId = PlaybackException.CUSTOM_ERROR_CODE_BASE;
        pushMessageNew_.title = "来电话啦";
        pushMessageNew_.value = xau.m209906p(str, 6) + "向你发起视频闪聊，快去接听";
        pushMessageNew_.silentAggregation = false;
        pushMessageNew_.silent = false;
        pushMessageNew_.createdTime = (double) pzi0.m174454o();
        pushMessageNew_.primaryPicture = "https://auto.tancdn.com/v1/images/eyJpZCI6IkpCQU83SFdJNE1WUFBQRE5EUEtSQVZMSE9HT0hTWTE0IiwidyI6NjAwLCJoIjo2MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1ODU2NDg4OTEwNzE5MTA4Njg5fQ.png";
        cft.m109594d(pushMessageNew_, null);
    }
}
