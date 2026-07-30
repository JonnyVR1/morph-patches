package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.OperationEntranceAnimView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class oz50 {
    /* JADX INFO: renamed from: a */
    public static void m169914a(OperationEntranceAnimView operationEntranceAnimView, View view) {
        operationEntranceAnimView.f51674f = (OperationEntranceAnimView) view;
        operationEntranceAnimView.f51675g = (VDraweeView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m169915b(OperationEntranceAnimView operationEntranceAnimView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198804J4, viewGroup, false);
        m169914a(operationEntranceAnimView, viewInflate);
        return viewInflate;
    }
}
