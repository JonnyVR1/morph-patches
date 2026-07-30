package com.p046p1.mobile.putong.core.p053ui.visitor;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.VisitorFilterSettings;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import p147v.VCheckBox;
import p147v.VRecyclerView;
import p149l.b8m0;
import p149l.w5m0;
import p149l.w7m;
import p149l.w7m0;
import p149l.xdl0;
import p149l.yij0;
import p149l.z0c0;

/* JADX INFO: loaded from: classes9.dex */
public class VisitorsFilterBar extends LinearLayout {

    /* JADX INFO: renamed from: m */
    public static final int f38075m = CoreModule.f17544b.getResources().getColor(z0c0.f200976d);

    /* JADX INFO: renamed from: n */
    public static final int f38076n = Color.parseColor("#CC000000");

    /* JADX INFO: renamed from: a */
    public LinearLayout f38077a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f38078b;

    /* JADX INFO: renamed from: c */
    public VCheckBox f38079c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f38080d;

    /* JADX INFO: renamed from: e */
    public VCheckBox f38081e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f38082f;

    /* JADX INFO: renamed from: g */
    public VCheckBox f38083g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f38084h;

    /* JADX INFO: renamed from: i */
    public VCheckBox f38085i;

    /* JADX INFO: renamed from: j */
    public VRecyclerView f38086j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public w7m f38087k;

    /* JADX INFO: renamed from: l */
    public w7m0 f38088l;

    public VisitorsFilterBar(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m57798e(View view) {
        b8m0.m100776a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final Act m57799f() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: g */
    public void m57800g() {
        yij0.m214964t(this.f38078b, false);
        yij0.m214964t(this.f38080d, false);
        yij0.m214964t(this.f38082f, false);
        yij0.m214964t(this.f38084h, false);
        xdl0.m208344M(this.f38086j, false);
        m57806m();
        this.f38087k.mo57949b(false);
    }

    /* JADX INFO: renamed from: h */
    public void m57801h(w7m w7mVar) {
        this.f38087k = w7mVar;
        this.f38088l = new w7m0(m57799f(), w7mVar);
        this.f38086j.setLayoutManager(new LinearLayoutManager(m57799f()));
        this.f38086j.setAdapter(this.f38088l);
        xdl0.m208329E0(this.f38078b, new View.OnClickListener() { // from class: l.x7m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f191370a.m57802i(view);
            }
        });
        xdl0.m208329E0(this.f38080d, new View.OnClickListener() { // from class: l.y7m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196715a.m57803j(view);
            }
        });
        xdl0.m208329E0(this.f38082f, new View.OnClickListener() { // from class: l.z7m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202042a.m57804k(view);
            }
        });
        xdl0.m208329E0(this.f38084h, new View.OnClickListener() { // from class: l.a8m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68056a.m57805l(view);
            }
        });
        m57806m();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m57802i(View view) {
        if (yij0.m214965u(this.f38078b)) {
            m57800g();
        } else {
            m57809p(0);
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m57803j(View view) {
        if (yij0.m214965u(this.f38080d)) {
            m57800g();
        } else {
            m57809p(1);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m57804k(View view) {
        if (yij0.m214965u(this.f38082f)) {
            m57800g();
        } else {
            m57809p(2);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m57805l(View view) {
        if (yij0.m214965u(this.f38084h)) {
            m57800g();
        } else {
            m57809p(3);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m57806m() {
        VisitorFilterSettings visitorFilterSettingsM201647a = w5m0.m201647a();
        VisitorFilterSettings visitorFilterSettingsMo57948a = this.f38087k.mo57948a();
        int i = visitorFilterSettingsMo57948a.minAge;
        if (i == visitorFilterSettingsM201647a.minAge && visitorFilterSettingsMo57948a.maxAge == visitorFilterSettingsM201647a.maxAge) {
            m57808o(this.f38081e, "年龄");
        } else {
            m57807n(this.f38081e, C9049e.m57961a(i, visitorFilterSettingsMo57948a.maxAge));
        }
        int i2 = visitorFilterSettingsMo57948a.distance;
        int i3 = visitorFilterSettingsM201647a.distance;
        VCheckBox vCheckBox = this.f38079c;
        if (i2 != i3) {
            m57807n(vCheckBox, C9049e.m57962b(i2));
        } else {
            m57808o(vCheckBox, "距离");
        }
        boolean zEquals = TEnum.equals(visitorFilterSettingsMo57948a.sort, visitorFilterSettingsM201647a.sort);
        VCheckBox vCheckBox2 = this.f38083g;
        if (zEquals) {
            m57808o(vCheckBox2, "排序");
        } else {
            m57807n(vCheckBox2, "排序");
        }
        boolean zEquals2 = TEnum.equals(visitorFilterSettingsMo57948a.filter, visitorFilterSettingsM201647a.filter);
        VCheckBox vCheckBox3 = this.f38085i;
        if (zEquals2) {
            m57808o(vCheckBox3, "筛选");
        } else {
            m57807n(vCheckBox3, "筛选");
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m57807n(VCheckBox vCheckBox, String str) {
        vCheckBox.setText(str);
        vCheckBox.setTextColor(f38075m);
    }

    /* JADX INFO: renamed from: o */
    public final void m57808o(VCheckBox vCheckBox, String str) {
        vCheckBox.setText(str);
        vCheckBox.setTextColor(f38076n);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57798e(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m57809p(int i) {
        yij0.m214964t(this.f38078b, i == 0);
        yij0.m214964t(this.f38080d, i == 1);
        yij0.m214964t(this.f38082f, i == 2);
        yij0.m214964t(this.f38084h, i == 3);
        xdl0.m208344M(this.f38086j, true);
        m57806m();
        if (i == 0) {
            this.f38079c.setTextColor(f38075m);
        } else if (i == 1) {
            this.f38081e.setTextColor(f38075m);
        } else if (i == 2) {
            this.f38083g.setTextColor(f38075m);
        } else if (i == 3) {
            this.f38085i.setTextColor(f38075m);
        }
        this.f38088l.m202023I(i);
        this.f38087k.mo57949b(true);
    }

    public VisitorsFilterBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VisitorsFilterBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
