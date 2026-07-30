package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountBeautyMakeupPageView;

/* JADX INFO: renamed from: l.qg */
/* JADX INFO: loaded from: classes9.dex */
public class C19490qg {
    /* JADX INFO: renamed from: a */
    public static void m174378a(AccountBeautyMakeupPageView accountBeautyMakeupPageView, View view) {
        accountBeautyMakeupPageView.f16715a = (AccountBeautyMakeupPageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        accountBeautyMakeupPageView.f16716b = (RecyclerView) viewGroup.getChildAt(0);
        accountBeautyMakeupPageView.f16717c = (LinearLayout) viewGroup.getChildAt(1);
        accountBeautyMakeupPageView.f16718d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        accountBeautyMakeupPageView.f16719e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        accountBeautyMakeupPageView.f16720f = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
