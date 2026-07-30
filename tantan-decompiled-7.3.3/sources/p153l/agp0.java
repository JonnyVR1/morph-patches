package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.virtual.call.view.VoiceVirtualNineDeputyItemView;
import com.p051p1.mobile.putong.live.livingroom.virtual.call.view.VoiceVirtualNineDeputyWidgetView;

/* JADX INFO: loaded from: classes4.dex */
public class agp0 {
    /* JADX INFO: renamed from: a */
    public static void m97716a(VoiceVirtualNineDeputyWidgetView voiceVirtualNineDeputyWidgetView, View view) {
        voiceVirtualNineDeputyWidgetView.f53113f = (VoiceVirtualNineDeputyWidgetView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualNineDeputyWidgetView.f53114g = (VoiceVirtualNineDeputyItemView) viewGroup.getChildAt(0);
        voiceVirtualNineDeputyWidgetView.f53115h = (LinearLayout) viewGroup.getChildAt(1);
        voiceVirtualNineDeputyWidgetView.f53116i = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceVirtualNineDeputyWidgetView.f53117j = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        voiceVirtualNineDeputyWidgetView.f53118k = (LinearLayout) viewGroup.getChildAt(2);
        voiceVirtualNineDeputyWidgetView.f53119l = (VoiceVirtualNineDeputyItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        voiceVirtualNineDeputyWidgetView.f53120m = (VoiceVirtualNineDeputyItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        voiceVirtualNineDeputyWidgetView.f53121n = (VoiceVirtualNineDeputyItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        voiceVirtualNineDeputyWidgetView.f53122o = (VoiceVirtualNineDeputyItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        voiceVirtualNineDeputyWidgetView.f53123p = (LinearLayout) viewGroup.getChildAt(3);
        voiceVirtualNineDeputyWidgetView.f53124q = (VoiceVirtualNineDeputyItemView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        voiceVirtualNineDeputyWidgetView.f53125r = (VoiceVirtualNineDeputyItemView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        voiceVirtualNineDeputyWidgetView.f53126s = (VoiceVirtualNineDeputyItemView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        voiceVirtualNineDeputyWidgetView.f53127t = (VoiceVirtualNineDeputyItemView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m97717b(VoiceVirtualNineDeputyWidgetView voiceVirtualNineDeputyWidgetView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198954Va, viewGroup, false);
        m97716a(voiceVirtualNineDeputyWidgetView, viewInflate);
        return viewInflate;
    }
}
