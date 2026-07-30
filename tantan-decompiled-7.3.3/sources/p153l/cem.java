package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowTagsView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class cem {
    /* JADX INFO: renamed from: a */
    public static void m109378a(bem bemVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bemVar.f76389h = viewGroup.getChildAt(0);
        bemVar.f76390i = (LinearLayout) viewGroup.getChildAt(1);
        bemVar.f76391j = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        bemVar.f76392k = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        bemVar.f76393l = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        bemVar.f76394m = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        bemVar.f76395n = (FlowTagsView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        bemVar.f76396o = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m109379b(bem bemVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125345Bc, viewGroup, false);
        m109378a(bemVar, viewInflate);
        return viewInflate;
    }
}
