package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MaskMenuView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class g3x {
    /* JADX INFO: renamed from: a */
    public static void m10413a(MaskMenuView maskMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        maskMenuView.f1232a = viewGroup.getChildAt(0);
        maskMenuView.f1233b = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        maskMenuView.f1234c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        maskMenuView.f1235d = viewGroup.getChildAt(2);
    }
}
