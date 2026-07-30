package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.home.views.CardPhotoFeedbackView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class nl4 {
    /* JADX INFO: renamed from: a */
    public static void m8341a(CardPhotoFeedbackView cardPhotoFeedbackView, View view) {
        cardPhotoFeedbackView.a = (CardPhotoFeedbackView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cardPhotoFeedbackView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cardPhotoFeedbackView.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        cardPhotoFeedbackView.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(2);
    }
}
