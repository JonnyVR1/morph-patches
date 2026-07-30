package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.lovebuzz.widget.BuzzNotifySettingView;
import l.h6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ap3 {
    /* JADX INFO: renamed from: a */
    public static void m5494a(BuzzNotifySettingView buzzNotifySettingView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        buzzNotifySettingView.a = viewGroup.getChildAt(0);
        buzzNotifySettingView.b = viewGroup.getChildAt(1);
        buzzNotifySettingView.c = viewGroup.getChildAt(2);
        buzzNotifySettingView.d = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m5495b(BuzzNotifySettingView buzzNotifySettingView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.u, viewGroup, true);
        m5494a(buzzNotifySettingView, viewInflate);
        return viewInflate;
    }
}
