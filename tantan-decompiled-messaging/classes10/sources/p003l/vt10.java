package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.mutualcontacts.MutualContactsAct;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vt10 {
    /* JADX INFO: renamed from: a */
    public static void m10346a(MutualContactsAct mutualContactsAct, View view) {
        mutualContactsAct.d = ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m10347b(MutualContactsAct mutualContactsAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.be, viewGroup, false);
        m10346a(mutualContactsAct, viewInflate);
        return viewInflate;
    }
}
