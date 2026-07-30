package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.visitor.myvisitors.MyVisitorMenuPopupView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class m120 {
    /* JADX INFO: renamed from: a */
    public static void m7937a(MyVisitorMenuPopupView myVisitorMenuPopupView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        myVisitorMenuPopupView.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        myVisitorMenuPopupView.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        myVisitorMenuPopupView.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        myVisitorMenuPopupView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        myVisitorMenuPopupView.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        myVisitorMenuPopupView.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        myVisitorMenuPopupView.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        myVisitorMenuPopupView.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        myVisitorMenuPopupView.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
    }
}
