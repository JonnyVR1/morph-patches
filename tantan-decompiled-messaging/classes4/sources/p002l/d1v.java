package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p1.mobile.putong.live.livingroom.voice.call.auction.view.tab.VoiceAuctionTabView;
import java.util.List;
import l.gfm0;
import l.jfd0;
import p002l.zi2;
import v.VImage;
import v.VLinear;
import v.VPager;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class d1v<P extends zi2> extends BaseDialogHolder<P, List<gfm0>> {

    /* JADX INFO: renamed from: e */
    public VLinear f9032e;

    /* JADX INFO: renamed from: f */
    public VLinear f9033f;

    /* JADX INFO: renamed from: g */
    public VImage f9034g;

    /* JADX INFO: renamed from: h */
    public VText f9035h;

    /* JADX INFO: renamed from: i */
    public VImage f9036i;

    /* JADX INFO: renamed from: j */
    public VoiceAuctionTabView f9037j;

    /* JADX INFO: renamed from: k */
    public VPager f9038k;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19463A7, viewGroup, false);
        m11597u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m11597u(ViewGroup viewGroup) {
        this.f9032e = (VLinear) viewGroup;
        VLinear childAt = viewGroup.getChildAt(0);
        this.f9033f = childAt;
        String str = childAt == null ? "_title_bar" : null;
        VImage childAt2 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f9034g = childAt2;
        if (childAt2 == null) {
            str = "_title_bar_back";
        }
        VText childAt3 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f9035h = childAt3;
        if (childAt3 == null) {
            str = "_title_bar_title";
        }
        VImage childAt4 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        this.f9036i = childAt4;
        if (childAt4 == null) {
            str = "_title_bar_info";
        }
        VoiceAuctionTabView childAt5 = viewGroup.getChildAt(1);
        this.f9037j = childAt5;
        if (childAt5 == null) {
            str = "_tabView";
        }
        VPager childAt6 = viewGroup.getChildAt(2);
        this.f9038k = childAt6;
        if (childAt6 == null) {
            str = "_viewPager";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }
}
