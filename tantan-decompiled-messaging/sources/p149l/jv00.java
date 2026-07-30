package p149l;

import android.content.Context;
import android.os.SystemClock;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.google.gson.Gson;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p046p1.mobile.putong.live.base.mmsdk.player.TTLivePlayer;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.ijk.media.player.PullWatchInfo;

/* JADX INFO: loaded from: classes4.dex */
public class jv00 implements cul {

    /* JADX INFO: renamed from: c */
    public Context f119833c;

    /* JADX INFO: renamed from: d */
    public TTLivePlayer f119834d;

    /* JADX INFO: renamed from: f */
    public boolean f119836f;

    /* JADX INFO: renamed from: i */
    public boolean f119839i;

    /* JADX INFO: renamed from: j */
    public boolean f119840j;

    /* JADX INFO: renamed from: m */
    public String f119843m;

    /* JADX INFO: renamed from: n */
    public long f119844n;

    /* JADX INFO: renamed from: p */
    public int f119846p;

    /* JADX INFO: renamed from: a */
    public BLiveCallVolume f119831a = BLiveCallVolume.new_();

    /* JADX INFO: renamed from: e */
    public List<bul> f119835e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: g */
    public boolean f119837g = false;

    /* JADX INFO: renamed from: k */
    public int f119841k = 0;

    /* JADX INFO: renamed from: l */
    public rwb f119842l = new rwb(-1, -1, 0.0f);

    /* JADX INFO: renamed from: b */
    public final Gson f119832b = new Gson();

    /* JADX INFO: renamed from: o */
    public final ew00 f119845o = new ew00();

    /* JADX INFO: renamed from: h */
    public iph0 f119838h = new C17868a();

    /* JADX INFO: renamed from: l.jv00$a */
    public class C17868a extends iph0 {
        public C17868a() {
        }

        @Override // p149l.iph0
        /* JADX INFO: renamed from: a */
        public void mo137475a() {
            super.mo137475a();
            if (!vwb.m200296J(jv00.this.f119835e)) {
                vwb.m200354z(jv00.this.f119835e, new e30() { // from class: l.hv00
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ((bul) obj).mo103939f2();
                    }
                });
            }
            jv00.this.m143390d0("onBufferingEnd");
        }

