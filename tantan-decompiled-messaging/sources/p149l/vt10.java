package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.mutualcontacts.MutualContactsAct;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class vt10 {
    /* JADX INFO: renamed from: a */
    public static void m199912a(MutualContactsAct mutualContactsAct, View view) {
        mutualContactsAct.f32563d = (VText) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m199913b(MutualContactsAct mutualContactsAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95714be, viewGroup, false);
        m199912a(mutualContactsAct, viewInflate);
        return viewInflate;
    }
}
