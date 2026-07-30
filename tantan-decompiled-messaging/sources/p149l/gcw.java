package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.emoji.VEditTextEmojiCompat;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class gcw {
    /* JADX INFO: renamed from: a */
    public static void m125525a(fcw fcwVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fcwVar.f96855a = (FrameLayout) viewGroup.getChildAt(0);
        fcwVar.f96856b = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fcwVar.f96857c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        fcwVar.f96858d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        fcwVar.f96859e = (LinearLayout) viewGroup.getChildAt(1);
        fcwVar.f96860f = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        fcwVar.f96861g = (VEditTextEmojiCompat) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        fcwVar.f96862h = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        fcwVar.f96863i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        fcwVar.f96864j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m125526b(fcw fcwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95289B6, viewGroup, false);
        m125525a(fcwVar, viewInflate);
        return viewInflate;
    }
}
