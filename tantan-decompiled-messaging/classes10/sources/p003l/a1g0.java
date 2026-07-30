package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.campus.StudentCardPreviewAct;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class a1g0 {
    /* JADX INFO: renamed from: a */
    public static void m5269a(StudentCardPreviewAct studentCardPreviewAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        studentCardPreviewAct.f1053c = viewGroup.getChildAt(0);
        studentCardPreviewAct.f1054d = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m5270b(StudentCardPreviewAct studentCardPreviewAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.ue, viewGroup, false);
        m5269a(studentCardPreviewAct, viewInflate);
        return viewInflate;
    }
}
