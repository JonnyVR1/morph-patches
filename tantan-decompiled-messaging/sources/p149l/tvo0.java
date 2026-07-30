package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceTopNoticeView;

/* JADX INFO: loaded from: classes4.dex */
public class tvo0 {
    /* JADX INFO: renamed from: a */
    public static void m190770a(VoiceTopNoticeView voiceTopNoticeView, View view) {
        voiceTopNoticeView._notice = (VoiceTopNoticeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceTopNoticeView._notice_image = (ImageView) viewGroup.getChildAt(0);
        voiceTopNoticeView._notice_title = (TextView) viewGroup.getChildAt(1);
    }
}
