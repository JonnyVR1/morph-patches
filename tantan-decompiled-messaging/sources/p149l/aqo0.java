package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.SvgAndImageView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetCpView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetErrorView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetSmoothSpeedRecycle;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class aqo0 {
    /* JADX INFO: renamed from: a */
    public static void m98324a(VoiceSweetCpView voiceSweetCpView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceSweetCpView.f53544a = (VoiceSweetSmoothSpeedRecycle) viewGroup.getChildAt(0);
        voiceSweetCpView.f53545b = (VRelative) viewGroup.getChildAt(1);
        voiceSweetCpView.f53546c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceSweetCpView.f53547d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        voiceSweetCpView.f53548e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        voiceSweetCpView.f53549f = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        voiceSweetCpView.f53550g = (VText) viewGroup.getChildAt(2);
        voiceSweetCpView.f53551h = (VRecyclerView) viewGroup.getChildAt(3);
        voiceSweetCpView.f53552i = (VoiceSweetErrorView) viewGroup.getChildAt(4);
        voiceSweetCpView.f53553j = (SvgAndImageView) viewGroup.getChildAt(5);
    }
}
