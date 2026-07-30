package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Placeholder;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.base.view.LiveVoiceNewCardView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class k9v {
    /* JADX INFO: renamed from: a */
    public static void m145116a(LiveVoiceNewCardView liveVoiceNewCardView, View view) {
        liveVoiceNewCardView.f44745d = (LiveVoiceNewCardView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveVoiceNewCardView.f44746e = (VDraweeView) viewGroup.getChildAt(0);
        liveVoiceNewCardView.f44747f = (ImageView) viewGroup.getChildAt(1);
        liveVoiceNewCardView.f44748g = (VText) viewGroup.getChildAt(2);
        liveVoiceNewCardView.f44749h = (AnimEffectPlayer) viewGroup.getChildAt(3);
        liveVoiceNewCardView.f44750i = (TextView) viewGroup.getChildAt(4);
        liveVoiceNewCardView.f44751j = (Placeholder) viewGroup.getChildAt(5);
        liveVoiceNewCardView.f44752k = (LinearLayout) viewGroup.getChildAt(6);
        liveVoiceNewCardView.f44753l = (VText) viewGroup.getChildAt(7);
        liveVoiceNewCardView.f44754m = (TextView) viewGroup.getChildAt(8);
        liveVoiceNewCardView.f44755n = (FrameLayout) viewGroup.getChildAt(9);
    }
}
