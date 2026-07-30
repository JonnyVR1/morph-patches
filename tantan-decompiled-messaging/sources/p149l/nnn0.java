package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionAsset;
import com.p046p1.mobile.putong.live.base.data.BLiveChatMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomAsset;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VoiceVirtualApi;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import java.util.ArrayList;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes5.dex */
public class nnn0 extends ho2 {

    /* JADX INFO: renamed from: H */
    public C22392a<bik0.C15867a> f139738H;

    /* JADX INFO: renamed from: I */
    public C22392a<BLiveVoiceCall> f139739I;

    /* JADX INFO: renamed from: J */
    public final C22392a<BLiveUserMask> f139740J;

    /* JADX INFO: renamed from: K */
    public final C22392a<lyn0> f139741K;

    /* JADX INFO: renamed from: L */
    public C22392a<Relationship> f139742L;

    /* JADX INFO: renamed from: M */
    public C22392a<BLiveAuctionAsset> f139743M;

    /* JADX INFO: renamed from: N */
    public C22392a<BLiveVoiceRoomAsset> f139744N;

    /* JADX INFO: renamed from: O */
    public C22392a<BLiveVoiceRoomAsset> f139745O;

    /* JADX INFO: renamed from: P */
    public String f139746P;

    /* JADX INFO: renamed from: Q */
    public boolean f139747Q;

    /* JADX INFO: renamed from: R */
    public boolean f139748R;

    /* JADX INFO: renamed from: S */
    public boolean f139749S;

    /* JADX INFO: renamed from: T */
    public ijn0 f139750T;

    /* JADX INFO: renamed from: U */
    public Pagination f139751U;

    /* JADX INFO: renamed from: V */
    public long f139752V;

    /* JADX INFO: renamed from: W */
    public boolean f139753W;

    /* JADX INFO: renamed from: X */
    public boolean f139754X;

    /* JADX INFO: renamed from: Y */
    public boolean f139755Y;

    /* JADX INFO: renamed from: Z */
    public String f139756Z;

    /* JADX INFO: renamed from: a0 */
    public String f139757a0;

    /* JADX INFO: renamed from: b0 */
    public String f139758b0;

    /* JADX INFO: renamed from: c0 */
    public String f139759c0;

    /* JADX INFO: renamed from: d0 */
    public final bik0 f139760d0;

    public nnn0(oqn0 oqn0Var, zgt zgtVar) {
        super(oqn0Var, zgtVar);
        this.f139738H = C22392a.m221512b();
        this.f139739I = C22392a.m221512b();
        this.f139740J = C22392a.m221512b();
        this.f139741K = C22392a.m221512b();
        this.f139742L = C22392a.m221512b();
        this.f139743M = C22392a.m221512b();
        this.f139744N = C22392a.m221512b();
        this.f139745O = C22392a.m221512b();
        this.f139748R = false;
        this.f139754X = true;
        this.f139755Y = false;
        this.f139756Z = "";
        this.f139757a0 = "";
        bik0 bik0Var = new bik0();
        this.f139760d0 = bik0Var;
        bik0Var.m102077z(this.f139738H);
    }

