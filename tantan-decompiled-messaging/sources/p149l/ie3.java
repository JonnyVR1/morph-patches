package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.BottomVoicePlayItemView;
import p147v.VDraweeView;
import p147v.VFrame;

/* JADX INFO: loaded from: classes4.dex */
public class ie3 {
    /* JADX INFO: renamed from: a */
    public static void m135656a(BottomVoicePlayItemView bottomVoicePlayItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bottomVoicePlayItemView.f48500a = (VFrame) viewGroup.getChildAt(0);
        bottomVoicePlayItemView.f48501b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        bottomVoicePlayItemView.f48502c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        bottomVoicePlayItemView.f48503d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        bottomVoicePlayItemView.f48504e = (TextView) viewGroup.getChildAt(1);
    }
}
