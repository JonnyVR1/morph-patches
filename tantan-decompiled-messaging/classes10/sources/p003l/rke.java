package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.profile.intlfriendpurpose.EditIntlFriendPurposeAct;
import l.f6c0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class rke {
    /* JADX INFO: renamed from: a */
    public static void m9149a(EditIntlFriendPurposeAct editIntlFriendPurposeAct, View view) {
        editIntlFriendPurposeAct.c = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        editIntlFriendPurposeAct.d = viewGroup.getChildAt(0);
        editIntlFriendPurposeAct.e = viewGroup.getChildAt(2);
        editIntlFriendPurposeAct.f = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m9150b(EditIntlFriendPurposeAct editIntlFriendPurposeAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.s2, viewGroup, false);
        m9149a(editIntlFriendPurposeAct, viewInflate);
        return viewInflate;
    }
}
