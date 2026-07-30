package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Placeholder;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.base.view.LiveVoiceNewCardView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class lbv {
    /* JADX INFO: renamed from: a */
    public static void m153595a(LiveVoiceNewCardView liveVoiceNewCardView, View view) {
        liveVoiceNewCardView.f45593d = (LiveVoiceNewCardView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveVoiceNewCardView.f45594e = (VDraweeView) viewGroup.getChildAt(0);
        liveVoiceNewCardView.f45595f = (ImageView) viewGroup.getChildAt(1);
        liveVoiceNewCardView.f45596g = (VText) viewGroup.getChildAt(2);
        liveVoiceNewCardView.f45597h = (AnimEffectPlayer) viewGroup.getChildAt(3);
        liveVoiceNewCardView.f45598i = (TextView) viewGroup.getChildAt(4);
        liveVoiceNewCardView.f45599j = (Placeholder) viewGroup.getChildAt(5);
        liveVoiceNewCardView.f45600k = (LinearLayout) viewGroup.getChildAt(6);
        liveVoiceNewCardView.f45601l = (VText) viewGroup.getChildAt(7);
        liveVoiceNewCardView.f45602m = (TextView) viewGroup.getChildAt(8);
        liveVoiceNewCardView.f45603n = (FrameLayout) viewGroup.getChildAt(9);
    }
}
