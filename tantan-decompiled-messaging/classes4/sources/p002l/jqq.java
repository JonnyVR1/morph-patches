package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.live.livingroom.view.JumpNextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jqq {
    /* JADX INFO: renamed from: a */
    public static void m16178a(JumpNextView jumpNextView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        jumpNextView.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        jumpNextView.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        jumpNextView.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        jumpNextView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        jumpNextView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        jumpNextView.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}
