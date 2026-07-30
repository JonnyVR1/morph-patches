package com.p000p1.mobile.putong.live.livingroom.common.chat.notification;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import l.d30;
import l.e30;
import l.s7m;
import l.xdl0;
import p002l.c7k0;
import p002l.g7k0;
import p002l.j25;
import p002l.o7t;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class UserNotificationView extends LinearLayout implements s7m<c7k0> {

    /* JADX INFO: renamed from: a */
    public UserNotificationView f4980a;

    /* JADX INFO: renamed from: b */
    public UserNotificationItemView f4981b;

    /* JADX INFO: renamed from: c */
    public UserNotificationItemView f4982c;

    /* JADX INFO: renamed from: d */
    public c7k0 f4983d;

    /* JADX INFO: renamed from: e */
    public UserNotificationItemView f4984e;

    /* JADX INFO: renamed from: f */
    public UserNotificationItemView f4985f;

    /* JADX INFO: renamed from: g */
    public e30<o7t> f4986g;

    public UserNotificationView(Context context) {
        super(context);
        this.f4986g = new e30() { // from class: l.d7k0
            public final void call(Object obj) {
                this.f9089a.m6252j((o7t) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m6245l() {
        c7k0 c7k0Var = this.f4983d;
        if (c7k0Var != null) {
            c7k0Var.m10789S3();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m6246C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: d */
    public final void m6247d(View view) {
        g7k0.m13650a(this, view);
    }

    public void destroy() {
        this.f4981b.m6236u();
        this.f4982c.m6236u();
        xdl0.M(this, false);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m6251i1(c7k0 c7k0Var) {
        this.f4983d = c7k0Var;
    }

    /* JADX INFO: renamed from: f */
    public void m6249f(boolean z) {
        UserNotificationItemView userNotificationItemView = this.f4984e;
        if (!z) {
            if (userNotificationItemView != null) {
                if (!userNotificationItemView.m6231m() || !this.f4984e.m6230l()) {
                    this.f4984e.m6229k(this.f4986g);
                    return;
                }
                UserNotificationItemView userNotificationItemView2 = this.f4985f;
                if (userNotificationItemView2 != null) {
                    userNotificationItemView2.m6229k(this.f4986g);
                    return;
                }
                return;
            }
            return;
        }
        if (userNotificationItemView != null && userNotificationItemView.m6231m() && this.f4984e.m6230l()) {
            this.f4984e.m6229k(this.f4986g);
            return;
        }
        UserNotificationItemView userNotificationItemView3 = this.f4985f;
        if (userNotificationItemView3 != null && userNotificationItemView3.m6231m() && this.f4985f.m6230l()) {
            this.f4985f.m6229k(this.f4986g);
            return;
        }
        UserNotificationItemView userNotificationItemView4 = this.f4984e;
        if (userNotificationItemView4 != null) {
            userNotificationItemView4.m6229k(this.f4986g);
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m6250i() {
        return this.f4981b.m6231m() && this.f4982c.m6231m();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m6252j(o7t o7tVar) {
        c7k0 c7k0Var = this.f4983d;
        if (c7k0Var != null) {
            c7k0Var.m10790T3();
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m6253k(o7t o7tVar) {
        c7k0 c7k0Var = this.f4983d;
        if (c7k0Var != null) {
            c7k0Var.m10786N3(o7tVar);
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m6254m() {
        return (xdl0.O0(this.f4984e) || xdl0.O0(this.f4985f)) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r9v2, types: [l.ho2] */
    /* JADX INFO: renamed from: n */
    public void m6255n(o7t o7tVar) {
        o7t o7tVar2;
        if (m6250i()) {
            return;
        }
        e30<o7t> e30Var = new e30() { // from class: l.e7k0
            public final void call(Object obj) {
                this.f9617a.m6253k((o7t) obj);
            }
        };
        d30 d30Var = new d30() { // from class: l.f7k0
            public final void call() {
                this.f10179a.m6245l();
            }
        };
        boolean zM6254m = m6254m();
        UserNotificationItemView userNotificationItemView = this.f4984e;
        if (zM6254m) {
            o7tVar2 = o7tVar;
            userNotificationItemView.m6240z(o7tVar2, e30Var, d30Var, this.f4986g, true, this.f4983d.mo21430R2());
            xdl0.M0(this.f4984e, true);
        } else {
            o7tVar2 = o7tVar;
            if (!xdl0.O0(userNotificationItemView) && xdl0.O0(this.f4985f)) {
                m6256p();
            }
            this.f4985f.m6240z(o7tVar2, e30Var, d30Var, this.f4986g, true, this.f4983d.mo21430R2());
            xdl0.M0(this.f4985f, true);
        }
        if (o7tVar2.m19283g().equals("follow")) {
            j25.m15559d(this.f4983d.mo21430R2(), this.f4983d.m25547E2(), "liveMessage_notification");
        } else if (o7tVar2.m19283g().equals("accompany")) {
            j25.m15557b(this.f4983d.mo21430R2());
        }
        j25.m15563h(this.f4983d.mo21430R2(), this.f4983d.m25547E2(), o7tVar2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6247d(this);
        this.f4984e = this.f4981b;
        this.f4985f = this.f4982c;
    }

    /* JADX INFO: renamed from: p */
    public final void m6256p() {
        UserNotificationItemView userNotificationItemView = this.f4984e;
        this.f4984e = this.f4985f;
        this.f4985f = userNotificationItemView;
        bringChildToFront(userNotificationItemView);
    }

    public UserNotificationView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4986g = new e30() { // from class: l.d7k0
            public final void call(Object obj) {
                this.f9089a.m6252j((o7t) obj);
            }
        };
    }

    public UserNotificationView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4986g = new e30() { // from class: l.d7k0
            public final void call(Object obj) {
                this.f9089a.m6252j((o7t) obj);
            }
        };
    }
}
