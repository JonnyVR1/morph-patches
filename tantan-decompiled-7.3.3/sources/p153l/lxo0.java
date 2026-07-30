package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetCpLimitItemView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetTimeView;
import p151v.VDraweeView;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class lxo0 {
    /* JADX INFO: renamed from: a */
    public static void m156206a(VoiceSweetCpLimitItemView voiceSweetCpLimitItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceSweetCpLimitItemView.f54448a = (VDraweeView) viewGroup.getChildAt(0);
        voiceSweetCpLimitItemView.f54449b = (VLinear) viewGroup.getChildAt(1);
        voiceSweetCpLimitItemView.f54450c = (VLinear) viewGroup.getChildAt(2);
        voiceSweetCpLimitItemView.f54451d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        voiceSweetCpLimitItemView.f54452e = (VoiceSweetTimeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
