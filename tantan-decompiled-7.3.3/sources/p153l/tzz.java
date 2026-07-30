package p153l;

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
import com.p051p1.mobile.putong.core.p058ui.gift.layer.CoreGiftLayer;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageCommunityHintFooterView;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageSeeletterFooterView;
import com.p051p1.mobile.putong.core.p058ui.messages.model.view.ConvNextView;
import com.p051p1.mobile.putong.core.p058ui.messages.recycler.MessageRecyclerDispatchLinear;
import com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.ProxyTantanListView;
import com.p051p1.mobile.putong.core.p058ui.messages.recycler.wrap.MessageRecyclerView;
import com.p051p1.mobile.putong.core.p058ui.messages.view.BlurCoverLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageLayout;
import com.sunshine.engine.particle.SceneView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VList_Horizontal;
import p151v.VRecyclerView;
import p151v.VText;
import p151v.VText_AutoFit;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class tzz {
    /* JADX INFO: renamed from: a */
    public static void m193751a(qzz qzzVar, View view) {
        qzzVar.f160396i = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        qzzVar.f160398j = (VDraweeView) viewGroup.getChildAt(0);
        qzzVar.f160400k = viewGroup.getChildAt(1);
        qzzVar.f160403l = (SVGAnimationView) viewGroup.getChildAt(2);
        qzzVar.f160405m = (BlurCoverLayout) viewGroup.getChildAt(3);
        qzzVar.f160407n = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        qzzVar.f160409o = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        qzzVar.f160411p = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        qzzVar.f160414q = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        qzzVar.f160416r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        qzzVar.f160418s = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        qzzVar.f160420t = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        qzzVar.f160422u = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        qzzVar.f160424v = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        qzzVar.f160426w = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(2);
        qzzVar.f160428x = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(3);
        qzzVar.f160430y = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(2);
        qzzVar.f160432z = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        qzzVar.f160324A = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        qzzVar.f160326B = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        qzzVar.f160328C = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(3);
        qzzVar.f160330D = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        qzzVar.f160332E = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        qzzVar.f160335F = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(3)).getChildAt(1);
        qzzVar.f160338G = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(4);
        qzzVar.f160341H = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(5);
        qzzVar.f160344I = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(5)).getChildAt(0)).getChildAt(0);
        qzzVar.f160346J = (VText_AutoFit) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(5)).getChildAt(0)).getChildAt(1);
        qzzVar.f160348K = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(5)).getChildAt(1);
        qzzVar.f160350L = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(5)).getChildAt(2);
        qzzVar.f160352M = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(6);
        qzzVar.f160354N = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(6)).getChildAt(1);
        qzzVar.f160356O = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7);
        qzzVar.f160358P = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(0);
        qzzVar.f160360Q = (RecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        qzzVar.f160362R = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(1);
        qzzVar.f160364S = (MessageRecyclerDispatchLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2);
        qzzVar.f160366T = (MessageLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        qzzVar.f160368U = (MessageRecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        qzzVar.f160370V = (ProxyTantanListView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        qzzVar.f160372W = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2);
        qzzVar.f160374X = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        qzzVar.f160376Y = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        qzzVar.f160378Z = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(2);
        qzzVar.f160401k0 = (ConvNextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(3);
        qzzVar.f160412p0 = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(4);
        qzzVar.f160333E0 = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        qzzVar.f160336F0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        qzzVar.f160339G0 = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(5);
        qzzVar.f160342H0 = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(6);
        qzzVar.f160345I0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        qzzVar.f160347J0 = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(2);
        qzzVar.f160349K0 = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(0);
        qzzVar.f160351L0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(1);
        qzzVar.f160353M0 = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(2);
        qzzVar.f160355N0 = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(3);
        qzzVar.f160357O0 = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(0);
        qzzVar.f160359P0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        qzzVar.f160361Q0 = (MessageCommunityHintFooterView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(1);
        qzzVar.f160363R0 = (MessageSeeletterFooterView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(2);
        qzzVar.f160365S0 = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(1);
        qzzVar.f160367T0 = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(2);
        qzzVar.f160369U0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(2)).getChildAt(0);
        qzzVar.f160371V0 = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(3);
        qzzVar.f160373W0 = (VList_Horizontal) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(3)).getChildAt(0);
        qzzVar.f160375X0 = (SceneView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(7)).getChildAt(4);
        qzzVar.f160377Y0 = (ViewStub) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        qzzVar.f160379Z0 = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        qzzVar.f160381a1 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3)).getChildAt(0);
        qzzVar.f160383b1 = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3)).getChildAt(1);
        qzzVar.f160385c1 = (VLinear) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4);
        qzzVar.f160387d1 = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4)).getChildAt(0);
        qzzVar.f160389e1 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4)).getChildAt(1);
        qzzVar.f160391f1 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4)).getChildAt(2);
        qzzVar.f160393g1 = (VNavigationBar) viewGroup.getChildAt(4);
        qzzVar.f160395h1 = (FrameLayout) viewGroup.getChildAt(5);
        qzzVar.f160397i1 = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        qzzVar.f160399j1 = (FrameLayout) viewGroup.getChildAt(6);
        qzzVar.f160402k1 = (CoreGiftLayer) viewGroup.getChildAt(7);
        qzzVar.f160404l1 = (SVGAnimationView) viewGroup.getChildAt(8);
        qzzVar.f160406m1 = (SVGAnimationView) viewGroup.getChildAt(9);
    }

    /* JADX INFO: renamed from: b */
    public static View m193752b(qzz qzzVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f156935R4, viewGroup, false);
        m193751a(qzzVar, viewInflate);
        return viewInflate;
    }
}
