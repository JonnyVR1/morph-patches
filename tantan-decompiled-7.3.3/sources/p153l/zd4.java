package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p051p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignSnapShotItemView;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class zd4 extends lb2 {

    /* JADX INFO: renamed from: e */
    public final ue4 f203853e;

    /* JADX INFO: renamed from: f */
    public final wd4 f203854f = new wd4();

    /* JADX INFO: renamed from: g */
    public final List<od4> f203855g = new ArrayList();

    public zd4(ue4 ue4Var) {
        this.f203853e = ue4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m219273s(BLiveCampaign bLiveCampaign, View view) {
        this.f203853e.m195622F4(bLiveCampaign);
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f203855g.size();
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
        od4 od4Var = this.f203855g.get(i);
        if (od4Var instanceof ef4) {
            CampaignItemView campaignItemViewM205840b = this.f203854f.m205840b(i, viewGroup);
            campaignItemViewM205840b.m74614u(od4Var.getCom.immomo.momomediaext.sei.BaseSei.INFO java.lang.String(), this.f203853e);
            campaignItemViewM205840b.setTag(mdc0.f136321v3, Integer.valueOf(i));
            viewGroup.addView(campaignItemViewM205840b);
            return campaignItemViewM205840b;
        }
        boolean z = od4Var instanceof nd4;
        wd4 wd4Var = this.f203854f;
        if (!z) {
            CampaignSnapShotItemView campaignSnapShotItemViewM205841c = wd4Var.m205841c(viewGroup);
            campaignSnapShotItemViewM205841c.setTag(mdc0.f136321v3, Integer.valueOf(i));
            campaignSnapShotItemViewM205841c.m74617u(od4Var.getCom.immomo.momomediaext.sei.BaseSei.INFO java.lang.String(), this.f203853e);
            viewGroup.addView(campaignSnapShotItemViewM205841c);
            return campaignSnapShotItemViewM205841c;
        }
        VDraweeView vDraweeViewM205842d = wd4Var.m205842d(i, viewGroup.getContext());
        final BLiveCampaign bLiveCampaign = od4Var.getCom.immomo.momomediaext.sei.BaseSei.INFO java.lang.String();
        izs.m142871v("context_single_room", vDraweeViewM205842d, bLiveCampaign.entranceImage, qa00.m175859d(96.0f), qa00.m175859d(126.0f), false, false, true, null);
        vDraweeViewM205842d.setTag(mdc0.f136321v3, Integer.valueOf(i));
        bnl0.m105509E0(vDraweeViewM205842d, new View.OnClickListener() { // from class: l.yd4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198569a.m219273s(bLiveCampaign, view);
            }
        });
        viewGroup.addView(vDraweeViewM205842d);
        return vDraweeViewM205842d;
    }

    /* JADX INFO: renamed from: r */
    public void m219274r() {
        this.f203854f.m205839a();
    }

    /* JADX INFO: renamed from: t */
    public void m219275t() {
        this.f203854f.m205843e();
    }

    /* JADX INFO: renamed from: u */
    public void m219276u(List<od4> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f203855g.clear();
        this.f203855g.addAll(list);
        notifyDataSetChanged();
    }
}
