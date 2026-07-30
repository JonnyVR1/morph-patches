package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.entry.VoiceConversationsEntryInternal;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.entry.VoiceEntryAvatarLayout;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.view.VoiceConversationsEntryAvatarView;
import p147v.VImage;
import p147v.VMarqueeText;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class v1n0 {
    /* JADX INFO: renamed from: a */
    public static void m196647a(VoiceConversationsEntryInternal voiceConversationsEntryInternal, View view) {
        voiceConversationsEntryInternal._conversation_entry_all_layout = (VoiceConversationsEntryInternal) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceConversationsEntryInternal._container_layout = (ConstraintLayout) viewGroup.getChildAt(0);
        voiceConversationsEntryInternal._voice_title = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceConversationsEntryInternal._avatar_guide = (Guideline) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceConversationsEntryInternal._tag_avatars = (VoiceEntryAvatarLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceConversationsEntryInternal._dynamic_avatars = (VoiceConversationsEntryAvatarView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        voiceConversationsEntryInternal._voice_des = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        voiceConversationsEntryInternal._tag_group = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        voiceConversationsEntryInternal._tag_group_tag = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(0);
        voiceConversationsEntryInternal._red_dot = (VImage) viewGroup.getChildAt(1);
        voiceConversationsEntryInternal._num_red_dot = (VText) viewGroup.getChildAt(2);
    }
}
