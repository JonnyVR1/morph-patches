package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.intlfriendpurpose.EditIntlFriendPurposeAct;
import p147v.VFrame;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class rke {
    /* JADX INFO: renamed from: a */
    public static void m179727a(EditIntlFriendPurposeAct editIntlFriendPurposeAct, View view) {
        editIntlFriendPurposeAct.f33374c = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        editIntlFriendPurposeAct.f33375d = (VImage) viewGroup.getChildAt(0);
        editIntlFriendPurposeAct.f33376e = (VRecyclerView) viewGroup.getChildAt(2);
        editIntlFriendPurposeAct.f33377f = (VText_NoTopPadding) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m179728b(EditIntlFriendPurposeAct editIntlFriendPurposeAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95990s2, viewGroup, false);
        m179727a(editIntlFriendPurposeAct, viewInflate);
        return viewInflate;
    }
}
