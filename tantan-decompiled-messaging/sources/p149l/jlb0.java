package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.QAMomentPostBar;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedChangeQATopicInputJoinView;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQATopicInputJoinView;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedVoteContainer;
import com.p046p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicContentWithPluginView;
import com.p046p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.p046p1.mobile.putong.newui.view.VExpandableTextContainer;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLine;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class jlb0 {
    /* JADX INFO: renamed from: a */
    public static void m142050a(ilb0 ilb0Var, View view) {
        ilb0Var.f113785I = (FrameLayout) view;
        ilb0Var.f113787J = (CoordinatorLayout) view.findViewById(b5c0.f73465A1);
        ViewGroup viewGroup = (ViewGroup) view;
        ilb0Var.f113789K = (AppBarLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ilb0Var.f113791L = (CollapsingToolbarLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        ilb0Var.f113793M = (Toolbar) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        ilb0Var.f113795N = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        ilb0Var.f113797O = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        ilb0Var.f113799P = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        ilb0Var.f113801Q = (VRelative) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        ilb0Var.f113803R = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        ilb0Var.f113805S = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        ilb0Var.f113807T = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        ilb0Var.f113809U = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        ilb0Var.f113810V = (VExpandableTextContainer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        ilb0Var.f113811W = (FeedVoteContainer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        ilb0Var.f113812X = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
        ilb0Var.f113813Y = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(0);
        ilb0Var.f113814Z = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        ilb0Var.f113815k0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        ilb0Var.f113816p0 = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(2);
        ilb0Var.f113781E0 = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(1);
        ilb0Var.f113782F0 = (FeedUserHeaderView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        ilb0Var.f113783G0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(1);
        ilb0Var.f113784H0 = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(2);
        ilb0Var.f113786I0 = (VLine) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4);
        ilb0Var.f113788J0 = (FeedTopicContentWithPluginView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        ilb0Var.f113790K0 = (VFrame) viewGroup.getChildAt(1);
        ilb0Var.f113792L0 = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ilb0Var.f113794M0 = (FeedQATopicInputJoinView) viewGroup.getChildAt(2);
        ilb0Var.f113796N0 = (FeedChangeQATopicInputJoinView) viewGroup.getChildAt(3);
        ilb0Var.f113798O0 = (QAMomentPostBar) viewGroup.getChildAt(4);
        ilb0Var.f113800P0 = (RelativeLayout) viewGroup.getChildAt(5);
        ilb0Var.f113802Q0 = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        ilb0Var.f113804R0 = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0);
        ilb0Var.f113806S0 = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        ilb0Var.f113808T0 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m142051b(ilb0 ilb0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142119U2, viewGroup, false);
        m142050a(ilb0Var, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m142052c(ilb0 ilb0Var) {
        ilb0Var.f113785I = null;
        ilb0Var.f113787J = null;
        ilb0Var.f113789K = null;
        ilb0Var.f113791L = null;
        ilb0Var.f113793M = null;
        ilb0Var.f113795N = null;
        ilb0Var.f113797O = null;
        ilb0Var.f113799P = null;
        ilb0Var.f113801Q = null;
        ilb0Var.f113803R = null;
        ilb0Var.f113805S = null;
        ilb0Var.f113807T = null;
        ilb0Var.f113809U = null;
        ilb0Var.f113810V = null;
        ilb0Var.f113811W = null;
        ilb0Var.f113812X = null;
        ilb0Var.f113813Y = null;
        ilb0Var.f113814Z = null;
        ilb0Var.f113815k0 = null;
        ilb0Var.f113816p0 = null;
        ilb0Var.f113781E0 = null;
        ilb0Var.f113782F0 = null;
        ilb0Var.f113783G0 = null;
        ilb0Var.f113784H0 = null;
        ilb0Var.f113786I0 = null;
        ilb0Var.f113788J0 = null;
        ilb0Var.f113790K0 = null;
        ilb0Var.f113792L0 = null;
        ilb0Var.f113794M0 = null;
        ilb0Var.f113796N0 = null;
        ilb0Var.f113798O0 = null;
        ilb0Var.f113800P0 = null;
        ilb0Var.f113802Q0 = null;
        ilb0Var.f113804R0 = null;
        ilb0Var.f113806S0 = null;
        ilb0Var.f113808T0 = null;
    }
}
