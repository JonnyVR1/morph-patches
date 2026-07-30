package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class gph {
    /* JADX INFO: renamed from: a */
    public static void m131258a(fph fphVar, View view) {
        fphVar.f100140a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fphVar.f100141b = viewGroup.getChildAt(0);
        fphVar.f100142c = (RelativeLayout) viewGroup.getChildAt(1);
        fphVar.f100143d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        fphVar.f100144e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        fphVar.f100145f = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        fphVar.f100146g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        fphVar.f100147h = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        fphVar.f100148i = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        fphVar.f100149j = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(0);
        fphVar.f100150k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(1);
        fphVar.f100151l = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
        fphVar.f100152m = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1)).getChildAt(0);
        fphVar.f100153n = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1)).getChildAt(1);
        fphVar.f100154o = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2);
        fphVar.f100155p = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2)).getChildAt(0);
        fphVar.f100156q = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2)).getChildAt(1);
        fphVar.f100157r = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(3);
        fphVar.f100158s = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(3)).getChildAt(0);
        fphVar.f100159t = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(3)).getChildAt(1);
        fphVar.f100160u = (VEditText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        fphVar.f100161v = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        fphVar.f100162w = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m131259b(fph fphVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173715n2, viewGroup, false);
        m131258a(fphVar, viewInflate);
        return viewInflate;
    }
}
