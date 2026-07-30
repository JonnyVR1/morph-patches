package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.p051p1.mobile.putong.core.newui.PlatformQualificationView;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class olr {
    /* JADX INFO: renamed from: a */
    public static void m168161a(nlr nlrVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        nlrVar._list = (VRecyclerView) viewGroup.getChildAt(0);
        nlrVar._empty = (NestedScrollView) viewGroup.getChildAt(1);
        nlrVar._empty_text = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        nlrVar._platform_qualification = (PlatformQualificationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m168162b(nlr nlrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151930O0, viewGroup, false);
        m168161a(nlrVar, viewInflate);
        return viewInflate;
    }
}
