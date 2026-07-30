package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.voice.membermanager.requestsettlein.MemberRequestSettleInView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class umy {
    /* JADX INFO: renamed from: a */
    public static void m196814a(MemberRequestSettleInView memberRequestSettleInView, View view) {
        memberRequestSettleInView._rootView = (MemberRequestSettleInView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        memberRequestSettleInView._recyclerView = (VRecyclerView) viewGroup.getChildAt(0);
        memberRequestSettleInView._empty = (VLinear) viewGroup.getChildAt(1);
        memberRequestSettleInView._empty_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        memberRequestSettleInView._empty_text = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
