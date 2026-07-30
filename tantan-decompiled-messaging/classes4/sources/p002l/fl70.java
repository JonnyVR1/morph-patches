package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.live.livingroom.recreation.pk.view.bounty.PkBountyView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fl70 {
    /* JADX INFO: renamed from: a */
    public static void m13288a(PkBountyView pkBountyView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pkBountyView.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        pkBountyView.b = viewGroup.getChildAt(1);
    }
}
