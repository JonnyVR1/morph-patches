package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.p002ui.accountai.new2021.view.ChannelRegisterView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class sr4 {
    /* JADX INFO: renamed from: a */
    public static void m24128a(ChannelRegisterView channelRegisterView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        channelRegisterView.f385c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        channelRegisterView.f386d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m24129b(ChannelRegisterView channelRegisterView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9418a0, viewGroup, true);
        m24128a(channelRegisterView, viewInflate);
        return viewInflate;
    }
}
