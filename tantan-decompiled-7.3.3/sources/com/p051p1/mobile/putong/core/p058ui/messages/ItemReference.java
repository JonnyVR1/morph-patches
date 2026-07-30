package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemReference;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p151v.VText;
import p153l.bnl0;
import p153l.edc0;
import p153l.g9c0;
import p153l.gta;
import p153l.hh7;
import p153l.ibc0;
import p153l.jek;
import p153l.jyb;
import p153l.kcg0;
import p153l.l51;
import p153l.ovb0;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.tye;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemReference extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public ItemReference f32309a;

    /* JADX INFO: renamed from: b */
    public VText f32310b;

    /* JADX INFO: renamed from: c */
    public VText f32311c;

    /* JADX INFO: renamed from: d */
    public VText f32312d;

    /* JADX INFO: renamed from: e */
    public View f32313e;

    /* JADX INFO: renamed from: f */
    public View f32314f;

    /* JADX INFO: renamed from: g */
    public kcg0 f32315g;

    /* JADX INFO: renamed from: h */
    public C22508b<Boolean> f32316h;

    /* JADX INFO: renamed from: i */
    public kcg0 f32317i;

    public ItemReference(Context context) {
        super(context);
        this.f32316h = C22508b.m222767b();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ String m49836h(User user) {
        String str = user.name;
        if (CoreModule.m30933P().m143412i().mo180495l()) {
            String strM116634y7 = CoreModule.f18264c.f20381e0.m116634y7(user.f56859id);
            if (!TextUtils.isEmpty(strM116634y7)) {
                return strM116634y7;
            }
        }
        return str;
    }

    private void setReferenceShow(boolean z) {
        bnl0.m105524M(this.f32314f, z);
        bnl0.m105554f0(this.f32310b, z ? 0 : qa00.m175859d(14.0f));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        if (TextUtils.isEmpty(message.referenceMsgId)) {
            setReferenceShow(false);
        } else {
            setReferenceShow(true);
            String str = message.referenceMsgId;
            MessagesAct messagesAct = (MessagesAct) getContext();
            psd0.m173633z(this.f32315g);
            psd0.m173633z(this.f32317i);
            this.f32317i = messagesAct.mo50158l().m111048t7().m178953j0().mo68557c(messagesAct, this.f32316h).subscribe(psd0.m173596G(new y20() { // from class: l.qfq
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f157321a.m49838j((Boolean) obj);
                }
            }));
            this.f32315g = messagesAct.mo50158l().m111048t7().m178953j0().mo68557c(messagesAct, CoreModule.f18264c.f20384f0.m33893Zo(message.cid, str).filter(new qcj() { // from class: l.rfq
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f162825a.m49839k((Message) obj);
                }
            }).take(1).flatMap(new qcj() { // from class: l.sfq
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f167755a.m49840l((Message) obj);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.tfq
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f173986a.m49841n((pf60) obj);
                }
            }));
        }
        this.f32310b.setText(tye.m193573e(new SpannableStringBuilder(message.value), tye.f176661c));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return jyb.m147507f0(jyb.m147495Z(getContext().getString(R$string.f21676c), new Runnable() { // from class: l.pfq
            @Override // java.lang.Runnable
            public final void run() {
                this.f152200a.m49837i();
            }
        }, Integer.valueOf(ibc0.f114176x1), null));
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m49837i() {
        l51.m152911q(this.f32310b.getText().toString());
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m49838j(Boolean bool) {
        setReferenceShow(!bool.booleanValue());
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Boolean m49839k(Message message) {
        this.f32316h.m137019l(Boolean.valueOf(message == null));
        return Boolean.valueOf(NullChecker.m82486a(message));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C22421c m49840l(final Message message) {
        return m49842o(message).take(1).map(new qcj() { // from class: l.ufq
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return pf60.m172085a(message, (String) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m49841n(pf60 pf60Var) {
        Message message = (Message) pf60Var.f152156a;
        this.f32311c.setText((String) pf60Var.f152157b);
        if (NullChecker.m82486a(message.recalled) && message.recalled.booleanValue()) {
            this.f32312d.setText(R$string.f21599S4);
            return;
        }
        boolean zEquals = TEnum.equals(message.status, "deleted");
        VText vText = this.f32312d;
        if (zEquals) {
            vText.setText("引用内容已删除");
        } else {
            vText.setText(jek.m144591w(message.value));
        }
    }

    /* JADX INFO: renamed from: o */
    public final C22421c<String> m49842o(final Message message) {
        if (message.isGroupMessage()) {
            return !TextUtils.isEmpty(message.api_only_otherUser) ? CoreModule.f18264c.f20387g0.m32847T6(message.api_only_otherUser, message.owner).filter(new hh7()).map(new qcj() { // from class: l.vfq
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((ChatGroupMember) obj).groupMemberName();
                }
            }) : CoreModule.f18264c.f20384f0.m33740Ne(message.cid).flatMap(new qcj() { // from class: l.wfq
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20387g0.m32847T6(((Conversation) obj).otherUser, message.owner);
                }
            }).filter(new hh7()).map(new qcj() { // from class: l.vfq
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((ChatGroupMember) obj).groupMemberName();
                }
            });
        }
        return CoreModule.f18264c.f20381e0.m116483Ka(message.owner).map(new qcj() { // from class: l.xfq
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ItemReference.m49836h((User) obj);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32309a = (ItemReference) findViewById(edc0.f93316Z);
        this.f32311c = (VText) findViewById(edc0.f93254O3);
        this.f32312d = (VText) findViewById(edc0.f93260P3);
        this.f32310b = (VText) findViewById(edc0.f93364g);
        this.f32313e = findViewById(edc0.f93242M3);
        this.f32314f = findViewById(edc0.f93248N3);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f32310b.setLinkTextColor(getResources().getColor(g9c0.f102820j));
        }
    }

    public ItemReference(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32316h = C22508b.m222767b();
    }

    public ItemReference(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32316h = C22508b.m222767b();
    }
}
