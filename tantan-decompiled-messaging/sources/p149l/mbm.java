package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowTagsView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class mbm {
    /* JADX INFO: renamed from: a */
    public static void m153960a(lbm lbmVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        lbmVar.f127311h = viewGroup.getChildAt(0);
        lbmVar.f127312i = (LinearLayout) viewGroup.getChildAt(1);
        lbmVar.f127313j = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        lbmVar.f127314k = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        lbmVar.f127315l = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        lbmVar.f127316m = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        lbmVar.f127317n = (FlowTagsView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        lbmVar.f127318o = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m153961b(lbm lbmVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96034uc, viewGroup, false);
        m153960a(lbmVar, viewInflate);
        return viewInflate;
    }
}
