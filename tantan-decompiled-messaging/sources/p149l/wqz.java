package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.p053ui.gift.layer.CoreGiftLayer;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageCommunityHintFooterView;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageSeeletterFooterView;
import com.p046p1.mobile.putong.core.p053ui.messages.model.view.ConvNextView;
import com.p046p1.mobile.putong.core.p053ui.messages.recycler.MessageRecyclerDispatchLinear;
import com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.ProxyTantanListView;
import com.p046p1.mobile.putong.core.p053ui.messages.recycler.wrap.MessageRecyclerView;
import com.p046p1.mobile.putong.core.p053ui.messages.view.BlurCoverLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageLayout;
import com.sunshine.engine.particle.SceneView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VList_Horizontal;
import p147v.VRecyclerView;
import p147v.VText;
import p147v.VText_AutoFit;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class wqz {
    /* JADX INFO: renamed from: a */
    public static void m205074a(tqz tqzVar, View view) {
        tqzVar.f171733i = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        tqzVar.f171735j = (VDraweeView) viewGroup.getChildAt(0);
        tqzVar.f171737k = viewGroup.getChildAt(1);
        tqzVar.f171740l = (SVGAnimationView) viewGroup.getChildAt(2);
        tqzVar.f171742m = (BlurCoverLayout) viewGroup.getChildAt(3);
        tqzVar.f171744n = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        tqzVar.f171746o = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        tqzVar.f171748p = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        tqzVar.f171751q = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        tqzVar.f171753r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        tqzVar.f171755s = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        tqzVar.f171757t = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        tqzVar.f171759u = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        tqzVar.f171761v = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        tqzVar.f171763w = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(2);
        tqzVar.f171765x = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(3);
        tqzVar.f171767y = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(2);
        tqzVar.f171769z = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        tqzVar.f171661A = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        tqzVar.f171663B = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        tqzVar.f171665C = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(3);
        tqzVar.f171667D = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        tqzVar.f171669E = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        tqzVar.f171672F = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(3)).getChildAt(1);
        tqzVar.f171675G = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(4);
        tqzVar.f171678H = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(5);
        tqzVar.f171681I = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(5)).getChildAt(0)).getChildAt(0);
        tqzVar.f171683J = (VText_AutoFit) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(5)).getChildAt(0)).getChildAt(1);
        tqzVar.f171685K = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(5)).getChildAt(1);
        tqzVar.f171687L = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(5)).getChildAt(2);
        tqzVar.f171689M = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(6);
        tqzVar.f171691N = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(6)).getChildAt(1);
        tqzVar.f171693O = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7);
        tqzVar.f171695P = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(0);
        tqzVar.f171697Q = (RecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        tqzVar.f171699R = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(1);
        tqzVar.f171701S = (MessageRecyclerDispatchLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2);
        tqzVar.f171703T = (MessageLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        tqzVar.f171705U = (MessageRecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        tqzVar.f171707V = (ProxyTantanListView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        tqzVar.f171709W = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2);
        tqzVar.f171711X = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        tqzVar.f171713Y = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        tqzVar.f171715Z = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(2);
        tqzVar.f171738k0 = (ConvNextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(3);
        tqzVar.f171749p0 = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(4);
        tqzVar.f171670E0 = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        tqzVar.f171673F0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        tqzVar.f171676G0 = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(5);
        tqzVar.f171679H0 = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(6);
        tqzVar.f171682I0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        tqzVar.f171684J0 = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(2);
        tqzVar.f171686K0 = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(0);
        tqzVar.f171688L0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(1);
        tqzVar.f171690M0 = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(2);
        tqzVar.f171692N0 = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(3);
        tqzVar.f171694O0 = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(0);
        tqzVar.f171696P0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        tqzVar.f171698Q0 = (MessageCommunityHintFooterView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(1);
        tqzVar.f171700R0 = (MessageSeeletterFooterView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(2);
        tqzVar.f171702S0 = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(1);
        tqzVar.f171704T0 = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(2);
        tqzVar.f171706U0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(2)).getChildAt(0);
        tqzVar.f171708V0 = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(3);
        tqzVar.f171710W0 = (VList_Horizontal) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(3)).getChildAt(0);
        tqzVar.f171712X0 = (SceneView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(4);
        tqzVar.f171714Y0 = (ViewStub) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        tqzVar.f171716Z0 = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        tqzVar.f171718a1 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3)).getChildAt(0);
        tqzVar.f171720b1 = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3)).getChildAt(1);
        tqzVar.f171722c1 = (VLinear) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4);
        tqzVar.f171724d1 = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4)).getChildAt(0);
        tqzVar.f171726e1 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4)).getChildAt(1);
        tqzVar.f171728f1 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4)).getChildAt(2);
        tqzVar.f171730g1 = (VNavigationBar) viewGroup.getChildAt(4);
        tqzVar.f171732h1 = (FrameLayout) viewGroup.getChildAt(5);
        tqzVar.f171734i1 = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        tqzVar.f171736j1 = (FrameLayout) viewGroup.getChildAt(6);
        tqzVar.f171739k1 = (CoreGiftLayer) viewGroup.getChildAt(7);
        tqzVar.f171741l1 = (SVGAnimationView) viewGroup.getChildAt(8);
        tqzVar.f171743m1 = (SVGAnimationView) viewGroup.getChildAt(9);
    }

    /* JADX INFO: renamed from: b */
    public static View m205075b(tqz tqzVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126379R4, viewGroup, false);
        m205074a(tqzVar, viewInflate);
        return viewInflate;
    }
}
