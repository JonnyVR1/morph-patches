package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.messages.ConversationItemUserStatesView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreFeedStateCounter;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.j760;
import l.mkd0;
import l.qb6;
import l.xaj0;
import l.xdl0;
import l.zvf0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationItemUserStatesView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f3685a;

    /* JADX INFO: renamed from: b */
    public VImage f3686b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f3687c;

    /* JADX INFO: renamed from: d */
    public VText f3688d;

    /* JADX INFO: renamed from: e */
    public VText f3689e;

    /* JADX INFO: renamed from: f */
    public TextView f3690f;

    public ConversationItemUserStatesView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5039b(Act act, xaj0 xaj0Var) {
        act.progressDismiss();
        if (!NullChecker.a(xaj0Var) || TextUtils.isEmpty((CharSequence) xaj0Var.a)) {
            CoreModule.N().j9(act, "p_messages_view");
        } else {
            CoreModule.N().Dk(act, ((DbObject) CoreModule.K().me_()).id, (String) xaj0Var.a, "p_messages_view");
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m5040c(Act act, Throwable th) {
        act.progressDismiss();
        CoreModule.N().j9(act, "p_messages_view");
    }

    /* JADX INFO: renamed from: e */
    public final void m5042e(View view) {
        qb6.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final void m5043f(final Act act) {
        act.progress("");
        act.duringCreated(CoreModule.N().Tg()).first().subscribe(mkd0.H(new e30() { // from class: l.ob6
            public final void call(Object obj) {
                ConversationItemUserStatesView.m5039b(act, (xaj0) obj);
            }
        }, new e30() { // from class: l.pb6
            public final void call(Object obj) {
                ConversationItemUserStatesView.m5040c(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m5044g(CoreFeedStateCounter coreFeedStateCounter, PutongAct putongAct, View view) {
        m5047j(coreFeedStateCounter);
        m5043f(putongAct);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m5045h(CoreFeedStateCounter coreFeedStateCounter, PutongAct putongAct, View view) {
        m5047j(coreFeedStateCounter);
        CoreModule.c.q1.C3();
        CoreModule.N().Tf(putongAct, "p_messages_view");
    }

    /* JADX INFO: renamed from: i */
    public void m5046i(final PutongAct putongAct, Conversation conversation) {
        this.f3688d.setTypeface(Typeface.defaultFromStyle(1));
        final CoreFeedStateCounter coreFeedStateCounter = conversation.additional.feedStateCounter;
        if (!NullChecker.a(coreFeedStateCounter) || !coreFeedStateCounter.haveMatchedState) {
            this.f3689e.setText("分享此刻状态，与好友即刻开聊");
            this.f3686b.setVisibility(8);
            xdl0.E0(this, new View.OnClickListener() { // from class: l.mb6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f16787a.m5044g(coreFeedStateCounter, putongAct, view);
                }
            });
            return;
        }
        int i = coreFeedStateCounter.unread;
        VText vText = this.f3689e;
        if (i > 0) {
            vText.setText(coreFeedStateCounter.unread + "个好友更新了状态");
            this.f3686b.setVisibility(0);
        } else {
            vText.setText("看看好友的最新状态，即刻开聊");
            this.f3686b.setVisibility(8);
        }
        xdl0.E0(this, new View.OnClickListener() { // from class: l.nb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17383a.m5045h(coreFeedStateCounter, putongAct, view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m5047j(CoreFeedStateCounter coreFeedStateCounter) {
        zvf0.u("e_match_state", "p_messages_view", new j760[]{new j760("has_red_dot", (!NullChecker.a(coreFeedStateCounter) || coreFeedStateCounter.unread <= 0) ? "no" : "yes")});
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5042e(this);
    }

    public ConversationItemUserStatesView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationItemUserStatesView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
