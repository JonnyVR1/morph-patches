package com.p046p1.mobile.putong.live.livingroom.common.chat.notification;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import p149l.c7k0;
import p149l.d30;
import p149l.e30;
import p149l.g7k0;
import p149l.j25;
import p149l.o7t;
import p149l.s7m;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class UserNotificationView extends LinearLayout implements s7m<c7k0> {

    /* JADX INFO: renamed from: a */
    public UserNotificationView f48938a;

    /* JADX INFO: renamed from: b */
    public UserNotificationItemView f48939b;

    /* JADX INFO: renamed from: c */
    public UserNotificationItemView f48940c;

    /* JADX INFO: renamed from: d */
    public c7k0 f48941d;

    /* JADX INFO: renamed from: e */
    public UserNotificationItemView f48942e;

    /* JADX INFO: renamed from: f */
    public UserNotificationItemView f48943f;

    /* JADX INFO: renamed from: g */
    public e30<o7t> f48944g;

    public UserNotificationView(Context context) {
        super(context);
        this.f48944g = new e30() { // from class: l.d7k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84749a.m72745j((o7t) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m72740l() {
        c7k0 c7k0Var = this.f48941d;
        if (c7k0Var != null) {
            c7k0Var.m105575S3();
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: d */
    public final void m72741d(View view) {
        g7k0.m124694a(this, view);
    }

    @Override // p149l.s7m
    public void destroy() {
        this.f48939b.m72732u();
        this.f48940c.m72732u();
        xdl0.m208344M(this, false);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(c7k0 c7k0Var) {
        this.f48941d = c7k0Var;
    }

    /* JADX INFO: renamed from: f */
    public void m72743f(boolean z) {
        UserNotificationItemView userNotificationItemView = this.f48942e;
        if (!z) {
            if (userNotificationItemView != null) {
                if (!userNotificationItemView.m72727m() || !this.f48942e.m72726l()) {
                    this.f48942e.m72725k(this.f48944g);
                    return;
                }
                UserNotificationItemView userNotificationItemView2 = this.f48943f;
                if (userNotificationItemView2 != null) {
                    userNotificationItemView2.m72725k(this.f48944g);
                    return;
                }
                return;
            }
            return;
        }
        if (userNotificationItemView != null && userNotificationItemView.m72727m() && this.f48942e.m72726l()) {
            this.f48942e.m72725k(this.f48944g);
            return;
        }
        UserNotificationItemView userNotificationItemView3 = this.f48943f;
        if (userNotificationItemView3 != null && userNotificationItemView3.m72727m() && this.f48943f.m72726l()) {
            this.f48943f.m72725k(this.f48944g);
            return;
        }
        UserNotificationItemView userNotificationItemView4 = this.f48942e;
        if (userNotificationItemView4 != null) {
            userNotificationItemView4.m72725k(this.f48944g);
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m72744i() {
        return this.f48939b.m72727m() && this.f48940c.m72727m();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m72745j(o7t o7tVar) {
        c7k0 c7k0Var = this.f48941d;
        if (c7k0Var != null) {
            c7k0Var.m105576T3();
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m72746k(o7t o7tVar) {
        c7k0 c7k0Var = this.f48941d;
        if (c7k0Var != null) {
            c7k0Var.m105572N3(o7tVar);
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m72747m() {
        return (xdl0.m208349O0(this.f48942e) || xdl0.m208349O0(this.f48943f)) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r9v2, types: [l.ho2] */
    /* JADX INFO: renamed from: n */
    public void m72748n(o7t o7tVar) {
        o7t o7tVar2;
        if (m72744i()) {
            return;
        }
        e30<o7t> e30Var = new e30() { // from class: l.e7k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89723a.m72746k((o7t) obj);
            }
        };
        d30 d30Var = new d30() { // from class: l.f7k0
            @Override // p149l.d30
            public final void call() {
                this.f96265a.m72740l();
            }
        };
        boolean zM72747m = m72747m();
        UserNotificationItemView userNotificationItemView = this.f48942e;
        if (zM72747m) {
            o7tVar2 = o7tVar;
            userNotificationItemView.m72736z(o7tVar2, e30Var, d30Var, this.f48944g, true, this.f48941d.mo77274R2());
            xdl0.m208345M0(this.f48942e, true);
        } else {
            o7tVar2 = o7tVar;
            if (!xdl0.m208349O0(userNotificationItemView) && xdl0.m208349O0(this.f48943f)) {
                m72749p();
            }
            this.f48943f.m72736z(o7tVar2, e30Var, d30Var, this.f48944g, true, this.f48941d.mo77274R2());
            xdl0.m208345M0(this.f48943f, true);
        }
        if (o7tVar2.m163055g().equals("follow")) {
            j25.m139408d(this.f48941d.mo77274R2(), this.f48941d.m206027E2(), "liveMessage_notification");
        } else if (o7tVar2.m163055g().equals("accompany")) {
            j25.m139406b(this.f48941d.mo77274R2());
        }
        j25.m139412h(this.f48941d.mo77274R2(), this.f48941d.m206027E2(), o7tVar2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72741d(this);
        this.f48942e = this.f48939b;
        this.f48943f = this.f48940c;
    }

    /* JADX INFO: renamed from: p */
    public final void m72749p() {
        UserNotificationItemView userNotificationItemView = this.f48942e;
        this.f48942e = this.f48943f;
        this.f48943f = userNotificationItemView;
        bringChildToFront(userNotificationItemView);
    }

    public UserNotificationView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48944g = new e30() { // from class: l.d7k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84749a.m72745j((o7t) obj);
            }
        };
    }

    public UserNotificationView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48944g = new e30() { // from class: l.d7k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84749a.m72745j((o7t) obj);
            }
        };
    }
}
