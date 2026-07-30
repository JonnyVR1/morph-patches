package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.view.LiveFadeRecyclerView;
import com.p051p1.mobile.putong.live.livingroom.voice.fans.VoiceFansView;

/* JADX INFO: loaded from: classes4.dex */
public class yen0 {
    /* JADX INFO: renamed from: a */
    public static void m215423a(VoiceFansView voiceFansView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceFansView.f53916a = (LiveFadeRecyclerView) viewGroup.getChildAt(0);
        voiceFansView.f53917b = (TextView) viewGroup.getChildAt(1);
    }
}
