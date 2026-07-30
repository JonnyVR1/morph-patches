package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.view.LiveMainlandTagView;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.favoritevoice.VoiceInternalFavoriteItemView;
import com.p051p1.mobile.putong.p070ui.MultipleChatIconView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class jnn0 {
    /* JADX INFO: renamed from: a */
    public static void m146281a(VoiceInternalFavoriteItemView voiceInternalFavoriteItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceInternalFavoriteItemView.f46338d = (MultipleChatIconView) viewGroup.getChildAt(0);
        voiceInternalFavoriteItemView.f46339e = (LiveMainlandTagView) viewGroup.getChildAt(1);
        voiceInternalFavoriteItemView.f46340f = (TextView) viewGroup.getChildAt(2);
        voiceInternalFavoriteItemView.f46341g = (VText) viewGroup.getChildAt(3);
        voiceInternalFavoriteItemView.f46342h = (VText) viewGroup.getChildAt(4);
        voiceInternalFavoriteItemView.f46343i = (VText) viewGroup.getChildAt(5);
    }
}
