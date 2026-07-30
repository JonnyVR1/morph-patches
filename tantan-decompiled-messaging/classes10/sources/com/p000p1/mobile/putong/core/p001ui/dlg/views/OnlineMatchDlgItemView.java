package com.p000p1.mobile.putong.core.p001ui.dlg.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import com.p000p1.mobile.putong.core.data.RecentConversation;
import com.p000p1.mobile.putong.core.p001ui.dlg.views.OnlineMatchDlgItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p1.mobile.putong.core.ui.onlinematch.a;
import com.p1.mobile.putong.data.User;
import l.d30;
import l.e30;
import l.j760;
import l.mkd0;
import l.qib0;
import l.t100;
import l.uc9;
import l.xdl0;
import p003l.ek50;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class OnlineMatchDlgItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public NewTalkProgressView f1467c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f1468d;

    /* JADX INFO: renamed from: e */
    public View f1469e;

    /* JADX INFO: renamed from: f */
    public VText f1470f;

    public OnlineMatchDlgItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m2582Q(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Act act() {
        return getContext();
    }

    /* JADX INFO: renamed from: S */
    public final void m2584S(View view) {
        ek50.m6301a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m2585T(Pair pair) {
        boolean zOnlineMatchLocked = ((User) pair.second).onlineMatchLocked();
        NewTalkProgressView newTalkProgressView = this.f1467c;
        if (zOnlineMatchLocked) {
            xdl0.M0(newTalkProgressView, true);
            this.f1467c.setThreeDp(t100.d(2.0f));
            this.f1467c.setProgress(((Integer) ((j760) pair.first).a).intValue());
            a.x(this.f1468d, ((User) pair.second).fp().profileSmall(), 0);
        } else {
            xdl0.M0(newTalkProgressView, false);
            qib0.G.L0(this.f1468d, ((User) pair.second).fp().profileSmall().formatted());
        }
        this.f1470f.setText(((User) pair.second).name);
    }

    /* JADX INFO: renamed from: V */
    public void m2586V(RecentConversation recentConversation, final d30 d30Var) {
        CoreModule.c.e0.W9(recentConversation.otherUserID);
        act().duringCreated(mkd0.r(CoreModule.c.f0.mo(recentConversation.otherUserID), CoreModule.c.e0.Ka(recentConversation.otherUserID), new uc9())).subscribe(mkd0.H(new e30() { // from class: l.bk50
            public final void call(Object obj) {
                this.f3398a.m2585T((Pair) obj);
            }
        }, new e30() { // from class: l.ck50
            public final void call(Object obj) {
                OnlineMatchDlgItemView.m2582Q((Throwable) obj);
            }
        }));
        xdl0.M(this.f1469e, recentConversation.isOnline);
        this.f1468d.setOnClickListener(new View.OnClickListener() { // from class: l.dk50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2584S(this);
    }

    public OnlineMatchDlgItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OnlineMatchDlgItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
