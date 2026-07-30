package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import p147v.VDraweeView;
import p147v.VProgressBar;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class soy {
    /* JADX INFO: renamed from: a */
    public static void m185309a(roy royVar, View view) {
        royVar.f160434a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        royVar.f160435b = (VProgressBar) viewGroup.getChildAt(0);
        royVar.f160436c = (FrameLayout) viewGroup.getChildAt(1);
        royVar.f160437d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        royVar.f160438e = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        royVar.f160439f = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        royVar.f160440g = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        royVar.f160441h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        royVar.f160442i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        royVar.f160443j = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        royVar.f160444k = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        royVar.f160445l = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        royVar.f160446m = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        royVar.f160447n = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        royVar.f160448o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        royVar.f160449p = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m185310b(roy royVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126449c3, viewGroup, false);
        m185309a(royVar, viewInflate);
        return viewInflate;
    }
}
