package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.fakecard.FakeDailogCard;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class uwf {
    /* JADX INFO: renamed from: a */
    public static void m196128a(FakeDailogCard fakeDailogCard, View view) {
        fakeDailogCard.f29157a = (FakeDailogCard) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fakeDailogCard.f29158b = (ConstraintLayout) viewGroup.getChildAt(0);
        fakeDailogCard.f29159c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fakeDailogCard.f29160d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        fakeDailogCard.f29161e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        fakeDailogCard.f29162f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        fakeDailogCard.f29163g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        fakeDailogCard.f29164h = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
