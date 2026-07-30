package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.view.tab.VoiceAuctionTabView;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;
import p147v.VPager;
import p147v.VText;
import p149l.zi2;

/* JADX INFO: loaded from: classes4.dex */
public class d1v<P extends zi2> extends BaseDialogHolder<P, List<gfm0>> {

    /* JADX INFO: renamed from: e */
    public VLinear f83298e;

    /* JADX INFO: renamed from: f */
    public VLinear f83299f;

    /* JADX INFO: renamed from: g */
    public VImage f83300g;

    /* JADX INFO: renamed from: h */
    public VText f83301h;

    /* JADX INFO: renamed from: i */
    public VImage f83302i;

    /* JADX INFO: renamed from: j */
    public VoiceAuctionTabView f83303j;

    /* JADX INFO: renamed from: k */
    public VPager f83304k;

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f167967A7, viewGroup, false);
        m109683u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m109683u(ViewGroup viewGroup) {
        this.f83298e = (VLinear) viewGroup;
        VLinear vLinear = (VLinear) viewGroup.getChildAt(0);
        this.f83299f = vLinear;
        String str = vLinear == null ? "_title_bar" : null;
        VImage vImage = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f83300g = vImage;
        if (vImage == null) {
            str = "_title_bar_back";
        }
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f83301h = vText;
        if (vText == null) {
            str = "_title_bar_title";
        }
        VImage vImage2 = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        this.f83302i = vImage2;
        if (vImage2 == null) {
            str = "_title_bar_info";
        }
        VoiceAuctionTabView voiceAuctionTabView = (VoiceAuctionTabView) viewGroup.getChildAt(1);
        this.f83303j = voiceAuctionTabView;
        if (voiceAuctionTabView == null) {
            str = "_tabView";
        }
        VPager vPager = (VPager) viewGroup.getChildAt(2);
        this.f83304k = vPager;
        if (vPager == null) {
            str = "_viewPager";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }
}
