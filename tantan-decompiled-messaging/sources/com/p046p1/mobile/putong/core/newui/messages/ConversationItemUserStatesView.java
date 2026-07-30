package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreFeedStateCounter;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemUserStatesView;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VText;
import p149l.e30;
import p149l.j760;
import p149l.mkd0;
import p149l.qb6;
import p149l.xaj0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemUserStatesView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f24907a;

    /* JADX INFO: renamed from: b */
    public VImage f24908b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f24909c;

    /* JADX INFO: renamed from: d */
    public VText f24910d;

    /* JADX INFO: renamed from: e */
    public VText f24911e;

    /* JADX INFO: renamed from: f */
    public TextView f24912f;

    public ConversationItemUserStatesView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m40938b(Act act, xaj0 xaj0Var) {
        act.progressDismiss();
        if (!NullChecker.m81303a(xaj0Var) || TextUtils.isEmpty((CharSequence) xaj0Var.f191751a)) {
            CoreModule.m29934N().mo60361j9(act, OMSDialogPositon.p_messages_view);
        } else {
            CoreModule.m29934N().mo60270Dk(act, CoreModule.m29932K().me_().f56011id, (String) xaj0Var.f191751a, OMSDialogPositon.p_messages_view);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m40939c(Act act, Throwable th) {
        act.progressDismiss();
        CoreModule.m29934N().mo60361j9(act, OMSDialogPositon.p_messages_view);
    }

    /* JADX INFO: renamed from: e */
    public final void m40941e(View view) {
        qb6.m173820a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final void m40942f(final Act act) {
        act.progress("");
        act.duringCreated(CoreModule.m29934N().mo60320Tg()).first().subscribe(mkd0.m154956H(new e30() { // from class: l.ob6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationItemUserStatesView.m40938b(act, (xaj0) obj);
            }
        }, new e30() { // from class: l.pb6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationItemUserStatesView.m40939c(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m40943g(CoreFeedStateCounter coreFeedStateCounter, PutongAct putongAct, View view) {
        m40946j(coreFeedStateCounter);
        m40942f(putongAct);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m40944h(CoreFeedStateCounter coreFeedStateCounter, PutongAct putongAct, View view) {
        m40946j(coreFeedStateCounter);
        CoreModule.f17545c.f19676q1.m33270C3();
        CoreModule.m29934N().mo60319Tf(putongAct, OMSDialogPositon.p_messages_view);
    }

    /* JADX INFO: renamed from: i */
    public void m40945i(final PutongAct putongAct, Conversation conversation) {
        this.f24910d.setTypeface(Typeface.defaultFromStyle(1));
        final CoreFeedStateCounter coreFeedStateCounter = conversation.additional.feedStateCounter;
        if (!NullChecker.m81303a(coreFeedStateCounter) || !coreFeedStateCounter.haveMatchedState) {
            this.f24911e.setText("分享此刻状态，与好友即刻开聊");
            this.f24908b.setVisibility(8);
            xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.mb6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f132991a.m40943g(coreFeedStateCounter, putongAct, view);
                }
            });
            return;
        }
        int i = coreFeedStateCounter.unread;
        VText vText = this.f24911e;
        if (i > 0) {
            vText.setText(coreFeedStateCounter.unread + "个好友更新了状态");
            this.f24908b.setVisibility(0);
        } else {
            vText.setText("看看好友的最新状态，即刻开聊");
            this.f24908b.setVisibility(8);
        }
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.nb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138014a.m40944h(coreFeedStateCounter, putongAct, view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m40946j(CoreFeedStateCounter coreFeedStateCounter) {
        zvf0.m220399u("e_match_state", OMSDialogPositon.p_messages_view, new j760("has_red_dot", (!NullChecker.m81303a(coreFeedStateCounter) || coreFeedStateCounter.unread <= 0) ? "no" : "yes"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40941e(this);
    }

    public ConversationItemUserStatesView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationItemUserStatesView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
