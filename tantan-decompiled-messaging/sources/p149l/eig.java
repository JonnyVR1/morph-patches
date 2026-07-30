package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.Area;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.VoiceFastGiftView;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class eig extends mim0<VoiceFastGiftView> {

    /* JADX INFO: renamed from: r */
    public c4g0 f91596r;

    /* JADX INFO: renamed from: s */
    public c4g0 f91597s;

    /* JADX INFO: renamed from: t */
    public c4g0 f91598t;

    /* JADX INFO: renamed from: u */
    public BLiveGiftItem f91599u;

    /* JADX INFO: renamed from: l.eig$a */
    public static class C16616a extends dac0<mlj> {

        /* JADX INFO: renamed from: c */
        public final PopupWindow f91600c;

        /* JADX INFO: renamed from: d */
        public final List<mlj> f91601d = new ArrayList();

        /* JADX INFO: renamed from: e */
        public eig f91602e;

        public C16616a(PopupWindow popupWindow, eig eigVar) {
            this.f91600c = popupWindow;
            this.f91602e = eigVar;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f91601d.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(this.f91600c.getContentView().getContext()).inflate(t6c0.f168248Y0, viewGroup, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, final mlj mljVar, int i, int i2) {
            if (i2 == this.f91601d.size() - 1) {
                view.setLayoutParams(new ViewGroup.LayoutParams(t100.m186890d(126.0f), t100.m186890d(46.0f)));
            } else {
                view.setLayoutParams(new ViewGroup.LayoutParams(t100.m186890d(126.0f), t100.m186890d(40.0f)));
            }
            CommonMaskAvatarView commonMaskAvatarView = (CommonMaskAvatarView) view.findViewById(g5c0.f101093x2);
            ((TextView) view.findViewById(g5c0.f100917e4)).setText(mljVar.f134444e.f111521b);
            agv.m96349g(commonMaskAvatarView, t100.f167273v, ((mlj) mqv.m155998f(mljVar).m156001c(mljVar.f134444e.f111520a, mljVar.f134441b, mljVar.f134440a).f135304a).f134444e.f111522c, null, null);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.dig
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f86386a.m116717H(mljVar, view2);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public mlj getItem(int i) {
            return this.f91601d.get(i);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m116717H(mlj mljVar, View view) {
            this.f91600c.dismiss();
            this.f91602e.m116710w4(mljVar);
        }

        /* JADX INFO: renamed from: I */
        public void m116718I(List<mlj> list) {
            this.f91601d.clear();
            this.f91601d.addAll(list);
            notifyDataSetChanged();
        }
    }

    public eig(bsm<? extends nnn0> bsmVar, BLiveBottomButton bLiveBottomButton, Area area) {
        super(bsmVar, bLiveBottomButton, area);
    }

    /* JADX INFO: renamed from: A4 */
    private String m116683A4(double d) {
        return String.valueOf(m129297F3(new hnj(800).m131941e(d)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D4 */
    public /* synthetic */ void m116684D4(soj0 soj0Var) {
        m116713z4();
    }

    /* JADX INFO: renamed from: q4 */
    public static /* synthetic */ void m116687q4(Integer num) {
    }

    /* JADX INFO: renamed from: r4 */
    public static /* synthetic */ void m116688r4(mlj mljVar, hxn0 hxn0Var) {
        mljVar.f134440a = hxn0Var.f109897c;
        mljVar.f134441b = hxn0Var.f109896b;
    }

    /* JADX INFO: renamed from: t4 */
    public static /* synthetic */ void m116690t4(Throwable th) {
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m116692B4(BLiveData bLiveData) {
        m154731X3().m77774l0(bLiveData);
    }

    @Override // p149l.ub3
    /* JADX INFO: renamed from: C1 */
    public boolean mo116693C1(Area area) {
        return area == Area.BOTTOM;
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m116694C4(hvj hvjVar) {
        BLiveGiftItem bLiveGiftItemM155433t = mmj.m155433t(hvjVar.m133171d().m143509f());
        this.f91599u = bLiveGiftItemM155433t;
        m116698H4(bLiveGiftItemM155433t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m116695E4(BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        m154731X3().m77773k0(bLiveGivenGiftBrief.combos);
        l3f l3fVar = new l3f();
        l3fVar.f125900s = "e_quickgift";
        l3fVar.f125895n = mo77274R2();
        l3fVar.f125885d = EventNameEnum.BIZ_PAY;
        axj.m99443q(bLiveGiftItem, bLiveGivenGiftBrief, mo77274R2(), 1, ((nnn0) m206027E2()).m132146l0().f56011id);
    }

    /* JADX INFO: renamed from: F4 */
    public void m116696F4(View view) {
        if (ypv.m215672k().m195623F3() && this.f91599u != null) {
            m116702L4(view, m116697G4());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G4 */
    public ArrayList<mlj> m116697G4() {
        ArrayList<mlj> arrayList = new ArrayList<>();
        List<BLiveVoiceCall> listM102070s = ((nnn0) m206027E2()).m160249P2().m102070s();
        if (!vwb.m200296J(listM102070s)) {
            for (int i = 0; i < listM102070s.size(); i++) {
                BLiveVoiceCall bLiveVoiceCall = listM102070s.get(i);
                i54 i54Var = new i54(bLiveVoiceCall.user, bLiveVoiceCall.userName, bLiveVoiceCall.userPicture);
                q44 q44VarM172922b = q44.m172922b(bLiveVoiceCall.f44485id, "", bLiveVoiceCall.position);
                final mlj mljVarM155154c = mlj.m155154c(i54Var, q44VarM172922b);
                hxn0.m133350c(((nnn0) m206027E2()).m160249P2().m102064m(bLiveVoiceCall.user)).m133351a(new e30() { // from class: l.cig
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        eig.m116688r4(mljVarM155154c, (hxn0) obj);
                    }
                });
                if (TextUtils.equals(bLiveVoiceCall.user, ((nnn0) m206027E2()).m132146l0().f56011id)) {
                    mljVarM155154c.f134446g = "voiceLiveMain";
                    q44VarM172922b.f152538b = "gift-audience-none-voiceLiveMain";
                } else {
                    mljVarM155154c.f134446g = "voiceLiveVice";
                    q44VarM172922b.f152538b = "gift-audience-none-voiceLiveVice";
                }
                mljVarM155154c.f134445f = q44VarM172922b;
                mljVarM155154c.f134442c = true;
                arrayList.add(mljVarM155154c);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: H4 */
    public final void m116698H4(BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem != null) {
            m154731X3().m77776n0(bLiveGiftItem, mo77274R2());
        } else {
            m206028F2().BootBubbleEvent.dismissBubble().mo172463j("voiceLiveQuickGift");
            m154731X3().m77775m0();
        }
    }

    /* JADX INFO: renamed from: I4 */
    public void m116699I4() {
        m116700J4(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J4 */
    public void m116700J4(mlj mljVar) {
        BLiveGiftItem bLiveGiftItem = this.f91599u;
        if (bLiveGiftItem == null) {
            return;
        }
        axj.m99435i(bLiveGiftItem, m116683A4(bLiveGiftItem.getPrice()), mo77274R2(), 1, ((nnn0) m206027E2()).m132146l0().f56011id);
        m116711x4(this.f91599u, mljVar);
    }

    /* JADX INFO: renamed from: K4 */
    public final void m116701K4(final BLiveGiftItem bLiveGiftItem, @Nullable mlj mljVar) {
        m206028F2().SendGiftEventGroup.sendGift().mo172463j(new cfe0.C16123a().m106533x(mljVar, "extra_type_lian_mai", bLiveGiftItem, new e30() { // from class: l.vhg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181501a.m116695E4(bLiveGiftItem, (BLiveGivenGiftBrief) obj);
            }
        }, new e30() { // from class: l.whg
            @Override // p149l.e30
            public final void call(Object obj) {
                eig.m116690t4((Throwable) obj);
            }
        }, new e30() { // from class: l.xhg
            @Override // p149l.e30
            public final void call(Object obj) {
                eig.m116687q4((Integer) obj);
            }
        }, true, 1, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerLocation.get(BLiveTraceServerLocation.quickgift), "")));
    }

    /* JADX INFO: renamed from: L4 */
    public final void m116702L4(View view, List<mlj> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        View viewInflate = LayoutInflater.from(act()).inflate(t6c0.f168236X0, (ViewGroup) null);
        int iMin = Math.min(t100.m186890d(40.0f) * list.size(), t100.m186890d(180.0f)) + t100.m186890d(38.0f);
        PopupWindow popupWindow = new PopupWindow(viewInflate, t100.m186890d(126.0f), iMin, true);
        popupWindow.setAnimationStyle(d8c0.f84850e);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(g5c0.f100850X4);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act());
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        C16616a c16616a = new C16616a(popupWindow, this);
        recyclerView.setAdapter(c16616a);
        c16616a.m116718I(list);
        popupWindow.showAsDropDown(view, -t100.m186890d(63.0f), ((-view.getHeight()) - iMin) - t100.m186890d(8.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        this.f91596r = duringCreated(((nnn0) m206027E2()).m132177z1()).subscribe(ffw.m121193d(new e30() { // from class: l.yhg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198341a.m116692B4((BLiveData) obj);
            }
        }));
        this.f91597s = duringCreated(((nnn0) m206027E2()).m132083P0()).filter(new w9j() { // from class: l.zhg
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((hvj) obj).m133176i());
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.aig
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69987a.m116694C4((hvj) obj);
            }
        }));
        this.f91598t = duringCreated(m206028F2().BottomEvent.hideFastGiftPrice().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.big
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75756a.m116684D4((soj0) obj);
            }
        }));
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: Y3 */
    public int mo116703Y3() {
        return 0;
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: b4 */
    public int mo116704b4() {
        return i3c0.f110941a3;
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: c4 */
    public int mo116705c4() {
        return 0;
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: d4 */
    public View mo116706d4() {
        if (m116712y4()) {
            return m154731X3().f52916f;
        }
        return null;
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: m4 */
    public void mo116707m4(View view, BLiveButtonType bLiveButtonType, String str) {
        m116699I4();
        m206028F2().BootBubbleEvent.dismissBubble().mo172463j("voiceLiveQuickGift");
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        mkd0.m154992z(this.f91596r);
        mkd0.m154992z(this.f91597s);
        mkd0.m154992z(this.f91598t);
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: n4 */
    public boolean mo116708n4(View view, BLiveButtonType bLiveButtonType, String str) {
        m116696F4(m154731X3().f52916f);
        m206028F2().BootBubbleEvent.dismissBubble().mo172463j("voiceLiveQuickGift");
        return super.mo116708n4(view, bLiveButtonType, str);
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: v4, reason: merged with bridge method [inline-methods] */
    public VoiceFastGiftView mo108804T3(int i, boolean z) {
        VoiceFastGiftView voiceFastGiftView = (VoiceFastGiftView) this.f134018l.f77095a.inflater().inflate(t6c0.f167992C8, (ViewGroup) null);
        voiceFastGiftView.setLayoutParams(new LinearLayout.LayoutParams(t100.m186890d(40.0f), t100.m186890d(60.0f)));
        String strMo154734e4 = mo154734e4(this.f134019m, this.f134022p);
        voiceFastGiftView.m77777o0();
        if (TextUtils.isEmpty(strMo154734e4)) {
            voiceFastGiftView.setIcon(i);
        } else {
            voiceFastGiftView.setIcon(strMo154734e4);
        }
        xdl0.m208345M0(voiceFastGiftView, true);
        return voiceFastGiftView;
    }

    /* JADX INFO: renamed from: w4 */
    public void m116710w4(mlj mljVar) {
        if (this.f91599u == null) {
            return;
        }
        m116700J4(mljVar);
    }

    /* JADX INFO: renamed from: x4 */
    public final void m116711x4(BLiveGiftItem bLiveGiftItem, mlj mljVar) {
        if (act() == null) {
            return;
        }
        m116701K4(bLiveGiftItem, mljVar);
    }

    /* JADX INFO: renamed from: y4 */
    public boolean m116712y4() {
        return this.f91599u != null;
    }

    /* JADX INFO: renamed from: z4 */
    public void m116713z4() {
        m154731X3().m77774l0(null);
    }
}
