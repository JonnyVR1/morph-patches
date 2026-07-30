package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class qn90 {
    /* JADX INFO: renamed from: a */
    public static void m177211a(ProfileAct profileAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileAct.f33863c = (VLinear) viewGroup.getChildAt(0);
        profileAct.f33864d = (VLinear) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m177212b(ProfileAct profileAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125702Xd, viewGroup, false);
        m177211a(profileAct, viewInflate);
        return viewInflate;
    }
}
