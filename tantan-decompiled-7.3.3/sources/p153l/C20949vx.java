package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.account.view.AccountSecureFunItem;

/* JADX INFO: renamed from: l.vx */
/* JADX INFO: loaded from: classes10.dex */
public class C20949vx {
    /* JADX INFO: renamed from: a */
    public static void m203823a(AccountSecureFunItem accountSecureFunItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountSecureFunItem.f29110a = (VText_Medium) viewGroup.getChildAt(0);
        accountSecureFunItem.f29111b = (VText_Medium) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        accountSecureFunItem.f29112c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
