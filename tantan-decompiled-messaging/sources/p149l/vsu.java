package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.putong.live.base.webview.LiveMkWebView;
import p147v.VFrame;
import p147v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class vsu {
    /* JADX INFO: renamed from: a */
    public static void m199907a(fsu fsuVar, View view) {
        fsuVar.f99109a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fsuVar.f99110b = viewGroup.getChildAt(0);
        fsuVar.f99111c = (CardView) viewGroup.getChildAt(1);
        fsuVar.f99112d = (LiveMkWebView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        fsuVar.f99113e = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m199908b(fsu fsuVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162672H1, viewGroup, false);
        m199907a(fsuVar, viewInflate);
        return viewInflate;
    }
}
