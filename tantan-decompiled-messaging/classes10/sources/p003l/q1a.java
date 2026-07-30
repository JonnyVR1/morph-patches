package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.myinterestpeople.CoreMyInterestPeopleTraceAct;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class q1a {
    /* JADX INFO: renamed from: a */
    public static void m8850a(CoreMyInterestPeopleTraceAct coreMyInterestPeopleTraceAct, View view) {
        coreMyInterestPeopleTraceAct.c = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        coreMyInterestPeopleTraceAct.d = viewGroup.getChildAt(0);
        coreMyInterestPeopleTraceAct.e = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        coreMyInterestPeopleTraceAct.f = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        coreMyInterestPeopleTraceAct.g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        coreMyInterestPeopleTraceAct.h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8851b(CoreMyInterestPeopleTraceAct coreMyInterestPeopleTraceAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.F7, viewGroup, false);
        m8850a(coreMyInterestPeopleTraceAct, viewInflate);
        return viewInflate;
    }
}
