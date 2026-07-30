package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.freetrial.FreeTrialCard;

/* JADX INFO: loaded from: classes10.dex */
public class v8j {
    /* JADX INFO: renamed from: a */
    public static void m200307a(FreeTrialCard freeTrialCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        freeTrialCard.f30024a = viewGroup.getChildAt(0);
        freeTrialCard.f30025b = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        freeTrialCard.f30026c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        freeTrialCard.f30027d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        freeTrialCard.f30028e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        freeTrialCard.f30029f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
    }
}
