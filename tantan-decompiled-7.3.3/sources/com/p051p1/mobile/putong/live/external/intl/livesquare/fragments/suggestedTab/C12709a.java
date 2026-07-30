package com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.suggestedTab;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareBannerItemView;
import com.p051p1.mobile.putong.live.external.square.api.LiveBannerTabBean;
import com.p051p1.mobile.putong.live.external.square.api.LiveBannerTabImage;
import com.p051p1.mobile.putong.live.external.square.api.LiveSquareBannerBean;
import java.util.List;
import p153l.bnl0;
import p153l.izs;
import p153l.qa00;
import p153l.v5w;
import p153l.xec0;
import p153l.ynp0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.livesquare.fragments.suggestedTab.a */
/* JADX INFO: loaded from: classes9.dex */
public class C12709a extends v5w<LiveBannerTabBean, IntlLiveSquareBannerItemView> {

    /* JADX INFO: renamed from: a */
    public a f46534a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.livesquare.fragments.suggestedTab.a$a */
    @FunctionalInterface
    public interface a {
        /* JADX INFO: renamed from: t3 */
        void mo71254t3(LiveBannerTabBean liveBannerTabBean);
    }

    public C12709a(@NonNull LiveSquareBannerBean liveSquareBannerBean) {
        super(liveSquareBannerBean.tabs, true);
    }

    @Override // p153l.v5w
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo68591j(IntlLiveSquareBannerItemView intlLiveSquareBannerItemView, int i, int i2) {
        final LiveBannerTabBean liveBannerTabBean;
        LiveBannerTabImage liveBannerTabImage;
        List<D> list = this.itemList;
        if (list == 0 || list.size() <= i || (liveBannerTabBean = (LiveBannerTabBean) this.itemList.get(i)) == null || (liveBannerTabImage = liveBannerTabBean.bannerMedia) == null) {
            return;
        }
        izs.m142868s("context_square", intlLiveSquareBannerItemView.f46667a, liveBannerTabImage.bannerUrl);
        if (!liveBannerTabBean.isLiveGroupType() || TextUtils.isEmpty(liveBannerTabBean.title)) {
            bnl0.m105525M0(intlLiveSquareBannerItemView.f46668b, false);
        } else {
            bnl0.m105525M0(intlLiveSquareBannerItemView.f46668b, true);
            intlLiveSquareBannerItemView.f46668b.setText(m71359t(intlLiveSquareBannerItemView.getContext(), liveBannerTabBean.title));
        }
        bnl0.m105509E0(intlLiveSquareBannerItemView, new View.OnClickListener() { // from class: l.w1o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186827a.m71361v(liveBannerTabBean, view);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final SpannableStringBuilder m71359t(Context context, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "img");
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }

    @Override // p153l.v5w
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public IntlLiveSquareBannerItemView mo68592p(int i, ViewGroup viewGroup, int i2, int i3) {
        IntlLiveSquareBannerItemView intlLiveSquareBannerItemView = (IntlLiveSquareBannerItemView) LayoutInflater.from(viewGroup.getContext()).inflate(xec0.f193846b0, viewGroup, false);
        ynp0.m216936m(intlLiveSquareBannerItemView, qa00.f156323j);
        return intlLiveSquareBannerItemView;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m71361v(LiveBannerTabBean liveBannerTabBean, View view) {
        a aVar = this.f46534a;
        if (aVar != null) {
            aVar.mo71254t3(liveBannerTabBean);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m71362w(@Nullable a aVar) {
        this.f46534a = aVar;
    }
}
