package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.greet.hello.VerticalTextSwitcher;
import com.p046p1.mobile.putong.core.p053ui.vip.greet.ProfileSendGreetView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class asa0 {
    /* JADX INFO: renamed from: a */
    public static void m98585a(ProfileSendGreetView profileSendGreetView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileSendGreetView.f37081c = (VDraweeView) viewGroup.getChildAt(0);
        profileSendGreetView.f37082d = (VerticalTextSwitcher) viewGroup.getChildAt(1);
        profileSendGreetView.f37083e = (TextView) viewGroup.getChildAt(2);
    }
}
