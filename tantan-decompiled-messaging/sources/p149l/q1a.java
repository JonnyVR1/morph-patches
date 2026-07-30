package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.myinterestpeople.CoreMyInterestPeopleTraceAct;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class q1a {
    /* JADX INFO: renamed from: a */
    public static void m172383a(CoreMyInterestPeopleTraceAct coreMyInterestPeopleTraceAct, View view) {
        coreMyInterestPeopleTraceAct.f26045c = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        coreMyInterestPeopleTraceAct.f26046d = (VNavigationBar) viewGroup.getChildAt(0);
        coreMyInterestPeopleTraceAct.f26047e = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        coreMyInterestPeopleTraceAct.f26048f = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        coreMyInterestPeopleTraceAct.f26049g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        coreMyInterestPeopleTraceAct.f26050h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m172384b(CoreMyInterestPeopleTraceAct coreMyInterestPeopleTraceAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95354F7, viewGroup, false);
        m172383a(coreMyInterestPeopleTraceAct, viewInflate);
        return viewInflate;
    }
}
