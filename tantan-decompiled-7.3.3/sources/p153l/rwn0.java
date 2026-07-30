package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionAsset;
import com.p051p1.mobile.putong.live.base.data.BLiveChatMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomAsset;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VoiceVirtualApi;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import java.util.ArrayList;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes5.dex */
public class rwn0 extends oo2 {

    /* JADX INFO: renamed from: H */
    public C22507a<hrk0.C17564a> f165185H;

    /* JADX INFO: renamed from: I */
    public C22507a<BLiveVoiceCall> f165186I;

    /* JADX INFO: renamed from: J */
    public final C22507a<BLiveUserMask> f165187J;

    /* JADX INFO: renamed from: K */
    public final C22507a<p7o0> f165188K;

    /* JADX INFO: renamed from: L */
    public C22507a<Relationship> f165189L;

    /* JADX INFO: renamed from: M */
    public C22507a<BLiveAuctionAsset> f165190M;

    /* JADX INFO: renamed from: N */
    public C22507a<BLiveVoiceRoomAsset> f165191N;

    /* JADX INFO: renamed from: O */
    public C22507a<BLiveVoiceRoomAsset> f165192O;

    /* JADX INFO: renamed from: P */
    public String f165193P;

    /* JADX INFO: renamed from: Q */
    public boolean f165194Q;

    /* JADX INFO: renamed from: R */
    public boolean f165195R;

    /* JADX INFO: renamed from: S */
    public boolean f165196S;

    /* JADX INFO: renamed from: T */
    public msn0 f165197T;

    /* JADX INFO: renamed from: U */
    public Pagination f165198U;

    /* JADX INFO: renamed from: V */
    public long f165199V;

    /* JADX INFO: renamed from: W */
    public boolean f165200W;

    /* JADX INFO: renamed from: X */
    public boolean f165201X;

    /* JADX INFO: renamed from: Y */
    public boolean f165202Y;

    /* JADX INFO: renamed from: Z */
    public String f165203Z;

    /* JADX INFO: renamed from: a0 */
    public String f165204a0;

    /* JADX INFO: renamed from: b0 */
    public String f165205b0;

    /* JADX INFO: renamed from: c0 */
    public String f165206c0;

    /* JADX INFO: renamed from: d0 */
    public final hrk0 f165207d0;

    public rwn0(szn0 szn0Var, ajt ajtVar) {
        super(szn0Var, ajtVar);
        this.f165185H = C22507a.m222758b();
        this.f165186I = C22507a.m222758b();
        this.f165187J = C22507a.m222758b();
        this.f165188K = C22507a.m222758b();
        this.f165189L = C22507a.m222758b();
        this.f165190M = C22507a.m222758b();
        this.f165191N = C22507a.m222758b();
        this.f165192O = C22507a.m222758b();
        this.f165195R = false;
        this.f165201X = true;
        this.f165202Y = false;
        this.f165203Z = "";
        this.f165204a0 = "";
        hrk0 hrk0Var = new hrk0();
        this.f165207d0 = hrk0Var;
        hrk0Var.m136887z(this.f165185H);
    }

