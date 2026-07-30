package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.p046p1.mobile.putong.core.newui.PlatformQualificationView;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class kzf {
    /* JADX INFO: renamed from: a */
    public static void m147949a(izf izfVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        izfVar._list = (VRecyclerView) viewGroup.getChildAt(0);
        izfVar._empty = (NestedScrollView) viewGroup.getChildAt(1);
        izfVar._empty_text = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        izfVar._platform_qualification = (PlatformQualificationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        izfVar._get_privilege = (Button) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m147950b(izf izfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121316M0, viewGroup, false);
        m147949a(izfVar, viewInflate);
        return viewInflate;
    }
}
