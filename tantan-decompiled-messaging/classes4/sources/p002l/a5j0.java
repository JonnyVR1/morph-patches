package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.live.livingroom.common.debugdialog.TraceDataDialog;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class a5j0 {
    /* JADX INFO: renamed from: a */
    public static void m9398a(TraceDataDialog traceDataDialog, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        traceDataDialog.f5010z = (RelativeLayout) viewGroup.getChildAt(0);
        traceDataDialog.f5007A = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        traceDataDialog.f5008B = viewGroup.getChildAt(1);
        traceDataDialog.f5009C = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m9399b(TraceDataDialog traceDataDialog, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19989r0, viewGroup, false);
        m9398a(traceDataDialog, viewInflate);
        return viewInflate;
    }
}
