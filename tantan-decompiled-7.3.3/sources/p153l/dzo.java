package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.IntlPrivilegeCard;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class dzo {
    /* JADX INFO: renamed from: a */
    public static void m118756a(IntlPrivilegeCard intlPrivilegeCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPrivilegeCard.f38695a = (LinearLayout) viewGroup.getChildAt(0);
        intlPrivilegeCard.f38696b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlPrivilegeCard.f38697c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlPrivilegeCard.f38698d = (VLinear) viewGroup.getChildAt(1);
        intlPrivilegeCard.f38699e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlPrivilegeCard.f38700f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
