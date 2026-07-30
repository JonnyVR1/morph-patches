package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvAlreadyChooseSongItem;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class i0r {
    /* JADX INFO: renamed from: a */
    public static void m133903a(KtvAlreadyChooseSongItem ktvAlreadyChooseSongItem, View view) {
        ktvAlreadyChooseSongItem.f52365d = (KtvAlreadyChooseSongItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ktvAlreadyChooseSongItem.f52366e = (AnimEffectPlayer) viewGroup.getChildAt(0);
        ktvAlreadyChooseSongItem.f52367f = (VText) viewGroup.getChildAt(1);
        ktvAlreadyChooseSongItem.f52368g = (VDraweeView) viewGroup.getChildAt(2);
        ktvAlreadyChooseSongItem.f52369h = (VText) viewGroup.getChildAt(3);
        ktvAlreadyChooseSongItem.f52370i = (VDraweeView) viewGroup.getChildAt(4);
        ktvAlreadyChooseSongItem.f52371j = (VText) viewGroup.getChildAt(5);
        ktvAlreadyChooseSongItem.f52372k = (VImage) viewGroup.getChildAt(6);
        ktvAlreadyChooseSongItem.f52373l = (VImage) viewGroup.getChildAt(7);
    }
}
