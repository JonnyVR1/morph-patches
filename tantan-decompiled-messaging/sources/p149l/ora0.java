package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.itemholders.ProfileReportItemHolder;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ora0 {
    /* JADX INFO: renamed from: a */
    public static void m165528a(ProfileReportItemHolder profileReportItemHolder, View view) {
        profileReportItemHolder.f34079u = (VLinear_Dividers) view;
        profileReportItemHolder.f34080v = (VText) ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m165529b(ProfileReportItemHolder profileReportItemHolder, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95693aa, viewGroup, false);
        m165528a(profileReportItemHolder, viewInflate);
        return viewInflate;
    }
}
