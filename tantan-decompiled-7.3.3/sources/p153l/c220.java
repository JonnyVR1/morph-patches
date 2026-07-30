package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.mutualcontacts.MutualContactsAct;
import p151v.VList;

/* JADX INFO: loaded from: classes10.dex */
public class c220 {
    /* JADX INFO: renamed from: a */
    public static void m107665a(MutualContactsAct mutualContactsAct, View view) {
        mutualContactsAct.f33410c = (VList) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m107666b(MutualContactsAct mutualContactsAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125870he, viewGroup, false);
        m107665a(mutualContactsAct, viewInflate);
        return viewInflate;
    }
}
