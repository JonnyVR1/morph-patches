package com.p046p1.mobile.putong.live.livingroom.common.chat;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import java.util.Collections;
import p149l.bne0;
import p149l.k25;
import p149l.l9e;
import p149l.n25;
import p149l.pn40;
import p149l.s7m;
import p149l.t100;
import p149l.x15;
import p149l.xdl0;
import p149l.yb2;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class ChatView extends RelativeLayout implements s7m<x15<pn40>> {

    /* JADX INFO: renamed from: a */
    public ChatListView f48737a;

    /* JADX INFO: renamed from: b */
    public View f48738b;

    /* JADX INFO: renamed from: c */
    public View f48739c;

    /* JADX INFO: renamed from: d */
    public x15<pn40> f48740d;

    /* JADX INFO: renamed from: e */
    public boolean f48741e;

    /* JADX INFO: renamed from: f */
    public boolean f48742f;

    /* JADX INFO: renamed from: g */
    public int f48743g;

    /* JADX INFO: renamed from: h */
    public boolean f48744h;

    public ChatView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48741e = true;
        this.f48742f = false;
        this.f48743g = l9e.f127077a;
        this.f48744h = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m72480e(View view) {
        this.f48740d.m206681c4(false, null);
        m72490n();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: b */
    public final void m72481b(View view) {
        n25.m157547a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(x15<pn40> x15Var) {
        this.f48740d = x15Var;
    }

    /* JADX INFO: renamed from: d */
    public void m72483d(int i) {
        int iM186890d = i - t100.f167261j;
        if (iM186890d >= t100.m186890d(195.0f)) {
            iM186890d = t100.m186890d(195.0f);
        }
        ViewGroup.LayoutParams layoutParams = this.f48739c.getLayoutParams();
        layoutParams.width = iM186890d;
        this.f48739c.setLayoutParams(layoutParams);
    }

    @Override // p149l.s7m
    public void destroy() {
        this.f48737a.destroy();
        this.f48741e = true;
        setDefaultHeight(l9e.f127077a);
        k25.m144260a(this, false);
        this.f48737a.m72687I();
        m72488l(false);
        this.f48744h = false;
        this.f48739c.setBackground(yb2.m213884i(637534208, 12));
    }

    /* JADX INFO: renamed from: f */
    public void m72484f() {
        setTranslationY(0.0f);
        xdl0.m208345M0(this.f48739c, true);
        m72485i(false, false);
    }

    /* JADX INFO: renamed from: i */
    public final void m72485i(boolean z, boolean z2) {
        this.f48737a.m72688J();
        int i = z2 ? l9e.f127079c : l9e.f127077a;
        if (!z) {
            i = this.f48743g;
        }
        xdl0.m208344M(this.f48738b, z2);
        m72486j(i, z2);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m72486j(int i, boolean z) {
        ViewGroup.LayoutParams layoutParams = this.f48737a.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.height = i;
        this.f48737a.setLayoutParams(layoutParams);
        if (z) {
            xdl0.m208325C0(this, l9e.f127088l);
        } else {
            xdl0.m208325C0(this, layoutParams.height + l9e.f127087k);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m72487k(Boolean bool, int i, boolean z) {
        if (bool.booleanValue()) {
            m72485i(true, z);
        }
        setTranslationY(-i);
    }

    /* JADX INFO: renamed from: l */
    public void m72488l(boolean z) {
        if (!bne0.m102784m() || Build.VERSION.SDK_INT >= 29) {
            xdl0.m208344M(this, z);
        } else {
            xdl0.m208345M0(this, z);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m72489m(boolean z) {
        xdl0.m208345M0(this.f48739c, z);
    }

    /* JADX INFO: renamed from: n */
    public final void m72490n() {
        zvf0.m220397s("e_live_chat_textbox", this.f48740d.mo77274R2(), Collections.singletonMap("live_chat_textbox_type", "click"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72481b(this);
        k25.m144260a(this, false);
        m72485i(false, false);
        xdl0.m208329E0(this.f48739c, new View.OnClickListener() { // from class: l.l25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125745a.m72480e(view);
            }
        });
    }

    public void setDefaultHeight(int i) {
        if (this.f48742f) {
            i = l9e.f127078b;
        }
        if (this.f48743g == i) {
            return;
        }
        this.f48743g = i;
        m72485i(false, false);
    }

    public void setLiveMode(boolean z) {
        if (this.f48742f != z) {
            this.f48742f = z;
            setDefaultHeight(l9e.f127078b);
        }
    }
}
