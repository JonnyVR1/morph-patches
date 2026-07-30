package p153l;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignSnapShotItemView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class wd4 {

    /* JADX INFO: renamed from: a */
    public final SparseArray<CampaignItemView> f188526a = new SparseArray<>();

    /* JADX INFO: renamed from: b */
    public final SparseArray<VDraweeView> f188527b = new SparseArray<>();

    /* JADX INFO: renamed from: a */
    public void m205839a() {
        int size = this.f188526a.size();
        int i = 0;
        while (true) {
            SparseArray<CampaignItemView> sparseArray = this.f188526a;
            if (i >= size) {
                sparseArray.clear();
                this.f188527b.clear();
                return;
            } else {
                sparseArray.valueAt(i).m74601h();
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public CampaignItemView m205840b(int i, ViewGroup viewGroup) {
        CampaignItemView campaignItemView = this.f188526a.get(i);
        if (campaignItemView == null) {
            campaignItemView = (CampaignItemView) LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f198871P, viewGroup, false);
            this.f188526a.put(i, campaignItemView);
        }
        ViewParent parent = campaignItemView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(campaignItemView);
        }
        return campaignItemView;
    }

    /* JADX INFO: renamed from: c */
    public CampaignSnapShotItemView m205841c(ViewGroup viewGroup) {
        return (CampaignSnapShotItemView) LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f198859O, viewGroup, false);
    }

    /* JADX INFO: renamed from: d */
    public VDraweeView m205842d(int i, Context context) {
        VDraweeView vDraweeView = this.f188527b.get(i);
        if (vDraweeView == null) {
            vDraweeView = new VDraweeView(context);
            vDraweeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            vDraweeView.getHierarchy().m207062w(h1e0.f107444a);
            vDraweeView.getHierarchy().m207045H(RoundingParams.m8303c(qa00.f156321h));
            this.f188527b.put(i, vDraweeView);
        }
        ViewParent parent = vDraweeView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(vDraweeView);
        }
        return vDraweeView;
    }

    /* JADX INFO: renamed from: e */
    public void m205843e() {
        int size = this.f188526a.size();
        for (int i = 0; i < size; i++) {
            this.f188526a.valueAt(i).m74613t();
        }
    }
}
