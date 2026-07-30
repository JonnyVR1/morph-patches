package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.emoji.VEditTextEmojiCompat;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hl6 {
    /* JADX INFO: renamed from: a */
    public static void m135694a(gl6 gl6Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gl6Var.f104797a = (FrameLayout) viewGroup.getChildAt(0);
        gl6Var.f104798b = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        gl6Var.f104799c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        gl6Var.f104800d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        gl6Var.f104801e = (LinearLayout) viewGroup.getChildAt(1);
        gl6Var.f104802f = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        gl6Var.f104803g = (VEditTextEmojiCompat) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        gl6Var.f104804h = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        gl6Var.f104805i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        gl6Var.f104806j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m135695b(gl6 gl6Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125706Y1, viewGroup, false);
        m135694a(gl6Var, viewInflate);
        return viewInflate;
    }
}
