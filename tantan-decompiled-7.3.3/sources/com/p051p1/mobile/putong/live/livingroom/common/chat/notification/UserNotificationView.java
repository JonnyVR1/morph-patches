package com.p051p1.mobile.putong.live.livingroom.common.chat.notification;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import p153l.bnl0;
import p153l.i35;
import p153l.iam;
import p153l.igk0;
import p153l.mgk0;
import p153l.p9t;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class UserNotificationView extends LinearLayout implements iam<igk0> {

    /* JADX INFO: renamed from: a */
    public UserNotificationView f49786a;

    /* JADX INFO: renamed from: b */
    public UserNotificationItemView f49787b;

    /* JADX INFO: renamed from: c */
    public UserNotificationItemView f49788c;

    /* JADX INFO: renamed from: d */
    public igk0 f49789d;

    /* JADX INFO: renamed from: e */
    public UserNotificationItemView f49790e;

    /* JADX INFO: renamed from: f */
    public UserNotificationItemView f49791f;

    /* JADX INFO: renamed from: g */
    public y20<p9t> f49792g;

    public UserNotificationView(Context context) {
        super(context);
        this.f49792g = new y20() { // from class: l.jgk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120739a.m73928j((p9t) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m73923l() {
        igk0 igk0Var = this.f49789d;
        if (igk0Var != null) {
            igk0Var.m139940S3();
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: d */
    public final void m73924d(View view) {
        mgk0.m158356a(this, view);
    }

    @Override // p153l.iam
    public void destroy() {
        this.f49787b.m73915u();
        this.f49788c.m73915u();
        bnl0.m105524M(this, false);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(igk0 igk0Var) {
        this.f49789d = igk0Var;
    }

    /* JADX INFO: renamed from: f */
    public void m73926f(boolean z) {
        UserNotificationItemView userNotificationItemView = this.f49790e;
        if (!z) {
            if (userNotificationItemView != null) {
                if (!userNotificationItemView.m73910m() || !this.f49790e.m73909l()) {
                    this.f49790e.m73908k(this.f49792g);
                    return;
                }
                UserNotificationItemView userNotificationItemView2 = this.f49791f;
                if (userNotificationItemView2 != null) {
                    userNotificationItemView2.m73908k(this.f49792g);
                    return;
                }
                return;
            }
            return;
        }
        if (userNotificationItemView != null && userNotificationItemView.m73910m() && this.f49790e.m73909l()) {
            this.f49790e.m73908k(this.f49792g);
            return;
        }
        UserNotificationItemView userNotificationItemView3 = this.f49791f;
        if (userNotificationItemView3 != null && userNotificationItemView3.m73910m() && this.f49791f.m73909l()) {
            this.f49791f.m73908k(this.f49792g);
            return;
        }
        UserNotificationItemView userNotificationItemView4 = this.f49790e;
        if (userNotificationItemView4 != null) {
            userNotificationItemView4.m73908k(this.f49792g);
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m73927i() {
        return this.f49787b.m73910m() && this.f49788c.m73910m();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m73928j(p9t p9tVar) {
        igk0 igk0Var = this.f49789d;
        if (igk0Var != null) {
            igk0Var.m139941T3();
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m73929k(p9t p9tVar) {
        igk0 igk0Var = this.f49789d;
        if (igk0Var != null) {
            igk0Var.m139937N3(p9tVar);
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m73930m() {
        return (bnl0.m105529O0(this.f49790e) || bnl0.m105529O0(this.f49791f)) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r9v2, types: [l.oo2] */
    /* JADX INFO: renamed from: n */
    public void m73931n(p9t p9tVar) {
        p9t p9tVar2;
        if (m73927i()) {
            return;
        }
        y20<p9t> y20Var = new y20() { // from class: l.kgk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126625a.m73929k((p9t) obj);
            }
        };
        x20 x20Var = new x20() { // from class: l.lgk0
            @Override // p153l.x20
            public final void call() {
                this.f131975a.m73923l();
            }
        };
        boolean zM73930m = m73930m();
        UserNotificationItemView userNotificationItemView = this.f49790e;
        if (zM73930m) {
            p9tVar2 = p9tVar;
            userNotificationItemView.m73919z(p9tVar2, y20Var, x20Var, this.f49792g, true, this.f49789d.mo78457R2());
            bnl0.m105525M0(this.f49790e, true);
        } else {
            p9tVar2 = p9tVar;
            if (!bnl0.m105529O0(userNotificationItemView) && bnl0.m105529O0(this.f49791f)) {
                m73932p();
            }
            this.f49791f.m73919z(p9tVar2, y20Var, x20Var, this.f49792g, true, this.f49789d.mo78457R2());
            bnl0.m105525M0(this.f49791f, true);
        }
        if (p9tVar2.m171384g().equals("follow")) {
            i35.m138268d(this.f49789d.mo78457R2(), this.f49789d.m213810E2(), "liveMessage_notification");
        } else if (p9tVar2.m171384g().equals("accompany")) {
            i35.m138266b(this.f49789d.mo78457R2());
        }
        i35.m138272h(this.f49789d.mo78457R2(), this.f49789d.m213810E2(), p9tVar2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73924d(this);
        this.f49790e = this.f49787b;
        this.f49791f = this.f49788c;
    }

    /* JADX INFO: renamed from: p */
    public final void m73932p() {
        UserNotificationItemView userNotificationItemView = this.f49790e;
        this.f49790e = this.f49791f;
        this.f49791f = userNotificationItemView;
        bringChildToFront(userNotificationItemView);
    }

    public UserNotificationView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49792g = new y20() { // from class: l.jgk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120739a.m73928j((p9t) obj);
            }
        };
    }

    public UserNotificationView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49792g = new y20() { // from class: l.jgk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120739a.m73928j((p9t) obj);
            }
        };
    }
}
