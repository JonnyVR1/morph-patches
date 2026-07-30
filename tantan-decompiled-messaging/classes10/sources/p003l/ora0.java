package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.profile.profilelist.itemholders.ProfileReportItemHolder;
import l.f6c0;
import v.VLinear_Dividers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ora0 {
    /* JADX INFO: renamed from: a */
    public static void m8582a(ProfileReportItemHolder profileReportItemHolder, View view) {
        profileReportItemHolder.u = (VLinear_Dividers) view;
        profileReportItemHolder.v = ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8583b(ProfileReportItemHolder profileReportItemHolder, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.aa, viewGroup, false);
        m8582a(profileReportItemHolder, viewInflate);
        return viewInflate;
    }
}
