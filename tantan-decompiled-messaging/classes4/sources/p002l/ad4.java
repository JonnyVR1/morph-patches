package p002l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignItemView;
import com.p1.mobile.putong.live.base.data.BLiveCampaign;
import java.util.ArrayList;
import java.util.List;
import l.eb2;
import l.hxs;
import l.t100;
import l.vwb;
import l.xdl0;
import l.ym2;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ad4 extends eb2 {

    /* JADX INFO: renamed from: e */
    public final vd4 f7505e;

    /* JADX INFO: renamed from: f */
    public final xc4 f7506f = new xc4();

    /* JADX INFO: renamed from: g */
    public final List<pc4> f7507g = new ArrayList();

    public ad4(vd4 vd4Var) {
        this.f7505e = vd4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m9504s(BLiveCampaign bLiveCampaign, View view) {
        this.f7505e.m23844F4(bLiveCampaign);
    }

    public int getCount() {
        return this.f7507g.size();
    }

    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: m */
    public void m9505m(Object obj) {
        super.m(obj);
    }

    /* JADX INFO: renamed from: o */
    public void m9506o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, com.p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignSnapShotItemView, java.lang.Object] */
    /* JADX INFO: renamed from: p */
    public Object m9507p(ViewGroup viewGroup, int i) {
        pc4 pc4Var = this.f7507g.get(i);
        if (pc4Var instanceof fe4) {
            CampaignItemView campaignItemViewM25828b = this.f7506f.m25828b(i, viewGroup);
            campaignItemViewM25828b.m6971u(pc4Var.getInfo(), this.f7505e);
            campaignItemViewM25828b.setTag(g5c0.f11226v3, Integer.valueOf(i));
            viewGroup.addView(campaignItemViewM25828b);
            return campaignItemViewM25828b;
        }
        boolean z = pc4Var instanceof oc4;
        xc4 xc4Var = this.f7506f;
        if (!z) {
            ?? M25829c = xc4Var.m25829c(viewGroup);
            M25829c.setTag(g5c0.f11226v3, Integer.valueOf(i));
            M25829c.m6976u(pc4Var.getInfo(), this.f7505e);
            viewGroup.addView(M25829c);
            return M25829c;
        }
        VDraweeView vDraweeViewM25830d = xc4Var.m25830d(i, viewGroup.getContext());
        final BLiveCampaign info = pc4Var.getInfo();
        hxs.v("context_single_room", vDraweeViewM25830d, info.entranceImage, t100.d(96.0f), t100.d(126.0f), false, false, true, (ym2) null);
        vDraweeViewM25830d.setTag(g5c0.f11226v3, Integer.valueOf(i));
        xdl0.E0(vDraweeViewM25830d, new View.OnClickListener() { // from class: l.zc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23334a.m9504s(info, view);
            }
        });
        viewGroup.addView(vDraweeViewM25830d);
        return vDraweeViewM25830d;
    }

    /* JADX INFO: renamed from: r */
    public void m9508r() {
        this.f7506f.m25827a();
    }

    /* JADX INFO: renamed from: t */
    public void m9509t() {
        this.f7506f.m25831e();
    }

    /* JADX INFO: renamed from: u */
    public void m9510u(List<pc4> list) {
        if (vwb.J(list)) {
            return;
        }
        this.f7507g.clear();
        this.f7507g.addAll(list);
        notifyDataSetChanged();
    }
}
