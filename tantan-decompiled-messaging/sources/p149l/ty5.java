package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.constellationmatch.C8309a;
import com.p046p1.mobile.putong.core.p053ui.constellationmatch.ConstellationCard;
import com.p046p1.mobile.putong.core.p053ui.constellationmatch.ConstellationView;
import com.p046p1.mobile.putong.core.p053ui.tarot.TarotListView;
import p147v.VButton;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ty5 {
    /* JADX INFO: renamed from: a */
    public static void m191002a(C8309a c8309a, View view) {
        c8309a._root_layout = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c8309a._body = (ConstraintLayout) viewGroup.getChildAt(0);
        c8309a._title = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        c8309a._close = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        c8309a._reading = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        c8309a._reading_instruction = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        c8309a._space = (Space) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        c8309a._image = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        c8309a._hide_card = (ConstellationCard) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        c8309a._tarot_layout = (TarotListView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        c8309a._lineView = (ConstellationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        c8309a._slide_text = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
    }
}
