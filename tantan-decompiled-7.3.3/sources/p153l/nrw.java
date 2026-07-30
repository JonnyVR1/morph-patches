package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.view.MagicGestureItemView;
import p151v.VDraweeView;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class nrw {
    /* JADX INFO: renamed from: a */
    public static void m164534a(MagicGestureItemView magicGestureItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        magicGestureItemView.f52903a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        magicGestureItemView.f52904b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        magicGestureItemView.f52905c = (VRecyclerView) view.findViewById(mdc0.f136303t3);
    }
}
