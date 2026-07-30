package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.p058ui.main.ConversationView;
import com.p051p1.mobile.putong.core.p058ui.view.GradientBgButton;
import p151v.TickerView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class tm6 {
    /* JADX INFO: renamed from: a */
    public static void m191722a(ConversationView conversationView, View view) {
        conversationView.f31140a = (ConversationView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationView.f31141b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationView.f31142c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationView.f31143d = (TickerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        conversationView.f31144e = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        conversationView.f31145f = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        conversationView.f31146g = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        conversationView.f31147h = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        conversationView.f31148i = (GradientBgButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        conversationView.f31149j = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        conversationView.f31150k = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
        conversationView.f31151l = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        conversationView.f31152m = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        conversationView.f31153n = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        conversationView.f31154o = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationView.f31155p = (VText) viewGroup.getChildAt(2);
    }
}
