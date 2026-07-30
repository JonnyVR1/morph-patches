package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.view.LiveFadeRecyclerView;
import com.p046p1.mobile.putong.live.livingroom.voice.fans.VoiceFansView;

/* JADX INFO: loaded from: classes4.dex */
public class u5n0 {
    /* JADX INFO: renamed from: a */
    public static void m191874a(VoiceFansView voiceFansView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceFansView.f53068a = (LiveFadeRecyclerView) viewGroup.getChildAt(0);
        voiceFansView.f53069b = (TextView) viewGroup.getChildAt(1);
    }
}
