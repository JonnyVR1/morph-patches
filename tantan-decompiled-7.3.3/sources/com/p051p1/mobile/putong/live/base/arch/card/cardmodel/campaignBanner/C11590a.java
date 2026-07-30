package com.p051p1.mobile.putong.live.base.arch.card.cardmodel.campaignBanner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.bnl0;
import p153l.o3s;
import p153l.qa00;
import p153l.v5w;
import p153l.vec0;
import p153l.ynp0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.base.arch.card.cardmodel.campaignBanner.a */
/* JADX INFO: loaded from: classes13.dex */
public class C11590a extends v5w<o3s.C19019a, LiveCampaignBannerItemView> {
    private a listener;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.arch.card.cardmodel.campaignBanner.a$a */
    @FunctionalInterface
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo68619a(o3s.C19019a c19019a);
    }

    public C11590a(@NonNull o3s o3sVar) {
        super(o3sVar.m165884a(), true);
    }

    @Override // p153l.v5w
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo68591j(LiveCampaignBannerItemView liveCampaignBannerItemView, int i, int i2) {
        final o3s.C19019a c19019a = (o3s.C19019a) this.itemList.get(i);
        liveCampaignBannerItemView.m68613h0(c19019a);
        bnl0.m105509E0(liveCampaignBannerItemView, new View.OnClickListener() { // from class: l.b4s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74967a.m68617u(c19019a, view);
            }
        });
    }

    @Override // p153l.v5w
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public LiveCampaignBannerItemView mo68592p(int i, ViewGroup viewGroup, int i2, int i3) {
        LiveCampaignBannerItemView liveCampaignBannerItemView = (LiveCampaignBannerItemView) LayoutInflater.from(viewGroup.getContext()).inflate(vec0.f183739g, viewGroup, false);
        ynp0.m216936m(liveCampaignBannerItemView, qa00.f156323j);
        return liveCampaignBannerItemView;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m68617u(o3s.C19019a c19019a, View view) {
        a aVar = this.listener;
        if (aVar != null) {
            aVar.mo68619a(c19019a);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m68618v(@Nullable a aVar) {
        this.listener = aVar;
    }
}
