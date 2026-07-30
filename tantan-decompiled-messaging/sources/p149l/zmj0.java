package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VRecyclerView;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class zmj0 {
    /* JADX INFO: renamed from: a */
    public static void m219349a(ymj0 ymj0Var, View view) {
        ymj0Var.f199018i = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ymj0Var.f199019j = (AnimEffectPlayer) viewGroup.getChildAt(0);
        ymj0Var.f199020k = (VRecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        ymj0Var.f199021l = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        ymj0Var.f199022m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ymj0Var.f199023n = (VRecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        ymj0Var.f199024o = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        ymj0Var.f199025p = (VText) viewGroup.getChildAt(2);
    }
}
