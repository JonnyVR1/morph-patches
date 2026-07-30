package com.p046p1.mobile.putong.core.p053ui.greet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageChannel;
import com.p046p1.mobile.putong.core.data.MessageReference;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.bkb0;
import p149l.c3c0;
import p149l.cak;
import p149l.d30;
import p149l.e30;
import p149l.lsi0;
import p149l.mkd0;
import p149l.o7r;
import p149l.osi0;
import p149l.qib0;
import p149l.roj0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.xma;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class GreetMessageStateNewView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f29398a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f29399b;

    /* JADX INFO: renamed from: c */
    public VText f29400c;

    /* JADX INFO: renamed from: d */
    public VText f29401d;

    /* JADX INFO: renamed from: e */
    public VImage f29402e;

    public GreetMessageStateNewView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i */
    public View m45737i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cak.m105928b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final void m45738j(BubbleInfo bubbleInfo) {
        zvf0.m220399u("e_other_state_like", "p_kankan_chat_popup", vwb.m200311Y("be_liked", Boolean.valueOf(!bubbleInfo.haveLiked)), vwb.m200311Y("state_id", bubbleInfo.f38730id), vwb.m200311Y("owner_id", bubbleInfo.owner.f38803id));
    }

    /* JADX INFO: renamed from: k */
    public final void m45739k(BubbleInfo bubbleInfo) {
        zvf0.m220368A("e_other_state_like", "p_kankan_chat_popup", vwb.m200311Y("be_liked", Boolean.valueOf(bubbleInfo.haveLiked)), vwb.m200311Y("state_id", bubbleInfo.f38730id), vwb.m200311Y("owner_id", bubbleInfo.owner.f38803id));
    }

    /* JADX INFO: renamed from: l */
    public final void m45740l(final BubbleInfo bubbleInfo, final Act act) {
        if (bubbleInfo.haveLiked) {
            act.duringCreated(CoreModule.m29934N().mo60292Ll(bubbleInfo.f38730id, bubbleInfo.owner.f38803id)).subscribe(mkd0.m154956H(new e30() { // from class: l.w9k
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f185361a.m45742n(bubbleInfo, (Envelope) obj);
                }
            }, new e30() { // from class: l.x9k
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f191629a.m45749u((Throwable) obj);
                }
            }));
        } else {
            act.duringCreated(CoreModule.m29934N().mo60262Bg(bubbleInfo.f38730id, bubbleInfo.owner.f38803id)).subscribe(mkd0.m154956H(new e30() { // from class: l.y9k
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f196975a.m45743o(bubbleInfo, act, (Envelope) obj);
                }
            }, new e30() { // from class: l.x9k
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f191629a.m45749u((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m45741m(BubbleInfo bubbleInfo) {
        String str = bubbleInfo.value;
        this.f29401d.setText(str);
        if (TextUtils.isEmpty(str) && NullChecker.m81303a(bubbleInfo.owner) && !TextUtils.isEmpty(bubbleInfo.owner.f38803id)) {
            User userMo60337Zk = CoreModule.m29934N().mo60337Zk(bubbleInfo.owner.f38803id);
            if (NullChecker.m81303a(userMo60337Zk)) {
                this.f29401d.setText(userMo60337Zk.isFemale() ? "她更新了状态" : "他更新了状态");
            } else {
                this.f29401d.setText("他更新了状态");
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m45742n(BubbleInfo bubbleInfo, Envelope envelope) {
        m45738j(bubbleInfo);
        bubbleInfo.haveLiked = false;
        this.f29402e.setBackgroundDrawable(CoreModule.f17544b.getDrawable(c3c0.f78783k0));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m45743o(BubbleInfo bubbleInfo, Act act, Envelope envelope) {
        m45738j(bubbleInfo);
        bubbleInfo.haveLiked = true;
        this.f29402e.setBackgroundDrawable(CoreModule.f17544b.getDrawable(c3c0.f78774j0));
        if (act instanceof GreetAct) {
            m45751w((GreetAct) act, bubbleInfo);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        addView(m45737i(o7r.m163037a(getContext()), this));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m45744p() {
        int measuredWidth = this.f29401d.getMeasuredWidth();
        if (measuredWidth > 0) {
            xdl0.m208359W(this.f29401d, measuredWidth <= t100.m186890d(100.0f) ? t100.m186890d(78.0f) : t100.m186890d(16.0f));
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m45745q(BubbleInfo bubbleInfo, Act act, View view) {
        m45740l(bubbleInfo, act);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m45746r(GreetAct greetAct, BubbleInfo bubbleInfo, String str) {
        m45754z(greetAct, bubbleInfo);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m45747s(GreetAct greetAct, BubbleInfo bubbleInfo) {
        m45752x(greetAct, "coin", bubbleInfo, CoreModule.f17545c.f19570H0.m210376s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.greetNumber)));
        CoreModule.m29935P().m94656g().mo35038Xe();
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m45748t(GreetAct greetAct, BubbleInfo bubbleInfo, roj0 roj0Var) {
        if (CoreModule.m29935P().m94656g().mo35009Fh() > 0) {
            m45753y(greetAct, bubbleInfo);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m45749u(Throwable th) {
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 400) {
            lsi0.m151595y("状态已结束");
        } else if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40309) {
            osi0.m165783g("对方拉黑了你");
        } else {
            lsi0.m151595y("对方账号异常");
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: v */
    public void m45750v(final BubbleInfo bubbleInfo, final Act act) {
        this.f29400c.setText(bubbleInfo.emotion.text);
        m45741m(bubbleInfo);
        this.f29401d.post(new Runnable() { // from class: l.u9k
            @Override // java.lang.Runnable
            public final void run() {
                this.f175334a.m45744p();
            }
        });
        boolean z = bubbleInfo.haveLiked;
        VImage vImage = this.f29402e;
        if (z) {
            vImage.setBackgroundDrawable(CoreModule.f17544b.getDrawable(c3c0.f78774j0));
        } else {
            vImage.setBackgroundDrawable(CoreModule.f17544b.getDrawable(c3c0.f78783k0));
        }
        bkb0 bkb0Var = qib0.f154691G;
        VDraweeView vDraweeView = this.f29399b;
        String str = bubbleInfo.emotion.emojiUrl;
        int i = t100.f167231F;
        bkb0Var.m102325I0(vDraweeView, str, i, i);
        this.f29402e.setOnClickListener(new View.OnClickListener() { // from class: l.v9k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180656a.m45745q(bubbleInfo, act, view);
            }
        });
        zvf0.m220368A("e_other_state", "p_kankan_chat_popup", vwb.m200311Y("state_id", bubbleInfo.f38730id), vwb.m200311Y("owner_id", bubbleInfo.owner.f38803id));
        m45739k(bubbleInfo);
    }

    /* JADX INFO: renamed from: w */
    public final void m45751w(final GreetAct greetAct, final BubbleInfo bubbleInfo) {
        if (xma.m210048M3() || !greetAct.m45585e2().m45685k0()) {
            m45752x(greetAct, "privilege", bubbleInfo, "");
        } else if (CoreModule.m29935P().m94656g().mo35009Fh() > 0) {
            m45753y(greetAct, bubbleInfo);
        } else {
            CoreModule.m29935P().m94656g().mo35024Pk(greetAct, greetAct.m45584d2().getFrom(), new e30() { // from class: l.z9k
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f202298a.m45746r(greetAct, bubbleInfo, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m45752x(GreetAct greetAct, String str, BubbleInfo bubbleInfo, String str2) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.state_like);
        messageNew_.value = "赞了你的状态";
        MessageReference messageReferenceNew_ = MessageReference.new_();
        messageReferenceNew_.type = "state";
        messageReferenceNew_.f20447id = bubbleInfo.f38730id;
        messageNew_.api_only_reference = messageReferenceNew_;
        messageNew_.channel = MessageChannel.get("state");
        messageNew_.consumeType = str;
        messageNew_.coinSign = str2;
        greetAct.m45584d2().m45853J1(messageNew_);
    }

    /* JADX INFO: renamed from: y */
    public final void m45753y(final GreetAct greetAct, final BubbleInfo bubbleInfo) {
        if (CoreModule.m29935P().m94656g().mo35036Wi()) {
            CoreModule.f17557o.m195057d().mo33860jf(greetAct, CoreModule.f17545c.f19570H0.m210379t5(), null, null, new d30() { // from class: l.aak
                @Override // p149l.d30
                public final void call() {
                    this.f68570a.m45747s(greetAct, bubbleInfo);
                }
            });
        } else {
            m45752x(greetAct, "coin", bubbleInfo, CoreModule.f17545c.f19570H0.m210376s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.greetNumber)));
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m45754z(final GreetAct greetAct, final BubbleInfo bubbleInfo) {
        if (NullChecker.m81303a(greetAct)) {
            greetAct.duringCreated(CoreModule.f17545c.f19570H0.m210361k5()).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.bak
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f74697a.m45748t(greetAct, bubbleInfo, (roj0) obj);
                }
            }));
        }
    }

    public GreetMessageStateNewView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GreetMessageStateNewView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
