package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.putong.core.p053ui.messages.MultiContentVoiceCall;
import p147v.VPagerCircleIndicator;

/* JADX INFO: loaded from: classes10.dex */
public class ej10 {
    /* JADX INFO: renamed from: a */
    public static void m116752a(MultiContentVoiceCall multiContentVoiceCall, View view) {
        multiContentVoiceCall.f31655a = (MultiContentVoiceCall) view;
        ViewGroup viewGroup = (ViewGroup) view;
        multiContentVoiceCall.f31656b = (ViewPager) viewGroup.getChildAt(0);
        multiContentVoiceCall.f31657c = (VPagerCircleIndicator) viewGroup.getChildAt(1);
    }
}
