package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.voice.membermanager.online.MemberOnLinePageView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;
import p147v.smart_refresh.SmartRefreshLayout;

/* JADX INFO: loaded from: classes4.dex */
public class yby {
    /* JADX INFO: renamed from: a */
    public static void m213986a(MemberOnLinePageView memberOnLinePageView, View view) {
        memberOnLinePageView._rootView = (MemberOnLinePageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        memberOnLinePageView._share_root = (VLinear) viewGroup.getChildAt(0);
        memberOnLinePageView._share_root_share_go = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        memberOnLinePageView._refresh_layout = (SmartRefreshLayout) viewGroup.getChildAt(1);
        memberOnLinePageView._recyclerView = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        memberOnLinePageView._empty = (VLinear) viewGroup.getChildAt(2);
        memberOnLinePageView._empty_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        memberOnLinePageView._empty_text = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
