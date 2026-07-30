package p149l;

import androidx.annotation.NonNull;
import com.immomo.momomediaext.MomoMediaConstants$MMLiveAudioEffectPreset;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class q3r extends d8s implements jtl {

    /* JADX INFO: renamed from: a */
    public final jxl f152492a;

    /* JADX INFO: renamed from: c */
    public c4g0 f152494c;

    /* JADX INFO: renamed from: d */
    public int f152495d;

    /* JADX INFO: renamed from: e */
    public final bxl f152496e;

    /* JADX INFO: renamed from: f */
    public String f152497f;

    /* JADX INFO: renamed from: i */
    public boolean f152500i;

    /* JADX INFO: renamed from: j */
    public long f152501j = -1;

    /* JADX INFO: renamed from: k */
    public long f152502k = -1;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList<we50> f152493b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: g */
    public boolean f152498g = false;

    /* JADX INFO: renamed from: h */
    public int f152499h = MomoMediaConstants$MMLiveAudioEffectPreset.MMLiveAudioEffectPresetOff.getValue();

    /* JADX INFO: renamed from: l.q3r$a */
    public class C19425a extends bj2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f152503a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f152504b;

        public C19425a(String str, String str2) {
            this.f152503a = str;
            this.f152504b = str2;
        }

        @Override // p149l.bj2, p149l.h7e
        /* JADX INFO: renamed from: a */
        public void mo74248a(@NonNull final File file) {
            super.mo74248a(file);
            hfw.m130790a("[voice][ktv]", "prepareLrcFile success:" + this.f152503a + ",path:" + file.getAbsolutePath());
            CopyOnWriteArrayList copyOnWriteArrayList = q3r.this.f152493b;
            final String str = this.f152503a;
            final String str2 = this.f152504b;
            vwb.m200354z(copyOnWriteArrayList, new e30() { // from class: l.p3r
                @Override // p149l.e30
                public final void call(Object obj) {
                    we50 we50Var = (we50) obj;
                    we50Var.mo172508s(str, file.getAbsolutePath(), str2);
                }
            });
        }
    }

    public q3r(jxl jxlVar) {
        this.f152492a = jxlVar;
        this.f152496e = jxlVar.mo138335a();
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ void m172899a1(String str, String str2, long j, long j2, we50 we50Var) {
        try {
            we50Var.mo172491U1(str, str2, j, j2);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: C0 */
    public void mo110342C0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110342C0(str, i, mMLivePushType);
        m172912n1("onLocalLeaveChannel");
        m172915q1(true);
    }

    @Override // p149l.jtl
    /* JADX INFO: renamed from: E0 */
    public void mo143131E0(float f) {
        m172912n1("adjustMusicVolume:" + f);
        this.f152496e.mo71865a0(f);
    }

    @Override // p149l.jtl
    /* JADX INFO: renamed from: G0 */
    public int mo143132G0() {
        return this.f152499h;
    }

    @Override // p149l.jtl
    /* JADX INFO: renamed from: H */
    public void mo143133H(Boolean bool) {
        this.f152498g = bool.booleanValue();
        int iMo71877k = this.f152492a.mo138335a().mo71877k();
        jxl jxlVar = this.f152492a;
        m172912n1("setOriginal result" + (iMo71877k > 1 ? jxlVar.mo138335a().mo71862Q0(1 ^ (bool.booleanValue() ? 1 : 0)) : jxlVar.mo138335a().mo71859H(bool)) + ",isCheck:" + bool + "，trackCount" + iMo71877k);
    }

    @Override // p149l.jtl
    /* JADX INFO: renamed from: H0 */
    public void mo143134H0(boolean z) {
        mo143148n0("lifecycle destroy");
        this.f152492a.mo138336b().mo118143a(this);
        mo143137O0();
        rhn0.m179435g().m179436c();
        mo143136M0(Boolean.FALSE, true);
        m172915q1(z);
        this.f152498g = false;
        this.f152499h = MomoMediaConstants$MMLiveAudioEffectPreset.MMLiveAudioEffectPresetOff.getValue();
        m172916r1();
    }

    @Override // p149l.jtl
    /* JADX INFO: renamed from: J0 */
    public void mo143135J0(we50 we50Var) {
        this.f152493b.remove(we50Var);
    }

    @Override // p149l.jtl
    /* JADX INFO: renamed from: M0 */
    public void mo143136M0(Boolean bool, boolean z) {
        this.f152500i = bool.booleanValue();
        this.f152492a.mo138335a().mo71861M(bool);
    }

    @Override // p149l.jtl
    /* JADX INFO: renamed from: O0 */
    public void mo143137O0() {
        this.f152493b.clear();
    }

    @Override // p149l.jtl
    /* JADX INFO: renamed from: P0 */
    public void mo143138P0(float f) {
        m172912n1("adjustRecordingVolume:" + f);
        this.f152496e.mo71852A(f);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0051  */
    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: R */
    public void mo110348R(int i, byte[] bArr) {
        q3r q3rVar;
        JSONException jSONException;
        long jM155944o;
        long j;
        super.mo110348R(i, bArr);
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            if (!k580.f121156b.equals(jSONObject.getString(k580.f121155a))) {
                return;
            }
            long j2 = jSONObject.getLong(k580.f121157c);
            long j3 = jSONObject.getLong(k580.f121159e);
            String string = jSONObject.getString(k580.f121158d);
            if (jSONObject.has(k580.f121160f)) {
                try {
                    jM155944o = mqi0.m155944o() - jSONObject.getLong(k580.f121160f);
                    if (jM155944o > 300) {
                        j = j2 - jM155944o;
                        if (j < 0) {
                            j = j2;
                        }
                    } else {
                        j = j2;
                    }
                } catch (JSONException e) {
                    jSONException = e;
                    q3rVar = this;
                }
            } else {
                j = j2;
                jM155944o = 0;
            }
            m172912n1("onStreamMessage,uid" + i + ",songCode:" + string + ",progress:" + j + ",duration:" + j3 + "delay：" + jM155944o);
            if (j2 == 0) {
                m172917s1();
                return;
            }
            int i2 = this.f152495d;
            if (j2 == -1) {
                if (i2 != 4) {
                    setStatus(4);
                    vwb.m200354z(this.f152493b, new a3r());
                    return;
                }
                return;
            }
            if (i2 == 0 || i2 == 5) {
                m172917s1();
            }
            q3rVar = this;
            try {
                q3rVar.m172913o1(String.valueOf(i), string, j3, j);
                return;
            } catch (JSONException e2) {
                e = e2;
            }
        } catch (JSONException e3) {
            e = e3;
            q3rVar = this;
        }
        jSONException = e;
        CrashHelper.m81296c(jSONException);
        q3rVar.m172912n1("onStreamMessage:" + jSONException.getMessage());
    }

    @Override // p149l.jtl
    /* JADX INFO: renamed from: U */
    public void mo143139U(String str, String str2) {
        m172912n1("prepare prepareMusicFile:" + str);
        rhn0.m179435g().m179445m(str, str2, null);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: W */
    public void mo110352W() {
        super.mo110352W();
        if (this.f152495d != 5) {
            m172912n1("onSurroundMusicStopped:");
            setStatus(5);
            vwb.m200354z(this.f152493b, new e30() { // from class: l.m3r
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f131114a.m172907i1((we50) obj);
                }
            });
            mkd0.m154992z(this.f152494c);
            m172915q1(true);
            m172916r1();
        }
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: X */
    public void mo110353X() {
        super.mo110353X();
        if (this.f152495d != 5) {
            m172912n1("onSurroundMusicStopped:");
            setStatus(5);
            vwb.m200354z(this.f152493b, new e30() { // from class: l.n3r
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f137016a.m172906h1((we50) obj);
                }
            });
            mkd0.m154992z(this.f152494c);
            m172915q1(true);
            m172916r1();
        }
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: Z */
    public void mo110354Z() {
        super.mo110354Z();
        m172912n1("onSurroundMusicStart:");
        if (this.f152495d != 3) {
            m172905g1();
            m172917s1();
        }
    }

    @Override // p149l.jtl
    /* JADX INFO: renamed from: c */
    public long mo143140c() {
        return this.f152496e.mo71869c();
    }

    @Override // p149l.jtl
    /* JADX INFO: renamed from: d */
    public float mo143141d() {
        return this.f152496e.mo71870d();
    }

    @Override // p149l.jtl
    /* JADX INFO: renamed from: f0 */
    public void mo143142f0(String str, final String str2, final String str3, String str4, final String str5, final String str6) {
        vwb.m200354z(this.f152493b, new e30() { // from class: l.h3r
            @Override // p149l.e30
            public final void call(Object obj) {
                ((we50) obj).m202834A0(str2, str3);
            }
        });
        m172912n1("playMusic:" + str2 + ",current status:" + this.f152495d);
        this.f152497f = str;
        if (rhn0.m179435g().m179447o(str2)) {
            str3 = rhn0.m179435g().m179444l(str2);
        }
        m172912n1("playMusic path:" + str3);
        m172914p1(str2, str3);
        if (rhn0.m179435g().m179446n(str2, str5)) {
            vwb.m200354z(this.f152493b, new e30() { // from class: l.i3r
                @Override // p149l.e30
                public final void call(Object obj) {
                    String str7 = str2;
                    we50 we50Var = (we50) obj;
                    we50Var.mo172508s(str7, rhn0.m179435g().m179442j(str7, str5), str6);
                }
            });
        } else {
            m172912n1("lrc download timeout");
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final long m172904f1(Long l2, String str, long j) {
        long jMo71880r;
        if (l2.longValue() % 10 == 0) {
            jMo71880r = this.f152496e.mo71880r();
            m172912n1("getSurroundMusicPos1:" + jMo71880r);
        } else if (this.f152501j < 0) {
            jMo71880r = this.f152496e.mo71880r();
        } else {
            long jM155944o = mqi0.m155944o() - this.f152502k;
            if (jM155944o > 100) {
                jMo71880r = this.f152496e.mo71880r();
                m172912n1("getSurroundMusicPos2:" + jMo71880r);
            } else {
                jMo71880r = jM155944o + this.f152501j;
            }
        }
        long j2 = jMo71880r;
        this.f152502k = mqi0.m155944o();
        this.f152501j = j2;
        if (j2 < 0) {
            mo143148n0("current position illegal");
            rhn0.m179435g().m179437d(str);
            return j2;
        }
        if (j2 >= j) {
            mo143148n0("check play complete");
            return j2;
        }
        m172918t1(str, j, j2);
        return j2;
    }

    /* JADX INFO: renamed from: g1 */
    public final void m172905g1() {
        m172912n1("initMusicEffect:");
        int i = this.f152499h;
        if (i > 0) {
            mo143143h(i);
        } else {
            mo143143h(MomoMediaConstants$MMLiveAudioEffectPreset.MMLiveAudioEffectPresetRoomAcousticsKTV.getValue());
        }
        mo143133H(Boolean.valueOf(this.f152498g));
    }

    @Override // p149l.jtl
    public int getStatus() {
        return this.f152495d;
    }

    @Override // p149l.jtl
    /* JADX INFO: renamed from: h */
    public void mo143143h(int i) {
        this.f152499h = i;
        m172912n1("setAudioEffectPreset result" + this.f152492a.mo138335a().mo71874h(i) + ",effectPreset:" + i);
    }

    @Override // p149l.jtl
    /* JADX INFO: renamed from: h0 */
    public boolean mo143144h0() {
        return this.f152500i;
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m172906h1(we50 we50Var) {
        we50Var.mo136668B(this.f152497f);
    }

    @Override // p149l.jtl
    /* JADX INFO: renamed from: i */
    public float mo143145i() {
        return this.f152496e.mo71875i();
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m172907i1(we50 we50Var) {
        we50Var.mo136668B(this.f152497f);
    }

    @Override // p149l.jtl
    public void init() {
        this.f152492a.mo138336b().mo118144b(this);
    }

    @Override // p149l.jtl
    /* JADX INFO: renamed from: j0 */
    public void mo143146j0(we50 we50Var) {
        if (this.f152493b.contains(we50Var)) {
            return;
        }
        this.f152493b.add(we50Var);
        m172912n1("registerPlayListener:" + we50Var.getClass());
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m172908j1(Throwable th) {
        m172912n1("throwable:" + th.getMessage());
    }

    @Override // p149l.jtl
    /* JADX INFO: renamed from: k0 */
    public boolean mo143147k0() {
        return this.f152498g;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ Boolean m172909k1(Long l2) {
        return Boolean.valueOf(3 == this.f152495d);
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ Long m172910l1(String str, long j, Long l2) {
        return Long.valueOf(m172904f1(l2, str, j));
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m172911m1(String str, long j, Long l2) {
        m172913o1(ypv.f199493a.m199309D0(), str, j, l2.longValue());
    }

    @Override // p149l.jtl
    /* JADX INFO: renamed from: n0 */
    public void mo143148n0(String str) {
        m172912n1("stopMusic " + str);
        mkd0.m154992z(this.f152494c);
        this.f152492a.mo138335a().stopSurroundMusic();
    }

    /* JADX INFO: renamed from: n1 */
    public final void m172912n1(String str) {
        gkh0.m126627j("[voice][ktv]", str + ",hashCode:" + hashCode());
    }

    /* JADX INFO: renamed from: o1 */
    public final long m172913o1(final String str, final String str2, final long j, final long j2) {
        vwb.m200354z(this.f152493b, new e30() { // from class: l.f3r
            @Override // p149l.e30
            public final void call(Object obj) {
                q3r.m172899a1(str, str2, j, j2, (we50) obj);
            }
        });
        return j2;
    }

    @Override // p149l.jtl
    /* JADX INFO: renamed from: p0 */
    public void mo143149p0(final String str) {
        m172912n1("sendMusicProgress:" + str);
        mkd0.m154992z(this.f152494c);
        final long jMo71869c = this.f152496e.mo71869c();
        this.f152494c = C22306c.interval(0L, 50L, TimeUnit.MILLISECONDS).onBackpressureLatest().filter(new w9j() { // from class: l.o3r
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f141704a.m172909k1((Long) obj);
            }
        }).map(new w9j() { // from class: l.b3r
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f73252a.m172910l1(str, jMo71869c, (Long) obj);
            }
        }).filter(new w9j() { // from class: l.c3r
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() >= 0);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.d3r
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84253a.m172911m1(str, jMo71869c, (Long) obj);
            }
        }, new e30() { // from class: l.e3r
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89209a.m172908j1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p1 */
    public final void m172914p1(final String str, final String str2) {
        m172912n1("onMusicResourceReady:" + str + ",filePath:" + str2);
        this.f152496e.mo71856E(str2, false);
        setStatus(2);
        vwb.m200354z(this.f152493b, new e30() { // from class: l.k3r
            @Override // p149l.e30
            public final void call(Object obj) {
                ((we50) obj).m202835m0(str, str2);
            }
        });
    }

    @Override // p149l.jtl
    public void pause() {
        m172912n1("pause");
        this.f152492a.mo138335a().mo71876j();
        if (this.f152495d != 4) {
            setStatus(4);
            vwb.m200354z(this.f152493b, new a3r());
        }
    }

    @Override // p149l.jtl
    /* JADX INFO: renamed from: q0 */
    public void mo143150q0(String str, String str2, String str3, String str4) {
        m172912n1(" prepareLrcFile:" + str);
        rhn0.m179435g().m179441i(str, str2, str3, str4, new C19425a(str, str4));
    }

    /* JADX INFO: renamed from: q1 */
    public final void m172915q1(boolean z) {
        m172912n1("resetMusicEffect:");
        if (z) {
            this.f152492a.mo138335a().mo71874h(MomoMediaConstants$MMLiveAudioEffectPreset.MMLiveAudioEffectPresetOff.getValue());
        }
        this.f152492a.mo138335a().mo71859H(Boolean.FALSE);
        this.f152492a.mo138335a().mo71862Q0(1);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: r0 */
    public void mo110361r0(final int i) {
        super.mo110361r0(i);
        m172912n1("onSurroundMusicError:" + i);
        vwb.m200354z(this.f152493b, new e30() { // from class: l.l3r
            @Override // p149l.e30
            public final void call(Object obj) {
                ((we50) obj).mo136675H0(i + "");
            }
        });
        setStatus(5);
    }

    /* JADX INFO: renamed from: r1 */
    public final void m172916r1() {
        this.f152501j = -1L;
        this.f152502k = -1L;
    }

    @Override // p149l.jtl
    public void resume() {
        m172912n1("resume");
        setStatus(3);
        this.f152492a.mo138335a().mo71879q();
        vwb.m200354z(this.f152493b, new e30() { // from class: l.g3r
            @Override // p149l.e30
            public final void call(Object obj) {
                ((we50) obj).mo201542A();
            }
        });
    }

    /* JADX INFO: renamed from: s1 */
    public final void m172917s1() {
        setStatus(3);
        vwb.m200354z(this.f152493b, new e30() { // from class: l.j3r
            @Override // p149l.e30
            public final void call(Object obj) {
                ((we50) obj).mo136698s0();
            }
        });
    }

    @Override // p149l.jtl
    public void setStatus(int i) {
        this.f152495d = i;
        m172912n1("set status:" + i);
    }

    /* JADX INFO: renamed from: t1 */
    public final long m172918t1(String str, long j, long j2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(k580.f121155a, k580.f121156b);
            jSONObject.put(k580.f121158d, str);
            jSONObject.put(k580.f121159e, j);
            jSONObject.put(k580.f121157c, j2);
            jSONObject.put(k580.f121160f, mqi0.m155944o());
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        this.f152492a.mo138335a().mo71854D(jSONObject.toString().getBytes());
        return j2;
    }

    @Override // p149l.jtl
    /* JADX INFO: renamed from: w */
    public long mo143151w() {
        return this.f152496e.mo71880r();
    }
}
