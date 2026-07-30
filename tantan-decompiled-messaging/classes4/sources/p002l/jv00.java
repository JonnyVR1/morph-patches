package p002l;

import android.content.Context;
import android.os.SystemClock;
import android.view.Surface;
import android.widget.FrameLayout;
import com.google.gson.Gson;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p1.mobile.putong.live.base.mmsdk.player.TTLivePlayer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import l.beu;
import l.bul;
import l.cul;
import l.e30;
import l.e51;
import l.ffw;
import l.gkh0;
import l.h30;
import l.iph0;
import l.rwb;
import l.u0t;
import l.v9j;
import l.vwb;
import l.w8u;
import l.w9j;
import l.ypv;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.ijk.media.player.PullWatchInfo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jv00 implements cul {

    /* JADX INFO: renamed from: c */
    public Context f14031c;

    /* JADX INFO: renamed from: d */
    public TTLivePlayer f14032d;

    /* JADX INFO: renamed from: f */
    public boolean f14034f;

    /* JADX INFO: renamed from: i */
    public boolean f14037i;

    /* JADX INFO: renamed from: j */
    public boolean f14038j;

    /* JADX INFO: renamed from: m */
    public String f14041m;

    /* JADX INFO: renamed from: n */
    public long f14042n;

    /* JADX INFO: renamed from: p */
    public int f14044p;

    /* JADX INFO: renamed from: a */
    public BLiveCallVolume f14029a = BLiveCallVolume.new_();

    /* JADX INFO: renamed from: e */
    public List<bul> f14033e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: g */
    public boolean f14035g = false;

    /* JADX INFO: renamed from: k */
    public int f14039k = 0;

    /* JADX INFO: renamed from: l */
    public rwb f14040l = new rwb(-1, -1, 0.0f);

    /* JADX INFO: renamed from: b */
    public final Gson f14030b = new Gson();

    /* JADX INFO: renamed from: o */
    public final ew00 f14043o = new ew00();

    /* JADX INFO: renamed from: h */
    public iph0 f14036h = new C0639a();

    /* JADX INFO: renamed from: l.jv00$a */
    public class C0639a extends iph0 {
        public C0639a() {
        }

        /* JADX INFO: renamed from: a */
        public void m16331a() {
            super.a();
            if (!vwb.J(jv00.this.f14033e)) {
                vwb.z(jv00.this.f14033e, new e30() { // from class: l.hv00
                    public final void call(Object obj) {
                        ((bul) obj).f2();
                    }
                });
            }
            jv00.this.m16318d0("onBufferingEnd");
        }

        /* JADX INFO: renamed from: b */
        public void m16332b() {
            super.b();
            if (!vwb.J(jv00.this.f14033e)) {
                vwb.z(jv00.this.f14033e, new e30() { // from class: l.ev00
                    public final void call(Object obj) {
                        ((bul) obj).O();
                    }
                });
            }
            jv00.this.m16318d0("onBufferingStart");
        }

        /* JADX INFO: renamed from: c */
        public void m16333c() {
            super.c();
            boolean z = jv00.this.f14034f;
            jv00 jv00Var = jv00.this;
            if (!z) {
                jv00Var.m16324g0(0);
                gkh0.j(u0t.c, w8u.m("onPlayError in onCompletion"));
            } else {
                if (!vwb.J(jv00Var.f14033e)) {
                    vwb.z(jv00.this.f14033e, new e30() { // from class: l.fv00
                        public final void call(Object obj) {
                            ((bul) obj).F1();
                        }
                    });
                }
                jv00.this.m16318d0("onCompletion");
            }
        }

        /* JADX INFO: renamed from: d */
        public void m16334d(int i) {
            jv00.this.m16324g0(i);
            jv00.this.m16318d0("onError, what:" + i);
        }

        /* JADX INFO: renamed from: e */
        public void m16335e() {
            super.e();
            if (!vwb.J(jv00.this.f14033e)) {
                vwb.z(jv00.this.f14033e, new e30() { // from class: l.gv00
                    public final void call(Object obj) {
                        ((bul) obj).D0();
                    }
                });
            }
            jv00.this.m16318d0("onFirstFrameRendering");
        }

        /* JADX INFO: renamed from: f */
        public void m16336f() {
            super.f();
            if (!vwb.J(jv00.this.f14033e)) {
                vwb.z(jv00.this.f14033e, new e30() { // from class: l.dv00
                    public final void call(Object obj) {
                        ((bul) obj).u1();
                    }
                });
            }
            jv00.this.m16318d0("onPrepared");
        }

        /* JADX INFO: renamed from: g */
        public void m16337g(MMLiveTranscoding mMLiveTranscoding) {
            super.g(mMLiveTranscoding);
            jv00.this.m16299O(mMLiveTranscoding);
            jv00.this.m16298N(mMLiveTranscoding);
            jv00.this.m16300P(mMLiveTranscoding);
        }

        /* JADX INFO: renamed from: h */
        public void m16338h(int i, int i2) {
            super.h(i, i2);
            jv00.this.m16318d0("onVideoSizeChanged, videoWidth = " + i + ", videoHeight = " + i2);
            jv00.this.f14043o.m12747z(i, i2);
            if (!vwb.J(jv00.this.f14033e) && i2 != 0 && i != 0) {
                final float f = i / i2;
                vwb.z(jv00.this.f14033e, new e30() { // from class: l.iv00
                    public final void call(Object obj) {
                        ((bul) obj).R1(f);
                    }
                });
            }
            jv00.this.f14043o.m12745x(true);
        }
    }

    public jv00(Context context) {
        this.f14031c = context;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m16272B(TTLivePlayer tTLivePlayer) {
        tTLivePlayer.release();
        gkh0.j(u0t.c, "release player LiveEngine：" + tTLivePlayer.hashCode());
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m16274D(String str, String str2, BLiveAbsData bLiveAbsData, Boolean bool, Integer num, Integer num2, Integer num3) {
        BLiveAbsData bLiveAbsData2;
        String str3 = "errorType_videoSizeError_" + num + "_w" + num2 + "_h" + num3;
        if (bool.booleanValue()) {
            bLiveAbsData2 = bLiveAbsData;
        } else {
            bLiveAbsData2 = bLiveAbsData;
            eet.m12447a(str3, false, str, str2, bLiveAbsData2, null);
            LivingNormalApiProvider.m4796c7(bLiveAbsData2.id, bLiveAbsData2.room.id, bLiveAbsData2.anchor.id, "videoSizeError", "ctyp=" + num + ",w=" + num2 + ",h=" + num3).subscribe(ffw.c());
        }
        gkh0.j(u0t.c, "liveId" + bLiveAbsData2.id + "StreamCheckError:" + bool + " detail:" + str3);
    }

    /* JADX INFO: renamed from: L */
    public final void m16296L(@NotNull String str, String str2, String str3) {
        if (this.f14032d != null) {
            return;
        }
        beu beuVar = new beu();
        beuVar.a = ypv.k().O4();
        beuVar.e = str3;
        beuVar.d = str2;
        beuVar.c = str;
        beuVar.b = w8u.y(ypv.a.V());
        beuVar.f = ypv.a.p().e5();
        this.f14032d = new TTLivePlayer(this.f14031c, beuVar, TTLivePlayer.PlayerType.NEW_MOMO);
    }

    /* JADX INFO: renamed from: M */
    public rwb m16297M() {
        return this.f14040l;
    }

    /* JADX INFO: renamed from: N */
    public final void m16298N(MMLiveTranscoding mMLiveTranscoding) {
        BLiveCallVolume bLiveCallVolume = (BLiveCallVolume) this.f14030b.fromJson(mMLiveTranscoding.extString, BLiveCallVolume.class);
        final int i = mMLiveTranscoding.ctyp;
        int i2 = this.f14040l.a;
        if (i != i2) {
            this.f14040l = new rwb(i, i2, mMLiveTranscoding.ts, bLiveCallVolume == null ? 0 : bLiveCallVolume.mode);
            gkh0.j("LivePkConstant", "in player new ctyp = " + this.f14040l.a);
            e51.M(new Runnable() { // from class: l.ou00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16790a.m16303S(i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m16299O(MMLiveTranscoding mMLiveTranscoding) {
        BLiveCallVolume bLiveCallVolume = (BLiveCallVolume) this.f14030b.fromJson(mMLiveTranscoding.extString, BLiveCallVolume.class);
        if (bLiveCallVolume != null) {
            int i = this.f14044p;
            int i2 = bLiveCallVolume.mode;
            if (i != i2) {
                this.f14044p = i2;
                e51.M(new Runnable() { // from class: l.zu00
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f23588a.m16306V();
                    }
                });
            }
        }
        if (bLiveCallVolume == null) {
            final BLiveCallVolume bLiveCallVolume2 = new BLiveCallVolume();
            vwb.z(mMLiveTranscoding.infoMembers, new e30() { // from class: l.av00
                public final void call(Object obj) {
                    MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember = (MMLiveTranscoding.MMLiveLinkMember) obj;
                    bLiveCallVolume2.volumes.put(mMLiveLinkMember.userid, Float.valueOf(mMLiveLinkMember.volume));
                }
            });
            if (bLiveCallVolume2.volumes.size() > 0) {
                bLiveCallVolume = bLiveCallVolume2;
            }
        }
        if (bLiveCallVolume == null) {
            return;
        }
        vwb.z(bLiveCallVolume.volumes.entrySet(), new e30() { // from class: l.bv00
            public final void call(Object obj) {
                this.f8367a.m16307W((Map.Entry) obj);
            }
        });
        if (SystemClock.elapsedRealtime() - this.f14042n > 1000) {
            this.f14042n = SystemClock.elapsedRealtime();
            e51.M(new Runnable() { // from class: l.cv00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8948a.m16304T();
                }
            });
        }
    }

    /* JADX INFO: renamed from: P */
    public void m16300P(MMLiveTranscoding mMLiveTranscoding) {
        Collection arrayList = mMLiveTranscoding.infoMembers;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        final ArrayList arrayListQ = vwb.Q(arrayList, new w9j() { // from class: l.mu00
            public final Object call(Object obj) {
                return ((MMLiveTranscoding.MMLiveLinkMember) obj).userid;
            }
        });
        e51.M(new Runnable() { // from class: l.nu00
            @Override // java.lang.Runnable
            public final void run() {
                this.f16194a.m16309Y(arrayListQ);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final void m16301Q() {
        this.f14043o.m12735n(this.f14031c, new v9j() { // from class: l.lu00
            public final Object call() {
                return this.f15066a.m16310Z();
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m16302R(bul bulVar) {
        bulVar.c0(this.f14040l);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m16303S(int i) {
        this.f14043o.m12741t(i);
        this.f14043o.m12745x(true);
        if (vwb.J(this.f14033e)) {
            return;
        }
        vwb.z(this.f14033e, new e30() { // from class: l.ru00
            public final void call(Object obj) {
                this.f18680a.m16302R((bul) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m16304T() {
        if (!vwb.J(this.f14033e)) {
            vwb.z(this.f14033e, new e30() { // from class: l.qu00
                public final void call(Object obj) {
                    this.f18224a.m16308X((bul) obj);
                }
            });
        }
        this.f14029a.volumes.clear();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m16305U(bul bulVar) {
        bulVar.p1(this.f14044p);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m16306V() {
        if (vwb.J(this.f14033e)) {
            return;
        }
        vwb.z(this.f14033e, new e30() { // from class: l.pu00
            public final void call(Object obj) {
                this.f17649a.m16305U((bul) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m16307W(Map.Entry entry) {
        this.f14029a.volumes.put((String) entry.getKey(), (Float) entry.getValue());
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m16308X(bul bulVar) {
        bulVar.O0(this.f14029a);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m16309Y(final ArrayList arrayList) {
        if (vwb.J(this.f14033e)) {
            return;
        }
        vwb.z(this.f14033e, new e30() { // from class: l.tu00
            public final void call(Object obj) {
                ((bul) obj).s1(arrayList);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ TTLivePlayer m16310Z() {
        return this.f14032d;
    }

    /* JADX INFO: renamed from: a */
    public PullWatchInfo m16311a() {
        TTLivePlayer tTLivePlayer = this.f14032d;
        if (tTLivePlayer == null) {
            return null;
        }
        return tTLivePlayer.a();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ TTLivePlayer m16312a0() {
        return this.f14032d;
    }

    /* JADX INFO: renamed from: b */
    public void m16313b(boolean z) {
        m16318d0("live player stop. hasStartPlay:" + this.f14038j + " hasStartPlayCount:" + this.f14039k + ", MomoLivePlayerNewVersionImpl hashCode:" + hashCode());
        this.f14041m = null;
        this.f14034f = true;
        if (z && this.f14043o.m12734m()) {
            TTLivePlayer tTLivePlayer = this.f14032d;
            if (tTLivePlayer != null) {
                tTLivePlayer.d((Surface) null);
            }
            this.f14043o.m12730i();
        }
        TTLivePlayer tTLivePlayer2 = this.f14032d;
        if (tTLivePlayer2 == null) {
            return;
        }
        if (this.f14038j) {
            this.f14039k--;
            tTLivePlayer2.e(true);
            this.f14032d.c((iph0) null);
            final TTLivePlayer tTLivePlayer3 = this.f14032d;
            e51.y(new Runnable() { // from class: l.uu00
                @Override // java.lang.Runnable
                public final void run() {
                    jv00.m16272B(tTLivePlayer3);
                }
            });
            this.f14032d = null;
        }
        this.f14038j = false;
        this.f14043o.m12732k();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m16314b0(bul bulVar) {
        bulVar.c0(this.f14040l);
    }

    /* JADX INFO: renamed from: c */
    public void mo16315c(bul bulVar) {
        this.f14033e.add(bulVar);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m16316c0(final int i) {
        if (!vwb.J(this.f14033e)) {
            m16313b(false);
            vwb.z(this.f14033e, new e30() { // from class: l.su00
                public final void call(Object obj) {
                    ((bul) obj).l0(i);
                }
            });
        }
        this.f14035g = false;
    }

    /* JADX INFO: renamed from: d */
    public void m16317d(FrameLayout frameLayout) {
        this.f14043o.m12738q(this.f14031c, frameLayout, new v9j() { // from class: l.xu00
            public final Object call() {
                return this.f22460a.m16312a0();
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final void m16318d0(String str) {
        gkh0.j(u0t.c, w8u.m(str));
    }

    /* JADX INFO: renamed from: e */
    public boolean m16319e() {
        return this.f14038j;
    }

    /* JADX INFO: renamed from: e0 */
    public void m16320e0() {
        this.f14040l = new rwb(-1, -1, 0.0f);
    }

    /* JADX INFO: renamed from: f */
    public void m16321f(FrameLayout frameLayout) {
        this.f14043o.m12743v(frameLayout);
    }

    /* JADX INFO: renamed from: f0 */
    public void m16322f0(rwb rwbVar) {
        this.f14040l = rwbVar;
    }

    /* JADX INFO: renamed from: g */
    public void m16323g(boolean z) {
        this.f14043o.m12742u(z);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m16324g0(final int i) {
        if (this.f14035g) {
            return;
        }
        this.f14035g = true;
        e51.H(this.f14031c, new Runnable() { // from class: l.wu00
            @Override // java.lang.Runnable
            public final void run() {
                this.f21977a.m16316c0(i);
            }
        }, 5000L);
    }

    /* JADX INFO: renamed from: h */
    public void m16325h(bul bulVar) {
        if (bulVar != null) {
            this.f14033e.remove(bulVar);
        }
    }

    /* JADX INFO: renamed from: i */
    public String m16326i() {
        return this.f14041m;
    }

    public boolean isPlaying() {
        TTLivePlayer tTLivePlayer = this.f14032d;
        return tTLivePlayer != null && tTLivePlayer.isPlaying();
    }

    /* JADX INFO: renamed from: j */
    public void mo16327j(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5) {
        this.f14041m = str;
        this.f14034f = false;
        m16296L(str3, str4, str5);
        m16301Q();
        this.f14040l = new rwb(-1, -1, 0.0f);
        this.f14032d.c(this.f14036h);
        this.f14032d.b(str, str2);
        this.f14032d.setMute(this.f14037i);
        this.f14038j = true;
        this.f14039k++;
        m16318d0("start player:" + str + " ipv6: " + str2 + ",LiveEngine hashCode:" + this.f14032d.hashCode());
    }

    /* JADX INFO: renamed from: k */
    public float m16328k() {
        return this.f14043o.m12733l();
    }

    /* JADX INFO: renamed from: l */
    public void m16329l(final String str, final String str2, final BLiveAbsData bLiveAbsData) {
        this.f14043o.m12744w(new h30() { // from class: l.vu00
            /* JADX INFO: renamed from: b */
            public final void m24158b(Object obj, Object obj2, Object obj3, Object obj4) {
                jv00.m16274D(str, str2, bLiveAbsData, (Boolean) obj, (Integer) obj2, (Integer) obj3, (Integer) obj4);
            }
        });
    }

    public void reset() {
        m16318d0("reset，MomoLivePlayerNewVersionImpl hashCode:" + hashCode());
        this.f14037i = false;
        this.f14034f = false;
        this.f14035g = false;
        this.f14040l = new rwb(-1, -1, 0.0f);
        if (!vwb.J(this.f14033e)) {
            vwb.z(this.f14033e, new e30() { // from class: l.yu00
                public final void call(Object obj) {
                    this.f23100a.m16314b0((bul) obj);
                }
            });
        }
        this.f14033e.clear();
        this.f14043o.m12739r();
    }

    public void setMute(boolean z) {
        gkh0.j(u0t.c, "setMute:old:" + this.f14037i + " setMute:" + z + ",MomoLivePlayerNewVersionImpl hashCode:" + hashCode());
        this.f14037i = z;
        TTLivePlayer tTLivePlayer = this.f14032d;
        if (tTLivePlayer != null) {
            tTLivePlayer.setMute(z);
        }
    }
}
