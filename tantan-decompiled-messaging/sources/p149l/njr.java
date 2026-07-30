package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.p046p1.mobile.putong.core.newui.PlatformQualificationView;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class njr {
    /* JADX INFO: renamed from: a */
    public static void m159783a(mjr mjrVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mjrVar._list = (VRecyclerView) viewGroup.getChildAt(0);
        mjrVar._empty = (NestedScrollView) viewGroup.getChildAt(1);
        mjrVar._empty_text = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        mjrVar._platform_qualification = (PlatformQualificationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m159784b(mjr mjrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121322O0, viewGroup, false);
        m159783a(mjrVar, viewInflate);
        return viewInflate;
    }
}
