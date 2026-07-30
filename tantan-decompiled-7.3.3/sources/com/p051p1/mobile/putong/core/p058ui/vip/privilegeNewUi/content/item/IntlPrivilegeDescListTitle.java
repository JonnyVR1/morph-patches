package com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListTitle;
import p151v.VImage;
import p153l.bnl0;
import p153l.c0p;
import p153l.lyh0;
import p153l.r8g0;
import p153l.szo;

/* JADX INFO: loaded from: classes12.dex */
public class IntlPrivilegeDescListTitle extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextView f38775a;

    /* JADX INFO: renamed from: b */
    public VImage f38776b;

    /* JADX INFO: renamed from: c */
    public TextView f38777c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListTitle$a */
    public static class C9185a implements szo {

        /* JADX INFO: renamed from: a */
        public String f38778a;

        /* JADX INFO: renamed from: b */
        public String f38779b;

        /* JADX INFO: renamed from: c */
        public int f38780c;

        /* JADX INFO: renamed from: d */
        public boolean f38781d;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListTitle$a$a */
        public interface a {
        }

        public C9185a(String str, String str2, boolean z, a aVar) {
            this.f38778a = str;
            this.f38779b = str2;
            this.f38781d = z;
        }

        /* JADX INFO: renamed from: d */
        public static /* bridge */ /* synthetic */ a m58847d(C9185a c9185a) {
            c9185a.getClass();
            return null;
        }

        /* JADX INFO: renamed from: e */
        public static /* bridge */ /* synthetic */ a m58848e(C9185a c9185a) {
            c9185a.getClass();
            return null;
        }

        @Override // p153l.szo
        public int getItemType() {
            return 0;
        }
    }

    public IntlPrivilegeDescListTitle(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m58842c(View view) {
        c0p.m107468a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m58843d(final C9185a c9185a) {
        this.f38775a.setTypeface(lyh0.m156283c(2), 1);
        this.f38775a.setText(c9185a.f38778a);
        boolean z = c9185a.f38781d;
        TextView textView = this.f38775a;
        if (z) {
            textView.setTextColor(Color.parseColor("#cce8ca8a"));
            this.f38777c.setTextColor(Color.parseColor("#66e8ca8a"));
        } else {
            textView.setTextColor(Color.parseColor("#99000000"));
            this.f38777c.setTextColor(Color.parseColor("#66000000"));
        }
        boolean zM180203b = r8g0.m180203b(c9185a.f38779b);
        TextView textView2 = this.f38777c;
        if (zM180203b) {
            textView2.setVisibility(8);
        } else {
            textView2.setTypeface(lyh0.m156283c(2), 1);
            this.f38777c.setVisibility(0);
            this.f38777c.setText(c9185a.f38779b);
            this.f38777c.setOnClickListener(new View.OnClickListener() { // from class: l.zzo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IntlPrivilegeDescListTitle.C9185a.m58847d(c9185a);
                }
            });
        }
        int i = c9185a.f38780c;
        VImage vImage = this.f38776b;
        if (i <= 0) {
            bnl0.m105524M(vImage, false);
            return;
        }
        bnl0.m105524M(vImage, true);
        this.f38776b.setImageResource(c9185a.f38780c);
        this.f38776b.setOnClickListener(new View.OnClickListener() { // from class: l.a0p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlPrivilegeDescListTitle.C9185a.m58848e(c9185a);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58842c(this);
    }

    public IntlPrivilegeDescListTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeDescListTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
