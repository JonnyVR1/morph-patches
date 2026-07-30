package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.tarot.TarotInfoView;
import l.u4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pdi0 {
    /* JADX INFO: renamed from: a */
    public static void m8734a(TarotInfoView tarotInfoView, View view) {
        tarotInfoView.c = ((ViewGroup) view).getChildAt(0);
        tarotInfoView.d = view.findViewById(u4c0.L5);
        ViewGroup viewGroup = (ViewGroup) view;
        tarotInfoView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        tarotInfoView.f = (Space) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        tarotInfoView.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        tarotInfoView.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        tarotInfoView.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        tarotInfoView.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        tarotInfoView.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        tarotInfoView.l = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(2);
        tarotInfoView.m = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(2)).getChildAt(0);
        tarotInfoView.n = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(2)).getChildAt(1);
        tarotInfoView.o = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(2)).getChildAt(2);
        tarotInfoView.p = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(3);
        tarotInfoView.q = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(3)).getChildAt(0);
        tarotInfoView.r = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(3)).getChildAt(1);
        tarotInfoView.s = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(3)).getChildAt(2);
        tarotInfoView.t = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(4);
        tarotInfoView.u = (LinearLayout) viewGroup.getChildAt(1);
        tarotInfoView.v = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        tarotInfoView.w = (ViewStub) viewGroup.getChildAt(2);
        tarotInfoView.x = (ViewStub) viewGroup.getChildAt(3);
    }
}
