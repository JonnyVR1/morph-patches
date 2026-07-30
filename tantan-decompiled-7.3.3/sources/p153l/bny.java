package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.voice.membermanager.settlein.MemberSettleInPageView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class bny {
    /* JADX INFO: renamed from: a */
    public static void m105646a(MemberSettleInPageView memberSettleInPageView, View view) {
        memberSettleInPageView._rootView = (MemberSettleInPageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        memberSettleInPageView._recyclerView = (VRecyclerView) viewGroup.getChildAt(0);
        memberSettleInPageView._empty = (VLinear) viewGroup.getChildAt(1);
        memberSettleInPageView._empty_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        memberSettleInPageView._empty_text = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
