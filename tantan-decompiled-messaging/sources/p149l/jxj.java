package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftUserInfoOfficialView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class jxj {
    /* JADX INFO: renamed from: a */
    public static void m143808a(GiftUserInfoOfficialView giftUserInfoOfficialView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftUserInfoOfficialView._avatar = (VDraweeView) viewGroup.getChildAt(0);
        giftUserInfoOfficialView._tv_name = (VText) viewGroup.getChildAt(1);
        giftUserInfoOfficialView._button = (VText) viewGroup.getChildAt(2);
    }
}
