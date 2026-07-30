package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.base.view.LiveEmptyView;
import p147v.VImage;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class bp70 {
    /* JADX INFO: renamed from: a */
    public static void m103042a(ap70 ap70Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ap70Var.f70984i = viewGroup.getChildAt(0);
        ap70Var.f70985j = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ap70Var.f70986k = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        ap70Var.f70987l = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        ap70Var.f70988m = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        ap70Var.f70989n = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        ap70Var.f70990o = (TabLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        ap70Var.f70991p = (ViewPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4);
        ap70Var.f70992q = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ap70Var.f70993r = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        ap70Var.f70994s = (EditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        ap70Var.f70995t = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        ap70Var.f70996u = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        ap70Var.f70997v = (VRecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        ap70Var.f70998w = (LiveEmptyView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m103043b(ap70 ap70Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168204U4, viewGroup, false);
        m103042a(ap70Var, viewInflate);
        return viewInflate;
    }
}
