package com.p046p1.mobile.putong.live.livingroom.common.usercard.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p046p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.h0k0;
import p149l.vdt;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class UserCardMedalAndNameView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LiveGradientTextView f49415a;

    /* JADX INFO: renamed from: b */
    public VText f49416b;

    /* JADX INFO: renamed from: c */
    public VImage f49417c;

    /* JADX INFO: renamed from: d */
    public VLinear f49418d;

    /* JADX INFO: renamed from: e */
    public VText f49419e;

    /* JADX INFO: renamed from: f */
    public VText f49420f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f49421g;

    /* JADX INFO: renamed from: h */
    public VText f49422h;

    /* JADX INFO: renamed from: i */
    public VText f49423i;

    /* JADX INFO: renamed from: j */
    public ConstraintLayout f49424j;

    /* JADX INFO: renamed from: k */
    public TextView f49425k;

    /* JADX INFO: renamed from: l */
    public CommonMedalView f49426l;

    /* JADX INFO: renamed from: m */
    public CommonMedalView f49427m;

    /* JADX INFO: renamed from: n */
    public CommonMedalView f49428n;

    /* JADX INFO: renamed from: o */
    public CommonMedalView f49429o;

    /* JADX INFO: renamed from: p */
    public CommonMedalView f49430p;

    public UserCardMedalAndNameView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m73336a(View view) {
        h0k0.m128965a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m73337b() {
        this.f49415a.setText("");
        this.f49416b.setText("");
        this.f49423i.setText("");
        this.f49422h.setText("");
        this.f49419e.setText("");
        this.f49420f.setText("");
        this.f49424j.setVisibility(8);
        this.f49421g.setVisibility(8);
        this.f49425k.setText("");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73336a(this);
        if (!vdt.m198092b(2)) {
            xdl0.m208344M(this.f49423i, false);
        } else {
            xdl0.m208344M(this.f49416b, false);
            xdl0.m208344M(this.f49417c, false);
        }
    }

    public UserCardMedalAndNameView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UserCardMedalAndNameView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
