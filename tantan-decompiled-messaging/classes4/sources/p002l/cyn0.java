package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.intl.medalwall.view.VoiceMedalWallListView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cyn0 {
    /* JADX INFO: renamed from: a */
    public static void m11527a(VoiceMedalWallListView voiceMedalWallListView, View view) {
        voiceMedalWallListView.a = (VoiceMedalWallListView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceMedalWallListView.b = viewGroup.getChildAt(0);
        voiceMedalWallListView.c = viewGroup.getChildAt(1);
        voiceMedalWallListView.d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m11528b(VoiceMedalWallListView voiceMedalWallListView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19525F9, viewGroup, false);
        m11527a(voiceMedalWallListView, viewInflate);
        return viewInflate;
    }
}
