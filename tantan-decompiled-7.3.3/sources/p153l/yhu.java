package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.campaign.view.LiveVChatCampaignItemView;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.campaign.view.LiveVChatCampaignSnapShotItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class yhu extends lb2 {

    /* JADX INFO: renamed from: e */
    public final liu f199989e;

    /* JADX INFO: renamed from: f */
    public final whu f199990f = new whu();

    /* JADX INFO: renamed from: g */
    public final List<pd4> f199991g = new ArrayList();

    public yhu(liu liuVar) {
        this.f199989e = liuVar;
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f199991g.size();
    }

    @Override // p153l.cf60
    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: m */
    public void mo44299m(Object obj) {
        super.mo44299m(obj);
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        pd4 pd4Var = this.f199991g.get(i);
        boolean z = pd4Var instanceof ff4;
        whu whuVar = this.f199990f;
        if (z) {
            LiveVChatCampaignItemView liveVChatCampaignItemViewM206507b = whuVar.m206507b(i, viewGroup);
            liveVChatCampaignItemViewM206507b.m70527u(pd4Var.getCom.immomo.momomediaext.sei.BaseSei.INFO java.lang.String(), this.f199989e);
            liveVChatCampaignItemViewM206507b.setTag(ldc0.f131479L0, Integer.valueOf(i));
            viewGroup.addView(liveVChatCampaignItemViewM206507b);
            return liveVChatCampaignItemViewM206507b;
        }
        LiveVChatCampaignSnapShotItemView liveVChatCampaignSnapShotItemViewM206508c = whuVar.m206508c(viewGroup);
        liveVChatCampaignSnapShotItemViewM206508c.setTag(ldc0.f131479L0, Integer.valueOf(i));
        liveVChatCampaignSnapShotItemViewM206508c.m70530u(pd4Var.getCom.immomo.momomediaext.sei.BaseSei.INFO java.lang.String());
        viewGroup.addView(liveVChatCampaignSnapShotItemViewM206508c);
        return liveVChatCampaignSnapShotItemViewM206508c;
    }

    /* JADX INFO: renamed from: q */
    public void m215994q() {
        this.f199990f.m206506a();
    }

    /* JADX INFO: renamed from: r */
    public void m215995r() {
        this.f199990f.m206509d();
    }

    /* JADX INFO: renamed from: s */
    public void m215996s(List<pd4> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f199991g.clear();
        this.f199991g.addAll(list);
        notifyDataSetChanged();
    }
}
