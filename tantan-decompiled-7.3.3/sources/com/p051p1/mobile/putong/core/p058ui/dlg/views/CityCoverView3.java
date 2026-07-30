package com.p051p1.mobile.putong.core.p058ui.dlg.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CityCData;
import com.p051p1.mobile.putong.data.User;
import p151v.VText;
import p153l.bnl0;
import p153l.lyh0;
import p153l.sfj0;
import p153l.u55;
import p153l.x20;

/* JADX INFO: loaded from: classes2.dex */
public class CityCoverView3 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CityCoverView3 f29902a;

    /* JADX INFO: renamed from: b */
    public CityCoverSmallCardView f29903b;

    /* JADX INFO: renamed from: c */
    public VText f29904c;

    /* JADX INFO: renamed from: d */
    public VText f29905d;

    /* JADX INFO: renamed from: e */
    public x20 f29906e;

    /* JADX INFO: renamed from: f */
    public x20 f29907f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView3$a */
    public class ViewOnClickListenerC8483a implements View.OnClickListener {
        public ViewOnClickListenerC8483a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            x20 x20Var = CityCoverView3.this.f29906e;
            if (x20Var != null) {
                x20Var.call();
            }
            sfj0.m185596c("e_city_cover_go_up", "p_city_cover_desc_show_someone", new sfj0.C20032a[0]);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView3$b */
    public class ViewOnClickListenerC8484b implements View.OnClickListener {
        public ViewOnClickListenerC8484b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            x20 x20Var = CityCoverView3.this.f29907f;
            if (x20Var != null) {
                x20Var.call();
            }
        }
    }

    public CityCoverView3(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m46420a(View view) {
        u55.m194540a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m46421b(CityCData cityCData, x20 x20Var, x20 x20Var2) {
        if (cityCData == null) {
            return;
        }
        this.f29906e = x20Var;
        this.f29907f = x20Var2;
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(cityCData.userId);
        if (userM116503Pa != null) {
            this.f29903b.m46403b(userM116503Pa.m61308fp().url, userM116503Pa.name, String.format("已收到%s喜欢", Integer.valueOf(cityCData.recievedLikeCount)));
            this.f29904c.setText(String.format("已占领%s个%s用户的首张卡片", Integer.valueOf(cityCData.viewCount), cityCData.cityName));
        }
        sfj0.m185601h("e_city_cover_go_up", "p_city_cover_desc_show_someone", new sfj0.C20032a[0]);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46420a(this);
        this.f29905d.setTypeface(lyh0.m156283c(3), 1);
        bnl0.m105509E0(this.f29905d, new ViewOnClickListenerC8483a());
        bnl0.m105509E0(this.f29903b, new ViewOnClickListenerC8484b());
    }

    public CityCoverView3(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CityCoverView3(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
