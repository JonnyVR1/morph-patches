package com.p000p1.mobile.putong.core.p001ui.greet;

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
import com.p000p1.mobile.putong.core.data.ConsumeType;
import com.p000p1.mobile.putong.core.data.Message;
import com.p000p1.mobile.putong.core.data.MessageChannel;
import com.p000p1.mobile.putong.core.data.MessageReference;
import com.p000p1.mobile.putong.core.data.MessageType;
import com.p000p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.BubbleInfo;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.bkb0;
import l.d30;
import l.e30;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.o7r;
import l.osi0;
import l.qib0;
import l.roj0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.xma;
import l.zvf0;
import p003l.c3c0;
import p003l.cak;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GreetMessageStateNewView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f1792a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f1793b;

    /* JADX INFO: renamed from: c */
    public VText f1794c;

    /* JADX INFO: renamed from: d */
    public VText f1795d;

    /* JADX INFO: renamed from: e */
    public VImage f1796e;

    public GreetMessageStateNewView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i */
    public View m3075i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cak.m5874b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final void m3076j(BubbleInfo bubbleInfo) {
        zvf0.u("e_other_state_like", "p_kankan_chat_popup", new j760[]{vwb.Y("be_liked", Boolean.valueOf(!bubbleInfo.haveLiked)), vwb.Y("state_id", bubbleInfo.id), vwb.Y("owner_id", bubbleInfo.owner.id)});
    }

    /* JADX INFO: renamed from: k */
    public final void m3077k(BubbleInfo bubbleInfo) {
        zvf0.A("e_other_state_like", "p_kankan_chat_popup", new j760[]{vwb.Y("be_liked", Boolean.valueOf(bubbleInfo.haveLiked)), vwb.Y("state_id", bubbleInfo.id), vwb.Y("owner_id", bubbleInfo.owner.id)});
    }

    /* JADX INFO: renamed from: l */
    public final void m3078l(final BubbleInfo bubbleInfo, final Act act) {
        if (bubbleInfo.haveLiked) {
            act.duringCreated(CoreModule.N().Ll(bubbleInfo.id, bubbleInfo.owner.id)).subscribe(mkd0.H(new e30() { // from class: l.w9k
                public final void call(Object obj) {
                    this.f8146a.m3080n(bubbleInfo, (Envelope) obj);
                }
            }, new e30() { // from class: l.x9k
                public final void call(Object obj) {
                    this.f8430a.m3087u((Throwable) obj);
                }
            }));
        } else {
            act.duringCreated(CoreModule.N().Bg(bubbleInfo.id, bubbleInfo.owner.id)).subscribe(mkd0.H(new e30() { // from class: l.y9k
                public final void call(Object obj) {
                    this.f9011a.m3081o(bubbleInfo, act, (Envelope) obj);
                }
            }, new e30() { // from class: l.x9k
                public final void call(Object obj) {
                    this.f8430a.m3087u((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m3079m(BubbleInfo bubbleInfo) {
        String str = bubbleInfo.value;
        this.f1795d.setText(str);
        if (TextUtils.isEmpty(str) && NullChecker.a(bubbleInfo.owner) && !TextUtils.isEmpty(bubbleInfo.owner.id)) {
            User userZk = CoreModule.N().Zk(bubbleInfo.owner.id);
            if (NullChecker.a(userZk)) {
                this.f1795d.setText(userZk.isFemale() ? "她更新了状态" : "他更新了状态");
            } else {
                this.f1795d.setText("他更新了状态");
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m3080n(BubbleInfo bubbleInfo, Envelope envelope) {
        m3076j(bubbleInfo);
        bubbleInfo.haveLiked = false;
        this.f1796e.setBackgroundDrawable(CoreModule.b.getDrawable(c3c0.f3820k0));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m3081o(BubbleInfo bubbleInfo, Act act, Envelope envelope) {
        m3076j(bubbleInfo);
        bubbleInfo.haveLiked = true;
        this.f1796e.setBackgroundDrawable(CoreModule.b.getDrawable(c3c0.f3811j0));
        if (act instanceof GreetAct) {
            m3089w((GreetAct) act, bubbleInfo);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        addView(m3075i(o7r.a(getContext()), this));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m3082p() {
        int measuredWidth = this.f1795d.getMeasuredWidth();
        if (measuredWidth > 0) {
            xdl0.W(this.f1795d, measuredWidth <= t100.d(100.0f) ? t100.d(78.0f) : t100.d(16.0f));
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m3083q(BubbleInfo bubbleInfo, Act act, View view) {
        m3078l(bubbleInfo, act);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m3084r(GreetAct greetAct, BubbleInfo bubbleInfo, String str) {
        m3092z(greetAct, bubbleInfo);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m3085s(GreetAct greetAct, BubbleInfo bubbleInfo) {
        m3090x(greetAct, "coin", bubbleInfo, CoreModule.c.H0.s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.greetNumber)));
        CoreModule.P().g().Xe();
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m3086t(GreetAct greetAct, BubbleInfo bubbleInfo, roj0 roj0Var) {
        if (CoreModule.P().g().Fh() > 0) {
            m3091y(greetAct, bubbleInfo);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m3087u(Throwable th) {
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 400) {
            lsi0.y("状态已结束");
        } else if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40309) {
            osi0.g("对方拉黑了你");
        } else {
            lsi0.y("对方账号异常");
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: v */
    public void m3088v(final BubbleInfo bubbleInfo, final Act act) {
        this.f1794c.setText(bubbleInfo.emotion.text);
        m3079m(bubbleInfo);
        this.f1795d.post(new Runnable() { // from class: l.u9k
            @Override // java.lang.Runnable
            public final void run() {
                this.f7715a.m3082p();
            }
        });
        boolean z = bubbleInfo.haveLiked;
        VImage vImage = this.f1796e;
        if (z) {
            vImage.setBackgroundDrawable(CoreModule.b.getDrawable(c3c0.f3811j0));
        } else {
            vImage.setBackgroundDrawable(CoreModule.b.getDrawable(c3c0.f3820k0));
        }
        bkb0 bkb0Var = qib0.G;
        VDraweeView vDraweeView = this.f1793b;
        String str = bubbleInfo.emotion.emojiUrl;
        int i = t100.F;
        bkb0Var.I0(vDraweeView, str, i, i);
        this.f1796e.setOnClickListener(new View.OnClickListener() { // from class: l.v9k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7956a.m3083q(bubbleInfo, act, view);
            }
        });
        zvf0.A("e_other_state", "p_kankan_chat_popup", new j760[]{vwb.Y("state_id", bubbleInfo.id), vwb.Y("owner_id", bubbleInfo.owner.id)});
        m3077k(bubbleInfo);
    }

    /* JADX INFO: renamed from: w */
    public final void m3089w(final GreetAct greetAct, final BubbleInfo bubbleInfo) {
        if (xma.M3() || !greetAct.m2921e2().m3023k0()) {
            m3090x(greetAct, ConsumeType.privilege, bubbleInfo, "");
        } else if (CoreModule.P().g().Fh() > 0) {
            m3091y(greetAct, bubbleInfo);
        } else {
            CoreModule.P().g().Pk(greetAct, greetAct.m2920d2().getFrom(), new e30() { // from class: l.z9k
                public final void call(Object obj) {
                    this.f9211a.m3084r(greetAct, bubbleInfo, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m3090x(GreetAct greetAct, String str, BubbleInfo bubbleInfo, String str2) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.state_like);
        messageNew_.value = "赞了你的状态";
        MessageReference messageReferenceNew_ = MessageReference.new_();
        messageReferenceNew_.type = MessageChannel.state;
        messageReferenceNew_.f109id = bubbleInfo.id;
        messageNew_.api_only_reference = messageReferenceNew_;
        messageNew_.channel = MessageChannel.get(MessageChannel.state);
        messageNew_.consumeType = str;
        messageNew_.coinSign = str2;
        greetAct.m2920d2().m3197J1(messageNew_);
    }

    /* JADX INFO: renamed from: y */
    public final void m3091y(final GreetAct greetAct, final BubbleInfo bubbleInfo) {
        if (CoreModule.P().g().Wi()) {
            CoreModule.o.d().jf(greetAct, CoreModule.c.H0.t5(), (Runnable) null, (Runnable) null, new d30() { // from class: l.aak
                public final void call() {
                    this.f2750a.m3085s(greetAct, bubbleInfo);
                }
            });
        } else {
            m3090x(greetAct, "coin", bubbleInfo, CoreModule.c.H0.s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.greetNumber)));
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m3092z(final GreetAct greetAct, final BubbleInfo bubbleInfo) {
        if (NullChecker.a(greetAct)) {
            greetAct.duringCreated(CoreModule.c.H0.k5()).take(1).subscribe(mkd0.G(new e30() { // from class: l.bak
                public final void call(Object obj) {
                    this.f3357a.m3086t(greetAct, bubbleInfo, (roj0) obj);
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
