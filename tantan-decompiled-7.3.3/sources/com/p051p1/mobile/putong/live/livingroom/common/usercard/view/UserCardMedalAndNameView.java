package com.p051p1.mobile.putong.live.livingroom.common.usercard.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p051p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.n9k0;
import p153l.wft;

/* JADX INFO: loaded from: classes4.dex */
public class UserCardMedalAndNameView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LiveGradientTextView f50263a;

    /* JADX INFO: renamed from: b */
    public VText f50264b;

    /* JADX INFO: renamed from: c */
    public VImage f50265c;

    /* JADX INFO: renamed from: d */
    public VLinear f50266d;

    /* JADX INFO: renamed from: e */
    public VText f50267e;

    /* JADX INFO: renamed from: f */
    public VText f50268f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f50269g;

    /* JADX INFO: renamed from: h */
    public VText f50270h;

    /* JADX INFO: renamed from: i */
    public VText f50271i;

    /* JADX INFO: renamed from: j */
    public ConstraintLayout f50272j;

    /* JADX INFO: renamed from: k */
    public TextView f50273k;

    /* JADX INFO: renamed from: l */
    public CommonMedalView f50274l;

    /* JADX INFO: renamed from: m */
    public CommonMedalView f50275m;

    /* JADX INFO: renamed from: n */
    public CommonMedalView f50276n;

    /* JADX INFO: renamed from: o */
    public CommonMedalView f50277o;

    /* JADX INFO: renamed from: p */
    public CommonMedalView f50278p;

    public UserCardMedalAndNameView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m74519a(View view) {
        n9k0.m161988a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m74520b() {
        this.f50263a.setText("");
        this.f50264b.setText("");
        this.f50271i.setText("");
        this.f50270h.setText("");
        this.f50267e.setText("");
        this.f50268f.setText("");
        this.f50272j.setVisibility(8);
        this.f50269g.setVisibility(8);
        this.f50273k.setText("");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74519a(this);
        if (!wft.m206159b(2)) {
            bnl0.m105524M(this.f50271i, false);
        } else {
            bnl0.m105524M(this.f50264b, false);
            bnl0.m105524M(this.f50265c, false);
        }
    }

    public UserCardMedalAndNameView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UserCardMedalAndNameView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
