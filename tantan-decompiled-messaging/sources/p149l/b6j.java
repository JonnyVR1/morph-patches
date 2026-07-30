package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.freetrial.FreeTrialCard;

/* JADX INFO: loaded from: classes10.dex */
public class b6j {
    /* JADX INFO: renamed from: a */
    public static void m100407a(FreeTrialCard freeTrialCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        freeTrialCard.f29176a = viewGroup.getChildAt(0);
        freeTrialCard.f29177b = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        freeTrialCard.f29178c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        freeTrialCard.f29179d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        freeTrialCard.f29180e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        freeTrialCard.f29181f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
    }
}
