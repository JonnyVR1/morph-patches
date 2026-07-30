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
public class gu10 {
    /* JADX INFO: renamed from: a */
    public static void m132261a(fu10 fu10Var, View view) {
        fu10Var.f100837I = (FrameLayout) view;
        fu10Var.f100839J = (CoordinatorLayout) view.findViewById(hdc0.f108818A1);
        ViewGroup viewGroup = (ViewGroup) view;
        fu10Var.f100841K = (AppBarLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fu10Var.f100843L = (CollapsingToolbarLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        fu10Var.f100845M = (Toolbar) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        fu10Var.f100847N = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        fu10Var.f100849O = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        fu10Var.f100851P = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        fu10Var.f100853Q = (VRelative) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        fu10Var.f100855R = (VRelative) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        fu10Var.f100857S = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        fu10Var.f100859T = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        fu10Var.f100861U = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        fu10Var.f100863V = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        fu10Var.f100864W = (VExpandableTextContainer) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        fu10Var.f100865X = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        fu10Var.f100866Y = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        fu10Var.f100867Z = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        fu10Var.f100868k0 = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        fu10Var.f100869p0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        fu10Var.f100833E0 = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(2);
        fu10Var.f100834F0 = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        fu10Var.f100835G0 = (FeedUserHeaderView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        fu10Var.f100836H0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(1);
        fu10Var.f100838I0 = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(2);
        fu10Var.f100840J0 = (VRelative) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        fu10Var.f100842K0 = (VLine) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        fu10Var.f100844L0 = (FeedTopicContentWithPluginView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        fu10Var.f100846M0 = (VFrame) viewGroup.getChildAt(1);
        fu10Var.f100848N0 = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        fu10Var.f100850O0 = (RelativeLayout) viewGroup.getChildAt(2);
        fu10Var.f100852P0 = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        fu10Var.f100854Q0 = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        fu10Var.f100856R0 = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        fu10Var.f100858S0 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m132262b(fu10 fu10Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173535L3, viewGroup, false);
        m132261a(fu10Var, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m132263c(fu10 fu10Var) {
        fu10Var.f100837I = null;
        fu10Var.f100839J = null;
        fu10Var.f100841K = null;
        fu10Var.f100843L = null;
        fu10Var.f100845M = null;
        fu10Var.f100847N = null;
        fu10Var.f100849O = null;
        fu10Var.f100851P = null;
        fu10Var.f100853Q = null;
        fu10Var.f100855R = null;
        fu10Var.f100857S = null;
        fu10Var.f100859T = null;
        fu10Var.f100861U = null;
        fu10Var.f100863V = null;
        fu10Var.f100864W = null;
        fu10Var.f100865X = null;
        fu10Var.f100866Y = null;
        fu10Var.f100867Z = null;
        fu10Var.f100868k0 = null;
        fu10Var.f100869p0 = null;
        fu10Var.f100833E0 = null;
        fu10Var.f100834F0 = null;
        fu10Var.f100835G0 = null;
        fu10Var.f100836H0 = null;
        fu10Var.f100838I0 = null;
        fu10Var.f100840J0 = null;
        fu10Var.f100842K0 = null;
        fu10Var.f100844L0 = null;
        fu10Var.f100846M0 = null;
        fu10Var.f100848N0 = null;
        fu10Var.f100850O0 = null;
        fu10Var.f100852P0 = null;
        fu10Var.f100854Q0 = null;
        fu10Var.f100856R0 = null;
        fu10Var.f100858S0 = null;
    }
}
