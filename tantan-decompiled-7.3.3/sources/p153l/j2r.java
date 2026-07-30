package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvAlreadyChooseSongItem;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class j2r {
    /* JADX INFO: renamed from: a */
    public static void m143240a(KtvAlreadyChooseSongItem ktvAlreadyChooseSongItem, View view) {
        ktvAlreadyChooseSongItem.f53213d = (KtvAlreadyChooseSongItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ktvAlreadyChooseSongItem.f53214e = (AnimEffectPlayer) viewGroup.getChildAt(0);
        ktvAlreadyChooseSongItem.f53215f = (VText) viewGroup.getChildAt(1);
        ktvAlreadyChooseSongItem.f53216g = (VDraweeView) viewGroup.getChildAt(2);
        ktvAlreadyChooseSongItem.f53217h = (VText) viewGroup.getChildAt(3);
        ktvAlreadyChooseSongItem.f53218i = (VDraweeView) viewGroup.getChildAt(4);
        ktvAlreadyChooseSongItem.f53219j = (VText) viewGroup.getChildAt(5);
        ktvAlreadyChooseSongItem.f53220k = (VImage) viewGroup.getChildAt(6);
        ktvAlreadyChooseSongItem.f53221l = (VImage) viewGroup.getChildAt(7);
    }
}
