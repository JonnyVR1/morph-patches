package p153l;

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
import com.p051p1.mobile.putong.feed.newui.photoalbum.QAMomentPostBar;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedChangeQATopicInputJoinView;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQATopicInputJoinView;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedVoteContainer;
import com.p051p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicContentWithPluginView;
import com.p051p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.p051p1.mobile.putong.newui.view.VExpandableTextContainer;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLine;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ntb0 {
    /* JADX INFO: renamed from: a */
    public static void m164725a(mtb0 mtb0Var, View view) {
        mtb0Var.f138565I = (FrameLayout) view;
        mtb0Var.f138567J = (CoordinatorLayout) view.findViewById(hdc0.f108818A1);
        ViewGroup viewGroup = (ViewGroup) view;
        mtb0Var.f138569K = (AppBarLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mtb0Var.f138571L = (CollapsingToolbarLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        mtb0Var.f138573M = (Toolbar) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        mtb0Var.f138575N = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        mtb0Var.f138577O = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        mtb0Var.f138579P = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        mtb0Var.f138581Q = (VRelative) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mtb0Var.f138583R = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        mtb0Var.f138585S = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        mtb0Var.f138587T = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        mtb0Var.f138589U = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        mtb0Var.f138590V = (VExpandableTextContainer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        mtb0Var.f138591W = (FeedVoteContainer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        mtb0Var.f138592X = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
        mtb0Var.f138593Y = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(0);
        mtb0Var.f138594Z = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        mtb0Var.f138595k0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        mtb0Var.f138596p0 = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(2);
        mtb0Var.f138561E0 = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(1);
        mtb0Var.f138562F0 = (FeedUserHeaderView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        mtb0Var.f138563G0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(1);
        mtb0Var.f138564H0 = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(2);
        mtb0Var.f138566I0 = (VLine) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4);
        mtb0Var.f138568J0 = (FeedTopicContentWithPluginView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        mtb0Var.f138570K0 = (VFrame) viewGroup.getChildAt(1);
        mtb0Var.f138572L0 = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        mtb0Var.f138574M0 = (FeedQATopicInputJoinView) viewGroup.getChildAt(2);
        mtb0Var.f138576N0 = (FeedChangeQATopicInputJoinView) viewGroup.getChildAt(3);
        mtb0Var.f138578O0 = (QAMomentPostBar) viewGroup.getChildAt(4);
        mtb0Var.f138580P0 = (RelativeLayout) viewGroup.getChildAt(5);
        mtb0Var.f138582Q0 = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        mtb0Var.f138584R0 = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0);
        mtb0Var.f138586S0 = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        mtb0Var.f138588T0 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m164726b(mtb0 mtb0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173588U2, viewGroup, false);
        m164725a(mtb0Var, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m164727c(mtb0 mtb0Var) {
        mtb0Var.f138565I = null;
        mtb0Var.f138567J = null;
        mtb0Var.f138569K = null;
        mtb0Var.f138571L = null;
        mtb0Var.f138573M = null;
        mtb0Var.f138575N = null;
        mtb0Var.f138577O = null;
        mtb0Var.f138579P = null;
        mtb0Var.f138581Q = null;
        mtb0Var.f138583R = null;
        mtb0Var.f138585S = null;
        mtb0Var.f138587T = null;
        mtb0Var.f138589U = null;
        mtb0Var.f138590V = null;
        mtb0Var.f138591W = null;
        mtb0Var.f138592X = null;
        mtb0Var.f138593Y = null;
        mtb0Var.f138594Z = null;
        mtb0Var.f138595k0 = null;
        mtb0Var.f138596p0 = null;
        mtb0Var.f138561E0 = null;
        mtb0Var.f138562F0 = null;
        mtb0Var.f138563G0 = null;
        mtb0Var.f138564H0 = null;
        mtb0Var.f138566I0 = null;
        mtb0Var.f138568J0 = null;
        mtb0Var.f138570K0 = null;
        mtb0Var.f138572L0 = null;
        mtb0Var.f138574M0 = null;
        mtb0Var.f138576N0 = null;
        mtb0Var.f138578O0 = null;
        mtb0Var.f138580P0 = null;
        mtb0Var.f138582Q0 = null;
        mtb0Var.f138584R0 = null;
        mtb0Var.f138586S0 = null;
        mtb0Var.f138588T0 = null;
    }
}
