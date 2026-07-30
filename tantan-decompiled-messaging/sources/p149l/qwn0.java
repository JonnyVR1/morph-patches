package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceLookTopNoticeDialog;

/* JADX INFO: loaded from: classes4.dex */
public class qwn0 {
    /* JADX INFO: renamed from: a */
    public static void m176873a(VoiceLookTopNoticeDialog voiceLookTopNoticeDialog, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLookTopNoticeDialog._empty = viewGroup.getChildAt(0);
        voiceLookTopNoticeDialog._container = (LinearLayout) viewGroup.getChildAt(1);
        voiceLookTopNoticeDialog._container_title = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceLookTopNoticeDialog._container_room_notice = (EditText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m176874b(VoiceLookTopNoticeDialog voiceLookTopNoticeDialog, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168515s9, viewGroup, false);
        m176873a(voiceLookTopNoticeDialog, viewInflate);
        return viewInflate;
    }
}
