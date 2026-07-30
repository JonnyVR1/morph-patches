package com.p051p1.mobile.putong.live.livingroom.view.banner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.live.base.data.BLiveBannerTab;
import java.util.List;
import p153l.bnl0;
import p153l.izs;
import p153l.qa00;
import p153l.v5w;
import p153l.yec0;
import p153l.ynp0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.banner.a */
/* JADX INFO: loaded from: classes5.dex */
public class C13108a extends v5w<BLiveBannerTab, LiveBannerItemView> {

    /* JADX INFO: renamed from: a */
    public a f52957a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.banner.a$a */
    @FunctionalInterface
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo77865a(BLiveBannerTab bLiveBannerTab);
    }

    public C13108a(List<BLiveBannerTab> list, boolean z) {
        super(list, z);
    }

    @Override // p153l.v5w
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo68591j(LiveBannerItemView liveBannerItemView, int i, int i2) {
        Media media;
        final BLiveBannerTab bLiveBannerTab = (BLiveBannerTab) this.itemList.get(i);
        if (bLiveBannerTab == null || (media = bLiveBannerTab.media) == null) {
            return;
        }
        izs.m142868s("context_common", liveBannerItemView.f52952a, media.url);
        bnl0.m105509E0(liveBannerItemView, new View.OnClickListener() { // from class: l.vwr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186162a.m77863u(bLiveBannerTab, view);
            }
        });
    }

    @Override // p153l.v5w
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public LiveBannerItemView mo68592p(int i, ViewGroup viewGroup, int i2, int i3) {
        LiveBannerItemView liveBannerItemView = (LiveBannerItemView) LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f199159m, viewGroup, false);
        ynp0.m216936m(liveBannerItemView, qa00.f156323j);
        return liveBannerItemView;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m77863u(BLiveBannerTab bLiveBannerTab, View view) {
        a aVar = this.f52957a;
        if (aVar != null) {
            aVar.mo77865a(bLiveBannerTab);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m77864v(@Nullable a aVar) {
        this.f52957a = aVar;
    }
}
