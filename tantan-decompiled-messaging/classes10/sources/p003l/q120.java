package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.visitor.myvisitors.MyVisitorRecoverHideFootPrintView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class q120 {
    /* JADX INFO: renamed from: a */
    public static void m8848a(MyVisitorRecoverHideFootPrintView myVisitorRecoverHideFootPrintView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        myVisitorRecoverHideFootPrintView.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        myVisitorRecoverHideFootPrintView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        myVisitorRecoverHideFootPrintView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        myVisitorRecoverHideFootPrintView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        myVisitorRecoverHideFootPrintView.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        myVisitorRecoverHideFootPrintView.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        myVisitorRecoverHideFootPrintView.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        myVisitorRecoverHideFootPrintView.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        myVisitorRecoverHideFootPrintView.i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        myVisitorRecoverHideFootPrintView.j = viewGroup.getChildAt(1);
    }
}
