package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.UserId;
import com.p046p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.e30;
import p149l.j000;
import p149l.k4q;
import p149l.mkd0;
import p149l.mqi0;
import p149l.osi0;
import p149l.qsz;
import p149l.roj0;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemGuideAuthentication extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ItemGuideAuthentication f30980a;

    /* JADX INFO: renamed from: b */
    public VLinear f30981b;

    /* JADX INFO: renamed from: c */
    public VImage f30982c;

    /* JADX INFO: renamed from: d */
    public VText f30983d;

    /* JADX INFO: renamed from: e */
    public VText f30984e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f30985f;

    /* JADX INFO: renamed from: g */
    public VText f30986g;

    /* JADX INFO: renamed from: h */
    public boolean f30987h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemGuideAuthentication$a */
    public class ViewOnClickListenerC8489a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f30988a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ User f30989b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f30990c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ j000 f30991d;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemGuideAuthentication$a$a */
        public class a implements e30<roj0> {
            public a() {
            }

            @Override // p149l.e30
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(roj0 roj0Var) {
                ConversationCounterTypeSp.InviationForAuthenticationTime.setLong(ViewOnClickListenerC8489a.this.f30988a.f56011id, mqi0.m155944o());
                ItemGuideAuthentication.this.f30986g.setTextColor(Color.parseColor("#33000000"));
                ItemGuideAuthentication.this.f30986g.setText("邀请已发送");
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemGuideAuthentication$a$b */
        public class b implements e30<Throwable> {
            public b() {
            }

            @Override // p149l.e30
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(Throwable th) {
            }
        }

        public ViewOnClickListenerC8489a(User user, User user2, String str, j000 j000Var) {
            this.f30988a = user;
            this.f30989b = user2;
            this.f30990c = str;
            this.f30991d = j000Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CoreModule.f17545c.f19639e0.m169370Aa(this.f30988a)) {
                osi0.m165783g("对方已与你解除配对");
                return;
            }
            zvf0.m220399u("e_ask_to_invite_other_verify", OMSDialogPositon.p_chat_view, vwb.m200311Y(UserId.TYPE, this.f30989b.f56011id), vwb.m200311Y("moments_user_id", this.f30988a.f56011id), vwb.m200311Y("invite_to_verify_button_status", this.f30990c));
            long j = ConversationCounterTypeSp.InviationForAuthenticationTime.getLong(this.f30988a.f56011id);
            if (j <= 0 || mqi0.m155944o() - j >= 259200000) {
                this.f30991d.mo67374c(ItemGuideAuthentication.this.m48189b(), CoreModule.f17545c.f19642f0.m33132th(this.f30988a.f56011id)).subscribe(mkd0.m154956H(new a(), new b()));
            } else {
                ItemGuideAuthentication.this.f30986g.setTextColor(Color.parseColor("#33000000"));
                ItemGuideAuthentication.this.f30986g.setText("邀请已发送");
            }
        }
    }

    public ItemGuideAuthentication(Context context) {
        super(context);
        this.f30987h = false;
    }

    /* JADX INFO: renamed from: d */
    public static void m48187d(qsz qszVar, User user, User user2, String str) {
        if (qszVar.m176377a("ITEM_GUIDE_AUTHENTICATION" + user2.f56011id + user.f56011id + str)) {
            return;
        }
        qszVar.m176378b("ITEM_GUIDE_AUTHENTICATION" + user2.f56011id + user.f56011id + str);
        zvf0.m220368A("e_ask_to_invite_other_verify", OMSDialogPositon.p_chat_view, vwb.m200311Y(UserId.TYPE, user2.f56011id), vwb.m200311Y("moments_user_id", user.f56011id), vwb.m200311Y("invite_to_verify_button_status", str));
    }

    /* JADX INFO: renamed from: a */
    public final void m48188a(View view) {
        k4q.m144501a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public MessagesAct m48189b() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: c */
    public void m48190c(User user, Message message, j000 j000Var, qsz qszVar) {
        User user2;
        String str;
        if (user == null || qszVar == null || !TEnum.equals(message.messageType, MessageType.local_invitation_for_authentication)) {
            return;
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        this.f30983d.setText("让相处更安心");
        this.f30984e.setText(String.format("对方暂未完成认证，可以邀请%s完成真人认证，让聊天更安心", user.getPronoun()));
        if (!user.isPicVerificationVerified()) {
            long j = ConversationCounterTypeSp.InviationForAuthenticationTime.getLong(user.f56011id);
            if (j <= 0 || mqi0.m155944o() - j >= 259200000) {
                this.f30986g.setTextColor(Color.parseColor("#FE7E1D"));
                this.f30986g.setText(String.format("邀请%s去认证", user.getPronoun()));
                user2 = user;
                xdl0.m208329E0(this.f30986g, new ViewOnClickListenerC8489a(user2, userM169527p9, "able_to_invite", j000Var));
                str = "able_to_invite";
            } else {
                this.f30986g.setTextColor(Color.parseColor("#33000000"));
                this.f30986g.setText("邀请已发送");
                str = "sent_invitation";
            }
            m48187d(qszVar, user2, userM169527p9, str);
        }
        this.f30986g.setTextColor(Color.parseColor("#33000000"));
        this.f30986g.setText(String.format("%s已完成认证", user.getPronoun()));
        str = "done_verification";
        user2 = user;
        m48187d(qszVar, user2, userM169527p9, str);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48188a(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            xdl0.m208346N(this.f30982c, c3c0.f78830p2);
            this.f30983d.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f30984e.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f30986g.setTextColor(getResources().getColor(a1c0.f67156j));
        }
    }

    public ItemGuideAuthentication(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30987h = false;
    }

    public ItemGuideAuthentication(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30987h = false;
    }
}
