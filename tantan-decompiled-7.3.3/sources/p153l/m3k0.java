package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.settings.log.UploadLogAct;
import p151v.VProgressBar;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class m3k0 {
    /* JADX INFO: renamed from: a */
    public static void m156932a(UploadLogAct uploadLogAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        uploadLogAct.f37159c = (VProgressBar) viewGroup.getChildAt(1);
        uploadLogAct.f37160d = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m156933b(UploadLogAct uploadLogAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126023qf, viewGroup, false);
        m156932a(uploadLogAct, viewInflate);
        return viewInflate;
    }
}
