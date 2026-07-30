package com.p051p1.mobile.putong.core.p058ui.visitor;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.VisitorFilterSettings;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import p151v.VCheckBox;
import p151v.VRecyclerView;
import p153l.afm0;
import p153l.ahm0;
import p153l.bnl0;
import p153l.bsj0;
import p153l.f9c0;
import p153l.fhm0;
import p153l.mam;

/* JADX INFO: loaded from: classes12.dex */
public class VisitorsFilterBar extends LinearLayout {

    /* JADX INFO: renamed from: m */
    public static final int f38923m = CoreModule.f18263b.getResources().getColor(f9c0.f97859d);

    /* JADX INFO: renamed from: n */
    public static final int f38924n = Color.parseColor("#CC000000");

    /* JADX INFO: renamed from: a */
    public LinearLayout f38925a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f38926b;

    /* JADX INFO: renamed from: c */
    public VCheckBox f38927c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f38928d;

    /* JADX INFO: renamed from: e */
    public VCheckBox f38929e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f38930f;

    /* JADX INFO: renamed from: g */
    public VCheckBox f38931g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f38932h;

    /* JADX INFO: renamed from: i */
    public VCheckBox f38933i;

    /* JADX INFO: renamed from: j */
    public VRecyclerView f38934j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public mam f38935k;

    /* JADX INFO: renamed from: l */
    public ahm0 f38936l;

    public VisitorsFilterBar(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m58981e(View view) {
        fhm0.m125581a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final Act m58982f() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: g */
    public void m58983g() {
        bsj0.m106284t(this.f38926b, false);
        bsj0.m106284t(this.f38928d, false);
        bsj0.m106284t(this.f38930f, false);
        bsj0.m106284t(this.f38932h, false);
        bnl0.m105524M(this.f38934j, false);
        m58989m();
        this.f38935k.mo59132b(false);
    }

    /* JADX INFO: renamed from: h */
    public void m58984h(mam mamVar) {
        this.f38935k = mamVar;
        this.f38936l = new ahm0(m58982f(), mamVar);
        this.f38934j.setLayoutManager(new LinearLayoutManager(m58982f()));
        this.f38934j.setAdapter(this.f38936l);
        bnl0.m105509E0(this.f38926b, new View.OnClickListener() { // from class: l.bhm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76797a.m58985i(view);
            }
        });
        bnl0.m105509E0(this.f38928d, new View.OnClickListener() { // from class: l.chm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81853a.m58986j(view);
            }
        });
        bnl0.m105509E0(this.f38930f, new View.OnClickListener() { // from class: l.dhm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88544a.m58987k(view);
            }
        });
        bnl0.m105509E0(this.f38932h, new View.OnClickListener() { // from class: l.ehm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94053a.m58988l(view);
            }
        });
        m58989m();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m58985i(View view) {
        if (bsj0.m106285u(this.f38926b)) {
            m58983g();
        } else {
            m58992p(0);
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m58986j(View view) {
        if (bsj0.m106285u(this.f38928d)) {
            m58983g();
        } else {
            m58992p(1);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m58987k(View view) {
        if (bsj0.m106285u(this.f38930f)) {
            m58983g();
        } else {
            m58992p(2);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m58988l(View view) {
        if (bsj0.m106285u(this.f38932h)) {
            m58983g();
        } else {
            m58992p(3);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m58989m() {
        VisitorFilterSettings visitorFilterSettingsM97510a = afm0.m97510a();
        VisitorFilterSettings visitorFilterSettingsMo59131a = this.f38935k.mo59131a();
        int i = visitorFilterSettingsMo59131a.minAge;
        if (i == visitorFilterSettingsM97510a.minAge && visitorFilterSettingsMo59131a.maxAge == visitorFilterSettingsM97510a.maxAge) {
            m58991o(this.f38929e, "年龄");
        } else {
            m58990n(this.f38929e, C9212e.m59144a(i, visitorFilterSettingsMo59131a.maxAge));
        }
        int i2 = visitorFilterSettingsMo59131a.distance;
        int i3 = visitorFilterSettingsM97510a.distance;
        VCheckBox vCheckBox = this.f38927c;
        if (i2 != i3) {
            m58990n(vCheckBox, C9212e.m59145b(i2));
        } else {
            m58991o(vCheckBox, "距离");
        }
        boolean zEquals = TEnum.equals(visitorFilterSettingsMo59131a.sort, visitorFilterSettingsM97510a.sort);
        VCheckBox vCheckBox2 = this.f38931g;
        if (zEquals) {
            m58991o(vCheckBox2, "排序");
        } else {
            m58990n(vCheckBox2, "排序");
        }
        boolean zEquals2 = TEnum.equals(visitorFilterSettingsMo59131a.filter, visitorFilterSettingsM97510a.filter);
        VCheckBox vCheckBox3 = this.f38933i;
        if (zEquals2) {
            m58991o(vCheckBox3, "筛选");
        } else {
            m58990n(vCheckBox3, "筛选");
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m58990n(VCheckBox vCheckBox, String str) {
        vCheckBox.setText(str);
        vCheckBox.setTextColor(f38923m);
    }

    /* JADX INFO: renamed from: o */
    public final void m58991o(VCheckBox vCheckBox, String str) {
        vCheckBox.setText(str);
        vCheckBox.setTextColor(f38924n);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58981e(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m58992p(int i) {
        bsj0.m106284t(this.f38926b, i == 0);
        bsj0.m106284t(this.f38928d, i == 1);
        bsj0.m106284t(this.f38930f, i == 2);
        bsj0.m106284t(this.f38932h, i == 3);
        bnl0.m105524M(this.f38934j, true);
        m58989m();
        if (i == 0) {
            this.f38927c.setTextColor(f38923m);
        } else if (i == 1) {
            this.f38929e.setTextColor(f38923m);
        } else if (i == 2) {
            this.f38931g.setTextColor(f38923m);
        } else if (i == 3) {
            this.f38933i.setTextColor(f38923m);
        }
        this.f38936l.m97853I(i);
        this.f38935k.mo59132b(true);
    }

    public VisitorsFilterBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VisitorsFilterBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
