package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.OperationCountDownCircleView;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.OperationItemView;
import p147v.VDraweeView;
import p147v.VMarqueeText;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class zs50 {
    /* JADX INFO: renamed from: a */
    public static void m219999a(OperationItemView operationItemView, View view) {
        operationItemView.f50830a = (OperationItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        operationItemView.f50831b = (RelativeLayout) viewGroup.getChildAt(0);
        operationItemView.f50832c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        operationItemView.f50833d = (OperationCountDownCircleView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        operationItemView.f50834e = (VDraweeView) viewGroup.getChildAt(1);
        operationItemView.f50835f = (VText) viewGroup.getChildAt(2);
        operationItemView.f50836g = (VMarqueeText) viewGroup.getChildAt(3);
    }
}
