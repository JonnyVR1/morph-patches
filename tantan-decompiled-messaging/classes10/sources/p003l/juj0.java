package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.settings.log.UploadLogAct;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class juj0 {
    /* JADX INFO: renamed from: a */
    public static void m7463a(UploadLogAct uploadLogAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        uploadLogAct.c = viewGroup.getChildAt(1);
        uploadLogAct.d = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m7464b(UploadLogAct uploadLogAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.jf, viewGroup, false);
        m7463a(uploadLogAct, viewInflate);
        return viewInflate;
    }
}
