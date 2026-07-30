package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.putong.live.livingroom.view.JumpNextView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class jqq {
    /* JADX INFO: renamed from: a */
    public static void m142830a(JumpNextView jumpNextView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        jumpNextView.f51928a = (CardView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        jumpNextView.f51929b = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        jumpNextView.f51930c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        jumpNextView.f51931d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        jumpNextView.f51932e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        jumpNextView.f51933f = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}
