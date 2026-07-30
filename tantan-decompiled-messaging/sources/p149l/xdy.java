package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.voice.membermanager.requestsettlein.MemberRequestSettleInView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class xdy {
    /* JADX INFO: renamed from: a */
    public static void m208480a(MemberRequestSettleInView memberRequestSettleInView, View view) {
        memberRequestSettleInView._rootView = (MemberRequestSettleInView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        memberRequestSettleInView._recyclerView = (VRecyclerView) viewGroup.getChildAt(0);
        memberRequestSettleInView._empty = (VLinear) viewGroup.getChildAt(1);
        memberRequestSettleInView._empty_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        memberRequestSettleInView._empty_text = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
