package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.freetrial.FreeTrialCard;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class b6j {
    /* JADX INFO: renamed from: a */
    public static void m5695a(FreeTrialCard freeTrialCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        freeTrialCard.f1570a = viewGroup.getChildAt(0);
        freeTrialCard.f1571b = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        freeTrialCard.f1572c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        freeTrialCard.f1573d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        freeTrialCard.f1574e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        freeTrialCard.f1575f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
    }
}
