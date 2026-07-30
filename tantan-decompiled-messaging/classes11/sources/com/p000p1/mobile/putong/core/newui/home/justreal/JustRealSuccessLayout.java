package com.p000p1.mobile.putong.core.newui.home.justreal;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p1.mobile.putong.core.ui.VText_Default_Bold;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import l.qib0;
import l.vwb;
import l.xdl0;
import l.zsq;
import p009l.i0g0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class JustRealSuccessLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public SimpleDraweeView f1991a;

    /* JADX INFO: renamed from: b */
    public SimpleDraweeView f1992b;

    /* JADX INFO: renamed from: c */
    public SimpleDraweeView f1993c;

    /* JADX INFO: renamed from: d */
    public VImage f1994d;

    /* JADX INFO: renamed from: e */
    public VText_Default_Bold f1995e;

    /* JADX INFO: renamed from: f */
    public List<SimpleDraweeView> f1996f;

    public JustRealSuccessLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m2704a(View view) {
        zsq.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m2705b(List<User> list) {
        xdl0.M(this.f1991a, false);
        xdl0.M(this.f1992b, false);
        xdl0.M(this.f1993c, false);
        int iMin = Math.min(list.size(), this.f1996f.size());
        for (int i = 0; i < iMin; i++) {
            SimpleDraweeView simpleDraweeView = this.f1996f.get(i);
            xdl0.M(simpleDraweeView, true);
            qib0.G.L0(simpleDraweeView, list.get(i).fp().profileMiddle().formatted());
        }
        String strValueOf = String.valueOf(list.size());
        this.f1995e.setText(i0g0.m16129b0("已给你右滑的" + strValueOf + "人发送了喜欢", vwb.f0(new String[]{strValueOf}), -1245184, Typeface.DEFAULT));
    }

    /* JADX INFO: renamed from: c */
    public void m2706c(List<String> list, int i) {
        xdl0.M(this.f1991a, false);
        xdl0.M(this.f1992b, false);
        xdl0.M(this.f1993c, false);
        int iMin = Math.min(list.size(), this.f1996f.size());
        for (int i2 = 0; i2 < iMin; i2++) {
            SimpleDraweeView simpleDraweeView = this.f1996f.get(i2);
            xdl0.M(simpleDraweeView, true);
            qib0.G.L0(simpleDraweeView, list.get(i2));
        }
        String strValueOf = i > 99 ? "99+" : String.valueOf(i);
        this.f1995e.setText(i0g0.m16129b0(strValueOf + "人给你发送了喜欢", vwb.f0(new String[]{strValueOf}), -712315, Typeface.DEFAULT));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2704a(this);
        ArrayList arrayList = new ArrayList();
        this.f1996f = arrayList;
        arrayList.add(this.f1991a);
        this.f1996f.add(this.f1992b);
        this.f1996f.add(this.f1993c);
    }

    public JustRealSuccessLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JustRealSuccessLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
