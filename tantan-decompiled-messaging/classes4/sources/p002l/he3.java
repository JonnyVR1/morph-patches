package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.BottomVoiceItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class he3 {
    /* JADX INFO: renamed from: a */
    public static void m14344a(BottomVoiceItemView bottomVoiceItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bottomVoiceItemView.f4536a = (FrameLayout) viewGroup.getChildAt(0);
        bottomVoiceItemView.f4537b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        bottomVoiceItemView.f4538c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        bottomVoiceItemView.f4539d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        bottomVoiceItemView.f4540e = (TextView) viewGroup.getChildAt(1);
    }
}
