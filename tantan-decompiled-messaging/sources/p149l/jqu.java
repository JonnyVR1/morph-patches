package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VEditText;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class jqu {
    /* JADX INFO: renamed from: a */
    public static void m142852a(hqu hquVar, View view) {
        hquVar.f109119a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hquVar.f109120b = viewGroup.getChildAt(0);
        hquVar.f109121c = (LinearLayout) viewGroup.getChildAt(1);
        hquVar.f109122d = (VEditText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        hquVar.f109123e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
