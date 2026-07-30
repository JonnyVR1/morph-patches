package com.p051p1.mobile.putong.live.base.arch.card.cardmodel.banner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.bnl0;
import p153l.izs;
import p153l.qa00;
import p153l.v5w;
import p153l.vec0;
import p153l.xwr;
import p153l.ynp0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.base.arch.card.cardmodel.banner.a */
/* JADX INFO: loaded from: classes13.dex */
public class C11589a extends v5w<xwr.C21468a, LiveSquareBannerItemView> {
    private a listener;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.arch.card.cardmodel.banner.a$a */
    @FunctionalInterface
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo68597a(xwr.C21468a c21468a);
    }

    public C11589a(@NonNull xwr xwrVar) {
        super(xwrVar.m213423b(), true);
    }

    @Override // p153l.v5w
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo68591j(LiveSquareBannerItemView liveSquareBannerItemView, int i, int i2) {
        final xwr.C21468a c21468a = (xwr.C21468a) this.itemList.get(i);
        izs.m142868s("context_square", liveSquareBannerItemView._drawee_view, c21468a.m213428b());
        bnl0.m105525M0(liveSquareBannerItemView._text, false);
        bnl0.m105509E0(liveSquareBannerItemView, new View.OnClickListener() { // from class: l.z3s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202855a.m68595u(c21468a, view);
            }
        });
    }

    @Override // p153l.v5w
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public LiveSquareBannerItemView mo68592p(int i, ViewGroup viewGroup, int i2, int i3) {
        LiveSquareBannerItemView liveSquareBannerItemView = (LiveSquareBannerItemView) LayoutInflater.from(viewGroup.getContext()).inflate(vec0.f183737e, viewGroup, false);
        ynp0.m216936m(liveSquareBannerItemView, qa00.f156323j);
        bnl0.m105524M(liveSquareBannerItemView._black_cover, true);
        return liveSquareBannerItemView;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m68595u(xwr.C21468a c21468a, View view) {
        a aVar = this.listener;
        if (aVar != null) {
            aVar.mo68597a(c21468a);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m68596v(@Nullable a aVar) {
        this.listener = aVar;
    }
}
