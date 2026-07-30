package p003l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.match.C0039b;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.ChatHeatActionData;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import l.az50;
import l.dyq;
import l.e51;
import l.emr;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mgh0;
import l.mkd0;
import l.ogl0;
import l.osi0;
import l.qib0;
import l.roj0;
import l.s7m;
import l.tae0;
import l.xma;
import org.eclipse.jetty.servlet.ServletHandler;
import org.spongycastle.i18n.TextBundle;
import p014rx.subjects.C1185a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class zax extends l5x<sbx> {

    /* JADX INFO: renamed from: d */
    public ArrayList<String> f9282d;

    /* JADX INFO: renamed from: e */
    public ArrayList<String> f9283e;

    /* JADX INFO: renamed from: f */
    public boolean f9284f;

    /* JADX INFO: renamed from: g */
    public C1185a<roj0> f9285g;

    public zax(mcr mcrVar) {
        super(mcrVar);
        this.f9284f = false;
        this.f9285g = C1185a.m9970c(roj0.a);
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m9349H0(Conversation conversation) {
        conversation.read = Boolean.TRUE;
        CoreModule.c.f0.mq(conversation);
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m9351J0(User user) {
        Conversation conversationQuery = CoreModule.k.m.query(((DbObject) user).id);
        conversationQuery.convType = ServletHandler.__DEFAULT_SERVLET;
        CoreModule.c.f0.mq(conversationQuery);
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m9355P0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public /* synthetic */ void m9367e1() {
        m9386v1(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public /* synthetic */ void m9368f1(Bundle bundle) {
        act().setSwipeBackEnable(false);
        mgh0.s();
        ((sbx) ((jq2) this).viewModel).m7547s0(NullChecker.a(bundle), this.f5219a);
        if (this.f5219a == 43) {
            this.f9284f = true;
            e51.H(act(), new Runnable() { // from class: l.dax
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2926a.m9367e1();
                }
            }, 1500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public /* synthetic */ void m9369g1(UserPrivilege userPrivilege) {
        CoreModule.K().pollConversation();
        act().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public /* synthetic */ void m9370h1(c cVar) {
        if (cVar == c.i) {
            s7m s7mVar = ((jq2) this).viewModel;
            ((sbx) s7mVar).f7183L.g(((sbx) s7mVar).act());
        } else if (cVar == c.j) {
            ((sbx) ((jq2) this).viewModel).f7183L.g((dyq) null);
        } else if (cVar == c.m) {
            ((sbx) ((jq2) this).viewModel).f7183L.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public /* synthetic */ void m9371i1() {
        ((sbx) ((jq2) this).viewModel).destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public /* synthetic */ void m9372j1(roj0 roj0Var) {
        User userP9 = CoreModule.c.e0.p9();
        User userById = CoreModule.K().getUserById(this.f5220b);
        this.f5221c = userById;
        ((sbx) ((jq2) this).viewModel).m7532Q0(userP9, userById, this.f5219a, this.f9283e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public /* synthetic */ void m9373m1(Counter counter) {
        if (CoreModule.P().a().e2()) {
            return;
        }
        final User userById = CoreModule.K().getUserById(this.f5220b);
        tae0.t(act(), userById, new e30() { // from class: l.yax
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f9038a.m9378l1(userById, (Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t1 */
    private void m9374t1(final String str, boolean z, final boolean z2) {
        final Conversation conversationXe = CoreModule.c.f0.Xe(this.f5220b);
        act().postDelayed(new Runnable() { // from class: l.jax
            @Override // java.lang.Runnable
            public final void run() {
                this.f4603a.m9381p1(conversationXe, str, z2);
            }
        }, z ? 500L : 1L);
        if (z) {
            act().hideInput();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m9375a0() {
        creates(new e30() { // from class: l.cax
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2603a.m9368f1((Bundle) obj);
            }
        }, new d30() { // from class: l.nax
            @Override // p003l.d30
            public final void call() {
                this.f5855a.m9371i1();
            }
        });
        duringCreated(this.f9285g).subscribe((m250) mkd0.G(new e30() { // from class: l.rax
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6826a.m9372j1((roj0) obj);
            }
        }));
        int i = this.f5219a;
        if (i != 43) {
            if (i == 45) {
                lifecycle().subscribe((m250) mkd0.G(new e30() { // from class: l.xax
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        this.f8758a.m9370h1((c) obj);
                    }
                }));
            }
        } else {
            duringCreated(CoreModule.c.n3().distinctUntilChanged()).filter(new w9j() { // from class: l.sax
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!CoreModule.P().a().e2());
                }
            }).take(1).subscribe((m250) mkd0.H(new e30() { // from class: l.tax
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f7427a.m9373m1((Counter) obj);
                }
            }, new e30() { // from class: l.uax
                @Override // p003l.e30
                public final void call(Object obj) {
                    zax.m9355P0((Throwable) obj);
                }
            }));
            if (ogl0.X()) {
                duringCreated(CoreModule.c.C0.u3(SummarizedPrivilegesId.get("limitedTrialSee")).filter(new w9j() { // from class: l.vax
                    @Override // p003l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(xma.E3());
                    }
                }).take(1)).subscribe((m250) mkd0.G(new e30() { // from class: l.wax
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        this.f8528a.m9369g1((UserPrivilege) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: d1 */
    public int m9376d1() {
        return this.f5219a;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m9377k1(User user) {
        C0039b.m702r(act(), user);
        act().finish();
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m9378l1(final User user, Integer num) {
        e51.y(new Runnable() { // from class: l.eax
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.c.U.a(new d30() { // from class: l.kax
                    @Override // p003l.d30
                    public final void call() {
                        zax.m9351J0(user);
                    }
                });
            }
        });
        az50.Companion.c();
        CoreModule.K().pollConversation();
        e51.H(act(), new Runnable() { // from class: l.fax
            @Override // java.lang.Runnable
            public final void run() {
                this.f3483a.m9377k1(user);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m9379n1(boolean z, roj0 roj0Var) {
        if (z) {
            lsi0.y("消息已发送");
        }
        act().finish();
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m9380o1(Message message, Throwable th) {
        if (su4.m7637f(th)) {
            su4.m7636e(act(), th, ChatHeatActionData.ExclusiveAction.CHECK);
        } else if (TantanException.Client.TantanForbidden.isIllegalContent(th)) {
            CoreModule.c.f0.Of(((DbObject) message).id);
            osi0.f(R.string.J7);
        } else {
            ccx.m3248f(R.string.yh, this.f5221c.fp().profileSmall());
            act().finish();
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m9381p1(final Conversation conversation, String str, final boolean z) {
        if (NullChecker.a(conversation)) {
            e51.y(new Runnable() { // from class: l.lax
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.U.a(new d30() { // from class: l.qax
                        @Override // p003l.d30
                        public final void call() {
                            zax.m9349H0(conversation);
                        }
                    });
                }
            });
        }
        final Message message = new Message();
        message.value = str;
        message.messageType = MessageType.get(TextBundle.TEXT_ENTRY);
        CoreModule.c.f0.Fn(this.f5220b, message, (Sticker) null, false, false).flatMap(new w9j() { // from class: l.max
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return CoreModule.c.f0.Fo();
            }
        }).subscribe((m250) mkd0.H(new e30() { // from class: l.oax
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6077a.m9379n1(z, (roj0) obj);
            }
        }, new e30() { // from class: l.pax
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6343a.m9380o1(message, (Throwable) obj);
            }
        }));
    }

    @Override // p003l.l5x
    /* JADX INFO: renamed from: q0 */
    public void mo5067q0(String str, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        super.mo5067q0(str, i, arrayList, arrayList2);
        this.f9282d = arrayList;
        this.f9283e = arrayList2;
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m9382q1(String str, boolean z) {
        m9374t1(str, z, false);
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m9383r1() {
        this.f9284f = false;
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m9384s1() {
        this.f9284f = false;
    }

    /* JADX INFO: renamed from: u1 */
    public void m9385u1(final String str, final boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!qib0.Z.K(str)) {
            m9374t1(str, z, false);
            return;
        }
        act().dialog().E0(R.string.zi).D(R.string.xi).k0(R.string.wi).t0(R.string.yi, new Runnable() { // from class: l.gax
            @Override // java.lang.Runnable
            public final void run() {
                this.f3824a.m9382q1(str, z);
            }
        }).z0();
        HashSet hashSet = new HashSet((Collection) MessagesAct.f1526r.get());
        hashSet.add(this.f5220b);
        MessagesAct.f1526r.put(hashSet);
    }

    /* JADX INFO: renamed from: v1 */
    public void m9386v1(boolean z) {
        if (z || !this.f9284f) {
            this.f9284f = true;
            if (emr.INSTANCE.b()) {
                com.p1.mobile.putong.core.ui.purchase.c.G0(act(), "p_message,locked_match", (e30) null, new d30() { // from class: l.hax
                    @Override // p003l.d30
                    public final void call() {
                        this.f4161a.m9383r1();
                    }
                });
            } else {
                com.p1.mobile.putong.core.ui.purchase.c.C1(act(), "p_message,locked_match", Privilege.see_who_likes_me, new d30() { // from class: l.iax
                    @Override // p003l.d30
                    public final void call() {
                        this.f4385a.m9384s1();
                    }
                });
            }
        }
    }
}
