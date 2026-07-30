package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.newui.profile.AudioSignatureCardPlayView;
import com.sunshine.engine.particle.SceneView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jd1 {
    /* JADX INFO: renamed from: a */
    public static void m144402a(AudioSignatureCardPlayView audioSignatureCardPlayView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        audioSignatureCardPlayView.f27185d = (LinearLayout) viewGroup.getChildAt(0);
        audioSignatureCardPlayView.f27186e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        audioSignatureCardPlayView.f27187f = (SceneView) viewGroup.getChildAt(1);
        audioSignatureCardPlayView.f27188g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        audioSignatureCardPlayView.f27189h = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
