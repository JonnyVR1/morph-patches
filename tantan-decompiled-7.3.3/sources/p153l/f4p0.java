package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.voice.topbar.dialog.VoiceTopMenuItem;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class f4p0 {
    /* JADX INFO: renamed from: a */
    public static void m124024a(VoiceTopMenuItem voiceTopMenuItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceTopMenuItem.f54660a = (VDraweeView) viewGroup.getChildAt(0);
        voiceTopMenuItem.f54661b = (TextView) viewGroup.getChildAt(1);
    }
}
