package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.livingroom.common.signin.main.SignInAnimFrame;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class e5f0 {
    /* JADX INFO: renamed from: a */
    public static void m114789a(v4f0 v4f0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        v4f0Var.f179919a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        v4f0Var.f179920b = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        v4f0Var.f179921c = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        v4f0Var.f179922d = (SignInAnimFrame) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m114790b(v4f0 v4f0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f167989C5, viewGroup, false);
        m114789a(v4f0Var, viewInflate);
        return viewInflate;
    }
}
