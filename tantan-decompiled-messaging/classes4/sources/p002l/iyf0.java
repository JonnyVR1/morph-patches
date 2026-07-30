package p002l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.storm.StormDanmakuViewModel;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.data.BLiveStormDanmaku;
import com.p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResource;
import com.p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p1.mobile.putong.live.base.data.BLiveStormDanmakuResource;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.bwr;
import l.c4g0;
import l.e30;
import l.ffw;
import l.fld0;
import l.ggv;
import l.hpd0;
import l.lsi0;
import l.mkd0;
import l.vwb;
import l.w9j;
import l.ypv;
import l.zvf0;
import p002l.ho2;
import v.VCheckBox;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class iyf0<T extends ho2> extends h4t<T, StormDanmakuViewModel> implements zqe {

    /* JADX INFO: renamed from: i */
    public boolean f13480i;

    /* JADX INFO: renamed from: j */
    public c4g0 f13481j;

    /* JADX INFO: renamed from: k */
    public final hpd0 f13482k;

    /* JADX INFO: renamed from: l */
    public int f13483l;

    @SuppressLint({"InflateParams"})
    public iyf0(bsm<T> bsmVar) {
        super(bsmVar);
        this.f13482k = new hpd0("confirm_send_storm_danmaku_dialog_show" + ypv.a.D0(), Boolean.TRUE);
        this.f13483l = -1;
        C((StormDanmakuViewModel) act().inflater().inflate(t6c0.f19504E0, (ViewGroup) null));
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m15506J3(CompoundButton compoundButton, boolean z) {
    }

    @Override // p002l.zqe
    /* JADX INFO: renamed from: K */
    public View mo15512K() {
        return ((bwr) this).viewModel;
    }

    /* JADX INFO: renamed from: P3 */
    public void m15513P3() {
        m25548F2().EffectsDanmakuEvent.dismissEffectsDanmakuDialog().p();
        m25548F2().ChatEvent.chatInputClick().j(new wu4(true, "").m25482b("1"));
    }

    /* JADX WARN: Type inference failed for: r10v13, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r8v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: R3 */
    public final void m15514R3(@NonNull String str, String str2, BLiveStormDanmakuResource bLiveStormDanmakuResource) {
        final BLiveStormDanmakuGiftResourceType bLiveStormDanmakuGiftResourceType;
        int length = str.length();
        if (length <= 5) {
            bLiveStormDanmakuGiftResourceType = BLiveStormDanmakuGiftResourceType.get("s");
        } else {
            bLiveStormDanmakuGiftResourceType = length <= 10 ? BLiveStormDanmakuGiftResourceType.get("m") : BLiveStormDanmakuGiftResourceType.get("l");
        }
        BLiveStormDanmakuGiftResource bLiveStormDanmakuGiftResource = (BLiveStormDanmakuGiftResource) vwb.r(bLiveStormDanmakuResource.resources, new w9j() { // from class: l.eyf0
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(bLiveStormDanmakuGiftResourceType, ((BLiveStormDanmakuGiftResource) obj).kind));
            }
        });
        if (bLiveStormDanmakuGiftResource != null) {
            String str3 = bLiveStormDanmakuGiftResource.giftId;
            if (!spe.m22604d("video").m17696g(((ggv) ypv.l(fld0.c)).m(str3).liveResourceId)) {
                lsi0.h(R$string.f3236de);
                return;
            }
            cfe0.C0512a c0512aM10981D = new cfe0.C0512a().m10983u(str3, new C0625a(), 1, "bullet_storm", "bullet_storm", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get("bulletstorm"))).m10978A(false).m10981D(str);
            if (!TextUtils.isEmpty(str2)) {
                c0512aM10981D.m10980C(str2);
            }
            m25548F2().SendGiftEventGroup.sendGift().j(c0512aM10981D.m10982t());
            HashMap map = new HashMap();
            map.put("anchor_id", ((DbObject) m25547E2().m14582l0()).id);
            map.put("bullet_storm_text", str);
            map.put("live_id", m25547E2().m17234j().id);
            zvf0.s("e_live_bullet_storm_send", mo21430R2(), map);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public int m15515S3() {
        return this.f13483l;
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ Boolean m15516T3(BLiveStormDanmaku bLiveStormDanmaku) {
        return Boolean.valueOf(this.f13480i);
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m15517U3(BLiveStormDanmaku bLiveStormDanmaku) {
        this.f13483l = -1;
        ((StormDanmakuViewModel) ((bwr) this).viewModel).m6055P(bLiveStormDanmaku);
    }

    @Override // p002l.zqe
    /* JADX INFO: renamed from: V */
    public boolean mo15518V() {
        return ((StormDanmakuViewModel) ((bwr) this).viewModel).m6051J();
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m15519V3(VCheckBox vCheckBox, String str, String str2, BLiveStormDanmakuResource bLiveStormDanmakuResource) {
        this.f13482k.put(Boolean.valueOf(!vCheckBox.isChecked()));
        m15514R3(str, str2, bLiveStormDanmakuResource);
    }

    /* JADX INFO: renamed from: W3 */
    public void m15520W3() {
        this.f13483l = -1;
        ((StormDanmakuViewModel) ((bwr) this).viewModel).m6054O();
    }

    /* JADX INFO: renamed from: X3 */
    public void m15521X3(int i) {
        if (this.f13483l == i) {
            i = -1;
        }
        this.f13483l = i;
        ((StormDanmakuViewModel) ((bwr) this).viewModel).m6054O();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2, l.lh20] */
    @Override // p002l.zqe
    /* JADX INFO: renamed from: Y0 */
    public void mo15522Y0(oqe oqeVar) {
        this.f13480i = true;
        ((StormDanmakuViewModel) ((bwr) this).viewModel).m6056R(!oqeVar.f16747b);
        m15523Y3();
        HashMap map = new HashMap();
        map.put("anchor_id", ((DbObject) m25547E2().m14582l0()).id);
        map.put("live_id", m25547E2().m17234j().id);
        zvf0.y("e_live_bullet_storm_send", mo21430R2(), map);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: Y3 */
    public final void m15523Y3() {
        User userM14582l0 = m25547E2().m14582l0();
        if (userM14582l0 == null) {
            return;
        }
        mkd0.z(this.f13481j);
        this.f13481j = duringCreated(LivingNormalApiProvider.m4749X5(((DbObject) userM14582l0).id, m25547E2().m17235k(), m25547E2().m17239o())).filter(new w9j() { // from class: l.fyf0
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((BLiveStormDanmaku) obj));
            }
        }).filter(new w9j() { // from class: l.gyf0
            public final Object call(Object obj) {
                return this.f11683a.m15516T3((BLiveStormDanmaku) obj);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.hyf0
            public final void call(Object obj) {
                this.f12362a.m15517U3((BLiveStormDanmaku) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z3 */
    public void m15524Z3(final String str, final String str2, final BLiveStormDanmakuResource bLiveStormDanmakuResource) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return;
        }
        if (!((Boolean) this.f13482k.get()).booleanValue()) {
            m15514R3(str, str2, bLiveStormDanmakuResource);
            return;
        }
        View viewInflate = this.f22037f.inflater().inflate(t6c0.f19950o0, (ViewGroup) null);
        final VCheckBox vCheckBoxFindViewById = viewInflate.findViewById(g5c0.f11178q0);
        vCheckBoxFindViewById.setChecked(true);
        vCheckBoxFindViewById.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.cyf0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                iyf0.m15506J3(compoundButton, z);
            }
        });
        this.f22037f.dialog().P(viewInflate, true).F0(R$string.f3214ce, new Object[]{bLiveStormDanmakuResource.price}).v0(ypv.e.getString(R$string.f3542rd), new Runnable() { // from class: l.dyf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9481a.m15519V3(vCheckBoxFindViewById, str, str2, bLiveStormDanmakuResource);
            }
        }).m0(ypv.e.getString(R$string.f3704z)).z().show();
    }

    /* JADX INFO: renamed from: a4 */
    public void m15525a4() {
        m25548F2().EffectsDanmakuEvent.showEffectsDanmakuDialog().j(new oqe.C0730a().m19682c(EffectsDanmakuEvent$Page.STORM_RULE).m19680a());
    }

    /* JADX INFO: renamed from: b4 */
    public void m15526b4(int i) {
        m25548F2().EffectsDanmakuEvent.verticalTranslateDialogContent().j(Integer.valueOf(i));
    }

    @Override // p002l.zqe
    /* JADX INFO: renamed from: g0 */
    public void mo15527g0(int i) {
        ((StormDanmakuViewModel) ((bwr) this).viewModel).m6060w(i);
    }

    @Override // p002l.zqe
    /* JADX INFO: renamed from: w */
    public void mo15528w() {
        this.f13480i = false;
        mkd0.z(this.f13481j);
        ((StormDanmakuViewModel) ((bwr) this).viewModel).m6043A();
        ((StormDanmakuViewModel) ((bwr) this).viewModel).m6060w(0);
    }

    /* JADX INFO: renamed from: l.iyf0$a */
    public class C0625a implements zfv.C0940a.a {
        public C0625a() {
        }

        @Override // p002l.zfv.C0940a.a
        /* JADX INFO: renamed from: a */
        public void mo5855a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            ((StormDanmakuViewModel) ((bwr) iyf0.this).viewModel).m6062y();
            iyf0.this.m25548F2().EffectsDanmakuEvent.dismissEffectsDanmakuDialog().p();
        }

        @Override // p002l.zfv.C0940a.a
        /* JADX INFO: renamed from: b */
        public void mo5856b() {
        }

        @Override // p002l.zfv.C0940a.a
        /* JADX INFO: renamed from: c */
        public void mo5857c() {
        }
    }
}
