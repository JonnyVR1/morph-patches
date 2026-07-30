package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view.SvgAndImageView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetCpView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetErrorView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetSmoothSpeedRecycle;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ezo0 {
    /* JADX INFO: renamed from: a */
    public static void m123395a(VoiceSweetCpView voiceSweetCpView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceSweetCpView.f54392a = (VoiceSweetSmoothSpeedRecycle) viewGroup.getChildAt(0);
        voiceSweetCpView.f54393b = (VRelative) viewGroup.getChildAt(1);
        voiceSweetCpView.f54394c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceSweetCpView.f54395d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        voiceSweetCpView.f54396e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        voiceSweetCpView.f54397f = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        voiceSweetCpView.f54398g = (VText) viewGroup.getChildAt(2);
        voiceSweetCpView.f54399h = (VRecyclerView) viewGroup.getChildAt(3);
        voiceSweetCpView.f54400i = (VoiceSweetErrorView) viewGroup.getChildAt(4);
        voiceSweetCpView.f54401j = (SvgAndImageView) viewGroup.getChildAt(5);
    }
}
