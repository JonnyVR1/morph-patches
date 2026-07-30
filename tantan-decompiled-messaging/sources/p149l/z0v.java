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
public class z0v<P extends zi2> extends BaseDialogHolder<P, List<bgm0>> {

    /* JADX INFO: renamed from: e */
    public VLinear f201018e;

    /* JADX INFO: renamed from: f */
    public VImage f201019f;

    /* JADX INFO: renamed from: g */
    public VText f201020g;

    /* JADX INFO: renamed from: h */
    public VImage f201021h;

    /* JADX INFO: renamed from: i */
    public VoiceAuctionTabView f201022i;

    /* JADX INFO: renamed from: j */
    public VPager f201023j;

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168604z7, viewGroup, false);
        m216760u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m216760u(ViewGroup viewGroup) {
        this.f201018e = (VLinear) viewGroup;
        VImage vImage = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f201019f = vImage;
        String str = vImage == null ? "_back" : null;
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f201020g = vText;
        if (vText == null) {
            str = "_title";
        }
        VImage vImage2 = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        this.f201021h = vImage2;
        if (vImage2 == null) {
            str = "_info";
        }
        VoiceAuctionTabView voiceAuctionTabView = (VoiceAuctionTabView) viewGroup.getChildAt(2);
        this.f201022i = voiceAuctionTabView;
        if (voiceAuctionTabView == null) {
            str = "_tabView";
        }
        VPager vPager = (VPager) viewGroup.getChildAt(3);
        this.f201023j = vPager;
        if (vPager == null) {
            str = "_viewPager";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }
}
