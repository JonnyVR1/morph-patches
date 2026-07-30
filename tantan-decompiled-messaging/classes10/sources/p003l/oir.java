package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.home.member.likeme.LikeMeFilterView;
import com.p1.mobile.putong.core.ui.view.LikersFilterItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class oir {
    /* JADX INFO: renamed from: a */
    public static void m8458a(LikersFilterItemView likersFilterItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likersFilterItemView.a = (LikeMeFilterView) viewGroup.getChildAt(0);
        likersFilterItemView.b = viewGroup.getChildAt(1);
        likersFilterItemView.c = viewGroup.getChildAt(2);
        likersFilterItemView.d = viewGroup.getChildAt(3);
        likersFilterItemView.e = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }
}
