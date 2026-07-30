package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.BottomVoicePlayItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ie3 {
    /* JADX INFO: renamed from: a */
    public static void m15099a(BottomVoicePlayItemView bottomVoicePlayItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bottomVoicePlayItemView.f4542a = viewGroup.getChildAt(0);
        bottomVoicePlayItemView.f4543b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        bottomVoicePlayItemView.f4544c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        bottomVoicePlayItemView.f4545d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        bottomVoicePlayItemView.f4546e = (TextView) viewGroup.getChildAt(1);
    }
}
