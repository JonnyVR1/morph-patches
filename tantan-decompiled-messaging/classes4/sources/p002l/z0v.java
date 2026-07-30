package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p1.mobile.putong.live.livingroom.voice.call.auction.view.tab.VoiceAuctionTabView;
import java.util.List;
import l.bgm0;
import l.jfd0;
import p002l.zi2;
import v.VImage;
import v.VLinear;
import v.VPager;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class z0v<P extends zi2> extends BaseDialogHolder<P, List<bgm0>> {

    /* JADX INFO: renamed from: e */
    public VLinear f23165e;

    /* JADX INFO: renamed from: f */
    public VImage f23166f;

    /* JADX INFO: renamed from: g */
    public VText f23167g;

    /* JADX INFO: renamed from: h */
    public VImage f23168h;

    /* JADX INFO: renamed from: i */
    public VoiceAuctionTabView f23169i;

    /* JADX INFO: renamed from: j */
    public VPager f23170j;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20100z7, viewGroup, false);
        m27040u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m27040u(ViewGroup viewGroup) {
        this.f23165e = (VLinear) viewGroup;
        VImage childAt = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f23166f = childAt;
        String str = childAt == null ? "_back" : null;
        VText childAt2 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f23167g = childAt2;
        if (childAt2 == null) {
            str = "_title";
        }
        VImage childAt3 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        this.f23168h = childAt3;
        if (childAt3 == null) {
            str = "_info";
        }
        VoiceAuctionTabView childAt4 = viewGroup.getChildAt(2);
        this.f23169i = childAt4;
        if (childAt4 == null) {
            str = "_tabView";
        }
        VPager childAt5 = viewGroup.getChildAt(3);
        this.f23170j = childAt5;
        if (childAt5 == null) {
            str = "_viewPager";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }
}
