package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.fakecard.FakeDailogCard;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class iyf {
    /* JADX INFO: renamed from: a */
    public static void m142654a(FakeDailogCard fakeDailogCard, View view) {
        fakeDailogCard.f30005a = (FakeDailogCard) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fakeDailogCard.f30006b = (ConstraintLayout) viewGroup.getChildAt(0);
        fakeDailogCard.f30007c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fakeDailogCard.f30008d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        fakeDailogCard.f30009e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        fakeDailogCard.f30010f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        fakeDailogCard.f30011g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        fakeDailogCard.f30012h = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
