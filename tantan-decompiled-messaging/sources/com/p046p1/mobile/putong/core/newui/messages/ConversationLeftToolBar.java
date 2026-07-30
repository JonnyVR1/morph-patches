package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import p147v.VText;
import p149l.e30;
import p149l.f30;
import p149l.ge6;
import p149l.j760;
import p149l.mji0;
import p149l.mkd0;
import p149l.u4c0;
import p149l.v7c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationLeftToolBar extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f24955a;

    /* JADX INFO: renamed from: b */
    public VText f24956b;

    /* JADX INFO: renamed from: c */
    public VText f24957c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f24958d;

    /* JADX INFO: renamed from: e */
    public VText f24959e;

    /* JADX INFO: renamed from: f */
    public VText f24960f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f24961g;

    /* JADX INFO: renamed from: h */
    public VText f24962h;

    /* JADX INFO: renamed from: i */
    public VText f24963i;

    /* JADX INFO: renamed from: j */
    public int f24964j;

    /* JADX INFO: renamed from: k */
    public final int f24965k;

    /* JADX INFO: renamed from: l */
    public int f24966l;

    /* JADX INFO: renamed from: m */
    public int f24967m;

    public ConversationLeftToolBar(Context context) {
        super(context);
        this.f24964j = -1;
        this.f24965k = 0;
        this.f24966l = 2;
        this.f24967m = 0;
    }

    private void setBarStyle(int i) {
        int color = Color.parseColor("#FF000000");
        int color2 = Color.parseColor("#66000000");
        this.f24956b.setTextColor(i == 0 ? color : color2);
        VText vText = this.f24956b;
        if (i == 0) {
            mji0.m154821o(vText, v7c0.f180347B);
        } else {
            mji0.m154821o(vText, v7c0.f180348C);
        }
        VText vText2 = this.f24962h;
        if (vText2 != null) {
            if (i != this.f24966l) {
                color = color2;
            }
            vText2.setTextColor(color);
            int i2 = this.f24966l;
            VText vText3 = this.f24962h;
            if (i == i2) {
                mji0.m154821o(vText3, v7c0.f180347B);
            } else {
                mji0.m154821o(vText3, v7c0.f180348C);
            }
        }
        int i3 = this.f24967m;
        if (i3 > 0) {
            this.f24956b.setTextSize(i3);
            VText vText4 = this.f24962h;
            if (vText4 != null) {
                vText4.setTextSize(this.f24967m);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m41062d(View view) {
        ge6.m125680a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m41063e(final Frag frag, @NonNull final f30<Integer, Boolean> f30Var) {
        setBarStyle(0);
        xdl0.m208329E0(this.f24956b, new View.OnClickListener() { // from class: l.de6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85717a.m41065g(f30Var, view);
            }
        });
        VText vText = this.f24962h;
        if (vText != null) {
            xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.ee6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f90674a.m41066h(f30Var, view);
                }
            });
        }
        frag.act().duringCreated(CoreModule.f17545c.f19642f0.f19969q2.asObservable().distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.fe6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97099a.m41067i(frag, (j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public void m41064f() {
        FrameLayout frameLayout = this.f24961g;
        if (frameLayout != null) {
            xdl0.m208344M(frameLayout, true);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m41065g(f30 f30Var, View view) {
        zvf0.m220396r("e_messages_view", OMSDialogPositon.p_messages_view);
        if (this.f24964j == 0) {
            return;
        }
        f30Var.call(0, Boolean.valueOf(xdl0.m208349O0(this.f24957c)));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m41066h(f30 f30Var, View view) {
        zvf0.m220396r("e_message_tab_whisper_entry_click", OMSDialogPositon.p_messages_view);
        int i = this.f24964j;
        int i2 = this.f24966l;
        if (i == i2) {
            return;
        }
        f30Var.call(Integer.valueOf(i2), Boolean.FALSE);
        m41070l(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m41067i(Frag frag, j760 j760Var) {
        if (j760Var == null || j760Var.f116564a == 0 || frag.isHidden()) {
            return;
        }
        m41069k(this.f24964j);
        if (this.f24964j != 0) {
            m41068j(((Integer) j760Var.f116564a).intValue() > 0);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m41068j(boolean z) {
        xdl0.m208344M(this.f24957c, z);
    }

    /* JADX INFO: renamed from: k */
    public void m41069k(int i) {
        if (i < 0) {
            return;
        }
        setBarStyle(i);
        if (i == 0) {
            m41068j(false);
        }
        if (i != this.f24964j) {
            this.f24964j = i;
            zvf0.m220402x("e_messages_view", OMSDialogPositon.p_messages_view);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m41070l(boolean z) {
        VText vText = this.f24963i;
        if (vText != null) {
            xdl0.m208344M(vText, z);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41062d(this);
        this.f24961g = (FrameLayout) findViewById(u4c0.f173800Ef);
        this.f24962h = (VText) findViewById(u4c0.f173953Nf);
        this.f24963i = (VText) findViewById(u4c0.f173902Kf);
    }

    public void setIntlTabTextSize(int i) {
        this.f24967m = i;
    }

    public void setWhisperTabPosition(int i) {
        if (i >= 0) {
            this.f24966l = i;
        }
    }

    public ConversationLeftToolBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24964j = -1;
        this.f24965k = 0;
        this.f24966l = 2;
        this.f24967m = 0;
    }

    public ConversationLeftToolBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24964j = -1;
        this.f24965k = 0;
        this.f24966l = 2;
        this.f24967m = 0;
    }
}
