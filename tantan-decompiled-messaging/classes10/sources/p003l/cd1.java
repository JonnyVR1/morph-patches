package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.newui.profile.AudioSignatureCardPlayView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class cd1 {
    /* JADX INFO: renamed from: a */
    public static void m5930a(AudioSignatureCardPlayView audioSignatureCardPlayView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        audioSignatureCardPlayView.d = (LinearLayout) viewGroup.getChildAt(0);
        audioSignatureCardPlayView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        audioSignatureCardPlayView.f = viewGroup.getChildAt(1);
        audioSignatureCardPlayView.g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        audioSignatureCardPlayView.h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
