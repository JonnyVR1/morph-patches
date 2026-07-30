package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceEditNoticeDialog;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class x3n0 {
    /* JADX INFO: renamed from: a */
    public static void m25677a(VoiceEditNoticeDialog voiceEditNoticeDialog, View view) {
        voiceEditNoticeDialog.d = (VoiceEditNoticeDialog) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceEditNoticeDialog.e = viewGroup.getChildAt(0);
        voiceEditNoticeDialog.f = viewGroup.getChildAt(1);
        voiceEditNoticeDialog.g = (RelativeLayout) viewGroup.getChildAt(2);
        voiceEditNoticeDialog.h = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        voiceEditNoticeDialog.i = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        voiceEditNoticeDialog.j = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        voiceEditNoticeDialog.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        voiceEditNoticeDialog.l = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m25678b(VoiceEditNoticeDialog voiceEditNoticeDialog, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20062w8, viewGroup, false);
        m25677a(voiceEditNoticeDialog, viewInflate);
        return viewInflate;
    }
}
