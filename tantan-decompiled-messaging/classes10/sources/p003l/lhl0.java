package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.ui.vip.VipIntroGroupPage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class lhl0 {
    /* JADX INFO: renamed from: a */
    public static void m7733a(VipIntroGroupPage vipIntroGroupPage, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vipIntroGroupPage.a = (LinearLayout) viewGroup.getChildAt(0);
        vipIntroGroupPage.b = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        vipIntroGroupPage.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        vipIntroGroupPage.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        vipIntroGroupPage.e = (RelativeLayout) viewGroup.getChildAt(1);
        vipIntroGroupPage.f = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        vipIntroGroupPage.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        vipIntroGroupPage.h = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        vipIntroGroupPage.i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
