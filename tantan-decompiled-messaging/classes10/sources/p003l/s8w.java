package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.lovebuzz.widget.LoveBuzzMessageHeadView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class s8w {
    /* JADX INFO: renamed from: a */
    public static void m9245a(LoveBuzzMessageHeadView loveBuzzMessageHeadView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        loveBuzzMessageHeadView.a = viewGroup.getChildAt(0);
        loveBuzzMessageHeadView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        loveBuzzMessageHeadView.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        loveBuzzMessageHeadView.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        loveBuzzMessageHeadView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        loveBuzzMessageHeadView.f = viewGroup.getChildAt(1);
        loveBuzzMessageHeadView.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        loveBuzzMessageHeadView.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        loveBuzzMessageHeadView.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
