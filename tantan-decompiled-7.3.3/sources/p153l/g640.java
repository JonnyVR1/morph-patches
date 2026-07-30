package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.p051p1.mobile.putong.core.newui.home.HomeEmptyCardView;
import com.p051p1.mobile.putong.core.newui.home.HomeErrorNetView;
import com.p051p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC8017b;
import com.p051p1.mobile.putong.core.newui.home.views.HomeTitleLayout;
import com.sunshine.engine.particle.SceneView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VFrame_Squared;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class g640 {
    /* JADX INFO: renamed from: a */
    public static void m129088a(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, View view) {
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22658a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22660b = viewGroup.getChildAt(0);
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22662c = (VFrame) viewGroup.getChildAt(1);
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22664d = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22666e = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22668f = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22670g = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22672h = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22674i = (AppCompatImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22676j = (VFrame_Squared) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22678k = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22681l = (HomeEmptyCardView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22683m = (HomeErrorNetView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22685n = (HomeErrorNetView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22687o = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22689p = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22692q = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22694r = (SceneView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22696s = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22698t = (ViewStub) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22700u = (ViewStub) viewGroup.getChildAt(2);
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22702v = (FrameLayout) viewGroup.getChildAt(3);
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22704w = (HomeTitleLayout) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m129089b(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126039re, viewGroup, false);
        m129088a(viewTreeObserverOnGlobalLayoutListenerC8017b, viewInflate);
        return viewInflate;
    }
}
