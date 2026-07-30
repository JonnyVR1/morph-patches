package com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.item;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.DrawableRes;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListSeeItem;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.NullChecker;
import l.yxo;
import p006l.sxo;
import v.VIcon;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlPrivilegeDescListSeeItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VIcon f7698a;

    /* JADX INFO: renamed from: b */
    public VText f7699b;

    /* JADX INFO: renamed from: c */
    public VText f7700c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListSeeItem$a */
    public static class C0457a implements sxo {

        /* JADX INFO: renamed from: a */
        @DrawableRes
        public int f7701a;

        /* JADX INFO: renamed from: b */
        public String f7702b;

        /* JADX INFO: renamed from: c */
        public SpannableStringBuilder f7703c;

        /* JADX INFO: renamed from: d */
        public String f7704d;

        /* JADX INFO: renamed from: e */
        public Privilege f7705e;

        /* JADX INFO: renamed from: f */
        public PurchaseType f7706f;

        /* JADX INFO: renamed from: g */
        public IntlPrivilegeDescListItem.C0456a.a f7707g;

        public C0457a(int i, String str, SpannableStringBuilder spannableStringBuilder, Privilege privilege, PurchaseType purchaseType) {
            this.f7701a = i;
            this.f7702b = str;
            this.f7703c = spannableStringBuilder;
            this.f7705e = privilege;
            this.f7706f = purchaseType;
        }

        @Override // p006l.sxo
        public int getItemType() {
            return 3;
        }
    }

    public IntlPrivilegeDescListSeeItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m11146a(C0457a c0457a, View view) {
        IntlPrivilegeDescListItem.C0456a.a aVar = c0457a.f7707g;
        if (aVar != null) {
            aVar.mo11132a(view, c0457a.f7705e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11147b(View view) {
        yxo.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m11148c(final C0457a c0457a) {
        this.f7698a.setImageResource(c0457a.f7701a);
        this.f7699b.setText(c0457a.f7702b);
        this.f7699b.getPaint().setFakeBoldText(true);
        boolean zA = NullChecker.a(c0457a.f7703c);
        VText vText = this.f7700c;
        if (zA) {
            vText.setText(c0457a.f7703c);
        } else {
            vText.setText(c0457a.f7704d);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.wxo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlPrivilegeDescListSeeItem.m11146a(c0457a, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m11147b(this);
    }

    public IntlPrivilegeDescListSeeItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeDescListSeeItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
