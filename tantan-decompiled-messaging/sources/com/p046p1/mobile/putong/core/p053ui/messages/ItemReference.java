package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemReference;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.c4g0;
import p149l.dg7;
import p149l.e30;
import p149l.e51;
import p149l.j760;
import p149l.knb0;
import p149l.mkd0;
import p149l.pxe;
import p149l.t100;
import p149l.tbk;
import p149l.ura;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemReference extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public ItemReference f31461a;

    /* JADX INFO: renamed from: b */
    public VText f31462b;

    /* JADX INFO: renamed from: c */
    public VText f31463c;

    /* JADX INFO: renamed from: d */
    public VText f31464d;

    /* JADX INFO: renamed from: e */
    public View f31465e;

    /* JADX INFO: renamed from: f */
    public View f31466f;

    /* JADX INFO: renamed from: g */
    public c4g0 f31467g;

    /* JADX INFO: renamed from: h */
    public C22393b<Boolean> f31468h;

    /* JADX INFO: renamed from: i */
    public c4g0 f31469i;

    public ItemReference(Context context) {
        super(context);
        this.f31468h = C22393b.m221521b();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ String m48653h(User user) {
        String str = user.name;
        if (CoreModule.m29935P().m94658i().mo158403l()) {
            String strM169561y7 = CoreModule.f17545c.f19639e0.m169561y7(user.f56011id);
            if (!TextUtils.isEmpty(strM169561y7)) {
                return strM169561y7;
            }
        }
        return str;
    }

    private void setReferenceShow(boolean z) {
        xdl0.m208344M(this.f31466f, z);
        xdl0.m208374f0(this.f31462b, z ? 0 : t100.m186890d(14.0f));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        if (TextUtils.isEmpty(message.referenceMsgId)) {
            setReferenceShow(false);
        } else {
            setReferenceShow(true);
            String str = message.referenceMsgId;
            MessagesAct messagesAct = (MessagesAct) getContext();
            mkd0.m154992z(this.f31467g);
            mkd0.m154992z(this.f31469i);
            this.f31469i = messagesAct.mo48974l().m120842t7().m190310j0().mo67374c(messagesAct, this.f31468h).subscribe(mkd0.m154955G(new e30() { // from class: l.qdq
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f153949a.m48655j((Boolean) obj);
                }
            }));
            this.f31467g = messagesAct.mo48974l().m120842t7().m190310j0().mo67374c(messagesAct, CoreModule.f17545c.f19642f0.m32890Zo(message.cid, str).filter(new w9j() { // from class: l.rdq
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f158963a.m48656k((Message) obj);
                }
            }).take(1).flatMap(new w9j() { // from class: l.sdq
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f163871a.m48657l((Message) obj);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.tdq
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f169748a.m48658n((j760) obj);
                }
            }));
        }
        this.f31462b.setText(pxe.m171836e(new SpannableStringBuilder(message.value), pxe.f151668c));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return vwb.m200324f0(vwb.m200312Z(getContext().getString(R$string.f20934c), new Runnable() { // from class: l.pdq
            @Override // java.lang.Runnable
            public final void run() {
                this.f148319a.m48654i();
            }
        }, Integer.valueOf(c3c0.f78901x1), null));
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m48654i() {
        e51.m114766q(this.f31462b.getText().toString());
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m48655j(Boolean bool) {
        setReferenceShow(!bool.booleanValue());
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Boolean m48656k(Message message) {
        this.f31468h.m132487l(Boolean.valueOf(message == null));
        return Boolean.valueOf(NullChecker.m81303a(message));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C22306c m48657l(final Message message) {
        return m48659o(message).take(1).map(new w9j() { // from class: l.udq
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return j760.m140076a(message, (String) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m48658n(j760 j760Var) {
        Message message = (Message) j760Var.f116564a;
        this.f31463c.setText((String) j760Var.f116565b);
        if (NullChecker.m81303a(message.recalled) && message.recalled.booleanValue()) {
            this.f31464d.setText(R$string.f20857S4);
            return;
        }
        boolean zEquals = TEnum.equals(message.status, "deleted");
        VText vText = this.f31464d;
        if (zEquals) {
            vText.setText("引用内容已删除");
        } else {
            vText.setText(tbk.m187876w(message.value));
        }
    }

    /* JADX INFO: renamed from: o */
    public final C22306c<String> m48659o(final Message message) {
        if (message.isGroupMessage()) {
            return !TextUtils.isEmpty(message.api_only_otherUser) ? CoreModule.f17545c.f19645g0.m31844T6(message.api_only_otherUser, message.owner).filter(new dg7()).map(new w9j() { // from class: l.vdq
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ChatGroupMember) obj).groupMemberName();
                }
            }) : CoreModule.f17545c.f19642f0.m32737Ne(message.cid).flatMap(new w9j() { // from class: l.wdq
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19645g0.m31844T6(((Conversation) obj).otherUser, message.owner);
                }
            }).filter(new dg7()).map(new w9j() { // from class: l.vdq
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ChatGroupMember) obj).groupMemberName();
                }
            });
        }
        return CoreModule.f17545c.f19639e0.m169410Ka(message.owner).map(new w9j() { // from class: l.xdq
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ItemReference.m48653h((User) obj);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31461a = (ItemReference) findViewById(y4c0.f196081Z);
        this.f31463c = (VText) findViewById(y4c0.f196019O3);
        this.f31464d = (VText) findViewById(y4c0.f196025P3);
        this.f31462b = (VText) findViewById(y4c0.f196129g);
        this.f31465e = findViewById(y4c0.f196007M3);
        this.f31466f = findViewById(y4c0.f196013N3);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31462b.setLinkTextColor(getResources().getColor(a1c0.f67156j));
        }
    }

    public ItemReference(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31468h = C22393b.m221521b();
    }

    public ItemReference(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31468h = C22393b.m221521b();
    }
}
