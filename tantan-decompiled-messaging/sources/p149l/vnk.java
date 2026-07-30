package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class vnk {
    /* JADX INFO: renamed from: a */
    public static void m199030a(unk unkVar, View view) {
        unkVar.f177368a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        unkVar.f177369b = (FrameLayout) viewGroup.getChildAt(0);
        unkVar.f177370c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        unkVar.f177371d = (EditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        unkVar.f177372e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        unkVar.f177373f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        unkVar.f177374g = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        unkVar.f177375h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        unkVar.f177376i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        unkVar.f177377j = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        unkVar.f177378k = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        unkVar.f177379l = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        unkVar.f177380m = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m199031b(unk unkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126446c0, viewGroup, false);
        m199030a(unkVar, viewInflate);
        return viewInflate;
    }
}
