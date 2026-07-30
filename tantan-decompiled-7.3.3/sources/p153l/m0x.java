package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.view.AboutMeNewCaseLayout;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class m0x {
    /* JADX INFO: renamed from: a */
    public static void m156544a(l0x l0xVar, View view) {
        l0xVar.f129608c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        l0xVar.f129609d = (VText) viewGroup.getChildAt(0);
        l0xVar.f129610e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        l0xVar.f129611f = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        l0xVar.f129612g = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        l0xVar.f129613h = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        l0xVar.f129614i = (TextView) viewGroup.getChildAt(2);
        l0xVar.f129615j = (AboutMeNewCaseLayout) viewGroup.getChildAt(3);
        l0xVar.f129616k = (VLinear) viewGroup.getChildAt(4);
        l0xVar.f129617l = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        l0xVar.f129618m = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m156545b(l0x l0xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167529P, viewGroup, false);
        m156544a(l0xVar, viewInflate);
        return viewInflate;
    }
}
