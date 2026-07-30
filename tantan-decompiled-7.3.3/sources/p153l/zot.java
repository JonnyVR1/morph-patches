package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.external.page.setting.LiveSettingFragNew;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class zot {
    /* JADX INFO: renamed from: a */
    public static void m220796a(LiveSettingFragNew liveSettingFragNew, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSettingFragNew.f47025z = (VNavigationBar) viewGroup.getChildAt(0);
        liveSettingFragNew.f47015A = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m220797b(LiveSettingFragNew liveSettingFragNew, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193886l0, viewGroup, false);
        m220796a(liveSettingFragNew, viewInflate);
        return viewInflate;
    }
}
