package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.unk;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vnk {
    /* JADX INFO: renamed from: a */
    public static void m10250a(unk unkVar, View view) {
        unkVar.a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        unkVar.b = (FrameLayout) viewGroup.getChildAt(0);
        unkVar.c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        unkVar.d = (EditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        unkVar.e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        unkVar.f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        unkVar.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        unkVar.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        unkVar.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        unkVar.j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        unkVar.k = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        unkVar.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        unkVar.m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10251b(unk unkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f5955c0, viewGroup, false);
        m10250a(unkVar, viewInflate);
        return viewInflate;
    }
}
