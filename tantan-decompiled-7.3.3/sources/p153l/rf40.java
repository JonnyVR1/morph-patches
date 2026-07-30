package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.profile.newme.NewPrivilegeCard;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class rf40 {
    /* JADX INFO: renamed from: a */
    public static void m181167a(NewPrivilegeCard newPrivilegeCard, View view) {
        newPrivilegeCard._card_layout = (NewPrivilegeCard) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newPrivilegeCard._privilege_bg = (VDraweeView) viewGroup.getChildAt(0);
        newPrivilegeCard._title_res = (VDraweeView) viewGroup.getChildAt(1);
        newPrivilegeCard._bg_res = (VDraweeView) viewGroup.getChildAt(2);
        newPrivilegeCard._buy_layout = (FrameLayout) viewGroup.getChildAt(3);
        newPrivilegeCard._buy = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        newPrivilegeCard._free = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        newPrivilegeCard._desc = (VText) viewGroup.getChildAt(4);
        newPrivilegeCard._privilege_svga = (SVGAnimationView) viewGroup.getChildAt(5);
        newPrivilegeCard._privilege_icon = (VDraweeView) viewGroup.getChildAt(6);
        newPrivilegeCard._upgrade_tag = (VText) viewGroup.getChildAt(7);
    }
}
