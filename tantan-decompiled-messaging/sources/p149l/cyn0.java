package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.medalwall.view.VoiceMedalWallListView;
import p147v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class cyn0 {
    /* JADX INFO: renamed from: a */
    public static void m109386a(VoiceMedalWallListView voiceMedalWallListView, View view) {
        voiceMedalWallListView.f53277a = (VoiceMedalWallListView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceMedalWallListView.f53278b = (RecyclerView) viewGroup.getChildAt(0);
        voiceMedalWallListView.f53279c = (VLinear) viewGroup.getChildAt(1);
        voiceMedalWallListView.f53280d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m109387b(VoiceMedalWallListView voiceMedalWallListView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168029F9, viewGroup, false);
        m109386a(voiceMedalWallListView, viewInflate);
        return viewInflate;
    }
}
