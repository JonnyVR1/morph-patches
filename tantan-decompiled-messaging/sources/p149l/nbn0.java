package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.giftwall.view.VoiceGiftWallListView;

/* JADX INFO: loaded from: classes4.dex */
public class nbn0 {
    /* JADX INFO: renamed from: a */
    public static void m158816a(VoiceGiftWallListView voiceGiftWallListView, View view) {
        voiceGiftWallListView.f53174a = (VoiceGiftWallListView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceGiftWallListView.f53175b = (RecyclerView) viewGroup.getChildAt(0);
        voiceGiftWallListView.f53176c = (LinearLayout) viewGroup.getChildAt(1);
        voiceGiftWallListView.f53177d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m158817b(VoiceGiftWallListView voiceGiftWallListView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168172R8, viewGroup, false);
        m158816a(voiceGiftWallListView, viewInflate);
        return viewInflate;
    }
}
