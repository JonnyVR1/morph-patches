package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.PkMatchProfileBlackView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class o280 {
    /* JADX INFO: renamed from: a */
    public static void m165701a(n280 n280Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        n280Var.f139832i = viewGroup.getChildAt(0);
        n280Var.f139833j = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        n280Var.f139834k = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        n280Var.f139835l = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        n280Var.f139836m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        n280Var.f139837n = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        n280Var.f139838o = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        n280Var.f139839p = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        n280Var.f139840q = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6)).getChildAt(0);
        n280Var.f139841r = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6)).getChildAt(1);
        n280Var.f139842s = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        n280Var.f139843t = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(0);
        n280Var.f139844u = (PkMatchProfileBlackView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(1);
        n280Var.f139845v = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        n280Var.f139846w = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        n280Var.f139847x = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        n280Var.f139848y = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7)).getChildAt(1);
        n280Var.f139849z = (Button) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
        n280Var.f139823A = (Button) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9);
        n280Var.f139824B = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m165702b(n280 n280Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199035c5, viewGroup, false);
        m165701a(n280Var, viewInflate);
        return viewInflate;
    }
}
