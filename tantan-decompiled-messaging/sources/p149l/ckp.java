package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import p147v.AutoVDraweeView;
import p147v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class ckp {
    /* JADX INFO: renamed from: a */
    public static void m107424a(bkp bkpVar, View view) {
        bkpVar.f76066a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        bkpVar.f76067b = (AutoVDraweeView) viewGroup.getChildAt(0);
        bkpVar.f76068c = (AutoVDraweeView) viewGroup.getChildAt(1);
        bkpVar.f76069d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        bkpVar.f76070e = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
