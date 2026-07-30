package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.bottom.VoiceIntlSettingItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ven0 {
    /* JADX INFO: renamed from: a */
    public static void m23903a(VoiceIntlSettingItemView voiceIntlSettingItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceIntlSettingItemView.a = viewGroup.getChildAt(0);
        voiceIntlSettingItemView.b = viewGroup.getChildAt(1);
        voiceIntlSettingItemView.c = (TextView) viewGroup.getChildAt(2);
        voiceIntlSettingItemView.d = viewGroup.getChildAt(3);
    }
}
