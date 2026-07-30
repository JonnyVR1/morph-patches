package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.C8846b;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bna0 {
    /* JADX INFO: renamed from: a */
    public static void m105369a(C8846b c8846b, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c8846b.f34400a = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        c8846b.f34401b = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        c8846b.f34402c = (DateEditTextNew) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        c8846b.f34403d = (DateEditTextNew) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        c8846b.f34404e = (DateEditTextNew) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(0);
        c8846b.f34405f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        c8846b.f34406g = (ProfileLoopActionLayout) viewGroup.getChildAt(1);
        c8846b.f34407h = (FrameLayout) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m105370b(C8846b c8846b, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167605z0, viewGroup, false);
        m105369a(c8846b, viewInflate);
        return viewInflate;
    }
}
