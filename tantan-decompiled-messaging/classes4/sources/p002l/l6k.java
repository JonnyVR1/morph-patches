package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import l.k6k;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class l6k {
    /* JADX INFO: renamed from: a */
    public static void m17018a(k6k k6kVar, View view) {
        k6kVar.k = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        k6kVar.l = viewGroup.getChildAt(0);
        k6kVar.m = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        k6kVar.n = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        k6kVar.o = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        k6kVar.p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        k6kVar.q = (CommonMaskAvatarView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        k6kVar.r = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(2);
        k6kVar.s = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(3);
        k6kVar.t = (CommonMaskAvatarView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(4);
    }
}
