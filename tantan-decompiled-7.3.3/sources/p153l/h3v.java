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
public class h3v<P extends hj2> extends BaseDialogHolder<P, List<fpm0>> {

    /* JADX INFO: renamed from: e */
    public VLinear f107692e;

    /* JADX INFO: renamed from: f */
    public VImage f107693f;

    /* JADX INFO: renamed from: g */
    public VText f107694g;

    /* JADX INFO: renamed from: h */
    public VoiceAuctionTabView f107695h;

    /* JADX INFO: renamed from: i */
    public VPager f107696i;

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198759F7, viewGroup, false);
        m133521u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m133521u(ViewGroup viewGroup) {
        this.f107692e = (VLinear) viewGroup;
        VImage vImage = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f107693f = vImage;
        String str = vImage == null ? "_back" : null;
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f107694g = vText;
        if (vText == null) {
            str = "_title";
        }
        VoiceAuctionTabView voiceAuctionTabView = (VoiceAuctionTabView) viewGroup.getChildAt(2);
        this.f107695h = voiceAuctionTabView;
        if (voiceAuctionTabView == null) {
            str = "_tabView";
        }
        VPager vPager = (VPager) viewGroup.getChildAt(3);
        this.f107696i = vPager;
        if (vPager == null) {
            str = "_viewPager";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }
}
