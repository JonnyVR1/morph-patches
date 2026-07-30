package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VRecyclerView;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class cwj0 {
    /* JADX INFO: renamed from: a */
    public static void m112923a(bwj0 bwj0Var, View view) {
        bwj0Var.f78744i = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        bwj0Var.f78745j = (AnimEffectPlayer) viewGroup.getChildAt(0);
        bwj0Var.f78746k = (VRecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        bwj0Var.f78747l = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        bwj0Var.f78748m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        bwj0Var.f78749n = (VRecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        bwj0Var.f78750o = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        bwj0Var.f78751p = (VText) viewGroup.getChildAt(2);
    }
}
