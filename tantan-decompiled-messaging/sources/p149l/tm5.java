package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.feed.newui.mediapicker.CompactMediaPickerAct;

/* JADX INFO: loaded from: classes12.dex */
public class tm5 {
    /* JADX INFO: renamed from: a */
    public static void m189639a(CompactMediaPickerAct compactMediaPickerAct, View view) {
        compactMediaPickerAct.f40257l = (FrameLayout) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m189640b(CompactMediaPickerAct compactMediaPickerAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142187f, viewGroup, false);
        m189639a(compactMediaPickerAct, viewInflate);
        return viewInflate;
    }
}
