package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.mutualcontacts.MutualContactsAct;
import p147v.VList;

/* JADX INFO: loaded from: classes10.dex */
public class ut10 {
    /* JADX INFO: renamed from: a */
    public static void m195272a(MutualContactsAct mutualContactsAct, View view) {
        mutualContactsAct.f32562c = (VList) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m195273b(MutualContactsAct mutualContactsAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95697ae, viewGroup, false);
        m195272a(mutualContactsAct, viewInflate);
        return viewInflate;
    }
}
