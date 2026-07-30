package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.constellationmatch.C3084a;
import com.p000p1.mobile.putong.core.p001ui.constellationmatch.ConstellationCard;
import com.p000p1.mobile.putong.core.p001ui.constellationmatch.ConstellationView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ty5 {
    /* JADX INFO: renamed from: a */
    public static void m9635a(C3084a c3084a, View view) {
        c3084a._root_layout = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c3084a._body = viewGroup.getChildAt(0);
        c3084a._title = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        c3084a._close = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        c3084a._reading = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        c3084a._reading_instruction = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        c3084a._space = (Space) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        c3084a._image = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        c3084a._hide_card = (ConstellationCard) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        c3084a._tarot_layout = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        c3084a._lineView = (ConstellationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        c3084a._slide_text = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
    }
}
