package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.roombg.common.IntlVoiceBgPagerView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.roombg.common.VoiceMaxHeightRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class wrp {
    /* JADX INFO: renamed from: a */
    public static void m207608a(IntlVoiceBgPagerView intlVoiceBgPagerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlVoiceBgPagerView.f54224a = (VoiceMaxHeightRecyclerView) viewGroup.getChildAt(0);
        intlVoiceBgPagerView.f54225b = (LinearLayout) viewGroup.getChildAt(1);
    }
}
