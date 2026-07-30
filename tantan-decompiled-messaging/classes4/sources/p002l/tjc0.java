package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.RedDotButton;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tjc0 {
    /* JADX INFO: renamed from: a */
    public static void m22984a(RedDotButton redDotButton, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        redDotButton.f4574a = (FrameLayout) viewGroup.getChildAt(0);
        redDotButton.f4575b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        redDotButton.f4576c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        redDotButton.f4577d = viewGroup.getChildAt(1);
    }
}
