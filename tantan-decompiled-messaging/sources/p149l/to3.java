package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.BuzzNoFaceTipView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class to3 {
    /* JADX INFO: renamed from: a */
    public static void m189841a(BuzzNoFaceTipView buzzNoFaceTipView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        buzzNoFaceTipView._no_face_title = (VText) viewGroup.getChildAt(0);
        buzzNoFaceTipView._no_face_content = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m189842b(BuzzNoFaceTipView buzzNoFaceTipView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.f106042s, viewGroup, true);
        m189841a(buzzNoFaceTipView, viewInflate);
        return viewInflate;
    }
}
