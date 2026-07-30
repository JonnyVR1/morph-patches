package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.account.view.AccountViewV2;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class y00 {
    /* JADX INFO: renamed from: a */
    public static void m213826a(AccountViewV2 accountViewV2, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountViewV2.f29119a = (FrameLayout) viewGroup.getChildAt(0);
        accountViewV2.f29120b = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        accountViewV2.f29121c = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        accountViewV2.f29122d = (TextView) viewGroup.getChildAt(1);
        accountViewV2.f29123e = (TextView) viewGroup.getChildAt(2);
    }
}
