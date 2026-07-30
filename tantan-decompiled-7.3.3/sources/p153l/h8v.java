package p153l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.ProfileZodiac;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareHeaderBean;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareTabBean;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceSquareSpecChannelPopupBean;
import com.p051p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes9.dex */
public class h8v extends cyr<i9v> {

    /* JADX INFO: renamed from: a */
    public final nus f108268a;

    /* JADX INFO: renamed from: b */
    public o9v f108269b;

    /* JADX INFO: renamed from: c */
    public String f108270c;

    /* JADX INFO: renamed from: d */
    public List<r6s> f108271d;

    /* JADX INFO: renamed from: e */
    public String f108272e;

    /* JADX INFO: renamed from: f */
    public tcv f108273f;

    /* JADX INFO: renamed from: g */
    public jbt f108274g;

    public h8v(nus nusVar) {
        super(nusVar.f143738b);
        this.f108271d = new ArrayList();
        this.f108268a = nusVar;
        this.f108269b = new o9v(nusVar);
    }

    /* JADX INFO: renamed from: I2 */
    private void m133961I2() {
        if (((i9v) this.viewModel).f113512d.m224996B()) {
            ((i9v) this.viewModel).f113512d.m225021t();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u2 */
    public static /* synthetic */ PushMessage m133965u2(pf60 pf60Var) {
        return (PushMessage) pf60Var.f152156a;
    }

    /* JADX INFO: renamed from: z2 */
    public static /* synthetic */ void m133969z2(Throwable th) {
    }

    /* JADX INFO: renamed from: F2 */
    public void m133970F2(i9v i9vVar) {
        super.mo52715C(i9vVar);
    }

    /* JADX INFO: renamed from: H2 */
    public final BaseLiveListBean<LiveVoiceInternalSquareTabBean> m133971H2() {
        BaseLiveListBean<LiveVoiceInternalSquareTabBean> baseLiveListBean = new BaseLiveListBean<>();
        ArrayList arrayList = new ArrayList();
        LiveVoiceInternalSquareTabBean liveVoiceInternalSquareTabBean = new LiveVoiceInternalSquareTabBean();
        liveVoiceInternalSquareTabBean.setTabId("0");
        liveVoiceInternalSquareTabBean.setName("推荐");
        arrayList.add(liveVoiceInternalSquareTabBean);
        baseLiveListBean.setList(arrayList);
        return baseLiveListBean;
    }

    /* JADX INFO: renamed from: K2 */
    public nus m133972K2() {
        return this.f108268a;
    }

    /* JADX INFO: renamed from: L2 */
    public final void m133973L2(List<r6s> list) {
        this.f108271d.clear();
        this.f108271d.addAll(list);
        hk4 hk4Var = new hk4(this);
        hk4Var.m135618d("0");
        ((i9v) this.viewModel).f113514f.m71071b0(e4s.m119474b(hk4Var, this.f108271d));
    }

    /* JADX INFO: renamed from: M2 */
    public void m133974M2() {
        if (this.f108273f == null) {
            this.f108273f = new tcv(this.f108268a, ((i9v) this.viewModel).f113511c);
        }
        this.f108273f.m190506w2();
    }

    /* JADX INFO: renamed from: N2 */
    public void m133975N2() {
        m133985Y2();
        m133986Z2();
        duringCreated(psd0.m173625r(z0n.m218136a().m218139d(), lifecycle(), new cu30())).filter(new qcj() { // from class: l.u7v
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(C4470c.f16267i == ((pf60) obj).f152157b);
            }
        }).map(new qcj() { // from class: l.y7v
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return h8v.m133965u2((pf60) obj);
            }
        }).filter(new qcj() { // from class: l.z7v
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(z0n.m218137b(((PushMessage) obj).messageCustom.liveMode));
            }
        }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.a8v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68962a.m133976P2((PushMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P2 */
    public final /* synthetic */ void m133976P2(PushMessage pushMessage) {
        mbs.m157853g().mo31772hj(this.viewModel, pushMessage);
    }

    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ void m133977Q2(LiveVoiceInternalSquareHeaderBean liveVoiceInternalSquareHeaderBean) {
        bnl0.m105524M(((i9v) this.viewModel).f113514f, NullChecker.m82486a(liveVoiceInternalSquareHeaderBean));
        if (liveVoiceInternalSquareHeaderBean == null) {
            return;
        }
        ((i9v) this.viewModel).f113514f.m71072c0(this.f108268a.f143738b, liveVoiceInternalSquareHeaderBean.getEntrys());
        m133973L2(liveVoiceInternalSquareHeaderBean.getCards());
        m133961I2();
    }

    /* JADX INFO: renamed from: R2 */
    public final /* synthetic */ void m133978R2(Throwable th) {
        bnl0.m105524M(((i9v) this.viewModel).f113514f, false);
        m133961I2();
    }

    /* JADX INFO: renamed from: S2 */
    public final /* synthetic */ void m133979S2(BaseLiveListBean baseLiveListBean) {
        if (baseLiveListBean != null && baseLiveListBean.getList() != null) {
            this.f108269b.m166816v2(baseLiveListBean, this.f108270c, this.f108272e);
        } else {
            this.f108269b.m166816v2(m133971H2(), this.f108270c, this.f108272e);
            CrashHelper.m82479c(new IllegalArgumentException("live virtual square tab list is null"));
        }
    }

    /* JADX INFO: renamed from: T2 */
    public final /* synthetic */ void m133980T2(Throwable th) {
        this.f108269b.m166816v2(m133971H2(), this.f108270c, this.f108272e);
        CrashHelper.m82479c(new IllegalArgumentException("live virtual square tab request error", th));
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m133981U2(LiveVoiceSquareSpecChannelPopupBean liveVoiceSquareSpecChannelPopupBean, View view) {
        if (liveVoiceSquareSpecChannelPopupBean.getTrackData() != null) {
            i4g0.m138523u("e_audio_room_guide_pop_button", liveVoiceSquareSpecChannelPopupBean.getTrackData().getPageId(), new pf60("popup_type", liveVoiceSquareSpecChannelPopupBean.getTrackData().get("voice_template")), new pf60("button_type", "close"));
        }
        this.f108274g.dismiss();
    }

    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m133982V2(LiveVoiceSquareSpecChannelPopupBean liveVoiceSquareSpecChannelPopupBean, View view) {
        if (liveVoiceSquareSpecChannelPopupBean.getGoAction() == null) {
            return;
        }
        yrs.m217233a(this.f108268a.m164819a(), liveVoiceSquareSpecChannelPopupBean.getGoAction());
        LiveCardTracker.trackMc(liveVoiceSquareSpecChannelPopupBean.getTrackData());
        this.f108274g.dismiss();
    }

    /* JADX INFO: renamed from: W2 */
    public final /* synthetic */ void m133983W2(LiveVoiceSquareSpecChannelPopupBean liveVoiceSquareSpecChannelPopupBean, View view) {
        if (liveVoiceSquareSpecChannelPopupBean.getGoAction() == null) {
            return;
        }
        yrs.m217233a(this.f108268a.m164819a(), liveVoiceSquareSpecChannelPopupBean.getGoAction());
        LiveCardTracker.trackMc(liveVoiceSquareSpecChannelPopupBean.getTrackData());
        this.f108274g.dismiss();
    }

    /* JADX INFO: renamed from: X2 */
    public void m133984X2() {
        m133985Y2();
        o9v o9vVar = this.f108269b;
        if (o9vVar != null) {
            o9vVar.m166815u2();
        }
        tcv tcvVar = this.f108273f;
        if (tcvVar != null) {
            tcvVar.m190505C2();
        }
    }

    /* JADX INFO: renamed from: Y2 */
    public void m133985Y2() {
        duringCreated(LiveVoiceInternalSquareApi.requestHeaders()).subscribe(dhw.m115826e(new y20() { // from class: l.d8v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85690a.m133977Q2((LiveVoiceInternalSquareHeaderBean) obj);
            }
        }, new y20() { // from class: l.e8v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92568a.m133978R2((Throwable) obj);
            }
        }));
        itd0<gm3> itd0Var = itd0.f116821c;
        if (((gm3) tbs.m190077m(itd0Var)).f104916f) {
            return;
        }
        ((gm3) tbs.m190077m(itd0Var)).f104916f = true;
        duringCreated(LiveVoiceInternalSquareApi.squarePopup()).subscribe(dhw.m115826e(new y20() { // from class: l.f8v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97773a.m133989c3((LiveVoiceSquareSpecChannelPopupBean) obj);
            }
        }, new y20() { // from class: l.g8v
            @Override // p153l.y20
            public final void call(Object obj) {
                h8v.m133969z2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m133986Z2() {
        duringCreated(LiveVoiceInternalSquareApi.requestTab()).subscribe(dhw.m115826e(new y20() { // from class: l.b8v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75480a.m133979S2((BaseLiveListBean) obj);
            }
        }, new y20() { // from class: l.c8v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80248a.m133980T2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a3 */
    public void m133987a3(String str) {
        this.f108270c = str;
        o9v o9vVar = this.f108269b;
        if (o9vVar != null) {
            o9vVar.m166817w2(str);
        }
    }

    /* JADX INFO: renamed from: b3 */
    public void m133988b3(String str) {
        this.f108272e = str;
    }

    /* JADX INFO: renamed from: c3 */
    public final void m133989c3(final LiveVoiceSquareSpecChannelPopupBean liveVoiceSquareSpecChannelPopupBean) {
        if (liveVoiceSquareSpecChannelPopupBean == null || TextUtils.isEmpty(liveVoiceSquareSpecChannelPopupBean.getType())) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f108268a.m164819a()).inflate(xec0.f193876i2, (ViewGroup) null);
        this.f108274g = new jbt(this.f108268a.m164819a(), frameLayout);
        ((TextView) frameLayout.findViewById(ldc0.f131500R1)).setText(liveVoiceSquareSpecChannelPopupBean.getTitle());
        VDraweeView vDraweeView = (VDraweeView) frameLayout.findViewById(ldc0.f131606u0);
        izs.m142869t("context_square", vDraweeView, liveVoiceSquareSpecChannelPopupBean.getIcon(), qa00.m175859d(100.0f));
        AnimEffectPlayer animEffectPlayer = (AnimEffectPlayer) frameLayout.findViewById(ldc0.f131444C1);
        View viewFindViewById = frameLayout.findViewById(ldc0.f131570l0);
        VImage vImage = (VImage) frameLayout.findViewById(ldc0.f131566k0);
        TextView textView = (TextView) frameLayout.findViewById(ldc0.f131541e);
        TextView textView2 = (TextView) frameLayout.findViewById(ldc0.f131485M2);
        TextView textView3 = (TextView) frameLayout.findViewById(ldc0.f131436A1);
        if (TextUtils.equals(liveVoiceSquareSpecChannelPopupBean.getType(), "game")) {
            animEffectPlayer.mo69680g("https://auto.tancdn.com/v1/raw/4b095ed8-ed24-4e45-93e2-54e0dca9e5c014.svga", -1, null, true);
            bnl0.m105524M(viewFindViewById, false);
            bnl0.m105524M(textView2, false);
            bnl0.m105524M(textView3, true);
            textView3.setText(liveVoiceSquareSpecChannelPopupBean.getSubtitle());
            qnp0.m177261d1(vDraweeView, qa00.m175859d(10.0f));
        } else if (liveVoiceSquareSpecChannelPopupBean.getUserInfo() != null) {
            animEffectPlayer.mo69680g("https://auto.tancdn.com/v1/raw/e64b0c62-d2bc-4f77-995c-ebc830fd418414.svga", -1, null, true);
            bnl0.m105524M(viewFindViewById, true);
            bnl0.m105524M(textView2, true);
            bnl0.m105524M(textView3, false);
            vImage.setBackgroundResource(TextUtils.equals(liveVoiceSquareSpecChannelPopupBean.getUserInfo().gender, "male") ? obc0.f146216V5 : obc0.f146194T5);
            qnp0.m177261d1(vDraweeView, qa00.m175859d(48.0f));
            viewFindViewById.setBackground(jde.m144406b(TextUtils.equals(liveVoiceSquareSpecChannelPopupBean.getUserInfo().gender, "male") ? n3d0.m161277a(m9c0.f135399x) : n3d0.m161277a(m9c0.f135398w), qa00.m175859d(4.0f)));
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setText(String.valueOf(liveVoiceSquareSpecChannelPopupBean.getUserInfo().age));
            textView2.setText(q8g0.m175804j0(ProfileZodiac.get(liveVoiceSquareSpecChannelPopupBean.getUserInfo().zodiac)));
        }
        bnl0.m105509E0(frameLayout.findViewById(ldc0.f131434A), new View.OnClickListener() { // from class: l.v7v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182823a.m133981U2(liveVoiceSquareSpecChannelPopupBean, view);
            }
        });
        ((TextView) frameLayout.findViewById(ldc0.f131466I)).setText(liveVoiceSquareSpecChannelPopupBean.getButtonText());
        LiveCardTracker.trackMv(liveVoiceSquareSpecChannelPopupBean.getTrackData());
        bnl0.m105509E0(frameLayout.findViewById(ldc0.f131466I), new View.OnClickListener() { // from class: l.w7v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187809a.m133982V2(liveVoiceSquareSpecChannelPopupBean, view);
            }
        });
        bnl0.m105509E0(vDraweeView, new View.OnClickListener() { // from class: l.x7v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192756a.m133983W2(liveVoiceSquareSpecChannelPopupBean, view);
            }
        });
        this.f108274g.show();
    }

    /* JADX INFO: renamed from: r */
    public void m133990r() {
        ((i9v) this.viewModel).m139154r();
        ((i9v) this.viewModel).m139152d(this.f108268a.m164819a());
        this.f108273f.m190507y2();
        o9v o9vVar = this.f108269b;
        V v2 = this.viewModel;
        o9vVar.mo52715C(new u9v(((i9v) v2).f113515g, ((i9v) v2).f113516h));
    }
}
