package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.UnScrollVPager;

/* JADX INFO: loaded from: classes4.dex */
public class rsn0 {
    /* JADX INFO: renamed from: a */
    public static void m180716a(qsn0 qsn0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qsn0Var._empty = viewGroup.getChildAt(0);
        qsn0Var._managerDialogTitle = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        qsn0Var._voiceManagerExplain = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        qsn0Var._line = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        qsn0Var._tab_layout = (TabLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        qsn0Var._viewpager = (UnScrollVPager) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m180717b(qsn0 qsn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168554v9, viewGroup, false);
        m180716a(qsn0Var, viewInflate);
        return viewInflate;
    }
}
