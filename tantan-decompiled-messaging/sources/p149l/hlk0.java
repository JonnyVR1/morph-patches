package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.VChatBeautyFilterView;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.TextSeekBar;
import p147v.VLinear;
import p147v.VPagerNoPage;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class hlk0 {
    /* JADX INFO: renamed from: a */
    public static void m131676a(VChatBeautyFilterView vChatBeautyFilterView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vChatBeautyFilterView.f45469a = (OnFlingFrameLayout) viewGroup.getChildAt(0);
        vChatBeautyFilterView.f45470b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        vChatBeautyFilterView.f45471c = (VRelative) viewGroup.getChildAt(1);
        vChatBeautyFilterView.f45472d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        vChatBeautyFilterView.f45473e = (TextSeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        vChatBeautyFilterView.f45474f = (VRelative) viewGroup.getChildAt(2);
        vChatBeautyFilterView.f45475g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        vChatBeautyFilterView.f45476h = (TextSeekBar) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        vChatBeautyFilterView.f45477i = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        vChatBeautyFilterView.f45478j = (ContrastView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        vChatBeautyFilterView.f45479k = (TabLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        vChatBeautyFilterView.f45480l = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        vChatBeautyFilterView.f45481m = (VPagerNoPage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
    }
}
