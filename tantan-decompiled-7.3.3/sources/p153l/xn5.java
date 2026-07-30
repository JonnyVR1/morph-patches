package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.feed.newui.mediapicker.CompactMediaPickerAct;

/* JADX INFO: loaded from: classes13.dex */
public class xn5 {
    /* JADX INFO: renamed from: a */
    public static void m212092a(CompactMediaPickerAct compactMediaPickerAct, View view) {
        compactMediaPickerAct.f41105l = (FrameLayout) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m212093b(CompactMediaPickerAct compactMediaPickerAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173656f, viewGroup, false);
        m212092a(compactMediaPickerAct, viewInflate);
        return viewInflate;
    }
}
