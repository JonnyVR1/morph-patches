package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.OperationEntranceAnimView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class ir50 {
    /* JADX INFO: renamed from: a */
    public static void m137821a(OperationEntranceAnimView operationEntranceAnimView, View view) {
        operationEntranceAnimView.f50826f = (OperationEntranceAnimView) view;
        operationEntranceAnimView.f50827g = (VDraweeView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m137822b(OperationEntranceAnimView operationEntranceAnimView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168072J4, viewGroup, false);
        m137821a(operationEntranceAnimView, viewInflate);
        return viewInflate;
    }
}
