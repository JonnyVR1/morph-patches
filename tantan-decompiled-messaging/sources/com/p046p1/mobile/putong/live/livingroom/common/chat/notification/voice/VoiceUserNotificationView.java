package com.p046p1.mobile.putong.live.livingroom.common.chat.notification.voice;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceChatUserNotificationViewBindings;
import p149l.d30;
import p149l.e30;
import p149l.h4t;
import p149l.h5o0;
import p149l.i5o0;
import p149l.pzo0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class VoiceUserNotificationView extends LiveVoiceChatUserNotificationViewBindings<pzo0> {

    /* JADX INFO: renamed from: e */
    public final e30<h5o0> f48950e;

    public VoiceUserNotificationView(Context context) {
        super(context);
        this.f48950e = new e30() { // from class: l.qzo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157086a.m72773f((h5o0) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m72771j() {
        T t = this.f48321a;
        if (t != 0) {
            ((pzo0) t).m172247M3();
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceChatUserNotificationViewBindings, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceChatUserNotificationViewBindings, p149l.s7m
    public void destroy() {
        this.f48323c.m72761p();
        this.f48324d.m72761p();
        xdl0.m208344M(this, false);
    }

    /* JADX INFO: renamed from: e */
    public boolean m72772e() {
        return this.f48323c.isShowing() && this.f48324d.isShowing();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m72773f(h5o0 h5o0Var) {
        T t = this.f48321a;
        if (t != 0) {
            ((pzo0) t).m172248N3();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m72774i(h5o0 h5o0Var, h5o0 h5o0Var2) {
        T t = this.f48321a;
        if (t != 0) {
            i5o0.m134519d((h4t) t, h5o0Var);
            ((pzo0) this.f48321a).m172245K3(h5o0Var2);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m72775k(final h5o0 h5o0Var) {
        if (m72772e()) {
            return;
        }
        e30<h5o0> e30Var = new e30() { // from class: l.rzo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161669a.m72774i(h5o0Var, (h5o0) obj);
            }
        };
        d30 d30Var = new d30() { // from class: l.szo0
            @Override // p149l.d30
            public final void call() {
                this.f167070a.m72771j();
            }
        };
        i5o0.m134520e((h4t) this.f48321a, h5o0Var);
        xdl0.m208344M(this, true);
        if (!xdl0.m208349O0(this.f48323c)) {
            this.f48323c.m72763s(h5o0Var, e30Var, d30Var, this.f48950e);
            xdl0.m208345M0(this.f48323c, true);
        } else {
            if (xdl0.m208349O0(this.f48324d)) {
                return;
            }
            this.f48324d.m72763s(h5o0Var, e30Var, d30Var, this.f48950e);
            xdl0.m208345M0(this.f48324d, true);
        }
    }

    public VoiceUserNotificationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48950e = new e30() { // from class: l.qzo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157086a.m72773f((h5o0) obj);
            }
        };
    }

    public VoiceUserNotificationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48950e = new e30() { // from class: l.qzo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157086a.m72773f((h5o0) obj);
            }
        };
    }
}
