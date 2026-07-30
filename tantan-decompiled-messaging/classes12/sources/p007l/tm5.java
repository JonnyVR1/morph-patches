package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.feed.newui.mediapicker.CompactMediaPickerAct;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class tm5 {
    /* JADX INFO: renamed from: a */
    public static void m14567a(CompactMediaPickerAct compactMediaPickerAct, View view) {
        compactMediaPickerAct.f1718l = (FrameLayout) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m14568b(CompactMediaPickerAct compactMediaPickerAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11206f, viewGroup, false);
        m14567a(compactMediaPickerAct, viewInflate);
        return viewInflate;
    }
}
