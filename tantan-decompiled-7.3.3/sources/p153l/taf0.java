package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.signin.main.SignInAnimItem;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class taf0 {
    /* JADX INFO: renamed from: a */
    public static void m189856a(SignInAnimItem signInAnimItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        signInAnimItem.f50140a = (VImage) viewGroup.getChildAt(0);
        signInAnimItem.f50141b = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        signInAnimItem.f50142c = (VDraweeView) viewGroup.getChildAt(2);
    }
}
