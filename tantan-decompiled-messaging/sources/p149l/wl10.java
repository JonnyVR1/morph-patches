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
public class wl10 {
    /* JADX INFO: renamed from: a */
    public static void m203735a(vl10 vl10Var, View view) {
        vl10Var.f181879I = (FrameLayout) view;
        vl10Var.f181881J = (CoordinatorLayout) view.findViewById(b5c0.f73465A1);
        ViewGroup viewGroup = (ViewGroup) view;
        vl10Var.f181883K = (AppBarLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        vl10Var.f181885L = (CollapsingToolbarLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        vl10Var.f181887M = (Toolbar) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        vl10Var.f181889N = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        vl10Var.f181891O = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        vl10Var.f181893P = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        vl10Var.f181895Q = (VRelative) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        vl10Var.f181897R = (VRelative) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        vl10Var.f181899S = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        vl10Var.f181901T = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        vl10Var.f181903U = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        vl10Var.f181905V = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        vl10Var.f181906W = (VExpandableTextContainer) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        vl10Var.f181907X = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        vl10Var.f181908Y = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        vl10Var.f181909Z = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        vl10Var.f181910k0 = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        vl10Var.f181911p0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        vl10Var.f181875E0 = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(2);
        vl10Var.f181876F0 = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        vl10Var.f181877G0 = (FeedUserHeaderView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        vl10Var.f181878H0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(1);
        vl10Var.f181880I0 = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(2);
        vl10Var.f181882J0 = (VRelative) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        vl10Var.f181884K0 = (VLine) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        vl10Var.f181886L0 = (FeedTopicContentWithPluginView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        vl10Var.f181888M0 = (VFrame) viewGroup.getChildAt(1);
        vl10Var.f181890N0 = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        vl10Var.f181892O0 = (RelativeLayout) viewGroup.getChildAt(2);
        vl10Var.f181894P0 = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        vl10Var.f181896Q0 = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        vl10Var.f181898R0 = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        vl10Var.f181900S0 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m203736b(vl10 vl10Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142066L3, viewGroup, false);
        m203735a(vl10Var, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m203737c(vl10 vl10Var) {
        vl10Var.f181879I = null;
        vl10Var.f181881J = null;
        vl10Var.f181883K = null;
        vl10Var.f181885L = null;
        vl10Var.f181887M = null;
        vl10Var.f181889N = null;
        vl10Var.f181891O = null;
        vl10Var.f181893P = null;
        vl10Var.f181895Q = null;
        vl10Var.f181897R = null;
        vl10Var.f181899S = null;
        vl10Var.f181901T = null;
        vl10Var.f181903U = null;
        vl10Var.f181905V = null;
        vl10Var.f181906W = null;
        vl10Var.f181907X = null;
        vl10Var.f181908Y = null;
        vl10Var.f181909Z = null;
        vl10Var.f181910k0 = null;
        vl10Var.f181911p0 = null;
        vl10Var.f181875E0 = null;
        vl10Var.f181876F0 = null;
        vl10Var.f181877G0 = null;
        vl10Var.f181878H0 = null;
        vl10Var.f181880I0 = null;
        vl10Var.f181882J0 = null;
        vl10Var.f181884K0 = null;
        vl10Var.f181886L0 = null;
        vl10Var.f181888M0 = null;
        vl10Var.f181890N0 = null;
        vl10Var.f181892O0 = null;
        vl10Var.f181894P0 = null;
        vl10Var.f181896Q0 = null;
        vl10Var.f181898R0 = null;
        vl10Var.f181900S0 = null;
    }
}
