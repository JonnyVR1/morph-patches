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
public class a3v<P extends hj2> extends BaseDialogHolder<P, List<fpm0>> {

    /* JADX INFO: renamed from: e */
    public VLinear f68322e;

    /* JADX INFO: renamed from: f */
    public VImage f68323f;

    /* JADX INFO: renamed from: g */
    public VText f68324g;

    /* JADX INFO: renamed from: h */
    public VImage f68325h;

    /* JADX INFO: renamed from: i */
    public VoiceAuctionTabView f68326i;

    /* JADX INFO: renamed from: j */
    public VPager f68327j;

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199336z7, viewGroup, false);
        m95870u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m95870u(ViewGroup viewGroup) {
        this.f68322e = (VLinear) viewGroup;
        VImage vImage = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f68323f = vImage;
        String str = vImage == null ? "_back" : null;
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f68324g = vText;
        if (vText == null) {
            str = "_title";
        }
        VImage vImage2 = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        this.f68325h = vImage2;
        if (vImage2 == null) {
            str = "_info";
        }
        VoiceAuctionTabView voiceAuctionTabView = (VoiceAuctionTabView) viewGroup.getChildAt(2);
        this.f68326i = voiceAuctionTabView;
        if (voiceAuctionTabView == null) {
            str = "_tabView";
        }
        VPager vPager = (VPager) viewGroup.getChildAt(3);
        this.f68327j = vPager;
        if (vPager == null) {
            str = "_viewPager";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }
}
