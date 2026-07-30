package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class lpp {
    /* JADX INFO: renamed from: a */
    public static void m150898a(kpp kppVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        kppVar.f124181x = viewGroup.getChildAt(0);
        kppVar.f124182y = (FrameLayout) viewGroup.getChildAt(1);
        kppVar.f124183z = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        kppVar.f124179A = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        kppVar.f124180B = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
