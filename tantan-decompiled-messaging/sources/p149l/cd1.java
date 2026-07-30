package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.newui.profile.AudioSignatureCardPlayView;
import com.sunshine.engine.particle.SceneView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cd1 {
    /* JADX INFO: renamed from: a */
    public static void m106212a(AudioSignatureCardPlayView audioSignatureCardPlayView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        audioSignatureCardPlayView.f26443d = (LinearLayout) viewGroup.getChildAt(0);
        audioSignatureCardPlayView.f26444e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        audioSignatureCardPlayView.f26445f = (SceneView) viewGroup.getChildAt(1);
        audioSignatureCardPlayView.f26446g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        audioSignatureCardPlayView.f26447h = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
