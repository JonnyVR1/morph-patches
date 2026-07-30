package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.vip.likers.LikersDialogView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class kir {
    /* JADX INFO: renamed from: a */
    public static void m7601a(LikersDialogView likersDialogView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likersDialogView.a = viewGroup.getChildAt(0);
        likersDialogView.b = (ImageView) viewGroup.getChildAt(1);
        likersDialogView.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        likersDialogView.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        likersDialogView.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        likersDialogView.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        likersDialogView.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        likersDialogView.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        likersDialogView.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        likersDialogView.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        likersDialogView.k = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(0);
        likersDialogView.l = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        likersDialogView.m = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        likersDialogView.n = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        likersDialogView.o = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
    }
}
