package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.UnScrollVPager;
import l.qsn0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rsn0 {
    /* JADX INFO: renamed from: a */
    public static void m22121a(qsn0 qsn0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qsn0Var.a = viewGroup.getChildAt(0);
        qsn0Var.b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        qsn0Var.c = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        qsn0Var.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        qsn0Var.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        qsn0Var.f = (UnScrollVPager) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m22122b(qsn0 qsn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20050v9, viewGroup, false);
        m22121a(qsn0Var, viewInflate);
        return viewInflate;
    }
}
