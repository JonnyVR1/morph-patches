package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.Area;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.VoiceFastGiftView;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class sjg extends qrm0<VoiceFastGiftView> {

    /* JADX INFO: renamed from: r */
    public kcg0 f168964r;

    /* JADX INFO: renamed from: s */
    public kcg0 f168965s;

    /* JADX INFO: renamed from: t */
    public kcg0 f168966t;

    /* JADX INFO: renamed from: u */
    public BLiveGiftItem f168967u;

    /* JADX INFO: renamed from: l.sjg$a */
    public static class C20054a extends jic0<coj> {

        /* JADX INFO: renamed from: c */
        public final PopupWindow f168968c;

        /* JADX INFO: renamed from: d */
        public final List<coj> f168969d = new ArrayList();

        /* JADX INFO: renamed from: e */
        public sjg f168970e;

        public C20054a(PopupWindow popupWindow, sjg sjgVar) {
            this.f168968c = popupWindow;
            this.f168970e = sjgVar;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f168969d.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(this.f168968c.getContentView().getContext()).inflate(yec0.f198980Y0, viewGroup, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, final coj cojVar, int i, int i2) {
            if (i2 == this.f168969d.size() - 1) {
                view.setLayoutParams(new ViewGroup.LayoutParams(qa00.m175859d(126.0f), qa00.m175859d(46.0f)));
            } else {
                view.setLayoutParams(new ViewGroup.LayoutParams(qa00.m175859d(126.0f), qa00.m175859d(40.0f)));
            }
            CommonMaskAvatarView commonMaskAvatarView = (CommonMaskAvatarView) view.findViewById(mdc0.f136338x2);
            ((TextView) view.findViewById(mdc0.f136162e4)).setText(cojVar.f82889e.f107998b);
            biv.m104522g(commonMaskAvatarView, qa00.f156335v, ((coj) nsv.m164636f(cojVar).m164639c(cojVar.f82889e.f107997a, cojVar.f82886b, cojVar.f82885a).f143542a).f82889e.f107999c, null, null);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.rjg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f163452a.m186095H(cojVar, view2);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public coj getItem(int i) {
            return this.f168969d.get(i);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m186095H(coj cojVar, View view) {
            this.f168968c.dismiss();
            this.f168970e.m186088w4(cojVar);
        }

        /* JADX INFO: renamed from: I */
        public void m186096I(List<coj> list) {
            this.f168969d.clear();
            this.f168969d.addAll(list);
            notifyDataSetChanged();
        }
    }

    public sjg(dum<? extends rwn0> dumVar, BLiveBottomButton bLiveBottomButton, Area area) {
        super(dumVar, bLiveBottomButton, area);
    }

    /* JADX INFO: renamed from: A4 */
    private String m186068A4(double d) {
        return String.valueOf(m138856F3(new xpj(800).m212654e(d)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D4 */
    public /* synthetic */ void m186069D4(vxj0 vxj0Var) {
        m186091z4();
    }

    /* JADX INFO: renamed from: q4 */
    public static /* synthetic */ void m186072q4(Integer num) {
    }

    /* JADX INFO: renamed from: r4 */
    public static /* synthetic */ void m186073r4(coj cojVar, l6o0 l6o0Var) {
        cojVar.f82885a = l6o0Var.f130276c;
        cojVar.f82886b = l6o0Var.f130275b;
    }

    /* JADX INFO: renamed from: t4 */
    public static /* synthetic */ void m186075t4(Throwable th) {
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m186077B4(BLiveData bLiveData) {
        m177578X3().m78957l0(bLiveData);
    }

    @Override // p153l.jc3
    /* JADX INFO: renamed from: C1 */
    public boolean mo105687C1(Area area) {
        return area == Area.BOTTOM;
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m186078C4(xxj xxjVar) {
        BLiveGiftItem bLiveGiftItemM111800t = cpj.m111800t(xxjVar.m213530d().m221999f());
        this.f168967u = bLiveGiftItemM111800t;
        m186082H4(bLiveGiftItemM111800t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m186079E4(BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        m177578X3().m78956k0(bLiveGivenGiftBrief.combos);
        q4f q4fVar = new q4f();
        q4fVar.f155581s = "e_quickgift";
        q4fVar.f155576n = mo78457R2();
        q4fVar.f155566d = EventNameEnum.BIZ_PAY;
        qzj.m178800q(bLiveGiftItem, bLiveGivenGiftBrief, mo78457R2(), 1, ((rwn0) m213810E2()).m168532l0().f56859id);
    }

    /* JADX INFO: renamed from: F4 */
    public void m186080F4(View view) {
        if (zrv.m221193k().m203410F3() && this.f168967u != null) {
            m186086L4(view, m186081G4());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G4 */
    public ArrayList<coj> m186081G4() {
        ArrayList<coj> arrayList = new ArrayList<>();
        List<BLiveVoiceCall> listM136880s = ((rwn0) m213810E2()).m183411P2().m136880s();
        if (!jyb.m147479J(listM136880s)) {
            for (int i = 0; i < listM136880s.size(); i++) {
                BLiveVoiceCall bLiveVoiceCall = listM136880s.get(i);
                h64 h64Var = new h64(bLiveVoiceCall.user, bLiveVoiceCall.userName, bLiveVoiceCall.userPicture);
                p54 p54VarM170592b = p54.m170592b(bLiveVoiceCall.f45333id, "", bLiveVoiceCall.position);
                final coj cojVarM111661c = coj.m111661c(h64Var, p54VarM170592b);
                l6o0.m153068c(((rwn0) m213810E2()).m183411P2().m136874m(bLiveVoiceCall.user)).m153069a(new y20() { // from class: l.qjg
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        sjg.m186073r4(cojVarM111661c, (l6o0) obj);
                    }
                });
                if (TextUtils.equals(bLiveVoiceCall.user, ((rwn0) m213810E2()).m168532l0().f56859id)) {
                    cojVarM111661c.f82891g = "voiceLiveMain";
                    p54VarM170592b.f150593b = "gift-audience-none-voiceLiveMain";
                } else {
                    cojVarM111661c.f82891g = "voiceLiveVice";
                    p54VarM170592b.f150593b = "gift-audience-none-voiceLiveVice";
                }
                cojVarM111661c.f82890f = p54VarM170592b;
                cojVarM111661c.f82887c = true;
                arrayList.add(cojVarM111661c);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: H4 */
    public final void m186082H4(BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem != null) {
            m177578X3().m78959n0(bLiveGiftItem, mo78457R2());
        } else {
            m213811F2().BootBubbleEvent.dismissBubble().mo199273j("voiceLiveQuickGift");
            m177578X3().m78958m0();
        }
    }

    /* JADX INFO: renamed from: I4 */
    public void m186083I4() {
        m186084J4(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J4 */
    public void m186084J4(coj cojVar) {
        BLiveGiftItem bLiveGiftItem = this.f168967u;
        if (bLiveGiftItem == null) {
            return;
        }
        qzj.m178792i(bLiveGiftItem, m186068A4(bLiveGiftItem.getPrice()), mo78457R2(), 1, ((rwn0) m213810E2()).m168532l0().f56859id);
        m186089x4(this.f168967u, cojVar);
    }

    /* JADX INFO: renamed from: K4 */
    public final void m186085K4(final BLiveGiftItem bLiveGiftItem, @Nullable coj cojVar) {
        m213811F2().SendGiftEventGroup.sendGift().mo199273j(new hne0.C17513a().m136087x(cojVar, "extra_type_lian_mai", bLiveGiftItem, new y20() { // from class: l.jjg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121174a.m186079E4(bLiveGiftItem, (BLiveGivenGiftBrief) obj);
            }
        }, new y20() { // from class: l.kjg
            @Override // p153l.y20
            public final void call(Object obj) {
                sjg.m186075t4((Throwable) obj);
            }
        }, new y20() { // from class: l.ljg
            @Override // p153l.y20
            public final void call(Object obj) {
                sjg.m186072q4((Integer) obj);
            }
        }, true, 1, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerLocation.get(BLiveTraceServerLocation.quickgift), "")));
    }

    /* JADX INFO: renamed from: L4 */
    public final void m186086L4(View view, List<coj> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        View viewInflate = LayoutInflater.from(act()).inflate(yec0.f198968X0, (ViewGroup) null);
        int iMin = Math.min(qa00.m175859d(40.0f) * list.size(), qa00.m175859d(180.0f)) + qa00.m175859d(38.0f);
        PopupWindow popupWindow = new PopupWindow(viewInflate, qa00.m175859d(126.0f), iMin, true);
        popupWindow.setAnimationStyle(jgc0.f120698e);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(mdc0.f136095X4);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act());
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        C20054a c20054a = new C20054a(popupWindow, this);
        recyclerView.setAdapter(c20054a);
        c20054a.m186096I(list);
        popupWindow.showAsDropDown(view, -qa00.m175859d(63.0f), ((-view.getHeight()) - iMin) - qa00.m175859d(8.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        this.f168964r = duringCreated(((rwn0) m213810E2()).m168561z1()).subscribe(dhw.m115825d(new y20() { // from class: l.mjg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137074a.m186077B4((BLiveData) obj);
            }
        }));
        this.f168965s = duringCreated(((rwn0) m213810E2()).m168469P0()).filter(new qcj() { // from class: l.njg
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((xxj) obj).m213535i());
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.ojg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147662a.m186078C4((xxj) obj);
            }
        }));
        this.f168966t = duringCreated(m213811F2().BottomEvent.hideFastGiftPrice().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.pjg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152691a.m186069D4((vxj0) obj);
            }
        }));
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: Y3 */
    public int mo177579Y3() {
        return 0;
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: b4 */
    public int mo105689b4() {
        return obc0.f146269a3;
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: c4 */
    public int mo105690c4() {
        return 0;
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: d4 */
    public View mo177581d4() {
        if (m186090y4()) {
            return m177578X3().f53764f;
        }
        return null;
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: m4 */
    public void mo105691m4(View view, BLiveButtonType bLiveButtonType, String str) {
        m186083I4();
        m213811F2().BootBubbleEvent.dismissBubble().mo199273j("voiceLiveQuickGift");
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        psd0.m173633z(this.f168964r);
        psd0.m173633z(this.f168965s);
        psd0.m173633z(this.f168966t);
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: n4 */
    public boolean mo177589n4(View view, BLiveButtonType bLiveButtonType, String str) {
        m186080F4(m177578X3().f53764f);
        m213811F2().BootBubbleEvent.dismissBubble().mo199273j("voiceLiveQuickGift");
        return super.mo177589n4(view, bLiveButtonType, str);
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: v4, reason: merged with bridge method [inline-methods] */
    public VoiceFastGiftView mo105688T3(int i, boolean z) {
        VoiceFastGiftView voiceFastGiftView = (VoiceFastGiftView) this.f159147l.f90815a.inflater().inflate(yec0.f198724C8, (ViewGroup) null);
        voiceFastGiftView.setLayoutParams(new LinearLayout.LayoutParams(qa00.m175859d(40.0f), qa00.m175859d(60.0f)));
        String strMo107630e4 = mo107630e4(this.f159148m, this.f159151p);
        voiceFastGiftView.m78960o0();
        if (TextUtils.isEmpty(strMo107630e4)) {
            voiceFastGiftView.setIcon(i);
        } else {
            voiceFastGiftView.setIcon(strMo107630e4);
        }
        bnl0.m105525M0(voiceFastGiftView, true);
        return voiceFastGiftView;
    }

    /* JADX INFO: renamed from: w4 */
    public void m186088w4(coj cojVar) {
        if (this.f168967u == null) {
            return;
        }
        m186084J4(cojVar);
    }

    /* JADX INFO: renamed from: x4 */
    public final void m186089x4(BLiveGiftItem bLiveGiftItem, coj cojVar) {
        if (act() == null) {
            return;
        }
        m186085K4(bLiveGiftItem, cojVar);
    }

    /* JADX INFO: renamed from: y4 */
    public boolean m186090y4() {
        return this.f168967u != null;
    }

    /* JADX INFO: renamed from: z4 */
    public void m186091z4() {
        m177578X3().m78957l0(null);
    }
}
