package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.ui.sayHi.view.SayHiDialogContainer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class isd0 {
    /* JADX INFO: renamed from: a */
    public static void m7292a(SayHiDialogContainer sayHiDialogContainer, View view) {
        sayHiDialogContainer.a = (SayHiDialogContainer) view;
        ViewGroup viewGroup = (ViewGroup) view;
        sayHiDialogContainer.b = viewGroup.getChildAt(0);
        sayHiDialogContainer.c = (RelativeLayout) viewGroup.getChildAt(1);
        sayHiDialogContainer.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        sayHiDialogContainer.e = (RelativeLayout) viewGroup.getChildAt(2);
        sayHiDialogContainer.f = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        sayHiDialogContainer.g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        sayHiDialogContainer.h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        sayHiDialogContainer.i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        sayHiDialogContainer.j = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        sayHiDialogContainer.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(0);
        sayHiDialogContainer.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(1);
        sayHiDialogContainer.m = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        sayHiDialogContainer.n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5)).getChildAt(0);
        sayHiDialogContainer.o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5)).getChildAt(1);
        sayHiDialogContainer.p = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6);
        sayHiDialogContainer.q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6)).getChildAt(0);
        sayHiDialogContainer.r = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6)).getChildAt(1);
        sayHiDialogContainer.s = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(7);
        sayHiDialogContainer.t = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(7)).getChildAt(0);
        sayHiDialogContainer.u = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(7)).getChildAt(1);
    }
}
