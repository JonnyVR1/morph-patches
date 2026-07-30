package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.UserId;
import com.p051p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.g900;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.k6q;
import p153l.n100;
import p153l.psd0;
import p153l.pzi0;
import p153l.r1j0;
import p153l.uxj0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemGuideAuthentication extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ItemGuideAuthentication f31828a;

    /* JADX INFO: renamed from: b */
    public VLinear f31829b;

    /* JADX INFO: renamed from: c */
    public VImage f31830c;

    /* JADX INFO: renamed from: d */
    public VText f31831d;

    /* JADX INFO: renamed from: e */
    public VText f31832e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f31833f;

    /* JADX INFO: renamed from: g */
    public VText f31834g;

    /* JADX INFO: renamed from: h */
    public boolean f31835h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemGuideAuthentication$a */
    public class ViewOnClickListenerC8652a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f31836a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ User f31837b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f31838c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ g900 f31839d;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemGuideAuthentication$a$a */
        public class a implements y20<uxj0> {
            public a() {
            }

            @Override // p153l.y20
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(uxj0 uxj0Var) {
                ConversationCounterTypeSp.InviationForAuthenticationTime.setLong(ViewOnClickListenerC8652a.this.f31836a.f56859id, pzi0.m174454o());
                ItemGuideAuthentication.this.f31834g.setTextColor(Color.parseColor("#33000000"));
                ItemGuideAuthentication.this.f31834g.setText("邀请已发送");
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemGuideAuthentication$a$b */
        public class b implements y20<Throwable> {
            public b() {
            }

            @Override // p153l.y20
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(Throwable th) {
            }
        }

        public ViewOnClickListenerC8652a(User user, User user2, String str, g900 g900Var) {
            this.f31836a = user;
            this.f31837b = user2;
            this.f31838c = str;
            this.f31839d = g900Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CoreModule.f18264c.f20381e0.m116443Aa(this.f31836a)) {
                r1j0.m179420g("对方已与你解除配对");
                return;
            }
            i4g0.m138523u("e_ask_to_invite_other_verify", OMSDialogPositon.p_chat_view, jyb.m147494Y(UserId.TYPE, this.f31837b.f56859id), jyb.m147494Y("moments_user_id", this.f31836a.f56859id), jyb.m147494Y("invite_to_verify_button_status", this.f31838c));
            long j = ConversationCounterTypeSp.InviationForAuthenticationTime.getLong(this.f31836a.f56859id);
            if (j <= 0 || pzi0.m174454o() - j >= 259200000) {
                this.f31839d.mo68557c(ItemGuideAuthentication.this.m49372b(), CoreModule.f18264c.f20384f0.m34135th(this.f31836a.f56859id)).subscribe(psd0.m173597H(new a(), new b()));
            } else {
                ItemGuideAuthentication.this.f31834g.setTextColor(Color.parseColor("#33000000"));
                ItemGuideAuthentication.this.f31834g.setText("邀请已发送");
            }
        }
    }

    public ItemGuideAuthentication(Context context) {
        super(context);
        this.f31835h = false;
    }

    /* JADX INFO: renamed from: d */
    public static void m49370d(n100 n100Var, User user, User user2, String str) {
        if (n100Var.m161054a("ITEM_GUIDE_AUTHENTICATION" + user2.f56859id + user.f56859id + str)) {
            return;
        }
        n100Var.m161055b("ITEM_GUIDE_AUTHENTICATION" + user2.f56859id + user.f56859id + str);
        i4g0.m138492A("e_ask_to_invite_other_verify", OMSDialogPositon.p_chat_view, jyb.m147494Y(UserId.TYPE, user2.f56859id), jyb.m147494Y("moments_user_id", user.f56859id), jyb.m147494Y("invite_to_verify_button_status", str));
    }

    /* JADX INFO: renamed from: a */
    public final void m49371a(View view) {
        k6q.m148539a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public MessagesAct m49372b() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: c */
    public void m49373c(User user, Message message, g900 g900Var, n100 n100Var) {
        User user2;
        String str;
        if (user == null || n100Var == null || !TEnum.equals(message.messageType, MessageType.local_invitation_for_authentication)) {
            return;
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        this.f31831d.setText("让相处更安心");
        this.f31832e.setText(String.format("对方暂未完成认证，可以邀请%s完成真人认证，让聊天更安心", user.getPronoun()));
        if (!user.isPicVerificationVerified()) {
            long j = ConversationCounterTypeSp.InviationForAuthenticationTime.getLong(user.f56859id);
            if (j <= 0 || pzi0.m174454o() - j >= 259200000) {
                this.f31834g.setTextColor(Color.parseColor("#FE7E1D"));
                this.f31834g.setText(String.format("邀请%s去认证", user.getPronoun()));
                user2 = user;
                bnl0.m105509E0(this.f31834g, new ViewOnClickListenerC8652a(user2, userM116600p9, "able_to_invite", g900Var));
                str = "able_to_invite";
            } else {
                this.f31834g.setTextColor(Color.parseColor("#33000000"));
                this.f31834g.setText("邀请已发送");
                str = "sent_invitation";
            }
            m49370d(n100Var, user2, userM116600p9, str);
        }
        this.f31834g.setTextColor(Color.parseColor("#33000000"));
        this.f31834g.setText(String.format("%s已完成认证", user.getPronoun()));
        str = "done_verification";
        user2 = user;
        m49370d(n100Var, user2, userM116600p9, str);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49371a(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            bnl0.m105526N(this.f31830c, ibc0.f114105p2);
            this.f31831d.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f31832e.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f31834g.setTextColor(getResources().getColor(g9c0.f102820j));
        }
    }

    public ItemGuideAuthentication(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31835h = false;
    }

    public ItemGuideAuthentication(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31835h = false;
    }
}
