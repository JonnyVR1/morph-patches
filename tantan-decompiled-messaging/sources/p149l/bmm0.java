package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.voice.applymanager.apply.VoiceCallApplyListItemView;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class bmm0 {
    /* JADX INFO: renamed from: a */
    public static void m102655a(VoiceCallApplyListItemView voiceCallApplyListItemView, View view) {
        voiceCallApplyListItemView.f52841a = (VoiceCallApplyListItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceCallApplyListItemView.f52842b = (FrameLayout) viewGroup.getChildAt(0);
        voiceCallApplyListItemView.f52843c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceCallApplyListItemView.f52844d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceCallApplyListItemView.f52845e = (TextView) viewGroup.getChildAt(1);
        voiceCallApplyListItemView.f52846f = (FrameLayout) viewGroup.getChildAt(2);
        voiceCallApplyListItemView.f52847g = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        voiceCallApplyListItemView.f52848h = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
