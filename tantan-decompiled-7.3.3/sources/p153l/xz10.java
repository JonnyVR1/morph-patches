package p153l;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.gson.SafeJsonUtil;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.play.IntlMusicBean;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public class xz10 extends eas {

    /* JADX INFO: renamed from: s */
    public static String f196808s = "MusicPlayManager";

    /* JADX INFO: renamed from: t */
    public static String f196809t = "play_mode_single_loop";

    /* JADX INFO: renamed from: a */
    public String f196810a;

    /* JADX INFO: renamed from: b */
    public String f196811b;

    /* JADX INFO: renamed from: c */
    public String f196812c;

    /* JADX INFO: renamed from: d */
    public c0m f196813d;

    /* JADX INFO: renamed from: e */
    public IntlMusicBean f196814e;

    /* JADX INFO: renamed from: f */
    public IntlMusicBean f196815f;

    /* JADX INFO: renamed from: g */
    public List<IntlMusicBean> f196816g;

    /* JADX INFO: renamed from: h */
    public String f196817h;

    /* JADX INFO: renamed from: i */
    public x2m f196818i;

    /* JADX INFO: renamed from: j */
    public wyd0 f196819j;

    /* JADX INFO: renamed from: k */
    public kcg0 f196820k;

    /* JADX INFO: renamed from: l */
    public wyd0 f196821l;

    /* JADX INFO: renamed from: m */
    public boolean f196822m;

    /* JADX INFO: renamed from: n */
    public String f196823n;

    /* JADX INFO: renamed from: o */
    public nxd0 f196824o;

    /* JADX INFO: renamed from: p */
    public kcg0 f196825p;

    /* JADX INFO: renamed from: q */
    public boolean f196826q;

    /* JADX INFO: renamed from: r */
    public kcg0 f196827r;

    /* JADX INFO: renamed from: l.xz10$a */
    public class C21481a extends TypeToken<List<IntlMusicBean>> {
        public C21481a() {
        }
    }

    /* JADX INFO: renamed from: l.xz10$b */
    public static class C21482b {

        /* JADX INFO: renamed from: a */
        public static final xz10 f196829a = new xz10();
    }

    public xz10() {
        this.f196810a = "play_mode_playlist_loop";
        this.f196811b = "intl_local_playlist";
        this.f196812c = "intl_music_play_mode";
        this.f196816g = new ArrayList();
        this.f196817h = this.f196810a;
        this.f196823n = "";
    }

    /* JADX INFO: renamed from: f1 */
    public static xz10 m213668f1() {
        return C21482b.f196829a;
    }

    /* JADX INFO: renamed from: A1 */
    public void m213669A1(x2m x2mVar) {
        this.f196818i = x2mVar;
        IntlMusicBean intlMusicBean = this.f196814e;
        if (intlMusicBean == null) {
            return;
        }
        if (IntlMusicBean.STATUS_PLAYING.equals(intlMusicBean.playStatus)) {
            this.f196818i.mo107309o1(this.f196814e);
        } else if (IntlMusicBean.STATUS_PAUSED.equals(this.f196814e.playStatus)) {
            this.f196818i.mo107314w1(this.f196814e);
        }
    }

    /* JADX INFO: renamed from: B1 */
    public void m213670B1() {
        fhw.m125605a(f196808s, "releasePlayer");
        c0m c0mVar = this.f196813d;
        if (c0mVar != null) {
            c0mVar.mo107430a().stopSurroundMusic();
            this.f196813d.mo107431b().mo161148a(this);
            this.f196813d = null;
        }
        psd0.m173633z(this.f196827r);
        psd0.m173633z(this.f196820k);
        psd0.m173633z(this.f196825p);
        this.f196814e = null;
        this.f196815f = null;
        this.f196823n = "";
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: C0 */
    public void mo96682C0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96682C0(str, i, mMLivePushType);
        c0m c0mVar = this.f196813d;
        if (c0mVar != null && c0mVar.mo107430a() != null) {
            this.f196813d.mo107430a().stopSurroundMusic();
        }
        m213670B1();
    }

    /* JADX INFO: renamed from: C1 */
    public void m213671C1() {
        this.f196813d.mo107430a().mo73062q();
        IntlMusicBean intlMusicBean = this.f196814e;
        intlMusicBean.playStatus = IntlMusicBean.STATUS_PLAYING;
        x2m x2mVar = this.f196818i;
        if (x2mVar != null) {
            x2mVar.mo107308k1(intlMusicBean);
        }
        fhw.m125605a(f196808s, "resumePlay");
    }

    /* JADX INFO: renamed from: D1 */
    public void m213672D1() {
        final ArrayList arrayList = new ArrayList(this.f196816g);
        l51.m152919y(new Runnable() { // from class: l.qz10
            @Override // java.lang.Runnable
            public final void run() {
                this.f160213a.m213694r1(arrayList);
            }
        });
    }

    /* JADX INFO: renamed from: E1 */
    public void m213673E1(List<IntlMusicBean> list, boolean z) {
        if (list != null) {
            this.f196816g.clear();
            m213679c1(list, z);
        }
    }

    /* JADX INFO: renamed from: F1 */
    public void m213674F1(c0m c0mVar) {
        this.f196813d = c0mVar;
        c0mVar.mo107431b().mo161149b(this);
    }

    /* JADX INFO: renamed from: G1 */
    public void m213675G1(float f, boolean z) {
        if (z) {
            this.f196824o.put(Float.valueOf(f));
            fhw.m125605a(f196808s, "save  volume:" + f);
        }
        float f2 = 0.0f;
        if (this.f196822m) {
            fhw.m125605a(f196808s, "set  volume isMute 0");
            f = 0.0f;
        }
        if (this.f196826q) {
            f2 = f;
        } else {
            fhw.m125605a(f196808s, "set  volume background 0");
        }
        c0m c0mVar = this.f196813d;
        if (c0mVar != null) {
            c0mVar.mo107430a().mo73048a0(f2);
            fhw.m125605a(f196808s, "set sdk volume:" + f2);
        }
    }

    /* JADX INFO: renamed from: H1 */
    public final void m213676H1() {
        psd0.m173633z(this.f196827r);
        this.f196827r = C22421c.interval(15L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.vz10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f186438a.m213695s1((Long) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.wz10
            @Override // p153l.y20
            public final void call(Object obj) {
                i4g0.m138495D("e_intl_local_music_play_during_time", "p_intl_local_music_play_main", new pf60[0]);
            }
        }));
    }

    /* JADX INFO: renamed from: I1 */
    public void m213677I1() {
        this.f196815f = this.f196814e;
        this.f196813d.mo107430a().stopSurroundMusic();
    }

    /* JADX INFO: renamed from: J1 */
    public void m213678J1(x2m x2mVar) {
        if (this.f196818i == x2mVar) {
            this.f196818i = null;
        }
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: W */
    public void mo120108W() {
        super.mo120108W();
        IntlMusicBean intlMusicBean = this.f196815f;
        if (intlMusicBean != null) {
            intlMusicBean.playStatus = IntlMusicBean.STATUS_IDLE;
            fhw.m125605a(f196808s, "onPlayStop:" + this.f196815f.filePath);
            x2m x2mVar = this.f196818i;
            if (x2mVar != null) {
                x2mVar.mo107306e0(this.f196815f);
                this.f196815f = null;
            }
        }
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: X */
    public void mo120109X() {
        super.mo120109X();
        fhw.m125605a(f196808s, "onPlayFinish:" + this.f196814e.filePath);
        IntlMusicBean intlMusicBean = this.f196814e;
        intlMusicBean.playStatus = IntlMusicBean.STATUS_IDLE;
        x2m x2mVar = this.f196818i;
        if (x2mVar != null) {
            x2mVar.mo107306e0(intlMusicBean);
        }
        if (m213689m1()) {
            m213698v1(this.f196814e);
        } else {
            m213699w1();
        }
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: Z */
    public void mo120110Z() {
        super.mo120110Z();
        fhw.m125605a(f196808s, "onPlayStart:" + this.f196814e.filePath);
        i4g0.m138493B("e_intl_local_music_play_music", "p_intl_local_music_play_main", new pf60[0]);
        m213675G1(this.f196824o.get().floatValue(), false);
        IntlMusicBean intlMusicBean = this.f196814e;
        intlMusicBean.playStatus = IntlMusicBean.STATUS_PLAYING;
        x2m x2mVar = this.f196818i;
        if (x2mVar != null) {
            x2mVar.mo107309o1(intlMusicBean);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public void m213679c1(List<IntlMusicBean> list, boolean z) {
        if (list != null) {
            this.f196816g.addAll(list);
            x2m x2mVar = this.f196818i;
            if (x2mVar != null) {
                x2mVar.mo107307e1(this.f196816g);
            }
            if (z) {
                m213672D1();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public float m213680d() {
        nxd0 nxd0Var = this.f196824o;
        if (nxd0Var != null) {
            return nxd0Var.get().floatValue();
        }
        return 0.5f;
    }

    /* JADX INFO: renamed from: d1 */
    public void m213681d1() {
        if (this.f196810a.equals(this.f196817h)) {
            this.f196817h = f196809t;
        } else {
            this.f196817h = this.f196810a;
        }
        fhw.m125605a(f196808s, this.f196817h);
        this.f196821l.put(this.f196817h);
    }

    /* JADX INFO: renamed from: e1 */
    public void m213682e1(ArrayList<IntlMusicBean> arrayList) {
        if (jyb.m147479J(arrayList)) {
            return;
        }
        final IntlMusicBean intlMusicBean = (IntlMusicBean) jyb.m147529r(arrayList, new qcj() { // from class: l.rz10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((IntlMusicBean) obj).isUsing());
            }
        });
        if (intlMusicBean != null) {
            m213677I1();
            int iM147476G = jyb.m147476G(this.f196816g, new qcj() { // from class: l.sz10
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((IntlMusicBean) obj).filePath, intlMusicBean.filePath));
                }
            });
            for (int i = iM147476G + 1; i < this.f196816g.size() + iM147476G; i++) {
                final int size = i % this.f196816g.size();
                if (((IntlMusicBean) jyb.m147529r(arrayList, new qcj() { // from class: l.tz10
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f176734a.m213690n1(size, (IntlMusicBean) obj);
                    }
                })) == null) {
                    m213698v1(this.f196816g.get(size));
                    break;
                }
            }
        }
        this.f196816g.removeAll(arrayList);
        x2m x2mVar = this.f196818i;
        if (x2mVar != null) {
            x2mVar.mo107307e1(this.f196816g);
        }
        m213672D1();
    }

    /* JADX INFO: renamed from: g1 */
    public List<IntlMusicBean> m213683g1() {
        return this.f196816g;
    }

    /* JADX INFO: renamed from: h1 */
    public void m213684h1(BLiveVoiceCall bLiveVoiceCall) {
        if (!guk0.m132329h(bLiveVoiceCall)) {
            this.f196822m = false;
            m213670B1();
        } else if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser) {
            this.f196822m = true;
            m213675G1(0.0f, false);
        } else {
            this.f196822m = false;
            m213675G1(this.f196824o.get().floatValue(), false);
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m213685i1(Boolean bool) {
        fhw.m125605a(f196808s, "isFront:" + bool + ",isVisible:" + Act.isAppVisible());
        this.f196826q = bool.booleanValue();
        if (bool.booleanValue()) {
            m213675G1(this.f196824o.get().floatValue(), false);
        } else {
            m213675G1(0.0f, false);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public void m213686j1(String str) {
        if (!TextUtils.equals(this.f196823n, str) || this.f196819j == null) {
            this.f196823n = str;
            this.f196819j = new wyd0(this.f196811b + str, "");
            this.f196821l = new wyd0(this.f196812c + str, this.f196810a);
            StringBuilder sb = new StringBuilder("intl_music_play_volume");
            sb.append(str);
            this.f196824o = new nxd0(sb.toString(), 0.5f);
            this.f196817h = this.f196821l.get();
        }
    }

    /* JADX INFO: renamed from: k1 */
    public boolean m213687k1(final String str) {
        return jyb.m147520m(this.f196816g, new qcj() { // from class: l.nz10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((IntlMusicBean) obj).filePath, str));
            }
        });
    }

    /* JADX INFO: renamed from: l1 */
    public boolean m213688l1() {
        IntlMusicBean intlMusicBean = this.f196814e;
        return intlMusicBean != null && intlMusicBean.isUsing();
    }

    /* JADX INFO: renamed from: m1 */
    public boolean m213689m1() {
        return f196809t.equals(this.f196817h);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ Boolean m213690n1(int i, IntlMusicBean intlMusicBean) {
        return Boolean.valueOf(TextUtils.equals(this.f196816g.get(i).filePath, intlMusicBean.filePath));
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m213691o1(IntlMusicBean intlMusicBean) {
        IntlMusicBean intlMusicBean2 = this.f196814e;
        if (intlMusicBean2 == null || !TextUtils.equals(intlMusicBean.filePath, intlMusicBean2.filePath)) {
            intlMusicBean.playStatus = IntlMusicBean.STATUS_IDLE;
        } else {
            intlMusicBean.playStatus = this.f196814e.playStatus;
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m213692p1(gcg0 gcg0Var) {
        List list = (List) SafeJsonUtil.getInstance().fromJson(this.f196819j.get(), new C21481a().getType());
        if (jyb.m147479J(list)) {
            gcg0Var.onNext(new ArrayList());
        } else {
            jyb.m147537z(list, new y20() { // from class: l.mz10
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f139452a.m213691o1((IntlMusicBean) obj);
                }
            });
            gcg0Var.onNext(list);
        }
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ Boolean m213693q1(IntlMusicBean intlMusicBean) {
        return Boolean.valueOf(TextUtils.equals(intlMusicBean.filePath, this.f196814e.filePath));
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: r0 */
    public void mo120112r0(int i) {
        super.mo120112r0(i);
        fhw.m125605a(f196808s, "onPlayError:" + this.f196814e.filePath);
        IntlMusicBean intlMusicBean = this.f196814e;
        intlMusicBean.playStatus = IntlMusicBean.STATUS_IDLE;
        x2m x2mVar = this.f196818i;
        if (x2mVar != null) {
            x2mVar.mo107305N(intlMusicBean, i);
        }
        o1j0.m165649w(R$string.f48356s);
        m213682e1(jyb.m147507f0(this.f196814e));
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m213694r1(ArrayList arrayList) {
        this.f196819j.put(SafeJsonUtil.getInstance().toJson(arrayList));
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ Boolean m213695s1(Long l2) {
        IntlMusicBean intlMusicBean = this.f196814e;
        return Boolean.valueOf(intlMusicBean != null && intlMusicBean.isPlaying());
    }

    /* JADX INFO: renamed from: t1 */
    public C22421c<List<IntlMusicBean>> m213696t1() {
        return C22421c.create(new C22421c.a() { // from class: l.uz10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181697a.m213692p1((gcg0) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: u1 */
    public void m213697u1() {
        this.f196813d.mo107430a().mo73059j();
        this.f196814e.playStatus = IntlMusicBean.STATUS_PAUSED;
        fhw.m125605a(f196808s, "pausePlay");
        x2m x2mVar = this.f196818i;
        if (x2mVar != null) {
            x2mVar.mo107314w1(this.f196814e);
        }
    }

    /* JADX INFO: renamed from: v1 */
    public void m213698v1(IntlMusicBean intlMusicBean) {
        IntlMusicBean intlMusicBean2 = this.f196814e;
        if (intlMusicBean2 != null && intlMusicBean2.isUsing()) {
            m213677I1();
        }
        c0m c0mVar = this.f196813d;
        if (c0mVar != null) {
            this.f196814e = intlMusicBean;
            c0mVar.mo107430a().mo73039E(intlMusicBean.filePath, false);
        }
    }

    /* JADX INFO: renamed from: w1 */
    public void m213699w1() {
        int iM147476G = jyb.m147476G(this.f196816g, new qcj() { // from class: l.pz10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f154705a.m213693q1((IntlMusicBean) obj);
            }
        }) + 1;
        if (iM147476G >= this.f196816g.size()) {
            iM147476G = 0;
        }
        m213698v1(this.f196816g.get(iM147476G));
    }

    /* JADX INFO: renamed from: x1 */
    public void m213700x1(x2m x2mVar, c0m c0mVar, C22421c<BLiveVoiceCall> c22421c) {
        m213669A1(x2mVar);
        m213674F1(c0mVar);
        m213701y1(c22421c);
        m213702z1();
        m213676H1();
    }

    /* JADX INFO: renamed from: y1 */
    public void m213701y1(C22421c<BLiveVoiceCall> c22421c) {
        psd0.m173633z(this.f196820k);
        if (TextUtils.isEmpty(this.f196823n)) {
            return;
        }
        this.f196820k = c22421c.subscribe(dhw.m115829h(new y20() { // from class: l.lz10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134154a.m213684h1((BLiveVoiceCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z1 */
    public final void m213702z1() {
        psd0.m173633z(this.f196825p);
        this.f196826q = Act.isAppVisible();
        this.f196825p = Act.front().subscribe(dhw.m115829h(new y20() { // from class: l.oz10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149837a.m213685i1((Boolean) obj);
            }
        }));
    }
}
