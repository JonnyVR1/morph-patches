package p153l;

import androidx.annotation.NonNull;
import com.immomo.momomediaext.MomoMediaConstants$MMLiveAudioEffectPreset;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class r5r extends eas implements xvl {

    /* JADX INFO: renamed from: a */
    public final c0m f161376a;

    /* JADX INFO: renamed from: c */
    public kcg0 f161378c;

    /* JADX INFO: renamed from: d */
    public int f161379d;

    /* JADX INFO: renamed from: e */
    public final uzl f161380e;

    /* JADX INFO: renamed from: f */
    public String f161381f;

    /* JADX INFO: renamed from: i */
    public boolean f161384i;

    /* JADX INFO: renamed from: j */
    public long f161385j = -1;

    /* JADX INFO: renamed from: k */
    public long f161386k = -1;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList<dn50> f161377b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: g */
    public boolean f161382g = false;

    /* JADX INFO: renamed from: h */
    public int f161383h = MomoMediaConstants$MMLiveAudioEffectPreset.MMLiveAudioEffectPresetOff.getValue();

    /* JADX INFO: renamed from: l.r5r$a */
    public class C19768a extends jj2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f161387a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f161388b;

        public C19768a(String str, String str2) {
            this.f161387a = str;
            this.f161388b = str2;
        }

        @Override // p153l.jj2, p153l.w8e
        /* JADX INFO: renamed from: a */
        public void mo75431a(@NonNull final File file) {
            super.mo75431a(file);
            fhw.m125605a("[voice][ktv]", "prepareLrcFile success:" + this.f161387a + ",path:" + file.getAbsolutePath());
            CopyOnWriteArrayList copyOnWriteArrayList = r5r.this.f161377b;
            final String str = this.f161387a;
            final String str2 = this.f161388b;
            jyb.m147537z(copyOnWriteArrayList, new y20() { // from class: l.q5r
                @Override // p153l.y20
                public final void call(Object obj) {
                    dn50 dn50Var = (dn50) obj;
                    dn50Var.mo117051s(str, file.getAbsolutePath(), str2);
                }
            });
        }
    }

    public r5r(c0m c0mVar) {
        this.f161376a = c0mVar;
        this.f161380e = c0mVar.mo107430a();
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ void m179894a1(String str, String str2, long j, long j2, dn50 dn50Var) {
        try {
            dn50Var.mo117049U1(str, str2, j, j2);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: C0 */
    public void mo96682C0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96682C0(str, i, mMLivePushType);
        m179925n1("onLocalLeaveChannel");
        m179930q1(true);
    }

    @Override // p153l.xvl
    /* JADX INFO: renamed from: E0 */
    public void mo179899E0(float f) {
        m179925n1("adjustMusicVolume:" + f);
        this.f161380e.mo73048a0(f);
    }

    @Override // p153l.xvl
    /* JADX INFO: renamed from: G0 */
    public int mo179900G0() {
        return this.f161383h;
    }

    @Override // p153l.xvl
    /* JADX INFO: renamed from: H */
    public void mo179901H(Boolean bool) {
        this.f161382g = bool.booleanValue();
        int iMo73060k = this.f161376a.mo107430a().mo73060k();
        c0m c0mVar = this.f161376a;
        m179925n1("setOriginal result" + (iMo73060k > 1 ? c0mVar.mo107430a().mo73045Q0(1 ^ (bool.booleanValue() ? 1 : 0)) : c0mVar.mo107430a().mo73042H(bool)) + ",isCheck:" + bool + "，trackCount" + iMo73060k);
    }

    @Override // p153l.xvl
    /* JADX INFO: renamed from: H0 */
    public void mo179902H0(boolean z) {
        mo179924n0("lifecycle destroy");
        this.f161376a.mo107431b().mo161148a(this);
        mo179905O0();
        vqn0.m202426g().m202427c();
        mo179904M0(Boolean.FALSE, true);
        m179930q1(z);
        this.f161382g = false;
        this.f161383h = MomoMediaConstants$MMLiveAudioEffectPreset.MMLiveAudioEffectPresetOff.getValue();
        m179931r1();
    }

    @Override // p153l.xvl
    /* JADX INFO: renamed from: J0 */
    public void mo179903J0(dn50 dn50Var) {
        this.f161377b.remove(dn50Var);
    }

    @Override // p153l.xvl
    /* JADX INFO: renamed from: M0 */
    public void mo179904M0(Boolean bool, boolean z) {
        this.f161384i = bool.booleanValue();
        this.f161376a.mo107430a().mo73044M(bool);
    }

    @Override // p153l.xvl
    /* JADX INFO: renamed from: O0 */
    public void mo179905O0() {
        this.f161377b.clear();
    }

    @Override // p153l.xvl
    /* JADX INFO: renamed from: P0 */
    public void mo179906P0(float f) {
        m179925n1("adjustRecordingVolume:" + f);
        this.f161380e.mo73035A(f);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0051  */
    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: R */
    public void mo120106R(int i, byte[] bArr) {
        r5r r5rVar;
        JSONException jSONException;
        long jM174454o;
        long j;
        super.mo120106R(i, bArr);
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            if (!qd80.f156667b.equals(jSONObject.getString(qd80.f156666a))) {
                return;
            }
            long j2 = jSONObject.getLong(qd80.f156668c);
            long j3 = jSONObject.getLong(qd80.f156670e);
            String string = jSONObject.getString(qd80.f156669d);
            if (jSONObject.has(qd80.f156671f)) {
                try {
                    jM174454o = pzi0.m174454o() - jSONObject.getLong(qd80.f156671f);
                    if (jM174454o > 300) {
                        j = j2 - jM174454o;
                        if (j < 0) {
                            j = j2;
                        }
                    } else {
                        j = j2;
                    }
                } catch (JSONException e) {
                    jSONException = e;
                    r5rVar = this;
                }
            } else {
                j = j2;
                jM174454o = 0;
            }
            m179925n1("onStreamMessage,uid" + i + ",songCode:" + string + ",progress:" + j + ",duration:" + j3 + "delay：" + jM174454o);
            if (j2 == 0) {
                m179932s1();
                return;
            }
            int i2 = this.f161379d;
            if (j2 == -1) {
                if (i2 != 4) {
                    setStatus(4);
                    jyb.m147537z(this.f161377b, new b5r());
                    return;
                }
                return;
            }
            if (i2 == 0 || i2 == 5) {
                m179932s1();
            }
            r5rVar = this;
            try {
                r5rVar.m179926o1(String.valueOf(i), string, j3, j);
                return;
            } catch (JSONException e2) {
                e = e2;
            }
        } catch (JSONException e3) {
            e = e3;
            r5rVar = this;
        }
        jSONException = e;
        CrashHelper.m82479c(jSONException);
        r5rVar.m179925n1("onStreamMessage:" + jSONException.getMessage());
    }

    @Override // p153l.xvl
    /* JADX INFO: renamed from: U */
    public void mo179907U(String str, String str2) {
        m179925n1("prepare prepareMusicFile:" + str);
        vqn0.m202426g().m202436m(str, str2, null);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: W */
    public void mo120108W() {
        super.mo120108W();
        if (this.f161379d != 5) {
            m179925n1("onSurroundMusicStopped:");
            setStatus(5);
            jyb.m147537z(this.f161377b, new y20() { // from class: l.n5r
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f140378a.m179917i1((dn50) obj);
                }
            });
            psd0.m173633z(this.f161378c);
            m179930q1(true);
            m179931r1();
        }
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: X */
    public void mo120109X() {
        super.mo120109X();
        if (this.f161379d != 5) {
            m179925n1("onSurroundMusicStopped:");
            setStatus(5);
            jyb.m147537z(this.f161377b, new y20() { // from class: l.o5r
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f145104a.m179915h1((dn50) obj);
                }
            });
            psd0.m173633z(this.f161378c);
            m179930q1(true);
            m179931r1();
        }
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: Z */
    public void mo120110Z() {
        super.mo120110Z();
        m179925n1("onSurroundMusicStart:");
        if (this.f161379d != 3) {
            m179912g1();
            m179932s1();
        }
    }

    @Override // p153l.xvl
    /* JADX INFO: renamed from: c */
    public long mo179908c() {
        return this.f161380e.mo73052c();
    }

    @Override // p153l.xvl
    /* JADX INFO: renamed from: d */
    public float mo179909d() {
        return this.f161380e.mo73053d();
    }

    @Override // p153l.xvl
    /* JADX INFO: renamed from: f0 */
    public void mo179910f0(String str, final String str2, final String str3, String str4, final String str5, final String str6) {
        jyb.m147537z(this.f161377b, new y20() { // from class: l.i5r
            @Override // p153l.y20
            public final void call(Object obj) {
                ((dn50) obj).m117045A0(str2, str3);
            }
        });
        m179925n1("playMusic:" + str2 + ",current status:" + this.f161379d);
        this.f161381f = str;
        if (vqn0.m202426g().m202438o(str2)) {
            str3 = vqn0.m202426g().m202435l(str2);
        }
        m179925n1("playMusic path:" + str3);
        m179928p1(str2, str3);
        if (vqn0.m202426g().m202437n(str2, str5)) {
            jyb.m147537z(this.f161377b, new y20() { // from class: l.j5r
                @Override // p153l.y20
                public final void call(Object obj) {
                    String str7 = str2;
                    dn50 dn50Var = (dn50) obj;
                    dn50Var.mo117051s(str7, vqn0.m202426g().m202433j(str7, str5), str6);
                }
            });
        } else {
            m179925n1("lrc download timeout");
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final long m179911f1(Long l2, String str, long j) {
        long jMo73063r;
        if (l2.longValue() % 10 == 0) {
            jMo73063r = this.f161380e.mo73063r();
            m179925n1("getSurroundMusicPos1:" + jMo73063r);
        } else if (this.f161385j < 0) {
            jMo73063r = this.f161380e.mo73063r();
        } else {
            long jM174454o = pzi0.m174454o() - this.f161386k;
            if (jM174454o > 100) {
                jMo73063r = this.f161380e.mo73063r();
                m179925n1("getSurroundMusicPos2:" + jMo73063r);
            } else {
                jMo73063r = jM174454o + this.f161385j;
            }
        }
        long j2 = jMo73063r;
        this.f161386k = pzi0.m174454o();
        this.f161385j = j2;
        if (j2 < 0) {
            mo179924n0("current position illegal");
            vqn0.m202426g().m202428d(str);
            return j2;
        }
        if (j2 >= j) {
            mo179924n0("check play complete");
            return j2;
        }
        m179933t1(str, j, j2);
        return j2;
    }

    /* JADX INFO: renamed from: g1 */
    public final void m179912g1() {
        m179925n1("initMusicEffect:");
        int i = this.f161383h;
        if (i > 0) {
            mo179913h(i);
        } else {
            mo179913h(MomoMediaConstants$MMLiveAudioEffectPreset.MMLiveAudioEffectPresetRoomAcousticsKTV.getValue());
        }
        mo179901H(Boolean.valueOf(this.f161382g));
    }

    @Override // p153l.xvl
    public int getStatus() {
        return this.f161379d;
    }

    @Override // p153l.xvl
    /* JADX INFO: renamed from: h */
    public void mo179913h(int i) {
        this.f161383h = i;
        m179925n1("setAudioEffectPreset result" + this.f161376a.mo107430a().mo73057h(i) + ",effectPreset:" + i);
    }

    @Override // p153l.xvl
    /* JADX INFO: renamed from: h0 */
    public boolean mo179914h0() {
        return this.f161384i;
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m179915h1(dn50 dn50Var) {
        dn50Var.mo117046B(this.f161381f);
    }

    @Override // p153l.xvl
    /* JADX INFO: renamed from: i */
    public float mo179916i() {
        return this.f161380e.mo73058i();
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m179917i1(dn50 dn50Var) {
        dn50Var.mo117046B(this.f161381f);
    }

    @Override // p153l.xvl
    public void init() {
        this.f161376a.mo107431b().mo161149b(this);
    }

    @Override // p153l.xvl
    /* JADX INFO: renamed from: j0 */
    public void mo179918j0(dn50 dn50Var) {
        if (this.f161377b.contains(dn50Var)) {
            return;
        }
        this.f161377b.add(dn50Var);
        m179925n1("registerPlayListener:" + dn50Var.getClass());
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m179919j1(Throwable th) {
        m179925n1("throwable:" + th.getMessage());
    }

    @Override // p153l.xvl
    /* JADX INFO: renamed from: k0 */
    public boolean mo179920k0() {
        return this.f161382g;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ Boolean m179921k1(Long l2) {
        return Boolean.valueOf(3 == this.f161379d);
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ Long m179922l1(String str, long j, Long l2) {
        return Long.valueOf(m179911f1(l2, str, j));
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m179923m1(String str, long j, Long l2) {
        m179926o1(zrv.f205799a.m207631D0(), str, j, l2.longValue());
    }

    @Override // p153l.xvl
    /* JADX INFO: renamed from: n0 */
    public void mo179924n0(String str) {
        m179925n1("stopMusic " + str);
        psd0.m173633z(this.f161378c);
        this.f161376a.mo107430a().stopSurroundMusic();
    }

    /* JADX INFO: renamed from: n1 */
    public final void m179925n1(String str) {
        nsh0.m164608j("[voice][ktv]", str + ",hashCode:" + hashCode());
    }

    /* JADX INFO: renamed from: o1 */
    public final long m179926o1(final String str, final String str2, final long j, final long j2) {
        jyb.m147537z(this.f161377b, new y20() { // from class: l.g5r
            @Override // p153l.y20
            public final void call(Object obj) {
                r5r.m179894a1(str, str2, j, j2, (dn50) obj);
            }
        });
        return j2;
    }

    @Override // p153l.xvl
    /* JADX INFO: renamed from: p0 */
    public void mo179927p0(final String str) {
        m179925n1("sendMusicProgress:" + str);
        psd0.m173633z(this.f161378c);
        final long jMo73052c = this.f161380e.mo73052c();
        this.f161378c = C22421c.interval(0L, 50L, TimeUnit.MILLISECONDS).onBackpressureLatest().filter(new qcj() { // from class: l.p5r
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f150671a.m179921k1((Long) obj);
            }
        }).map(new qcj() { // from class: l.c5r
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f79890a.m179922l1(str, jMo73052c, (Long) obj);
            }
        }).filter(new qcj() { // from class: l.d5r
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() >= 0);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.e5r
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92230a.m179923m1(str, jMo73052c, (Long) obj);
            }
        }, new y20() { // from class: l.f5r
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97334a.m179919j1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p1 */
    public final void m179928p1(final String str, final String str2) {
        m179925n1("onMusicResourceReady:" + str + ",filePath:" + str2);
        this.f161380e.mo73039E(str2, false);
        setStatus(2);
        jyb.m147537z(this.f161377b, new y20() { // from class: l.l5r
            @Override // p153l.y20
            public final void call(Object obj) {
                ((dn50) obj).m117050m0(str, str2);
            }
        });
    }

    @Override // p153l.xvl
    public void pause() {
        m179925n1("pause");
        this.f161376a.mo107430a().mo73059j();
        if (this.f161379d != 4) {
            setStatus(4);
            jyb.m147537z(this.f161377b, new b5r());
        }
    }

    @Override // p153l.xvl
    /* JADX INFO: renamed from: q0 */
    public void mo179929q0(String str, String str2, String str3, String str4) {
        m179925n1(" prepareLrcFile:" + str);
        vqn0.m202426g().m202432i(str, str2, str3, str4, new C19768a(str, str4));
    }

    /* JADX INFO: renamed from: q1 */
    public final void m179930q1(boolean z) {
        m179925n1("resetMusicEffect:");
        if (z) {
            this.f161376a.mo107430a().mo73057h(MomoMediaConstants$MMLiveAudioEffectPreset.MMLiveAudioEffectPresetOff.getValue());
        }
        this.f161376a.mo107430a().mo73042H(Boolean.FALSE);
        this.f161376a.mo107430a().mo73045Q0(1);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: r0 */
    public void mo120112r0(final int i) {
        super.mo120112r0(i);
        m179925n1("onSurroundMusicError:" + i);
        jyb.m147537z(this.f161377b, new y20() { // from class: l.m5r
            @Override // p153l.y20
            public final void call(Object obj) {
                ((dn50) obj).mo117047H0(i + "");
            }
        });
        setStatus(5);
    }

    /* JADX INFO: renamed from: r1 */
    public final void m179931r1() {
        this.f161385j = -1L;
        this.f161386k = -1L;
    }

    @Override // p153l.xvl
    public void resume() {
        m179925n1("resume");
        setStatus(3);
        this.f161376a.mo107430a().mo73062q();
        jyb.m147537z(this.f161377b, new y20() { // from class: l.h5r
            @Override // p153l.y20
            public final void call(Object obj) {
                ((dn50) obj).mo117044A();
            }
        });
    }

    /* JADX INFO: renamed from: s1 */
    public final void m179932s1() {
        setStatus(3);
        jyb.m147537z(this.f161377b, new y20() { // from class: l.k5r
            @Override // p153l.y20
            public final void call(Object obj) {
                ((dn50) obj).mo117052s0();
            }
        });
    }

    @Override // p153l.xvl
    public void setStatus(int i) {
        this.f161379d = i;
        m179925n1("set status:" + i);
    }

    /* JADX INFO: renamed from: t1 */
    public final long m179933t1(String str, long j, long j2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(qd80.f156666a, qd80.f156667b);
            jSONObject.put(qd80.f156669d, str);
            jSONObject.put(qd80.f156670e, j);
            jSONObject.put(qd80.f156668c, j2);
            jSONObject.put(qd80.f156671f, pzi0.m174454o());
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        this.f161376a.mo107430a().mo73037D(jSONObject.toString().getBytes());
        return j2;
    }

    @Override // p153l.xvl
    /* JADX INFO: renamed from: w */
    public long mo179934w() {
        return this.f161380e.mo73063r();
    }
}
