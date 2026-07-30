package com.p046p1.mobile.putong.live.livingroom.view.banner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.live.base.data.BLiveBannerTab;
import java.util.List;
import p149l.hxs;
import p149l.t100;
import p149l.t6c0;
import p149l.uep0;
import p149l.x3w;
import p149l.xdl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.banner.a */
/* JADX INFO: loaded from: classes5.dex */
public class C12945a extends x3w<BLiveBannerTab, LiveBannerItemView> {

    /* JADX INFO: renamed from: a */
    public a f52109a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.banner.a$a */
    @FunctionalInterface
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo76682a(BLiveBannerTab bLiveBannerTab);
    }

    public C12945a(List<BLiveBannerTab> list, boolean z) {
        super(list, z);
    }

    @Override // p149l.x3w
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo67408j(LiveBannerItemView liveBannerItemView, int i, int i2) {
        Media media;
        final BLiveBannerTab bLiveBannerTab = (BLiveBannerTab) this.itemList.get(i);
        if (bLiveBannerTab == null || (media = bLiveBannerTab.media) == null) {
            return;
        }
        hxs.m133406s("context_common", liveBannerItemView.f52104a, media.url);
        xdl0.m208329E0(liveBannerItemView, new View.OnClickListener() { // from class: l.uur
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178414a.m76680u(bLiveBannerTab, view);
            }
        });
    }

    @Override // p149l.x3w
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public LiveBannerItemView mo67409p(int i, ViewGroup viewGroup, int i2, int i3) {
        LiveBannerItemView liveBannerItemView = (LiveBannerItemView) LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168427m, viewGroup, false);
        uep0.m193326m(liveBannerItemView, t100.f167261j);
        return liveBannerItemView;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m76680u(BLiveBannerTab bLiveBannerTab, View view) {
        a aVar = this.f52109a;
        if (aVar != null) {
            aVar.mo76682a(bLiveBannerTab);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m76681v(@Nullable a aVar) {
        this.f52109a = aVar;
    }
}
