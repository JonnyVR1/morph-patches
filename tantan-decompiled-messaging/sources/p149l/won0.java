package p149l;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.bean.LivingUsers;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveSummary;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBonusGifts;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserRecord;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VoiceVirtualApi;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.liveend.VoiceLiveEndAct;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class won0 extends jq2<jo2> {

    /* JADX INFO: renamed from: a */
    public BLiveVoice f187443a;

    /* JADX INFO: renamed from: b */
    public BLiveVoiceRoom f187444b;

    /* JADX INFO: renamed from: c */
    public User f187445c;

    /* JADX INFO: renamed from: d */
    public String f187446d;

    /* JADX INFO: renamed from: e */
    public final Act f187447e;

    /* JADX INFO: renamed from: f */
    public final ekm0 f187448f;

    /* JADX INFO: renamed from: g */
    public final List<fon0> f187449g;

    /* JADX INFO: renamed from: h */
    public final List<BLiveVoiceUserRecord> f187450h;

    /* JADX INFO: renamed from: i */
    public Links f187451i;

    /* JADX INFO: renamed from: j */
    public int f187452j;

    public won0(Act act) {
        super(act);
        this.f187449g = new ArrayList();
        this.f187450h = new ArrayList();
        this.f187452j = 0;
        this.f187447e = act;
        this.f187448f = new ekm0(act, act);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m204820D0(Throwable th) {
        ((jo2) this.viewModel).mo98543e(this.f187444b, this.f187445c, this.f187443a, null, null, BLiveSummary.new_(), new LivingUsers<>());
        lsi0.m151578h(R$string.f46720H9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public void m204835s0(Bundle bundle) {
        ((jo2) this.viewModel).m142411i(this.f187447e, this.f187446d);
        if (ypv.m215672k().m195906o7()) {
            ((jo2) this.viewModel).mo98542c();
        }
        duringCreated(VoiceRoomApiProvider.getVoiceLiveSummaries(this.f187443a.f44323id, this.f187444b.isMaskMode())).subscribe(ffw.m121194e(new e30() { // from class: l.ron0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160400a.m204837C0((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.son0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f165710a.m204820D0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ mqv m204836A0(HashMap map, User user) {
        mqv mqvVarM155998f = mqv.m155998f(user);
        String str = user.f56011id;
        return mqvVarM155998f.m156001c(str, (BLiveUserMask) map.get(str), this.f187444b.maskMode);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m204837C0(BLiveEnvelope bLiveEnvelope) {
        BLiveSummary bLiveSummaryNew_ = vwb.m200296J(bLiveEnvelope.data.voiceLiveSummaries) ? BLiveSummary.new_() : bLiveEnvelope.data.voiceLiveSummaries.get(0);
        final HashMap<String, BLiveUserMask> mapM186524k = sxn0.m186524k(bLiveEnvelope);
        jo2 jo2Var = (jo2) this.viewModel;
        BLiveVoiceRoom bLiveVoiceRoom = this.f187444b;
        User user = this.f187445c;
        BLiveVoice bLiveVoice = this.f187443a;
        BLiveData bLiveData = bLiveEnvelope.data;
        jo2Var.mo98543e(bLiveVoiceRoom, user, bLiveVoice, bLiveData.sparkletProgress, bLiveData.accompanyUserRanking, bLiveSummaryNew_, LivingUsers.create(vwb.m200303Q(bLiveData.users, new w9j() { // from class: l.ton0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f171395a.m204836A0(mapM186524k, (User) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m204838E0(fon0 fon0Var, BLiveEnvelope bLiveEnvelope) {
        m204851x0(bLiveEnvelope, false, fon0Var);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m204839F0(fon0 fon0Var, BLiveEnvelope bLiveEnvelope) {
        m204851x0(bLiveEnvelope, true, fon0Var);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ mqv m204840G0(HashMap map, User user) {
        mqv mqvVarM155998f = mqv.m155998f(user);
        String str = user.f56011id;
        return mqvVarM155998f.m156001c(str, (BLiveUserMask) map.get(str), this.f187444b.maskMode);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m204841H0() {
        ((jo2) this.viewModel).mo98544f();
    }

    /* JADX INFO: renamed from: I0 */
    public void m204842I0(mqv<User> mqvVar) {
        if (!m204853z0()) {
            ayj0.m99566a(act(), mqvVar, ((hxn0) mqvVar.m156004g()).f109897c);
        } else {
            vpv vpvVar = ypv.f199493a;
            Act act = this.f187447e;
            User user = mqvVar.f135304a;
            vpvVar.m199303A0(act, user, user.f56011id, "live_user_card", false);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public void m204843J0() {
        this.f187447e.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: L0 */
    public void m204844L0(mqv<User> mqvVar, String str, boolean z, final e30<Boolean> e30Var) {
        String strM199309D0 = ypv.f199493a.m199309D0();
        if (!m204853z0()) {
            duringCreated(ypv.f199493a.m199338c(strM199309D0, mqvVar.f135304a, z, str, this.f187443a.f44323id)).subscribe(ffw.m121194e(new e30() { // from class: l.pon0
                @Override // p149l.e30
                public final void call(Object obj) {
                    e30Var.call(Boolean.TRUE);
                }
            }, new e30() { // from class: l.qon0
                @Override // p149l.e30
                public final void call(Object obj) {
                    e30Var.call(Boolean.FALSE);
                }
            }));
        } else if (z) {
            Act act = this.f187447e;
            User user = mqvVar.f135304a;
            BLiveVoice bLiveVoice = this.f187443a;
            duringCreated(VoiceVirtualApi.like(act, user, z, "endLivePage", "p_anchor_live_end", bLiveVoice.f44323id, bLiveVoice.room.f44419id)).subscribe(ffw.m121194e(new e30() { // from class: l.non0
                @Override // p149l.e30
                public final void call(Object obj) {
                    e30Var.call(Boolean.TRUE);
                }
            }, new e30() { // from class: l.oon0
                @Override // p149l.e30
                public final void call(Object obj) {
                    e30Var.call(Boolean.FALSE);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: N0 */
    public void m204845N0(ViewGroup viewGroup, String str, BLiveVoiceBonusGifts bLiveVoiceBonusGifts) {
        this.f187448f.m116986n0(viewGroup, str, bLiveVoiceBonusGifts, new d30() { // from class: l.lon0
            @Override // p149l.d30
            public final void call() {
                this.f129123a.m204841H0();
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    public List<fon0> m204846O0() {
        fon0 fon0Var = new fon0(this, 0);
        fon0 fon0Var2 = new fon0(this, 1);
        this.f187449g.add(fon0Var);
        this.f187449g.add(fon0Var2);
        return this.f187449g;
    }

    /* JADX INFO: renamed from: P0 */
    public void m204847P0(User user, BLiveVoice bLiveVoice, BLiveVoiceRoom bLiveVoiceRoom, String str) {
        this.f187445c = user;
        this.f187443a = bLiveVoice;
        this.f187444b = bLiveVoiceRoom;
        this.f187446d = str;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m204848Q0(String str) {
        j2e0.m139446m(this.f187447e, Uri.parse(str));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.ion0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114177a.m204835s0((Bundle) obj);
            }
        });
    }

    @Override // p149l.jq2
    @Nullable
    public Act act() {
        return this.f187447e;
    }

    /* JADX INFO: renamed from: t0 */
    public void m204849t0(boolean z, final fon0 fon0Var) {
        if (!z) {
            duringCreated(VoiceRoomApiProvider.getLiveVoiceHeartBeatReward(this.f187443a.f44323id, "20", String.valueOf(0))).subscribe(ffw.m121194e(new e30() { // from class: l.jon0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f119001a.m204838E0(fon0Var, (BLiveEnvelope) obj);
                }
            }, new e30() { // from class: l.kon0
                @Override // p149l.e30
                public final void call(Object obj) {
                    lsi0.m151578h(R$string.f46720H9);
                }
            }));
            return;
        }
        Links links = this.f187451i;
        if (links == null || TextUtils.isEmpty(links.next)) {
            fon0Var.m122469j();
        } else {
            duringCreated(VoiceRoomApiProvider.getLiveVoiceHeartBeatReward(this.f187443a.f44323id, "20", String.valueOf(this.f187452j + 1))).subscribe(ffw.m121194e(new e30() { // from class: l.uon0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f177521a.m204839F0(fon0Var, (BLiveEnvelope) obj);
                }
            }, new e30() { // from class: l.von0
                @Override // p149l.e30
                public final void call(Object obj) {
                    lsi0.m151578h(R$string.f46720H9);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: u0 */
    public List<fon0> m204850u0() {
        return this.f187449g;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m204851x0(BLiveEnvelope bLiveEnvelope, boolean z, fon0 fon0Var) {
        List<BLiveVoiceUserRecord> list = bLiveEnvelope.data.voiceLiveUserHeartbeatRewardList.userRecordList;
        this.f187451i = bLiveEnvelope.pagination.links;
        final HashMap<String, BLiveUserMask> mapM186524k = sxn0.m186524k(bLiveEnvelope);
        if (z) {
            this.f187452j++;
            this.f187450h.addAll(list);
            fon0Var.m122469j();
        } else {
            this.f187452j = 0;
            this.f187450h.clear();
            this.f187450h.addAll(list);
            fon0Var.m122479t(bLiveEnvelope.data.voiceLiveUserHeartbeatRewardList.heartbeatRewardPointsTotal);
            fon0Var.m122470k();
        }
        fon0Var.m122478s(this.f187450h, LivingUsers.create(vwb.m200303Q(bLiveEnvelope.data.users, new w9j() { // from class: l.mon0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f134925a.m204840G0(mapM186524k, (User) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: y0 */
    public cwf0 m204852y0() {
        cwf0 cwf0Var = new cwf0("p_anchor_live_end", VoiceLiveEndAct.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("liveId", this.f187443a.f44323id);
            jSONObject.put("anchorId", this.f187445c.f56011id);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        cwf0Var.m109039o(jSONObject);
        return cwf0Var;
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m204853z0() {
        return x4s.m207012b(this.f187443a.liveMode);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
