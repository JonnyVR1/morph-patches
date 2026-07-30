package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class rnh {
    /* JADX INFO: renamed from: a */
    public static void m13929a(qnh qnhVar, View view) {
        qnhVar.f12306a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        qnhVar.f12307b = viewGroup.getChildAt(0);
        qnhVar.f12308c = (RelativeLayout) viewGroup.getChildAt(1);
        qnhVar.f12309d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        qnhVar.f12310e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        qnhVar.f12311f = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        qnhVar.f12312g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        qnhVar.f12313h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        qnhVar.f12314i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        qnhVar.f12315j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(0);
        qnhVar.f12316k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(1);
        qnhVar.f12317l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
        qnhVar.f12318m = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1)).getChildAt(0);
        qnhVar.f12319n = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1)).getChildAt(1);
        qnhVar.f12320o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2);
        qnhVar.f12321p = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2)).getChildAt(0);
        qnhVar.f12322q = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2)).getChildAt(1);
        qnhVar.f12323r = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(3);
        qnhVar.f12324s = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(3)).getChildAt(0);
        qnhVar.f12325t = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(3)).getChildAt(1);
        qnhVar.f12326u = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        qnhVar.f12327v = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        qnhVar.f12328w = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m13930b(qnh qnhVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11265n2, viewGroup, false);
        m13929a(qnhVar, viewInflate);
        return viewInflate;
    }
}
