package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubCompanyItemView;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubCompanyViewGroup;
import com.p1.mobile.putong.live.base.data.BLiveAccommpanyTasks;
import com.p1.mobile.putong.live.base.data.BLiveAccommpanyTasksProgress;
import java.util.List;
import l.s7m;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class i5g implements s7m<j5g> {

    /* JADX INFO: renamed from: a */
    public j5g f13050a;

    /* JADX INFO: renamed from: b */
    public final FansClubCompanyViewGroup f13051b;

    /* JADX INFO: renamed from: c */
    public final FansClubCompanyItemView f13052c;

    /* JADX INFO: renamed from: d */
    public final FansClubCompanyItemView f13053d;

    /* JADX INFO: renamed from: e */
    public final FansClubCompanyItemView f13054e;

    /* JADX INFO: renamed from: f */
    public final String f13055f;

    public i5g(FansClubCompanyViewGroup fansClubCompanyViewGroup, FansClubCompanyItemView fansClubCompanyItemView, FansClubCompanyItemView fansClubCompanyItemView2, FansClubCompanyItemView fansClubCompanyItemView3, String str) {
        this.f13051b = fansClubCompanyViewGroup;
        this.f13052c = fansClubCompanyItemView;
        this.f13053d = fansClubCompanyItemView2;
        this.f13054e = fansClubCompanyItemView3;
        this.f13055f = str;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m14999C0() {
        return this.f13052c.getContext();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m15003i1(j5g j5gVar) {
        this.f13050a = j5gVar;
    }

    /* JADX INFO: renamed from: c */
    public void m15002c(mcg mcgVar) {
        List<BLiveAccommpanyTasks> list = mcgVar.f15338h;
        if (vwb.J(list)) {
            this.f13052c.m6383k0();
            this.f13053d.m6383k0();
            this.f13054e.m6383k0();
            return;
        }
        BLiveAccommpanyTasksProgress bLiveAccommpanyTasksProgress = mcgVar.f15337g;
        boolean z = bLiveAccommpanyTasksProgress.current >= bLiveAccommpanyTasksProgress.max;
        this.f13052c.m6384l0(list.get(0), this.f13050a, z, this.f13055f, 1);
        int size = list.size();
        FansClubCompanyItemView fansClubCompanyItemView = this.f13053d;
        if (size > 1) {
            fansClubCompanyItemView.m6384l0(list.get(1), this.f13050a, z, this.f13055f, 2);
        } else {
            fansClubCompanyItemView.m6383k0();
        }
        int size2 = list.size();
        FansClubCompanyItemView fansClubCompanyItemView2 = this.f13054e;
        if (size2 > 2) {
            fansClubCompanyItemView2.m6384l0(list.get(2), this.f13050a, z, this.f13055f, 3);
        } else {
            fansClubCompanyItemView2.m6383k0();
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m15001b() {
    }

    public void destroy() {
    }
}
