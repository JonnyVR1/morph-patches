package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.view.UserCardFamilyGroupView;
import p151v.VDraweeView;
import p151v.VMarqueeText;

/* JADX INFO: loaded from: classes4.dex */
public class k8k0 {
    /* JADX INFO: renamed from: a */
    public static void m148712a(UserCardFamilyGroupView userCardFamilyGroupView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        userCardFamilyGroupView.f54691d = (VDraweeView) viewGroup.getChildAt(0);
        userCardFamilyGroupView.f54692e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        userCardFamilyGroupView.f54693f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        userCardFamilyGroupView.f54694g = (VMarqueeText) viewGroup.getChildAt(2);
        userCardFamilyGroupView.f54695h = (VMarqueeText) viewGroup.getChildAt(3);
    }
}
