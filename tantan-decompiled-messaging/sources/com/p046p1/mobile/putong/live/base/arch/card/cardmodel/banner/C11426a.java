package com.p046p1.mobile.putong.live.base.arch.card.cardmodel.banner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.hxs;
import p149l.q6c0;
import p149l.t100;
import p149l.uep0;
import p149l.wur;
import p149l.x3w;
import p149l.xdl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.base.arch.card.cardmodel.banner.a */
/* JADX INFO: loaded from: classes13.dex */
public class C11426a extends x3w<wur.C20965a, LiveSquareBannerItemView> {
    private a listener;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.arch.card.cardmodel.banner.a$a */
    @FunctionalInterface
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo67414a(wur.C20965a c20965a);
    }

    public C11426a(@NonNull wur wurVar) {
        super(wurVar.m205655b(), true);
    }

    @Override // p149l.x3w
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo67408j(LiveSquareBannerItemView liveSquareBannerItemView, int i, int i2) {
        final wur.C20965a c20965a = (wur.C20965a) this.itemList.get(i);
        hxs.m133406s("context_square", liveSquareBannerItemView._drawee_view, c20965a.m205660b());
        xdl0.m208345M0(liveSquareBannerItemView._text, false);
        xdl0.m208329E0(liveSquareBannerItemView, new View.OnClickListener() { // from class: l.y1s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195441a.m67412u(c20965a, view);
            }
        });
    }

    @Override // p149l.x3w
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public LiveSquareBannerItemView mo67409p(int i, ViewGroup viewGroup, int i2, int i3) {
        LiveSquareBannerItemView liveSquareBannerItemView = (LiveSquareBannerItemView) LayoutInflater.from(viewGroup.getContext()).inflate(q6c0.f152880e, viewGroup, false);
        uep0.m193326m(liveSquareBannerItemView, t100.f167261j);
        xdl0.m208344M(liveSquareBannerItemView._black_cover, true);
        return liveSquareBannerItemView;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m67412u(wur.C20965a c20965a, View view) {
        a aVar = this.listener;
        if (aVar != null) {
            aVar.mo67414a(c20965a);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m67413v(@Nullable a aVar) {
        this.listener = aVar;
    }
}
