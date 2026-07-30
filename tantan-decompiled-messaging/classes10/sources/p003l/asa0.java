package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.greet.hello.VerticalTextSwitcher;
import com.p1.mobile.putong.core.ui.vip.greet.ProfileSendGreetView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class asa0 {
    /* JADX INFO: renamed from: a */
    public static void m5621a(ProfileSendGreetView profileSendGreetView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileSendGreetView.c = viewGroup.getChildAt(0);
        profileSendGreetView.d = (VerticalTextSwitcher) viewGroup.getChildAt(1);
        profileSendGreetView.e = (TextView) viewGroup.getChildAt(2);
    }
}
