package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvAlreadyChooseSongPageView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class k0r {
    /* JADX INFO: renamed from: a */
    public static void m144124a(KtvAlreadyChooseSongPageView ktvAlreadyChooseSongPageView, View view) {
        ktvAlreadyChooseSongPageView.f52374d = (KtvAlreadyChooseSongPageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ktvAlreadyChooseSongPageView.f52375e = (VRecyclerView) viewGroup.getChildAt(0);
        ktvAlreadyChooseSongPageView.f52376f = (VLinear) viewGroup.getChildAt(1);
        ktvAlreadyChooseSongPageView.f52377g = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ktvAlreadyChooseSongPageView.f52378h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