    /* JADX INFO: renamed from: D2 */
    public static /* synthetic */ void m160213D2(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y3 */
    public /* synthetic */ void m160228y3(boolean z, BLiveEnvelope bLiveEnvelope) {
        this.f139751U = bLiveEnvelope.pagination;
        if (!vwb.m200296J(bLiveEnvelope.data.liveChatMessages)) {
            this.f139752V = ((BLiveChatMessage) vwb.m200300N(bLiveEnvelope.data.liveChatMessages)).seq;
        }
        this.f108769z.m181791t(z, bLiveEnvelope.data.liveChatMessages, mo132103W0());
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: A0 */
    public String mo132054A0() {
        return BLiveAbsData.VOICE_LIVE;
    }

    /* JADX INFO: renamed from: A3 */
    public final /* synthetic */ void m160230A3(boolean z, BLiveEnvelope bLiveEnvelope) {
        this.f108769z.m181791t(z, bLiveEnvelope.data.liveChatMessages, mo132103W0());
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ void m160231B3(boolean z, Throwable th) {
        this.f108769z.m181790s(z, null);
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: C0 */
    public String mo132058C0() {
        return "voiceRoom";
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ Boolean m160232C3(iqv iqvVar) {
        return Boolean.valueOf(mo149813j() != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D3 */
    public void m160233D3(String str) {
        this.f108764u = ypv.m215672k().m195664K4();
        final lyn0 lyn0VarM221515e = this.f139741K.m221515e();
        VoiceRoomApiProvider.requestMembers(str, this.f108764u, (lyn0VarM221515e == null || vwb.m200296J(lyn0VarM221515e.f130587a)) ? "" : ((BLiveMember) ((mqv) vwb.m200300N(lyn0VarM221515e.f130587a)).f135304a).entryTime).subscribe(ffw.m121197h(new e30() { // from class: l.ann0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70747a.m160281s3(lyn0VarM221515e, (BLiveEnvelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E3 */
    public C22306c<BLiveUserMask> m160234E3() {
        return this.f139740J.asObservable().filter(new w9j() { // from class: l.knn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f123899a.m160283u3((BLiveUserMask) obj);
            }
        }).filter(new w9j() { // from class: l.lnn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveUserMask) obj).userId, ypv.f199493a.m199309D0()));
            }
        });
    }

    /* JADX INFO: renamed from: F3 */
    public void m160235F3() {
        this.f139739I = C22392a.m221512b();
        pr10.m170951f1().m170984y1(this.f139739I);
    }

    /* JADX INFO: renamed from: G3 */
    public void m160236G3(long j) {
        if (j <= this.f139752V) {
            return;
        }
        this.f139752V = j;
        gkh0.m126627j("[live][longlink]", "send Message Ack seq:" + j);
        this.f108769z.m181795x(mo149813j(), j);
    }

    /* JADX INFO: renamed from: H2 */
    public void m160237H2(bik0.C15868b c15868b) {
        bik0 bik0Var = this.f139760d0;
        if (bik0Var != null) {
            bik0Var.m102059h(c15868b);
        }
    }

    /* JADX INFO: renamed from: H3 */
    public void m160238H3(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.f139746P = str;
    }

    /* JADX INFO: renamed from: I2 */
    public void m160239I2(String str) {
        BLiveVoice bLiveVoiceMo149813j = mo149813j();
        hfw.m130790a("[live][virtual_voice]", "change template : " + str);
        if (bLiveVoiceMo149813j.template.equals(str)) {
            return;
        }
        bLiveVoiceMo149813j.template = str;
        mo149811g(bLiveVoiceMo149813j);
    }

    /* JADX INFO: renamed from: J2 */
    public void m160240J2(BLiveVoiceCall bLiveVoiceCall) {
        this.f139739I.onNext(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: J3 */
    public void m160241J3(boolean z) {
        this.f139755Y = z;
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: K1 */
    public void mo132074K1(String str) {
        if (m160271i3()) {
            VirtualVoiceRoomApiProvider.refreshManager(m149818o()).subscribe(ffw.m121197h(new e30() { // from class: l.hnn0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f108643a.m160284v3((ArrayList) obj);
                }
            }));
        } else {
            VoiceRoomApiProvider.refreshManager(str).subscribe(ffw.m121197h(new e30() { // from class: l.inn0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f114026a.m160285w3((ArrayList) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: K2 */
    public void m160242K2(BLiveUserMask bLiveUserMask) {
        if (bLiveUserMask == null || !TextUtils.equals(bLiveUserMask.userId, ypv.f199493a.m199309D0())) {
            return;
        }
        this.f139740J.onNext(bLiveUserMask);
    }

    /* JADX INFO: renamed from: K3 */
    public void m160243K3(int i) {
        this.f139760d0.m102073v(i);
        this.f139760d0.m102077z(this.f139738H);
    }

    /* JADX INFO: renamed from: L2 */
    public boolean mo121370L2() {
        return false;
    }

    /* JADX INFO: renamed from: L3 */
    public void m160244L3(boolean z) {
        this.f139747Q = z;
    }

    /* JADX INFO: renamed from: M2 */
    public boolean mo121371M2() {
        return false;
    }

    /* JADX INFO: renamed from: M3 */
    public void m160245M3(String str) {
        this.f139759c0 = str;
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: N1 */
    public void mo132080N1(String str) {
        int iM195664K4 = ypv.m215672k().m195664K4();
        this.f108764u = iM195664K4;
        VoiceRoomApiProvider.requestMembers(str, iM195664K4, "").subscribe(ffw.m121197h(new e30() { // from class: l.zmn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203749a.m160286x3((BLiveEnvelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N2 */
    public boolean mo121372N2() {
        return false;
    }

    /* JADX INFO: renamed from: N3 */
    public void m160246N3(String str) {
        this.f139758b0 = str;
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: O0 */
    public String mo132081O0() {
        return m160247O2().mo165470l().templateType;
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: O1 */
    public void mo132082O1(final boolean z, String str, String str2) {
        if (m160271i3()) {
            VoiceRoomApiProvider.requestHistoryMessages(str, str2).subscribe(ffw.m121194e(new e30() { // from class: l.umn0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f177280a.m160228y3(z, (BLiveEnvelope) obj);
                }
            }, new e30() { // from class: l.enn0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f92329a.m160287z3(z, (Throwable) obj);
                }
            }));
        } else {
            VoiceRoomApiProvider.requestMessages(str, str2).subscribe(ffw.m121194e(new e30() { // from class: l.fnn0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f98436a.m160230A3(z, (BLiveEnvelope) obj);
                }
            }, new e30() { // from class: l.gnn0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f103609a.m160231B3(z, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: O2 */
    public oqn0 m160247O2() {
        return (oqn0) this.f128032a;
    }

    /* JADX INFO: renamed from: O3 */
    public void m160248O3(ijn0 ijn0Var) {
        this.f139750T = ijn0Var;
    }

    /* JADX INFO: renamed from: P2 */
    public bik0 m160249P2() {
        return this.f139760d0;
    }

    /* JADX INFO: renamed from: P3 */
    public void m160250P3(Pagination pagination) {
        this.f139751U = pagination;
    }

    /* JADX INFO: renamed from: Q2 */
    public C22306c<bik0.C15867a> m160251Q2() {
        return this.f139738H;
    }

    /* JADX INFO: renamed from: Q3 */
    public void m160252Q3(boolean z) {
        this.f139748R = z;
    }

    /* JADX INFO: renamed from: R2 */
    public String mo121373R2() {
        return null;
    }

    /* JADX INFO: renamed from: R3 */
    public void m160253R3(String str, Relationship relationship) {
        if (relationship == null || m132146l0() == null || !TextUtils.equals(str, m132146l0().f56011id)) {
            return;
        }
        m132146l0().localRelationship = relationship;
        this.f139742L.onNext(relationship);
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: S */
    public void mo132090S(r8d0 r8d0Var) {
        super.mo132090S(r8d0Var);
        if (mo149813j() == null || !x4s.m207012b(mo149813j().liveMode) || this.f108746G != null || m132146l0() == null) {
            return;
        }
        BLiveUserMask bLiveUserMaskNew_ = BLiveUserMask.new_();
        bLiveUserMaskNew_.avatar = m132146l0().m60124fp().profileSmall().formatted();
        m132107X1(bLiveUserMaskNew_);
    }

    /* JADX INFO: renamed from: S2 */
    public String m160254S2() {
        return this.f139759c0;
    }

    /* JADX INFO: renamed from: S3 */
    public C22306c<lyn0> m160255S3() {
        return this.f139741K;
    }

    /* JADX INFO: renamed from: T2 */
    public String m160256T2() {
        return this.f139758b0;
    }

    /* JADX INFO: renamed from: U2 */
    public ijn0 m160257U2() {
        return this.f139750T;
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: V0 */
    public boolean mo132100V0() {
        return false;
    }

    @Override // p149l.lh20
    /* JADX INFO: renamed from: V2, reason: merged with bridge method [inline-methods] */
    public BLiveVoice mo149813j() {
        return (BLiveVoice) super.mo149813j();
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: W0 */
    public boolean mo132103W0() {
        return mo149817n() != null && mo149817n().isMaskMode();
    }

    /* JADX INFO: renamed from: W2 */
    public String m160259W2() {
        Links links;
        Pagination pagination = this.f139751U;
        if (pagination == null || (links = pagination.links) == null || TextUtils.isEmpty(links.next)) {
            return null;
        }
        return this.f139751U.links.next;
    }

    @Override // p149l.lh20
    /* JADX INFO: renamed from: X2, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceRoom mo149817n() {
        return (BLiveVoiceRoom) super.mo149817n();
    }

    @Nullable
    /* JADX INFO: renamed from: Y2 */
    public BLiveVoiceCall m160261Y2() {
        return this.f139739I.m221515e();
    }

    /* JADX INFO: renamed from: Z2 */
    public C22306c<BLiveVoiceCall> m160262Z2() {
        return this.f139739I.asObservable().observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: a3 */
    public C22306c<Relationship> m160263a3(Act act, final User user, boolean z, String str, String str2) {
        return VoiceVirtualApi.like(act, user, z, str, str2, m149814k(), m149818o()).doOnNext(new e30() { // from class: l.dnn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87086a.m160276n3(user, (Relationship) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b3 */
    public C22306c<BLiveVoiceRoomAsset> m160264b3(String str) {
        return this.f139745O.m221515e() != null ? this.f139745O.asObservable() : VirtualVoiceRoomApiProvider.getVoiceRoomAsset(str).map(new w9j() { // from class: l.xmn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f193569a.m160277o3((BLiveVoiceRoomAsset) obj);
            }
        }).flatMap(new w9j() { // from class: l.ymn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f199036a.m160278p3((BLiveVoiceRoomAsset) obj);
            }
        });
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: c0 */
    public void mo97488c0(boolean z) {
        super.mo97488c0(z);
        this.f139749S = true;
        C22392a<bik0.C15867a> c22392aM221512b = C22392a.m221512b();
        this.f139738H = c22392aM221512b;
        this.f139760d0.m102077z(c22392aM221512b);
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: c2 */
    public void mo132121c2() {
        super.mo132121c2();
        this.f139748R = false;
    }

    /* JADX INFO: renamed from: c3 */
    public C22306c<BLiveVoiceRoomAsset> m160265c3(String str, String str2) {
        return this.f139744N.m221515e() != null ? this.f139744N.asObservable() : VirtualVoiceRoomApiProvider.getVoiceRoomChatTips(str, str2).map(new w9j() { // from class: l.mnn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f134769a.m160279q3((BLiveVoiceRoomAsset) obj);
            }
        }).flatMap(new w9j() { // from class: l.vmn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f182133a.m160280r3((BLiveVoiceRoomAsset) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d3 */
    public Boolean m160266d3() {
        return Boolean.valueOf(this.f139739I.m221519i());
    }

    /* JADX INFO: renamed from: e3 */
    public boolean m160267e3() {
        return this.f139755Y;
    }

    /* JADX INFO: renamed from: f3 */
    public boolean m160268f3() {
        return mo149813j() != null && x4s.m207011a(mo149813j().liveMode);
    }

    @Override // p149l.lh20
    /* JADX INFO: renamed from: g */
    public void mo149811g(BLiveAbsData bLiveAbsData) {
        super.mo149811g(bLiveAbsData);
        if (m160271i3()) {
            m132110Y1(bLiveAbsData);
        }
    }

    /* JADX INFO: renamed from: g3 */
    public boolean m160269g3() {
        iqv iqvVarM149816m = m149816m();
        if (iqvVarM149816m != null) {
            return iqvVarM149816m.m137795b();
        }
        return false;
    }

    /* JADX INFO: renamed from: h3 */
    public boolean m160270h3() {
        return this.f139747Q;
    }

    @Override // p149l.ho2, p149l.lh20
    /* JADX INFO: renamed from: i */
    public void mo132136i(BLiveAbsRoom bLiveAbsRoom) {
        if (bLiveAbsRoom != null && mo149817n() != null) {
            ((BLiveVoiceRoom) bLiveAbsRoom).voiceRoomTagInfo = mo149817n().voiceRoomTagInfo;
        }
        if (bLiveAbsRoom == null) {
            return;
        }
        this.f128032a.mo165472o(bLiveAbsRoom);
        mo132074K1(m149814k());
    }

    /* JADX INFO: renamed from: i3 */
    public boolean m160271i3() {
        return mo149813j() != null && x4s.m207012b(mo149813j().liveMode);
    }

    /* JADX INFO: renamed from: j3 */
    public boolean m160272j3() {
        return mo149813j() != null && BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(mo149813j().liveMode);
    }

    /* JADX INFO: renamed from: k3 */
    public boolean m160273k3() {
        return this.f139748R;
    }

    /* JADX INFO: renamed from: l3 */
    public boolean m160274l3() {
        return m160247O2().mo165469j() == null;
    }

    /* JADX INFO: renamed from: m3 */
    public boolean m160275m3() {
        return mo149813j() != null && x4s.m207014d(mo149813j().liveMode);
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ void m160276n3(User user, Relationship relationship) {
        m160253R3(user.f56011id, relationship);
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ BLiveVoiceRoomAsset m160277o3(BLiveVoiceRoomAsset bLiveVoiceRoomAsset) {
        this.f139745O.onNext(bLiveVoiceRoomAsset);
        return bLiveVoiceRoomAsset;
    }

    @Override // p149l.lh20
    /* JADX INFO: renamed from: p */
    public boolean mo97490p() {
        r8d0 r8d0Var;
        if (!m160271i3() || (r8d0Var = this.f108768y) == null || r8d0Var.f187608a == null) {
            return false;
        }
        return ypv.f199493a.m199309D0().equals(this.f108768y.f187608a.f56011id);
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ C22306c m160278p3(BLiveVoiceRoomAsset bLiveVoiceRoomAsset) {
        return this.f139745O.asObservable();
    }

    @Override // p149l.lh20
    /* JADX INFO: renamed from: q */
    public boolean mo149819q() {
        return this instanceof fcm0;
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ BLiveVoiceRoomAsset m160279q3(BLiveVoiceRoomAsset bLiveVoiceRoomAsset) {
        this.f139744N.onNext(bLiveVoiceRoomAsset);
        return bLiveVoiceRoomAsset;
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: r1 */
    public void mo132162r1(String str, String str2, boolean z) {
        VoiceRoomApiProvider.manageRoomManager(str, str2, z).subscribe(ffw.m121194e(new e30() { // from class: l.bnn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76414a.m160282t3((ArrayList) obj);
            }
        }, new e30() { // from class: l.cnn0
            @Override // p149l.e30
            public final void call(Object obj) {
                nnn0.m160213D2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ C22306c m160280r3(BLiveVoiceRoomAsset bLiveVoiceRoomAsset) {
        return this.f139744N.asObservable();
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: s0 */
    public String mo132163s0() {
        return "voiceLiveRoom";
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m160281s3(lyn0 lyn0Var, BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        if (bLiveData.members == null) {
            C22392a<lyn0> c22392a = this.f139741K;
            c22392a.onNext(c22392a.m221515e());
            return;
        }
        lyn0 lyn0Var2 = new lyn0(bLiveData, mo132103W0());
        if (lyn0Var == null || vwb.m200296J(lyn0Var.f130587a)) {
            this.f139741K.onNext(lyn0Var2);
        } else {
            lyn0Var.f130587a.addAll(lyn0Var2.f130587a);
            this.f139741K.onNext(lyn0Var);
        }
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m160282t3(ArrayList arrayList) {
        this.f108769z.m181788n().onNext(arrayList);
    }

    @Override // p149l.lh20
    /* JADX INFO: renamed from: u */
    public C22306c<iqv> mo149823u() {
        return m160271i3() ? this.f128033b.filter(new w9j() { // from class: l.jnn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                iqv iqvVar = (iqv) obj;
                return Boolean.valueOf(iqvVar.m137794a() == 2 && ((i0t) iqvVar).m133929l());
            }
        }) : super.mo149823u();
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ Boolean m160283u3(BLiveUserMask bLiveUserMask) {
        return Boolean.valueOf(mo132103W0());
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ void m160284v3(ArrayList arrayList) {
        this.f108769z.m181788n().onNext(arrayList);
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ void m160285w3(ArrayList arrayList) {
        this.f108769z.m181788n().onNext(arrayList);
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ void m160286x3(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        if (bLiveData.members != null) {
            this.f139741K.onNext(new lyn0(bLiveData, mo132103W0()));
        }
    }

    @Override // p149l.lh20
    /* JADX INFO: renamed from: y */
    public C22306c<iqv> mo149827y() {
        return m160271i3() ? this.f128033b.filter(new w9j() { // from class: l.wmn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f187080a.m160232C3((iqv) obj);
            }
        }).take(1) : super.mo149827y();
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ void m160287z3(boolean z, Throwable th) {
        this.f108769z.m181790s(z, null);
    }

    /* JADX INFO: renamed from: I3 */
    public void mo121369I3(boolean z) {
    }
}
