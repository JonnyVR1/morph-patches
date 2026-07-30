package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.p051p1.mobile.putong.core.newui.PlatformQualificationView;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class y0g {
    /* JADX INFO: renamed from: a */
    public static void m213846a(w0g w0gVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        w0gVar._list = (VRecyclerView) viewGroup.getChildAt(0);
        w0gVar._empty = (NestedScrollView) viewGroup.getChildAt(1);
        w0gVar._empty_text = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        w0gVar._platform_qualification = (PlatformQualificationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        w0gVar._get_privilege = (Button) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m213847b(w0g w0gVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151924M0, viewGroup, false);
        m213846a(w0gVar, viewInflate);
        return viewInflate;
    }
}
