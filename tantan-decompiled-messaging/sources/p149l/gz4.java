package p149l;

import android.text.TextUtils;
import android.util.Size;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveChatMessageContentInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.common.chat.ChatView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.inputEntry.ChatInputEntryView;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class gz4<D extends ho2> extends pat<D> {

    /* JADX INFO: renamed from: i */
    public x15<D> f105078i;

    /* JADX INFO: renamed from: j */
    public nv4<D> f105079j;

    /* JADX INFO: renamed from: k */
    public yq2 f105080k;

    /* JADX INFO: renamed from: l */
    public String f105081l;

    /* JADX INFO: renamed from: m */
    public String f105082m;

    /* JADX INFO: renamed from: n */
    public String f105083n;

    public gz4(bsm<D> bsmVar, ChatView chatView, ChatInputEntryView chatInputEntryView) {
        super(bsmVar);
        this.f105080k = (yq2) wq4.m205013a(vwb.m200324f0(new vye(), new k5z(), new qwz()));
        this.f105079j = (nv4) m144512z2(new nv4(bsmVar));
        this.f105078i = (x15) m144512z2(new x15(bsmVar, chatView, chatInputEntryView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m128802Z3(soj0 soj0Var) {
        m128813h4();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated((C22306c) m206028F2().ChatEvent.chatInputClick().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.uy4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178826a.m128818n4((wu4) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().ChatEvent.sendNormalMessage().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.xy4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195022a.m128804X3((sn40) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().ChatEvent.sendDanmakuMessage().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.yy4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200709a.m128805Y3((j1c) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().ChatEvent.onChatInputDialogDismiss().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.zy4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205605a.m128802Z3((soj0) obj);
            }
        }));
        m129301d3(hf3.C17296c.class, new w9j() { // from class: l.az4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f72329a.m128806a4((hf3.C17296c) obj);
            }
        });
        duringCreated((C22306c) m206028F2().ChatEvent.changeInputSize().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.bz4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f78003a.m128807b4((Size) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().LiveBridgeImplEvent.sendChatMessage().m172460g()).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.cz4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83059a.m128803V3((sy4) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V3 */
    public final void m128803V3(sy4 sy4Var) {
        if (sy4Var == null) {
            return;
        }
        BLiveChatMessageContentInfo bLiveChatMessageContentInfoM186606a = sy4Var.m186606a();
        m128817m4(bLiveChatMessageContentInfoM186606a.getMessageOnly(), sy4.C20071a.m186608a(bLiveChatMessageContentInfoM186606a));
    }

    /* JADX INFO: renamed from: W3 */
    public AbstractC16991g4.a mo105558W3(String str) {
        if (TextUtils.equals(str, "chatButtonBubble") || TextUtils.equals(str, "bulletCommentButtonBubble") || TextUtils.equals(str, "stormCommentButtonBubble")) {
            return this.f105078i.m206676W3(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m128804X3(sn40 sn40Var) {
        m128817m4(sn40Var.f165410a, sn40Var.f165411b);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m128805Y3(j1c j1cVar) {
        m128816l4(j1cVar.f115781a, j1cVar.f115782b);
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ AbstractC16991g4.a m128806a4(hf3.C17296c c17296c) {
        return mo105558W3(c17296c.f107428c);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m128807b4(Size size) {
        if (size.getWidth() > 0) {
            this.f105078i.m206674U3(size.getWidth());
        }
        if (size.getHeight() > 0) {
            this.f105078i.m206680b4(size.getHeight(), this.f105079j.m161557p4());
        }
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m128808c4(String str, BLiveEnvelope bLiveEnvelope) {
        m128814i4(str);
        this.f105079j.m161555n4();
        m206028F2().ChatEvent.onDanmakuSendSuccess().mo172463j(new m1c(bLiveEnvelope.data.masks.get(0), bLiveEnvelope.data.videoLiveBulletComment));
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m128809d4(String str) {
        m128819o4(true, str, "0");
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m128810e4(final String str, Throwable th) {
        boolean z = th instanceof TantanException.Client.CoreService;
        if (z && ((TantanException.Client.CoreService) th).code == 41021) {
            m206028F2().FastRechargeEventGroup.showFastRechargeDialog().mo172463j(new nig.C18699a().m159507g(2).m159510j("liveGiftDanMuKuClick").m159506f(new d30() { // from class: l.wy4
                @Override // p149l.d30
                public final void call() {
                    this.f188541a.m128809d4(str);
                }
            }).m159505e());
            this.f105079j.m161555n4();
            return;
        }
        if (z) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            int i = coreService.code;
            String str2 = coreService.metaMessage;
            if (i == 40099) {
                lsi0.m151580j(str2);
            } else {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                lsi0.m151580j(str2);
            }
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m128811f4(String str, roj0 roj0Var) {
        m206028F2().ChatEvent.sendMessageResult().mo172463j(Boolean.TRUE);
        mo105559j4(str);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m128812g4(Throwable th) {
        m206028F2().ChatEvent.sendMessageResult().mo172463j(Boolean.FALSE);
        qlt.m175502a(th);
    }

    /* JADX INFO: renamed from: h4 */
    public void m128813h4() {
        this.f105078i.m206682d4();
    }

    /* JADX INFO: renamed from: i4 */
    public void m128814i4(String str) {
        this.f105079j.m161544A4(str);
    }

    @CallSuper
    /* JADX INFO: renamed from: j4 */
    public void mo105559j4(String str) {
        this.f105079j.m161547D4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m128815k4() {
        this.f105081l = "0";
        this.f105083n = "";
        this.f105082m = "";
    }

    /* JADX INFO: renamed from: l4 */
    public void m128816l4(final String str, BLiveDanmakuListItem bLiveDanmakuListItem) {
        duringCreated(LivingNormalApiProvider.m71196C7(str, bLiveDanmakuListItem, m206027E2().m149814k(), m206027E2().m149818o(), m206027E2().m132146l0().f56011id, m206027E2().mo149813j().liveMode)).subscribe(ffw.m121194e(new e30() { // from class: l.dz4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88451a.m128808c4(str, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.ez4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93849a.m128810e4(str, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m4 */
    public void m128817m4(final String str, @Nullable sy4.C20071a c20071a) {
        String strReplace;
        if (c20071a == null) {
            c20071a = new sy4.C20071a("");
        }
        if (this.f105080k.mo159820b(vwb.m200311Y(str, c20071a)).booleanValue()) {
            lsi0.m151580j(ypv.m215672k().m195775Y3());
            return;
        }
        if (!TextUtils.isEmpty(this.f105083n)) {
            this.f105083n = this.f105083n.trim();
        }
        if ("3".equals(this.f105081l) && !TextUtils.isEmpty(this.f105082m) && !TextUtils.isEmpty(this.f105083n) && this.f105083n.contains("@") && str.contains(this.f105083n)) {
            strReplace = str.replace(this.f105083n, "");
            c20071a.f166890b = this.f105082m;
            c20071a.f166891c = this.f105083n.replace("@", "");
        } else {
            m128815k4();
            strReplace = str;
        }
        duringCreated(m206027E2().m132101V1(strReplace, c20071a)).subscribe(ffw.m121194e(new e30() { // from class: l.fz4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99932a.m128811f4(str, (roj0) obj);
            }
        }, new e30() { // from class: l.vy4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183493a.m128812g4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n4 */
    public void m128818n4(wu4 wu4Var) {
        if (wu4Var == null) {
            return;
        }
        String str = wu4Var.f188083c;
        this.f105081l = str;
        if ("3".equals(str)) {
            this.f105082m = wu4Var.f188086f;
            this.f105083n = wu4Var.f188082b;
        }
        this.f105078i.m206675V3();
        this.f105078i.m206685h4(false);
        this.f105079j.m161554K4(wu4Var.f188081a, wu4Var.f188082b, wu4Var.f188083c, wu4Var.f188084d, wu4Var.f188085e);
    }

    /* JADX INFO: renamed from: o4 */
    public void m128819o4(boolean z, CharSequence charSequence, String str) {
        this.f105078i.m206675V3();
        this.f105078i.m206685h4(false);
        this.f105079j.m161553J4(z, charSequence, str);
    }
}
