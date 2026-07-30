package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import com.p051p1.mobile.putong.live.base.view.XEGiftView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftEquipView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class w1k0 {
    /* JADX INFO: renamed from: a */
    public static void m204443a(UpgradeGiftEquipView upgradeGiftEquipView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        upgradeGiftEquipView.f51064d = (MomoLayUpSVGAImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        upgradeGiftEquipView.f51065e = (XEGiftView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        upgradeGiftEquipView.f51066f = viewGroup.getChildAt(1);
        upgradeGiftEquipView.f51067g = (TextView) viewGroup.getChildAt(2);
        upgradeGiftEquipView.f51068h = viewGroup.getChildAt(3);
        upgradeGiftEquipView.f51069i = (VDraweeView) viewGroup.getChildAt(4);
        upgradeGiftEquipView.f51070j = (VDraweeView) viewGroup.getChildAt(5);
        upgradeGiftEquipView.f51071k = (TextView) viewGroup.getChildAt(6);
        upgradeGiftEquipView.f51072l = (LinearLayout) viewGroup.getChildAt(7);
        upgradeGiftEquipView.f51073m = (TextView) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        upgradeGiftEquipView.f51074n = (TextView) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
    }
}
