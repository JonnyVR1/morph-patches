package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.tarot.C8917a;
import com.p046p1.mobile.putong.core.p053ui.tarot.LineView;
import com.p046p1.mobile.putong.core.p053ui.tarot.TarotListView;
import p147v.VButton;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class aei0 {
    /* JADX INFO: renamed from: a */
    public static void m96108a(C8917a c8917a, View view) {
        c8917a._root_layout = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c8917a._tarot_body = (ConstraintLayout) viewGroup.getChildAt(0);
        c8917a._title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        c8917a._close = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        c8917a._reading = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        c8917a._reading_instruction = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        c8917a._image = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        c8917a._hide_card = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        c8917a._tarot_layout = (TarotListView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        c8917a._lineView = (LineView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        c8917a._slide_text = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
    }
}
