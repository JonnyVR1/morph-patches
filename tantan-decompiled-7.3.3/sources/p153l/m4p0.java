package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceTopNoticeCheckFailDialog;

/* JADX INFO: loaded from: classes4.dex */
public class m4p0 {
    /* JADX INFO: renamed from: a */
    public static void m157048a(VoiceTopNoticeCheckFailDialog voiceTopNoticeCheckFailDialog, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceTopNoticeCheckFailDialog._container = (LinearLayout) viewGroup.getChildAt(0);
        voiceTopNoticeCheckFailDialog._dialog_title = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceTopNoticeCheckFailDialog._rule = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceTopNoticeCheckFailDialog._argue_continue = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m157049b(VoiceTopNoticeCheckFailDialog voiceTopNoticeCheckFailDialog, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199079fa, viewGroup, false);
        m157048a(voiceTopNoticeCheckFailDialog, viewInflate);
        return viewInflate;
    }
}
