package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.medalwall.view.VoiceMedalWallListView;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class g7o0 {
    /* JADX INFO: renamed from: a */
    public static void m129364a(VoiceMedalWallListView voiceMedalWallListView, View view) {
        voiceMedalWallListView.f54125a = (VoiceMedalWallListView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceMedalWallListView.f54126b = (RecyclerView) viewGroup.getChildAt(0);
        voiceMedalWallListView.f54127c = (VLinear) viewGroup.getChildAt(1);
        voiceMedalWallListView.f54128d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m129365b(VoiceMedalWallListView voiceMedalWallListView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198761F9, viewGroup, false);
        m129364a(voiceMedalWallListView, viewInflate);
        return viewInflate;
    }
}
