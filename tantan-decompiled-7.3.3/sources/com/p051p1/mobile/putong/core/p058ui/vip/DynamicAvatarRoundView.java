package com.p051p1.mobile.putong.core.p058ui.vip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import p151v.VDraweeView;
import p151v.VFrame;
import p153l.bnl0;
import p153l.cge;
import p153l.ddc0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes12.dex */
public class DynamicAvatarRoundView extends VFrame {

    /* JADX INFO: renamed from: a */
    public ViewStub f37799a;

    /* JADX INFO: renamed from: b */
    public ViewStub f37800b;

    /* JADX INFO: renamed from: c */
    public ViewStub f37801c;

    public DynamicAvatarRoundView(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57408p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m57408p(View view) {
        cge.m109687a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m57409s(List<String> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        if (list.size() == 1) {
            bnl0.m105524M(this.f37799a, true);
            bnl0.m105524M(this.f37800b, false);
            bnl0.m105524M(this.f37801c, false);
            uqb0.f180374G.m127115L0((VDraweeView) findViewById(ddc0.f87915u), list.get(0));
            return;
        }
        int size = list.size();
        ViewStub viewStub = this.f37799a;
        if (size == 2) {
            bnl0.m105524M(viewStub, false);
            bnl0.m105524M(this.f37800b, true);
            bnl0.m105524M(this.f37801c, false);
            VDraweeView vDraweeView = (VDraweeView) findViewById(ddc0.f87890T);
            VDraweeView vDraweeView2 = (VDraweeView) findViewById(ddc0.f87891U);
            uqb0.f180374G.m127115L0(vDraweeView, list.get(0));
            uqb0.f180374G.m127115L0(vDraweeView2, list.get(1));
            return;
        }
        bnl0.m105524M(viewStub, false);
        bnl0.m105524M(this.f37800b, false);
        bnl0.m105524M(this.f37801c, true);
        VDraweeView vDraweeView3 = (VDraweeView) findViewById(ddc0.f87882L);
        VDraweeView vDraweeView4 = (VDraweeView) findViewById(ddc0.f87883M);
        VDraweeView vDraweeView5 = (VDraweeView) findViewById(ddc0.f87884N);
        uqb0.f180374G.m127115L0(vDraweeView3, list.get(0));
        uqb0.f180374G.m127115L0(vDraweeView4, list.get(1));
        uqb0.f180374G.m127115L0(vDraweeView5, list.get(2));
    }

    public DynamicAvatarRoundView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DynamicAvatarRoundView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
