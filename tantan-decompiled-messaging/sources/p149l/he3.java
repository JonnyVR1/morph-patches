package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.BottomVoiceItemView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class he3 {
    /* JADX INFO: renamed from: a */
    public static void m130618a(BottomVoiceItemView bottomVoiceItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bottomVoiceItemView.f48494a = (FrameLayout) viewGroup.getChildAt(0);
        bottomVoiceItemView.f48495b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        bottomVoiceItemView.f48496c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        bottomVoiceItemView.f48497d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        bottomVoiceItemView.f48498e = (TextView) viewGroup.getChildAt(1);
    }
}
