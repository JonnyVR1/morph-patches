package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceTopNoticeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tvo0 {
    /* JADX INFO: renamed from: a */
    public static void m23193a(VoiceTopNoticeView voiceTopNoticeView, View view) {
        voiceTopNoticeView.a = (VoiceTopNoticeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceTopNoticeView.b = (ImageView) viewGroup.getChildAt(0);
        voiceTopNoticeView.c = (TextView) viewGroup.getChildAt(1);
    }
}
