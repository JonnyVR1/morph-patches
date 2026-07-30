package p006l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountBeautyMakeupPageView;

/* JADX INFO: renamed from: l.qg */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1166qg {
    /* JADX INFO: renamed from: a */
    public static void m22016a(AccountBeautyMakeupPageView accountBeautyMakeupPageView, View view) {
        accountBeautyMakeupPageView.f704a = (AccountBeautyMakeupPageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        accountBeautyMakeupPageView.f705b = viewGroup.getChildAt(0);
        accountBeautyMakeupPageView.f706c = (LinearLayout) viewGroup.getChildAt(1);
        accountBeautyMakeupPageView.f707d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        accountBeautyMakeupPageView.f708e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        accountBeautyMakeupPageView.f709f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
