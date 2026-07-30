package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.photo.AvatarCards;

/* JADX INFO: loaded from: classes10.dex */
public class kme {
    /* JADX INFO: renamed from: a */
    public static void m150431a(jme jmeVar, View view) {
        jmeVar.f121666u = (AvatarCards) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m150432b(jme jmeVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126061t2, viewGroup, false);
        m150431a(jmeVar, viewInflate);
        return viewInflate;
    }
}
