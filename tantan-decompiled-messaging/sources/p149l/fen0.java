package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.view.LiveMainlandTagView;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.favoritevoice.VoiceInternalFavoriteItemView;
import com.p046p1.mobile.putong.p065ui.MultipleChatIconView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class fen0 {
    /* JADX INFO: renamed from: a */
    public static void m121059a(VoiceInternalFavoriteItemView voiceInternalFavoriteItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceInternalFavoriteItemView.f45490d = (MultipleChatIconView) viewGroup.getChildAt(0);
        voiceInternalFavoriteItemView.f45491e = (LiveMainlandTagView) viewGroup.getChildAt(1);
        voiceInternalFavoriteItemView.f45492f = (TextView) viewGroup.getChildAt(2);
        voiceInternalFavoriteItemView.f45493g = (VText) viewGroup.getChildAt(3);
        voiceInternalFavoriteItemView.f45494h = (VText) viewGroup.getChildAt(4);
        voiceInternalFavoriteItemView.f45495i = (VText) viewGroup.getChildAt(5);
    }
}
