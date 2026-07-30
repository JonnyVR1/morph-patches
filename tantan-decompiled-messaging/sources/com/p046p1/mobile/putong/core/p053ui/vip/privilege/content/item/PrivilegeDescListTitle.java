package com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListTitle;
import p147v.VImage;
import p149l.dv80;
import p149l.eqh0;
import p149l.ex80;
import p149l.g6a;
import p149l.k0g0;
import p149l.sab0;
import p149l.w0c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeDescListTitle extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextView f37707a;

    /* JADX INFO: renamed from: b */
    public VImage f37708b;

    /* JADX INFO: renamed from: c */
    public TextView f37709c;

    public PrivilegeDescListTitle(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m57268a(C8999a c8999a, View view) {
        if (c8999a.f37714e != null) {
            c8999a.f37714e.mo57278a(view);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m57269b(C8999a c8999a, View view) {
        if (c8999a.f37712c != null) {
            c8999a.f37712c.mo57278a(view);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m57270c(View view) {
        ex80.m118579a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m57271d(final C8999a c8999a) {
        this.f37707a.setTypeface(eqh0.m117752c(3));
        this.f37707a.setText(c8999a.f37710a);
        boolean zM144048b = k0g0.m144048b(c8999a.f37711b);
        TextView textView = this.f37709c;
        if (zM144048b) {
            textView.setVisibility(8);
        } else {
            textView.setTypeface(eqh0.m117752c(3));
            this.f37709c.setVisibility(0);
            this.f37709c.setText(c8999a.f37711b);
            this.f37709c.setOnClickListener(new View.OnClickListener() { // from class: l.cx80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PrivilegeDescListTitle.m57269b(c8999a, view);
                }
            });
        }
        int i = c8999a.f37713d;
        VImage vImage = this.f37708b;
        if (i > 0) {
            xdl0.m208344M(vImage, true);
            this.f37708b.setImageResource(c8999a.f37713d);
            this.f37708b.setOnClickListener(new View.OnClickListener() { // from class: l.dx80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PrivilegeDescListTitle.m57268a(c8999a, view);
                }
            });
        } else {
            xdl0.m208344M(vImage, false);
        }
        if (sab0.m182891i(c8999a.f37715f) && g6a.m124566o()) {
            this.f37707a.setTextColor(getResources().getColor(w0c0.f183833b1));
            this.f37709c.setTextColor(getResources().getColor(w0c0.f183833b1));
        } else if (c8999a.f37715f == PurchaseType.TYPE_SUPREME_PARTNER) {
            this.f37707a.setTextColor(getResources().getColor(w0c0.f183828a0));
            this.f37709c.setTextColor(getResources().getColor(w0c0.f183828a0));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57270c(this);
    }

    public PrivilegeDescListTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeDescListTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListTitle$a */
    public static class C8999a implements dv80 {

        /* JADX INFO: renamed from: a */
        public String f37710a;

        /* JADX INFO: renamed from: b */
        public String f37711b;

        /* JADX INFO: renamed from: c */
        public a f37712c;

        /* JADX INFO: renamed from: d */
        public int f37713d;

        /* JADX INFO: renamed from: e */
        public a f37714e;

        /* JADX INFO: renamed from: f */
        public PurchaseType f37715f;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListTitle$a$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo57278a(View view);
        }

        public C8999a(String str, String str2, a aVar, int i, a aVar2, PurchaseType purchaseType) {
            this.f37710a = str;
            this.f37711b = str2;
            this.f37712c = aVar;
            this.f37713d = i;
            this.f37714e = aVar2;
            this.f37715f = purchaseType;
        }

        @Override // p149l.dv80
        public int getItemType() {
            return 0;
        }

        public C8999a(String str, String str2, a aVar, PurchaseType purchaseType) {
            this(str, str2, aVar, 0, null, purchaseType);
        }

        public C8999a(String str, String str2, a aVar) {
            this(str, str2, aVar, 0, null, null);
        }
    }
}
