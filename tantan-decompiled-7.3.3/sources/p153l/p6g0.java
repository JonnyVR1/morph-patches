package p153l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmaku;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResource;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuResource;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.storm.StormDanmakuViewModel;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p137rx.C22421c;
import p151v.VCheckBox;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class p6g0<T extends oo2> extends i6t<T, StormDanmakuViewModel> implements dse {

    /* JADX INFO: renamed from: i */
    public boolean f150845i;

    /* JADX INFO: renamed from: j */
    public kcg0 f150846j;

    /* JADX INFO: renamed from: k */
    public final jxd0 f150847k;

    /* JADX INFO: renamed from: l */
    public int f150848l;

    @SuppressLint({"InflateParams"})
    public p6g0(dum<T> dumVar) {
        super(dumVar);
        this.f150847k = new jxd0("confirm_send_storm_danmaku_dialog_show" + zrv.f205799a.m207631D0(), Boolean.TRUE);
        this.f150848l = -1;
        mo52715C((StormDanmakuViewModel) act().inflater().inflate(yec0.f198740E0, (ViewGroup) null));
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m170869J3(CompoundButton compoundButton, boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.dse
    /* JADX INFO: renamed from: K */
    public View mo117724K() {
        return (View) this.viewModel;
    }

    /* JADX INFO: renamed from: P3 */
    public void m170875P3() {
        m213811F2().EffectsDanmakuEvent.dismissEffectsDanmakuDialog().m199277p();
        m213811F2().ChatEvent.chatInputClick().mo199273j(new vv4(true, "").m202992b("1"));
    }

    /* JADX WARN: Type inference failed for: r10v13, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r8v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: R3 */
    public final void m170876R3(@NonNull String str, String str2, BLiveStormDanmakuResource bLiveStormDanmakuResource) {
        final BLiveStormDanmakuGiftResourceType bLiveStormDanmakuGiftResourceType;
        int length = str.length();
        if (length <= 5) {
            bLiveStormDanmakuGiftResourceType = BLiveStormDanmakuGiftResourceType.get(BLiveStormDanmakuGiftResourceType.f45294s);
        } else {
            bLiveStormDanmakuGiftResourceType = length <= 10 ? BLiveStormDanmakuGiftResourceType.get("m") : BLiveStormDanmakuGiftResourceType.get(BLiveStormDanmakuGiftResourceType.f45292l);
        }
        BLiveStormDanmakuGiftResource bLiveStormDanmakuGiftResource = (BLiveStormDanmakuGiftResource) jyb.m147529r(bLiveStormDanmakuResource.resources, new qcj() { // from class: l.l6g0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(bLiveStormDanmakuGiftResourceType, ((BLiveStormDanmakuGiftResource) obj).kind));
            }
        });
        if (bLiveStormDanmakuGiftResource != null) {
            String str3 = bLiveStormDanmakuGiftResource.giftId;
            if (!wqe.m207509d("video").m152745g(((hiv) zrv.m221194l(htd0.f111521c)).m135161m(str3).liveResourceId)) {
                o1j0.m165634h(R$string.f48042de);
                return;
            }
            hne0.C17513a c17513aM136082D = new hne0.C17513a().m136084u(str3, new C19306a(), 1, "bullet_storm", "bullet_storm", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.bulletstorm))).m136079A(false).m136082D(str);
            if (!TextUtils.isEmpty(str2)) {
                c17513aM136082D.m136081C(str2);
            }
            m213811F2().SendGiftEventGroup.sendGift().mo199273j(c17513aM136082D.m136083t());
            HashMap map = new HashMap();
            map.put("anchor_id", m213810E2().m168532l0().f56859id);
            map.put("bullet_storm_text", str);
            map.put("live_id", m213810E2().mo183435j().f45171id);
            i4g0.m138521s("e_live_bullet_storm_send", mo78457R2(), map);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public int m170877S3() {
        return this.f150848l;
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ Boolean m170878T3(BLiveStormDanmaku bLiveStormDanmaku) {
        return Boolean.valueOf(this.f150845i);
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m170879U3(BLiveStormDanmaku bLiveStormDanmaku) {
        this.f150848l = -1;
        ((StormDanmakuViewModel) this.viewModel).m73743P(bLiveStormDanmaku);
    }

    @Override // p153l.dse
    /* JADX INFO: renamed from: V */
    public boolean mo117725V() {
        return ((StormDanmakuViewModel) this.viewModel).m73739J();
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m170880V3(VCheckBox vCheckBox, String str, String str2, BLiveStormDanmakuResource bLiveStormDanmakuResource) {
        this.f150847k.put(Boolean.valueOf(!vCheckBox.isChecked()));
        m170876R3(str, str2, bLiveStormDanmakuResource);
    }

    /* JADX INFO: renamed from: W3 */
    public void m170881W3() {
        this.f150848l = -1;
        ((StormDanmakuViewModel) this.viewModel).m73742O();
    }

    /* JADX INFO: renamed from: X3 */
    public void m170882X3(int i) {
        if (this.f150848l == i) {
            i = -1;
        }
        this.f150848l = i;
        ((StormDanmakuViewModel) this.viewModel).m73742O();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2, l.vp20] */
    @Override // p153l.dse
    /* JADX INFO: renamed from: Y0 */
    public void mo117726Y0(sre sreVar) {
        this.f150845i = true;
        ((StormDanmakuViewModel) this.viewModel).m73744R(!sreVar.f170321b);
        m170883Y3();
        HashMap map = new HashMap();
        map.put("anchor_id", m213810E2().m168532l0().f56859id);
        map.put("live_id", m213810E2().mo183435j().f45171id);
        i4g0.m138527y("e_live_bullet_storm_send", mo78457R2(), map);
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m170883Y3() {
        User userM168532l0 = m213810E2().m168532l0();
        if (userM168532l0 == null) {
            return;
        }
        psd0.m173633z(this.f150846j);
        this.f150846j = duringCreated((C22421c<T>) LivingNormalApiProvider.m72566X5(userM168532l0.f56859id, m213810E2().m202191k(), m213810E2().m202194o())).filter(new qcj() { // from class: l.m6g0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((BLiveStormDanmaku) obj));
            }
        }).filter(new qcj() { // from class: l.n6g0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f140462a.m170878T3((BLiveStormDanmaku) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.o6g0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145166a.m170879U3((BLiveStormDanmaku) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z3 */
    public void m170884Z3(final String str, final String str2, final BLiveStormDanmakuResource bLiveStormDanmakuResource) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return;
        }
        if (!this.f150847k.get().booleanValue()) {
            m170876R3(str, str2, bLiveStormDanmakuResource);
            return;
        }
        View viewInflate = this.f196919f.inflater().inflate(yec0.f199186o0, (ViewGroup) null);
        final VCheckBox vCheckBox = (VCheckBox) viewInflate.findViewById(mdc0.f136273q0);
        vCheckBox.setChecked(true);
        vCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.j6g0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                p6g0.m170869J3(compoundButton, z);
            }
        });
        this.f196919f.dialog().m21519P(viewInflate, true).m21504F0(R$string.f48020ce, bLiveStormDanmakuResource.price).m21559v0(zrv.f205803e.getString(R$string.f48348rd), new Runnable() { // from class: l.k6g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f124176a.m170880V3(vCheckBox, str, str2, bLiveStormDanmakuResource);
            }
        }).m21542m0(zrv.f205803e.getString(R$string.f48510z)).m21566z().show();
    }

    /* JADX INFO: renamed from: a4 */
    public void m170885a4() {
        m213811F2().EffectsDanmakuEvent.showEffectsDanmakuDialog().mo199273j(new sre.C20136a().m187597c(EffectsDanmakuEvent$Page.STORM_RULE).m187595a());
    }

    /* JADX INFO: renamed from: b4 */
    public void m170886b4(int i) {
        m213811F2().EffectsDanmakuEvent.verticalTranslateDialogContent().mo199273j(Integer.valueOf(i));
    }

    @Override // p153l.dse
    /* JADX INFO: renamed from: g0 */
    public void mo117727g0(int i) {
        ((StormDanmakuViewModel) this.viewModel).m73747w(i);
    }

    @Override // p153l.dse
    /* JADX INFO: renamed from: w */
    public void mo117728w() {
        this.f150845i = false;
        psd0.m173633z(this.f150846j);
        ((StormDanmakuViewModel) this.viewModel).m73732A();
        ((StormDanmakuViewModel) this.viewModel).m73747w(0);
    }

    /* JADX INFO: renamed from: l.p6g0$a */
    public class C19306a implements aiv.C15716a.a {
        public C19306a() {
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: a */
        public void mo68349a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            ((StormDanmakuViewModel) p6g0.this.viewModel).m73749y();
            p6g0.this.m213811F2().EffectsDanmakuEvent.dismissEffectsDanmakuDialog().m199277p();
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: b */
        public void mo68350b() {
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: c */
        public void mo68351c() {
        }
    }
}
