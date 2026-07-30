package com.p046p1.mobile.putong.core.p053ui.dlg.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.RecentConversation;
import com.p046p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p046p1.mobile.putong.core.p053ui.dlg.views.OnlineMatchDlgItemView;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.data.User;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.d30;
import p149l.e30;
import p149l.ek50;
import p149l.j760;
import p149l.mkd0;
import p149l.qib0;
import p149l.t100;
import p149l.uc9;
import p149l.xdl0;

/* JADX INFO: loaded from: classes10.dex */
public class OnlineMatchDlgItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public NewTalkProgressView f29073c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f29074d;

    /* JADX INFO: renamed from: e */
    public View f29075e;

    /* JADX INFO: renamed from: f */
    public VText f29076f;

    public OnlineMatchDlgItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m45263Q(Throwable th) {
    }

    private Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: S */
    public final void m45265S(View view) {
        ek50.m116923a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m45266T(Pair pair) {
        boolean zOnlineMatchLocked = ((User) pair.second).onlineMatchLocked();
        NewTalkProgressView newTalkProgressView = this.f29073c;
        if (zOnlineMatchLocked) {
            xdl0.m208345M0(newTalkProgressView, true);
            this.f29073c.setThreeDp(t100.m186890d(2.0f));
            this.f29073c.setProgress(((Integer) ((j760) pair.first).f116564a).intValue());
            C8609a.m50282x(this.f29074d, ((User) pair.second).m60124fp().profileSmall(), 0);
        } else {
            xdl0.m208345M0(newTalkProgressView, false);
            qib0.f154691G.m102331L0(this.f29074d, ((User) pair.second).m60124fp().profileSmall().formatted());
        }
        this.f29076f.setText(((User) pair.second).name);
    }

    /* JADX INFO: renamed from: V */
    public void m45267V(RecentConversation recentConversation, final d30 d30Var) {
        CoreModule.f17545c.f19639e0.m169454W9(recentConversation.otherUserID);
        act().duringCreated(mkd0.m154984r(CoreModule.f17545c.f19642f0.m33048mo(recentConversation.otherUserID), CoreModule.f17545c.f19639e0.m169410Ka(recentConversation.otherUserID), new uc9())).subscribe(mkd0.m154956H(new e30() { // from class: l.bk50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75966a.m45266T((Pair) obj);
            }
        }, new e30() { // from class: l.ck50
            @Override // p149l.e30
            public final void call(Object obj) {
                OnlineMatchDlgItemView.m45263Q((Throwable) obj);
            }
        }));
        xdl0.m208344M(this.f29075e, recentConversation.isOnline);
        this.f29074d.setOnClickListener(new View.OnClickListener() { // from class: l.dk50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45265S(this);
    }

    public OnlineMatchDlgItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OnlineMatchDlgItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
