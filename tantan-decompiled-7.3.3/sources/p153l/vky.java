package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.voice.membermanager.online.MemberOnLinePageView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;
import p151v.smart_refresh.SmartRefreshLayout;

/* JADX INFO: loaded from: classes4.dex */
public class vky {
    /* JADX INFO: renamed from: a */
    public static void m201588a(MemberOnLinePageView memberOnLinePageView, View view) {
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
