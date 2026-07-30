package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.voice.membermanager.settlein.MemberSettleInPageView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class eey {
    /* JADX INFO: renamed from: a */
    public static void m116015a(MemberSettleInPageView memberSettleInPageView, View view) {
        memberSettleInPageView._rootView = (MemberSettleInPageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        memberSettleInPageView._recyclerView = (VRecyclerView) viewGroup.getChildAt(0);
        memberSettleInPageView._empty = (VLinear) viewGroup.getChildAt(1);
        memberSettleInPageView._empty_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        memberSettleInPageView._empty_text = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
