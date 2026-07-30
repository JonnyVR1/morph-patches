package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class xs60 {
    /* JADX INFO: renamed from: a */
    public static void m210731a(ws60 ws60Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ws60Var.f187879c = (VScroll) viewGroup.getChildAt(0);
        ws60Var.f187880d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        ws60Var.f187881e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        ws60Var.f187882f = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        ws60Var.f187883g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        ws60Var.f187884h = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        ws60Var.f187885i = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(2);
        ws60Var.f187886j = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        ws60Var.f187887k = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        ws60Var.f187888l = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        ws60Var.f187889m = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        ws60Var.f187890n = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        ws60Var.f187891o = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5);
        ws60Var.f187892p = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(0);
        ws60Var.f187893q = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1);
        ws60Var.f187894r = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(6);
        ws60Var.f187895s = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(6)).getChildAt(0);
        ws60Var.f187896t = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(7)).getChildAt(0);
        ws60Var.f187897u = (AnimEffectPlayer) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(7)).getChildAt(1);
        ws60Var.f187898v = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(8);
        ws60Var.f187899w = (ConstraintLayout) viewGroup.getChildAt(1);
        ws60Var.f187900x = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ws60Var.f187901y = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ws60Var.f187902z = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        ws60Var.f187869A = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m210732b(ws60 ws60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79474N, viewGroup, false);
        m210731a(ws60Var, viewInflate);
        return viewInflate;
    }
}
