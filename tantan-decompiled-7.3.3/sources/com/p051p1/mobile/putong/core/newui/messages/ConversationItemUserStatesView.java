package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreFeedStateCounter;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemUserStatesView;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VText;
import p153l.bkj0;
import p153l.bnl0;
import p153l.i4g0;
import p153l.pf60;
import p153l.psd0;
import p153l.tc6;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemUserStatesView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f25649a;

    /* JADX INFO: renamed from: b */
    public VImage f25650b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f25651c;

    /* JADX INFO: renamed from: d */
    public VText f25652d;

    /* JADX INFO: renamed from: e */
    public VText f25653e;

    /* JADX INFO: renamed from: f */
    public TextView f25654f;

    public ConversationItemUserStatesView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m41949b(Act act, bkj0 bkj0Var) {
        act.progressDismiss();
        if (!NullChecker.m82486a(bkj0Var) || TextUtils.isEmpty((CharSequence) bkj0Var.f77081a)) {
            CoreModule.m30932N().mo61545j9(act, OMSDialogPositon.p_messages_view);
        } else {
            CoreModule.m30932N().mo61454Dk(act, CoreModule.m30930K().me_().f56859id, (String) bkj0Var.f77081a, OMSDialogPositon.p_messages_view);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m41950c(Act act, Throwable th) {
        act.progressDismiss();
        CoreModule.m30932N().mo61545j9(act, OMSDialogPositon.p_messages_view);
    }

    /* JADX INFO: renamed from: e */
    public final void m41952e(View view) {
        tc6.m190434a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final void m41953f(final Act act) {
        act.progress("");
        act.duringCreated(CoreModule.m30932N().mo61504Tg()).first().subscribe(psd0.m173597H(new y20() { // from class: l.rc6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationItemUserStatesView.m41949b(act, (bkj0) obj);
            }
        }, new y20() { // from class: l.sc6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationItemUserStatesView.m41950c(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m41954g(CoreFeedStateCounter coreFeedStateCounter, PutongAct putongAct, View view) {
        m41957j(coreFeedStateCounter);
        m41953f(putongAct);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m41955h(CoreFeedStateCounter coreFeedStateCounter, PutongAct putongAct, View view) {
        m41957j(coreFeedStateCounter);
        CoreModule.f18264c.f20418q1.m34273C3();
        CoreModule.m30932N().mo61503Tf(putongAct, OMSDialogPositon.p_messages_view);
    }

    /* JADX INFO: renamed from: i */
    public void m41956i(final PutongAct putongAct, Conversation conversation) {
        this.f25652d.setTypeface(Typeface.defaultFromStyle(1));
        final CoreFeedStateCounter coreFeedStateCounter = conversation.additional.feedStateCounter;
        if (!NullChecker.m82486a(coreFeedStateCounter) || !coreFeedStateCounter.haveMatchedState) {
            this.f25653e.setText("分享此刻状态，与好友即刻开聊");
            this.f25650b.setVisibility(8);
            bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.pc6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f151536a.m41954g(coreFeedStateCounter, putongAct, view);
                }
            });
            return;
        }
        int i = coreFeedStateCounter.unread;
        VText vText = this.f25653e;
        if (i > 0) {
            vText.setText(coreFeedStateCounter.unread + "个好友更新了状态");
            this.f25650b.setVisibility(0);
        } else {
            vText.setText("看看好友的最新状态，即刻开聊");
            this.f25650b.setVisibility(8);
        }
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.qc6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156555a.m41955h(coreFeedStateCounter, putongAct, view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m41957j(CoreFeedStateCounter coreFeedStateCounter) {
        i4g0.m138523u("e_match_state", OMSDialogPositon.p_messages_view, new pf60("has_red_dot", (!NullChecker.m82486a(coreFeedStateCounter) || coreFeedStateCounter.unread <= 0) ? "no" : "yes"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41952e(this);
    }

    public ConversationItemUserStatesView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationItemUserStatesView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
