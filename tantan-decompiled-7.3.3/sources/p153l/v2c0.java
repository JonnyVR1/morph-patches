package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.ImpressSignalConversationHeadView;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatBgTopView;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderUserView;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class v2c0 {
    /* JADX INFO: renamed from: a */
    public static void m199128a(QuickChatHeaderView quickChatHeaderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        quickChatHeaderView._svga_id = (SVGAnimationView) viewGroup.getChildAt(0);
        quickChatHeaderView._svga_love = (SVGAnimationView) viewGroup.getChildAt(1);
        quickChatHeaderView._svga_loading = (SVGAnimationView) viewGroup.getChildAt(2);
        quickChatHeaderView._bg_border = (QuickChatBgTopView) viewGroup.getChildAt(3);
        quickChatHeaderView._love = (VImage) viewGroup.getChildAt(4);
        quickChatHeaderView._text = (VText) viewGroup.getChildAt(5);
        quickChatHeaderView._getuser_layout = (QuickChatHeaderUserView) viewGroup.getChildAt(6);
        quickChatHeaderView._impress_signal_layout = (ImpressSignalConversationHeadView) viewGroup.getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m199129b(QuickChatHeaderView quickChatHeaderView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125327Ab, viewGroup, true);
        m199128a(quickChatHeaderView, viewInflate);
        return viewInflate;
    }
}
