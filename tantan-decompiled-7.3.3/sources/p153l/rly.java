package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.membermanager.requestmic.MemberRequestMicPageView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class rly {
    /* JADX INFO: renamed from: a */
    public static void m182035a(MemberRequestMicPageView memberRequestMicPageView, View view) {
        memberRequestMicPageView._rootView = (MemberRequestMicPageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        memberRequestMicPageView._free_call_container = (ConstraintLayout) viewGroup.getChildAt(0);
        memberRequestMicPageView._title = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        memberRequestMicPageView._desc = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        memberRequestMicPageView._switch_open = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        memberRequestMicPageView._point_bg = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        memberRequestMicPageView._round_point = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        memberRequestMicPageView._recyclerView = (VRecyclerView) viewGroup.getChildAt(1);
        memberRequestMicPageView._empty = (VLinear) viewGroup.getChildAt(2);
        memberRequestMicPageView._empty_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        memberRequestMicPageView._empty_text = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
