package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.tarot.C9080a;
import com.p051p1.mobile.putong.core.p058ui.tarot.LineView;
import com.p051p1.mobile.putong.core.p058ui.tarot.TarotListView;
import p151v.VButton;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ani0 {
    /* JADX INFO: renamed from: a */
    public static void m98983a(C9080a c9080a, View view) {
        c9080a._root_layout = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c9080a._tarot_body = (ConstraintLayout) viewGroup.getChildAt(0);
        c9080a._title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        c9080a._close = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        c9080a._reading = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        c9080a._reading_instruction = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        c9080a._image = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        c9080a._hide_card = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        c9080a._tarot_layout = (TarotListView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        c9080a._lineView = (LineView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        c9080a._slide_text = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
    }
}
