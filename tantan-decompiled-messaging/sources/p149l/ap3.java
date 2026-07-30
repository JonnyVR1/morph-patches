package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.BuzzNotifySettingView;
import p147v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class ap3 {
    /* JADX INFO: renamed from: a */
    public static void m98026a(BuzzNotifySettingView buzzNotifySettingView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        buzzNotifySettingView._text_buzz_pop = (VFrame) viewGroup.getChildAt(0);
        buzzNotifySettingView._voice_buzz_pop = (VFrame) viewGroup.getChildAt(1);
        buzzNotifySettingView._video_buzz_pop = (VFrame) viewGroup.getChildAt(2);
        buzzNotifySettingView._memoji_buzz_pop = (VFrame) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m98027b(BuzzNotifySettingView buzzNotifySettingView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.f106044u, viewGroup, true);
        m98026a(buzzNotifySettingView, viewInflate);
        return viewInflate;
    }
}
