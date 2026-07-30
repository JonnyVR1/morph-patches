package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VFrame;
import p151v.VFrame_Shadow;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class e5x {
    /* JADX INFO: renamed from: a */
    public static void m119557a(d5x d5xVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        d5xVar.f85207a = (VFrame) viewGroup.getChildAt(0);
        d5xVar.f85208b = (VFrame) viewGroup.getChildAt(1);
        d5xVar.f85209c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        d5xVar.f85210d = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        d5xVar.f85211e = (VFrame_Shadow) viewGroup.getChildAt(2);
        d5xVar.f85212f = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        d5xVar.f85213g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m119558b(d5x d5xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167573j0, viewGroup, false);
        m119557a(d5xVar, viewInflate);
        return viewInflate;
    }
}
