package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.applymanager.apply.VoiceCallApplyListItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bmm0 {
    /* JADX INFO: renamed from: a */
    public static void m10479a(VoiceCallApplyListItemView voiceCallApplyListItemView, View view) {
        voiceCallApplyListItemView.a = (VoiceCallApplyListItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceCallApplyListItemView.b = (FrameLayout) viewGroup.getChildAt(0);
        voiceCallApplyListItemView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceCallApplyListItemView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceCallApplyListItemView.e = (TextView) viewGroup.getChildAt(1);
        voiceCallApplyListItemView.f = (FrameLayout) viewGroup.getChildAt(2);
        voiceCallApplyListItemView.g = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        voiceCallApplyListItemView.h = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
