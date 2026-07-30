package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.view.UserCardFamilyGroupView;
import p147v.VDraweeView;
import p147v.VMarqueeText;

/* JADX INFO: loaded from: classes4.dex */
public class ezj0 {
    /* JADX INFO: renamed from: a */
    public static void m118981a(UserCardFamilyGroupView userCardFamilyGroupView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        userCardFamilyGroupView.f53843d = (VDraweeView) viewGroup.getChildAt(0);
        userCardFamilyGroupView.f53844e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        userCardFamilyGroupView.f53845f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        userCardFamilyGroupView.f53846g = (VMarqueeText) viewGroup.getChildAt(2);
        userCardFamilyGroupView.f53847h = (VMarqueeText) viewGroup.getChildAt(3);
    }
}
