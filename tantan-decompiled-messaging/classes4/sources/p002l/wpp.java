package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.livingroom.voice.intl.roombg.common.IntlVoiceBgPagerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wpp {
    /* JADX INFO: renamed from: a */
    public static void m25273a(IntlVoiceBgPagerView intlVoiceBgPagerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlVoiceBgPagerView.a = viewGroup.getChildAt(0);
        intlVoiceBgPagerView.b = (LinearLayout) viewGroup.getChildAt(1);
    }
}
