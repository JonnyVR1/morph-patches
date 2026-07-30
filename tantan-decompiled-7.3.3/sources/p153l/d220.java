package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.mutualcontacts.MutualContactsAct;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class d220 {
    /* JADX INFO: renamed from: a */
    public static void m113657a(MutualContactsAct mutualContactsAct, View view) {
        mutualContactsAct.f33411d = (VText) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m113658b(MutualContactsAct mutualContactsAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125887ie, viewGroup, false);
        m113657a(mutualContactsAct, viewInflate);
        return viewInflate;
    }
}
