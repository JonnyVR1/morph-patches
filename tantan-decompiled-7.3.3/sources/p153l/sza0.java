package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.itemholders.ProfileReportItemHolder;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class sza0 {
    /* JADX INFO: renamed from: a */
    public static void m188631a(ProfileReportItemHolder profileReportItemHolder, View view) {
        profileReportItemHolder.f34927u = (VLinear_Dividers) view;
        profileReportItemHolder.f34928v = (VText) ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m188632b(ProfileReportItemHolder profileReportItemHolder, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125866ha, viewGroup, false);
        m188631a(profileReportItemHolder, viewInflate);
        return viewInflate;
    }
}
