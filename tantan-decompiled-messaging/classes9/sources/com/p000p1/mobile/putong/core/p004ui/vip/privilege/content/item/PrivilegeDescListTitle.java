package com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListTitle;
import com.p1.mobile.putong.core.data.PurchaseType;
import l.eqh0;
import l.ex80;
import l.k0g0;
import l.sab0;
import l.xdl0;
import p006l.dv80;
import p006l.g6a;
import p006l.w0c0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeDescListTitle extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextView f7488a;

    /* JADX INFO: renamed from: b */
    public VImage f7489b;

    /* JADX INFO: renamed from: c */
    public TextView f7490c;

    public PrivilegeDescListTitle(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10748a(C0435a c0435a, View view) {
        if (c0435a.f7495e != null) {
            c0435a.f7495e.mo10758a(view);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m10749b(C0435a c0435a, View view) {
        if (c0435a.f7493c != null) {
            c0435a.f7493c.mo10758a(view);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10750c(View view) {
        ex80.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m10751d(final C0435a c0435a) {
        this.f7488a.setTypeface(eqh0.c(3));
        this.f7488a.setText(c0435a.f7491a);
        boolean zB = k0g0.b(c0435a.f7492b);
        TextView textView = this.f7490c;
        if (zB) {
            textView.setVisibility(8);
        } else {
            textView.setTypeface(eqh0.c(3));
            this.f7490c.setVisibility(0);
            this.f7490c.setText(c0435a.f7492b);
            this.f7490c.setOnClickListener(new View.OnClickListener() { // from class: l.cx80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PrivilegeDescListTitle.m10749b(c0435a, view);
                }
            });
        }
        int i = c0435a.f7494d;
        VImage vImage = this.f7489b;
        if (i > 0) {
            xdl0.M(vImage, true);
            this.f7489b.setImageResource(c0435a.f7494d);
            this.f7489b.setOnClickListener(new View.OnClickListener() { // from class: l.dx80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PrivilegeDescListTitle.m10748a(c0435a, view);
                }
            });
        } else {
            xdl0.M(vImage, false);
        }
        if (sab0.i(c0435a.f7496f) && g6a.m15592o()) {
            this.f7488a.setTextColor(getResources().getColor(w0c0.f24673b1));
            this.f7490c.setTextColor(getResources().getColor(w0c0.f24673b1));
        } else if (c0435a.f7496f == PurchaseType.TYPE_SUPREME_PARTNER) {
            this.f7488a.setTextColor(getResources().getColor(w0c0.f24668a0));
            this.f7490c.setTextColor(getResources().getColor(w0c0.f24668a0));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10750c(this);
    }

    public PrivilegeDescListTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeDescListTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListTitle$a */
    public static class C0435a implements dv80 {

        /* JADX INFO: renamed from: a */
        public String f7491a;

        /* JADX INFO: renamed from: b */
        public String f7492b;

        /* JADX INFO: renamed from: c */
        public a f7493c;

        /* JADX INFO: renamed from: d */
        public int f7494d;

        /* JADX INFO: renamed from: e */
        public a f7495e;

        /* JADX INFO: renamed from: f */
        public PurchaseType f7496f;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListTitle$a$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo10758a(View view);
        }

        public C0435a(String str, String str2, a aVar, int i, a aVar2, PurchaseType purchaseType) {
            this.f7491a = str;
            this.f7492b = str2;
            this.f7493c = aVar;
            this.f7494d = i;
            this.f7495e = aVar2;
            this.f7496f = purchaseType;
        }

        @Override // p006l.dv80
        public int getItemType() {
            return 0;
        }

        public C0435a(String str, String str2, a aVar, PurchaseType purchaseType) {
            this(str, str2, aVar, 0, null, purchaseType);
        }

        public C0435a(String str, String str2, a aVar) {
            this(str, str2, aVar, 0, null, null);
        }
    }
}
