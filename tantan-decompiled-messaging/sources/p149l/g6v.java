package p149l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.ProfileZodiac;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareHeaderBean;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareTabBean;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceSquareSpecChannelPopupBean;
import com.p046p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class g6v extends bwr<h7v> {

    /* JADX INFO: renamed from: a */
    public final mss f101308a;

    /* JADX INFO: renamed from: b */
    public n7v f101309b;

    /* JADX INFO: renamed from: c */
    public String f101310c;

    /* JADX INFO: renamed from: d */
    public List<q4s> f101311d;

    /* JADX INFO: renamed from: e */
    public String f101312e;

    /* JADX INFO: renamed from: f */
    public sav f101313f;

    /* JADX INFO: renamed from: g */
    public i9t f101314g;

    public g6v(mss mssVar) {
        super(mssVar.f135531b);
        this.f101311d = new ArrayList();
        this.f101308a = mssVar;
        this.f101309b = new n7v(mssVar);
    }

    /* JADX INFO: renamed from: I2 */
    private void m124636I2() {
        if (((h7v) this.viewModel).f106343d.m223750B()) {
            ((h7v) this.viewModel).f106343d.m223775t();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u2 */
    public static /* synthetic */ PushMessage m124640u2(j760 j760Var) {
        return (PushMessage) j760Var.f116564a;
    }

    /* JADX INFO: renamed from: z2 */
    public static /* synthetic */ void m124644z2(Throwable th) {
    }

    /* JADX INFO: renamed from: F2 */
    public void m124645F2(h7v h7vVar) {
        super.mo51532C(h7vVar);
    }

    /* JADX INFO: renamed from: H2 */
    public final BaseLiveListBean<LiveVoiceInternalSquareTabBean> m124646H2() {
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
    public mss m124647K2() {
        return this.f101308a;
    }

    /* JADX INFO: renamed from: L2 */
    public final void m124648L2(List<q4s> list) {
        this.f101311d.clear();
        this.f101311d.addAll(list);
        ij4 ij4Var = new ij4(this);
        ij4Var.m136507d("0");
        ((h7v) this.viewModel).f106345f.m69888b0(d2s.m109829b(ij4Var, this.f101311d));
    }

    /* JADX INFO: renamed from: M2 */
    public void m124649M2() {
        if (this.f101313f == null) {
            this.f101313f = new sav(this.f101308a, ((h7v) this.viewModel).f106342c);
        }
        this.f101313f.m183109w2();
    }

    /* JADX INFO: renamed from: N2 */
    public void m124650N2() {
        m124660Y2();
        m124661Z2();
        duringCreated(mkd0.m154984r(zym.m220932a().m220935d(), lifecycle(), new ol30())).filter(new w9j() { // from class: l.t5v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(C4319c.f15548i == ((j760) obj).f116565b);
            }
        }).map(new w9j() { // from class: l.x5v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return g6v.m124640u2((j760) obj);
            }
        }).filter(new w9j() { // from class: l.y5v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(zym.m220933b(((PushMessage) obj).messageCustom.liveMode));
            }
        }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.z5v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201865a.m124651P2((PushMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P2 */
    public final /* synthetic */ void m124651P2(PushMessage pushMessage) {
        l9s.m149076g().mo30769hj(this.viewModel, pushMessage);
    }

    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ void m124652Q2(LiveVoiceInternalSquareHeaderBean liveVoiceInternalSquareHeaderBean) {
        xdl0.m208344M(((h7v) this.viewModel).f106345f, NullChecker.m81303a(liveVoiceInternalSquareHeaderBean));
        if (liveVoiceInternalSquareHeaderBean == null) {
            return;
        }
        ((h7v) this.viewModel).f106345f.m69889c0(this.f101308a.f135531b, liveVoiceInternalSquareHeaderBean.getEntrys());
        m124648L2(liveVoiceInternalSquareHeaderBean.getCards());
        m124636I2();
    }

    /* JADX INFO: renamed from: R2 */
    public final /* synthetic */ void m124653R2(Throwable th) {
        xdl0.m208344M(((h7v) this.viewModel).f106345f, false);
        m124636I2();
    }

    /* JADX INFO: renamed from: S2 */
    public final /* synthetic */ void m124654S2(BaseLiveListBean baseLiveListBean) {
        if (baseLiveListBean != null && baseLiveListBean.getList() != null) {
            this.f101309b.m158168v2(baseLiveListBean, this.f101310c, this.f101312e);
        } else {
            this.f101309b.m158168v2(m124646H2(), this.f101310c, this.f101312e);
            CrashHelper.m81296c(new IllegalArgumentException("live virtual square tab list is null"));
        }
    }

    /* JADX INFO: renamed from: T2 */
    public final /* synthetic */ void m124655T2(Throwable th) {
        this.f101309b.m158168v2(m124646H2(), this.f101310c, this.f101312e);
        CrashHelper.m81296c(new IllegalArgumentException("live virtual square tab request error", th));
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m124656U2(LiveVoiceSquareSpecChannelPopupBean liveVoiceSquareSpecChannelPopupBean, View view) {
        if (liveVoiceSquareSpecChannelPopupBean.getTrackData() != null) {
            zvf0.m220399u("e_audio_room_guide_pop_button", liveVoiceSquareSpecChannelPopupBean.getTrackData().getPageId(), new j760("popup_type", liveVoiceSquareSpecChannelPopupBean.getTrackData().get("voice_template")), new j760("button_type", "close"));
        }
        this.f101314g.dismiss();
    }

    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m124657V2(LiveVoiceSquareSpecChannelPopupBean liveVoiceSquareSpecChannelPopupBean, View view) {
        if (liveVoiceSquareSpecChannelPopupBean.getGoAction() == null) {
            return;
        }
        xps.m210534a(this.f101308a.m156171a(), liveVoiceSquareSpecChannelPopupBean.getGoAction());
        LiveCardTracker.trackMc(liveVoiceSquareSpecChannelPopupBean.getTrackData());
        this.f101314g.dismiss();
    }

    /* JADX INFO: renamed from: W2 */
    public final /* synthetic */ void m124658W2(LiveVoiceSquareSpecChannelPopupBean liveVoiceSquareSpecChannelPopupBean, View view) {
        if (liveVoiceSquareSpecChannelPopupBean.getGoAction() == null) {
            return;
        }
        xps.m210534a(this.f101308a.m156171a(), liveVoiceSquareSpecChannelPopupBean.getGoAction());
        LiveCardTracker.trackMc(liveVoiceSquareSpecChannelPopupBean.getTrackData());
        this.f101314g.dismiss();
    }

    /* JADX INFO: renamed from: X2 */
    public void m124659X2() {
        m124660Y2();
        n7v n7vVar = this.f101309b;
        if (n7vVar != null) {
            n7vVar.m158167u2();
        }
        sav savVar = this.f101313f;
        if (savVar != null) {
            savVar.m183108C2();
        }
    }

    /* JADX INFO: renamed from: Y2 */
    public void m124660Y2() {
        duringCreated(LiveVoiceInternalSquareApi.requestHeaders()).subscribe(ffw.m121194e(new e30() { // from class: l.c6v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79574a.m124652Q2((LiveVoiceInternalSquareHeaderBean) obj);
            }
        }, new e30() { // from class: l.d6v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84671a.m124653R2((Throwable) obj);
            }
        }));
        gld0<hl3> gld0Var = gld0.f103313c;
        if (((hl3) s9s.m182763m(gld0Var)).f108313f) {
            return;
        }
        ((hl3) s9s.m182763m(gld0Var)).f108313f = true;
        duringCreated(LiveVoiceInternalSquareApi.squarePopup()).subscribe(ffw.m121194e(new e30() { // from class: l.e6v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89638a.m124664c3((LiveVoiceSquareSpecChannelPopupBean) obj);
            }
        }, new e30() { // from class: l.f6v
            @Override // p149l.e30
            public final void call(Object obj) {
                g6v.m124644z2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m124661Z2() {
        duringCreated(LiveVoiceInternalSquareApi.requestTab()).subscribe(ffw.m121194e(new e30() { // from class: l.a6v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67803a.m124654S2((BaseLiveListBean) obj);
            }
        }, new e30() { // from class: l.b6v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73882a.m124655T2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a3 */
    public void m124662a3(String str) {
        this.f101310c = str;
        n7v n7vVar = this.f101309b;
        if (n7vVar != null) {
            n7vVar.m158169w2(str);
        }
    }

    /* JADX INFO: renamed from: b3 */
    public void m124663b3(String str) {
        this.f101312e = str;
    }

    /* JADX INFO: renamed from: c3 */
    public final void m124664c3(final LiveVoiceSquareSpecChannelPopupBean liveVoiceSquareSpecChannelPopupBean) {
        if (liveVoiceSquareSpecChannelPopupBean == null || TextUtils.isEmpty(liveVoiceSquareSpecChannelPopupBean.getType())) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f101308a.m156171a()).inflate(s6c0.f162762i2, (ViewGroup) null);
        this.f101314g = new i9t(this.f101308a.m156171a(), frameLayout);
        ((TextView) frameLayout.findViewById(f5c0.f95043R1)).setText(liveVoiceSquareSpecChannelPopupBean.getTitle());
        VDraweeView vDraweeView = (VDraweeView) frameLayout.findViewById(f5c0.f95149u0);
        hxs.m133407t("context_square", vDraweeView, liveVoiceSquareSpecChannelPopupBean.getIcon(), t100.m186890d(100.0f));
        AnimEffectPlayer animEffectPlayer = (AnimEffectPlayer) frameLayout.findViewById(f5c0.f94987C1);
        View viewFindViewById = frameLayout.findViewById(f5c0.f95113l0);
        VImage vImage = (VImage) frameLayout.findViewById(f5c0.f95109k0);
        TextView textView = (TextView) frameLayout.findViewById(f5c0.f95084e);
        TextView textView2 = (TextView) frameLayout.findViewById(f5c0.f95028M2);
        TextView textView3 = (TextView) frameLayout.findViewById(f5c0.f94979A1);
        if (TextUtils.equals(liveVoiceSquareSpecChannelPopupBean.getType(), "game")) {
            animEffectPlayer.mo68497g("https://auto.tancdn.com/v1/raw/4b095ed8-ed24-4e45-93e2-54e0dca9e5c014.svga", -1, null, true);
            xdl0.m208344M(viewFindViewById, false);
            xdl0.m208344M(textView2, false);
            xdl0.m208344M(textView3, true);
            textView3.setText(liveVoiceSquareSpecChannelPopupBean.getSubtitle());
            mep0.m154302d1(vDraweeView, t100.m186890d(10.0f));
        } else if (liveVoiceSquareSpecChannelPopupBean.getUserInfo() != null) {
            animEffectPlayer.mo68497g("https://auto.tancdn.com/v1/raw/e64b0c62-d2bc-4f77-995c-ebc830fd418414.svga", -1, null, true);
            xdl0.m208344M(viewFindViewById, true);
            xdl0.m208344M(textView2, true);
            xdl0.m208344M(textView3, false);
            vImage.setBackgroundResource(TextUtils.equals(liveVoiceSquareSpecChannelPopupBean.getUserInfo().gender, "male") ? i3c0.f110888V5 : i3c0.f110866T5);
            mep0.m154302d1(vDraweeView, t100.m186890d(48.0f));
            viewFindViewById.setBackground(fce.m120425b(TextUtils.equals(liveVoiceSquareSpecChannelPopupBean.getUserInfo().gender, "male") ? kvc0.m147352a(g1c0.f100169x) : kvc0.m147352a(g1c0.f100168w), t100.m186890d(4.0f)));
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setText(String.valueOf(liveVoiceSquareSpecChannelPopupBean.getUserInfo().age));
            textView2.setText(i0g0.m133869j0(ProfileZodiac.get(liveVoiceSquareSpecChannelPopupBean.getUserInfo().zodiac)));
        }
        xdl0.m208329E0(frameLayout.findViewById(f5c0.f94977A), new View.OnClickListener() { // from class: l.u5v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174773a.m124656U2(liveVoiceSquareSpecChannelPopupBean, view);
            }
        });
        ((TextView) frameLayout.findViewById(f5c0.f95009I)).setText(liveVoiceSquareSpecChannelPopupBean.getButtonText());
        LiveCardTracker.trackMv(liveVoiceSquareSpecChannelPopupBean.getTrackData());
        xdl0.m208329E0(frameLayout.findViewById(f5c0.f95009I), new View.OnClickListener() { // from class: l.v5v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180128a.m124657V2(liveVoiceSquareSpecChannelPopupBean, view);
            }
        });
        xdl0.m208329E0(vDraweeView, new View.OnClickListener() { // from class: l.w5v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184765a.m124658W2(liveVoiceSquareSpecChannelPopupBean, view);
            }
        });
        this.f101314g.show();
    }

    /* JADX INFO: renamed from: r */
    public void m124665r() {
        ((h7v) this.viewModel).m129804r();
        ((h7v) this.viewModel).m129802d(this.f101308a.m156171a());
        this.f101313f.m183110y2();
        n7v n7vVar = this.f101309b;
        V v2 = this.viewModel;
        n7vVar.mo51532C(new t7v(((h7v) v2).f106346g, ((h7v) v2).f106347h));
    }
}
