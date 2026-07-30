package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.live.livingroom.voice.usercard.view.UserCardFamilyGroupView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ezj0 {
    /* JADX INFO: renamed from: a */
    public static void m12845a(UserCardFamilyGroupView userCardFamilyGroupView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        userCardFamilyGroupView.d = viewGroup.getChildAt(0);
        userCardFamilyGroupView.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        userCardFamilyGroupView.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        userCardFamilyGroupView.g = viewGroup.getChildAt(2);
        userCardFamilyGroupView.h = viewGroup.getChildAt(3);
    }
}
