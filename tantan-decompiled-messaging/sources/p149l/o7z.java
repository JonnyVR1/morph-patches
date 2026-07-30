package p149l;

import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4736e;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.group.GroupSetAct;
import com.p046p1.mobile.putong.core.p053ui.messages.view.GroupBannedView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class o7z extends tqz<j7z> {

    /* JADX INFO: renamed from: M1 */
    public GroupBannedView f142556M1;

    /* JADX INFO: renamed from: N1 */
    public View f142557N1;

    /* JADX INFO: renamed from: O1 */
    public boolean f142558O1;

    /* JADX INFO: renamed from: P1 */
    public String f142559P1;

    /* JADX INFO: renamed from: Q1 */
    public boolean f142560Q1;

    public o7z(MessagesAct messagesAct) {
        super(messagesAct);
        this.f142558O1 = true;
        this.f142559P1 = null;
        this.f142560Q1 = false;
    }

    /* JADX INFO: renamed from: l2 */
    public static /* synthetic */ void m163076l2(String str) {
    }

    /* JADX INFO: renamed from: m2 */
    public static /* synthetic */ void m163077m2(String str) {
    }

    /* JADX INFO: renamed from: y2 */
    private void m163080y2() {
        if (NullChecker.m81303a(m190324q0())) {
            xdl0.m208344M(m190324q0(), this.f142558O1);
            if (this.f142558O1) {
                m163086v2(m190324q0());
            }
        }
    }

    @Override // p149l.tqz
    /* JADX INFO: renamed from: D0 */
    public void mo103177D0() {
        super.mo103177D0();
        if (((j7z) this.f171750p1).mo120779h4()) {
            m163088z2(false);
        }
    }

    @Override // p149l.tqz
    /* JADX INFO: renamed from: E1 */
    public boolean mo103179E1(Menu menu) {
        super.mo103179E1(menu);
        if (CoreModule.m29935P().m94658i().mo158222E()) {
            final Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(((j7z) this.f171750p1).m120783i3());
            if (NullChecker.m81303a(conversationM32856Xe) && ml6.m155116a(conversationM32856Xe)) {
                MenuItem menuItemAdd = menu.add(4, y4c0.f196160k2, 2, "");
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setActionView(l6c0.f126447c1);
                View viewFindViewById = menuItemAdd.getActionView().findViewById(y4c0.f196167l2);
                this.f142557N1 = viewFindViewById;
                xdl0.m208329E0(viewFindViewById, new View.OnClickListener() { // from class: l.k7z
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f121707a.m163083r2(conversationM32856Xe, view);
                    }
                });
                m163080y2();
            }
        }
        return true;
    }

    @Override // p149l.tqz
    /* JADX INFO: renamed from: f0 */
    public u4z mo103231f0() {
        return new h4z();
    }

    /* JADX INFO: renamed from: p2 */
    public final void m163081p2() {
        if (this.f142556M1 == null) {
            this.f142556M1 = (GroupBannedView) o7r.m163037a(act()).inflate(l6c0.f126467f0, (ViewGroup) null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            P p = this.f171750p1;
            if (((j7z) p).f96912d == 33 || ((j7z) p).f96912d == 32) {
                layoutParams.topMargin = t100.f167230E;
            } else {
                layoutParams.topMargin = t100.f167231F;
            }
            this.f171733i.addView(this.f142556M1, layoutParams);
        }
    }

    /* JADX INFO: renamed from: q2 */
    public void m163082q2() {
        if (this.f142560Q1) {
            return;
        }
        this.f142560Q1 = true;
        ((j7z) this.f171750p1).m156455e0().mo48954A0().m156457g0().m128210t0().setGroupStyle(this.f171747o1);
        ((j7z) this.f171750p1).m156455e0().mo48971c0().m213058N0(true);
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m163083r2(Conversation conversation, View view) {
        act().startActivity(GroupSetAct.m49125Z1(act(), conversation.f56011id, conversation.otherUser));
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m163084s2(View view) {
        if (m190324q0().getVisibility() != 0) {
            C4736e c4736e = CoreModule.f17545c.f19645g0;
            C4736e.f19767E0.put(Boolean.TRUE);
        } else {
            jtk jtkVar = new jtk(act());
            jtkVar.m143129u(act().getString(R$string.f20847R2)).m143126r(true).m143117i(jtk.f119618E | jtk.f119614A).m143123o(-t100.m186890d(6.0f)).m143113e(-17664).m143109a(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m143112d(new jtk.InterfaceC17857b() { // from class: l.m7z
                @Override // p149l.jtk.InterfaceC17857b
                /* JADX INFO: renamed from: a */
                public final void mo135260a(String str) {
                    o7z.m163076l2(str);
                }
            }).m143110b(new jtk.InterfaceC17856a() { // from class: l.n7z
                @Override // p149l.jtk.InterfaceC17856a
                /* JADX INFO: renamed from: a */
                public final void mo125326a(String str) {
                    o7z.m163077m2(str);
                }
            });
            this.f142559P1 = ptk.m171332h().m171344r(jtkVar, view, (ViewGroup) act().getWindow().getDecorView());
        }
    }

    /* JADX INFO: renamed from: u2 */
    public void m163085u2(String str) {
        m163087w2(true);
        this.f142556M1.setBannedText(str);
    }

    /* JADX INFO: renamed from: v2 */
    public final void m163086v2(final View view) {
        if (TextUtils.isEmpty(this.f142559P1)) {
            C4736e c4736e = CoreModule.f17545c.f19645g0;
            if (C4736e.f19767E0.get().booleanValue()) {
                e51.m114743H(act(), new Runnable() { // from class: l.l7z
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f126759a.m163084s2(view);
                    }
                }, 400L);
                act().addSwipeBackListener(new C18867a());
                C4736e c4736e2 = CoreModule.f17545c.f19645g0;
                C4736e.f19767E0.put(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: renamed from: w2 */
    public void m163087w2(boolean z) {
        if (z) {
            m163081p2();
        }
        if (NullChecker.m81303a(this.f142556M1)) {
            xdl0.m208344M(this.f142556M1, z);
        }
    }

    /* JADX INFO: renamed from: z2 */
    public void m163088z2(boolean z) {
        this.f142558O1 = z;
        m163080y2();
    }

    /* JADX INFO: renamed from: l.o7z$a */
    public class C18867a implements mbh0 {
        public C18867a() {
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: Z */
        public void mo43538Z() {
            if (TextUtils.isEmpty(o7z.this.f142559P1)) {
                return;
            }
            ptk.m171332h().m171334g(o7z.this.f142559P1);
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: E0 */
        public void mo43535E0() {
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: O */
        public void mo43536O() {
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: D0 */
        public void mo43534D0(boolean z, float f, int i) {
        }
    }
}
