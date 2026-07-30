package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.liveend.VoiceLiveEndHeartBeatItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class axn0 {
    /* JADX INFO: renamed from: a */
    public static void m100782a(VoiceLiveEndHeartBeatItemView voiceLiveEndHeartBeatItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLiveEndHeartBeatItemView.f54103a = (VDraweeView) viewGroup.getChildAt(0);
        voiceLiveEndHeartBeatItemView.f54104b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceLiveEndHeartBeatItemView.f54105c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        voiceLiveEndHeartBeatItemView.f54106d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        voiceLiveEndHeartBeatItemView.f54107e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        voiceLiveEndHeartBeatItemView.f54108f = (VText) viewGroup.getChildAt(2);
    }
}
