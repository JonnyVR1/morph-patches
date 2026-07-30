package p153l;

import android.app.Activity;
import android.net.Uri;
import com.p051p1.mobile.putong.data.SchemeKey;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class ujt {
    /* JADX INFO: renamed from: a */
    public static String m196459a(String str) {
        return "<a href = \"tantanapp://" + str + ".*\">.*</a>";
    }

    /* JADX INFO: renamed from: b */
    public static void m196460b(Activity activity, Uri uri) {
        nae0.m162083m(activity, uri);
    }

    /* JADX INFO: renamed from: c */
    public static void m196461c() {
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
        nae0.m162086p(SchemeKey.jumpSuggestVoiceLive, new a3e0());
        nae0.m162086p("webviewDialog", new v9e0());
        for (String str : arrayList) {
            nae0.m162086p(str, new t2e0(SchemeKey.get(str)));
            bjq.m104640c(new t1t(m196459a(str)));
        }
    }
}
