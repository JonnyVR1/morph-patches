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
public class g1v<P extends zi2> extends BaseDialogHolder<P, List<bgm0>> {

    /* JADX INFO: renamed from: e */
    public VLinear f100208e;

    /* JADX INFO: renamed from: f */
    public VImage f100209f;

    /* JADX INFO: renamed from: g */
    public VText f100210g;

    /* JADX INFO: renamed from: h */
    public VoiceAuctionTabView f100211h;

    /* JADX INFO: renamed from: i */
    public VPager f100212i;

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168027F7, viewGroup, false);
        m124088u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m124088u(ViewGroup viewGroup) {
        this.f100208e = (VLinear) viewGroup;
        VImage vImage = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f100209f = vImage;
        String str = vImage == null ? "_back" : null;
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f100210g = vText;
        if (vText == null) {
            str = "_title";
        }
        VoiceAuctionTabView voiceAuctionTabView = (VoiceAuctionTabView) viewGroup.getChildAt(2);
        this.f100211h = voiceAuctionTabView;
        if (voiceAuctionTabView == null) {
            str = "_tabView";
        }
        VPager vPager = (VPager) viewGroup.getChildAt(3);
        this.f100212i = vPager;
        if (vPager == null) {
            str = "_viewPager";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }
}
