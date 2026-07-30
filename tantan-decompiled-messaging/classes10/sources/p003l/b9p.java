package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.intlrenew.IntlRenewContractView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class b9p {
    /* JADX INFO: renamed from: a */
    public static void m5702a(IntlRenewContractView intlRenewContractView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlRenewContractView.a = (ImageView) viewGroup.getChildAt(1);
        intlRenewContractView.b = (TextView) viewGroup.getChildAt(2);
        intlRenewContractView.c = (TextView) viewGroup.getChildAt(3);
        intlRenewContractView.d = (TextView) viewGroup.getChildAt(4);
        intlRenewContractView.e = (TextView) viewGroup.getChildAt(5);
    }
}
