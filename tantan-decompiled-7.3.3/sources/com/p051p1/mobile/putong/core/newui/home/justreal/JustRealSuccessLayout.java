package com.p051p1.mobile.putong.core.newui.home.justreal;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p153l.avq;
import p153l.bnl0;
import p153l.jyb;
import p153l.q8g0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class JustRealSuccessLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public SimpleDraweeView f23955a;

    /* JADX INFO: renamed from: b */
    public SimpleDraweeView f23956b;

    /* JADX INFO: renamed from: c */
    public SimpleDraweeView f23957c;

    /* JADX INFO: renamed from: d */
    public VImage f23958d;

    /* JADX INFO: renamed from: e */
    public VText_Default_Bold f23959e;

    /* JADX INFO: renamed from: f */
    public List<SimpleDraweeView> f23960f;

    public JustRealSuccessLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m39721a(View view) {
        avq.m100507a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m39722b(List<User> list) {
        bnl0.m105524M(this.f23955a, false);
        bnl0.m105524M(this.f23956b, false);
        bnl0.m105524M(this.f23957c, false);
        int iMin = Math.min(list.size(), this.f23960f.size());
        for (int i = 0; i < iMin; i++) {
            SimpleDraweeView simpleDraweeView = this.f23960f.get(i);
            bnl0.m105524M(simpleDraweeView, true);
            uqb0.f180374G.m127115L0(simpleDraweeView, list.get(i).m61308fp().profileMiddle().formatted());
        }
        String strValueOf = String.valueOf(list.size());
        this.f23959e.setText(q8g0.m175796b0("已给你右滑的" + strValueOf + "人发送了喜欢", jyb.m147507f0(strValueOf), -1245184, Typeface.DEFAULT));
    }

    /* JADX INFO: renamed from: c */
    public void m39723c(List<String> list, int i) {
        bnl0.m105524M(this.f23955a, false);
        bnl0.m105524M(this.f23956b, false);
        bnl0.m105524M(this.f23957c, false);
        int iMin = Math.min(list.size(), this.f23960f.size());
        for (int i2 = 0; i2 < iMin; i2++) {
            SimpleDraweeView simpleDraweeView = this.f23960f.get(i2);
            bnl0.m105524M(simpleDraweeView, true);
            uqb0.f180374G.m127115L0(simpleDraweeView, list.get(i2));
        }
        String strValueOf = i > 99 ? "99+" : String.valueOf(i);
        this.f23959e.setText(q8g0.m175796b0(strValueOf + "人给你发送了喜欢", jyb.m147507f0(strValueOf), -712315, Typeface.DEFAULT));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39721a(this);
        ArrayList arrayList = new ArrayList();
        this.f23960f = arrayList;
        arrayList.add(this.f23955a);
        this.f23960f.add(this.f23956b);
        this.f23960f.add(this.f23957c);
    }

    public JustRealSuccessLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JustRealSuccessLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
