package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.state.CoreAutoScrollView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class c07 {
    /* JADX INFO: renamed from: a */
    public static void m107371a(CoreAutoScrollView coreAutoScrollView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        coreAutoScrollView.f26397a = (ConstraintLayout) viewGroup.getChildAt(0);
        coreAutoScrollView.f26398b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        coreAutoScrollView.f26399c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        coreAutoScrollView.f26400d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        coreAutoScrollView.f26401e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        coreAutoScrollView.f26402f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        coreAutoScrollView.f26403g = (ConstraintLayout) viewGroup.getChildAt(1);
        coreAutoScrollView.f26404h = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        coreAutoScrollView.f26405i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        coreAutoScrollView.f26406j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        coreAutoScrollView.f26407k = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        coreAutoScrollView.f26408l = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
