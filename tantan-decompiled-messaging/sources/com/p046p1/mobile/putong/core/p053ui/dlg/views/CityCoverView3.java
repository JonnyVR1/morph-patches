package com.p046p1.mobile.putong.core.p053ui.dlg.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CityCData;
import com.p046p1.mobile.putong.data.User;
import p147v.VText;
import p149l.d30;
import p149l.eqh0;
import p149l.o6j0;
import p149l.t45;
import p149l.xdl0;

/* JADX INFO: loaded from: classes10.dex */
public class CityCoverView3 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CityCoverView3 f29054a;

    /* JADX INFO: renamed from: b */
    public CityCoverSmallCardView f29055b;

    /* JADX INFO: renamed from: c */
    public VText f29056c;

    /* JADX INFO: renamed from: d */
    public VText f29057d;

    /* JADX INFO: renamed from: e */
    public d30 f29058e;

    /* JADX INFO: renamed from: f */
    public d30 f29059f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView3$a */
    public class ViewOnClickListenerC8320a implements View.OnClickListener {
        public ViewOnClickListenerC8320a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d30 d30Var = CityCoverView3.this.f29058e;
            if (d30Var != null) {
                d30Var.call();
            }
            o6j0.m162859c("e_city_cover_go_up", "p_city_cover_desc_show_someone", new o6j0.C18854a[0]);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView3$b */
    public class ViewOnClickListenerC8321b implements View.OnClickListener {
        public ViewOnClickListenerC8321b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d30 d30Var = CityCoverView3.this.f29059f;
            if (d30Var != null) {
                d30Var.call();
            }
        }
    }

    public CityCoverView3(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m45237a(View view) {
        t45.m187147a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m45238b(CityCData cityCData, d30 d30Var, d30 d30Var2) {
        if (cityCData == null) {
            return;
        }
        this.f29058e = d30Var;
        this.f29059f = d30Var2;
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(cityCData.userId);
        if (userM169430Pa != null) {
            this.f29055b.m45220b(userM169430Pa.m60124fp().url, userM169430Pa.name, String.format("已收到%s喜欢", Integer.valueOf(cityCData.recievedLikeCount)));
            this.f29056c.setText(String.format("已占领%s个%s用户的首张卡片", Integer.valueOf(cityCData.viewCount), cityCData.cityName));
        }
        o6j0.m162864h("e_city_cover_go_up", "p_city_cover_desc_show_someone", new o6j0.C18854a[0]);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45237a(this);
        this.f29057d.setTypeface(eqh0.m117752c(3), 1);
        xdl0.m208329E0(this.f29057d, new ViewOnClickListenerC8320a());
        xdl0.m208329E0(this.f29055b, new ViewOnClickListenerC8321b());
    }

    public CityCoverView3(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CityCoverView3(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
