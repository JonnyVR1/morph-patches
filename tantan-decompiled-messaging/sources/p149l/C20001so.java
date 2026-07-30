package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountFilterMenuView;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountTextSeekBar;
import p147v.VImage;

/* JADX INFO: renamed from: l.so */
/* JADX INFO: loaded from: classes9.dex */
public class C20001so {
    /* JADX INFO: renamed from: a */
    public static void m185212a(AccountFilterMenuView accountFilterMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountFilterMenuView.f16789a = viewGroup.getChildAt(0);
        accountFilterMenuView.f16790b = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        accountFilterMenuView.f16791c = (AccountTextSeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        accountFilterMenuView.f16792d = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        accountFilterMenuView.f16793e = (RecyclerView) viewGroup.getChildAt(3);
    }
}
