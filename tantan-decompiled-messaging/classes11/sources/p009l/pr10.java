package p009l;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.play.IntlMusicBean;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p1.mobile.putong.live.base.gson.SafeJsonUtil;
import com.p1.mobile.putong.live.livingroom.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.alk0;
import l.c4g0;
import l.d8s;
import l.e30;
import l.e51;
import l.ffw;
import l.hfw;
import l.j760;
import l.jo0;
import l.jxl;
import l.lpd0;
import l.lsi0;
import l.mkd0;
import l.uqd0;
import l.vwb;
import l.w9j;
import l.z3g0;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pr10 extends d8s {

    /* JADX INFO: renamed from: s */
    public static String f18846s = "MusicPlayManager";

    /* JADX INFO: renamed from: t */
    public static String f18847t = "play_mode_single_loop";

    /* JADX INFO: renamed from: a */
    public String f18848a;

    /* JADX INFO: renamed from: b */
    public String f18849b;

    /* JADX INFO: renamed from: c */
    public String f18850c;

    /* JADX INFO: renamed from: d */
    public jxl f18851d;

    /* JADX INFO: renamed from: e */
    public IntlMusicBean f18852e;

    /* JADX INFO: renamed from: f */
    public IntlMusicBean f18853f;

    /* JADX INFO: renamed from: g */
    public List<IntlMusicBean> f18854g;

    /* JADX INFO: renamed from: h */
    public String f18855h;

    /* JADX INFO: renamed from: i */
    public d0m f18856i;

    /* JADX INFO: renamed from: j */
    public uqd0 f18857j;

    /* JADX INFO: renamed from: k */
    public c4g0 f18858k;

    /* JADX INFO: renamed from: l */
    public uqd0 f18859l;

    /* JADX INFO: renamed from: m */
    public boolean f18860m;

    /* JADX INFO: renamed from: n */
    public String f18861n;

    /* JADX INFO: renamed from: o */
    public lpd0 f18862o;

    /* JADX INFO: renamed from: p */
    public c4g0 f18863p;

    /* JADX INFO: renamed from: q */
    public boolean f18864q;

    /* JADX INFO: renamed from: r */
    public c4g0 f18865r;

    /* JADX INFO: renamed from: l.pr10$a */
    public class C1120a extends TypeToken<List<IntlMusicBean>> {
        public C1120a() {
        }
    }

    /* JADX INFO: renamed from: l.pr10$b */
    public static class C1121b {

        /* JADX INFO: renamed from: a */
        public static final pr10 f18867a = new pr10();
    }

    public pr10() {
        this.f18848a = "play_mode_playlist_loop";
        this.f18849b = "intl_local_playlist";
        this.f18850c = "intl_music_play_mode";
        this.f18854g = new ArrayList();
        this.f18855h = this.f18848a;
        this.f18861n = "";
    }

    /* JADX INFO: renamed from: f1 */
    public static pr10 m20574f1() {
        return C1121b.f18867a;
    }

    /* JADX INFO: renamed from: A1 */
    public void m20575A1(d0m d0mVar) {
        this.f18856i = d0mVar;
        IntlMusicBean intlMusicBean = this.f18852e;
        if (intlMusicBean == null) {
            return;
        }
        if (IntlMusicBean.STATUS_PLAYING.equals(intlMusicBean.playStatus)) {
            this.f18856i.m12895o1(this.f18852e);
        } else if (IntlMusicBean.STATUS_PAUSED.equals(this.f18852e.playStatus)) {
            this.f18856i.m12896w1(this.f18852e);
        }
    }

    /* JADX INFO: renamed from: B1 */
    public void m20576B1() {
        hfw.a(f18846s, "releasePlayer");
        jxl jxlVar = this.f18851d;
        if (jxlVar != null) {
            jxlVar.a().stopSurroundMusic();
            this.f18851d.b().a(this);
            this.f18851d = null;
        }
        mkd0.z(this.f18865r);
        mkd0.z(this.f18858k);
        mkd0.z(this.f18863p);
        this.f18852e = null;
        this.f18853f = null;
        this.f18861n = "";
    }

    /* JADX INFO: renamed from: C0 */
    public void m20577C0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.C0(str, i, mMLivePushType);
        jxl jxlVar = this.f18851d;
        if (jxlVar != null && jxlVar.a() != null) {
            this.f18851d.a().stopSurroundMusic();
        }
        m20576B1();
    }

    /* JADX INFO: renamed from: C1 */
    public void m20578C1() {
        this.f18851d.a().q();
        IntlMusicBean intlMusicBean = this.f18852e;
        intlMusicBean.playStatus = IntlMusicBean.STATUS_PLAYING;
        d0m d0mVar = this.f18856i;
        if (d0mVar != null) {
            d0mVar.m12894k1(intlMusicBean);
        }
        hfw.a(f18846s, "resumePlay");
    }

    /* JADX INFO: renamed from: D1 */
    public void m20579D1() {
        final ArrayList arrayList = new ArrayList(this.f18854g);
        e51.y(new Runnable() { // from class: l.ir10
            @Override // java.lang.Runnable
            public final void run() {
                this.f14773a.m20605r1(arrayList);
            }
        });
    }

    /* JADX INFO: renamed from: E1 */
    public void m20580E1(List<IntlMusicBean> list, boolean z) {
        if (list != null) {
            this.f18854g.clear();
            m20589c1(list, z);
        }
    }

    /* JADX INFO: renamed from: F1 */
    public void m20581F1(jxl jxlVar) {
        this.f18851d = jxlVar;
        jxlVar.b().b(this);
    }

    /* JADX INFO: renamed from: G1 */
    public void m20582G1(float f, boolean z) {
        if (z) {
            this.f18862o.put(Float.valueOf(f));
            hfw.a(f18846s, "save  volume:" + f);
        }
        float f2 = 0.0f;
        if (this.f18860m) {
            hfw.a(f18846s, "set  volume isMute 0");
            f = 0.0f;
        }
        if (this.f18864q) {
            f2 = f;
        } else {
            hfw.a(f18846s, "set  volume background 0");
        }
        jxl jxlVar = this.f18851d;
        if (jxlVar != null) {
            jxlVar.a().a0(f2);
            hfw.a(f18846s, "set sdk volume:" + f2);
        }
    }

    /* JADX INFO: renamed from: H1 */
    public final void m20583H1() {
        mkd0.z(this.f18865r);
        this.f18865r = c.interval(15L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a()).filter(new w9j() { // from class: l.nr10
            public final Object call(Object obj) {
                return this.f17621a.m20606s1((Long) obj);
            }
        }).subscribe(ffw.h(new e30() { // from class: l.or10
            public final void call(Object obj) {
                zvf0.D("e_intl_local_music_play_during_time", "p_intl_local_music_play_main", new j760[0]);
            }
        }));
    }

    /* JADX INFO: renamed from: I1 */
    public void m20584I1() {
        this.f18853f = this.f18852e;
        this.f18851d.a().stopSurroundMusic();
    }

    /* JADX INFO: renamed from: J1 */
    public void m20585J1(d0m d0mVar) {
        if (this.f18856i == d0mVar) {
            this.f18856i = null;
        }
    }

    /* JADX INFO: renamed from: W */
    public void m20586W() {
        super.W();
        IntlMusicBean intlMusicBean = this.f18853f;
        if (intlMusicBean != null) {
            intlMusicBean.playStatus = IntlMusicBean.STATUS_IDLE;
            hfw.a(f18846s, "onPlayStop:" + this.f18853f.filePath);
            d0m d0mVar = this.f18856i;
            if (d0mVar != null) {
                d0mVar.m12892e0(this.f18853f);
                this.f18853f = null;
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public void m20587X() {
        super.X();
        hfw.a(f18846s, "onPlayFinish:" + this.f18852e.filePath);
        IntlMusicBean intlMusicBean = this.f18852e;
        intlMusicBean.playStatus = IntlMusicBean.STATUS_IDLE;
        d0m d0mVar = this.f18856i;
        if (d0mVar != null) {
            d0mVar.m12892e0(intlMusicBean);
        }
        if (m20599m1()) {
            m20609v1(this.f18852e);
        } else {
            m20610w1();
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m20588Z() {
        super.Z();
        hfw.a(f18846s, "onPlayStart:" + this.f18852e.filePath);
        zvf0.B("e_intl_local_music_play_music", "p_intl_local_music_play_main", new j760[0]);
        m20582G1(((Float) this.f18862o.get()).floatValue(), false);
        IntlMusicBean intlMusicBean = this.f18852e;
        intlMusicBean.playStatus = IntlMusicBean.STATUS_PLAYING;
        d0m d0mVar = this.f18856i;
        if (d0mVar != null) {
            d0mVar.m12895o1(intlMusicBean);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public void m20589c1(List<IntlMusicBean> list, boolean z) {
        if (list != null) {
            this.f18854g.addAll(list);
            d0m d0mVar = this.f18856i;
            if (d0mVar != null) {
                d0mVar.m12893e1(this.f18854g);
            }
            if (z) {
                m20579D1();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public float m20590d() {
        lpd0 lpd0Var = this.f18862o;
        if (lpd0Var != null) {
            return ((Float) lpd0Var.get()).floatValue();
        }
        return 0.5f;
    }

    /* JADX INFO: renamed from: d1 */
    public void m20591d1() {
        if (this.f18848a.equals(this.f18855h)) {
            this.f18855h = f18847t;
        } else {
            this.f18855h = this.f18848a;
        }
        hfw.a(f18846s, this.f18855h);
        this.f18859l.put(this.f18855h);
    }

    /* JADX INFO: renamed from: e1 */
    public void m20592e1(ArrayList<IntlMusicBean> arrayList) {
        if (vwb.J(arrayList)) {
            return;
        }
        final IntlMusicBean intlMusicBean = (IntlMusicBean) vwb.r(arrayList, new w9j() { // from class: l.jr10
            public final Object call(Object obj) {
                return Boolean.valueOf(((IntlMusicBean) obj).isUsing());
            }
        });
        if (intlMusicBean != null) {
            m20584I1();
            int iG = vwb.G(this.f18854g, new w9j() { // from class: l.kr10
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((IntlMusicBean) obj).filePath, intlMusicBean.filePath));
                }
            });
            for (int i = iG + 1; i < this.f18854g.size() + iG; i++) {
                final int size = i % this.f18854g.size();
                if (((IntlMusicBean) vwb.r(arrayList, new w9j() { // from class: l.lr10
                    public final Object call(Object obj) {
                        return this.f16309a.m20600n1(size, (IntlMusicBean) obj);
                    }
                })) == null) {
                    m20609v1(this.f18854g.get(size));
                    break;
                }
            }
        }
        this.f18854g.removeAll(arrayList);
        d0m d0mVar = this.f18856i;
        if (d0mVar != null) {
            d0mVar.m12893e1(this.f18854g);
        }
        m20579D1();
    }

    /* JADX INFO: renamed from: g1 */
    public List<IntlMusicBean> m20593g1() {
        return this.f18854g;
    }

    /* JADX INFO: renamed from: h1 */
    public void m20594h1(BLiveVoiceCall bLiveVoiceCall) {
        if (!alk0.h(bLiveVoiceCall)) {
            this.f18860m = false;
            m20576B1();
        } else if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser) {
            this.f18860m = true;
            m20582G1(0.0f, false);
        } else {
            this.f18860m = false;
            m20582G1(((Float) this.f18862o.get()).floatValue(), false);
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m20595i1(Boolean bool) {
        hfw.a(f18846s, "isFront:" + bool + ",isVisible:" + Act.isAppVisible());
        this.f18864q = bool.booleanValue();
        if (bool.booleanValue()) {
            m20582G1(((Float) this.f18862o.get()).floatValue(), false);
        } else {
            m20582G1(0.0f, false);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public void m20596j1(String str) {
        if (!TextUtils.equals(this.f18861n, str) || this.f18857j == null) {
            this.f18861n = str;
            this.f18857j = new uqd0(this.f18849b + str, "");
            this.f18859l = new uqd0(this.f18850c + str, this.f18848a);
            StringBuilder sb = new StringBuilder("intl_music_play_volume");
            sb.append(str);
            this.f18862o = new lpd0(sb.toString(), 0.5f);
            this.f18855h = (String) this.f18859l.get();
        }
    }

    /* JADX INFO: renamed from: k1 */
    public boolean m20597k1(final String str) {
        return vwb.m(this.f18854g, new w9j() { // from class: l.fr10
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((IntlMusicBean) obj).filePath, str));
            }
        });
    }

    /* JADX INFO: renamed from: l1 */
    public boolean m20598l1() {
        IntlMusicBean intlMusicBean = this.f18852e;
        return intlMusicBean != null && intlMusicBean.isUsing();
    }

    /* JADX INFO: renamed from: m1 */
    public boolean m20599m1() {
        return f18847t.equals(this.f18855h);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ Boolean m20600n1(int i, IntlMusicBean intlMusicBean) {
        return Boolean.valueOf(TextUtils.equals(this.f18854g.get(i).filePath, intlMusicBean.filePath));
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m20601o1(IntlMusicBean intlMusicBean) {
        IntlMusicBean intlMusicBean2 = this.f18852e;
        if (intlMusicBean2 == null || !TextUtils.equals(intlMusicBean.filePath, intlMusicBean2.filePath)) {
            intlMusicBean.playStatus = IntlMusicBean.STATUS_IDLE;
        } else {
            intlMusicBean.playStatus = this.f18852e.playStatus;
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m20602p1(z3g0 z3g0Var) {
        List list = (List) SafeJsonUtil.getInstance().fromJson((String) this.f18857j.get(), new C1120a().getType());
        if (vwb.J(list)) {
            z3g0Var.onNext(new ArrayList());
        } else {
            vwb.z(list, new e30() { // from class: l.er10
                public final void call(Object obj) {
                    this.f12664a.m20601o1((IntlMusicBean) obj);
                }
            });
            z3g0Var.onNext(list);
        }
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ Boolean m20603q1(IntlMusicBean intlMusicBean) {
        return Boolean.valueOf(TextUtils.equals(intlMusicBean.filePath, this.f18852e.filePath));
    }

    /* JADX INFO: renamed from: r0 */
    public void m20604r0(int i) {
        super.r0(i);
        hfw.a(f18846s, "onPlayError:" + this.f18852e.filePath);
        IntlMusicBean intlMusicBean = this.f18852e;
        intlMusicBean.playStatus = IntlMusicBean.STATUS_IDLE;
        d0m d0mVar = this.f18856i;
        if (d0mVar != null) {
            d0mVar.m12891N(intlMusicBean, i);
        }
        lsi0.w(R.string.s);
        m20592e1(vwb.f0(new IntlMusicBean[]{this.f18852e}));
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m20605r1(ArrayList arrayList) {
        this.f18857j.put(SafeJsonUtil.getInstance().toJson(arrayList));
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ Boolean m20606s1(Long l2) {
        IntlMusicBean intlMusicBean = this.f18852e;
        return Boolean.valueOf(intlMusicBean != null && intlMusicBean.isPlaying());
    }

    /* JADX INFO: renamed from: t1 */
    public c<List<IntlMusicBean>> m20607t1() {
        return c.create(new c.a() { // from class: l.mr10
            public final void call(Object obj) {
                this.f17054a.m20602p1((z3g0) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: u1 */
    public void m20608u1() {
        this.f18851d.a().j();
        this.f18852e.playStatus = IntlMusicBean.STATUS_PAUSED;
        hfw.a(f18846s, "pausePlay");
        d0m d0mVar = this.f18856i;
        if (d0mVar != null) {
            d0mVar.m12896w1(this.f18852e);
        }
    }

    /* JADX INFO: renamed from: v1 */
    public void m20609v1(IntlMusicBean intlMusicBean) {
        IntlMusicBean intlMusicBean2 = this.f18852e;
        if (intlMusicBean2 != null && intlMusicBean2.isUsing()) {
            m20584I1();
        }
        jxl jxlVar = this.f18851d;
        if (jxlVar != null) {
            this.f18852e = intlMusicBean;
            jxlVar.a().E(intlMusicBean.filePath, false);
        }
    }

    /* JADX INFO: renamed from: w1 */
    public void m20610w1() {
        int iG = vwb.G(this.f18854g, new w9j() { // from class: l.hr10
            public final Object call(Object obj) {
                return this.f14227a.m20603q1((IntlMusicBean) obj);
            }
        }) + 1;
        if (iG >= this.f18854g.size()) {
            iG = 0;
        }
        m20609v1(this.f18854g.get(iG));
    }

    /* JADX INFO: renamed from: x1 */
    public void m20611x1(d0m d0mVar, jxl jxlVar, c<BLiveVoiceCall> cVar) {
        m20575A1(d0mVar);
        m20581F1(jxlVar);
        m20612y1(cVar);
        m20613z1();
        m20583H1();
    }

    /* JADX INFO: renamed from: y1 */
    public void m20612y1(c<BLiveVoiceCall> cVar) {
        mkd0.z(this.f18858k);
        if (TextUtils.isEmpty(this.f18861n)) {
            return;
        }
        this.f18858k = cVar.subscribe(ffw.h(new e30() { // from class: l.dr10
            public final void call(Object obj) {
                this.f11956a.m20594h1((BLiveVoiceCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z1 */
    public final void m20613z1() {
        mkd0.z(this.f18863p);
        this.f18864q = Act.isAppVisible();
        this.f18863p = Act.front().subscribe(ffw.h(new e30() { // from class: l.gr10
            public final void call(Object obj) {
                this.f13694a.m20595i1((Boolean) obj);
            }
        }));
    }
}
