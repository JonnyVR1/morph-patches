package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.voice.applymanager.apply.VoiceCallApplyListItemView;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class fvm0 {
    /* JADX INFO: renamed from: a */
    public static void m127676a(VoiceCallApplyListItemView voiceCallApplyListItemView, View view) {
        voiceCallApplyListItemView.f53689a = (VoiceCallApplyListItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceCallApplyListItemView.f53690b = (FrameLayout) viewGroup.getChildAt(0);
        voiceCallApplyListItemView.f53691c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceCallApplyListItemView.f53692d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceCallApplyListItemView.f53693e = (TextView) viewGroup.getChildAt(1);
        voiceCallApplyListItemView.f53694f = (FrameLayout) viewGroup.getChildAt(2);
        voiceCallApplyListItemView.f53695g = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        voiceCallApplyListItemView.f53696h = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
