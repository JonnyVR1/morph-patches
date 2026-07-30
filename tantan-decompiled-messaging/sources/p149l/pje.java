package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.EditAboutMeAct;
import p147v.VMaterialEdit;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class pje {
    /* JADX INFO: renamed from: a */
    public static void m169840a(EditAboutMeAct editAboutMeAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        editAboutMeAct.f32937c = (VMaterialEdit) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        editAboutMeAct.f32938d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        editAboutMeAct.f32939e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        editAboutMeAct.f32940f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m169841b(EditAboutMeAct editAboutMeAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95798gd, viewGroup, false);
        m169840a(editAboutMeAct, viewInflate);
        return viewInflate;
    }
}
