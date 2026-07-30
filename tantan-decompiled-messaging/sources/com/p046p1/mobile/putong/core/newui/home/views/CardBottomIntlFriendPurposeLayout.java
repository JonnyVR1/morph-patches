package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.data.User;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText_NoTopPadding;
import p149l.d5m;
import p149l.gh4;
import p149l.lfn;
import p149l.vwb;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomIntlFriendPurposeLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public CardBottomBaseInfoView f23481c;

    /* JADX INFO: renamed from: d */
    public VLinear f23482d;

    /* JADX INFO: renamed from: e */
    public VImage f23483e;

    /* JADX INFO: renamed from: f */
    public VText_NoTopPadding f23484f;

    public CardBottomIntlFriendPurposeLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: P */
    public final void m38915P(View view) {
        gh4.m126152a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m38916Q(User user, d5m d5mVar) {
        if (vwb.m200296J(user.profile.extensions.basic.intlFriendPurposeV2)) {
            return;
        }
        this.f23482d.setVisibility(0);
        lfn.C18216a c18216aM149726a = lfn.INSTANCE.m149726a(user.profile.extensions.basic.intlFriendPurposeV2.get(0));
        if (c18216aM149726a == null) {
            this.f23482d.setVisibility(8);
        } else {
            this.f23484f.setText(c18216aM149726a.getName());
            this.f23483e.setImageResource(c18216aM149726a.getIcon());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38915P(this);
        setLayerType(1, null);
    }

    public CardBottomIntlFriendPurposeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardBottomIntlFriendPurposeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
