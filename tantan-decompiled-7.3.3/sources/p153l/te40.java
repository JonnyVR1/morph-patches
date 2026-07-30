package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.C11409b;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.FeedEditText;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.state.FeedMomentPostStatusView;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.view.FeedPostMediaRecyclerView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedSharelinkView;
import com.p051p1.mobile.putong.feed.newui.view.FeedAudioPlayerView;
import org.apmem.tools.layouts.FlowLayout;
import p151v.VCheckBox;
import p151v.VImage;
import p151v.VLinear;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class te40 {
    /* JADX INFO: renamed from: a */
    public static void m190681a(C11409b c11409b, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c11409b.f41556a = (VLinear) viewGroup.getChildAt(0);
        c11409b.f41557b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        c11409b.f41558c = (FeedMomentPostStatusView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        c11409b.f41559d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        c11409b.f41560e = (FrameLayout) viewGroup.getChildAt(1);
        c11409b.f41561f = (VScroll) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        c11409b.f41562g = (FeedEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        c11409b.f41563h = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        c11409b.f41564i = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        c11409b.f41565j = (FeedPostMediaRecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        c11409b.f41566k = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        c11409b.f41567l = (FeedAudioPlayerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        c11409b.f41568m = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        c11409b.f41569n = (FeedSharelinkView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(3);
        c11409b.f41570o = (FlowLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4);
        c11409b.f41571p = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(5);
        c11409b.f41572q = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(5)).getChildAt(0);
        c11409b.f41573r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(5)).getChildAt(1);
        c11409b.f41574s = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(5)).getChildAt(2);
        c11409b.f41575t = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(6);
        c11409b.f41576u = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(6)).getChildAt(0);
        c11409b.f41577v = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(6)).getChildAt(1);
        c11409b.f41578w = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(6)).getChildAt(2);
        c11409b.f41579x = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(7);
        c11409b.f41580y = (VCheckBox) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(7)).getChildAt(0);
        c11409b.f41581z = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        c11409b.f41533A = (FeedPostBottomView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        c11409b.f41534B = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        c11409b.f41535C = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m190682b(C11409b c11409b, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173497F1, viewGroup, false);
        m190681a(c11409b, viewInflate);
        return viewInflate;
    }
}
