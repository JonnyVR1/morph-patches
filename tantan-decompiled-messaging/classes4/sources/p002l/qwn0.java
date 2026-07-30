package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceLookTopNoticeDialog;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class qwn0 {
    /* JADX INFO: renamed from: a */
    public static void m21622a(VoiceLookTopNoticeDialog voiceLookTopNoticeDialog, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLookTopNoticeDialog.a = viewGroup.getChildAt(0);
        voiceLookTopNoticeDialog.b = (LinearLayout) viewGroup.getChildAt(1);
        voiceLookTopNoticeDialog.c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceLookTopNoticeDialog.d = (EditText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m21623b(VoiceLookTopNoticeDialog voiceLookTopNoticeDialog, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20011s9, viewGroup, false);
        m21622a(voiceLookTopNoticeDialog, viewInflate);
        return viewInflate;
    }
}
