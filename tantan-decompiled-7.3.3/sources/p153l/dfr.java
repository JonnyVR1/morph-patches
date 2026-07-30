package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class dfr {
    /* JADX INFO: renamed from: a */
    public static void m115532a(cfr cfrVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cfrVar._setting_img = (VDraweeView) viewGroup.getChildAt(0);
        cfrVar._setting_content_title = (TextView) viewGroup.getChildAt(1);
        cfrVar._setting_content_desc = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m115533b(cfr cfrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125597R4, viewGroup, false);
        m115532a(cfrVar, viewInflate);
        return viewInflate;
    }
}
