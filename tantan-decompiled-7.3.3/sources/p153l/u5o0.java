package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceLookTopNoticeDialog;

/* JADX INFO: loaded from: classes4.dex */
public class u5o0 {
    /* JADX INFO: renamed from: a */
    public static void m194614a(VoiceLookTopNoticeDialog voiceLookTopNoticeDialog, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLookTopNoticeDialog._empty = viewGroup.getChildAt(0);
        voiceLookTopNoticeDialog._container = (LinearLayout) viewGroup.getChildAt(1);
        voiceLookTopNoticeDialog._container_title = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceLookTopNoticeDialog._container_room_notice = (EditText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m194615b(VoiceLookTopNoticeDialog voiceLookTopNoticeDialog, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199247s9, viewGroup, false);
        m194614a(voiceLookTopNoticeDialog, viewInflate);
        return viewInflate;
    }
}
