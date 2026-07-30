package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.account.p055ui.accountai.new2021.view.ChannelRegisterView;
import p151v.VButton;
import p151v.VButton_FakeShadow;

/* JADX INFO: loaded from: classes9.dex */
public class rs4 {
    /* JADX INFO: renamed from: a */
    public static void m182852a(ChannelRegisterView channelRegisterView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        channelRegisterView.f17115c = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        channelRegisterView.f17116d = (VButton_FakeShadow) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m182853b(ChannelRegisterView channelRegisterView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109100a0, viewGroup, true);
        m182852a(channelRegisterView, viewInflate);
        return viewInflate;
    }
}
