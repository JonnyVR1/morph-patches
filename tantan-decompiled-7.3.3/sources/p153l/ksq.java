package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.putong.live.livingroom.view.JumpNextView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ksq {
    /* JADX INFO: renamed from: a */
    public static void m151278a(JumpNextView jumpNextView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        jumpNextView.f52776a = (CardView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        jumpNextView.f52777b = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        jumpNextView.f52778c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        jumpNextView.f52779d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        jumpNextView.f52780e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        jumpNextView.f52781f = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}
