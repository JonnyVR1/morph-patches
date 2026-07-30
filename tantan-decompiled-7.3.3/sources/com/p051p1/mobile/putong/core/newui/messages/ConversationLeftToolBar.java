package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import p151v.VText;
import p153l.adc0;
import p153l.agc0;
import p153l.bnl0;
import p153l.i4g0;
import p153l.jf6;
import p153l.msi0;
import p153l.pf60;
import p153l.psd0;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationLeftToolBar extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f25697a;

    /* JADX INFO: renamed from: b */
    public VText f25698b;

    /* JADX INFO: renamed from: c */
    public VText f25699c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f25700d;

    /* JADX INFO: renamed from: e */
    public VText f25701e;

    /* JADX INFO: renamed from: f */
    public VText f25702f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f25703g;

    /* JADX INFO: renamed from: h */
    public VText f25704h;

    /* JADX INFO: renamed from: i */
    public VText f25705i;

    /* JADX INFO: renamed from: j */
    public int f25706j;

    /* JADX INFO: renamed from: k */
    public final int f25707k;

    /* JADX INFO: renamed from: l */
    public int f25708l;

    /* JADX INFO: renamed from: m */
    public int f25709m;

    public ConversationLeftToolBar(Context context) {
        super(context);
        this.f25706j = -1;
        this.f25707k = 0;
        this.f25708l = 2;
        this.f25709m = 0;
    }

    private void setBarStyle(int i) {
        int color = Color.parseColor("#FF000000");
        int color2 = Color.parseColor("#66000000");
        this.f25698b.setTextColor(i == 0 ? color : color2);
        VText vText = this.f25698b;
        if (i == 0) {
            msi0.m159817o(vText, agc0.f71108B);
        } else {
            msi0.m159817o(vText, agc0.f71109C);
        }
        VText vText2 = this.f25704h;
        if (vText2 != null) {
            if (i != this.f25708l) {
                color = color2;
            }
            vText2.setTextColor(color);
            int i2 = this.f25708l;
            VText vText3 = this.f25704h;
            if (i == i2) {
                msi0.m159817o(vText3, agc0.f71108B);
            } else {
                msi0.m159817o(vText3, agc0.f71109C);
            }
        }
        int i3 = this.f25709m;
        if (i3 > 0) {
            this.f25698b.setTextSize(i3);
            VText vText4 = this.f25704h;
            if (vText4 != null) {
                vText4.setTextSize(this.f25709m);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m42073d(View view) {
        jf6.m144665a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m42074e(final Frag frag, @NonNull final z20<Integer, Boolean> z20Var) {
        setBarStyle(0);
        bnl0.m105509E0(this.f25698b, new View.OnClickListener() { // from class: l.gf6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103883a.m42076g(z20Var, view);
            }
        });
        VText vText = this.f25704h;
        if (vText != null) {
            bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.hf6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f109217a.m42077h(z20Var, view);
                }
            });
        }
        frag.act().duringCreated(CoreModule.f18264c.f20384f0.f20711q2.asObservable().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.if6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114648a.m42078i(frag, (pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public void m42075f() {
        FrameLayout frameLayout = this.f25703g;
        if (frameLayout != null) {
            bnl0.m105524M(frameLayout, true);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m42076g(z20 z20Var, View view) {
        i4g0.m138520r("e_messages_view", OMSDialogPositon.p_messages_view);
        if (this.f25706j == 0) {
            return;
        }
        z20Var.call(0, Boolean.valueOf(bnl0.m105529O0(this.f25699c)));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m42077h(z20 z20Var, View view) {
        i4g0.m138520r("e_message_tab_whisper_entry_click", OMSDialogPositon.p_messages_view);
        int i = this.f25706j;
        int i2 = this.f25708l;
        if (i == i2) {
            return;
        }
        z20Var.call(Integer.valueOf(i2), Boolean.FALSE);
        m42081l(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m42078i(Frag frag, pf60 pf60Var) {
        if (pf60Var == null || pf60Var.f152156a == 0 || frag.isHidden()) {
            return;
        }
        m42080k(this.f25706j);
        if (this.f25706j != 0) {
            m42079j(((Integer) pf60Var.f152156a).intValue() > 0);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m42079j(boolean z) {
        bnl0.m105524M(this.f25699c, z);
    }

    /* JADX INFO: renamed from: k */
    public void m42080k(int i) {
        if (i < 0) {
            return;
        }
        setBarStyle(i);
        if (i == 0) {
            m42079j(false);
        }
        if (i != this.f25706j) {
            this.f25706j = i;
            i4g0.m138526x("e_messages_view", OMSDialogPositon.p_messages_view);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m42081l(boolean z) {
        VText vText = this.f25705i;
        if (vText != null) {
            bnl0.m105524M(vText, z);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42073d(this);
        this.f25703g = (FrameLayout) findViewById(adc0.f69939Hf);
        this.f25704h = (VText) findViewById(adc0.f70092Qf);
        this.f25705i = (VText) findViewById(adc0.f70041Nf);
    }

    public void setIntlTabTextSize(int i) {
        this.f25709m = i;
    }

    public void setWhisperTabPosition(int i) {
        if (i >= 0) {
            this.f25708l = i;
        }
    }

    public ConversationLeftToolBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25706j = -1;
        this.f25707k = 0;
        this.f25708l = 2;
        this.f25709m = 0;
    }

    public ConversationLeftToolBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25706j = -1;
        this.f25707k = 0;
        this.f25708l = 2;
        this.f25709m = 0;
    }
}
