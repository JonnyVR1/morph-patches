package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.p1.mobile.putong.core.newui.home.views.HomeTitleMenuLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ldl {
    /* JADX INFO: renamed from: a */
    public static void m7714a(HomeTitleMenuLayout homeTitleMenuLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        homeTitleMenuLayout.c = (ViewStub) viewGroup.getChildAt(0);
        homeTitleMenuLayout.d = viewGroup.getChildAt(1);
        homeTitleMenuLayout.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        homeTitleMenuLayout.f = viewGroup.getChildAt(2);
        homeTitleMenuLayout.g = viewGroup.getChildAt(3);
        homeTitleMenuLayout.h = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        homeTitleMenuLayout.i = viewGroup.getChildAt(4);
        homeTitleMenuLayout.j = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        homeTitleMenuLayout.k = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }
}
