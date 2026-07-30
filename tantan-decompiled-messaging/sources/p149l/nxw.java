package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.view.AboutMeNewCaseLayout;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class nxw {
    /* JADX INFO: renamed from: a */
    public static void m161955a(mxw mxwVar, View view) {
        mxwVar.f136217c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mxwVar.f136218d = (VText) viewGroup.getChildAt(0);
        mxwVar.f136219e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        mxwVar.f136220f = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        mxwVar.f136221g = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        mxwVar.f136222h = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        mxwVar.f136223i = (TextView) viewGroup.getChildAt(2);
        mxwVar.f136224j = (AboutMeNewCaseLayout) viewGroup.getChildAt(3);
        mxwVar.f136225k = (VLinear) viewGroup.getChildAt(4);
        mxwVar.f136226l = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        mxwVar.f136227m = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m161956b(mxw mxwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137315P, viewGroup, false);
        m161955a(mxwVar, viewInflate);
        return viewInflate;
    }
}
