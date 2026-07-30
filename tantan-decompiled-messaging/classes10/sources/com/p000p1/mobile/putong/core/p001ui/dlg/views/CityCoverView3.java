package com.p000p1.mobile.putong.core.p001ui.dlg.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.CityCData;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import l.d30;
import l.eqh0;
import l.xdl0;
import p003l.o6j0;
import p003l.t45;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CityCoverView3 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CityCoverView3 f1448a;

    /* JADX INFO: renamed from: b */
    public CityCoverSmallCardView f1449b;

    /* JADX INFO: renamed from: c */
    public VText f1450c;

    /* JADX INFO: renamed from: d */
    public VText f1451d;

    /* JADX INFO: renamed from: e */
    public d30 f1452e;

    /* JADX INFO: renamed from: f */
    public d30 f1453f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView3$a */
    public class ViewOnClickListenerC3095a implements View.OnClickListener {
        public ViewOnClickListenerC3095a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d30 d30Var = CityCoverView3.this.f1452e;
            if (d30Var != null) {
                d30Var.call();
            }
            o6j0.m8403c("e_city_cover_go_up", "p_city_cover_desc_show_someone", new o6j0.C3390a[0]);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView3$b */
    public class ViewOnClickListenerC3096b implements View.OnClickListener {
        public ViewOnClickListenerC3096b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d30 d30Var = CityCoverView3.this.f1453f;
            if (d30Var != null) {
                d30Var.call();
            }
        }
    }

    public CityCoverView3(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m2556a(View view) {
        t45.m9525a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m2557b(CityCData cityCData, d30 d30Var, d30 d30Var2) {
        if (cityCData == null) {
            return;
        }
        this.f1452e = d30Var;
        this.f1453f = d30Var2;
        User userPa = CoreModule.c.e0.Pa(cityCData.userId);
        if (userPa != null) {
            this.f1449b.m2537b(((Media) userPa.fp()).url, userPa.name, String.format("已收到%s喜欢", Integer.valueOf(cityCData.recievedLikeCount)));
            this.f1450c.setText(String.format("已占领%s个%s用户的首张卡片", Integer.valueOf(cityCData.viewCount), cityCData.cityName));
        }
        o6j0.m8408h("e_city_cover_go_up", "p_city_cover_desc_show_someone", new o6j0.C3390a[0]);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2556a(this);
        this.f1451d.setTypeface(eqh0.c(3), 1);
        xdl0.E0(this.f1451d, new ViewOnClickListenerC3095a());
        xdl0.E0(this.f1449b, new ViewOnClickListenerC3096b());
    }

    public CityCoverView3(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CityCoverView3(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
