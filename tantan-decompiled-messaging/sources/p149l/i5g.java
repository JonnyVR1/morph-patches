package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveAccommpanyTasks;
import com.p046p1.mobile.putong.live.base.data.BLiveAccommpanyTasksProgress;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubCompanyItemView;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubCompanyViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class i5g implements s7m<j5g> {

    /* JADX INFO: renamed from: a */
    public j5g f111572a;

    /* JADX INFO: renamed from: b */
    public final FansClubCompanyViewGroup f111573b;

    /* JADX INFO: renamed from: c */
    public final FansClubCompanyItemView f111574c;

    /* JADX INFO: renamed from: d */
    public final FansClubCompanyItemView f111575d;

    /* JADX INFO: renamed from: e */
    public final FansClubCompanyItemView f111576e;

    /* JADX INFO: renamed from: f */
    public final String f111577f;

    public i5g(FansClubCompanyViewGroup fansClubCompanyViewGroup, FansClubCompanyItemView fansClubCompanyItemView, FansClubCompanyItemView fansClubCompanyItemView2, FansClubCompanyItemView fansClubCompanyItemView3, String str) {
        this.f111573b = fansClubCompanyViewGroup;
        this.f111574c = fansClubCompanyItemView;
        this.f111575d = fansClubCompanyItemView2;
        this.f111576e = fansClubCompanyItemView3;
        this.f111577f = str;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f111574c.getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(j5g j5gVar) {
        this.f111572a = j5gVar;
    }

    /* JADX INFO: renamed from: c */
    public void m134481c(mcg mcgVar) {
        List<BLiveAccommpanyTasks> list = mcgVar.f133110h;
        if (vwb.m200296J(list)) {
            this.f111574c.m72864k0();
            this.f111575d.m72864k0();
            this.f111576e.m72864k0();
            return;
        }
        BLiveAccommpanyTasksProgress bLiveAccommpanyTasksProgress = mcgVar.f133109g;
        boolean z = bLiveAccommpanyTasksProgress.current >= bLiveAccommpanyTasksProgress.max;
        this.f111574c.m72865l0(list.get(0), this.f111572a, z, this.f111577f, 1);
        int size = list.size();
        FansClubCompanyItemView fansClubCompanyItemView = this.f111575d;
        if (size > 1) {
            fansClubCompanyItemView.m72865l0(list.get(1), this.f111572a, z, this.f111577f, 2);
        } else {
            fansClubCompanyItemView.m72864k0();
        }
        int size2 = list.size();
        FansClubCompanyItemView fansClubCompanyItemView2 = this.f111576e;
        if (size2 > 2) {
            fansClubCompanyItemView2.m72865l0(list.get(2), this.f111572a, z, this.f111577f, 3);
        } else {
            fansClubCompanyItemView2.m72864k0();
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m134480b() {
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
