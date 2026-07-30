package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.intl.common.IntlMediaNoticeSettingView;
import p147v.VFrame;

/* JADX INFO: loaded from: classes13.dex */
public class jco {
    /* JADX INFO: renamed from: a */
    public static void m140989a(IntlMediaNoticeSettingView intlMediaNoticeSettingView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlMediaNoticeSettingView._live_notice = (VFrame) viewGroup.getChildAt(0);
        intlMediaNoticeSettingView._voice_notice = (VFrame) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m140990b(IntlMediaNoticeSettingView intlMediaNoticeSettingView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162691O, viewGroup, true);
        m140989a(intlMediaNoticeSettingView, viewInflate);
        return viewInflate;
    }
}
