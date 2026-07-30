package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.intlfriendpurpose.EditIntlFriendPurposeAct;
import p151v.VFrame;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class vle {
    /* JADX INFO: renamed from: a */
    public static void m201597a(EditIntlFriendPurposeAct editIntlFriendPurposeAct, View view) {
        editIntlFriendPurposeAct.f34222c = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        editIntlFriendPurposeAct.f34223d = (VImage) viewGroup.getChildAt(0);
        editIntlFriendPurposeAct.f34224e = (VRecyclerView) viewGroup.getChildAt(2);
        editIntlFriendPurposeAct.f34225f = (VText_NoTopPadding) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m201598b(EditIntlFriendPurposeAct editIntlFriendPurposeAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126044s2, viewGroup, false);
        m201597a(editIntlFriendPurposeAct, viewInflate);
        return viewInflate;
    }
}
