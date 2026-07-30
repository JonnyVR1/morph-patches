package com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.suggestedTab;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareBannerItemView;
import com.p046p1.mobile.putong.live.external.square.api.LiveBannerTabBean;
import com.p046p1.mobile.putong.live.external.square.api.LiveBannerTabImage;
import com.p046p1.mobile.putong.live.external.square.api.LiveSquareBannerBean;
import java.util.List;
import p149l.hxs;
import p149l.s6c0;
import p149l.t100;
import p149l.uep0;
import p149l.x3w;
import p149l.xdl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.livesquare.fragments.suggestedTab.a */
/* JADX INFO: loaded from: classes13.dex */
public class C12546a extends x3w<LiveBannerTabBean, IntlLiveSquareBannerItemView> {

    /* JADX INFO: renamed from: a */
    public a f45686a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.livesquare.fragments.suggestedTab.a$a */
    @FunctionalInterface
    public interface a {
        /* JADX INFO: renamed from: t3 */
        void mo70071t3(LiveBannerTabBean liveBannerTabBean);
    }

    public C12546a(@NonNull LiveSquareBannerBean liveSquareBannerBean) {
        super(liveSquareBannerBean.tabs, true);
    }

    @Override // p149l.x3w
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo67408j(IntlLiveSquareBannerItemView intlLiveSquareBannerItemView, int i, int i2) {
        final LiveBannerTabBean liveBannerTabBean;
        LiveBannerTabImage liveBannerTabImage;
        List<D> list = this.itemList;
        if (list == 0 || list.size() <= i || (liveBannerTabBean = (LiveBannerTabBean) this.itemList.get(i)) == null || (liveBannerTabImage = liveBannerTabBean.bannerMedia) == null) {
            return;
        }
        hxs.m133406s("context_square", intlLiveSquareBannerItemView.f45819a, liveBannerTabImage.bannerUrl);
        if (!liveBannerTabBean.isLiveGroupType() || TextUtils.isEmpty(liveBannerTabBean.title)) {
            xdl0.m208345M0(intlLiveSquareBannerItemView.f45820b, false);
        } else {
            xdl0.m208345M0(intlLiveSquareBannerItemView.f45820b, true);
            intlLiveSquareBannerItemView.f45820b.setText(m70176t(intlLiveSquareBannerItemView.getContext(), liveBannerTabBean.title));
        }
        xdl0.m208329E0(intlLiveSquareBannerItemView, new View.OnClickListener() { // from class: l.wzn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188749a.m70178v(liveBannerTabBean, view);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final SpannableStringBuilder m70176t(Context context, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "img");
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }

    @Override // p149l.x3w
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public IntlLiveSquareBannerItemView mo67409p(int i, ViewGroup viewGroup, int i2, int i3) {
        IntlLiveSquareBannerItemView intlLiveSquareBannerItemView = (IntlLiveSquareBannerItemView) LayoutInflater.from(viewGroup.getContext()).inflate(s6c0.f162732b0, viewGroup, false);
        uep0.m193326m(intlLiveSquareBannerItemView, t100.f167261j);
        return intlLiveSquareBannerItemView;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m70178v(LiveBannerTabBean liveBannerTabBean, View view) {
        a aVar = this.f45686a;
        if (aVar != null) {
            aVar.mo70071t3(liveBannerTabBean);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m70179w(@Nullable a aVar) {
        this.f45686a = aVar;
    }
}
