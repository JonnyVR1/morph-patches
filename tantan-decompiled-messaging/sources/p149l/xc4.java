package p149l;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignSnapShotItemView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class xc4 {

    /* JADX INFO: renamed from: a */
    public final SparseArray<CampaignItemView> f192179a = new SparseArray<>();

    /* JADX INFO: renamed from: b */
    public final SparseArray<VDraweeView> f192180b = new SparseArray<>();

    /* JADX INFO: renamed from: a */
    public void m208065a() {
        int size = this.f192179a.size();
        int i = 0;
        while (true) {
            SparseArray<CampaignItemView> sparseArray = this.f192179a;
            if (i >= size) {
                sparseArray.clear();
                this.f192180b.clear();
                return;
            } else {
                sparseArray.valueAt(i).m73418h();
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public CampaignItemView m208066b(int i, ViewGroup viewGroup) {
        CampaignItemView campaignItemView = this.f192179a.get(i);
        if (campaignItemView == null) {
            campaignItemView = (CampaignItemView) LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168139P, viewGroup, false);
            this.f192179a.put(i, campaignItemView);
        }
        ViewParent parent = campaignItemView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(campaignItemView);
        }
        return campaignItemView;
    }

    /* JADX INFO: renamed from: c */
    public CampaignSnapShotItemView m208067c(ViewGroup viewGroup) {
        return (CampaignSnapShotItemView) LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168127O, viewGroup, false);
    }

    /* JADX INFO: renamed from: d */
    public VDraweeView m208068d(int i, Context context) {
        VDraweeView vDraweeView = this.f192180b.get(i);
        if (vDraweeView == null) {
            vDraweeView = new VDraweeView(context);
            vDraweeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            vDraweeView.getHierarchy().m112076w(ftd0.f99177a);
            vDraweeView.getHierarchy().m112053H(RoundingParams.m8249c(t100.f167259h));
            this.f192180b.put(i, vDraweeView);
        }
        ViewParent parent = vDraweeView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(vDraweeView);
        }
        return vDraweeView;
    }

    /* JADX INFO: renamed from: e */
    public void m208069e() {
        int size = this.f192179a.size();
        for (int i = 0; i < size; i++) {
            this.f192179a.valueAt(i).m73430t();
        }
    }
}
