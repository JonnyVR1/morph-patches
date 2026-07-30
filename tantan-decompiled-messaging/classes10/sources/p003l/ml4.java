package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.home.views.CardPhotoFeedbackViewOpt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ml4 {
    /* JADX INFO: renamed from: a */
    public static void m8166a(CardPhotoFeedbackViewOpt cardPhotoFeedbackViewOpt, View view) {
        cardPhotoFeedbackViewOpt.a = (CardPhotoFeedbackViewOpt) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cardPhotoFeedbackViewOpt.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cardPhotoFeedbackViewOpt.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        cardPhotoFeedbackViewOpt.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        cardPhotoFeedbackViewOpt.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(2);
    }
}
