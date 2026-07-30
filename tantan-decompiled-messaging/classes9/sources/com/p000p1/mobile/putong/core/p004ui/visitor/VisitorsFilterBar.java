package com.p000p1.mobile.putong.core.p004ui.visitor;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.VisitorFilterSettings;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.b8m0;
import l.w5m0;
import l.xdl0;
import l.yij0;
import l.z0c0;
import p006l.w7m;
import p006l.w7m0;
import v.VCheckBox;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VisitorsFilterBar extends LinearLayout {

    /* JADX INFO: renamed from: m */
    public static final int f7856m = CoreModule.f1533b.getResources().getColor(z0c0.d);

    /* JADX INFO: renamed from: n */
    public static final int f7857n = Color.parseColor("#CC000000");

    /* JADX INFO: renamed from: a */
    public LinearLayout f7858a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f7859b;

    /* JADX INFO: renamed from: c */
    public VCheckBox f7860c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f7861d;

    /* JADX INFO: renamed from: e */
    public VCheckBox f7862e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f7863f;

    /* JADX INFO: renamed from: g */
    public VCheckBox f7864g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f7865h;

    /* JADX INFO: renamed from: i */
    public VCheckBox f7866i;

    /* JADX INFO: renamed from: j */
    public VRecyclerView f7867j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public w7m f7868k;

    /* JADX INFO: renamed from: l */
    public w7m0 f7869l;

    public VisitorsFilterBar(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m11299e(View view) {
        b8m0.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final Act m11300f() {
        return getContext();
    }

    /* JADX INFO: renamed from: g */
    public void m11301g() {
        yij0.t(this.f7859b, false);
        yij0.t(this.f7861d, false);
        yij0.t(this.f7863f, false);
        yij0.t(this.f7865h, false);
        xdl0.M(this.f7867j, false);
        m11307m();
        this.f7868k.mo11464b(false);
    }

    /* JADX INFO: renamed from: h */
    public void m11302h(w7m w7mVar) {
        this.f7868k = w7mVar;
        this.f7869l = new w7m0(m11300f(), w7mVar);
        this.f7867j.setLayoutManager(new LinearLayoutManager(m11300f()));
        this.f7867j.setAdapter(this.f7869l);
        xdl0.E0(this.f7859b, new View.OnClickListener() { // from class: l.x7m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27383a.m11303i(view);
            }
        });
        xdl0.E0(this.f7861d, new View.OnClickListener() { // from class: l.y7m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28068a.m11304j(view);
            }
        });
        xdl0.E0(this.f7863f, new View.OnClickListener() { // from class: l.z7m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28666a.m11305k(view);
            }
        });
        xdl0.E0(this.f7865h, new View.OnClickListener() { // from class: l.a8m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8161a.m11306l(view);
            }
        });
        m11307m();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m11303i(View view) {
        if (yij0.u(this.f7859b)) {
            m11301g();
        } else {
            m11310p(0);
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m11304j(View view) {
        if (yij0.u(this.f7861d)) {
            m11301g();
        } else {
            m11310p(1);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m11305k(View view) {
        if (yij0.u(this.f7863f)) {
            m11301g();
        } else {
            m11310p(2);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m11306l(View view) {
        if (yij0.u(this.f7865h)) {
            m11301g();
        } else {
            m11310p(3);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m11307m() {
        VisitorFilterSettings visitorFilterSettingsA = w5m0.a();
        VisitorFilterSettings visitorFilterSettingsMo11463a = this.f7868k.mo11463a();
        int i = visitorFilterSettingsMo11463a.minAge;
        if (i == visitorFilterSettingsA.minAge && visitorFilterSettingsMo11463a.maxAge == visitorFilterSettingsA.maxAge) {
            m11309o(this.f7862e, "年龄");
        } else {
            m11308n(this.f7862e, C0485e.m11479a(i, visitorFilterSettingsMo11463a.maxAge));
        }
        int i2 = visitorFilterSettingsMo11463a.distance;
        int i3 = visitorFilterSettingsA.distance;
        VCheckBox vCheckBox = this.f7860c;
        if (i2 != i3) {
            m11308n(vCheckBox, C0485e.m11480b(i2));
        } else {
            m11309o(vCheckBox, "距离");
        }
        boolean zEquals = TEnum.equals(visitorFilterSettingsMo11463a.sort, visitorFilterSettingsA.sort);
        VCheckBox vCheckBox2 = this.f7864g;
        if (zEquals) {
            m11309o(vCheckBox2, "排序");
        } else {
            m11308n(vCheckBox2, "排序");
        }
        boolean zEquals2 = TEnum.equals(visitorFilterSettingsMo11463a.filter, visitorFilterSettingsA.filter);
        VCheckBox vCheckBox3 = this.f7866i;
        if (zEquals2) {
            m11309o(vCheckBox3, "筛选");
        } else {
            m11308n(vCheckBox3, "筛选");
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m11308n(VCheckBox vCheckBox, String str) {
        vCheckBox.setText(str);
        vCheckBox.setTextColor(f7856m);
    }

    /* JADX INFO: renamed from: o */
    public final void m11309o(VCheckBox vCheckBox, String str) {
        vCheckBox.setText(str);
        vCheckBox.setTextColor(f7857n);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m11299e(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m11310p(int i) {
        yij0.t(this.f7859b, i == 0);
        yij0.t(this.f7861d, i == 1);
        yij0.t(this.f7863f, i == 2);
        yij0.t(this.f7865h, i == 3);
        xdl0.M(this.f7867j, true);
        m11307m();
        if (i == 0) {
            this.f7860c.setTextColor(f7856m);
        } else if (i == 1) {
            this.f7862e.setTextColor(f7856m);
        } else if (i == 2) {
            this.f7864g.setTextColor(f7856m);
        } else if (i == 3) {
            this.f7866i.setTextColor(f7856m);
        }
        this.f7869l.m26238I(i);
        this.f7868k.mo11464b(true);
    }

    public VisitorsFilterBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VisitorsFilterBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
