package com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import p151v.VDraweeView;
import p153l.kzo;
import p153l.szo;
import p153l.uqb0;

/* JADX INFO: loaded from: classes12.dex */
public class IntlPrivilegeDescListImageItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f38751a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListImageItem$a */
    public static class C9182a implements szo {

        /* JADX INFO: renamed from: a */
        public String f38752a;

        public C9182a(String str) {
            this.f38752a = str;
        }

        @Override // p153l.szo
        public int getItemType() {
            return 2;
        }
    }

    public IntlPrivilegeDescListImageItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m58824a(View view) {
        kzo.m152212a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m58825b(@NonNull C9182a c9182a) {
        uqb0.f180374G.m127115L0(this.f38751a, c9182a.f38752a);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58824a(this);
    }

    public IntlPrivilegeDescListImageItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeDescListImageItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
