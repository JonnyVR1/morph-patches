package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.layout.expanded.view.ExpProfileOpButtonLinearRoot;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.layout.expanded.view.ExpProfileOpButtonRoot;
import com.p051p1.mobile.putong.core.p058ui.vip.widget.LetterRemainingSwitcherView;
import p151v.VFrame_FlipContainer;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class pgf {
    /* JADX INFO: renamed from: a */
    public static void m172226a(ogf ogfVar, View view) {
        ogfVar.f147231e = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ogfVar.f147232f = viewGroup.getChildAt(0);
        ogfVar.f147233g = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ogfVar.f147234h = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        ogfVar.f147235i = (ExpProfileOpButtonRoot) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        ogfVar.f147236j = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        ogfVar.f147237k = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        ogfVar.f147238l = (ExpProfileOpButtonRoot) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        ogfVar.f147239m = (VFrame_FlipContainer) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        ogfVar.f147240n = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        ogfVar.f147241o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        ogfVar.f147242p = (ExpProfileOpButtonRoot) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        ogfVar.f147243q = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        ogfVar.f147244r = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        ogfVar.f147245s = (ExpProfileOpButtonRoot) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ogfVar.f147246t = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        ogfVar.f147247u = (ExpProfileOpButtonLinearRoot) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        ogfVar.f147248v = (LetterRemainingSwitcherView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        ogfVar.f147249w = (ExpProfileOpButtonRoot) viewGroup.getChildAt(2);
        ogfVar.f147250x = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        ogfVar.f147251y = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m172227b(ogf ogfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125522M9, viewGroup, false);
        m172226a(ogfVar, viewInflate);
        return viewInflate;
    }
}
