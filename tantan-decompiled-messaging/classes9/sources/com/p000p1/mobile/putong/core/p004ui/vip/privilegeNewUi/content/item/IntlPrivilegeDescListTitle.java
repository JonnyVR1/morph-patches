package com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListTitle;
import l.cyo;
import l.eqh0;
import l.k0g0;
import l.xdl0;
import p006l.sxo;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlPrivilegeDescListTitle extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextView f7708a;

    /* JADX INFO: renamed from: b */
    public VImage f7709b;

    /* JADX INFO: renamed from: c */
    public TextView f7710c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListTitle$a */
    public static class C0458a implements sxo {

        /* JADX INFO: renamed from: a */
        public String f7711a;

        /* JADX INFO: renamed from: b */
        public String f7712b;

        /* JADX INFO: renamed from: c */
        public int f7713c;

        /* JADX INFO: renamed from: d */
        public boolean f7714d;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListTitle$a$a */
        public interface a {
        }

        public C0458a(String str, String str2, boolean z, a aVar) {
            this.f7711a = str;
            this.f7712b = str2;
            this.f7714d = z;
        }

        /* JADX INFO: renamed from: d */
        public static /* bridge */ /* synthetic */ a m11156d(C0458a c0458a) {
            c0458a.getClass();
            return null;
        }

        /* JADX INFO: renamed from: e */
        public static /* bridge */ /* synthetic */ a m11157e(C0458a c0458a) {
            c0458a.getClass();
            return null;
        }

        @Override // p006l.sxo
        public int getItemType() {
            return 0;
        }
    }

    public IntlPrivilegeDescListTitle(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m11151c(View view) {
        cyo.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m11152d(final C0458a c0458a) {
        this.f7708a.setTypeface(eqh0.c(2), 1);
        this.f7708a.setText(c0458a.f7711a);
        boolean z = c0458a.f7714d;
        TextView textView = this.f7708a;
        if (z) {
            textView.setTextColor(Color.parseColor("#cce8ca8a"));
            this.f7710c.setTextColor(Color.parseColor("#66e8ca8a"));
        } else {
            textView.setTextColor(Color.parseColor("#99000000"));
            this.f7710c.setTextColor(Color.parseColor("#66000000"));
        }
        boolean zB = k0g0.b(c0458a.f7712b);
        TextView textView2 = this.f7710c;
        if (zB) {
            textView2.setVisibility(8);
        } else {
            textView2.setTypeface(eqh0.c(2), 1);
            this.f7710c.setVisibility(0);
            this.f7710c.setText(c0458a.f7712b);
            this.f7710c.setOnClickListener(new View.OnClickListener() { // from class: l.zxo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IntlPrivilegeDescListTitle.C0458a.m11156d(c0458a);
                }
            });
        }
        int i = c0458a.f7713c;
        VImage vImage = this.f7709b;
        if (i <= 0) {
            xdl0.M(vImage, false);
            return;
        }
        xdl0.M(vImage, true);
        this.f7709b.setImageResource(c0458a.f7713c);
        this.f7709b.setOnClickListener(new View.OnClickListener() { // from class: l.ayo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlPrivilegeDescListTitle.C0458a.m11157e(c0458a);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m11151c(this);
    }

    public IntlPrivilegeDescListTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeDescListTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
