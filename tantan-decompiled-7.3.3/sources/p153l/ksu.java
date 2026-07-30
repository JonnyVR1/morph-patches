package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VEditText;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class ksu {
    /* JADX INFO: renamed from: a */
    public static void m151283a(isu isuVar, View view) {
        isuVar.f116718a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        isuVar.f116719b = viewGroup.getChildAt(0);
        isuVar.f116720c = (LinearLayout) viewGroup.getChildAt(1);
        isuVar.f116721d = (VEditText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        isuVar.f116722e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
