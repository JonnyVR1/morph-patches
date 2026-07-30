package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import p147v.VFrame;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class lhm {
    /* JADX INFO: renamed from: a */
    public static void m149847a(khm khmVar, View view) {
        khmVar.f123178a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        khmVar.f123179b = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        khmVar.f123180c = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        khmVar.f123181d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        khmVar.f123182e = (PictureView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        khmVar.f123183f = (NewPictureContainerIndicator) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
    }
}
