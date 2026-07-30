package p153l;

import android.content.Context;
import android.os.SystemClock;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.google.gson.Gson;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p051p1.mobile.putong.live.base.mmsdk.player.TTLivePlayer;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.ijk.media.player.PullWatchInfo;

/* JADX INFO: loaded from: classes4.dex */
public class s310 implements qwl {

    /* JADX INFO: renamed from: c */
    public Context f165956c;

    /* JADX INFO: renamed from: d */
    public TTLivePlayer f165957d;

    /* JADX INFO: renamed from: f */
    public boolean f165959f;

    /* JADX INFO: renamed from: i */
    public boolean f165962i;

    /* JADX INFO: renamed from: j */
    public boolean f165963j;

    /* JADX INFO: renamed from: m */
    public String f165966m;

    /* JADX INFO: renamed from: n */
    public long f165967n;

    /* JADX INFO: renamed from: p */
    public int f165969p;

    /* JADX INFO: renamed from: a */
    public BLiveCallVolume f165954a = BLiveCallVolume.new_();

    /* JADX INFO: renamed from: e */
    public List<pwl> f165958e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: g */
    public boolean f165960g = false;

    /* JADX INFO: renamed from: k */
    public int f165964k = 0;

    /* JADX INFO: renamed from: l */
    public fyb f165965l = new fyb(-1, -1, 0.0f);

    /* JADX INFO: renamed from: b */
    public final Gson f165955b = new Gson();

    /* JADX INFO: renamed from: o */
    public final m410 f165968o = new m410();

    /* JADX INFO: renamed from: h */
    public pxh0 f165961h = new C19963a();

    /* JADX INFO: renamed from: l.s310$a */
    public class C19963a extends pxh0 {
        public C19963a() {
        }

        @Override // p153l.pxh0
        /* JADX INFO: renamed from: a */
        public void mo174222a() {
            super.mo174222a();
            if (!jyb.m147479J(s310.this.f165958e)) {
                jyb.m147537z(s310.this.f165958e, new y20() { // from class: l.q310
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ((pwl) obj).mo120248f2();
                    }
                });
            }
            s310.this.m184202d0("onBufferingEnd");
        }

