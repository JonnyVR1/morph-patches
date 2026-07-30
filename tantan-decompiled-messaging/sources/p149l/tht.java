package p149l;

import android.app.Activity;
import android.net.Uri;
import com.p046p1.mobile.putong.data.SchemeKey;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class tht {
    /* JADX INFO: renamed from: a */
    public static String m188928a(String str) {
        return "<a href = \"tantanapp://" + str + ".*\">.*</a>";
    }

    /* JADX INFO: renamed from: b */
    public static void m188929b(Activity activity, Uri uri) {
        j2e0.m139446m(activity, uri);
    }

    /* JADX INFO: renamed from: c */
    public static void m188930c() {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("live");
        arrayList.add(SchemeKey.liveCover);
        arrayList.add(SchemeKey.liveSquare);
        arrayList.add("liveAnchor");
        arrayList.add("startVoiceLive");
        arrayList.add(SchemeKey.livePrivacy);
        arrayList.add(SchemeKey.liveRight);
        arrayList.add(SchemeKey.voiceRight);
        arrayList.add(SchemeKey.enterVoiceRoom);
        arrayList.add(SchemeKey.jumpVoiceSquare);
        arrayList.add(SchemeKey.liveSetting);
        arrayList.add(SchemeKey.jumpToVoiceFrame);
        arrayList.add(SchemeKey.enterVoiceRoomPackageGiftRecall);
        arrayList.add(SchemeKey.enterSuggestVoiceRoom);
        arrayList.add(SchemeKey.jumpToVoteManager);
        arrayList.add(SchemeKey.supremeGoldCard);
        arrayList.add(SchemeKey.liveDynamic);
        arrayList.add("enterVoiceChat");
        arrayList.add(SchemeKey.jumpMLNPage);
        arrayList.add(SchemeKey.enterVoiceChatRoom);
        arrayList.add(SchemeKey.jumpIntlServiceCenter);
        arrayList.add("goPage");
        arrayList.add("goRun");
        arrayList.add(SchemeKey.liveBannerCustom);
        arrayList.add(SchemeKey.intlVoiceShipLinkJumpRoom);
        arrayList.add(SchemeKey.jumpLiveFeedbackQuestionPage);
        j2e0.m139449p(SchemeKey.jumpSuggestVoiceLive, new wud0());
        j2e0.m139449p("webviewDialog", new r1e0());
        for (String str : arrayList) {
            j2e0.m139449p(str, new pud0(SchemeKey.get(str)));
            bhq.m101911c(new szs(m188928a(str)));
        }
    }
}
