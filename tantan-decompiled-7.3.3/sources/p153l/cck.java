package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.p058ui.greet.GreetActViewModel;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VIcon;
import p151v.VImage;
import p151v.VLinear;
import p151v.VList;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cck {
    /* JADX INFO: renamed from: a */
    public static void m108711a(GreetActViewModel greetActViewModel, View view) {
        greetActViewModel.f30183a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        greetActViewModel.f30184b = viewGroup.getChildAt(0);
        greetActViewModel.f30185c = (VFrame) viewGroup.getChildAt(1);
        greetActViewModel.f30186d = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        greetActViewModel.f30187e = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        greetActViewModel.f30188f = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        greetActViewModel.f30189g = (VList) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        greetActViewModel.f30190h = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        greetActViewModel.f30191i = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        greetActViewModel.f30192j = (VRecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        greetActViewModel.f30193k = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        greetActViewModel.f30194l = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        greetActViewModel.f30195m = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        greetActViewModel.f30196n = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        greetActViewModel.f30197o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        greetActViewModel.f30198p = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(2);
        greetActViewModel.f30199q = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        greetActViewModel.f30200r = (HeaderFrameWrapper) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        greetActViewModel.f30201s = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        greetActViewModel.f30202t = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        greetActViewModel.f30203u = (VIcon) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        greetActViewModel.f30204v = (VIcon) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m108712b(GreetActViewModel greetActViewModel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f156944T, viewGroup, false);
        m108711a(greetActViewModel, viewInflate);
        return viewInflate;
    }
}
