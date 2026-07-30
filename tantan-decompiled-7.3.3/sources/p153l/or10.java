package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.putong.core.p058ui.messages.MultiContentVoiceCall;
import p151v.VPagerCircleIndicator;

/* JADX INFO: loaded from: classes10.dex */
public class or10 {
    /* JADX INFO: renamed from: a */
    public static void m168853a(MultiContentVoiceCall multiContentVoiceCall, View view) {
        multiContentVoiceCall.f32503a = (MultiContentVoiceCall) view;
        ViewGroup viewGroup = (ViewGroup) view;
        multiContentVoiceCall.f32504b = (ViewPager) viewGroup.getChildAt(0);
        multiContentVoiceCall.f32505c = (VPagerCircleIndicator) viewGroup.getChildAt(1);
    }
}
