package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveAccommpanyTasks;
import com.p051p1.mobile.putong.live.base.data.BLiveAccommpanyTasksProgress;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubCompanyItemView;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubCompanyViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class w6g implements iam<x6g> {

    /* JADX INFO: renamed from: a */
    public x6g f187613a;

    /* JADX INFO: renamed from: b */
    public final FansClubCompanyViewGroup f187614b;

    /* JADX INFO: renamed from: c */
    public final FansClubCompanyItemView f187615c;

    /* JADX INFO: renamed from: d */
    public final FansClubCompanyItemView f187616d;

    /* JADX INFO: renamed from: e */
    public final FansClubCompanyItemView f187617e;

    /* JADX INFO: renamed from: f */
    public final String f187618f;

    public w6g(FansClubCompanyViewGroup fansClubCompanyViewGroup, FansClubCompanyItemView fansClubCompanyItemView, FansClubCompanyItemView fansClubCompanyItemView2, FansClubCompanyItemView fansClubCompanyItemView3, String str) {
        this.f187614b = fansClubCompanyViewGroup;
        this.f187615c = fansClubCompanyItemView;
        this.f187616d = fansClubCompanyItemView2;
        this.f187617e = fansClubCompanyItemView3;
        this.f187618f = str;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f187615c.getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(x6g x6gVar) {
        this.f187613a = x6gVar;
    }

    /* JADX INFO: renamed from: c */
    public void m205100c(aeg aegVar) {
        List<BLiveAccommpanyTasks> list = aegVar.f70798h;
        if (jyb.m147479J(list)) {
            this.f187615c.m74047k0();
            this.f187616d.m74047k0();
            this.f187617e.m74047k0();
            return;
        }
        BLiveAccommpanyTasksProgress bLiveAccommpanyTasksProgress = aegVar.f70797g;
        boolean z = bLiveAccommpanyTasksProgress.current >= bLiveAccommpanyTasksProgress.max;
        this.f187615c.m74048l0(list.get(0), this.f187613a, z, this.f187618f, 1);
        int size = list.size();
        FansClubCompanyItemView fansClubCompanyItemView = this.f187616d;
        if (size > 1) {
            fansClubCompanyItemView.m74048l0(list.get(1), this.f187613a, z, this.f187618f, 2);
        } else {
            fansClubCompanyItemView.m74047k0();
        }
        int size2 = list.size();
        FansClubCompanyItemView fansClubCompanyItemView2 = this.f187617e;
        if (size2 > 2) {
            fansClubCompanyItemView2.m74048l0(list.get(2), this.f187613a, z, this.f187618f, 3);
        } else {
            fansClubCompanyItemView2.m74047k0();
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m205099b() {
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
