package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemReference;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.dg7;
import l.e51;
import l.j760;
import l.knb0;
import l.mkd0;
import l.t100;
import l.ura;
import l.vwb;
import l.xdl0;
import l.y4c0;
import p003l.c4g0;
import p003l.e30;
import p003l.m250;
import p003l.pxe;
import p003l.tbk;
import p003l.w9j;
import p014rx.C1099c;
import p014rx.subjects.C1186b;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemReference extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public ItemReference f1352a;

    /* JADX INFO: renamed from: b */
    public VText f1353b;

    /* JADX INFO: renamed from: c */
    public VText f1354c;

    /* JADX INFO: renamed from: d */
    public VText f1355d;

    /* JADX INFO: renamed from: e */
    public View f1356e;

    /* JADX INFO: renamed from: f */
    public View f1357f;

    /* JADX INFO: renamed from: g */
    public c4g0 f1358g;

    /* JADX INFO: renamed from: h */
    public C1186b<Boolean> f1359h;

    /* JADX INFO: renamed from: i */
    public c4g0 f1360i;

    public ItemReference(Context context) {
        super(context);
        this.f1359h = C1186b.m9978b();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ String m1737h(User user) {
        String str = user.name;
        if (CoreModule.P().i().l()) {
            String strY7 = CoreModule.c.e0.y7(((DbObject) user).id);
            if (!TextUtils.isEmpty(strY7)) {
                return strY7;
            }
        }
        return str;
    }

    private void setReferenceShow(boolean z) {
        xdl0.M(this.f1357f, z);
        xdl0.f0(this.f1353b, z ? 0 : t100.d(14.0f));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        if (TextUtils.isEmpty(message.referenceMsgId)) {
            setReferenceShow(false);
        } else {
            setReferenceShow(true);
            String str = message.referenceMsgId;
            MessagesAct messagesAct = (MessagesAct) getContext();
            mkd0.z(this.f1358g);
            mkd0.z(this.f1360i);
            this.f1360i = messagesAct.mo2066l().m4309t7().m7936j0().c(messagesAct, this.f1359h).subscribe((m250) mkd0.G(new e30() { // from class: l.qdq
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f6628a.m1739j((Boolean) obj);
                }
            }));
            this.f1358g = messagesAct.mo2066l().m4309t7().m7936j0().c(messagesAct, CoreModule.c.f0.Zo(message.cid, str).filter(new w9j() { // from class: l.rdq
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return this.f6891a.m1740k((Message) obj);
                }
            }).take(1).flatMap(new w9j() { // from class: l.sdq
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return this.f7220a.m1741l((Message) obj);
                }
            })).subscribe((m250) mkd0.G(new e30() { // from class: l.tdq
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f7455a.m1742n((j760) obj);
                }
            }));
        }
        this.f1353b.setText(pxe.m6949e(new SpannableStringBuilder(message.value), pxe.f6542c));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return vwb.f0(new knb0[]{vwb.Z(getContext().getString(R.string.c), new Runnable() { // from class: l.pdq
            @Override // java.lang.Runnable
            public final void run() {
                this.f6385a.m1738i();
            }
        }, Integer.valueOf(c3c0.x1), (Object) null)});
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m1738i() {
        e51.q(this.f1353b.getText().toString());
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m1739j(Boolean bool) {
        setReferenceShow(!bool.booleanValue());
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Boolean m1740k(Message message) {
        this.f1359h.onNext(Boolean.valueOf(message == null));
        return Boolean.valueOf(NullChecker.a(message));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C1099c m1741l(final Message message) {
        return m1743o(message).take(1).map(new w9j() { // from class: l.udq
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return j760.a(message, (String) obj);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m1742n(j760 j760Var) {
        Message message = (Message) j760Var.a;
        this.f1354c.setText((String) j760Var.b);
        if (NullChecker.a(message.recalled) && message.recalled.booleanValue()) {
            this.f1355d.setText(R.string.S4);
            return;
        }
        boolean zEquals = TEnum.equals(message.status, "deleted");
        AppCompatTextView appCompatTextView = this.f1355d;
        if (zEquals) {
            appCompatTextView.setText("引用内容已删除");
        } else {
            appCompatTextView.setText(tbk.m7729w(message.value));
        }
    }

    /* JADX INFO: renamed from: o */
    public final C1099c<String> m1743o(final Message message) {
        if (message.isGroupMessage()) {
            return !TextUtils.isEmpty(message.api_only_otherUser) ? CoreModule.c.g0.T6(message.api_only_otherUser, message.owner).filter(new dg7()).map(new w9j() { // from class: l.vdq
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return ((ChatGroupMember) obj).groupMemberName();
                }
            }) : CoreModule.c.f0.Ne(message.cid).flatMap(new w9j() { // from class: l.wdq
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return CoreModule.c.g0.T6(((Conversation) obj).otherUser, message.owner);
                }
            }).filter(new dg7()).map(new w9j() { // from class: l.vdq
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return ((ChatGroupMember) obj).groupMemberName();
                }
            });
        }
        return CoreModule.c.e0.Ka(message.owner).map(new w9j() { // from class: l.xdq
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return ItemReference.m1737h((User) obj);
            }
        });
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1352a = (ItemReference) findViewById(y4c0.Z);
        this.f1354c = (VText) findViewById(y4c0.O3);
        this.f1355d = (VText) findViewById(y4c0.P3);
        this.f1353b = (VText) findViewById(y4c0.g);
        this.f1356e = findViewById(y4c0.M3);
        this.f1357f = findViewById(y4c0.N3);
        if (ura.e().d().I4()) {
            this.f1353b.setLinkTextColor(getResources().getColor(a1c0.j));
        }
    }

    public ItemReference(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1359h = C1186b.m9978b();
    }

    public ItemReference(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1359h = C1186b.m9978b();
    }
}
