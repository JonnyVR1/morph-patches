package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.voiceslipcard.activity.LiveVoiceActivitiesItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class szu {
    /* JADX INFO: renamed from: a */
    public static void m186799a(LiveVoiceActivitiesItemView liveVoiceActivitiesItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVoiceActivitiesItemView.f46436u = (VRelative) viewGroup.getChildAt(0);
        liveVoiceActivitiesItemView.f46437v = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveVoiceActivitiesItemView.f46438w = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveVoiceActivitiesItemView.f46439x = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        liveVoiceActivitiesItemView.f46440y = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        liveVoiceActivitiesItemView.f46441z = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        liveVoiceActivitiesItemView.f46428A = (AnimEffectPlayer) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        liveVoiceActivitiesItemView.f46429B = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        liveVoiceActivitiesItemView.f46430C = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(2);
        liveVoiceActivitiesItemView.f46431D = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        liveVoiceActivitiesItemView.f46432E = (VText) viewGroup.getChildAt(1);
        liveVoiceActivitiesItemView.f46433F = (VText) viewGroup.getChildAt(2);
        liveVoiceActivitiesItemView.f46434G = (VText) viewGroup.getChildAt(3);
        liveVoiceActivitiesItemView.f46435H = (VText) viewGroup.getChildAt(4);
    }
}