    /* JADX INFO: renamed from: D2 */
    public static /* synthetic */ void m183375D2(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y3 */
    public /* synthetic */ void m183390y3(boolean z, BLiveEnvelope bLiveEnvelope) {
        this.f165198U = bLiveEnvelope.pagination;
        if (!jyb.m147479J(bLiveEnvelope.data.liveChatMessages)) {
            this.f165199V = ((BLiveChatMessage) jyb.m147483N(bLiveEnvelope.data.liveChatMessages)).seq;
        }
        this.f148282z.m170286t(z, bLiveEnvelope.data.liveChatMessages, mo168489W0());
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: A0 */
    public String mo118362A0() {
        return BLiveAbsData.VOICE_LIVE;
    }

    /* JADX INFO: renamed from: A3 */
    public final /* synthetic */ void m183392A3(boolean z, BLiveEnvelope bLiveEnvelope) {
        this.f148282z.m170286t(z, bLiveEnvelope.data.liveChatMessages, mo168489W0());
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ void m183393B3(boolean z, Throwable th) {
        this.f148282z.m170285s(z, null);
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: C0 */
    public String mo118365C0() {
        return "voiceRoom";
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ Boolean m183394C3(jsv jsvVar) {
        return Boolean.valueOf(mo183435j() != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D3 */
    public void m183395D3(String str) {
        this.f148277u = zrv.m221193k().m203451K4();
        final p7o0 p7o0VarM222761e = this.f165188K.m222761e();
        VoiceRoomApiProvider.requestMembers(str, this.f148277u, (p7o0VarM222761e == null || jyb.m147479J(p7o0VarM222761e.f150952a)) ? "" : ((BLiveMember) ((nsv) jyb.m147483N(p7o0VarM222761e.f150952a)).f143542a).entryTime).subscribe(dhw.m115829h(new y20() { // from class: l.ewn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96177a.m183447s3(p7o0VarM222761e, (BLiveEnvelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E3 */
    public C22421c<BLiveUserMask> m183396E3() {
        return this.f165187J.asObservable().filter(new qcj() { // from class: l.own0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f149547a.m183450u3((BLiveUserMask) obj);
            }
        }).filter(new qcj() { // from class: l.pwn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveUserMask) obj).userId, zrv.f205799a.m207631D0()));
            }
        });
    }

    /* JADX INFO: renamed from: F3 */
    public void m183397F3() {
        this.f165186I = C22507a.m222758b();
        xz10.m213668f1().m213701y1(this.f165186I);
    }

    /* JADX INFO: renamed from: G3 */
    public void m183398G3(long j) {
        if (j <= this.f165199V) {
            return;
        }
        this.f165199V = j;
        nsh0.m164608j("[live][longlink]", "send Message Ack seq:" + j);
        this.f148282z.m170290x(mo183435j(), j);
    }

    /* JADX INFO: renamed from: H2 */
    public void m183399H2(hrk0.C17565b c17565b) {
        hrk0 hrk0Var = this.f165207d0;
        if (hrk0Var != null) {
            hrk0Var.m136869h(c17565b);
        }
    }

    /* JADX INFO: renamed from: H3 */
    public void m183400H3(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.f165193P = str;
    }

    /* JADX INFO: renamed from: I2 */
    public void m183401I2(String str) {
        BLiveVoice bLiveVoiceMo183435j = mo183435j();
        fhw.m125605a("[live][virtual_voice]", "change template : " + str);
        if (bLiveVoiceMo183435j.template.equals(str)) {
            return;
        }
        bLiveVoiceMo183435j.template = str;
        mo183431g(bLiveVoiceMo183435j);
    }

    /* JADX INFO: renamed from: J2 */
    public void m183402J2(BLiveVoiceCall bLiveVoiceCall) {
        this.f165186I.onNext(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: J3 */
    public void m183403J3(boolean z) {
        this.f165202Y = z;
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: K1 */
    public void mo118370K1(String str) {
        if (m183434i3()) {
            VirtualVoiceRoomApiProvider.refreshManager(m202194o()).subscribe(dhw.m115829h(new y20() { // from class: l.lwn0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f133830a.m183451v3((ArrayList) obj);
                }
            }));
        } else {
            VoiceRoomApiProvider.refreshManager(str).subscribe(dhw.m115829h(new y20() { // from class: l.mwn0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f139137a.m183452w3((ArrayList) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: K2 */
    public void m183404K2(BLiveUserMask bLiveUserMask) {
        if (bLiveUserMask == null || !TextUtils.equals(bLiveUserMask.userId, zrv.f205799a.m207631D0())) {
            return;
        }
        this.f165187J.onNext(bLiveUserMask);
    }

    /* JADX INFO: renamed from: K3 */
    public void m183405K3(int i) {
        this.f165207d0.m136883v(i);
        this.f165207d0.m136887z(this.f165185H);
    }

    /* JADX INFO: renamed from: L2 */
    public boolean mo146596L2() {
        return false;
    }

    /* JADX INFO: renamed from: L3 */
    public void m183406L3(boolean z) {
        this.f165194Q = z;
    }

    /* JADX INFO: renamed from: M2 */
    public boolean mo146597M2() {
        return false;
    }

    /* JADX INFO: renamed from: M3 */
    public void m183407M3(String str) {
        this.f165206c0 = str;
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: N1 */
    public void mo118371N1(String str) {
        int iM203451K4 = zrv.m221193k().m203451K4();
        this.f148277u = iM203451K4;
        VoiceRoomApiProvider.requestMembers(str, iM203451K4, "").subscribe(dhw.m115829h(new y20() { // from class: l.dwn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91035a.m183453x3((BLiveEnvelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N2 */
    public boolean mo146598N2() {
        return false;
    }

    /* JADX INFO: renamed from: N3 */
    public void m183408N3(String str) {
        this.f165205b0 = str;
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: O0 */
    public String mo168468O0() {
        return m183409O2().mo122892l().templateType;
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: O1 */
    public void mo118372O1(final boolean z, String str, String str2) {
        if (m183434i3()) {
            VoiceRoomApiProvider.requestHistoryMessages(str, str2).subscribe(dhw.m115826e(new y20() { // from class: l.yvn0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f201747a.m183390y3(z, (BLiveEnvelope) obj);
                }
            }, new y20() { // from class: l.iwn0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f117284a.m183455z3(z, (Throwable) obj);
                }
            }));
        } else {
            VoiceRoomApiProvider.requestMessages(str, str2).subscribe(dhw.m115826e(new y20() { // from class: l.jwn0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f122946a.m183392A3(z, (BLiveEnvelope) obj);
                }
            }, new y20() { // from class: l.kwn0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f129082a.m183393B3(z, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: O2 */
    public szn0 m183409O2() {
        return (szn0) this.f185207a;
    }

    /* JADX INFO: renamed from: O3 */
    public void m183410O3(msn0 msn0Var) {
        this.f165197T = msn0Var;
    }

    /* JADX INFO: renamed from: P2 */
    public hrk0 m183411P2() {
        return this.f165207d0;
    }

    /* JADX INFO: renamed from: P3 */
    public void m183412P3(Pagination pagination) {
        this.f165198U = pagination;
    }

    /* JADX INFO: renamed from: Q2 */
    public C22421c<hrk0.C17564a> m183413Q2() {
        return this.f165185H;
    }

    /* JADX INFO: renamed from: Q3 */
    public void m183414Q3(boolean z) {
        this.f165195R = z;
    }

    /* JADX INFO: renamed from: R2 */
    public String mo146599R2() {
        return null;
    }

    /* JADX INFO: renamed from: R3 */
    public void m183415R3(String str, Relationship relationship) {
        if (relationship == null || m168532l0() == null || !TextUtils.equals(str, m168532l0().f56859id)) {
            return;
        }
        m168532l0().localRelationship = relationship;
        this.f165189L.onNext(relationship);
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: S */
    public void mo168476S(ugd0 ugd0Var) {
        super.mo168476S(ugd0Var);
        if (mo183435j() == null || !y6s.m214494b(mo183435j().liveMode) || this.f148259G != null || m168532l0() == null) {
            return;
        }
        BLiveUserMask bLiveUserMaskNew_ = BLiveUserMask.new_();
        bLiveUserMaskNew_.avatar = m168532l0().m61308fp().profileSmall().formatted();
        m168493X1(bLiveUserMaskNew_);
    }

    /* JADX INFO: renamed from: S2 */
    public String m183416S2() {
        return this.f165206c0;
    }

    /* JADX INFO: renamed from: S3 */
    public C22421c<p7o0> m183417S3() {
        return this.f165188K;
    }

    /* JADX INFO: renamed from: T2 */
    public String m183418T2() {
        return this.f165205b0;
    }

    /* JADX INFO: renamed from: U2 */
    public msn0 m183419U2() {
        return this.f165197T;
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: V0 */
    public boolean mo168486V0() {
        return false;
    }

    @Override // p153l.vp20
    /* JADX INFO: renamed from: V2, reason: merged with bridge method [inline-methods] */
    public BLiveVoice mo183435j() {
        return (BLiveVoice) super.mo183435j();
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: W0 */
    public boolean mo168489W0() {
        return mo183440n() != null && mo183440n().isMaskMode();
    }

    /* JADX INFO: renamed from: W2 */
    public String m183421W2() {
        Links links;
        Pagination pagination = this.f165198U;
        if (pagination == null || (links = pagination.links) == null || TextUtils.isEmpty(links.next)) {
            return null;
        }
        return this.f165198U.links.next;
    }

    @Override // p153l.vp20
    /* JADX INFO: renamed from: X2, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceRoom mo183440n() {
        return (BLiveVoiceRoom) super.mo183440n();
    }

    @Nullable
    /* JADX INFO: renamed from: Y2 */
    public BLiveVoiceCall m183423Y2() {
        return this.f165186I.m222761e();
    }

    /* JADX INFO: renamed from: Z2 */
    public C22421c<BLiveVoiceCall> m183424Z2() {
        return this.f165186I.asObservable().observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: a3 */
    public C22421c<Relationship> m183425a3(Act act, final User user, boolean z, String str, String str2) {
        return VoiceVirtualApi.like(act, user, z, str, str2, m202191k(), m202194o()).doOnNext(new y20() { // from class: l.hwn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111904a.m183441n3(user, (Relationship) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b3 */
    public C22421c<BLiveVoiceRoomAsset> m183426b3(String str) {
        return this.f165192O.m222761e() != null ? this.f165192O.asObservable() : VirtualVoiceRoomApiProvider.getVoiceRoomAsset(str).map(new qcj() { // from class: l.bwn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f78766a.m183442o3((BLiveVoiceRoomAsset) obj);
            }
        }).flatMap(new qcj() { // from class: l.cwn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f84137a.m183443p3((BLiveVoiceRoomAsset) obj);
            }
        });
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: c0 */
    public void mo146610c0(boolean z) {
        super.mo146610c0(z);
        this.f165196S = true;
        C22507a<hrk0.C17564a> c22507aM222758b = C22507a.m222758b();
        this.f165185H = c22507aM222758b;
        this.f165207d0.m136887z(c22507aM222758b);
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: c2 */
    public void mo168507c2() {
        super.mo168507c2();
        this.f165195R = false;
    }

    /* JADX INFO: renamed from: c3 */
    public C22421c<BLiveVoiceRoomAsset> m183427c3(String str, String str2) {
        return this.f165191N.m222761e() != null ? this.f165191N.asObservable() : VirtualVoiceRoomApiProvider.getVoiceRoomChatTips(str, str2).map(new qcj() { // from class: l.qwn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f159957a.m183445q3((BLiveVoiceRoomAsset) obj);
            }
        }).flatMap(new qcj() { // from class: l.zvn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f206269a.m183446r3((BLiveVoiceRoomAsset) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d3 */
    public Boolean m183428d3() {
        return Boolean.valueOf(this.f165186I.m222765i());
    }

    /* JADX INFO: renamed from: e3 */
    public boolean m183429e3() {
        return this.f165202Y;
    }

    /* JADX INFO: renamed from: f3 */
    public boolean m183430f3() {
        return mo183435j() != null && y6s.m214493a(mo183435j().liveMode);
    }

    @Override // p153l.vp20
    /* JADX INFO: renamed from: g */
    public void mo183431g(BLiveAbsData bLiveAbsData) {
        super.mo183431g(bLiveAbsData);
        if (m183434i3()) {
            m168496Y1(bLiveAbsData);
        }
    }

    /* JADX INFO: renamed from: g3 */
    public boolean m183432g3() {
        jsv jsvVarM202193m = m202193m();
        if (jsvVarM202193m != null) {
            return jsvVarM202193m.m146876b();
        }
        return false;
    }

    /* JADX INFO: renamed from: h3 */
    public boolean m183433h3() {
        return this.f165194Q;
    }

    @Override // p153l.oo2, p153l.vp20
    /* JADX INFO: renamed from: i */
    public void mo168522i(BLiveAbsRoom bLiveAbsRoom) {
        if (bLiveAbsRoom != null && mo183440n() != null) {
            ((BLiveVoiceRoom) bLiveAbsRoom).voiceRoomTagInfo = mo183440n().voiceRoomTagInfo;
        }
        if (bLiveAbsRoom == null) {
            return;
        }
        this.f185207a.mo122894o(bLiveAbsRoom);
        mo118370K1(m202191k());
    }

    /* JADX INFO: renamed from: i3 */
    public boolean m183434i3() {
        return mo183435j() != null && y6s.m214494b(mo183435j().liveMode);
    }

    /* JADX INFO: renamed from: j3 */
    public boolean m183436j3() {
        return mo183435j() != null && BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(mo183435j().liveMode);
    }

    /* JADX INFO: renamed from: k3 */
    public boolean m183437k3() {
        return this.f165195R;
    }

    /* JADX INFO: renamed from: l3 */
    public boolean m183438l3() {
        return m183409O2().mo122891j() == null;
    }

    /* JADX INFO: renamed from: m3 */
    public boolean m183439m3() {
        return mo183435j() != null && y6s.m214496d(mo183435j().liveMode);
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ void m183441n3(User user, Relationship relationship) {
        m183415R3(user.f56859id, relationship);
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ BLiveVoiceRoomAsset m183442o3(BLiveVoiceRoomAsset bLiveVoiceRoomAsset) {
        this.f165192O.onNext(bLiveVoiceRoomAsset);
        return bLiveVoiceRoomAsset;
    }

    @Override // p153l.vp20
    /* JADX INFO: renamed from: p */
    public boolean mo118373p() {
        ugd0 ugd0Var;
        if (!m183434i3() || (ugd0Var = this.f148281y) == null || ugd0Var.f138291a == null) {
            return false;
        }
        return zrv.f205799a.m207631D0().equals(this.f148281y.f138291a.f56859id);
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ C22421c m183443p3(BLiveVoiceRoomAsset bLiveVoiceRoomAsset) {
        return this.f165192O.asObservable();
    }

    @Override // p153l.vp20
    /* JADX INFO: renamed from: q */
    public boolean mo183444q() {
        return this instanceof jlm0;
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ BLiveVoiceRoomAsset m183445q3(BLiveVoiceRoomAsset bLiveVoiceRoomAsset) {
        this.f165191N.onNext(bLiveVoiceRoomAsset);
        return bLiveVoiceRoomAsset;
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: r1 */
    public void mo118374r1(String str, String str2, boolean z) {
        VoiceRoomApiProvider.manageRoomManager(str, str2, z).subscribe(dhw.m115826e(new y20() { // from class: l.fwn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101186a.m183448t3((ArrayList) obj);
            }
        }, new y20() { // from class: l.gwn0
            @Override // p153l.y20
            public final void call(Object obj) {
                rwn0.m183375D2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ C22421c m183446r3(BLiveVoiceRoomAsset bLiveVoiceRoomAsset) {
        return this.f165191N.asObservable();
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: s0 */
    public String mo168547s0() {
        return "voiceLiveRoom";
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m183447s3(p7o0 p7o0Var, BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        if (bLiveData.members == null) {
            C22507a<p7o0> c22507a = this.f165188K;
            c22507a.onNext(c22507a.m222761e());
            return;
        }
        p7o0 p7o0Var2 = new p7o0(bLiveData, mo168489W0());
        if (p7o0Var == null || jyb.m147479J(p7o0Var.f150952a)) {
            this.f165188K.onNext(p7o0Var2);
        } else {
            p7o0Var.f150952a.addAll(p7o0Var2.f150952a);
            this.f165188K.onNext(p7o0Var);
        }
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m183448t3(ArrayList arrayList) {
        this.f148282z.m170283n().onNext(arrayList);
    }

    @Override // p153l.vp20
    /* JADX INFO: renamed from: u */
    public C22421c<jsv> mo183449u() {
        return m183434i3() ? this.f185208b.filter(new qcj() { // from class: l.nwn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                jsv jsvVar = (jsv) obj;
                return Boolean.valueOf(jsvVar.m146875a() == 2 && ((j2t) jsvVar).m143263l());
            }
        }) : super.mo183449u();
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ Boolean m183450u3(BLiveUserMask bLiveUserMask) {
        return Boolean.valueOf(mo168489W0());
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ void m183451v3(ArrayList arrayList) {
        this.f148282z.m170283n().onNext(arrayList);
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ void m183452w3(ArrayList arrayList) {
        this.f148282z.m170283n().onNext(arrayList);
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ void m183453x3(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        if (bLiveData.members != null) {
            this.f165188K.onNext(new p7o0(bLiveData, mo168489W0()));
        }
    }

    @Override // p153l.vp20
    /* JADX INFO: renamed from: y */
    public C22421c<jsv> mo183454y() {
        return m183434i3() ? this.f185208b.filter(new qcj() { // from class: l.awn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f73774a.m183394C3((jsv) obj);
            }
        }).take(1) : super.mo183454y();
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ void m183455z3(boolean z, Throwable th) {
        this.f148282z.m170285s(z, null);
    }

    /* JADX INFO: renamed from: I3 */
    public void mo146595I3(boolean z) {
    }
}
