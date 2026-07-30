package p153l;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.bean.LivingUsers;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBonusGifts;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserRecord;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VoiceVirtualApi;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.liveend.VoiceLiveEndAct;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ayn0 extends ar2<qo2> {

    /* JADX INFO: renamed from: a */
    public BLiveVoice f73985a;

    /* JADX INFO: renamed from: b */
    public BLiveVoiceRoom f73986b;

    /* JADX INFO: renamed from: c */
    public User f73987c;

    /* JADX INFO: renamed from: d */
    public String f73988d;

    /* JADX INFO: renamed from: e */
    public final Act f73989e;

    /* JADX INFO: renamed from: f */
    public final itm0 f73990f;

    /* JADX INFO: renamed from: g */
    public final List<jxn0> f73991g;

    /* JADX INFO: renamed from: h */
    public final List<BLiveVoiceUserRecord> f73992h;

    /* JADX INFO: renamed from: i */
    public Links f73993i;

    /* JADX INFO: renamed from: j */
    public int f73994j;

    public ayn0(Act act) {
        super(act);
        this.f73991g = new ArrayList();
        this.f73992h = new ArrayList();
        this.f73994j = 0;
        this.f73989e = act;
        this.f73990f = new itm0(act, act);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m100878D0(Throwable th) {
        ((qo2) this.viewModel).mo118910e(this.f73986b, this.f73987c, this.f73985a, null, null, BLiveSummary.new_(), new LivingUsers<>());
        o1j0.m165634h(R$string.f47568H9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public void m100893s0(Bundle bundle) {
        ((qo2) this.viewModel).m177283i(this.f73989e, this.f73988d);
        if (zrv.m221193k().m203693o7()) {
            ((qo2) this.viewModel).mo118909c();
        }
        duringCreated(VoiceRoomApiProvider.getVoiceLiveSummaries(this.f73985a.f45171id, this.f73986b.isMaskMode())).subscribe(dhw.m115826e(new y20() { // from class: l.vxn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186285a.m100895C0((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.wxn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191504a.m100878D0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ nsv m100894A0(HashMap map, User user) {
        nsv nsvVarM164636f = nsv.m164636f(user);
        String str = user.f56859id;
        return nsvVarM164636f.m164639c(str, (BLiveUserMask) map.get(str), this.f73986b.maskMode);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m100895C0(BLiveEnvelope bLiveEnvelope) {
        BLiveSummary bLiveSummaryNew_ = jyb.m147479J(bLiveEnvelope.data.voiceLiveSummaries) ? BLiveSummary.new_() : bLiveEnvelope.data.voiceLiveSummaries.get(0);
        final HashMap<String, BLiveUserMask> mapM205186k = w6o0.m205186k(bLiveEnvelope);
        qo2 qo2Var = (qo2) this.viewModel;
        BLiveVoiceRoom bLiveVoiceRoom = this.f73986b;
        User user = this.f73987c;
        BLiveVoice bLiveVoice = this.f73985a;
        BLiveData bLiveData = bLiveEnvelope.data;
        qo2Var.mo118910e(bLiveVoiceRoom, user, bLiveVoice, bLiveData.sparkletProgress, bLiveData.accompanyUserRanking, bLiveSummaryNew_, LivingUsers.create(jyb.m147486Q(bLiveData.users, new qcj() { // from class: l.xxn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f196668a.m100894A0(mapM205186k, (User) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m100896E0(jxn0 jxn0Var, BLiveEnvelope bLiveEnvelope) {
        m100909x0(bLiveEnvelope, false, jxn0Var);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m100897F0(jxn0 jxn0Var, BLiveEnvelope bLiveEnvelope) {
        m100909x0(bLiveEnvelope, true, jxn0Var);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ nsv m100898G0(HashMap map, User user) {
        nsv nsvVarM164636f = nsv.m164636f(user);
        String str = user.f56859id;
        return nsvVarM164636f.m164639c(str, (BLiveUserMask) map.get(str), this.f73986b.maskMode);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m100899H0() {
        ((qo2) this.viewModel).mo118911f();
    }

    /* JADX INFO: renamed from: I0 */
    public void m100900I0(nsv<User> nsvVar) {
        if (!m100911z0()) {
            g7k0.m129331a(act(), nsvVar, ((l6o0) nsvVar.m164642g()).f130276c);
        } else {
            wrv wrvVar = zrv.f205799a;
            Act act = this.f73989e;
            User user = nsvVar.f143542a;
            wrvVar.m207625A0(act, user, user.f56859id, "live_user_card", false);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public void m100901J0() {
        this.f73989e.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: L0 */
    public void m100902L0(nsv<User> nsvVar, String str, boolean z, final y20<Boolean> y20Var) {
        String strM207631D0 = zrv.f205799a.m207631D0();
        if (!m100911z0()) {
            duringCreated(zrv.f205799a.m207660c(strM207631D0, nsvVar.f143542a, z, str, this.f73985a.f45171id)).subscribe(dhw.m115826e(new y20() { // from class: l.txn0
                @Override // p153l.y20
                public final void call(Object obj) {
                    y20Var.call(Boolean.TRUE);
                }
            }, new y20() { // from class: l.uxn0
                @Override // p153l.y20
                public final void call(Object obj) {
                    y20Var.call(Boolean.FALSE);
                }
            }));
        } else if (z) {
            Act act = this.f73989e;
            User user = nsvVar.f143542a;
            BLiveVoice bLiveVoice = this.f73985a;
            duringCreated(VoiceVirtualApi.like(act, user, z, "endLivePage", "p_anchor_live_end", bLiveVoice.f45171id, bLiveVoice.room.f45267id)).subscribe(dhw.m115826e(new y20() { // from class: l.rxn0
                @Override // p153l.y20
                public final void call(Object obj) {
                    y20Var.call(Boolean.TRUE);
                }
            }, new y20() { // from class: l.sxn0
                @Override // p153l.y20
                public final void call(Object obj) {
                    y20Var.call(Boolean.FALSE);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: N0 */
    public void m100903N0(ViewGroup viewGroup, String str, BLiveVoiceBonusGifts bLiveVoiceBonusGifts) {
        this.f73990f.m142066n0(viewGroup, str, bLiveVoiceBonusGifts, new x20() { // from class: l.pxn0
            @Override // p153l.x20
            public final void call() {
                this.f154583a.m100899H0();
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    public List<jxn0> m100904O0() {
        jxn0 jxn0Var = new jxn0(this, 0);
        jxn0 jxn0Var2 = new jxn0(this, 1);
        this.f73991g.add(jxn0Var);
        this.f73991g.add(jxn0Var2);
        return this.f73991g;
    }

    /* JADX INFO: renamed from: P0 */
    public void m100905P0(User user, BLiveVoice bLiveVoice, BLiveVoiceRoom bLiveVoiceRoom, String str) {
        this.f73987c = user;
        this.f73985a = bLiveVoice;
        this.f73986b = bLiveVoiceRoom;
        this.f73988d = str;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m100906Q0(String str) {
        nae0.m162083m(this.f73989e, Uri.parse(str));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.mxn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139257a.m100893s0((Bundle) obj);
            }
        });
    }

    @Override // p153l.ar2
    @Nullable
    public Act act() {
        return this.f73989e;
    }

    /* JADX INFO: renamed from: t0 */
    public void m100907t0(boolean z, final jxn0 jxn0Var) {
        if (!z) {
            duringCreated(VoiceRoomApiProvider.getLiveVoiceHeartBeatReward(this.f73985a.f45171id, "20", String.valueOf(0))).subscribe(dhw.m115826e(new y20() { // from class: l.nxn0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f144197a.m100896E0(jxn0Var, (BLiveEnvelope) obj);
                }
            }, new y20() { // from class: l.oxn0
                @Override // p153l.y20
                public final void call(Object obj) {
                    o1j0.m165634h(R$string.f47568H9);
                }
            }));
            return;
        }
        Links links = this.f73993i;
        if (links == null || TextUtils.isEmpty(links.next)) {
            jxn0Var.m147377j();
        } else {
            duringCreated(VoiceRoomApiProvider.getLiveVoiceHeartBeatReward(this.f73985a.f45171id, "20", String.valueOf(this.f73994j + 1))).subscribe(dhw.m115826e(new y20() { // from class: l.yxn0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f201996a.m100897F0(jxn0Var, (BLiveEnvelope) obj);
                }
            }, new y20() { // from class: l.zxn0
                @Override // p153l.y20
                public final void call(Object obj) {
                    o1j0.m165634h(R$string.f47568H9);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: u0 */
    public List<jxn0> m100908u0() {
        return this.f73991g;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m100909x0(BLiveEnvelope bLiveEnvelope, boolean z, jxn0 jxn0Var) {
        List<BLiveVoiceUserRecord> list = bLiveEnvelope.data.voiceLiveUserHeartbeatRewardList.userRecordList;
        this.f73993i = bLiveEnvelope.pagination.links;
        final HashMap<String, BLiveUserMask> mapM205186k = w6o0.m205186k(bLiveEnvelope);
        if (z) {
            this.f73994j++;
            this.f73992h.addAll(list);
            jxn0Var.m147377j();
        } else {
            this.f73994j = 0;
            this.f73992h.clear();
            this.f73992h.addAll(list);
            jxn0Var.m147387t(bLiveEnvelope.data.voiceLiveUserHeartbeatRewardList.heartbeatRewardPointsTotal);
            jxn0Var.m147378k();
        }
        jxn0Var.m147386s(this.f73992h, LivingUsers.create(jyb.m147486Q(bLiveEnvelope.data.users, new qcj() { // from class: l.qxn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f160065a.m100898G0(mapM205186k, (User) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: y0 */
    public l4g0 m100910y0() {
        l4g0 l4g0Var = new l4g0("p_anchor_live_end", VoiceLiveEndAct.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("liveId", this.f73985a.f45171id);
            jSONObject.put("anchorId", this.f73987c.f56859id);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        l4g0Var.m152780o(jSONObject);
        return l4g0Var;
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m100911z0() {
        return y6s.m214494b(this.f73985a.liveMode);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
