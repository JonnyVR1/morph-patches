package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.intl.giftwall.view.VoiceGiftWallListView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nbn0 {
    /* JADX INFO: renamed from: a */
    public static void m18639a(VoiceGiftWallListView voiceGiftWallListView, View view) {
        voiceGiftWallListView.a = (VoiceGiftWallListView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceGiftWallListView.b = viewGroup.getChildAt(0);
        voiceGiftWallListView.c = (LinearLayout) viewGroup.getChildAt(1);
        voiceGiftWallListView.d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m18640b(VoiceGiftWallListView voiceGiftWallListView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19668R8, viewGroup, false);
        m18639a(voiceGiftWallListView, viewInflate);
        return viewInflate;
    }
}
