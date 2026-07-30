package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.CoreModule;
import l.e30;
import l.f30;
import l.ge6;
import l.j760;
import l.mji0;
import l.mkd0;
import l.u4c0;
import l.v7c0;
import l.xdl0;
import l.zvf0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationLeftToolBar extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f3733a;

    /* JADX INFO: renamed from: b */
    public VText f3734b;

    /* JADX INFO: renamed from: c */
    public VText f3735c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f3736d;

    /* JADX INFO: renamed from: e */
    public VText f3737e;

    /* JADX INFO: renamed from: f */
    public VText f3738f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f3739g;

    /* JADX INFO: renamed from: h */
    public VText f3740h;

    /* JADX INFO: renamed from: i */
    public VText f3741i;

    /* JADX INFO: renamed from: j */
    public int f3742j;

    /* JADX INFO: renamed from: k */
    public final int f3743k;

    /* JADX INFO: renamed from: l */
    public int f3744l;

    /* JADX INFO: renamed from: m */
    public int f3745m;

    public ConversationLeftToolBar(Context context) {
        super(context);
        this.f3742j = -1;
        this.f3743k = 0;
        this.f3744l = 2;
        this.f3745m = 0;
    }

    private void setBarStyle(int i) {
        int color = Color.parseColor("#FF000000");
        int color2 = Color.parseColor("#66000000");
        this.f3734b.setTextColor(i == 0 ? color : color2);
        VText vText = this.f3734b;
        if (i == 0) {
            mji0.o(vText, v7c0.B);
        } else {
            mji0.o(vText, v7c0.C);
        }
        VText vText2 = this.f3740h;
        if (vText2 != null) {
            if (i != this.f3744l) {
                color = color2;
            }
            vText2.setTextColor(color);
            int i2 = this.f3744l;
            VText vText3 = this.f3740h;
            if (i == i2) {
                mji0.o(vText3, v7c0.B);
            } else {
                mji0.o(vText3, v7c0.C);
            }
        }
        int i3 = this.f3745m;
        if (i3 > 0) {
            this.f3734b.setTextSize(i3);
            VText vText4 = this.f3740h;
            if (vText4 != null) {
                vText4.setTextSize(this.f3745m);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5164d(View view) {
        ge6.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m5165e(final Frag frag, @NonNull final f30<Integer, Boolean> f30Var) {
        setBarStyle(0);
        xdl0.E0(this.f3734b, new View.OnClickListener() { // from class: l.de6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11784a.m5167g(f30Var, view);
            }
        });
        VText vText = this.f3740h;
        if (vText != null) {
            xdl0.E0(vText, new View.OnClickListener() { // from class: l.ee6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f12519a.m5168h(f30Var, view);
                }
            });
        }
        frag.act().duringCreated(CoreModule.c.f0.q2.asObservable().distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.fe6
            public final void call(Object obj) {
                this.f12961a.m5169i(frag, (j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public void m5166f() {
        FrameLayout frameLayout = this.f3739g;
        if (frameLayout != null) {
            xdl0.M(frameLayout, true);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m5167g(f30 f30Var, View view) {
        zvf0.r("e_messages_view", "p_messages_view");
        if (this.f3742j == 0) {
            return;
        }
        f30Var.call(0, Boolean.valueOf(xdl0.O0(this.f3735c)));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m5168h(f30 f30Var, View view) {
        zvf0.r("e_message_tab_whisper_entry_click", "p_messages_view");
        int i = this.f3742j;
        int i2 = this.f3744l;
        if (i == i2) {
            return;
        }
        f30Var.call(Integer.valueOf(i2), Boolean.FALSE);
        m5172l(false);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m5169i(Frag frag, j760 j760Var) {
        if (j760Var == null || j760Var.a == null || frag.isHidden()) {
            return;
        }
        m5171k(this.f3742j);
        if (this.f3742j != 0) {
            m5170j(((Integer) j760Var.a).intValue() > 0);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m5170j(boolean z) {
        xdl0.M(this.f3735c, z);
    }

    /* JADX INFO: renamed from: k */
    public void m5171k(int i) {
        if (i < 0) {
            return;
        }
        setBarStyle(i);
        if (i == 0) {
            m5170j(false);
        }
        if (i != this.f3742j) {
            this.f3742j = i;
            zvf0.x("e_messages_view", "p_messages_view");
        }
    }

    /* JADX INFO: renamed from: l */
    public void m5172l(boolean z) {
        VText vText = this.f3741i;
        if (vText != null) {
            xdl0.M(vText, z);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5164d(this);
        this.f3739g = (FrameLayout) findViewById(u4c0.Ef);
        this.f3740h = findViewById(u4c0.Nf);
        this.f3741i = findViewById(u4c0.Kf);
    }

    public void setIntlTabTextSize(int i) {
        this.f3745m = i;
    }

    public void setWhisperTabPosition(int i) {
        if (i >= 0) {
            this.f3744l = i;
        }
    }

    public ConversationLeftToolBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3742j = -1;
        this.f3743k = 0;
        this.f3744l = 2;
        this.f3745m = 0;
    }

    public ConversationLeftToolBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3742j = -1;
        this.f3743k = 0;
        this.f3744l = 2;
        this.f3745m = 0;
    }
}
