package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p046p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignSnapShotItemView;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class ad4 extends eb2 {

    /* JADX INFO: renamed from: e */
    public final vd4 f68907e;

    /* JADX INFO: renamed from: f */
    public final xc4 f68908f = new xc4();

    /* JADX INFO: renamed from: g */
    public final List<pc4> f68909g = new ArrayList();

    public ad4(vd4 vd4Var) {
        this.f68907e = vd4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m95858s(BLiveCampaign bLiveCampaign, View view) {
        this.f68907e.m197941F4(bLiveCampaign);
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f68909g.size();
    }

    @Override // p149l.w660
    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: m */
    public void mo43284m(Object obj) {
        super.mo43284m(obj);
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        pc4 pc4Var = this.f68909g.get(i);
        if (pc4Var instanceof fe4) {
            CampaignItemView campaignItemViewM208066b = this.f68908f.m208066b(i, viewGroup);
            campaignItemViewM208066b.m73431u(pc4Var.getCom.immomo.momomediaext.sei.BaseSei.INFO java.lang.String(), this.f68907e);
            campaignItemViewM208066b.setTag(g5c0.f101076v3, Integer.valueOf(i));
            viewGroup.addView(campaignItemViewM208066b);
            return campaignItemViewM208066b;
        }
        boolean z = pc4Var instanceof oc4;
        xc4 xc4Var = this.f68908f;
        if (!z) {
            CampaignSnapShotItemView campaignSnapShotItemViewM208067c = xc4Var.m208067c(viewGroup);
            campaignSnapShotItemViewM208067c.setTag(g5c0.f101076v3, Integer.valueOf(i));
            campaignSnapShotItemViewM208067c.m73434u(pc4Var.getCom.immomo.momomediaext.sei.BaseSei.INFO java.lang.String(), this.f68907e);
            viewGroup.addView(campaignSnapShotItemViewM208067c);
            return campaignSnapShotItemViewM208067c;
        }
        VDraweeView vDraweeViewM208068d = xc4Var.m208068d(i, viewGroup.getContext());
        final BLiveCampaign bLiveCampaign = pc4Var.getCom.immomo.momomediaext.sei.BaseSei.INFO java.lang.String();
        hxs.m133409v("context_single_room", vDraweeViewM208068d, bLiveCampaign.entranceImage, t100.m186890d(96.0f), t100.m186890d(126.0f), false, false, true, null);
        vDraweeViewM208068d.setTag(g5c0.f101076v3, Integer.valueOf(i));
        xdl0.m208329E0(vDraweeViewM208068d, new View.OnClickListener() { // from class: l.zc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202510a.m95858s(bLiveCampaign, view);
            }
        });
        viewGroup.addView(vDraweeViewM208068d);
        return vDraweeViewM208068d;
    }

    /* JADX INFO: renamed from: r */
    public void m95859r() {
        this.f68908f.m208065a();
    }

    /* JADX INFO: renamed from: t */
    public void m95860t() {
        this.f68908f.m208069e();
    }

    /* JADX INFO: renamed from: u */
    public void m95861u(List<pc4> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f68909g.clear();
        this.f68909g.addAll(list);
        notifyDataSetChanged();
    }
}
