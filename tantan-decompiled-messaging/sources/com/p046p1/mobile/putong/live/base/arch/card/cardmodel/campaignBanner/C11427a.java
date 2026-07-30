package com.p046p1.mobile.putong.live.base.arch.card.cardmodel.campaignBanner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.n1s;
import p149l.q6c0;
import p149l.t100;
import p149l.uep0;
import p149l.x3w;
import p149l.xdl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.base.arch.card.cardmodel.campaignBanner.a */
/* JADX INFO: loaded from: classes13.dex */
public class C11427a extends x3w<n1s.C18603a, LiveCampaignBannerItemView> {
    private a listener;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.arch.card.cardmodel.campaignBanner.a$a */
    @FunctionalInterface
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo67436a(n1s.C18603a c18603a);
    }

    public C11427a(@NonNull n1s n1sVar) {
        super(n1sVar.m157512a(), true);
    }

    @Override // p149l.x3w
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo67408j(LiveCampaignBannerItemView liveCampaignBannerItemView, int i, int i2) {
        final n1s.C18603a c18603a = (n1s.C18603a) this.itemList.get(i);
        liveCampaignBannerItemView.m67430h0(c18603a);
        xdl0.m208329E0(liveCampaignBannerItemView, new View.OnClickListener() { // from class: l.a2s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67287a.m67434u(c18603a, view);
            }
        });
    }

    @Override // p149l.x3w
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public LiveCampaignBannerItemView mo67409p(int i, ViewGroup viewGroup, int i2, int i3) {
        LiveCampaignBannerItemView liveCampaignBannerItemView = (LiveCampaignBannerItemView) LayoutInflater.from(viewGroup.getContext()).inflate(q6c0.f152882g, viewGroup, false);
        uep0.m193326m(liveCampaignBannerItemView, t100.f167261j);
        return liveCampaignBannerItemView;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m67434u(n1s.C18603a c18603a, View view) {
        a aVar = this.listener;
        if (aVar != null) {
            aVar.mo67436a(c18603a);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m67435v(@Nullable a aVar) {
        this.listener = aVar;
    }
}
