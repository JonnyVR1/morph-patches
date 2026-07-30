package com.p000p1.mobile.putong.live.livingroom.common.chat;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import java.util.Collections;
import l.bne0;
import l.l9e;
import l.s7m;
import l.t100;
import l.xdl0;
import l.yb2;
import l.zvf0;
import p002l.k25;
import p002l.n25;
import p002l.pn40;
import p002l.x15;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ChatView extends RelativeLayout implements s7m<x15<pn40>> {

    /* JADX INFO: renamed from: a */
    public ChatListView f4779a;

    /* JADX INFO: renamed from: b */
    public View f4780b;

    /* JADX INFO: renamed from: c */
    public View f4781c;

    /* JADX INFO: renamed from: d */
    public x15<pn40> f4782d;

    /* JADX INFO: renamed from: e */
    public boolean f4783e;

    /* JADX INFO: renamed from: f */
    public boolean f4784f;

    /* JADX INFO: renamed from: g */
    public int f4785g;

    /* JADX INFO: renamed from: h */
    public boolean f4786h;

    public ChatView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4783e = true;
        this.f4784f = false;
        this.f4785g = l9e.a;
        this.f4786h = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m5970e(View view) {
        this.f4782d.m25599c4(false, null);
        m5982n();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m5971C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: b */
    public final void m5972b(View view) {
        n25.m18425a(this, view);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m5977i1(x15<pn40> x15Var) {
        this.f4782d = x15Var;
    }

    /* JADX INFO: renamed from: d */
    public void m5974d(int i) {
        int iD = i - t100.j;
        if (iD >= t100.d(195.0f)) {
            iD = t100.d(195.0f);
        }
        ViewGroup.LayoutParams layoutParams = this.f4781c.getLayoutParams();
        layoutParams.width = iD;
        this.f4781c.setLayoutParams(layoutParams);
    }

    public void destroy() {
        this.f4779a.destroy();
        this.f4783e = true;
        setDefaultHeight(l9e.a);
        k25.m16465a(this, false);
        this.f4779a.m6190I();
        m5980l(false);
        this.f4786h = false;
        this.f4781c.setBackground(yb2.i(637534208, 12));
    }

    /* JADX INFO: renamed from: f */
    public void m5975f() {
        setTranslationY(0.0f);
        xdl0.M0(this.f4781c, true);
        m5976i(false, false);
    }

    /* JADX INFO: renamed from: i */
    public final void m5976i(boolean z, boolean z2) {
        this.f4779a.m6191J();
        int i = z2 ? l9e.c : l9e.a;
        if (!z) {
            i = this.f4785g;
        }
        xdl0.M(this.f4780b, z2);
        m5978j(i, z2);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m5978j(int i, boolean z) {
        ViewGroup.LayoutParams layoutParams = this.f4779a.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.height = i;
        this.f4779a.setLayoutParams(layoutParams);
        if (z) {
            xdl0.C0(this, l9e.l);
        } else {
            xdl0.C0(this, layoutParams.height + l9e.k);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m5979k(Boolean bool, int i, boolean z) {
        if (bool.booleanValue()) {
            m5976i(true, z);
        }
        setTranslationY(-i);
    }

    /* JADX INFO: renamed from: l */
    public void m5980l(boolean z) {
        if (!bne0.m() || Build.VERSION.SDK_INT >= 29) {
            xdl0.M(this, z);
        } else {
            xdl0.M0(this, z);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m5981m(boolean z) {
        xdl0.M0(this.f4781c, z);
    }

    /* JADX INFO: renamed from: n */
    public final void m5982n() {
        zvf0.s("e_live_chat_textbox", this.f4782d.mo21430R2(), Collections.singletonMap("live_chat_textbox_type", "click"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5972b(this);
        k25.m16465a(this, false);
        m5976i(false, false);
        xdl0.E0(this.f4781c, new View.OnClickListener() { // from class: l.l25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14655a.m5970e(view);
            }
        });
    }

    public void setDefaultHeight(int i) {
        if (this.f4784f) {
            i = l9e.b;
        }
        if (this.f4785g == i) {
            return;
        }
        this.f4785g = i;
        m5976i(false, false);
    }

    public void setLiveMode(boolean z) {
        if (this.f4784f != z) {
            this.f4784f = z;
            setDefaultHeight(l9e.b);
        }
    }
}
