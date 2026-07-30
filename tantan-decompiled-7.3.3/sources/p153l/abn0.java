package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.external.voice.entry.VoiceConversationsEntry;
import com.p051p1.mobile.putong.live.external.voice.entry.VoiceFeedEntryFloatingAnim;
import p151v.VImage;
import p151v.VMarqueeText;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class abn0 {
    /* JADX INFO: renamed from: a */
    public static void m96773a(VoiceConversationsEntry voiceConversationsEntry, View view) {
        voiceConversationsEntry.f47244a = (VoiceConversationsEntry) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceConversationsEntry.f47245b = (RelativeLayout) viewGroup.getChildAt(0);
        voiceConversationsEntry.f47246c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceConversationsEntry.f47247d = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceConversationsEntry.f47248e = (VoiceFeedEntryFloatingAnim) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceConversationsEntry.f47249f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        voiceConversationsEntry.f47250g = (VText) viewGroup.getChildAt(1);
        voiceConversationsEntry.f47251h = (VImage) viewGroup.getChildAt(2);
    }
}
