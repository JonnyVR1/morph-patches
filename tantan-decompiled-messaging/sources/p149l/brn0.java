package p149l;

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
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.liveend.VoiceEndFireProgressView;
import p147v.VDraweeView;
import p147v.VPagerNoPage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class brn0 {
    /* JADX INFO: renamed from: a */
    public static void m103559a(arn0 arn0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        arn0Var.f71307b = (FrameLayout) viewGroup.getChildAt(0);
        arn0Var.f71308c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        arn0Var.f71309d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        arn0Var.f71310e = (VDraweeView) viewGroup.getChildAt(1);
        arn0Var.f71311f = (TextView) viewGroup.getChildAt(2);
        arn0Var.f71312g = (ConstraintLayout) viewGroup.getChildAt(3);
        arn0Var.f71313h = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        arn0Var.f71314i = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        arn0Var.f71315j = (FrameLayout) viewGroup.getChildAt(4);
        arn0Var.f71316k = (ImageView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        arn0Var.f71317l = (LinearLayout) viewGroup.getChildAt(5);
        arn0Var.f71318m = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(0);
        arn0Var.f71319n = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(1);
        arn0Var.f71320o = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(2);
        arn0Var.f71321p = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2)).getChildAt(1);
        arn0Var.f71322q = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2)).getChildAt(2);
        arn0Var.f71323r = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3)).getChildAt(0);
        arn0Var.f71324s = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3)).getChildAt(1);
        arn0Var.f71325t = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3)).getChildAt(2);
        arn0Var.f71326u = (RelativeLayout) viewGroup.getChildAt(6);
        arn0Var.f71327v = (TextView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        arn0Var.f71328w = (VoiceEndFireProgressView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(3);
        arn0Var.f71329x = (LinearLayout) viewGroup.getChildAt(7);
        arn0Var.f71330y = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        arn0Var.f71331z = (LinearLayout) viewGroup.getChildAt(8);
        arn0Var.f71303A = (TabLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(0);
        arn0Var.f71304B = (VPagerNoPage) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1);
        arn0Var.f71305C = (LinearLayout) viewGroup.getChildAt(9);
        arn0Var.f71306D = (FrameLayout) viewGroup.getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m103560b(arn0 arn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168372h9, viewGroup, false);
        m103559a(arn0Var, viewInflate);
        return viewInflate;
    }
}
