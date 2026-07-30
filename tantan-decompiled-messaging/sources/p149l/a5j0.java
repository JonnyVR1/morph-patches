package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.livingroom.common.debugdialog.TraceDataDialog;

/* JADX INFO: loaded from: classes4.dex */
public class a5j0 {
    /* JADX INFO: renamed from: a */
    public static void m95045a(TraceDataDialog traceDataDialog, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        traceDataDialog.f48968z = (RelativeLayout) viewGroup.getChildAt(0);
        traceDataDialog.f48965A = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        traceDataDialog.f48966B = (TabLayout) viewGroup.getChildAt(1);
        traceDataDialog.f48967C = (ViewPager) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m95046b(TraceDataDialog traceDataDialog, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168493r0, viewGroup, false);
        m95045a(traceDataDialog, viewInflate);
        return viewInflate;
    }
}
