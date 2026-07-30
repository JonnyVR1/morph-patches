package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.data.User;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText_NoTopPadding;
import p153l.fi4;
import p153l.jyb;
import p153l.lhn;
import p153l.t7m;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomIntlFriendPurposeLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public CardBottomBaseInfoView f24223c;

    /* JADX INFO: renamed from: d */
    public VLinear f24224d;

    /* JADX INFO: renamed from: e */
    public VImage f24225e;

    /* JADX INFO: renamed from: f */
    public VText_NoTopPadding f24226f;

    public CardBottomIntlFriendPurposeLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: P */
    public final void m39918P(View view) {
        fi4.m125668a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m39919Q(User user, t7m t7mVar) {
        if (jyb.m147479J(user.profile.extensions.basic.intlFriendPurposeV2)) {
            return;
        }
        this.f24224d.setVisibility(0);
        lhn.C18395a c18395aM154230a = lhn.INSTANCE.m154230a(user.profile.extensions.basic.intlFriendPurposeV2.get(0));
        if (c18395aM154230a == null) {
            this.f24224d.setVisibility(8);
        } else {
            this.f24226f.setText(c18395aM154230a.getName());
            this.f24225e.setImageResource(c18395aM154230a.getIcon());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39918P(this);
        setLayerType(1, null);
    }

    public CardBottomIntlFriendPurposeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardBottomIntlFriendPurposeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
