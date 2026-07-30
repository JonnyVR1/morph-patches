package p149l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmaku;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResource;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuResource;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.storm.StormDanmakuViewModel;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p133rx.C22306c;
import p147v.VCheckBox;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class iyf0<T extends ho2> extends h4t<T, StormDanmakuViewModel> implements zqe {

    /* JADX INFO: renamed from: i */
    public boolean f115449i;

    /* JADX INFO: renamed from: j */
    public c4g0 f115450j;

    /* JADX INFO: renamed from: k */
    public final hpd0 f115451k;

    /* JADX INFO: renamed from: l */
    public int f115452l;

    @SuppressLint({"InflateParams"})
    public iyf0(bsm<T> bsmVar) {
        super(bsmVar);
        this.f115451k = new hpd0("confirm_send_storm_danmaku_dialog_show" + ypv.f199493a.m199309D0(), Boolean.TRUE);
        this.f115452l = -1;
        mo51532C((StormDanmakuViewModel) act().inflater().inflate(t6c0.f168008E0, (ViewGroup) null));
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m138963J3(CompoundButton compoundButton, boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.zqe
    /* JADX INFO: renamed from: K */
    public View mo138969K() {
        return (View) this.viewModel;
    }

    /* JADX INFO: renamed from: P3 */
    public void m138970P3() {
        m206028F2().EffectsDanmakuEvent.dismissEffectsDanmakuDialog().m172467p();
        m206028F2().ChatEvent.chatInputClick().mo172463j(new wu4(true, "").m205592b("1"));
    }

    /* JADX WARN: Type inference failed for: r10v13, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r8v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: R3 */
    public final void m138971R3(@NonNull String str, String str2, BLiveStormDanmakuResource bLiveStormDanmakuResource) {
        final BLiveStormDanmakuGiftResourceType bLiveStormDanmakuGiftResourceType;
        int length = str.length();
        if (length <= 5) {
            bLiveStormDanmakuGiftResourceType = BLiveStormDanmakuGiftResourceType.get(BLiveStormDanmakuGiftResourceType.f44446s);
        } else {
            bLiveStormDanmakuGiftResourceType = length <= 10 ? BLiveStormDanmakuGiftResourceType.get("m") : BLiveStormDanmakuGiftResourceType.get(BLiveStormDanmakuGiftResourceType.f44444l);
        }
        BLiveStormDanmakuGiftResource bLiveStormDanmakuGiftResource = (BLiveStormDanmakuGiftResource) vwb.m200346r(bLiveStormDanmakuResource.resources, new w9j() { // from class: l.eyf0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(bLiveStormDanmakuGiftResourceType, ((BLiveStormDanmakuGiftResource) obj).kind));
            }
        });
        if (bLiveStormDanmakuGiftResource != null) {
            String str3 = bLiveStormDanmakuGiftResource.giftId;
            if (!spe.m185365d("video").m152983g(((ggv) ypv.m215673l(fld0.f98148c)).m126027m(str3).liveResourceId)) {
                lsi0.m151578h(R$string.f47194de);
                return;
            }
            cfe0.C16123a c16123aM106528D = new cfe0.C16123a().m106530u(str3, new C17645a(), 1, "bullet_storm", "bullet_storm", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.bulletstorm))).m106525A(false).m106528D(str);
            if (!TextUtils.isEmpty(str2)) {
                c16123aM106528D.m106527C(str2);
            }
            m206028F2().SendGiftEventGroup.sendGift().mo172463j(c16123aM106528D.m106529t());
            HashMap map = new HashMap();
            map.put("anchor_id", m206027E2().m132146l0().f56011id);
            map.put("bullet_storm_text", str);
            map.put("live_id", m206027E2().mo149813j().f44323id);
            zvf0.m220397s("e_live_bullet_storm_send", mo77274R2(), map);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public int m138972S3() {
        return this.f115452l;
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ Boolean m138973T3(BLiveStormDanmaku bLiveStormDanmaku) {
        return Boolean.valueOf(this.f115449i);
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m138974U3(BLiveStormDanmaku bLiveStormDanmaku) {
        this.f115452l = -1;
        ((StormDanmakuViewModel) this.viewModel).m72560P(bLiveStormDanmaku);
    }

    @Override // p149l.zqe
    /* JADX INFO: renamed from: V */
    public boolean mo138975V() {
        return ((StormDanmakuViewModel) this.viewModel).m72556J();
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m138976V3(VCheckBox vCheckBox, String str, String str2, BLiveStormDanmakuResource bLiveStormDanmakuResource) {
        this.f115451k.put(Boolean.valueOf(!vCheckBox.isChecked()));
        m138971R3(str, str2, bLiveStormDanmakuResource);
    }

    /* JADX INFO: renamed from: W3 */
    public void m138977W3() {
        this.f115452l = -1;
        ((StormDanmakuViewModel) this.viewModel).m72559O();
    }

    /* JADX INFO: renamed from: X3 */
    public void m138978X3(int i) {
        if (this.f115452l == i) {
            i = -1;
        }
        this.f115452l = i;
        ((StormDanmakuViewModel) this.viewModel).m72559O();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2, l.lh20] */
    @Override // p149l.zqe
    /* JADX INFO: renamed from: Y0 */
    public void mo138979Y0(oqe oqeVar) {
        this.f115449i = true;
        ((StormDanmakuViewModel) this.viewModel).m72561R(!oqeVar.f145129b);
        m138980Y3();
        HashMap map = new HashMap();
        map.put("anchor_id", m206027E2().m132146l0().f56011id);
        map.put("live_id", m206027E2().mo149813j().f44323id);
        zvf0.m220403y("e_live_bullet_storm_send", mo77274R2(), map);
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m138980Y3() {
        User userM132146l0 = m206027E2().m132146l0();
        if (userM132146l0 == null) {
            return;
        }
        mkd0.m154992z(this.f115450j);
        this.f115450j = duringCreated((C22306c<T>) LivingNormalApiProvider.m71383X5(userM132146l0.f56011id, m206027E2().m149814k(), m206027E2().m149818o())).filter(new w9j() { // from class: l.fyf0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((BLiveStormDanmaku) obj));
            }
        }).filter(new w9j() { // from class: l.gyf0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f105015a.m138973T3((BLiveStormDanmaku) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.hyf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110110a.m138974U3((BLiveStormDanmaku) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z3 */
    public void m138981Z3(final String str, final String str2, final BLiveStormDanmakuResource bLiveStormDanmakuResource) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return;
        }
        if (!this.f115451k.get().booleanValue()) {
            m138971R3(str, str2, bLiveStormDanmakuResource);
            return;
        }
        View viewInflate = this.f188513f.inflater().inflate(t6c0.f168454o0, (ViewGroup) null);
        final VCheckBox vCheckBox = (VCheckBox) viewInflate.findViewById(g5c0.f101028q0);
        vCheckBox.setChecked(true);
        vCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.cyf0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                iyf0.m138963J3(compoundButton, z);
            }
        });
        this.f188513f.dialog().m20520P(viewInflate, true).m20505F0(R$string.f47172ce, bLiveStormDanmakuResource.price).m20560v0(ypv.f199497e.getString(R$string.f47500rd), new Runnable() { // from class: l.dyf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f88386a.m138976V3(vCheckBox, str, str2, bLiveStormDanmakuResource);
            }
        }).m20543m0(ypv.f199497e.getString(R$string.f47662z)).m20567z().show();
    }

    /* JADX INFO: renamed from: a4 */
    public void m138982a4() {
        m206028F2().EffectsDanmakuEvent.showEffectsDanmakuDialog().mo172463j(new oqe.C19001a().m165421c(EffectsDanmakuEvent$Page.STORM_RULE).m165419a());
    }

    /* JADX INFO: renamed from: b4 */
    public void m138983b4(int i) {
        m206028F2().EffectsDanmakuEvent.verticalTranslateDialogContent().mo172463j(Integer.valueOf(i));
    }

    @Override // p149l.zqe
    /* JADX INFO: renamed from: g0 */
    public void mo138984g0(int i) {
        ((StormDanmakuViewModel) this.viewModel).m72564w(i);
    }

    @Override // p149l.zqe
    /* JADX INFO: renamed from: w */
    public void mo138985w() {
        this.f115449i = false;
        mkd0.m154992z(this.f115450j);
        ((StormDanmakuViewModel) this.viewModel).m72549A();
        ((StormDanmakuViewModel) this.viewModel).m72564w(0);
    }

    /* JADX INFO: renamed from: l.iyf0$a */
    public class C17645a implements zfv.C21687a.a {
        public C17645a() {
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: a */
        public void mo67166a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            ((StormDanmakuViewModel) iyf0.this.viewModel).m72566y();
            iyf0.this.m206028F2().EffectsDanmakuEvent.dismissEffectsDanmakuDialog().m172467p();
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: b */
        public void mo67167b() {
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: c */
        public void mo67168c() {
        }
    }
}
