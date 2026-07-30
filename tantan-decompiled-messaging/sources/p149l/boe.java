package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class boe {
    /* JADX INFO: renamed from: a */
    public static void m102941a(aoe aoeVar, View view) {
        aoeVar.f70851u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        aoeVar.f70852v = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        aoeVar.f70853w = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        aoeVar.f70854x = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        aoeVar.f70855y = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        aoeVar.f70856z = (LinearLayout) viewGroup.getChildAt(1);
        aoeVar.f70843A = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        aoeVar.f70844B = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        aoeVar.f70845C = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        aoeVar.f70846D = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        aoeVar.f70847E = (VLinear) viewGroup.getChildAt(2);
        aoeVar.f70848F = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        aoeVar.f70849G = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        aoeVar.f70850H = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m102942b(aoe aoeVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95453La, viewGroup, false);
        m102941a(aoeVar, viewInflate);
        return viewInflate;
    }
}
