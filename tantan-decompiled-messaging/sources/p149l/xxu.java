package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.panel.other.VoicePanelSwitchView;
import com.p046p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.LiveVirtualVoiceFunctionPanelView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\u000fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\u000fJ\u0015\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\t¢\u0006\u0004\b\"\u0010\rJ\u000f\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010\u000fJ\u000f\u0010$\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\t¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001c\u00100\u001a\n -*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R3\u00107\u001a\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001701j\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0017`28\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00068"}, m87232d2 = {"Ll/xxu;", "Ll/nnn0;", "D", "Ll/h4t;", "Lcom/p1/mobile/putong/live/livingroom/virtual/virtualmotion/creator/functionpanel/LiveVirtualVoiceFunctionPanelView;", "Ll/bsm;", "curInfo", "<init>", "(Ll/bsm;)V", "", "visible", "", "h4", "(Z)V", "j4", "()V", "isManager", "b0", "a4", "", "type", "Z3", "(Ljava/lang/String;)V", "Ll/jzl;", OMSTemplateModeType.page, "b4", "(Ll/jzl;)V", "f4", "(Ljava/lang/String;)Ll/jzl;", "Y3", "d4", "i4", j6f.GPS_DIRECTION_TRUE, "isCollapse", "c4", Constants.KEY_T, "e4", "()Ll/jzl;", "g4", "()Z", RXScreenCaptureService.KEY_INDEX, "Ll/bsm;", "j", "Ljava/lang/String;", "curFunction", "kotlin.jvm.PlatformType", "k", "Ljava/lang/Boolean;", "hasShowVoiceFunctionsDialog", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", BLiveStormDanmakuGiftResourceType.f44444l, "Ljava/util/HashMap;", "getFunctions", "()Ljava/util/HashMap;", "functions", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class xxu<D extends nnn0> extends h4t<D, LiveVirtualVoiceFunctionPanelView<D>> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final bsm<D> curInfo;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public String curFunction;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final Boolean hasShowVoiceFunctionsDialog;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final HashMap<String, jzl> functions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxu(@NotNull bsm<D> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        this.curInfo = bsmVar;
        this.curFunction = "";
        this.hasShowVoiceFunctionsDialog = ((hdv) ypv.m215673l(fld0.f98150e)).f107309o.get();
        this.functions = new HashMap<>();
    }

    /* JADX INFO: renamed from: J3 */
    public static Boolean m211542J3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K3 */
    public static String m211543K3(xxu xxuVar, BLiveVoice bLiveVoice) {
        return ((nnn0) xxuVar.m206027E2()).mo149813j().template;
    }

    /* JADX INFO: renamed from: L3 */
    public static Boolean m211544L3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M3 */
    public static void m211545M3(xxu xxuVar, Boolean bool) {
        bool.getClass();
        xxuVar.m211556b0(bool.booleanValue());
    }

    /* JADX INFO: renamed from: N3 */
    public static String m211546N3(Function1 function1, Object obj) {
        return (String) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O3 */
    public static void m211547O3(xxu xxuVar) {
        ((LiveVirtualVoiceFunctionPanelView) xxuVar.viewModel).m77582q0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    public static BLiveMember m211548P3(xxu xxuVar, bik0.C15867a c15867a) {
        return ((nnn0) xxuVar.m206027E2()).m160249P2().m102069r().m201354G(ypv.f199493a.m199309D0());
    }

    /* JADX INFO: renamed from: R3 */
    public static Boolean m211549R3(BLiveMember bLiveMember) {
        return Boolean.valueOf(e0o0.m114329p(bLiveMember));
    }

    /* JADX INFO: renamed from: S3 */
    public static Boolean m211550S3(bik0.C15867a c15867a) {
        return Boolean.valueOf(c15867a.f75773b == 1);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m211551T3(xxu xxuVar, Boolean bool) {
        bool.getClass();
        xxuVar.m211566h4(bool.booleanValue());
    }

    /* JADX INFO: renamed from: U3 */
    public static BLiveMember m211552U3(Function1 function1, Object obj) {
        return (BLiveMember) function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public static void m211553V3(xxu xxuVar, LongLinkVirtualVoice.VoiceLiveTemplateMessage voiceLiveTemplateMessage) {
        ((nnn0) xxuVar.m206027E2()).m160239I2(voiceLiveTemplateMessage.getTemplate());
    }

    /* JADX INFO: renamed from: W3 */
    public static void m211554W3(xxu xxuVar, String str) {
        xxuVar.m211559a4();
    }

    /* JADX INFO: renamed from: X3 */
    public static void m211555X3(xxu xxuVar) {
        xxuVar.m211568j4();
    }

    /* JADX INFO: renamed from: b0 */
    private final void m211556b0(boolean isManager) {
        jzl jzlVar = this.functions.get(this.curFunction);
        if (jzlVar != null) {
            ((LiveVirtualVoiceFunctionPanelView) this.viewModel).m77586t0(jzlVar.mo104860f1() && isManager);
            jzlVar.mo104857b0(isManager);
            ((LiveVirtualVoiceFunctionPanelView) this.viewModel).setSupportExpand(jzlVar.mo104859e2());
            if (jzlVar instanceof m760) {
                ((LiveVirtualVoiceFunctionPanelView) this.viewModel).m77581p0(((m760) jzlVar).mo104849G0(), isManager);
            }
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ((LiveVirtualVoiceFunctionPanelView) this.viewModel).m77583r();
        bsm<D> bsmVar = this.curInfo;
        VoicePanelSwitchView voicePanelSwitchView = ((LiveVirtualVoiceFunctionPanelView) this.viewModel).f48112h;
        voicePanelSwitchView.getClass();
        m144512z2(new p6o0(bsmVar, voicePanelSwitchView));
        m129304h3(m206028F2().VoiceVirtualLiveEvent.showFunPanelSwitchAndCollapse(), new e30() { // from class: l.lxu
            @Override // p149l.e30
            public final void call(Object obj) {
                xxu.m211551T3(this.f130433a, (Boolean) obj);
            }
        });
        m129303g3(m206028F2().VoiceVirtualLiveEvent.collapsePanel(), new d30() { // from class: l.mxu
            @Override // p149l.d30
            public final void call() {
                xxu.m211547O3(this.f136205a);
            }
        });
        m129303g3(m206028F2().VoiceVirtualLiveEvent.updateCollapseLayout(), new d30() { // from class: l.nxu
            @Override // p149l.d30
            public final void call() {
                xxu.m211555X3(this.f141051a);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public final void m211557Y3(jzl page) {
        ((LiveVirtualVoiceFunctionPanelView) this.viewModel).m77578m0(page.mo104853T1());
        if (page instanceof k4t) {
            m144512z2((k4t) page);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public final void m211558Z3(String type) {
        jzl jzlVar;
        if (Intrinsics.m87488d(type, this.curFunction)) {
            return;
        }
        hfw.m130790a("[voice][call]", "changeFunction:" + type);
        this.curFunction = type;
        m211567i4();
        if (this.functions.containsKey(type)) {
            jzl jzlVar2 = this.functions.get(type);
            jzlVar2.getClass();
            jzlVar = jzlVar2;
            m211557Y3(jzlVar);
        } else {
            jzl jzlVarM211564f4 = m211564f4(type);
            this.functions.put(type, jzlVarM211564f4);
            m211562d4(jzlVarM211564f4);
            jzlVar = jzlVarM211564f4;
        }
        V v2 = this.viewModel;
        v2.getClass();
        jzlVar.mo104862u((ViewGroup) v2);
        boolean z = jzlVar instanceof m760;
        V v3 = this.viewModel;
        if (z) {
            ((LiveVirtualVoiceFunctionPanelView) v3).m77588v0();
            m211560b4(jzlVar);
        } else {
            ((LiveVirtualVoiceFunctionPanelView) v3).m77580o0(jzlVar.mo104863x());
            ((LiveVirtualVoiceFunctionPanelView) this.viewModel).m77588v0();
        }
        ((LiveVirtualVoiceFunctionPanelView) this.viewModel).m77586t0(e0o0.m114322h(this));
        ((LiveVirtualVoiceFunctionPanelView) this.viewModel).setSupportExpand(jzlVar.mo104859e2());
    }

    /* JADX INFO: renamed from: a4 */
    public final void m211559a4() {
        try {
            BLiveVoice bLiveVoiceMo149813j = m206027E2().mo149813j();
            bLiveVoiceMo149813j.getClass();
            String str = bLiveVoiceMo149813j.template;
            str.getClass();
            m211558Z3(str);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final void m211560b4(jzl page) {
        ((LiveVirtualVoiceFunctionPanelView) this.viewModel).m77581p0(page.mo104849G0(), e0o0.m114322h(this));
        if (!e0o0.m114321g(this) || this.hasShowVoiceFunctionsDialog.booleanValue()) {
            return;
        }
        ((LiveVirtualVoiceFunctionPanelView) this.viewModel).m77582q0();
    }

    /* JADX INFO: renamed from: c4 */
    public final void m211561c4(boolean isCollapse) {
        jzl jzlVar = this.functions.get(this.curFunction);
        if (jzlVar != null) {
            ((LiveVirtualVoiceFunctionPanelView) this.viewModel).m77579n0(jzlVar.mo104849G0(), jzlVar.mo104863x(), jzlVar.mo104850P1(), jzlVar);
            jzlVar.mo104856Y(isCollapse);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d4 */
    public final void m211562d4(jzl page) {
        View viewInflate = LayoutInflater.from(this.f188512e.f77095a).inflate(page.mo104861g1(), (ViewGroup) null);
        LiveVirtualVoiceFunctionPanelView liveVirtualVoiceFunctionPanelView = (LiveVirtualVoiceFunctionPanelView) this.viewModel;
        viewInflate.getClass();
        liveVirtualVoiceFunctionPanelView.m77578m0(viewInflate);
        if ((viewInflate instanceof s7m) && (page instanceof k4t)) {
            k4t k4tVar = (k4t) page;
            k4tVar.mo51532C((s7m) viewInflate);
            m144512z2(k4tVar);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e4 */
    public final jzl m211563e4() {
        return this.functions.get(this.curFunction);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: f4 */
    public final jzl m211564f4(String type) {
        switch (type.hashCode()) {
            case -1779230753:
                if (type.equals(VirtualVoiceMotionType.undercover)) {
                    return new sip0(this.curInfo);
                }
                break;
            case -661856701:
                if (type.equals("auction")) {
                    return new h81(this.curInfo);
                }
                break;
            case 156781895:
                if (type.equals(VirtualVoiceMotionType.announcement)) {
                    return new ns0(this.curInfo);
                }
                break;
            case 1609801911:
                if (type.equals(VirtualVoiceMotionType.chatTopic)) {
                    return new c1j0(this.curInfo);
                }
                break;
        }
        return new m760(this.curInfo);
    }

    /* JADX INFO: renamed from: g4 */
    public final boolean m211565g4() {
        return e0o0.m114322h(this);
    }

    /* JADX INFO: renamed from: h4 */
    public final void m211566h4(boolean visible) {
        jzl jzlVar = this.functions.get(this.curFunction);
        if (jzlVar != null) {
            boolean z = false;
            ((LiveVirtualVoiceFunctionPanelView) this.viewModel).setSupportExpand(jzlVar.mo104859e2() && visible);
            LiveVirtualVoiceFunctionPanelView liveVirtualVoiceFunctionPanelView = (LiveVirtualVoiceFunctionPanelView) this.viewModel;
            if (e0o0.m114322h(this) && visible) {
                z = true;
            }
            liveVirtualVoiceFunctionPanelView.setSwitchViewVisible(z);
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final void m211567i4() {
        for (Map.Entry<String, jzl> entry : this.functions.entrySet()) {
            try {
                if (entry.getValue() instanceof k4t) {
                    Object value = entry.getValue();
                    value.getClass();
                    m144506C2((k4t) value);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final void m211568j4() {
        jzl jzlVar = this.functions.get(this.curFunction);
        if (jzlVar != null) {
            ((LiveVirtualVoiceFunctionPanelView) this.viewModel).m77591z0(jzlVar.mo104849G0());
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        C22306c<T> c22306cM104250o2 = m104250o2(m206027E2().m160247O2().m165466d(), false);
        final Function1 function1 = new Function1() { // from class: l.jxu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xxu.m211543K3(this.f120247a, (BLiveVoice) obj);
            }
        };
        c22306cM104250o2.map(new w9j() { // from class: l.pxu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xxu.m211546N3(function1, obj);
            }
        }).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.qxu
            @Override // p149l.e30
            public final void call(Object obj) {
                xxu.m211554W3(this.f156873a, (String) obj);
            }
        }));
        C22306c<T> c22306cM104250o3 = m104250o2(m206027E2().m160251Q2(), false);
        final Function1 function2 = new Function1() { // from class: l.rxu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xxu.m211550S3((bik0.C15867a) obj);
            }
        };
        C22306c c22306cFilter = c22306cM104250o3.filter(new w9j() { // from class: l.sxu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xxu.m211544L3(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.txu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xxu.m211548P3(this.f172531a, (bik0.C15867a) obj);
            }
        };
        C22306c map = c22306cFilter.map(new w9j() { // from class: l.uxu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xxu.m211552U3(function3, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: l.vxu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xxu.m211549R3((BLiveMember) obj);
            }
        };
        map.map(new w9j() { // from class: l.wxu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xxu.m211542J3(function4, obj);
            }
        }).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.kxu
            @Override // p149l.e30
            public final void call(Object obj) {
                xxu.m211545M3(this.f125154a, (Boolean) obj);
            }
        }));
        m104250o2(m206027E2().f108769z.m181789r().m189079W0(), false).subscribe(ffw.m121197h(new e30() { // from class: l.oxu
            @Override // p149l.e30
            public final void call(Object obj) {
                xxu.m211553V3(this.f146251a, (LongLinkVirtualVoice.VoiceLiveTemplateMessage) obj);
            }
        }));
    }
}
