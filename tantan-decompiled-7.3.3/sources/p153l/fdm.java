package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p151v.VButton;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class fdm {
    /* JADX INFO: renamed from: a */
    public static void m125103a(edm edmVar, View view) {
        edmVar.f93531a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        edmVar.f93532b = (VFrame) viewGroup.getChildAt(0);
        edmVar.f93533c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        edmVar.f93534d = (VText) viewGroup.getChildAt(1);
        edmVar.f93535e = (LinearLayout) viewGroup.getChildAt(2);
        edmVar.f93536f = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        edmVar.f93537g = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        edmVar.f93538h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        edmVar.f93539i = (RelativeLayout) viewGroup.getChildAt(3);
        edmVar.f93540j = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        edmVar.f93541k = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        edmVar.f93542l = (VButton) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m125104b(edm edmVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f156854G0, viewGroup, false);
        m125103a(edmVar, viewInflate);
        return viewInflate;
    }
}
