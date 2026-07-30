package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.giftwall.view.VoiceGiftWallListView;

/* JADX INFO: loaded from: classes4.dex */
public class rkn0 {
    /* JADX INFO: renamed from: a */
    public static void m181873a(VoiceGiftWallListView voiceGiftWallListView, View view) {
        voiceGiftWallListView.f54022a = (VoiceGiftWallListView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceGiftWallListView.f54023b = (RecyclerView) viewGroup.getChildAt(0);
        voiceGiftWallListView.f54024c = (LinearLayout) viewGroup.getChildAt(1);
        voiceGiftWallListView.f54025d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m181874b(VoiceGiftWallListView voiceGiftWallListView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198904R8, viewGroup, false);
        m181873a(voiceGiftWallListView, viewInflate);
        return viewInflate;
    }
}