        @Override // p149l.iph0
        /* JADX INFO: renamed from: b */
        public void mo137476b() {
            super.mo137476b();
            if (!vwb.m200296J(jv00.this.f119835e)) {
                vwb.m200354z(jv00.this.f119835e, new e30() { // from class: l.ev00
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ((bul) obj).mo103935O();
                    }
                });
            }
            jv00.this.m143390d0("onBufferingStart");
        }

        @Override // p149l.iph0
        /* JADX INFO: renamed from: c */
        public void mo137477c() {
            super.mo137477c();
            boolean z = jv00.this.f119836f;
            jv00 jv00Var = jv00.this;
            if (!z) {
                jv00Var.m143393g0(0);
                gkh0.m126627j(u0t.f172944c, w8u.m202210m("onPlayError in onCompletion"));
            } else {
                if (!vwb.m200296J(jv00Var.f119835e)) {
                    vwb.m200354z(jv00.this.f119835e, new e30() { // from class: l.fv00
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            ((bul) obj).mo103934F1();
                        }
                    });
                }
                jv00.this.m143390d0("onCompletion");
            }
        }

        @Override // p149l.iph0
        /* JADX INFO: renamed from: d */
        public void mo137478d(int i) {
            jv00.this.m143393g0(i);
            jv00.this.m143390d0("onError, what:" + i);
        }

        @Override // p149l.iph0
        /* JADX INFO: renamed from: e */
        public void mo137479e() {
            super.mo137479e();
            if (!vwb.m200296J(jv00.this.f119835e)) {
                vwb.m200354z(jv00.this.f119835e, new e30() { // from class: l.gv00
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ((bul) obj).mo103933D0();
                    }
                });
            }
            jv00.this.m143390d0("onFirstFrameRendering");
        }

        @Override // p149l.iph0
        /* JADX INFO: renamed from: f */
        public void mo137480f() {
            super.mo137480f();
            if (!vwb.m200296J(jv00.this.f119835e)) {
                vwb.m200354z(jv00.this.f119835e, new e30() { // from class: l.dv00
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ((bul) obj).mo103945u1();
                    }
                });
            }
            jv00.this.m143390d0("onPrepared");
        }

        @Override // p149l.iph0
        /* JADX INFO: renamed from: g */
        public void mo137481g(MMLiveTranscoding mMLiveTranscoding) {
            super.mo137481g(mMLiveTranscoding);
            jv00.this.m143375O(mMLiveTranscoding);
            jv00.this.m143374N(mMLiveTranscoding);
            jv00.this.m143376P(mMLiveTranscoding);
        }

        @Override // p149l.iph0
        /* JADX INFO: renamed from: h */
        public void mo137482h(int i, int i2) {
            super.mo137482h(i, i2);
            jv00.this.m143390d0("onVideoSizeChanged, videoWidth = " + i + ", videoHeight = " + i2);
            jv00.this.f119845o.m118363z(i, i2);
            if (!vwb.m200296J(jv00.this.f119835e) && i2 != 0 && i != 0) {
                final float f = i / i2;
                vwb.m200354z(jv00.this.f119835e, new e30() { // from class: l.iv00
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ((bul) obj).mo103937R1(f);
                    }
                });
            }
            jv00.this.f119845o.m118361x(true);
        }
    }

    public jv00(Context context) {
        this.f119833c = context;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m143348B(TTLivePlayer tTLivePlayer) {
        tTLivePlayer.release();
        gkh0.m126627j(u0t.f172944c, "release player LiveEngine：" + tTLivePlayer.hashCode());
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m143350D(String str, String str2, BLiveAbsData bLiveAbsData, Boolean bool, Integer num, Integer num2, Integer num3) {
        BLiveAbsData bLiveAbsData2;
        String str3 = "errorType_videoSizeError_" + num + "_w" + num2 + "_h" + num3;
        if (bool.booleanValue()) {
            bLiveAbsData2 = bLiveAbsData;
        } else {
            bLiveAbsData2 = bLiveAbsData;
            eet.m116002a(str3, false, str, str2, bLiveAbsData2, null);
            LivingNormalApiProvider.m71430c7(bLiveAbsData2.f44323id, bLiveAbsData2.room.f44419id, bLiveAbsData2.anchor.f44419id, "videoSizeError", "ctyp=" + num + ",w=" + num2 + ",h=" + num3).subscribe(ffw.m121192c());
        }
        gkh0.m126627j(u0t.f172944c, "liveId" + bLiveAbsData2.f44323id + "StreamCheckError:" + bool + " detail:" + str3);
    }

    /* JADX INFO: renamed from: L */
    public final void m143372L(@NotNull String str, String str2, String str3) {
        if (this.f119834d != null) {
            return;
        }
        beu beuVar = new beu();
        beuVar.f75241a = ypv.m215672k().m195696O4();
        beuVar.f75245e = str3;
        beuVar.f75244d = str2;
        beuVar.f75243c = str;
        beuVar.f75242b = w8u.m202222y(ypv.f199493a.m199329V());
        beuVar.f75246f = ypv.f199493a.m199364p().m195824e5();
        this.f119834d = new TTLivePlayer(this.f119833c, beuVar, TTLivePlayer.PlayerType.NEW_MOMO);
    }

    /* JADX INFO: renamed from: M */
    public rwb m143373M() {
        return this.f119842l;
    }

    /* JADX INFO: renamed from: N */
    public final void m143374N(MMLiveTranscoding mMLiveTranscoding) {
        BLiveCallVolume bLiveCallVolume = (BLiveCallVolume) this.f119832b.fromJson(mMLiveTranscoding.extString, BLiveCallVolume.class);
        final int i = mMLiveTranscoding.ctyp;
        int i2 = this.f119842l.f161324a;
        if (i != i2) {
            this.f119842l = new rwb(i, i2, mMLiveTranscoding.f13955ts, bLiveCallVolume == null ? 0 : bLiveCallVolume.mode);
            gkh0.m126627j("LivePkConstant", "in player new ctyp = " + this.f119842l.f161324a);
            e51.m114748M(new Runnable() { // from class: l.ou00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f145648a.m143379S(i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m143375O(MMLiveTranscoding mMLiveTranscoding) {
        BLiveCallVolume bLiveCallVolume = (BLiveCallVolume) this.f119832b.fromJson(mMLiveTranscoding.extString, BLiveCallVolume.class);
        if (bLiveCallVolume != null) {
            int i = this.f119846p;
            int i2 = bLiveCallVolume.mode;
            if (i != i2) {
                this.f119846p = i2;
                e51.m114748M(new Runnable() { // from class: l.zu00
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f204807a.m143382V();
                    }
                });
            }
        }
        if (bLiveCallVolume == null) {
            final BLiveCallVolume bLiveCallVolume2 = new BLiveCallVolume();
            vwb.m200354z(mMLiveTranscoding.infoMembers, new e30() { // from class: l.av00
                @Override // p149l.e30
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
        vwb.m200354z(bLiveCallVolume.volumes.entrySet(), new e30() { // from class: l.bv00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77388a.m143383W((Map.Entry) obj);
            }
        });
        if (SystemClock.elapsedRealtime() - this.f119844n > 1000) {
            this.f119844n = SystemClock.elapsedRealtime();
            e51.m114748M(new Runnable() { // from class: l.cv00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f82629a.m143380T();
                }
            });
        }
    }

    /* JADX INFO: renamed from: P */
    public void m143376P(MMLiveTranscoding mMLiveTranscoding) {
        Collection arrayList = mMLiveTranscoding.infoMembers;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        final ArrayList arrayListM200303Q = vwb.m200303Q(arrayList, new w9j() { // from class: l.mu00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((MMLiveTranscoding.MMLiveLinkMember) obj).userid;
            }
        });
        e51.m114748M(new Runnable() { // from class: l.nu00
            @Override // java.lang.Runnable
            public final void run() {
                this.f140559a.m143385Y(arrayListM200303Q);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final void m143377Q() {
        this.f119845o.m118351n(this.f119833c, new v9j() { // from class: l.lu00
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f130026a.m143386Z();
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m143378R(bul bulVar) {
        bulVar.mo103938c0(this.f119842l);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m143379S(int i) {
        this.f119845o.m118357t(i);
        this.f119845o.m118361x(true);
        if (vwb.m200296J(this.f119835e)) {
            return;
        }
        vwb.m200354z(this.f119835e, new e30() { // from class: l.ru00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161014a.m143378R((bul) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m143380T() {
        if (!vwb.m200296J(this.f119835e)) {
            vwb.m200354z(this.f119835e, new e30() { // from class: l.qu00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f156413a.m143384X((bul) obj);
                }
            });
        }
        this.f119831a.volumes.clear();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m143381U(bul bulVar) {
        bulVar.mo103942p1(this.f119846p);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m143382V() {
        if (vwb.m200296J(this.f119835e)) {
            return;
        }
        vwb.m200354z(this.f119835e, new e30() { // from class: l.pu00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151238a.m143381U((bul) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m143383W(Map.Entry entry) {
        this.f119831a.volumes.put((String) entry.getKey(), (Float) entry.getValue());
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m143384X(bul bulVar) {
        bulVar.mo103936O0(this.f119831a);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m143385Y(final ArrayList arrayList) {
        if (vwb.m200296J(this.f119835e)) {
            return;
        }
        vwb.m200354z(this.f119835e, new e30() { // from class: l.tu00
            @Override // p149l.e30
            public final void call(Object obj) {
                ((bul) obj).mo103944s1(arrayList);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ TTLivePlayer m143386Z() {
        return this.f119834d;
    }

    @Override // p149l.cul
    /* JADX INFO: renamed from: a */
    public PullWatchInfo mo108789a() {
        TTLivePlayer tTLivePlayer = this.f119834d;
        if (tTLivePlayer == null) {
            return null;
        }
        return tTLivePlayer.mo68515a();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ TTLivePlayer m143387a0() {
        return this.f119834d;
    }

    @Override // p149l.cul
    /* JADX INFO: renamed from: b */
    public void mo108790b(boolean z) {
        m143390d0("live player stop. hasStartPlay:" + this.f119840j + " hasStartPlayCount:" + this.f119841k + ", MomoLivePlayerNewVersionImpl hashCode:" + hashCode());
        this.f119843m = null;
        this.f119836f = true;
        if (z && this.f119845o.m118350m()) {
            TTLivePlayer tTLivePlayer = this.f119834d;
            if (tTLivePlayer != null) {
                tTLivePlayer.mo68518d(null);
            }
            this.f119845o.m118346i();
        }
        TTLivePlayer tTLivePlayer2 = this.f119834d;
        if (tTLivePlayer2 == null) {
            return;
        }
        if (this.f119840j) {
            this.f119841k--;
            tTLivePlayer2.mo68519e(true);
            this.f119834d.mo68517c(null);
            final TTLivePlayer tTLivePlayer3 = this.f119834d;
            e51.m114774y(new Runnable() { // from class: l.uu00
                @Override // java.lang.Runnable
                public final void run() {
                    jv00.m143348B(tTLivePlayer3);
                }
            });
            this.f119834d = null;
        }
        this.f119840j = false;
        this.f119845o.m118348k();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m143388b0(bul bulVar) {
        bulVar.mo103938c0(this.f119842l);
    }

    @Override // p149l.cul
    /* JADX INFO: renamed from: c */
    public void mo108791c(bul bulVar) {
        this.f119835e.add(bulVar);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m143389c0(final int i) {
        if (!vwb.m200296J(this.f119835e)) {
            mo108790b(false);
            vwb.m200354z(this.f119835e, new e30() { // from class: l.su00
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((bul) obj).mo103940l0(i);
                }
            });
        }
        this.f119837g = false;
    }

    @Override // p149l.cul
    /* JADX INFO: renamed from: d */
    public void mo108792d(FrameLayout frameLayout) {
        this.f119845o.m118354q(this.f119833c, frameLayout, new v9j() { // from class: l.xu00
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f194460a.m143387a0();
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final void m143390d0(String str) {
        gkh0.m126627j(u0t.f172944c, w8u.m202210m(str));
    }

    @Override // p149l.cul
    /* JADX INFO: renamed from: e */
    public boolean mo108793e() {
        return this.f119840j;
    }

    /* JADX INFO: renamed from: e0 */
    public void m143391e0() {
        this.f119842l = new rwb(-1, -1, 0.0f);
    }

    @Override // p149l.cul
    /* JADX INFO: renamed from: f */
    public void mo108794f(FrameLayout frameLayout) {
        this.f119845o.m118359v(frameLayout);
    }

    /* JADX INFO: renamed from: f0 */
    public void m143392f0(rwb rwbVar) {
        this.f119842l = rwbVar;
    }

    @Override // p149l.cul
    /* JADX INFO: renamed from: g */
    public void mo108795g(boolean z) {
        this.f119845o.m118358u(z);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m143393g0(final int i) {
        if (this.f119837g) {
            return;
        }
        this.f119837g = true;
        e51.m114743H(this.f119833c, new Runnable() { // from class: l.wu00
            @Override // java.lang.Runnable
            public final void run() {
                this.f188071a.m143389c0(i);
            }
        }, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }

    @Override // p149l.cul
    /* JADX INFO: renamed from: h */
    public void mo108796h(bul bulVar) {
        if (bulVar != null) {
            this.f119835e.remove(bulVar);
        }
    }

    @Override // p149l.cul
    /* JADX INFO: renamed from: i */
    public String mo108797i() {
        return this.f119843m;
    }

    @Override // p149l.cul
    public boolean isPlaying() {
        TTLivePlayer tTLivePlayer = this.f119834d;
        return tTLivePlayer != null && tTLivePlayer.isPlaying();
    }

    @Override // p149l.cul
    /* JADX INFO: renamed from: j */
    public void mo108798j(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5) {
        this.f119843m = str;
        this.f119836f = false;
        m143372L(str3, str4, str5);
        m143377Q();
        this.f119842l = new rwb(-1, -1, 0.0f);
        this.f119834d.mo68517c(this.f119838h);
        this.f119834d.mo68516b(str, str2);
        this.f119834d.setMute(this.f119839i);
        this.f119840j = true;
        this.f119841k++;
        m143390d0("start player:" + str + " ipv6: " + str2 + ",LiveEngine hashCode:" + this.f119834d.hashCode());
    }

    @Override // p149l.cul
    /* JADX INFO: renamed from: k */
    public float mo108799k() {
        return this.f119845o.m118349l();
    }

    @Override // p149l.cul
    /* JADX INFO: renamed from: l */
    public void mo108800l(final String str, final String str2, final BLiveAbsData bLiveAbsData) {
        this.f119845o.m118360w(new h30() { // from class: l.vu00
            @Override // p149l.h30
            /* JADX INFO: renamed from: b */
            public final void mo105798b(Object obj, Object obj2, Object obj3, Object obj4) {
                jv00.m143350D(str, str2, bLiveAbsData, (Boolean) obj, (Integer) obj2, (Integer) obj3, (Integer) obj4);
            }
        });
    }

    @Override // p149l.cul
    public void reset() {
        m143390d0("reset，MomoLivePlayerNewVersionImpl hashCode:" + hashCode());
        this.f119839i = false;
        this.f119836f = false;
        this.f119837g = false;
        this.f119842l = new rwb(-1, -1, 0.0f);
        if (!vwb.m200296J(this.f119835e)) {
            vwb.m200354z(this.f119835e, new e30() { // from class: l.yu00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f200038a.m143388b0((bul) obj);
                }
            });
        }
        this.f119835e.clear();
        this.f119845o.m118355r();
    }

    @Override // p149l.cul
    public void setMute(boolean z) {
        gkh0.m126627j(u0t.f172944c, "setMute:old:" + this.f119839i + " setMute:" + z + ",MomoLivePlayerNewVersionImpl hashCode:" + hashCode());
        this.f119839i = z;
        TTLivePlayer tTLivePlayer = this.f119834d;
        if (tTLivePlayer != null) {
            tTLivePlayer.setMute(z);
        }
    }
}
