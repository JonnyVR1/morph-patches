package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.voiceslipcard.activity.LiveVoiceActivitiesItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class t1v {
    /* JADX INFO: renamed from: a */
    public static void m188938a(LiveVoiceActivitiesItemView liveVoiceActivitiesItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVoiceActivitiesItemView.f47284u = (VRelative) viewGroup.getChildAt(0);
        liveVoiceActivitiesItemView.f47285v = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveVoiceActivitiesItemView.f47286w = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveVoiceActivitiesItemView.f47287x = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        liveVoiceActivitiesItemView.f47288y = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        liveVoiceActivitiesItemView.f47289z = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        liveVoiceActivitiesItemView.f47276A = (AnimEffectPlayer) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        liveVoiceActivitiesItemView.f47277B = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        liveVoiceActivitiesItemView.f47278C = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(2);
        liveVoiceActivitiesItemView.f47279D = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        liveVoiceActivitiesItemView.f47280E = (VText) viewGroup.getChildAt(1);
        liveVoiceActivitiesItemView.f47281F = (VText) viewGroup.getChildAt(2);
        liveVoiceActivitiesItemView.f47282G = (VText) viewGroup.getChildAt(3);
        liveVoiceActivitiesItemView.f47283H = (VText) viewGroup.getChildAt(4);
    }
}
