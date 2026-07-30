package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import p151v.VPager;

/* JADX INFO: loaded from: classes10.dex */
public class aay {
    /* JADX INFO: renamed from: a */
    public static void m96670a(y9y y9yVar, View view) {
        y9yVar.f198134a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        y9yVar.f198135b = (VPager) viewGroup.getChildAt(0);
        y9yVar.f198136c = (NewPictureContainerIndicator) viewGroup.getChildAt(1);
        y9yVar.f198137d = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m96671b(y9y y9yVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f152041t0, viewGroup, false);
        m96670a(y9yVar, viewInflate);
        return viewInflate;
    }
}
