package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.liveend.VoiceLiveEndHeartBeatItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class wnn0 {
    /* JADX INFO: renamed from: a */
    public static void m204750a(VoiceLiveEndHeartBeatItemView voiceLiveEndHeartBeatItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLiveEndHeartBeatItemView.f53255a = (VDraweeView) viewGroup.getChildAt(0);
        voiceLiveEndHeartBeatItemView.f53256b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceLiveEndHeartBeatItemView.f53257c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        voiceLiveEndHeartBeatItemView.f53258d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        voiceLiveEndHeartBeatItemView.f53259e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        voiceLiveEndHeartBeatItemView.f53260f = (VText) viewGroup.getChildAt(2);
    }
}
