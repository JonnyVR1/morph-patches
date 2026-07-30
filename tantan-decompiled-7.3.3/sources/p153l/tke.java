package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.EditAboutMeAct;
import p151v.VMaterialEdit;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class tke {
    /* JADX INFO: renamed from: a */
    public static void m191544a(EditAboutMeAct editAboutMeAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        editAboutMeAct.f33785c = (VMaterialEdit) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        editAboutMeAct.f33786d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        editAboutMeAct.f33787e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        editAboutMeAct.f33788f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m191545b(EditAboutMeAct editAboutMeAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125970nd, viewGroup, false);
        m191544a(editAboutMeAct, viewInflate);
        return viewInflate;
    }
}
