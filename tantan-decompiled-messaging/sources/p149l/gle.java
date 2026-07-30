package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.photo.AvatarCards;

/* JADX INFO: loaded from: classes10.dex */
public class gle {
    /* JADX INFO: renamed from: a */
    public static void m126748a(fle fleVar, View view) {
        fleVar.f98153u = (AvatarCards) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m126749b(fle fleVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96007t2, viewGroup, false);
        m126748a(fleVar, viewInflate);
        return viewInflate;
    }
}
