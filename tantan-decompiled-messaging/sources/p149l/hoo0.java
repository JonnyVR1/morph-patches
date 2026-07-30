package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetCpLimitItemView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetTimeView;
import p147v.VDraweeView;
import p147v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class hoo0 {
    /* JADX INFO: renamed from: a */
    public static void m132226a(VoiceSweetCpLimitItemView voiceSweetCpLimitItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceSweetCpLimitItemView.f53600a = (VDraweeView) viewGroup.getChildAt(0);
        voiceSweetCpLimitItemView.f53601b = (VLinear) viewGroup.getChildAt(1);
        voiceSweetCpLimitItemView.f53602c = (VLinear) viewGroup.getChildAt(2);
        voiceSweetCpLimitItemView.f53603d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        voiceSweetCpLimitItemView.f53604e = (VoiceSweetTimeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
