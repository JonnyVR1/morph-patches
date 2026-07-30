package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.p046p1.mobile.putong.app.web.WebViewX;
import p147v.VLinear;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class nai {
    /* JADX INFO: renamed from: a */
    public static void m158689a(mai maiVar, View view) {
        maiVar.f132885a = (VLinear) view.findViewById(b5c0.f73479F0);
        ViewGroup viewGroup = (ViewGroup) view;
        maiVar.f132886b = (VNavigationBar) viewGroup.getChildAt(0);
        maiVar.f132887c = (FrameLayout) viewGroup.getChildAt(1);
        maiVar.f132888d = (WebViewX) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        maiVar.f132889e = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        maiVar.f132890f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        maiVar.f132891g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        maiVar.f132892h = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m158690b(mai maiVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142084O3, viewGroup, false);
        m158689a(maiVar, viewInflate);
        return viewInflate;
    }
}
