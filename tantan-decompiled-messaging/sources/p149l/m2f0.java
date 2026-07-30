package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.signin.main.SignInAnimItem;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class m2f0 {
    /* JADX INFO: renamed from: a */
    public static void m152687a(SignInAnimItem signInAnimItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        signInAnimItem.f49292a = (VImage) viewGroup.getChildAt(0);
        signInAnimItem.f49293b = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        signInAnimItem.f49294c = (VDraweeView) viewGroup.getChildAt(2);
    }
}
