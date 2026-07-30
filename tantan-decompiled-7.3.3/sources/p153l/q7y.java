package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.account.p055ui.accountai.new2021.view.MediaView;
import p151v.VButton_FakeShadow;

/* JADX INFO: loaded from: classes9.dex */
public class q7y {
    /* JADX INFO: renamed from: a */
    public static void m175713a(MediaView mediaView, View view) {
        mediaView.f17126c = (VButton_FakeShadow) ((ViewGroup) view).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m175714b(MediaView mediaView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109104c0, viewGroup, true);
        m175713a(mediaView, viewInflate);
        return viewInflate;
    }
}
