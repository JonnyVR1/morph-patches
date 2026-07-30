package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.OperationEntranceAnimView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ir50 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m15312a(OperationEntranceAnimView operationEntranceAnimView, View view) {
        operationEntranceAnimView.f6868f = (OperationEntranceAnimView) view;
        operationEntranceAnimView.f6869g = ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m15313b(OperationEntranceAnimView operationEntranceAnimView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19568J4, viewGroup, false);
        m15312a(operationEntranceAnimView, viewInflate);
        return viewInflate;
    }
}
