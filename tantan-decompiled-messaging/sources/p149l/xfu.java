package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.campaign.view.LiveVChatCampaignItemView;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.campaign.view.LiveVChatCampaignSnapShotItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class xfu extends eb2 {

    /* JADX INFO: renamed from: e */
    public final kgu f192716e;

    /* JADX INFO: renamed from: f */
    public final vfu f192717f = new vfu();

    /* JADX INFO: renamed from: g */
    public final List<qc4> f192718g = new ArrayList();

    public xfu(kgu kguVar) {
        this.f192716e = kguVar;
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f192718g.size();
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
        qc4 qc4Var = this.f192718g.get(i);
        boolean z = qc4Var instanceof ge4;
        vfu vfuVar = this.f192717f;
        if (z) {
            LiveVChatCampaignItemView liveVChatCampaignItemViewM198290b = vfuVar.m198290b(i, viewGroup);
            liveVChatCampaignItemViewM198290b.m69344u(qc4Var.getCom.immomo.momomediaext.sei.BaseSei.INFO java.lang.String(), this.f192716e);
            liveVChatCampaignItemViewM198290b.setTag(f5c0.f95022L0, Integer.valueOf(i));
            viewGroup.addView(liveVChatCampaignItemViewM198290b);
            return liveVChatCampaignItemViewM198290b;
        }
        LiveVChatCampaignSnapShotItemView liveVChatCampaignSnapShotItemViewM198291c = vfuVar.m198291c(viewGroup);
        liveVChatCampaignSnapShotItemViewM198291c.setTag(f5c0.f95022L0, Integer.valueOf(i));
        liveVChatCampaignSnapShotItemViewM198291c.m69347u(qc4Var.getCom.immomo.momomediaext.sei.BaseSei.INFO java.lang.String());
        viewGroup.addView(liveVChatCampaignSnapShotItemViewM198291c);
        return liveVChatCampaignSnapShotItemViewM198291c;
    }

    /* JADX INFO: renamed from: q */
    public void m208611q() {
        this.f192717f.m198289a();
    }

    /* JADX INFO: renamed from: r */
    public void m208612r() {
        this.f192717f.m198292d();
    }

    /* JADX INFO: renamed from: s */
    public void m208613s(List<qc4> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f192718g.clear();
        this.f192718g.addAll(list);
        notifyDataSetChanged();
    }
}
