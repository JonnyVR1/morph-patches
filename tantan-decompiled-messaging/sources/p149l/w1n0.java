package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.external.voice.entry.VoiceConversationsEntry;
import com.p046p1.mobile.putong.live.external.voice.entry.VoiceFeedEntryFloatingAnim;
import p147v.VImage;
import p147v.VMarqueeText;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class w1n0 {
    /* JADX INFO: renamed from: a */
    public static void m200945a(VoiceConversationsEntry voiceConversationsEntry, View view) {
        voiceConversationsEntry.f46396a = (VoiceConversationsEntry) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceConversationsEntry.f46397b = (RelativeLayout) viewGroup.getChildAt(0);
        voiceConversationsEntry.f46398c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceConversationsEntry.f46399d = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceConversationsEntry.f46400e = (VoiceFeedEntryFloatingAnim) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceConversationsEntry.f46401f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        voiceConversationsEntry.f46402g = (VText) viewGroup.getChildAt(1);
        voiceConversationsEntry.f46403h = (VImage) viewGroup.getChildAt(2);
    }
}
