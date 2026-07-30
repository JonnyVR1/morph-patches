package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.account.p050ui.accountai.new2021.view.MediaView;
import p147v.VButton_FakeShadow;

/* JADX INFO: loaded from: classes9.dex */
public class tyx {
    /* JADX INFO: renamed from: a */
    public static void m191111a(MediaView mediaView, View view) {
        mediaView.f16407c = (VButton_FakeShadow) ((ViewGroup) view).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m191112b(MediaView mediaView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79492c0, viewGroup, true);
        m191111a(mediaView, viewInflate);
        return viewInflate;
    }
}
