package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.OperationCountDownCircleView;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.OperationItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zs50 {
    /* JADX INFO: renamed from: a */
    public static void m27528a(OperationItemView operationItemView, View view) {
        operationItemView.f6872a = (OperationItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        operationItemView.f6873b = (RelativeLayout) viewGroup.getChildAt(0);
        operationItemView.f6874c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        operationItemView.f6875d = (OperationCountDownCircleView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        operationItemView.f6876e = viewGroup.getChildAt(1);
        operationItemView.f6877f = viewGroup.getChildAt(2);
        operationItemView.f6878g = viewGroup.getChildAt(3);
    }
}
