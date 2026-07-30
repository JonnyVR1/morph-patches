package com.p000p1.mobile.putong.live.livingroom.common.chat.notification.voice;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.binding.LiveVoiceChatUserNotificationViewBindings;
import l.d30;
import l.e30;
import l.xdl0;
import p002l.h4t;
import p002l.h5o0;
import p002l.i5o0;
import p002l.pzo0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class VoiceUserNotificationView extends LiveVoiceChatUserNotificationViewBindings<pzo0> {

    /* JADX INFO: renamed from: e */
    public final e30<h5o0> f4992e;

    public VoiceUserNotificationView(Context context) {
        super(context);
        this.f4992e = new e30() { // from class: l.qzo0
            public final void call(Object obj) {
                this.f18293a.m6280f((h5o0) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m6278j() {
        pzo0 pzo0Var = this.f4363a;
        if (pzo0Var != null) {
            pzo0Var.m20767M3();
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.binding.LiveVoiceChatUserNotificationViewBindings
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo5531C0() {
        return getContext();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.binding.LiveVoiceChatUserNotificationViewBindings
    public void destroy() {
        this.f4365c.m6268p();
        this.f4366d.m6268p();
        xdl0.M(this, false);
    }

    /* JADX INFO: renamed from: e */
    public boolean m6279e() {
        return this.f4365c.isShowing() && this.f4366d.isShowing();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m6280f(h5o0 h5o0Var) {
        pzo0 pzo0Var = this.f4363a;
        if (pzo0Var != null) {
            pzo0Var.m20768N3();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m6281i(h5o0 h5o0Var, h5o0 h5o0Var2) {
        h4t h4tVar = this.f4363a;
        if (h4tVar != null) {
            i5o0.m15006d(h4tVar, h5o0Var);
            this.f4363a.m20765K3(h5o0Var2);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m6282k(final h5o0 h5o0Var) {
        if (m6279e()) {
            return;
        }
        e30<h5o0> e30Var = new e30() { // from class: l.rzo0
            public final void call(Object obj) {
                this.f18729a.m6281i(h5o0Var, (h5o0) obj);
            }
        };
        d30 d30Var = new d30() { // from class: l.szo0
            public final void call() {
                this.f19344a.m6278j();
            }
        };
        i5o0.m15007e(this.f4363a, h5o0Var);
        xdl0.M(this, true);
        if (!xdl0.O0(this.f4365c)) {
            this.f4365c.m6270s(h5o0Var, e30Var, d30Var, this.f4992e);
            xdl0.M0(this.f4365c, true);
        } else {
            if (xdl0.O0(this.f4366d)) {
                return;
            }
            this.f4366d.m6270s(h5o0Var, e30Var, d30Var, this.f4992e);
            xdl0.M0(this.f4366d, true);
        }
    }

    public VoiceUserNotificationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4992e = new e30() { // from class: l.qzo0
            public final void call(Object obj) {
                this.f18293a.m6280f((h5o0) obj);
            }
        };
    }

    public VoiceUserNotificationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4992e = new e30() { // from class: l.qzo0
            public final void call(Object obj) {
                this.f18293a.m6280f((h5o0) obj);
            }
        };
    }
}
