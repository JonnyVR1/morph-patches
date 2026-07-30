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
public class g1v<P extends zi2> extends BaseDialogHolder<P, List<bgm0>> {

    /* JADX INFO: renamed from: e */
    public VLinear f10724e;

    /* JADX INFO: renamed from: f */
    public VImage f10725f;

    /* JADX INFO: renamed from: g */
    public VText f10726g;

    /* JADX INFO: renamed from: h */
    public VoiceAuctionTabView f10727h;

    /* JADX INFO: renamed from: i */
    public VPager f10728i;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19523F7, viewGroup, false);
        m13535u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m13535u(ViewGroup viewGroup) {
        this.f10724e = (VLinear) viewGroup;
        VImage childAt = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f10725f = childAt;
        String str = childAt == null ? "_back" : null;
        VText childAt2 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f10726g = childAt2;
        if (childAt2 == null) {
            str = "_title";
        }
        VoiceAuctionTabView childAt3 = viewGroup.getChildAt(2);
        this.f10727h = childAt3;
        if (childAt3 == null) {
            str = "_tabView";
        }
        VPager childAt4 = viewGroup.getChildAt(3);
        this.f10728i = childAt4;
        if (childAt4 == null) {
            str = "_viewPager";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }
}
