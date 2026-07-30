package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.VChatBeautyFilterView;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.TextSeekBar;
import p151v.VLinear;
import p151v.VPagerNoPage;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class nuk0 {
    /* JADX INFO: renamed from: a */
    public static void m164810a(VChatBeautyFilterView vChatBeautyFilterView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vChatBeautyFilterView.f46317a = (OnFlingFrameLayout) viewGroup.getChildAt(0);
        vChatBeautyFilterView.f46318b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        vChatBeautyFilterView.f46319c = (VRelative) viewGroup.getChildAt(1);
        vChatBeautyFilterView.f46320d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        vChatBeautyFilterView.f46321e = (TextSeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        vChatBeautyFilterView.f46322f = (VRelative) viewGroup.getChildAt(2);
        vChatBeautyFilterView.f46323g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        vChatBeautyFilterView.f46324h = (TextSeekBar) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        vChatBeautyFilterView.f46325i = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        vChatBeautyFilterView.f46326j = (ContrastView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        vChatBeautyFilterView.f46327k = (TabLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        vChatBeautyFilterView.f46328l = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        vChatBeautyFilterView.f46329m = (VPagerNoPage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
    }
}
