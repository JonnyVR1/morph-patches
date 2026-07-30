package com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.DrawableRes;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListSeeItem;
import com.tantanapp.common.utils.NullChecker;
import p147v.VIcon;
import p147v.VText;
import p149l.sxo;
import p149l.yxo;

/* JADX INFO: loaded from: classes9.dex */
public class IntlPrivilegeDescListSeeItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VIcon f37917a;

    /* JADX INFO: renamed from: b */
    public VText f37918b;

    /* JADX INFO: renamed from: c */
    public VText f37919c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListSeeItem$a */
    public static class C9021a implements sxo {

        /* JADX INFO: renamed from: a */
        @DrawableRes
        public int f37920a;

        /* JADX INFO: renamed from: b */
        public String f37921b;

        /* JADX INFO: renamed from: c */
        public SpannableStringBuilder f37922c;

        /* JADX INFO: renamed from: d */
        public String f37923d;

        /* JADX INFO: renamed from: e */
        public Privilege f37924e;

        /* JADX INFO: renamed from: f */
        public PurchaseType f37925f;

        /* JADX INFO: renamed from: g */
        public IntlPrivilegeDescListItem.C9020a.a f37926g;

        public C9021a(int i, String str, SpannableStringBuilder spannableStringBuilder, Privilege privilege, PurchaseType purchaseType) {
            this.f37920a = i;
            this.f37921b = str;
            this.f37922c = spannableStringBuilder;
            this.f37924e = privilege;
            this.f37925f = purchaseType;
        }

        @Override // p149l.sxo
        public int getItemType() {
            return 3;
        }
    }

    public IntlPrivilegeDescListSeeItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m57654a(C9021a c9021a, View view) {
        IntlPrivilegeDescListItem.C9020a.a aVar = c9021a.f37926g;
        if (aVar != null) {
            aVar.mo57640a(view, c9021a.f37924e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m57655b(View view) {
        yxo.m216468a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m57656c(final C9021a c9021a) {
        this.f37917a.setImageResource(c9021a.f37920a);
        this.f37918b.setText(c9021a.f37921b);
        this.f37918b.getPaint().setFakeBoldText(true);
        boolean zM81303a = NullChecker.m81303a(c9021a.f37922c);
        VText vText = this.f37919c;
        if (zM81303a) {
            vText.setText(c9021a.f37922c);
        } else {
            vText.setText(c9021a.f37923d);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.wxo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlPrivilegeDescListSeeItem.m57654a(c9021a, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57655b(this);
    }

    public IntlPrivilegeDescListSeeItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeDescListSeeItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
