package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.view.CircularProgressView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class enj0 {
    /* JADX INFO: renamed from: a */
    public static void m117279a(dnj0 dnj0Var, View view) {
        dnj0Var.f87068i = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        dnj0Var.f87069j = (VText) viewGroup.getChildAt(0);
        dnj0Var.f87070k = (VFrame) viewGroup.getChildAt(1);
        dnj0Var.f87071l = (CircularProgressView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        dnj0Var.f87072m = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        dnj0Var.f87073n = (VText) viewGroup.getChildAt(2);
        dnj0Var.f87074o = (VText) viewGroup.getChildAt(3);
        dnj0Var.f87075p = (VText) viewGroup.getChildAt(4);
        dnj0Var.f87076q = (VText) viewGroup.getChildAt(5);
    }
}
