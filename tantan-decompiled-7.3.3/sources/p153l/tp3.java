package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzNoFaceTipView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class tp3 {
    /* JADX INFO: renamed from: a */
    public static void m192116a(BuzzNoFaceTipView buzzNoFaceTipView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        buzzNoFaceTipView._no_face_title = (VText) viewGroup.getChildAt(0);
        buzzNoFaceTipView._no_face_content = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m192117b(BuzzNoFaceTipView buzzNoFaceTipView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(mec0.f136484s, viewGroup, true);
        m192116a(buzzNoFaceTipView, viewInflate);
        return viewInflate;
    }
}
