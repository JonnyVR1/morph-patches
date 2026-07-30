package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.fakecard.FakeDailogCard;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class uwf {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m9789a(FakeDailogCard fakeDailogCard, View view) {
        fakeDailogCard.f1551a = (FakeDailogCard) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fakeDailogCard.f1552b = viewGroup.getChildAt(0);
        fakeDailogCard.f1553c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fakeDailogCard.f1554d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        fakeDailogCard.f1555e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        fakeDailogCard.f1556f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        fakeDailogCard.f1557g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        fakeDailogCard.f1558h = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
