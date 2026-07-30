package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.virtual.call.view.VoiceVirtualNineDeputyWidgetView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class w6p0 {
    /* JADX INFO: renamed from: a */
    public static void m24425a(VoiceVirtualNineDeputyWidgetView voiceVirtualNineDeputyWidgetView, View view) {
        voiceVirtualNineDeputyWidgetView.f = (VoiceVirtualNineDeputyWidgetView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualNineDeputyWidgetView.g = viewGroup.getChildAt(0);
        voiceVirtualNineDeputyWidgetView.h = (LinearLayout) viewGroup.getChildAt(1);
        voiceVirtualNineDeputyWidgetView.i = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceVirtualNineDeputyWidgetView.j = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        voiceVirtualNineDeputyWidgetView.k = (LinearLayout) viewGroup.getChildAt(2);
        voiceVirtualNineDeputyWidgetView.l = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        voiceVirtualNineDeputyWidgetView.m = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        voiceVirtualNineDeputyWidgetView.n = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        voiceVirtualNineDeputyWidgetView.o = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        voiceVirtualNineDeputyWidgetView.p = (LinearLayout) viewGroup.getChildAt(3);
        voiceVirtualNineDeputyWidgetView.q = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        voiceVirtualNineDeputyWidgetView.r = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        voiceVirtualNineDeputyWidgetView.s = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        voiceVirtualNineDeputyWidgetView.t = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m24426b(VoiceVirtualNineDeputyWidgetView voiceVirtualNineDeputyWidgetView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19718Va, viewGroup, false);
        m24425a(voiceVirtualNineDeputyWidgetView, viewInflate);
        return viewInflate;
    }
}
