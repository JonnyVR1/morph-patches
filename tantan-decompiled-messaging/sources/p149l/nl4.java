package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.views.CardPhotoFeedbackView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class nl4 {
    /* JADX INFO: renamed from: a */
    public static void m160013a(CardPhotoFeedbackView cardPhotoFeedbackView, View view) {
        cardPhotoFeedbackView.f23727a = (CardPhotoFeedbackView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cardPhotoFeedbackView.f23728b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cardPhotoFeedbackView.f23729c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        cardPhotoFeedbackView.f23730d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(2);
    }
}
