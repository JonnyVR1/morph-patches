package com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import p147v.VDraweeView;
import p149l.kxo;
import p149l.qib0;
import p149l.sxo;

/* JADX INFO: loaded from: classes9.dex */
public class IntlPrivilegeDescListImageItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f37903a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListImageItem$a */
    public static class C9019a implements sxo {

        /* JADX INFO: renamed from: a */
        public String f37904a;

        public C9019a(String str) {
            this.f37904a = str;
        }

        @Override // p149l.sxo
        public int getItemType() {
            return 2;
        }
    }

    public IntlPrivilegeDescListImageItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m57641a(View view) {
        kxo.m147804a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m57642b(@NonNull C9019a c9019a) {
        qib0.f154691G.m102331L0(this.f37903a, c9019a.f37904a);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57641a(this);
    }

    public IntlPrivilegeDescListImageItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeDescListImageItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
