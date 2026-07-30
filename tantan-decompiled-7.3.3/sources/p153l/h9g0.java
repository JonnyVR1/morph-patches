package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.PhotoPreviewView;
import com.p051p1.mobile.putong.core.p058ui.campus.StudentCardPreviewAct;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class h9g0 {
    /* JADX INFO: renamed from: a */
    public static void m134056a(StudentCardPreviewAct studentCardPreviewAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        studentCardPreviewAct.f29507c = (PhotoPreviewView) viewGroup.getChildAt(0);
        studentCardPreviewAct.f29508d = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m134057b(StudentCardPreviewAct studentCardPreviewAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125347Be, viewGroup, false);
        m134056a(studentCardPreviewAct, viewInflate);
        return viewInflate;
    }
}
