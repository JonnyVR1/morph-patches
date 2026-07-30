package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceTopNoticeCheckFailDialog;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ivo0 {
    /* JADX INFO: renamed from: a */
    public static void m15427a(VoiceTopNoticeCheckFailDialog voiceTopNoticeCheckFailDialog, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceTopNoticeCheckFailDialog.a = (LinearLayout) viewGroup.getChildAt(0);
        voiceTopNoticeCheckFailDialog.b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceTopNoticeCheckFailDialog.c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceTopNoticeCheckFailDialog.d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m15428b(VoiceTopNoticeCheckFailDialog voiceTopNoticeCheckFailDialog, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19843fa, viewGroup, false);
        m15427a(voiceTopNoticeCheckFailDialog, viewInflate);
        return viewInflate;
    }
}
