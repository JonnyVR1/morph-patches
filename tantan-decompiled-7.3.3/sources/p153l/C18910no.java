package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountFilterMenuView;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountTextSeekBar;
import p151v.VImage;

/* JADX INFO: renamed from: l.no */
/* JADX INFO: loaded from: classes9.dex */
public class C18910no {
    /* JADX INFO: renamed from: a */
    public static void m164009a(AccountFilterMenuView accountFilterMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountFilterMenuView.f17508a = viewGroup.getChildAt(0);
        accountFilterMenuView.f17509b = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        accountFilterMenuView.f17510c = (AccountTextSeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        accountFilterMenuView.f17511d = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        accountFilterMenuView.f17512e = (RecyclerView) viewGroup.getChildAt(3);
    }
}
