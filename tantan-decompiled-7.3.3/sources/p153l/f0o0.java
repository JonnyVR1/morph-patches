package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.liveend.VoiceEndFireProgressView;
import p151v.VDraweeView;
import p151v.VPagerNoPage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class f0o0 {
    /* JADX INFO: renamed from: a */
    public static void m123500a(e0o0 e0o0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        e0o0Var.f91515b = (FrameLayout) viewGroup.getChildAt(0);
        e0o0Var.f91516c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        e0o0Var.f91517d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        e0o0Var.f91518e = (VDraweeView) viewGroup.getChildAt(1);
        e0o0Var.f91519f = (TextView) viewGroup.getChildAt(2);
        e0o0Var.f91520g = (ConstraintLayout) viewGroup.getChildAt(3);
        e0o0Var.f91521h = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        e0o0Var.f91522i = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        e0o0Var.f91523j = (FrameLayout) viewGroup.getChildAt(4);
        e0o0Var.f91524k = (ImageView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        e0o0Var.f91525l = (LinearLayout) viewGroup.getChildAt(5);
        e0o0Var.f91526m = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(0);
        e0o0Var.f91527n = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(1);
        e0o0Var.f91528o = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(2);
        e0o0Var.f91529p = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2)).getChildAt(1);
        e0o0Var.f91530q = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2)).getChildAt(2);
        e0o0Var.f91531r = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3)).getChildAt(0);
        e0o0Var.f91532s = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3)).getChildAt(1);
        e0o0Var.f91533t = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3)).getChildAt(2);
        e0o0Var.f91534u = (RelativeLayout) viewGroup.getChildAt(6);
        e0o0Var.f91535v = (TextView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        e0o0Var.f91536w = (VoiceEndFireProgressView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(3);
        e0o0Var.f91537x = (LinearLayout) viewGroup.getChildAt(7);
        e0o0Var.f91538y = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        e0o0Var.f91539z = (LinearLayout) viewGroup.getChildAt(8);
        e0o0Var.f91511A = (TabLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(0);
        e0o0Var.f91512B = (VPagerNoPage) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1);
        e0o0Var.f91513C = (LinearLayout) viewGroup.getChildAt(9);
        e0o0Var.f91514D = (FrameLayout) viewGroup.getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m123501b(e0o0 e0o0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199104h9, viewGroup, false);
        m123500a(e0o0Var, viewInflate);
        return viewInflate;
    }
}
