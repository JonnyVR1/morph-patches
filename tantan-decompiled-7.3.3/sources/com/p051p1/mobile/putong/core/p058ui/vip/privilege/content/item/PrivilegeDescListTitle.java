package com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListTitle;
import p151v.VImage;
import p153l.bnl0;
import p153l.c9c0;
import p153l.h390;
import p153l.i590;
import p153l.lyh0;
import p153l.r8g0;
import p153l.s7a;
import p153l.wib0;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeDescListTitle extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextView f38555a;

    /* JADX INFO: renamed from: b */
    public VImage f38556b;

    /* JADX INFO: renamed from: c */
    public TextView f38557c;

    public PrivilegeDescListTitle(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m58451a(C9162a c9162a, View view) {
        if (c9162a.f38562e != null) {
            c9162a.f38562e.mo58461a(view);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m58452b(C9162a c9162a, View view) {
        if (c9162a.f38560c != null) {
            c9162a.f38560c.mo58461a(view);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m58453c(View view) {
        i590.m138643a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m58454d(final C9162a c9162a) {
        this.f38555a.setTypeface(lyh0.m156283c(3));
        this.f38555a.setText(c9162a.f38558a);
        boolean zM180203b = r8g0.m180203b(c9162a.f38559b);
        TextView textView = this.f38557c;
        if (zM180203b) {
            textView.setVisibility(8);
        } else {
            textView.setTypeface(lyh0.m156283c(3));
            this.f38557c.setVisibility(0);
            this.f38557c.setText(c9162a.f38559b);
            this.f38557c.setOnClickListener(new View.OnClickListener() { // from class: l.g590
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PrivilegeDescListTitle.m58452b(c9162a, view);
                }
            });
        }
        int i = c9162a.f38561d;
        VImage vImage = this.f38556b;
        if (i > 0) {
            bnl0.m105524M(vImage, true);
            this.f38556b.setImageResource(c9162a.f38561d);
            this.f38556b.setOnClickListener(new View.OnClickListener() { // from class: l.h590
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PrivilegeDescListTitle.m58451a(c9162a, view);
                }
            });
        } else {
            bnl0.m105524M(vImage, false);
        }
        if (wib0.m206565i(c9162a.f38563f) && s7a.m184986o()) {
            this.f38555a.setTextColor(getResources().getColor(c9c0.f80406c1));
            this.f38557c.setTextColor(getResources().getColor(c9c0.f80406c1));
        } else if (c9162a.f38563f == PurchaseType.TYPE_SUPREME_PARTNER) {
            this.f38555a.setTextColor(getResources().getColor(c9c0.f80401b0));
            this.f38557c.setTextColor(getResources().getColor(c9c0.f80401b0));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58453c(this);
    }

    public PrivilegeDescListTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeDescListTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListTitle$a */
    public static class C9162a implements h390 {

        /* JADX INFO: renamed from: a */
        public String f38558a;

        /* JADX INFO: renamed from: b */
        public String f38559b;

        /* JADX INFO: renamed from: c */
        public a f38560c;

        /* JADX INFO: renamed from: d */
        public int f38561d;

        /* JADX INFO: renamed from: e */
        public a f38562e;

        /* JADX INFO: renamed from: f */
        public PurchaseType f38563f;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListTitle$a$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo58461a(View view);
        }

        public C9162a(String str, String str2, a aVar, int i, a aVar2, PurchaseType purchaseType) {
            this.f38558a = str;
            this.f38559b = str2;
            this.f38560c = aVar;
            this.f38561d = i;
            this.f38562e = aVar2;
            this.f38563f = purchaseType;
        }

        @Override // p153l.h390
        public int getItemType() {
            return 0;
        }

        public C9162a(String str, String str2, a aVar, PurchaseType purchaseType) {
            this(str, str2, aVar, 0, null, purchaseType);
        }

        public C9162a(String str, String str2, a aVar) {
            this(str, str2, aVar, 0, null, null);
        }
    }
}
