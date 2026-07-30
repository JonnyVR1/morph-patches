package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.myinterestpeople.CoreMyInterestPeopleTraceAct;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class b3a {
    /* JADX INFO: renamed from: a */
    public static void m102276a(CoreMyInterestPeopleTraceAct coreMyInterestPeopleTraceAct, View view) {
        coreMyInterestPeopleTraceAct.f26787c = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        coreMyInterestPeopleTraceAct.f26788d = (VNavigationBar) viewGroup.getChildAt(0);
        coreMyInterestPeopleTraceAct.f26789e = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        coreMyInterestPeopleTraceAct.f26790f = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        coreMyInterestPeopleTraceAct.f26791g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        coreMyInterestPeopleTraceAct.f26792h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m102277b(CoreMyInterestPeopleTraceAct coreMyInterestPeopleTraceAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125520M7, viewGroup, false);
        m102276a(coreMyInterestPeopleTraceAct, viewInflate);
        return viewInflate;
    }
}
