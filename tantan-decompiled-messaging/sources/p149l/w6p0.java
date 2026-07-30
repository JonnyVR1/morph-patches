package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.virtual.call.view.VoiceVirtualNineDeputyItemView;
import com.p046p1.mobile.putong.live.livingroom.virtual.call.view.VoiceVirtualNineDeputyWidgetView;

/* JADX INFO: loaded from: classes4.dex */
public class w6p0 {
    /* JADX INFO: renamed from: a */
    public static void m201956a(VoiceVirtualNineDeputyWidgetView voiceVirtualNineDeputyWidgetView, View view) {
        voiceVirtualNineDeputyWidgetView.f52265f = (VoiceVirtualNineDeputyWidgetView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualNineDeputyWidgetView.f52266g = (VoiceVirtualNineDeputyItemView) viewGroup.getChildAt(0);
        voiceVirtualNineDeputyWidgetView.f52267h = (LinearLayout) viewGroup.getChildAt(1);
        voiceVirtualNineDeputyWidgetView.f52268i = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceVirtualNineDeputyWidgetView.f52269j = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        voiceVirtualNineDeputyWidgetView.f52270k = (LinearLayout) viewGroup.getChildAt(2);
        voiceVirtualNineDeputyWidgetView.f52271l = (VoiceVirtualNineDeputyItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        voiceVirtualNineDeputyWidgetView.f52272m = (VoiceVirtualNineDeputyItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        voiceVirtualNineDeputyWidgetView.f52273n = (VoiceVirtualNineDeputyItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        voiceVirtualNineDeputyWidgetView.f52274o = (VoiceVirtualNineDeputyItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        voiceVirtualNineDeputyWidgetView.f52275p = (LinearLayout) viewGroup.getChildAt(3);
        voiceVirtualNineDeputyWidgetView.f52276q = (VoiceVirtualNineDeputyItemView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        voiceVirtualNineDeputyWidgetView.f52277r = (VoiceVirtualNineDeputyItemView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        voiceVirtualNineDeputyWidgetView.f52278s = (VoiceVirtualNineDeputyItemView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        voiceVirtualNineDeputyWidgetView.f52279t = (VoiceVirtualNineDeputyItemView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m201957b(VoiceVirtualNineDeputyWidgetView voiceVirtualNineDeputyWidgetView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168222Va, viewGroup, false);
        m201956a(voiceVirtualNineDeputyWidgetView, viewInflate);
        return viewInflate;
    }
}
