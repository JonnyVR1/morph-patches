package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.intl.liveend.VoiceEndFireListItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class n4n0 {
    /* JADX INFO: renamed from: a */
    public static void m18508a(VoiceEndFireListItemView voiceEndFireListItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceEndFireListItemView.a = viewGroup.getChildAt(0);
        voiceEndFireListItemView.b = (TextView) viewGroup.getChildAt(1);
        voiceEndFireListItemView.c = (TextView) viewGroup.getChildAt(2);
        voiceEndFireListItemView.d = (TextView) viewGroup.getChildAt(3);
    }
}
