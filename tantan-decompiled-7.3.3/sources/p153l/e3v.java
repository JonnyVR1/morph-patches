package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.view.tab.VoiceAuctionTabView;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPager;
import p151v.VText;
import p153l.hj2;

/* JADX INFO: loaded from: classes4.dex */
public class e3v<P extends hj2> extends BaseDialogHolder<P, List<kom0>> {

    /* JADX INFO: renamed from: e */
    public VLinear f92004e;

    /* JADX INFO: renamed from: f */
    public VLinear f92005f;

    /* JADX INFO: renamed from: g */
    public VImage f92006g;

    /* JADX INFO: renamed from: h */
    public VText f92007h;

    /* JADX INFO: renamed from: i */
    public VImage f92008i;

    /* JADX INFO: renamed from: j */
    public VoiceAuctionTabView f92009j;

    /* JADX INFO: renamed from: k */
    public VPager f92010k;

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198699A7, viewGroup, false);
        m119324u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m119324u(ViewGroup viewGroup) {
        this.f92004e = (VLinear) viewGroup;
        VLinear vLinear = (VLinear) viewGroup.getChildAt(0);
        this.f92005f = vLinear;
        String str = vLinear == null ? "_title_bar" : null;
        VImage vImage = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f92006g = vImage;
        if (vImage == null) {
            str = "_title_bar_back";
        }
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f92007h = vText;
        if (vText == null) {
            str = "_title_bar_title";
        }
        VImage vImage2 = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        this.f92008i = vImage2;
        if (vImage2 == null) {
            str = "_title_bar_info";
        }
        VoiceAuctionTabView voiceAuctionTabView = (VoiceAuctionTabView) viewGroup.getChildAt(1);
        this.f92009j = voiceAuctionTabView;
        if (voiceAuctionTabView == null) {
            str = "_tabView";
        }
        VPager vPager = (VPager) viewGroup.getChildAt(2);
        this.f92010k = vPager;
        if (vPager == null) {
            str = "_viewPager";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }
}
