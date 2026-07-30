package com.p046p1.mobile.putong.live.livingroom.voice.intl.close;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import java.util.List;
import p147v.VImage;
import p149l.d1n0;
import p149l.f30;
import p149l.fbp0;
import p149l.i3c0;
import p149l.j1n0;
import p149l.j2g0;
import p149l.nnn0;
import p149l.s7m;
import p149l.t6c0;
import p149l.vdt;
import p149l.x1e0;
import p149l.x4s;
import p149l.xdl0;
import p149l.ycp0;
import p149l.ypv;
import p149l.yuo0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceCloseView extends ConstraintLayout implements s7m<d1n0> {

    /* JADX INFO: renamed from: d */
    public VoiceCloseView f53102d;

    /* JADX INFO: renamed from: e */
    public VImage f53103e;

    /* JADX INFO: renamed from: f */
    public VImage f53104f;

    /* JADX INFO: renamed from: g */
    public VImage f53105g;

    /* JADX INFO: renamed from: h */
    public d1n0 f53106h;

    /* JADX INFO: renamed from: i */
    public yuo0 f53107i;

    public VoiceCloseView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m78107q0(View view) {
        m78111v0();
    }

    /* JADX INFO: renamed from: r */
    private void m78108r() {
        xdl0.m208329E0(this.f53103e, new View.OnClickListener() { // from class: l.e1n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88834a.m78107q0(view);
            }
        });
        xdl0.m208329E0(this.f53104f, new View.OnClickListener() { // from class: l.f1n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94108a.m78109r0(view);
            }
        });
        xdl0.m208329E0(this.f53105g, new View.OnClickListener() { // from class: l.g1n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100187a.m78110s0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m78109r0(View view) {
        this.f53106h.m109654T3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m78110s0(View view) {
        this.f53106h.m109657W3();
    }

    /* JADX INFO: renamed from: v0 */
    private void m78111v0() {
        List<BLiveCommonViewConfig> listM195777Y5 = ypv.m215672k().m195777Y5();
        if (this.f53106h.m206032L2()) {
            this.f53106h.m109655U3();
            return;
        }
        if (this.f53107i == null) {
            this.f53107i = new yuo0(this.f53106h, t6c0.f168078Ja, j2g0.m139461h());
        }
        this.f53107i.m216150r(new f30() { // from class: l.h1n0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f105438a.m78117u0((BLiveCommonViewConfig) obj, ((Integer) obj2).intValue());
            }
        });
        this.f53107i.m216152t(listM195777Y5);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m78112m0(View view) {
        j1n0.m139376a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(d1n0 d1n0Var) {
        this.f53106h = d1n0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    public final void m78114o0() {
        if (!vdt.m198092b(3)) {
            xdl0.m208344M(this.f53104f, false);
        } else {
            xdl0.m208344M(this.f53104f, ycp0.m214191g((nnn0) this.f53106h.m206027E2()));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78112m0(this);
        m78108r();
    }

    /* JADX INFO: renamed from: p0 */
    public void m78115p0() {
        yuo0 yuo0Var = this.f53107i;
        if (yuo0Var != null) {
            yuo0Var.m216144k();
        }
    }

    public void setCollapseView(String str) {
        xdl0.m208344M(this.f53103e, true);
        if (!x4s.m207012b(str)) {
            this.f53103e.setImageResource(i3c0.f110924Y8);
            xdl0.m208345M0(this.f53105g, false);
        } else {
            m78114o0();
            this.f53103e.setImageResource(i3c0.f110672Ca);
            xdl0.m208345M0(this.f53105g, true);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m78116t0(BLiveCommonViewConfig bLiveCommonViewConfig) {
        if (!TextUtils.isEmpty(bLiveCommonViewConfig.scheme) && bLiveCommonViewConfig.scheme.startsWith("tantanapp://")) {
            this.f53106h.m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(7006).m206701e(bLiveCommonViewConfig.scheme).m206699c());
        }
        String str = bLiveCommonViewConfig.type;
        str.getClass();
        switch (str) {
            case "report":
                this.f53106h.m109659Y3();
                break;
            case "feedback":
                this.f53106h.m109658X3();
                break;
            case "exit":
                this.f53106h.m109652R3();
                break;
            case "share":
                this.f53106h.m109656V3();
                break;
            case "stopRoom":
                this.f53106h.m109654T3();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    public final void m78117u0(final BLiveCommonViewConfig bLiveCommonViewConfig, int i) {
        d1n0 d1n0Var = this.f53106h;
        if (d1n0Var == null || bLiveCommonViewConfig == null) {
            m78115p0();
            return;
        }
        if (d1n0Var.m206027E2() != 0) {
            fbp0.m120405u((nnn0) this.f53106h.m206027E2(), bLiveCommonViewConfig.type, i);
        }
        this.f53107i.m216151s(new yuo0.InterfaceC21517a() { // from class: l.i1n0
            @Override // p149l.yuo0.InterfaceC21517a
            public final void onDismiss() {
                this.f110476a.m78116t0(bLiveCommonViewConfig);
            }
        });
        m78115p0();
    }

    public VoiceCloseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceCloseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
