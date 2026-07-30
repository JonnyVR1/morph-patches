package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzNotifySettingView;
import p151v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class aq3 {
    /* JADX INFO: renamed from: a */
    public static void m99411a(BuzzNotifySettingView buzzNotifySettingView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        buzzNotifySettingView._text_buzz_pop = (VFrame) viewGroup.getChildAt(0);
        buzzNotifySettingView._voice_buzz_pop = (VFrame) viewGroup.getChildAt(1);
        buzzNotifySettingView._video_buzz_pop = (VFrame) viewGroup.getChildAt(2);
        buzzNotifySettingView._memoji_buzz_pop = (VFrame) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m99412b(BuzzNotifySettingView buzzNotifySettingView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(mec0.f136486u, viewGroup, true);
        m99411a(buzzNotifySettingView, viewInflate);
        return viewInflate;
    }
}
