package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceEditNoticeDialog;
import p151v.VEditText;
import p151v.VFrame;

/* JADX INFO: loaded from: classes4.dex */
public class bdn0 {
    /* JADX INFO: renamed from: a */
    public static void m103612a(VoiceEditNoticeDialog voiceEditNoticeDialog, View view) {
        voiceEditNoticeDialog._root = (VoiceEditNoticeDialog) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceEditNoticeDialog._empty = viewGroup.getChildAt(0);
        voiceEditNoticeDialog._empty_anchor = viewGroup.getChildAt(1);
        voiceEditNoticeDialog._container = (RelativeLayout) viewGroup.getChildAt(2);
        voiceEditNoticeDialog._title = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        voiceEditNoticeDialog._can_input_num = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        voiceEditNoticeDialog._edit_layout = (VFrame) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        voiceEditNoticeDialog._input_notice_text = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        voiceEditNoticeDialog._complete_update = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m103613b(VoiceEditNoticeDialog voiceEditNoticeDialog, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199298w8, viewGroup, false);
        m103612a(voiceEditNoticeDialog, viewInflate);
        return viewInflate;
    }
}
