package com.p051p1.mobile.putong.core.p058ui.greet;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageChannel;
import com.p051p1.mobile.putong.core.data.MessageReference;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.fsb0;
import p153l.i4g0;
import p153l.ibc0;
import p153l.joa;
import p153l.jyb;
import p153l.o1j0;
import p153l.p9r;
import p153l.psd0;
import p153l.qa00;
import p153l.r1j0;
import p153l.tck;
import p153l.uqb0;
import p153l.uxj0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class GreetMessageStateNewView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f30246a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f30247b;

    /* JADX INFO: renamed from: c */
    public VText f30248c;

    /* JADX INFO: renamed from: d */
    public VText f30249d;

    /* JADX INFO: renamed from: e */
    public VImage f30250e;

    public GreetMessageStateNewView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i */
    public View m46920i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tck.m190450b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final void m46921j(BubbleInfo bubbleInfo) {
        i4g0.m138523u("e_other_state_like", "p_kankan_chat_popup", jyb.m147494Y("be_liked", Boolean.valueOf(!bubbleInfo.haveLiked)), jyb.m147494Y("state_id", bubbleInfo.f39578id), jyb.m147494Y("owner_id", bubbleInfo.owner.f39651id));
    }

    /* JADX INFO: renamed from: k */
    public final void m46922k(BubbleInfo bubbleInfo) {
        i4g0.m138492A("e_other_state_like", "p_kankan_chat_popup", jyb.m147494Y("be_liked", Boolean.valueOf(bubbleInfo.haveLiked)), jyb.m147494Y("state_id", bubbleInfo.f39578id), jyb.m147494Y("owner_id", bubbleInfo.owner.f39651id));
    }

    /* JADX INFO: renamed from: l */
    public final void m46923l(final BubbleInfo bubbleInfo, final Act act) {
        if (bubbleInfo.haveLiked) {
            act.duringCreated(CoreModule.m30932N().mo61476Ll(bubbleInfo.f39578id, bubbleInfo.owner.f39651id)).subscribe(psd0.m173597H(new y20() { // from class: l.nck
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f141370a.m46925n(bubbleInfo, (Envelope) obj);
                }
            }, new y20() { // from class: l.ock
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f146716a.m46932u((Throwable) obj);
                }
            }));
        } else {
            act.duringCreated(CoreModule.m30932N().mo61446Bg(bubbleInfo.f39578id, bubbleInfo.owner.f39651id)).subscribe(psd0.m173597H(new y20() { // from class: l.pck
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f151600a.m46926o(bubbleInfo, act, (Envelope) obj);
                }
            }, new y20() { // from class: l.ock
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f146716a.m46932u((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m46924m(BubbleInfo bubbleInfo) {
        String str = bubbleInfo.value;
        this.f30249d.setText(str);
        if (TextUtils.isEmpty(str) && NullChecker.m82486a(bubbleInfo.owner) && !TextUtils.isEmpty(bubbleInfo.owner.f39651id)) {
            User userMo61521Zk = CoreModule.m30932N().mo61521Zk(bubbleInfo.owner.f39651id);
            if (NullChecker.m82486a(userMo61521Zk)) {
                this.f30249d.setText(userMo61521Zk.isFemale() ? "她更新了状态" : "他更新了状态");
            } else {
                this.f30249d.setText("他更新了状态");
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m46925n(BubbleInfo bubbleInfo, Envelope envelope) {
        m46921j(bubbleInfo);
        bubbleInfo.haveLiked = false;
        this.f30250e.setBackgroundDrawable(CoreModule.f18263b.getDrawable(ibc0.f114058k0));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m46926o(BubbleInfo bubbleInfo, Act act, Envelope envelope) {
        m46921j(bubbleInfo);
        bubbleInfo.haveLiked = true;
        this.f30250e.setBackgroundDrawable(CoreModule.f18263b.getDrawable(ibc0.f114049j0));
        if (act instanceof GreetAct) {
            m46934w((GreetAct) act, bubbleInfo);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        addView(m46920i(p9r.m171370a(getContext()), this));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m46927p() {
        int measuredWidth = this.f30249d.getMeasuredWidth();
        if (measuredWidth > 0) {
            bnl0.m105539W(this.f30249d, measuredWidth <= qa00.m175859d(100.0f) ? qa00.m175859d(78.0f) : qa00.m175859d(16.0f));
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m46928q(BubbleInfo bubbleInfo, Act act, View view) {
        m46923l(bubbleInfo, act);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m46929r(GreetAct greetAct, BubbleInfo bubbleInfo, String str) {
        m46937z(greetAct, bubbleInfo);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m46930s(GreetAct greetAct, BubbleInfo bubbleInfo) {
        m46935x(greetAct, "coin", bubbleInfo, CoreModule.f18264c.f20312H0.m155464s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.greetNumber)));
        CoreModule.m30933P().m143410g().mo36041Xe();
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m46931t(GreetAct greetAct, BubbleInfo bubbleInfo, uxj0 uxj0Var) {
        if (CoreModule.m30933P().m143410g().mo36012Fh() > 0) {
            m46936y(greetAct, bubbleInfo);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m46932u(Throwable th) {
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 400) {
            o1j0.m165651y("状态已结束");
        } else if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40309) {
            r1j0.m179420g("对方拉黑了你");
        } else {
            o1j0.m165651y("对方账号异常");
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: v */
    public void m46933v(final BubbleInfo bubbleInfo, final Act act) {
        this.f30248c.setText(bubbleInfo.emotion.text);
        m46924m(bubbleInfo);
        this.f30249d.post(new Runnable() { // from class: l.lck
            @Override // java.lang.Runnable
            public final void run() {
                this.f131363a.m46927p();
            }
        });
        boolean z = bubbleInfo.haveLiked;
        VImage vImage = this.f30250e;
        if (z) {
            vImage.setBackgroundDrawable(CoreModule.f18263b.getDrawable(ibc0.f114049j0));
        } else {
            vImage.setBackgroundDrawable(CoreModule.f18263b.getDrawable(ibc0.f114058k0));
        }
        fsb0 fsb0Var = uqb0.f180374G;
        VDraweeView vDraweeView = this.f30247b;
        String str = bubbleInfo.emotion.emojiUrl;
        int i = qa00.f156293F;
        fsb0Var.m127109I0(vDraweeView, str, i, i);
        this.f30250e.setOnClickListener(new View.OnClickListener() { // from class: l.mck
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135821a.m46928q(bubbleInfo, act, view);
            }
        });
        i4g0.m138492A("e_other_state", "p_kankan_chat_popup", jyb.m147494Y("state_id", bubbleInfo.f39578id), jyb.m147494Y("owner_id", bubbleInfo.owner.f39651id));
        m46922k(bubbleInfo);
    }

    /* JADX INFO: renamed from: w */
    public final void m46934w(final GreetAct greetAct, final BubbleInfo bubbleInfo) {
        if (joa.m146362N3() || !greetAct.m46768g2().m46868k0()) {
            m46935x(greetAct, "privilege", bubbleInfo, "");
        } else if (CoreModule.m30933P().m143410g().mo36012Fh() > 0) {
            m46936y(greetAct, bubbleInfo);
        } else {
            CoreModule.m30933P().m143410g().mo36027Pk(greetAct, greetAct.m46767e2().getFrom(), new y20() { // from class: l.qck
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f156603a.m46929r(greetAct, bubbleInfo, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m46935x(GreetAct greetAct, String str, BubbleInfo bubbleInfo, String str2) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.state_like);
        messageNew_.value = "赞了你的状态";
        MessageReference messageReferenceNew_ = MessageReference.new_();
        messageReferenceNew_.type = "state";
        messageReferenceNew_.f21189id = bubbleInfo.f39578id;
        messageNew_.api_only_reference = messageReferenceNew_;
        messageNew_.channel = MessageChannel.get("state");
        messageNew_.consumeType = str;
        messageNew_.coinSign = str2;
        greetAct.m46767e2().m47036J1(messageNew_);
    }

    /* JADX INFO: renamed from: y */
    public final void m46936y(final GreetAct greetAct, final BubbleInfo bubbleInfo) {
        if (CoreModule.m30933P().m143410g().mo36039Wi()) {
            CoreModule.f18276o.m132214d().mo34863jf(greetAct, CoreModule.f18264c.f20312H0.m155467t5(), null, null, new x20() { // from class: l.rck
                @Override // p153l.x20
                public final void call() {
                    this.f162217a.m46930s(greetAct, bubbleInfo);
                }
            });
        } else {
            m46935x(greetAct, "coin", bubbleInfo, CoreModule.f18264c.f20312H0.m155464s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.greetNumber)));
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m46937z(final GreetAct greetAct, final BubbleInfo bubbleInfo) {
        if (NullChecker.m82486a(greetAct)) {
            greetAct.duringCreated(CoreModule.f18264c.f20312H0.m155449k5()).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.sck
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f167260a.m46931t(greetAct, bubbleInfo, (uxj0) obj);
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
