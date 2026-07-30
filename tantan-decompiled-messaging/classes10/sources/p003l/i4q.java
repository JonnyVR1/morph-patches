package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.greet.ItemGreetGuidePic;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class i4q {
    /* JADX INFO: renamed from: a */
    public static void m7127a(ItemGreetGuidePic itemGreetGuidePic, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        itemGreetGuidePic.f1829a = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemGreetGuidePic.f1830b = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemGreetGuidePic.f1831c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
