package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftUserInfoOfficialView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class zzj {
    /* JADX INFO: renamed from: a */
    public static void m222258a(GiftUserInfoOfficialView giftUserInfoOfficialView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftUserInfoOfficialView._avatar = (VDraweeView) viewGroup.getChildAt(0);
        giftUserInfoOfficialView._tv_name = (VText) viewGroup.getChildAt(1);
        giftUserInfoOfficialView._button = (VText) viewGroup.getChildAt(2);
    }
}
