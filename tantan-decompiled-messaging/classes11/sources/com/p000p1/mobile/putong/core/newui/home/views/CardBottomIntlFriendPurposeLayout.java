package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p1.mobile.putong.data.User;
import l.gh4;
import l.vwb;
import p009l.d5m;
import p009l.lfn;
import v.VImage;
import v.VLinear;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardBottomIntlFriendPurposeLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public CardBottomBaseInfoView f2259c;

    /* JADX INFO: renamed from: d */
    public VLinear f2260d;

    /* JADX INFO: renamed from: e */
    public VImage f2261e;

    /* JADX INFO: renamed from: f */
    public VText_NoTopPadding f2262f;

    public CardBottomIntlFriendPurposeLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: P */
    public final void m2922P(View view) {
        gh4.a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m2923Q(User user, d5m d5mVar) {
        if (vwb.J(user.profile.extensions.basic.intlFriendPurposeV2)) {
            return;
        }
        this.f2260d.setVisibility(0);
        lfn.C1015a c1015aM17877a = lfn.INSTANCE.m17877a((String) user.profile.extensions.basic.intlFriendPurposeV2.get(0));
        if (c1015aM17877a == null) {
            this.f2260d.setVisibility(8);
        } else {
            this.f2262f.setText(c1015aM17877a.getName());
            this.f2261e.setImageResource(c1015aM17877a.getIcon());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2922P(this);
        setLayerType(1, null);
    }

    public CardBottomIntlFriendPurposeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardBottomIntlFriendPurposeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
