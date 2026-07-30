package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.greet.ItemGreetGuidePic;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class i6q {
    /* JADX INFO: renamed from: a */
    public static void m138839a(ItemGreetGuidePic itemGreetGuidePic, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        itemGreetGuidePic.f30283a = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemGreetGuidePic.f30284b = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemGreetGuidePic.f30285c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
