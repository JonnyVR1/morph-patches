package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class rnh {
    /* JADX INFO: renamed from: a */
    public static void m180066a(qnh qnhVar, View view) {
        qnhVar.f155449a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        qnhVar.f155450b = viewGroup.getChildAt(0);
        qnhVar.f155451c = (RelativeLayout) viewGroup.getChildAt(1);
        qnhVar.f155452d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        qnhVar.f155453e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        qnhVar.f155454f = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        qnhVar.f155455g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        qnhVar.f155456h = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        qnhVar.f155457i = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        qnhVar.f155458j = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(0);
        qnhVar.f155459k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(1);
        qnhVar.f155460l = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
        qnhVar.f155461m = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1)).getChildAt(0);
        qnhVar.f155462n = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1)).getChildAt(1);
        qnhVar.f155463o = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2);
        qnhVar.f155464p = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2)).getChildAt(0);
        qnhVar.f155465q = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2)).getChildAt(1);
        qnhVar.f155466r = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(3);
        qnhVar.f155467s = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(3)).getChildAt(0);
        qnhVar.f155468t = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(3)).getChildAt(1);
        qnhVar.f155469u = (VEditText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        qnhVar.f155470v = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        qnhVar.f155471w = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m180067b(qnh qnhVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142246n2, viewGroup, false);
        m180066a(qnhVar, viewInflate);
        return viewInflate;
    }
}