        @Override // p153l.pxh0
        /* JADX INFO: renamed from: b */
        public void mo174223b() {
            super.mo174223b();
            if (!jyb.m147479J(s310.this.f165958e)) {
                jyb.m147537z(s310.this.f165958e, new y20() { // from class: l.n310
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ((pwl) obj).mo120246O();
                    }
                });
            }
            s310.this.m184202d0("onBufferingStart");
        }

        @Override // p153l.pxh0
        /* JADX INFO: renamed from: c */
        public void mo174224c() {
            super.mo174224c();
            boolean z = s310.this.f165959f;
            s310 s310Var = s310.this;
            if (!z) {
                s310Var.m184205g0(0);
                nsh0.m164608j(v2t.f182113c, xau.m209903m("onPlayError in onCompletion"));
            } else {
                if (!jyb.m147479J(s310Var.f165958e)) {
                    jyb.m147537z(s310.this.f165958e, new y20() { // from class: l.o310
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            ((pwl) obj).mo139876F1();
                        }
                    });
                }
                s310.this.m184202d0("onCompletion");
            }
        }

        @Override // p153l.pxh0
        /* JADX INFO: renamed from: d */
        public void mo174225d(int i) {
            s310.this.m184205g0(i);
            s310.this.m184202d0("onError, what:" + i);
        }

        @Override // p153l.pxh0
        /* JADX INFO: renamed from: e */
        public void mo174226e() {
            super.mo174226e();
            if (!jyb.m147479J(s310.this.f165958e)) {
                jyb.m147537z(s310.this.f165958e, new y20() { // from class: l.p310
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ((pwl) obj).mo120245D0();
                    }
                });
            }
            s310.this.m184202d0("onFirstFrameRendering");
        }

        @Override // p153l.pxh0
        /* JADX INFO: renamed from: f */
        public void mo174227f() {
            super.mo174227f();
            if (!jyb.m147479J(s310.this.f165958e)) {
                jyb.m147537z(s310.this.f165958e, new y20() { // from class: l.m310
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ((pwl) obj).mo120249u1();
                    }
                });
            }
            s310.this.m184202d0("onPrepared");
        }

        @Override // p153l.pxh0
        /* JADX INFO: renamed from: g */
        public void mo174228g(MMLiveTranscoding mMLiveTranscoding) {
            super.mo174228g(mMLiveTranscoding);
            s310.this.m184187O(mMLiveTranscoding);
            s310.this.m184186N(mMLiveTranscoding);
            s310.this.m184188P(mMLiveTranscoding);
        }

        @Override // p153l.pxh0
        /* JADX INFO: renamed from: h */
        public void mo174229h(int i, int i2) {
            super.mo174229h(i, i2);
            s310.this.m184202d0("onVideoSizeChanged, videoWidth = " + i + ", videoHeight = " + i2);
            s310.this.f165968o.m156977z(i, i2);
            if (!jyb.m147479J(s310.this.f165958e) && i2 != 0 && i != 0) {
                final float f = i / i2;
                jyb.m147537z(s310.this.f165958e, new y20() { // from class: l.r310
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ((pwl) obj).mo120247R1(f);
                    }
                });
            }
            s310.this.f165968o.m156975x(true);
        }
    }

    public s310(Context context) {
        this.f165956c = context;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m184160B(TTLivePlayer tTLivePlayer) {
        tTLivePlayer.release();
        nsh0.m164608j(v2t.f182113c, "release player LiveEngine：" + tTLivePlayer.hashCode());
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m184162D(String str, String str2, BLiveAbsData bLiveAbsData, Boolean bool, Integer num, Integer num2, Integer num3) {
        BLiveAbsData bLiveAbsData2;
        String str3 = "errorType_videoSizeError_" + num + "_w" + num2 + "_h" + num3;
        if (bool.booleanValue()) {
            bLiveAbsData2 = bLiveAbsData;
        } else {
            bLiveAbsData2 = bLiveAbsData;
            fgt.m125529a(str3, false, str, str2, bLiveAbsData2, null);
            LivingNormalApiProvider.m72613c7(bLiveAbsData2.f45171id, bLiveAbsData2.room.f45267id, bLiveAbsData2.anchor.f45267id, "videoSizeError", "ctyp=" + num + ",w=" + num2 + ",h=" + num3).subscribe(dhw.m115824c());
        }
        nsh0.m164608j(v2t.f182113c, "liveId" + bLiveAbsData2.f45171id + "StreamCheckError:" + bool + " detail:" + str3);
    }

    /* JADX INFO: renamed from: L */
    public final void m184184L(@NotNull String str, String str2, String str3) {
        if (this.f165957d != null) {
            return;
        }
        cgu cguVar = new cgu();
        cguVar.f81730a = zrv.m221193k().m203483O4();
        cguVar.f81734e = str3;
        cguVar.f81733d = str2;
        cguVar.f81732c = str;
        cguVar.f81731b = xau.m209915y(zrv.f205799a.m207651V());
        cguVar.f81735f = zrv.f205799a.m207686p().m203611e5();
        this.f165957d = new TTLivePlayer(this.f165956c, cguVar, TTLivePlayer.PlayerType.NEW_MOMO);
    }

    /* JADX INFO: renamed from: M */
    public fyb m184185M() {
        return this.f165965l;
    }

    /* JADX INFO: renamed from: N */
    public final void m184186N(MMLiveTranscoding mMLiveTranscoding) {
        BLiveCallVolume bLiveCallVolume = (BLiveCallVolume) this.f165955b.fromJson(mMLiveTranscoding.extString, BLiveCallVolume.class);
        final int i = mMLiveTranscoding.ctyp;
        int i2 = this.f165965l.f101357a;
        if (i != i2) {
            this.f165965l = new fyb(i, i2, mMLiveTranscoding.f14649ts, bLiveCallVolume == null ? 0 : bLiveCallVolume.mode);
            nsh0.m164608j("LivePkConstant", "in player new ctyp = " + this.f165965l.f101357a);
            l51.m152893M(new Runnable() { // from class: l.x210
                @Override // java.lang.Runnable
                public final void run() {
                    this.f192112a.m184191S(i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m184187O(MMLiveTranscoding mMLiveTranscoding) {
        BLiveCallVolume bLiveCallVolume = (BLiveCallVolume) this.f165955b.fromJson(mMLiveTranscoding.extString, BLiveCallVolume.class);
        if (bLiveCallVolume != null) {
            int i = this.f165969p;
            int i2 = bLiveCallVolume.mode;
            if (i != i2) {
                this.f165969p = i2;
                l51.m152893M(new Runnable() { // from class: l.i310
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f112685a.m184194V();
                    }
                });
            }
        }
        if (bLiveCallVolume == null) {
            final BLiveCallVolume bLiveCallVolume2 = new BLiveCallVolume();
            jyb.m147537z(mMLiveTranscoding.infoMembers, new y20() { // from class: l.j310
                @Override // p153l.y20
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
        jyb.m147537z(bLiveCallVolume.volumes.entrySet(), new y20() { // from class: l.k310
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123677a.m184195W((Map.Entry) obj);
            }
        });
        if (SystemClock.elapsedRealtime() - this.f165967n > 1000) {
            this.f165967n = SystemClock.elapsedRealtime();
            l51.m152893M(new Runnable() { // from class: l.l310
                @Override // java.lang.Runnable
                public final void run() {
                    this.f129836a.m184192T();
                }
            });
        }
    }

    /* JADX INFO: renamed from: P */
    public void m184188P(MMLiveTranscoding mMLiveTranscoding) {
        Collection arrayList = mMLiveTranscoding.infoMembers;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        final ArrayList arrayListM147486Q = jyb.m147486Q(arrayList, new qcj() { // from class: l.v210
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((MMLiveTranscoding.MMLiveLinkMember) obj).userid;
            }
        });
        l51.m152893M(new Runnable() { // from class: l.w210
            @Override // java.lang.Runnable
            public final void run() {
                this.f186864a.m184197Y(arrayListM147486Q);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final void m184189Q() {
        this.f165968o.m156965n(this.f165956c, new pcj() { // from class: l.u210
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f177173a.m184198Z();
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m184190R(pwl pwlVar) {
        pwlVar.mo139894c0(this.f165965l);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m184191S(int i) {
        this.f165968o.m156971t(i);
        this.f165968o.m156975x(true);
        if (jyb.m147479J(this.f165958e)) {
            return;
        }
        jyb.m147537z(this.f165958e, new y20() { // from class: l.a310
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68250a.m184190R((pwl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m184192T() {
        if (!jyb.m147479J(this.f165958e)) {
            jyb.m147537z(this.f165958e, new y20() { // from class: l.z210
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f202621a.m184196X((pwl) obj);
                }
            });
        }
        this.f165954a.volumes.clear();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m184193U(pwl pwlVar) {
        pwlVar.mo139899p1(this.f165969p);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m184194V() {
        if (jyb.m147479J(this.f165958e)) {
            return;
        }
        jyb.m147537z(this.f165958e, new y20() { // from class: l.y210
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197167a.m184193U((pwl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m184195W(Map.Entry entry) {
        this.f165954a.volumes.put((String) entry.getKey(), (Float) entry.getValue());
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m184196X(pwl pwlVar) {
        pwlVar.mo139885O0(this.f165954a);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m184197Y(final ArrayList arrayList) {
        if (jyb.m147479J(this.f165958e)) {
            return;
        }
        jyb.m147537z(this.f165958e, new y20() { // from class: l.c310
            @Override // p153l.y20
            public final void call(Object obj) {
                ((pwl) obj).mo139904s1(arrayList);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ TTLivePlayer m184198Z() {
        return this.f165957d;
    }

    @Override // p153l.qwl
    /* JADX INFO: renamed from: a */
    public PullWatchInfo mo178521a() {
        TTLivePlayer tTLivePlayer = this.f165957d;
        if (tTLivePlayer == null) {
            return null;
        }
        return tTLivePlayer.mo69698a();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ TTLivePlayer m184199a0() {
        return this.f165957d;
    }

    @Override // p153l.qwl
    /* JADX INFO: renamed from: b */
    public void mo178522b(boolean z) {
        m184202d0("live player stop. hasStartPlay:" + this.f165963j + " hasStartPlayCount:" + this.f165964k + ", MomoLivePlayerNewVersionImpl hashCode:" + hashCode());
        this.f165966m = null;
        this.f165959f = true;
        if (z && this.f165968o.m156964m()) {
            TTLivePlayer tTLivePlayer = this.f165957d;
            if (tTLivePlayer != null) {
                tTLivePlayer.mo69701d(null);
            }
            this.f165968o.m156960i();
        }
        TTLivePlayer tTLivePlayer2 = this.f165957d;
        if (tTLivePlayer2 == null) {
            return;
        }
        if (this.f165963j) {
            this.f165964k--;
            tTLivePlayer2.mo69702e(true);
            this.f165957d.mo69700c(null);
            final TTLivePlayer tTLivePlayer3 = this.f165957d;
            l51.m152919y(new Runnable() { // from class: l.d310
                @Override // java.lang.Runnable
                public final void run() {
                    s310.m184160B(tTLivePlayer3);
                }
            });
            this.f165957d = null;
        }
        this.f165963j = false;
        this.f165968o.m156962k();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m184200b0(pwl pwlVar) {
        pwlVar.mo139894c0(this.f165965l);
    }

    @Override // p153l.qwl
    /* JADX INFO: renamed from: c */
    public void mo178523c(pwl pwlVar) {
        this.f165958e.add(pwlVar);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m184201c0(final int i) {
        if (!jyb.m147479J(this.f165958e)) {
            mo178522b(false);
            jyb.m147537z(this.f165958e, new y20() { // from class: l.b310
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((pwl) obj).mo123267l0(i);
                }
            });
        }
        this.f165960g = false;
    }

    @Override // p153l.qwl
    /* JADX INFO: renamed from: d */
    public void mo178524d(FrameLayout frameLayout) {
        this.f165968o.m156968q(this.f165956c, frameLayout, new pcj() { // from class: l.g310
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f101941a.m184199a0();
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final void m184202d0(String str) {
        nsh0.m164608j(v2t.f182113c, xau.m209903m(str));
    }

    @Override // p153l.qwl
    /* JADX INFO: renamed from: e */
    public boolean mo178525e() {
        return this.f165963j;
    }

    /* JADX INFO: renamed from: e0 */
    public void m184203e0() {
        this.f165965l = new fyb(-1, -1, 0.0f);
    }

    @Override // p153l.qwl
    /* JADX INFO: renamed from: f */
    public void mo178526f(FrameLayout frameLayout) {
        this.f165968o.m156973v(frameLayout);
    }

    /* JADX INFO: renamed from: f0 */
    public void m184204f0(fyb fybVar) {
        this.f165965l = fybVar;
    }

    @Override // p153l.qwl
    /* JADX INFO: renamed from: g */
    public void mo178527g(boolean z) {
        this.f165968o.m156972u(z);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m184205g0(final int i) {
        if (this.f165960g) {
            return;
        }
        this.f165960g = true;
        l51.m152888H(this.f165956c, new Runnable() { // from class: l.f310
            @Override // java.lang.Runnable
            public final void run() {
                this.f96945a.m184201c0(i);
            }
        }, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }

    @Override // p153l.qwl
    /* JADX INFO: renamed from: h */
    public void mo178528h(pwl pwlVar) {
        if (pwlVar != null) {
            this.f165958e.remove(pwlVar);
        }
    }

    @Override // p153l.qwl
    /* JADX INFO: renamed from: i */
    public String mo178529i() {
        return this.f165966m;
    }

    @Override // p153l.qwl
    public boolean isPlaying() {
        TTLivePlayer tTLivePlayer = this.f165957d;
        return tTLivePlayer != null && tTLivePlayer.isPlaying();
    }

    @Override // p153l.qwl
    /* JADX INFO: renamed from: j */
    public void mo178530j(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5) {
        this.f165966m = str;
        this.f165959f = false;
        m184184L(str3, str4, str5);
        m184189Q();
        this.f165965l = new fyb(-1, -1, 0.0f);
        this.f165957d.mo69700c(this.f165961h);
        this.f165957d.mo69699b(str, str2);
        this.f165957d.setMute(this.f165962i);
        this.f165963j = true;
        this.f165964k++;
        m184202d0("start player:" + str + " ipv6: " + str2 + ",LiveEngine hashCode:" + this.f165957d.hashCode());
    }

    @Override // p153l.qwl
    /* JADX INFO: renamed from: k */
    public float mo178531k() {
        return this.f165968o.m156963l();
    }

    @Override // p153l.qwl
    /* JADX INFO: renamed from: l */
    public void mo178532l(final String str, final String str2, final BLiveAbsData bLiveAbsData) {
        this.f165968o.m156974w(new b30() { // from class: l.e310
            @Override // p153l.b30
            /* JADX INFO: renamed from: b */
            public final void mo102266b(Object obj, Object obj2, Object obj3, Object obj4) {
                s310.m184162D(str, str2, bLiveAbsData, (Boolean) obj, (Integer) obj2, (Integer) obj3, (Integer) obj4);
            }
        });
    }

    @Override // p153l.qwl
    public void reset() {
        m184202d0("reset，MomoLivePlayerNewVersionImpl hashCode:" + hashCode());
        this.f165962i = false;
        this.f165959f = false;
        this.f165960g = false;
        this.f165965l = new fyb(-1, -1, 0.0f);
        if (!jyb.m147479J(this.f165958e)) {
            jyb.m147537z(this.f165958e, new y20() { // from class: l.h310
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f107613a.m184200b0((pwl) obj);
                }
            });
        }
        this.f165958e.clear();
        this.f165968o.m156969r();
    }

    @Override // p153l.qwl
    public void setMute(boolean z) {
        nsh0.m164608j(v2t.f182113c, "setMute:old:" + this.f165962i + " setMute:" + z + ",MomoLivePlayerNewVersionImpl hashCode:" + hashCode());
        this.f165962i = z;
        TTLivePlayer tTLivePlayer = this.f165957d;
        if (tTLivePlayer != null) {
            tTLivePlayer.setMute(z);
        }
    }
}
