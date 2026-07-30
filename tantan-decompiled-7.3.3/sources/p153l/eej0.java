package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.livingroom.common.debugdialog.TraceDataDialog;

/* JADX INFO: loaded from: classes4.dex */
public class eej0 {
    /* JADX INFO: renamed from: a */
    public static void m120548a(TraceDataDialog traceDataDialog, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        traceDataDialog.f49816z = (RelativeLayout) viewGroup.getChildAt(0);
        traceDataDialog.f49813A = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        traceDataDialog.f49814B = (TabLayout) viewGroup.getChildAt(1);
        traceDataDialog.f49815C = (ViewPager) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m120549b(TraceDataDialog traceDataDialog, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199225r0, viewGroup, false);
        m120548a(traceDataDialog, viewInflate);
        return viewInflate;
    }
}
