package com.p051p1.mobile.putong.core.p058ui.dlg.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.RecentConversation;
import com.p051p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p051p1.mobile.putong.core.p058ui.dlg.views.OnlineMatchDlgItemView;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.data.User;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.de9;
import p153l.ks50;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.uqb0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes2.dex */
public class OnlineMatchDlgItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public NewTalkProgressView f29921c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f29922d;

    /* JADX INFO: renamed from: e */
    public View f29923e;

    /* JADX INFO: renamed from: f */
    public VText f29924f;

    public OnlineMatchDlgItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m46446Q(Throwable th) {
    }

    private Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: S */
    public final void m46448S(View view) {
        ks50.m151147a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m46449T(Pair pair) {
        boolean zOnlineMatchLocked = ((User) pair.second).onlineMatchLocked();
        NewTalkProgressView newTalkProgressView = this.f29921c;
        if (zOnlineMatchLocked) {
            bnl0.m105525M0(newTalkProgressView, true);
            this.f29921c.setThreeDp(qa00.m175859d(2.0f));
            this.f29921c.setProgress(((Integer) ((pf60) pair.first).f152156a).intValue());
            C8772a.m51465x(this.f29922d, ((User) pair.second).m61308fp().profileSmall(), 0);
        } else {
            bnl0.m105525M0(newTalkProgressView, false);
            uqb0.f180374G.m127115L0(this.f29922d, ((User) pair.second).m61308fp().profileSmall().formatted());
        }
        this.f29924f.setText(((User) pair.second).name);
    }

    /* JADX INFO: renamed from: V */
    public void m46450V(RecentConversation recentConversation, final x20 x20Var) {
        CoreModule.f18264c.f20381e0.m116527W9(recentConversation.otherUserID);
        act().duringCreated(psd0.m173625r(CoreModule.f18264c.f20384f0.m34051mo(recentConversation.otherUserID), CoreModule.f18264c.f20381e0.m116483Ka(recentConversation.otherUserID), new de9())).subscribe(psd0.m173597H(new y20() { // from class: l.hs50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111419a.m46449T((Pair) obj);
            }
        }, new y20() { // from class: l.is50
            @Override // p153l.y20
            public final void call(Object obj) {
                OnlineMatchDlgItemView.m46446Q((Throwable) obj);
            }
        }));
        bnl0.m105524M(this.f29923e, recentConversation.isOnline);
        this.f29922d.setOnClickListener(new View.OnClickListener() { // from class: l.js50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46448S(this);
    }

    public OnlineMatchDlgItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OnlineMatchDlgItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
