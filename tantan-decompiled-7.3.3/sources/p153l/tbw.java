package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.LoveBuzzWarnView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class tbw {
    /* JADX INFO: renamed from: a */
    public static void m190095a(LoveBuzzWarnView loveBuzzWarnView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        loveBuzzWarnView._pop_title = (VText) viewGroup.getChildAt(0);
        loveBuzzWarnView._pop_content = (VText) viewGroup.getChildAt(1);
        loveBuzzWarnView._pop_confirm = (VText) viewGroup.getChildAt(2);
    }
}
