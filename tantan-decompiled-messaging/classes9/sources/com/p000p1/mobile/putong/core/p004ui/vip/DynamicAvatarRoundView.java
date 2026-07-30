package com.p000p1.mobile.putong.core.p004ui.vip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import l.x4c0;
import l.xdl0;
import l.yee;
import p006l.qib0;
import v.VDraweeView;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class DynamicAvatarRoundView extends VFrame {

    /* JADX INFO: renamed from: a */
    public ViewStub f6732a;

    /* JADX INFO: renamed from: b */
    public ViewStub f6733b;

    /* JADX INFO: renamed from: c */
    public ViewStub f6734c;

    public DynamicAvatarRoundView(@NonNull Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m9658p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m9658p(View view) {
        yee.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public void m9659s(List<String> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        if (list.size() == 1) {
            xdl0.M(this.f6732a, true);
            xdl0.M(this.f6733b, false);
            xdl0.M(this.f6734c, false);
            qib0.f19782G.m12744L0((VDraweeView) findViewById(x4c0.u), list.get(0));
            return;
        }
        int size = list.size();
        ViewStub viewStub = this.f6732a;
        if (size == 2) {
            xdl0.M(viewStub, false);
            xdl0.M(this.f6733b, true);
            xdl0.M(this.f6734c, false);
            SimpleDraweeView simpleDraweeView = (VDraweeView) findViewById(x4c0.T);
            SimpleDraweeView simpleDraweeView2 = (VDraweeView) findViewById(x4c0.U);
            qib0.f19782G.m12744L0(simpleDraweeView, list.get(0));
            qib0.f19782G.m12744L0(simpleDraweeView2, list.get(1));
            return;
        }
        xdl0.M(viewStub, false);
        xdl0.M(this.f6733b, false);
        xdl0.M(this.f6734c, true);
        SimpleDraweeView simpleDraweeView3 = (VDraweeView) findViewById(x4c0.L);
        SimpleDraweeView simpleDraweeView4 = (VDraweeView) findViewById(x4c0.M);
        SimpleDraweeView simpleDraweeView5 = (VDraweeView) findViewById(x4c0.N);
        qib0.f19782G.m12744L0(simpleDraweeView3, list.get(0));
        qib0.f19782G.m12744L0(simpleDraweeView4, list.get(1));
        qib0.f19782G.m12744L0(simpleDraweeView5, list.get(2));
    }

    public DynamicAvatarRoundView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DynamicAvatarRoundView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
