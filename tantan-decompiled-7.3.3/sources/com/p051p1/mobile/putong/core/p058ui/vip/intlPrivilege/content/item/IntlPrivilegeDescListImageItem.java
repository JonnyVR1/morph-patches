package com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import p151v.VDraweeView;
import p153l.jzo;
import p153l.tzo;
import p153l.uqb0;

/* JADX INFO: loaded from: classes12.dex */
public class IntlPrivilegeDescListImageItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f37997a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListImageItem$a */
    public static class C9114a implements tzo {

        /* JADX INFO: renamed from: a */
        public String f37998a;

        public C9114a(String str) {
            this.f37998a = str;
        }

        @Override // p153l.tzo
        public int getItemType() {
            return 2;
        }
    }

    public IntlPrivilegeDescListImageItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m57670a(View view) {
        jzo.m147673a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m57671b(C9114a c9114a) {
        this.f37997a.setVisibility(0);
        uqb0.f180374G.m127115L0(this.f37997a, c9114a.f37998a);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57670a(this);
    }

    public IntlPrivilegeDescListImageItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeDescListImageItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
