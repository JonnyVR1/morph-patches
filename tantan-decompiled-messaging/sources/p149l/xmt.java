package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.external.page.setting.LiveSettingFragNew;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class xmt {
    /* JADX INFO: renamed from: a */
    public static void m210148a(LiveSettingFragNew liveSettingFragNew, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSettingFragNew.f46177z = (VNavigationBar) viewGroup.getChildAt(0);
        liveSettingFragNew.f46167A = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m210149b(LiveSettingFragNew liveSettingFragNew, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162772l0, viewGroup, false);
        m210148a(liveSettingFragNew, viewInflate);
        return viewInflate;
    }
}
