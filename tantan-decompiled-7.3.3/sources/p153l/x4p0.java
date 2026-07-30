package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceTopNoticeView;

/* JADX INFO: loaded from: classes4.dex */
public class x4p0 {
    /* JADX INFO: renamed from: a */
    public static void m209349a(VoiceTopNoticeView voiceTopNoticeView, View view) {
        voiceTopNoticeView._notice = (VoiceTopNoticeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceTopNoticeView._notice_image = (ImageView) viewGroup.getChildAt(0);
        voiceTopNoticeView._notice_title = (TextView) viewGroup.getChildAt(1);
    }
}
