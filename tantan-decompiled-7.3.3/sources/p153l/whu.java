package p153l;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.campaign.view.LiveVChatCampaignItemView;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.campaign.view.LiveVChatCampaignSnapShotItemView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class whu {

    /* JADX INFO: renamed from: a */
    public final SparseArray<LiveVChatCampaignItemView> f189313a = new SparseArray<>();

    /* JADX INFO: renamed from: b */
    public final SparseArray<VDraweeView> f189314b = new SparseArray<>();

    /* JADX INFO: renamed from: a */
    public void m206506a() {
        int size = this.f189313a.size();
        int i = 0;
        while (true) {
            SparseArray<LiveVChatCampaignItemView> sparseArray = this.f189313a;
            if (i >= size) {
                sparseArray.clear();
                this.f189314b.clear();
                return;
            } else {
                sparseArray.valueAt(i).m70514h();
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public LiveVChatCampaignItemView m206507b(int i, ViewGroup viewGroup) {
        LiveVChatCampaignItemView liveVChatCampaignItemView = this.f189313a.get(i);
        if (liveVChatCampaignItemView == null) {
            liveVChatCampaignItemView = (LiveVChatCampaignItemView) LayoutInflater.from(viewGroup.getContext()).inflate(xec0.f193920w1, viewGroup, false);
            this.f189313a.put(i, liveVChatCampaignItemView);
        }
        ViewParent parent = liveVChatCampaignItemView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(liveVChatCampaignItemView);
        }
        return liveVChatCampaignItemView;
    }

    /* JADX INFO: renamed from: c */
    public LiveVChatCampaignSnapShotItemView m206508c(ViewGroup viewGroup) {
        return (LiveVChatCampaignSnapShotItemView) LayoutInflater.from(viewGroup.getContext()).inflate(xec0.f193917v1, viewGroup, false);
    }

    /* JADX INFO: renamed from: d */
    public void m206509d() {
        int size = this.f189313a.size();
        for (int i = 0; i < size; i++) {
            this.f189313a.valueAt(i).m70526t();
        }
    }
}
