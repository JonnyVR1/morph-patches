package com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListTitle;
import p147v.VImage;
import p149l.cyo;
import p149l.eqh0;
import p149l.k0g0;
import p149l.sxo;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class IntlPrivilegeDescListTitle extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextView f37927a;

    /* JADX INFO: renamed from: b */
    public VImage f37928b;

    /* JADX INFO: renamed from: c */
    public TextView f37929c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListTitle$a */
    public static class C9022a implements sxo {

        /* JADX INFO: renamed from: a */
        public String f37930a;

        /* JADX INFO: renamed from: b */
        public String f37931b;

        /* JADX INFO: renamed from: c */
        public int f37932c;

        /* JADX INFO: renamed from: d */
        public boolean f37933d;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListTitle$a$a */
        public interface a {
        }

        public C9022a(String str, String str2, boolean z, a aVar) {
            this.f37930a = str;
            this.f37931b = str2;
            this.f37933d = z;
        }

        /* JADX INFO: renamed from: d */
        public static /* bridge */ /* synthetic */ a m57664d(C9022a c9022a) {
            c9022a.getClass();
            return null;
        }

        /* JADX INFO: renamed from: e */
        public static /* bridge */ /* synthetic */ a m57665e(C9022a c9022a) {
            c9022a.getClass();
            return null;
        }

        @Override // p149l.sxo
        public int getItemType() {
            return 0;
        }
    }

    public IntlPrivilegeDescListTitle(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m57659c(View view) {
        cyo.m109388a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m57660d(final C9022a c9022a) {
        this.f37927a.setTypeface(eqh0.m117752c(2), 1);
        this.f37927a.setText(c9022a.f37930a);
        boolean z = c9022a.f37933d;
        TextView textView = this.f37927a;
        if (z) {
            textView.setTextColor(Color.parseColor("#cce8ca8a"));
            this.f37929c.setTextColor(Color.parseColor("#66e8ca8a"));
        } else {
            textView.setTextColor(Color.parseColor("#99000000"));
            this.f37929c.setTextColor(Color.parseColor("#66000000"));
        }
        boolean zM144048b = k0g0.m144048b(c9022a.f37931b);
        TextView textView2 = this.f37929c;
        if (zM144048b) {
            textView2.setVisibility(8);
        } else {
            textView2.setTypeface(eqh0.m117752c(2), 1);
            this.f37929c.setVisibility(0);
            this.f37929c.setText(c9022a.f37931b);
            this.f37929c.setOnClickListener(new View.OnClickListener() { // from class: l.zxo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IntlPrivilegeDescListTitle.C9022a.m57664d(c9022a);
                }
            });
        }
        int i = c9022a.f37932c;
        VImage vImage = this.f37928b;
        if (i <= 0) {
            xdl0.m208344M(vImage, false);
            return;
        }
        xdl0.m208344M(vImage, true);
        this.f37928b.setImageResource(c9022a.f37932c);
        this.f37928b.setOnClickListener(new View.OnClickListener() { // from class: l.ayo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlPrivilegeDescListTitle.C9022a.m57665e(c9022a);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57659c(this);
    }

    public IntlPrivilegeDescListTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeDescListTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
