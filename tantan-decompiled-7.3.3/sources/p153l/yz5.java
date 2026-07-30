package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.constellationmatch.C8472a;
import com.p051p1.mobile.putong.core.p058ui.constellationmatch.ConstellationCard;
import com.p051p1.mobile.putong.core.p058ui.constellationmatch.ConstellationView;
import com.p051p1.mobile.putong.core.p058ui.tarot.TarotListView;
import p151v.VButton;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class yz5 {
    /* JADX INFO: renamed from: a */
    public static void m218009a(C8472a c8472a, View view) {
        c8472a._root_layout = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c8472a._body = (ConstraintLayout) viewGroup.getChildAt(0);
        c8472a._title = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        c8472a._close = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        c8472a._reading = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        c8472a._reading_instruction = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        c8472a._space = (Space) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        c8472a._image = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        c8472a._hide_card = (ConstellationCard) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        c8472a._tarot_layout = (TarotListView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        c8472a._lineView = (ConstellationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        c8472a._slide_text = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
    }
}
