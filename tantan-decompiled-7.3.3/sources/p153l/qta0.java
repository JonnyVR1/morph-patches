package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopEditPetUploadPhoto;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopEditUploadPhoto;
import p151v.VList;

/* JADX INFO: loaded from: classes10.dex */
public class qta0 {
    /* JADX INFO: renamed from: a */
    public static void m177905a(pta0 pta0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pta0Var.f154003a = (TextView) viewGroup.getChildAt(0);
        pta0Var.f154004b = (TextView) viewGroup.getChildAt(1);
        pta0Var.f154005c = (VList) viewGroup.getChildAt(2);
        pta0Var.f154006d = (ProfileLoopEditUploadPhoto) viewGroup.getChildAt(3);
        pta0Var.f154007e = (ProfileLoopEditPetUploadPhoto) viewGroup.getChildAt(4);
        pta0Var.f154008f = (ProfileLoopActionLayout) viewGroup.getChildAt(5);
        pta0Var.f154009g = (FrameLayout) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m177906b(pta0 pta0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167512G0, viewGroup, false);
        m177905a(pta0Var, viewInflate);
        return viewInflate;
    }
}
