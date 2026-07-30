package p002l;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignItemView;
import com.p000p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignSnapShotItemView;
import l.ftd0;
import l.t100;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xc4 {

    /* JADX INFO: renamed from: a */
    public final SparseArray<CampaignItemView> f22213a = new SparseArray<>();

    /* JADX INFO: renamed from: b */
    public final SparseArray<VDraweeView> f22214b = new SparseArray<>();

    /* JADX INFO: renamed from: a */
    public void m25827a() {
        int size = this.f22213a.size();
        int i = 0;
        while (true) {
            SparseArray<CampaignItemView> sparseArray = this.f22213a;
            if (i >= size) {
                sparseArray.clear();
                this.f22214b.clear();
                return;
            } else {
                sparseArray.valueAt(i).m6958h();
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public CampaignItemView m25828b(int i, ViewGroup viewGroup) {
        CampaignItemView campaignItemView = this.f22213a.get(i);
        if (campaignItemView == null) {
            campaignItemView = (CampaignItemView) LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f19635P, viewGroup, false);
            this.f22213a.put(i, campaignItemView);
        }
        ViewParent parent = campaignItemView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(campaignItemView);
        }
        return campaignItemView;
    }

    /* JADX INFO: renamed from: c */
    public CampaignSnapShotItemView m25829c(ViewGroup viewGroup) {
        return (CampaignSnapShotItemView) LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f19623O, viewGroup, false);
    }

    /* JADX INFO: renamed from: d */
    public VDraweeView m25830d(int i, Context context) {
        VDraweeView vDraweeView = this.f22214b.get(i);
        if (vDraweeView == null) {
            vDraweeView = new VDraweeView(context);
            vDraweeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            vDraweeView.getHierarchy().w(ftd0.a);
            vDraweeView.getHierarchy().H(RoundingParams.c(t100.h));
            this.f22214b.put(i, vDraweeView);
        }
        ViewParent parent = vDraweeView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(vDraweeView);
        }
        return vDraweeView;
    }

    /* JADX INFO: renamed from: e */
    public void m25831e() {
        int size = this.f22213a.size();
        for (int i = 0; i < size; i++) {
            this.f22213a.valueAt(i).m6970t();
        }
    }
}
