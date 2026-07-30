package p153l;

import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4887e;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.group.GroupSetAct;
import com.p051p1.mobile.putong.core.p058ui.messages.view.GroupBannedView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class lgz extends qzz<ggz> {

    /* JADX INFO: renamed from: M1 */
    public GroupBannedView f132026M1;

    /* JADX INFO: renamed from: N1 */
    public View f132027N1;

    /* JADX INFO: renamed from: O1 */
    public boolean f132028O1;

    /* JADX INFO: renamed from: P1 */
    public String f132029P1;

    /* JADX INFO: renamed from: Q1 */
    public boolean f132030Q1;

    public lgz(MessagesAct messagesAct) {
        super(messagesAct);
        this.f132028O1 = true;
        this.f132029P1 = null;
        this.f132030Q1 = false;
    }

    /* JADX INFO: renamed from: l2 */
    public static /* synthetic */ void m154140l2(String str) {
    }

    /* JADX INFO: renamed from: m2 */
    public static /* synthetic */ void m154141m2(String str) {
    }

    /* JADX INFO: renamed from: y2 */
    private void m154144y2() {
        if (NullChecker.m82486a(m178968q0())) {
            bnl0.m105524M(m178968q0(), this.f132028O1);
            if (this.f132028O1) {
                m154153v2(m178968q0());
            }
        }
    }

    @Override // p153l.qzz
    /* JADX INFO: renamed from: D0 */
    public void mo154145D0() {
        super.mo154145D0();
        if (((ggz) this.f160413p1).mo110985h4()) {
            m154155z2(false);
        }
    }

    @Override // p153l.qzz
    /* JADX INFO: renamed from: E1 */
    public boolean mo154146E1(Menu menu) {
        super.mo154146E1(menu);
        if (CoreModule.m30933P().m143412i().mo180314E()) {
            final Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(((ggz) this.f160413p1).m110989i3());
            if (NullChecker.m82486a(conversationM33859Xe) && pm6.m172913a(conversationM33859Xe)) {
                MenuItem menuItemAdd = menu.add(4, edc0.f93395k2, 2, "");
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setActionView(qec0.f157003c1);
                View viewFindViewById = menuItemAdd.getActionView().findViewById(edc0.f93402l2);
                this.f132027N1 = viewFindViewById;
                bnl0.m105509E0(viewFindViewById, new View.OnClickListener() { // from class: l.hgz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f109466a.m154150r2(conversationM33859Xe, view);
                    }
                });
                m154144y2();
            }
        }
        return true;
    }

    @Override // p153l.qzz
    /* JADX INFO: renamed from: f0 */
    public rdz mo154147f0() {
        return new edz();
    }

    /* JADX INFO: renamed from: p2 */
    public final void m154148p2() {
        if (this.f132026M1 == null) {
            this.f132026M1 = (GroupBannedView) p9r.m171370a(act()).inflate(qec0.f157023f0, (ViewGroup) null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            P p = this.f160413p1;
            if (((ggz) p).f82475d == 33 || ((ggz) p).f82475d == 32) {
                layoutParams.topMargin = qa00.f156292E;
            } else {
                layoutParams.topMargin = qa00.f156293F;
            }
            this.f160396i.addView(this.f132026M1, layoutParams);
        }
    }

    /* JADX INFO: renamed from: q2 */
    public void m154149q2() {
        if (this.f132030Q1) {
            return;
        }
        this.f132030Q1 = true;
        ((ggz) this.f160413p1).m143372e0().mo50138B0().m143374g0().m114041t0().setGroupStyle(this.f160410o1);
        ((ggz) this.f160413p1).m143372e0().mo50155d0().m201103N0(true);
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m154150r2(Conversation conversation, View view) {
        act().startActivity(GroupSetAct.m50308a2(act(), conversation.f56859id, conversation.otherUser));
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m154151s2(View view) {
        if (m178968q0().getVisibility() != 0) {
            C4887e c4887e = CoreModule.f18264c.f20387g0;
            C4887e.f20509E0.put(Boolean.TRUE);
        } else {
            zvk zvkVar = new zvk(act());
            zvkVar.m221776u(act().getString(R$string.f21589R2)).m221773r(true).m221764i(zvk.f206228E | zvk.f206224A).m221770o(-qa00.m175859d(6.0f)).m221760e(-17664).m221756a(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m221759d(new zvk.InterfaceC21906b() { // from class: l.jgz
                @Override // p153l.zvk.InterfaceC21906b
                /* JADX INFO: renamed from: a */
                public final void mo96261a(String str) {
                    lgz.m154140l2(str);
                }
            }).m221757b(new zvk.InterfaceC21905a() { // from class: l.kgz
                @Override // p153l.zvk.InterfaceC21905a
                /* JADX INFO: renamed from: a */
                public final void mo102709a(String str) {
                    lgz.m154141m2(str);
                }
            });
            this.f132029P1 = fwk.m127777h().m127789r(zvkVar, view, (ViewGroup) act().getWindow().getDecorView());
        }
    }

    /* JADX INFO: renamed from: u2 */
    public void m154152u2(String str) {
        m154154w2(true);
        this.f132026M1.setBannedText(str);
    }

    /* JADX INFO: renamed from: v2 */
    public final void m154153v2(final View view) {
        if (TextUtils.isEmpty(this.f132029P1)) {
            C4887e c4887e = CoreModule.f18264c.f20387g0;
            if (C4887e.f20509E0.get().booleanValue()) {
                l51.m152888H(act(), new Runnable() { // from class: l.igz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f114835a.m154151s2(view);
                    }
                }, 400L);
                act().addSwipeBackListener(new C18393a());
                C4887e c4887e2 = CoreModule.f18264c.f20387g0;
                C4887e.f20509E0.put(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: renamed from: w2 */
    public void m154154w2(boolean z) {
        if (z) {
            m154148p2();
        }
        if (NullChecker.m82486a(this.f132026M1)) {
            bnl0.m105524M(this.f132026M1, z);
        }
    }

    /* JADX INFO: renamed from: z2 */
    public void m154155z2(boolean z) {
        this.f132028O1 = z;
        m154144y2();
    }

    /* JADX INFO: renamed from: l.lgz$a */
    public class C18393a implements ujh0 {
        public C18393a() {
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: a0 */
        public void mo44724a0() {
            if (TextUtils.isEmpty(lgz.this.f132029P1)) {
                return;
            }
            fwk.m127777h().m127779g(lgz.this.f132029P1);
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: G0 */
        public void mo44721G0() {
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: P */
        public void mo44722P() {
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: E0 */
        public void mo44720E0(boolean z, float f, int i) {
        }
    }
}
