package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.C11246b;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.FeedEditText;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.state.FeedMomentPostStatusView;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.view.FeedPostMediaRecyclerView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedSharelinkView;
import com.p046p1.mobile.putong.feed.newui.view.FeedAudioPlayerView;
import org.apmem.tools.layouts.FlowLayout;
import p147v.VCheckBox;
import p147v.VImage;
import p147v.VLinear;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class f640 {
    /* JADX INFO: renamed from: a */
    public static void m119580a(C11246b c11246b, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c11246b.f40708a = (VLinear) viewGroup.getChildAt(0);
        c11246b.f40709b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        c11246b.f40710c = (FeedMomentPostStatusView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        c11246b.f40711d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        c11246b.f40712e = (FrameLayout) viewGroup.getChildAt(1);
        c11246b.f40713f = (VScroll) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        c11246b.f40714g = (FeedEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        c11246b.f40715h = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        c11246b.f40716i = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        c11246b.f40717j = (FeedPostMediaRecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        c11246b.f40718k = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        c11246b.f40719l = (FeedAudioPlayerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        c11246b.f40720m = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        c11246b.f40721n = (FeedSharelinkView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(3);
        c11246b.f40722o = (FlowLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4);
        c11246b.f40723p = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(5);
        c11246b.f40724q = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(5)).getChildAt(0);
        c11246b.f40725r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(5)).getChildAt(1);
        c11246b.f40726s = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(5)).getChildAt(2);
        c11246b.f40727t = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(6);
        c11246b.f40728u = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(6)).getChildAt(0);
        c11246b.f40729v = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(6)).getChildAt(1);
        c11246b.f40730w = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(6)).getChildAt(2);
        c11246b.f40731x = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(7);
        c11246b.f40732y = (VCheckBox) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(7)).getChildAt(0);
        c11246b.f40733z = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        c11246b.f40685A = (FeedPostBottomView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        c11246b.f40686B = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        c11246b.f40687C = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m119581b(C11246b c11246b, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142028F1, viewGroup, false);
        m119580a(c11246b, viewInflate);
        return viewInflate;
    }
}
