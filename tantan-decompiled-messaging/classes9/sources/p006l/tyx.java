package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.p002ui.accountai.new2021.view.MediaView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class tyx {
    /* JADX INFO: renamed from: a */
    public static void m24866a(MediaView mediaView, View view) {
        mediaView.f396c = ((ViewGroup) view).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m24867b(MediaView mediaView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9422c0, viewGroup, true);
        m24866a(mediaView, viewInflate);
        return viewInflate;
    }
}
