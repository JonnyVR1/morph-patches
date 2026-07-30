package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p147v.AutoVDraweeView;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class ayh {
    /* JADX INFO: renamed from: a */
    public static void m99543a(zxh zxhVar, View view) {
        zxhVar.f205422a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        zxhVar.f205423b = (VLinear) viewGroup.getChildAt(0);
        zxhVar.f205424c = (VRelative) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        zxhVar.f205425d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        zxhVar.f205426e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        zxhVar.f205427f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        zxhVar.f205428g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        zxhVar.f205429h = (AutoVDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        zxhVar.f205430i = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(0);
        zxhVar.f205431j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1);
        zxhVar.f205432k = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        zxhVar.f205433l = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m99544b(zxh zxhVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142285t, viewGroup, false);
        m99543a(zxhVar, viewInflate);
        return viewInflate;
    }
}
