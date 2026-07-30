package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.other.livecover.LiveCoverAct;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class k7s {
    /* JADX INFO: renamed from: a */
    public static void m148641a(LiveCoverAct liveCoverAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveCoverAct.f52042c = (VDraweeView) viewGroup.getChildAt(0);
        liveCoverAct.f52043d = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveCoverAct.f52044e = (VDraweeView) view.findViewById(mdc0.f135904C2);
        ViewGroup viewGroup2 = (ViewGroup) view;
        liveCoverAct.f52045f = (VButton) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(1);
        liveCoverAct.f52046g = (VText) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2);
        liveCoverAct.f52047h = (VText) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(3);
        liveCoverAct.f52048i = (VText) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(4);
        liveCoverAct.f52049j = (VButton) viewGroup2.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m148642b(LiveCoverAct liveCoverAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199173n0, viewGroup, false);
        m148641a(liveCoverAct, viewInflate);
        return viewInflate;
    }
}
