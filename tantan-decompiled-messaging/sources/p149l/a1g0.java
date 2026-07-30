package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.PhotoPreviewView;
import com.p046p1.mobile.putong.core.p053ui.campus.StudentCardPreviewAct;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class a1g0 {
    /* JADX INFO: renamed from: a */
    public static void m94562a(StudentCardPreviewAct studentCardPreviewAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        studentCardPreviewAct.f28659c = (PhotoPreviewView) viewGroup.getChildAt(0);
        studentCardPreviewAct.f28660d = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m94563b(StudentCardPreviewAct studentCardPreviewAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96036ue, viewGroup, false);
        m94562a(studentCardPreviewAct, viewInflate);
        return viewInflate;
    }
}
