package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountBeautyMakeupPageView;

/* JADX INFO: renamed from: l.lg */
/* JADX INFO: loaded from: classes9.dex */
public class C18389lg {
    /* JADX INFO: renamed from: a */
    public static void m154056a(AccountBeautyMakeupPageView accountBeautyMakeupPageView, View view) {
        accountBeautyMakeupPageView.f17434a = (AccountBeautyMakeupPageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        accountBeautyMakeupPageView.f17435b = (RecyclerView) viewGroup.getChildAt(0);
        accountBeautyMakeupPageView.f17436c = (LinearLayout) viewGroup.getChildAt(1);
        accountBeautyMakeupPageView.f17437d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        accountBeautyMakeupPageView.f17438e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        accountBeautyMakeupPageView.f17439f = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
