package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvAlreadyChooseSongPageView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class l2r {
    /* JADX INFO: renamed from: a */
    public static void m152630a(KtvAlreadyChooseSongPageView ktvAlreadyChooseSongPageView, View view) {
        ktvAlreadyChooseSongPageView.f53222d = (KtvAlreadyChooseSongPageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ktvAlreadyChooseSongPageView.f53223e = (VRecyclerView) viewGroup.getChildAt(0);
        ktvAlreadyChooseSongPageView.f53224f = (VLinear) viewGroup.getChildAt(1);
        ktvAlreadyChooseSongPageView.f53225g = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ktvAlreadyChooseSongPageView.f53226h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
