package com.p046p1.mobile.putong.core.newui.home.justreal;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p149l.i0g0;
import p149l.qib0;
import p149l.vwb;
import p149l.xdl0;
import p149l.zsq;

/* JADX INFO: loaded from: classes11.dex */
public class JustRealSuccessLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public SimpleDraweeView f23213a;

    /* JADX INFO: renamed from: b */
    public SimpleDraweeView f23214b;

    /* JADX INFO: renamed from: c */
    public SimpleDraweeView f23215c;

    /* JADX INFO: renamed from: d */
    public VImage f23216d;

    /* JADX INFO: renamed from: e */
    public VText_Default_Bold f23217e;

    /* JADX INFO: renamed from: f */
    public List<SimpleDraweeView> f23218f;

    public JustRealSuccessLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m38718a(View view) {
        zsq.m220055a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m38719b(List<User> list) {
        xdl0.m208344M(this.f23213a, false);
        xdl0.m208344M(this.f23214b, false);
        xdl0.m208344M(this.f23215c, false);
        int iMin = Math.min(list.size(), this.f23218f.size());
        for (int i = 0; i < iMin; i++) {
            SimpleDraweeView simpleDraweeView = this.f23218f.get(i);
            xdl0.m208344M(simpleDraweeView, true);
            qib0.f154691G.m102331L0(simpleDraweeView, list.get(i).m60124fp().profileMiddle().formatted());
        }
        String strValueOf = String.valueOf(list.size());
        this.f23217e.setText(i0g0.m133861b0("已给你右滑的" + strValueOf + "人发送了喜欢", vwb.m200324f0(strValueOf), -1245184, Typeface.DEFAULT));
    }

    /* JADX INFO: renamed from: c */
    public void m38720c(List<String> list, int i) {
        xdl0.m208344M(this.f23213a, false);
        xdl0.m208344M(this.f23214b, false);
        xdl0.m208344M(this.f23215c, false);
        int iMin = Math.min(list.size(), this.f23218f.size());
        for (int i2 = 0; i2 < iMin; i2++) {
            SimpleDraweeView simpleDraweeView = this.f23218f.get(i2);
            xdl0.m208344M(simpleDraweeView, true);
            qib0.f154691G.m102331L0(simpleDraweeView, list.get(i2));
        }
        String strValueOf = i > 99 ? "99+" : String.valueOf(i);
        this.f23217e.setText(i0g0.m133861b0(strValueOf + "人给你发送了喜欢", vwb.m200324f0(strValueOf), -712315, Typeface.DEFAULT));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38718a(this);
        ArrayList arrayList = new ArrayList();
        this.f23218f = arrayList;
        arrayList.add(this.f23213a);
        this.f23218f.add(this.f23214b);
        this.f23218f.add(this.f23215c);
    }

    public JustRealSuccessLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JustRealSuccessLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
