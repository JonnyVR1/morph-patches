package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.home.views.CardPhotoFeedbackView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class mm4 {
    /* JADX INFO: renamed from: a */
    public static void m158954a(CardPhotoFeedbackView cardPhotoFeedbackView, View view) {
        cardPhotoFeedbackView.f24469a = (CardPhotoFeedbackView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cardPhotoFeedbackView.f24470b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cardPhotoFeedbackView.f24471c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        cardPhotoFeedbackView.f24472d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(2);
    }
}
