package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.legacy.widget.Space;
import com.p051p1.mobile.putong.core.p058ui.view.VPagerNewCircleIndicator;
import p151v.AutoVDraweeView;
import p151v.VPager;
import p151v.VPagerCircleIndicator;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class nhj {
    /* JADX INFO: renamed from: a */
    public static void m163108a(ihj ihjVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ihjVar.f114951a = (AutoVDraweeView) viewGroup.getChildAt(0);
        ihjVar.f114952b = (Space) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ihjVar.f114953c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ihjVar.f114954d = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        ihjVar.f114955e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        ihjVar.f114956f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        ihjVar.f114957g = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        ihjVar.f114958h = (VPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        ihjVar.f114959i = (VPagerCircleIndicator) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1);
        ihjVar.f114960j = (VPagerNewCircleIndicator) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(2);
    }
}
