package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.mutualcontacts.MutualContactsAct;
import l.f6c0;
import v.VList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ut10 {
    /* JADX INFO: renamed from: a */
    public static void m9780a(MutualContactsAct mutualContactsAct, View view) {
        mutualContactsAct.c = (VList) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m9781b(MutualContactsAct mutualContactsAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.ae, viewGroup, false);
        m9780a(mutualContactsAct, viewInflate);
        return viewInflate;
    }
}
