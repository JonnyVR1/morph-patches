package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.OperationCountDownCircleView;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.OperationItemView;
import p151v.VDraweeView;
import p151v.VMarqueeText;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class f160 {
    /* JADX INFO: renamed from: a */
    public static void m123556a(OperationItemView operationItemView, View view) {
        operationItemView.f51678a = (OperationItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        operationItemView.f51679b = (RelativeLayout) viewGroup.getChildAt(0);
        operationItemView.f51680c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        operationItemView.f51681d = (OperationCountDownCircleView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        operationItemView.f51682e = (VDraweeView) viewGroup.getChildAt(1);
        operationItemView.f51683f = (VText) viewGroup.getChildAt(2);
        operationItemView.f51684g = (VMarqueeText) viewGroup.getChildAt(3);
    }
}
