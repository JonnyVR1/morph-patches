package p149l;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.campaign.view.LiveVChatCampaignItemView;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.campaign.view.LiveVChatCampaignSnapShotItemView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class vfu {

    /* JADX INFO: renamed from: a */
    public final SparseArray<LiveVChatCampaignItemView> f181300a = new SparseArray<>();

    /* JADX INFO: renamed from: b */
    public final SparseArray<VDraweeView> f181301b = new SparseArray<>();

    /* JADX INFO: renamed from: a */
    public void m198289a() {
        int size = this.f181300a.size();
        int i = 0;
        while (true) {
            SparseArray<LiveVChatCampaignItemView> sparseArray = this.f181300a;
            if (i >= size) {
                sparseArray.clear();
                this.f181301b.clear();
                return;
            } else {
                sparseArray.valueAt(i).m69331h();
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public LiveVChatCampaignItemView m198290b(int i, ViewGroup viewGroup) {
        LiveVChatCampaignItemView liveVChatCampaignItemView = this.f181300a.get(i);
        if (liveVChatCampaignItemView == null) {
            liveVChatCampaignItemView = (LiveVChatCampaignItemView) LayoutInflater.from(viewGroup.getContext()).inflate(s6c0.f162806w1, viewGroup, false);
            this.f181300a.put(i, liveVChatCampaignItemView);
        }
        ViewParent parent = liveVChatCampaignItemView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(liveVChatCampaignItemView);
        }
        return liveVChatCampaignItemView;
    }

    /* JADX INFO: renamed from: c */
    public LiveVChatCampaignSnapShotItemView m198291c(ViewGroup viewGroup) {
        return (LiveVChatCampaignSnapShotItemView) LayoutInflater.from(viewGroup.getContext()).inflate(s6c0.f162803v1, viewGroup, false);
    }

    /* JADX INFO: renamed from: d */
    public void m198292d() {
        int size = this.f181300a.size();
        for (int i = 0; i < size; i++) {
            this.f181300a.valueAt(i).m69343t();
        }
    }
}
