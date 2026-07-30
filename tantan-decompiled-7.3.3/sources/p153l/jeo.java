package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.intl.common.IntlMediaNoticeSettingView;
import p151v.VFrame;

/* JADX INFO: loaded from: classes9.dex */
public class jeo {
    /* JADX INFO: renamed from: a */
    public static void m144602a(IntlMediaNoticeSettingView intlMediaNoticeSettingView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlMediaNoticeSettingView._live_notice = (VFrame) viewGroup.getChildAt(0);
        intlMediaNoticeSettingView._voice_notice = (VFrame) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m144603b(IntlMediaNoticeSettingView intlMediaNoticeSettingView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193805O, viewGroup, true);
        m144602a(intlMediaNoticeSettingView, viewInflate);
        return viewInflate;
    }
}
