package p149l;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.gson.SafeJsonUtil;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.play.IntlMusicBean;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class pr10 extends d8s {

    /* JADX INFO: renamed from: s */
    public static String f150828s = "MusicPlayManager";

    /* JADX INFO: renamed from: t */
    public static String f150829t = "play_mode_single_loop";

    /* JADX INFO: renamed from: a */
    public String f150830a;

    /* JADX INFO: renamed from: b */
    public String f150831b;

    /* JADX INFO: renamed from: c */
    public String f150832c;

    /* JADX INFO: renamed from: d */
    public jxl f150833d;

    /* JADX INFO: renamed from: e */
    public IntlMusicBean f150834e;

    /* JADX INFO: renamed from: f */
    public IntlMusicBean f150835f;

    /* JADX INFO: renamed from: g */
    public List<IntlMusicBean> f150836g;

    /* JADX INFO: renamed from: h */
    public String f150837h;

    /* JADX INFO: renamed from: i */
    public d0m f150838i;

    /* JADX INFO: renamed from: j */
    public uqd0 f150839j;

    /* JADX INFO: renamed from: k */
    public c4g0 f150840k;

    /* JADX INFO: renamed from: l */
    public uqd0 f150841l;

    /* JADX INFO: renamed from: m */
    public boolean f150842m;

    /* JADX INFO: renamed from: n */
    public String f150843n;

    /* JADX INFO: renamed from: o */
    public lpd0 f150844o;

    /* JADX INFO: renamed from: p */
    public c4g0 f150845p;

    /* JADX INFO: renamed from: q */
    public boolean f150846q;

    /* JADX INFO: renamed from: r */
    public c4g0 f150847r;

    /* JADX INFO: renamed from: l.pr10$a */
    public class C19318a extends TypeToken<List<IntlMusicBean>> {
        public C19318a() {
        }
    }

    /* JADX INFO: renamed from: l.pr10$b */
    public static class C19319b {

        /* JADX INFO: renamed from: a */
        public static final pr10 f150849a = new pr10();
    }

    public pr10() {
        this.f150830a = "play_mode_playlist_loop";
        this.f150831b = "intl_local_playlist";
        this.f150832c = "intl_music_play_mode";
        this.f150836g = new ArrayList();
        this.f150837h = this.f150830a;
        this.f150843n = "";
    }

    /* JADX INFO: renamed from: f1 */
    public static pr10 m170951f1() {
        return C19319b.f150849a;
    }

    /* JADX INFO: renamed from: A1 */
    public void m170952A1(d0m d0mVar) {
        this.f150838i = d0mVar;
        IntlMusicBean intlMusicBean = this.f150834e;
        if (intlMusicBean == null) {
            return;
        }
        if (IntlMusicBean.STATUS_PLAYING.equals(intlMusicBean.playStatus)) {
            this.f150838i.mo109527o1(this.f150834e);
        } else if (IntlMusicBean.STATUS_PAUSED.equals(this.f150834e.playStatus)) {
            this.f150838i.mo109528w1(this.f150834e);
        }
    }

    /* JADX INFO: renamed from: B1 */
    public void m170953B1() {
        hfw.m130790a(f150828s, "releasePlayer");
        jxl jxlVar = this.f150833d;
        if (jxlVar != null) {
            jxlVar.mo138335a().stopSurroundMusic();
            this.f150833d.mo138336b().mo118143a(this);
            this.f150833d = null;
        }
        mkd0.m154992z(this.f150847r);
        mkd0.m154992z(this.f150840k);
        mkd0.m154992z(this.f150845p);
        this.f150834e = null;
        this.f150835f = null;
        this.f150843n = "";
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: C0 */
    public void mo110342C0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110342C0(str, i, mMLivePushType);
        jxl jxlVar = this.f150833d;
        if (jxlVar != null && jxlVar.mo138335a() != null) {
            this.f150833d.mo138335a().stopSurroundMusic();
        }
        m170953B1();
    }

    /* JADX INFO: renamed from: C1 */
    public void m170954C1() {
        this.f150833d.mo138335a().mo71879q();
        IntlMusicBean intlMusicBean = this.f150834e;
        intlMusicBean.playStatus = IntlMusicBean.STATUS_PLAYING;
        d0m d0mVar = this.f150838i;
        if (d0mVar != null) {
            d0mVar.mo109526k1(intlMusicBean);
        }
        hfw.m130790a(f150828s, "resumePlay");
    }

    /* JADX INFO: renamed from: D1 */
    public void m170955D1() {
        final ArrayList arrayList = new ArrayList(this.f150836g);
        e51.m114774y(new Runnable() { // from class: l.ir10
            @Override // java.lang.Runnable
            public final void run() {
                this.f114577a.m170977r1(arrayList);
            }
        });
    }

    /* JADX INFO: renamed from: E1 */
    public void m170956E1(List<IntlMusicBean> list, boolean z) {
        if (list != null) {
            this.f150836g.clear();
            m170962c1(list, z);
        }
    }

    /* JADX INFO: renamed from: F1 */
    public void m170957F1(jxl jxlVar) {
        this.f150833d = jxlVar;
        jxlVar.mo138336b().mo118144b(this);
    }

    /* JADX INFO: renamed from: G1 */
    public void m170958G1(float f, boolean z) {
        if (z) {
            this.f150844o.put(Float.valueOf(f));
            hfw.m130790a(f150828s, "save  volume:" + f);
        }
        float f2 = 0.0f;
        if (this.f150842m) {
            hfw.m130790a(f150828s, "set  volume isMute 0");
            f = 0.0f;
        }
        if (this.f150846q) {
            f2 = f;
        } else {
            hfw.m130790a(f150828s, "set  volume background 0");
        }
        jxl jxlVar = this.f150833d;
        if (jxlVar != null) {
            jxlVar.mo138335a().mo71865a0(f2);
            hfw.m130790a(f150828s, "set sdk volume:" + f2);
        }
    }

    /* JADX INFO: renamed from: H1 */
    public final void m170959H1() {
        mkd0.m154992z(this.f150847r);
        this.f150847r = C22306c.interval(15L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.nr10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f140129a.m170978s1((Long) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.or10
            @Override // p149l.e30
            public final void call(Object obj) {
                zvf0.m220371D("e_intl_local_music_play_during_time", "p_intl_local_music_play_main", new j760[0]);
            }
        }));
    }

    /* JADX INFO: renamed from: I1 */
    public void m170960I1() {
        this.f150835f = this.f150834e;
        this.f150833d.mo138335a().stopSurroundMusic();
    }

    /* JADX INFO: renamed from: J1 */
    public void m170961J1(d0m d0mVar) {
        if (this.f150838i == d0mVar) {
            this.f150838i = null;
        }
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: W */
    public void mo110352W() {
        super.mo110352W();
        IntlMusicBean intlMusicBean = this.f150835f;
        if (intlMusicBean != null) {
            intlMusicBean.playStatus = IntlMusicBean.STATUS_IDLE;
            hfw.m130790a(f150828s, "onPlayStop:" + this.f150835f.filePath);
            d0m d0mVar = this.f150838i;
            if (d0mVar != null) {
                d0mVar.mo109524e0(this.f150835f);
                this.f150835f = null;
            }
        }
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: X */
    public void mo110353X() {
        super.mo110353X();
        hfw.m130790a(f150828s, "onPlayFinish:" + this.f150834e.filePath);
        IntlMusicBean intlMusicBean = this.f150834e;
        intlMusicBean.playStatus = IntlMusicBean.STATUS_IDLE;
        d0m d0mVar = this.f150838i;
        if (d0mVar != null) {
            d0mVar.mo109524e0(intlMusicBean);
        }
        if (m170972m1()) {
            m170981v1(this.f150834e);
        } else {
            m170982w1();
        }
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: Z */
    public void mo110354Z() {
        super.mo110354Z();
        hfw.m130790a(f150828s, "onPlayStart:" + this.f150834e.filePath);
        zvf0.m220369B("e_intl_local_music_play_music", "p_intl_local_music_play_main", new j760[0]);
        m170958G1(this.f150844o.get().floatValue(), false);
        IntlMusicBean intlMusicBean = this.f150834e;
        intlMusicBean.playStatus = IntlMusicBean.STATUS_PLAYING;
        d0m d0mVar = this.f150838i;
        if (d0mVar != null) {
            d0mVar.mo109527o1(intlMusicBean);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public void m170962c1(List<IntlMusicBean> list, boolean z) {
        if (list != null) {
            this.f150836g.addAll(list);
            d0m d0mVar = this.f150838i;
            if (d0mVar != null) {
                d0mVar.mo109525e1(this.f150836g);
            }
            if (z) {
                m170955D1();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public float m170963d() {
        lpd0 lpd0Var = this.f150844o;
        if (lpd0Var != null) {
            return lpd0Var.get().floatValue();
        }
        return 0.5f;
    }

    /* JADX INFO: renamed from: d1 */
    public void m170964d1() {
        if (this.f150830a.equals(this.f150837h)) {
            this.f150837h = f150829t;
        } else {
            this.f150837h = this.f150830a;
        }
        hfw.m130790a(f150828s, this.f150837h);
        this.f150841l.put(this.f150837h);
    }

    /* JADX INFO: renamed from: e1 */
    public void m170965e1(ArrayList<IntlMusicBean> arrayList) {
        if (vwb.m200296J(arrayList)) {
            return;
        }
        final IntlMusicBean intlMusicBean = (IntlMusicBean) vwb.m200346r(arrayList, new w9j() { // from class: l.jr10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((IntlMusicBean) obj).isUsing());
            }
        });
        if (intlMusicBean != null) {
            m170960I1();
            int iM200293G = vwb.m200293G(this.f150836g, new w9j() { // from class: l.kr10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((IntlMusicBean) obj).filePath, intlMusicBean.filePath));
                }
            });
            for (int i = iM200293G + 1; i < this.f150836g.size() + iM200293G; i++) {
                final int size = i % this.f150836g.size();
                if (((IntlMusicBean) vwb.m200346r(arrayList, new w9j() { // from class: l.lr10
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f129456a.m170973n1(size, (IntlMusicBean) obj);
                    }
                })) == null) {
                    m170981v1(this.f150836g.get(size));
                    break;
                }
            }
        }
        this.f150836g.removeAll(arrayList);
        d0m d0mVar = this.f150838i;
        if (d0mVar != null) {
            d0mVar.mo109525e1(this.f150836g);
        }
        m170955D1();
    }

    /* JADX INFO: renamed from: g1 */
    public List<IntlMusicBean> m170966g1() {
        return this.f150836g;
    }

    /* JADX INFO: renamed from: h1 */
    public void m170967h1(BLiveVoiceCall bLiveVoiceCall) {
        if (!alk0.m97309h(bLiveVoiceCall)) {
            this.f150842m = false;
            m170953B1();
        } else if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser) {
            this.f150842m = true;
            m170958G1(0.0f, false);
        } else {
            this.f150842m = false;
            m170958G1(this.f150844o.get().floatValue(), false);
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m170968i1(Boolean bool) {
        hfw.m130790a(f150828s, "isFront:" + bool + ",isVisible:" + Act.isAppVisible());
        this.f150846q = bool.booleanValue();
        if (bool.booleanValue()) {
            m170958G1(this.f150844o.get().floatValue(), false);
        } else {
            m170958G1(0.0f, false);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public void m170969j1(String str) {
        if (!TextUtils.equals(this.f150843n, str) || this.f150839j == null) {
            this.f150843n = str;
            this.f150839j = new uqd0(this.f150831b + str, "");
            this.f150841l = new uqd0(this.f150832c + str, this.f150830a);
            StringBuilder sb = new StringBuilder("intl_music_play_volume");
            sb.append(str);
            this.f150844o = new lpd0(sb.toString(), 0.5f);
            this.f150837h = this.f150841l.get();
        }
    }

    /* JADX INFO: renamed from: k1 */
    public boolean m170970k1(final String str) {
        return vwb.m200337m(this.f150836g, new w9j() { // from class: l.fr10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((IntlMusicBean) obj).filePath, str));
            }
        });
    }

    /* JADX INFO: renamed from: l1 */
    public boolean m170971l1() {
        IntlMusicBean intlMusicBean = this.f150834e;
        return intlMusicBean != null && intlMusicBean.isUsing();
    }

    /* JADX INFO: renamed from: m1 */
    public boolean m170972m1() {
        return f150829t.equals(this.f150837h);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ Boolean m170973n1(int i, IntlMusicBean intlMusicBean) {
        return Boolean.valueOf(TextUtils.equals(this.f150836g.get(i).filePath, intlMusicBean.filePath));
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m170974o1(IntlMusicBean intlMusicBean) {
        IntlMusicBean intlMusicBean2 = this.f150834e;
        if (intlMusicBean2 == null || !TextUtils.equals(intlMusicBean.filePath, intlMusicBean2.filePath)) {
            intlMusicBean.playStatus = IntlMusicBean.STATUS_IDLE;
        } else {
            intlMusicBean.playStatus = this.f150834e.playStatus;
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m170975p1(z3g0 z3g0Var) {
        List list = (List) SafeJsonUtil.getInstance().fromJson(this.f150839j.get(), new C19318a().getType());
        if (vwb.m200296J(list)) {
            z3g0Var.onNext(new ArrayList());
        } else {
            vwb.m200354z(list, new e30() { // from class: l.er10
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f92877a.m170974o1((IntlMusicBean) obj);
                }
            });
            z3g0Var.onNext(list);
        }
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ Boolean m170976q1(IntlMusicBean intlMusicBean) {
        return Boolean.valueOf(TextUtils.equals(intlMusicBean.filePath, this.f150834e.filePath));
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: r0 */
    public void mo110361r0(int i) {
        super.mo110361r0(i);
        hfw.m130790a(f150828s, "onPlayError:" + this.f150834e.filePath);
        IntlMusicBean intlMusicBean = this.f150834e;
        intlMusicBean.playStatus = IntlMusicBean.STATUS_IDLE;
        d0m d0mVar = this.f150838i;
        if (d0mVar != null) {
            d0mVar.mo109523N(intlMusicBean, i);
        }
        lsi0.m151593w(R$string.f47508s);
        m170965e1(vwb.m200324f0(this.f150834e));
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m170977r1(ArrayList arrayList) {
        this.f150839j.put(SafeJsonUtil.getInstance().toJson(arrayList));
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ Boolean m170978s1(Long l2) {
        IntlMusicBean intlMusicBean = this.f150834e;
        return Boolean.valueOf(intlMusicBean != null && intlMusicBean.isPlaying());
    }

    /* JADX INFO: renamed from: t1 */
    public C22306c<List<IntlMusicBean>> m170979t1() {
        return C22306c.create(new C22306c.a() { // from class: l.mr10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135321a.m170975p1((z3g0) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: u1 */
    public void m170980u1() {
        this.f150833d.mo138335a().mo71876j();
        this.f150834e.playStatus = IntlMusicBean.STATUS_PAUSED;
        hfw.m130790a(f150828s, "pausePlay");
        d0m d0mVar = this.f150838i;
        if (d0mVar != null) {
            d0mVar.mo109528w1(this.f150834e);
        }
    }

    /* JADX INFO: renamed from: v1 */
    public void m170981v1(IntlMusicBean intlMusicBean) {
        IntlMusicBean intlMusicBean2 = this.f150834e;
        if (intlMusicBean2 != null && intlMusicBean2.isUsing()) {
            m170960I1();
        }
        jxl jxlVar = this.f150833d;
        if (jxlVar != null) {
            this.f150834e = intlMusicBean;
            jxlVar.mo138335a().mo71856E(intlMusicBean.filePath, false);
        }
    }

    /* JADX INFO: renamed from: w1 */
    public void m170982w1() {
        int iM200293G = vwb.m200293G(this.f150836g, new w9j() { // from class: l.hr10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f109172a.m170976q1((IntlMusicBean) obj);
            }
        }) + 1;
        if (iM200293G >= this.f150836g.size()) {
            iM200293G = 0;
        }
        m170981v1(this.f150836g.get(iM200293G));
    }

    /* JADX INFO: renamed from: x1 */
    public void m170983x1(d0m d0mVar, jxl jxlVar, C22306c<BLiveVoiceCall> c22306c) {
        m170952A1(d0mVar);
        m170957F1(jxlVar);
        m170984y1(c22306c);
        m170985z1();
        m170959H1();
    }

    /* JADX INFO: renamed from: y1 */
    public void m170984y1(C22306c<BLiveVoiceCall> c22306c) {
        mkd0.m154992z(this.f150840k);
        if (TextUtils.isEmpty(this.f150843n)) {
            return;
        }
        this.f150840k = c22306c.subscribe(ffw.m121197h(new e30() { // from class: l.dr10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87567a.m170967h1((BLiveVoiceCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z1 */
    public final void m170985z1() {
        mkd0.m154992z(this.f150845p);
        this.f150846q = Act.isAppVisible();
        this.f150845p = Act.front().subscribe(ffw.m121197h(new e30() { // from class: l.gr10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104006a.m170968i1((Boolean) obj);
            }
        }));
    }
}
