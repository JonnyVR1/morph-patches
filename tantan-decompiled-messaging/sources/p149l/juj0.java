package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.settings.log.UploadLogAct;
import p147v.VProgressBar;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class juj0 {
    /* JADX INFO: renamed from: a */
    public static void m143317a(UploadLogAct uploadLogAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        uploadLogAct.f36311c = (VProgressBar) viewGroup.getChildAt(1);
        uploadLogAct.f36312d = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m143318b(UploadLogAct uploadLogAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95850jf, viewGroup, false);
        m143317a(uploadLogAct, viewInflate);
        return viewInflate;
    }
}
