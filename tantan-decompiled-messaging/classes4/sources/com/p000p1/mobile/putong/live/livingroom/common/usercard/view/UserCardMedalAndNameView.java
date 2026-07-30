package com.p000p1.mobile.putong.live.livingroom.common.usercard.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import l.vdt;
import l.xdl0;
import p002l.h0k0;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class UserCardMedalAndNameView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LiveGradientTextView f5457a;

    /* JADX INFO: renamed from: b */
    public VText f5458b;

    /* JADX INFO: renamed from: c */
    public VImage f5459c;

    /* JADX INFO: renamed from: d */
    public VLinear f5460d;

    /* JADX INFO: renamed from: e */
    public VText f5461e;

    /* JADX INFO: renamed from: f */
    public VText f5462f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f5463g;

    /* JADX INFO: renamed from: h */
    public VText f5464h;

    /* JADX INFO: renamed from: i */
    public VText f5465i;

    /* JADX INFO: renamed from: j */
    public ConstraintLayout f5466j;

    /* JADX INFO: renamed from: k */
    public TextView f5467k;

    /* JADX INFO: renamed from: l */
    public CommonMedalView f5468l;

    /* JADX INFO: renamed from: m */
    public CommonMedalView f5469m;

    /* JADX INFO: renamed from: n */
    public CommonMedalView f5470n;

    /* JADX INFO: renamed from: o */
    public CommonMedalView f5471o;

    /* JADX INFO: renamed from: p */
    public CommonMedalView f5472p;

    public UserCardMedalAndNameView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m6872a(View view) {
        h0k0.m14123a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m6873b() {
        this.f5457a.setText("");
        this.f5458b.setText("");
        this.f5465i.setText("");
        this.f5464h.setText("");
        this.f5461e.setText("");
        this.f5462f.setText("");
        this.f5466j.setVisibility(8);
        this.f5463g.setVisibility(8);
        this.f5467k.setText("");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6872a(this);
        if (!vdt.b(2)) {
            xdl0.M(this.f5465i, false);
        } else {
            xdl0.M(this.f5458b, false);
            xdl0.M(this.f5459c, false);
        }
    }

    public UserCardMedalAndNameView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UserCardMedalAndNameView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
