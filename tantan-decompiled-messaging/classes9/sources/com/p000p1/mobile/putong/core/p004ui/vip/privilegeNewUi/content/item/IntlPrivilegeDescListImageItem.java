package com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import l.kxo;
import p006l.qib0;
import p006l.sxo;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlPrivilegeDescListImageItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f7684a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListImageItem$a */
    public static class C0455a implements sxo {

        /* JADX INFO: renamed from: a */
        public String f7685a;

        public C0455a(String str) {
            this.f7685a = str;
        }

        @Override // p006l.sxo
        public int getItemType() {
            return 2;
        }
    }

    public IntlPrivilegeDescListImageItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m11133a(View view) {
        kxo.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m11134b(@NonNull C0455a c0455a) {
        qib0.f19782G.m12744L0(this.f7684a, c0455a.f7685a);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m11133a(this);
    }

    public IntlPrivilegeDescListImageItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeDescListImageItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
