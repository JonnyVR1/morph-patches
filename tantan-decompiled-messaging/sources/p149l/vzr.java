package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VEditText;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class vzr {
    /* JADX INFO: renamed from: a */
    public static void m200778a(uzr uzrVar, View view) {
        uzrVar.f179017k = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        uzrVar.f179018l = viewGroup.getChildAt(0);
        uzrVar.f179019m = viewGroup.getChildAt(1);
        uzrVar.f179020n = viewGroup.getChildAt(2);
        uzrVar.f179021o = (VImage) viewGroup.getChildAt(3);
        uzrVar.f179022p = (VText) viewGroup.getChildAt(4);
        uzrVar.f179023q = (TextView) viewGroup.getChildAt(5);
        uzrVar.f179024r = viewGroup.getChildAt(6);
        uzrVar.f179025s = (VEditText) viewGroup.getChildAt(7);
        uzrVar.f179026t = (TextView) viewGroup.getChildAt(8);
    }

    /* JADX INFO: renamed from: b */
    public static View m200779b(uzr uzrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168007E, viewGroup, false);
        m200778a(uzrVar, viewInflate);
        return viewInflate;
    }
}
