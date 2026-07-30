package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.greet.hello.VerticalTextSwitcher;
import com.p051p1.mobile.putong.core.p058ui.vip.greet.ProfileSendGreetView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class e0b0 {
    /* JADX INFO: renamed from: a */
    public static void m118833a(ProfileSendGreetView profileSendGreetView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileSendGreetView.f37929c = (VDraweeView) viewGroup.getChildAt(0);
        profileSendGreetView.f37930d = (VerticalTextSwitcher) viewGroup.getChildAt(1);
        profileSendGreetView.f37931e = (TextView) viewGroup.getChildAt(2);
    }
}
