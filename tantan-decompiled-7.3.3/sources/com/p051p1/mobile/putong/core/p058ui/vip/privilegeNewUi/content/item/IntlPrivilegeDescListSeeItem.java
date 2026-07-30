package com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.DrawableRes;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListSeeItem;
import com.tantanapp.common.utils.NullChecker;
import p151v.VIcon;
import p151v.VText;
import p153l.szo;
import p153l.yzo;

/* JADX INFO: loaded from: classes12.dex */
public class IntlPrivilegeDescListSeeItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VIcon f38765a;

    /* JADX INFO: renamed from: b */
    public VText f38766b;

    /* JADX INFO: renamed from: c */
    public VText f38767c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListSeeItem$a */
    public static class C9184a implements szo {

        /* JADX INFO: renamed from: a */
        @DrawableRes
        public int f38768a;

        /* JADX INFO: renamed from: b */
        public String f38769b;

        /* JADX INFO: renamed from: c */
        public SpannableStringBuilder f38770c;

        /* JADX INFO: renamed from: d */
        public String f38771d;

        /* JADX INFO: renamed from: e */
        public Privilege f38772e;

        /* JADX INFO: renamed from: f */
        public PurchaseType f38773f;

        /* JADX INFO: renamed from: g */
        public IntlPrivilegeDescListItem.C9183a.a f38774g;

        public C9184a(int i, String str, SpannableStringBuilder spannableStringBuilder, Privilege privilege, PurchaseType purchaseType) {
            this.f38768a = i;
            this.f38769b = str;
            this.f38770c = spannableStringBuilder;
            this.f38772e = privilege;
            this.f38773f = purchaseType;
        }

        @Override // p153l.szo
        public int getItemType() {
            return 3;
        }
    }

    public IntlPrivilegeDescListSeeItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m58837a(C9184a c9184a, View view) {
        IntlPrivilegeDescListItem.C9183a.a aVar = c9184a.f38774g;
        if (aVar != null) {
            aVar.mo58823a(view, c9184a.f38772e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m58838b(View view) {
        yzo.m218025a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m58839c(final C9184a c9184a) {
        this.f38765a.setImageResource(c9184a.f38768a);
        this.f38766b.setText(c9184a.f38769b);
        this.f38766b.getPaint().setFakeBoldText(true);
        boolean zM82486a = NullChecker.m82486a(c9184a.f38770c);
        VText vText = this.f38767c;
        if (zM82486a) {
            vText.setText(c9184a.f38770c);
        } else {
            vText.setText(c9184a.f38771d);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.wzo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlPrivilegeDescListSeeItem.m58837a(c9184a, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58838b(this);
    }

    public IntlPrivilegeDescListSeeItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeDescListSeeItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
