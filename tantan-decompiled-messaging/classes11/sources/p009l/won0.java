package p009l;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.liveend.VoiceLiveEndAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.bean.LivingUsers;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveSummary;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p1.mobile.putong.live.base.data.BLiveVoice;
import com.p1.mobile.putong.live.base.data.BLiveVoiceBonusGifts;
import com.p1.mobile.putong.live.base.data.BLiveVoiceEndSparkProgress;
import com.p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p1.mobile.putong.live.base.data.BLiveVoiceUserRecord;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.virtual.api.VoiceVirtualApi;
import com.p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.cwf0;
import l.d30;
import l.e30;
import l.ffw;
import l.j2e0;
import l.jo2;
import l.jq2;
import l.lsi0;
import l.mqv;
import l.sxn0;
import l.vwb;
import l.w9j;
import l.x4s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class won0 extends jq2<jo2> {

    /* JADX INFO: renamed from: a */
    public BLiveVoice f22243a;

    /* JADX INFO: renamed from: b */
    public BLiveVoiceRoom f22244b;

    /* JADX INFO: renamed from: c */
    public User f22245c;

    /* JADX INFO: renamed from: d */
    public String f22246d;

    /* JADX INFO: renamed from: e */
    public final Act f22247e;

    /* JADX INFO: renamed from: f */
    public final ekm0 f22248f;

    /* JADX INFO: renamed from: g */
    public final List<fon0> f22249g;

    /* JADX INFO: renamed from: h */
    public final List<BLiveVoiceUserRecord> f22250h;

    /* JADX INFO: renamed from: i */
    public Links f22251i;

    /* JADX INFO: renamed from: j */
    public int f22252j;

    public won0(Act act) {
        super(act);
        this.f22249g = new ArrayList();
        this.f22250h = new ArrayList();
        this.f22252j = 0;
        this.f22247e = act;
        this.f22248f = new ekm0(act, act);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m24415D0(Throwable th) {
        ((jq2) this).viewModel.e(this.f22244b, this.f22245c, this.f22243a, (BLiveVoiceEndSparkProgress) null, (List) null, BLiveSummary.new_(), new LivingUsers());
        lsi0.h(R.string.H9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public void m24430s0(Bundle bundle) {
        ((jq2) this).viewModel.i(this.f22247e, this.f22246d);
        if (ypv.m25490k().o7()) {
            ((jq2) this).viewModel.c();
        }
        duringCreated(VoiceRoomApiProvider.getVoiceLiveSummaries(((BLiveAbsData) this.f22243a).id, this.f22244b.isMaskMode())).subscribe(ffw.e(new e30() { // from class: l.ron0
            public final void call(Object obj) {
                this.f19935a.m24432C0((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.son0
            public final void call(Object obj) {
                this.f20405a.m24415D0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ mqv m24431A0(HashMap map, User user) {
        mqv mqvVarF = mqv.f(user);
        String str = ((DbObject) user).id;
        return mqvVarF.c(str, (BLiveUserMask) map.get(str), this.f22244b.maskMode);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m24432C0(BLiveEnvelope bLiveEnvelope) {
        BLiveSummary bLiveSummaryNew_ = vwb.J(bLiveEnvelope.data.voiceLiveSummaries) ? BLiveSummary.new_() : (BLiveSummary) bLiveEnvelope.data.voiceLiveSummaries.get(0);
        final HashMap mapK = sxn0.k(bLiveEnvelope);
        jo2 jo2Var = ((jq2) this).viewModel;
        BLiveVoiceRoom bLiveVoiceRoom = this.f22244b;
        User user = this.f22245c;
        BLiveVoice bLiveVoice = this.f22243a;
        BLiveData bLiveData = bLiveEnvelope.data;
        jo2Var.e(bLiveVoiceRoom, user, bLiveVoice, bLiveData.sparkletProgress, bLiveData.accompanyUserRanking, bLiveSummaryNew_, LivingUsers.create(vwb.Q(bLiveData.users, new w9j() { // from class: l.ton0
            public final Object call(Object obj) {
                return this.f20806a.m24431A0(mapK, (User) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m24433E0(fon0 fon0Var, BLiveEnvelope bLiveEnvelope) {
        m24447x0(bLiveEnvelope, false, fon0Var);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m24434F0(fon0 fon0Var, BLiveEnvelope bLiveEnvelope) {
        m24447x0(bLiveEnvelope, true, fon0Var);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ mqv m24435G0(HashMap map, User user) {
        mqv mqvVarF = mqv.f(user);
        String str = ((DbObject) user).id;
        return mqvVarF.c(str, (BLiveUserMask) map.get(str), this.f22244b.maskMode);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m24436H0() {
        ((jq2) this).viewModel.f();
    }

    /* JADX INFO: renamed from: I0 */
    public void m24437I0(mqv<User> mqvVar) {
        if (!m24449z0()) {
            ayj0.m11766a(act(), mqvVar, mqvVar.g().c);
        } else {
            vpv vpvVar = ypv.f23196a;
            Act act = this.f22247e;
            Object obj = mqvVar.a;
            vpvVar.m23613A0(act, (User) obj, ((DbObject) ((User) obj)).id, "live_user_card", false);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public void m24438J0() {
        this.f22247e.finish();
    }

    /* JADX INFO: renamed from: L0 */
    public void m24439L0(mqv<User> mqvVar, String str, boolean z, final e30<Boolean> e30Var) {
        String strM23619D0 = ypv.f23196a.m23619D0();
        if (!m24449z0()) {
            duringCreated(ypv.f23196a.m23648c(strM23619D0, (User) mqvVar.a, z, str, ((BLiveAbsData) this.f22243a).id)).subscribe(ffw.e(new e30() { // from class: l.pon0
                public final void call(Object obj) {
                    e30Var.call(Boolean.TRUE);
                }
            }, new e30() { // from class: l.qon0
                public final void call(Object obj) {
                    e30Var.call(Boolean.FALSE);
                }
            }));
        } else if (z) {
            Act act = this.f22247e;
            User user = (User) mqvVar.a;
            BLiveVoice bLiveVoice = this.f22243a;
            duringCreated(VoiceVirtualApi.like(act, user, z, "endLivePage", "p_anchor_live_end", ((BLiveAbsData) bLiveVoice).id, ((BLiveAbsData) bLiveVoice).room.id)).subscribe(ffw.e(new e30() { // from class: l.non0
                public final void call(Object obj) {
                    e30Var.call(Boolean.TRUE);
                }
            }, new e30() { // from class: l.oon0
                public final void call(Object obj) {
                    e30Var.call(Boolean.FALSE);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: N0 */
    public void m24440N0(ViewGroup viewGroup, String str, BLiveVoiceBonusGifts bLiveVoiceBonusGifts) {
        this.f22248f.m13973n0(viewGroup, str, bLiveVoiceBonusGifts, new d30() { // from class: l.lon0
            public final void call() {
                this.f16286a.m24436H0();
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    public List<fon0> m24441O0() {
        fon0 fon0Var = new fon0(this, 0);
        fon0 fon0Var2 = new fon0(this, 1);
        this.f22249g.add(fon0Var);
        this.f22249g.add(fon0Var2);
        return this.f22249g;
    }

    /* JADX INFO: renamed from: P0 */
    public void m24442P0(User user, BLiveVoice bLiveVoice, BLiveVoiceRoom bLiveVoiceRoom, String str) {
        this.f22245c = user;
        this.f22243a = bLiveVoice;
        this.f22244b = bLiveVoiceRoom;
        this.f22246d = str;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m24443Q0(String str) {
        j2e0.m(this.f22247e, Uri.parse(str));
    }

    /* JADX INFO: renamed from: a0 */
    public void m24444a0() {
        creates(new e30() { // from class: l.ion0
            public final void call(Object obj) {
                this.f14731a.m24430s0((Bundle) obj);
            }
        });
    }

    @Nullable
    public Act act() {
        return this.f22247e;
    }

    /* JADX INFO: renamed from: t0 */
    public void m24445t0(boolean z, final fon0 fon0Var) {
        if (!z) {
            duringCreated(VoiceRoomApiProvider.getLiveVoiceHeartBeatReward(((BLiveAbsData) this.f22243a).id, "20", String.valueOf(0))).subscribe(ffw.e(new e30() { // from class: l.jon0
                public final void call(Object obj) {
                    this.f15248a.m24433E0(fon0Var, (BLiveEnvelope) obj);
                }
            }, new e30() { // from class: l.kon0
                public final void call(Object obj) {
                    lsi0.h(R.string.H9);
                }
            }));
            return;
        }
        Links links = this.f22251i;
        if (links == null || TextUtils.isEmpty(links.next)) {
            fon0Var.m14541j();
        } else {
            duringCreated(VoiceRoomApiProvider.getLiveVoiceHeartBeatReward(((BLiveAbsData) this.f22243a).id, "20", String.valueOf(this.f22252j + 1))).subscribe(ffw.e(new e30() { // from class: l.uon0
                public final void call(Object obj) {
                    this.f21280a.m24434F0(fon0Var, (BLiveEnvelope) obj);
                }
            }, new e30() { // from class: l.von0
                public final void call(Object obj) {
                    lsi0.h(R.string.H9);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: u0 */
    public List<fon0> m24446u0() {
        return this.f22249g;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m24447x0(BLiveEnvelope bLiveEnvelope, boolean z, fon0 fon0Var) {
        List list = bLiveEnvelope.data.voiceLiveUserHeartbeatRewardList.userRecordList;
        this.f22251i = bLiveEnvelope.pagination.links;
        final HashMap mapK = sxn0.k(bLiveEnvelope);
        if (z) {
            this.f22252j++;
            this.f22250h.addAll(list);
            fon0Var.m14541j();
        } else {
            this.f22252j = 0;
            this.f22250h.clear();
            this.f22250h.addAll(list);
            fon0Var.m14551t(bLiveEnvelope.data.voiceLiveUserHeartbeatRewardList.heartbeatRewardPointsTotal);
            fon0Var.m14542k();
        }
        fon0Var.m14550s(this.f22250h, LivingUsers.create(vwb.Q(bLiveEnvelope.data.users, new w9j() { // from class: l.mon0
            public final Object call(Object obj) {
                return this.f17005a.m24435G0(mapK, (User) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: y0 */
    public cwf0 m24448y0() {
        cwf0 cwf0Var = new cwf0("p_anchor_live_end", VoiceLiveEndAct.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("liveId", ((BLiveAbsData) this.f22243a).id);
            jSONObject.put("anchorId", ((DbObject) this.f22245c).id);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        cwf0Var.o(jSONObject);
        return cwf0Var;
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m24449z0() {
        return x4s.b(((BLiveAbsData) this.f22243a).liveMode);
    }

    public void destroy() {
    }
}
