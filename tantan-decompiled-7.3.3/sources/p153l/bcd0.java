package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.external.page.rights.list.view.RightMedalTipsView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class bcd0 {
    /* JADX INFO: renamed from: a */
    public static void m103494a(RightMedalTipsView rightMedalTipsView, View view) {
        rightMedalTipsView.f46938a = (RightMedalTipsView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rightMedalTipsView.f46939b = (ConstraintLayout) viewGroup.getChildAt(0);
        rightMedalTipsView.f46940c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        rightMedalTipsView.f46941d = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        rightMedalTipsView.f46942e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
