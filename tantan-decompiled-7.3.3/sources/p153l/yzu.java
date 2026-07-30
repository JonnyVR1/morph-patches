package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.panel.other.VoicePanelSwitchView;
import com.p051p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.LiveVirtualVoiceFunctionPanelView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\u000fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\u000fJ\u0015\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\t¢\u0006\u0004\b\"\u0010\rJ\u000f\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010\u000fJ\u000f\u0010$\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\t¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001c\u00100\u001a\n -*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R3\u00107\u001a\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001701j\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0017`28\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00068"}, m88121d2 = {"Ll/yzu;", "Ll/rwn0;", "D", "Ll/i6t;", "Lcom/p1/mobile/putong/live/livingroom/virtual/virtualmotion/creator/functionpanel/LiveVirtualVoiceFunctionPanelView;", "Ll/dum;", "curInfo", "<init>", "(Ll/dum;)V", "", "visible", "", "h4", "(Z)V", "j4", "()V", "isManager", "b0", "a4", "", "type", "Z3", "(Ljava/lang/String;)V", "Ll/d2m;", OMSTemplateModeType.page, "b4", "(Ll/d2m;)V", "f4", "(Ljava/lang/String;)Ll/d2m;", "Y3", "d4", "i4", p7f.GPS_DIRECTION_TRUE, "isCollapse", "c4", Constants.KEY_T, "e4", "()Ll/d2m;", "g4", "()Z", RXScreenCaptureService.KEY_INDEX, "Ll/dum;", "j", "Ljava/lang/String;", "curFunction", "kotlin.jvm.PlatformType", "k", "Ljava/lang/Boolean;", "hasShowVoiceFunctionsDialog", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", BLiveStormDanmakuGiftResourceType.f45292l, "Ljava/util/HashMap;", "getFunctions", "()Ljava/util/HashMap;", "functions", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class yzu<D extends rwn0> extends i6t<D, LiveVirtualVoiceFunctionPanelView<D>> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final dum<D> curInfo;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public String curFunction;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final Boolean hasShowVoiceFunctionsDialog;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final HashMap<String, d2m> functions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzu(@NotNull dum<D> dumVar) {
        super(dumVar);
        dumVar.getClass();
        this.curInfo = dumVar;
        this.curFunction = "";
        this.hasShowVoiceFunctionsDialog = ((ifv) zrv.m221194l(htd0.f111523e)).f114706o.get();
        this.functions = new HashMap<>();
    }

    /* JADX INFO: renamed from: J3 */
    public static Boolean m218030J3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K3 */
    public static String m218031K3(yzu yzuVar, BLiveVoice bLiveVoice) {
        return ((rwn0) yzuVar.m213810E2()).mo183435j().template;
    }

    /* JADX INFO: renamed from: L3 */
    public static Boolean m218032L3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M3 */
    public static void m218033M3(yzu yzuVar, Boolean bool) {
        bool.getClass();
        yzuVar.m218044b0(bool.booleanValue());
    }

    /* JADX INFO: renamed from: N3 */
    public static String m218034N3(Function1 function1, Object obj) {
        return (String) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O3 */
    public static void m218035O3(yzu yzuVar) {
        ((LiveVirtualVoiceFunctionPanelView) yzuVar.viewModel).m78765q0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    public static BLiveMember m218036P3(yzu yzuVar, hrk0.C17564a c17564a) {
        return ((rwn0) yzuVar.m213810E2()).m183411P2().m136879r().m97111G(zrv.f205799a.m207631D0());
    }

    /* JADX INFO: renamed from: R3 */
    public static Boolean m218037R3(BLiveMember bLiveMember) {
        return Boolean.valueOf(i9o0.m139144p(bLiveMember));
    }

    /* JADX INFO: renamed from: S3 */
    public static Boolean m218038S3(hrk0.C17564a c17564a) {
        return Boolean.valueOf(c17564a.f111360b == 1);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m218039T3(yzu yzuVar, Boolean bool) {
        bool.getClass();
        yzuVar.m218054h4(bool.booleanValue());
    }

    /* JADX INFO: renamed from: U3 */
    public static BLiveMember m218040U3(Function1 function1, Object obj) {
        return (BLiveMember) function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public static void m218041V3(yzu yzuVar, LongLinkVirtualVoice.VoiceLiveTemplateMessage voiceLiveTemplateMessage) {
        ((rwn0) yzuVar.m213810E2()).m183401I2(voiceLiveTemplateMessage.getTemplate());
    }

    /* JADX INFO: renamed from: W3 */
    public static void m218042W3(yzu yzuVar, String str) {
        yzuVar.m218047a4();
    }

    /* JADX INFO: renamed from: X3 */
    public static void m218043X3(yzu yzuVar) {
        yzuVar.m218056j4();
    }

    /* JADX INFO: renamed from: b0 */
    private final void m218044b0(boolean isManager) {
        d2m d2mVar = this.functions.get(this.curFunction);
        if (d2mVar != null) {
            ((LiveVirtualVoiceFunctionPanelView) this.viewModel).m78769t0(d2mVar.mo113714f1() && isManager);
            d2mVar.mo113711b0(isManager);
            ((LiveVirtualVoiceFunctionPanelView) this.viewModel).setSupportExpand(d2mVar.mo113713e2());
            if (d2mVar instanceof sf60) {
                ((LiveVirtualVoiceFunctionPanelView) this.viewModel).m78764p0(((sf60) d2mVar).mo113707G0(), isManager);
            }
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ((LiveVirtualVoiceFunctionPanelView) this.viewModel).m78766r();
        dum<D> dumVar = this.curInfo;
        VoicePanelSwitchView voicePanelSwitchView = ((LiveVirtualVoiceFunctionPanelView) this.viewModel).f48960h;
        voicePanelSwitchView.getClass();
        m153103z2(new tfo0(dumVar, voicePanelSwitchView));
        m138863h3(m213811F2().VoiceVirtualLiveEvent.showFunPanelSwitchAndCollapse(), new y20() { // from class: l.mzu
            @Override // p153l.y20
            public final void call(Object obj) {
                yzu.m218039T3(this.f139555a, (Boolean) obj);
            }
        });
        m138862g3(m213811F2().VoiceVirtualLiveEvent.collapsePanel(), new x20() { // from class: l.nzu
            @Override // p153l.x20
            public final void call() {
                yzu.m218035O3(this.f144473a);
            }
        });
        m138862g3(m213811F2().VoiceVirtualLiveEvent.updateCollapseLayout(), new x20() { // from class: l.ozu
            @Override // p153l.x20
            public final void call() {
                yzu.m218043X3(this.f149956a);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public final void m218045Y3(d2m page) {
        ((LiveVirtualVoiceFunctionPanelView) this.viewModel).m78761m0(page.mo113709T1());
        if (page instanceof l6t) {
            m153103z2((l6t) page);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public final void m218046Z3(String type) {
        d2m d2mVar;
        if (Intrinsics.m88377d(type, this.curFunction)) {
            return;
        }
        fhw.m125605a("[voice][call]", "changeFunction:" + type);
        this.curFunction = type;
        m218055i4();
        if (this.functions.containsKey(type)) {
            d2m d2mVar2 = this.functions.get(type);
            d2mVar2.getClass();
            d2mVar = d2mVar2;
            m218045Y3(d2mVar);
        } else {
            d2m d2mVarM218052f4 = m218052f4(type);
            this.functions.put(type, d2mVarM218052f4);
            m218050d4(d2mVarM218052f4);
            d2mVar = d2mVarM218052f4;
        }
        V v2 = this.viewModel;
        v2.getClass();
        d2mVar.mo113716u((ViewGroup) v2);
        boolean z = d2mVar instanceof sf60;
        V v3 = this.viewModel;
        if (z) {
            ((LiveVirtualVoiceFunctionPanelView) v3).m78771v0();
            m218048b4(d2mVar);
        } else {
            ((LiveVirtualVoiceFunctionPanelView) v3).m78763o0(d2mVar.mo113717x());
            ((LiveVirtualVoiceFunctionPanelView) this.viewModel).m78771v0();
        }
        ((LiveVirtualVoiceFunctionPanelView) this.viewModel).m78769t0(i9o0.m139137h(this));
        ((LiveVirtualVoiceFunctionPanelView) this.viewModel).setSupportExpand(d2mVar.mo113713e2());
    }

    /* JADX INFO: renamed from: a4 */
    public final void m218047a4() {
        try {
            BLiveVoice bLiveVoiceMo183435j = m213810E2().mo183435j();
            bLiveVoiceMo183435j.getClass();
            String str = bLiveVoiceMo183435j.template;
            str.getClass();
            m218046Z3(str);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final void m218048b4(d2m page) {
        ((LiveVirtualVoiceFunctionPanelView) this.viewModel).m78764p0(page.mo113707G0(), i9o0.m139137h(this));
        if (!i9o0.m139136g(this) || this.hasShowVoiceFunctionsDialog.booleanValue()) {
            return;
        }
        ((LiveVirtualVoiceFunctionPanelView) this.viewModel).m78765q0();
    }

    /* JADX INFO: renamed from: c4 */
    public final void m218049c4(boolean isCollapse) {
        d2m d2mVar = this.functions.get(this.curFunction);
        if (d2mVar != null) {
            ((LiveVirtualVoiceFunctionPanelView) this.viewModel).m78762n0(d2mVar.mo113707G0(), d2mVar.mo113717x(), d2mVar.mo113708P1(), d2mVar);
            d2mVar.mo113710Y(isCollapse);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d4 */
    public final void m218050d4(d2m page) {
        View viewInflate = LayoutInflater.from(this.f196918e.f90815a).inflate(page.mo113715g1(), (ViewGroup) null);
        LiveVirtualVoiceFunctionPanelView liveVirtualVoiceFunctionPanelView = (LiveVirtualVoiceFunctionPanelView) this.viewModel;
        viewInflate.getClass();
        liveVirtualVoiceFunctionPanelView.m78761m0(viewInflate);
        if ((viewInflate instanceof iam) && (page instanceof l6t)) {
            l6t l6tVar = (l6t) page;
            l6tVar.mo52715C((iam) viewInflate);
            m153103z2(l6tVar);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e4 */
    public final d2m m218051e4() {
        return this.functions.get(this.curFunction);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: f4 */
    public final d2m m218052f4(String type) {
        switch (type.hashCode()) {
            case -1779230753:
                if (type.equals(VirtualVoiceMotionType.undercover)) {
                    return new wrp0(this.curInfo);
                }
                break;
            case -661856701:
                if (type.equals("auction")) {
                    return new o81(this.curInfo);
                }
                break;
            case 156781895:
                if (type.equals(VirtualVoiceMotionType.announcement)) {
                    return new ss0(this.curInfo);
                }
                break;
            case 1609801911:
                if (type.equals(VirtualVoiceMotionType.chatTopic)) {
                    return new gaj0(this.curInfo);
                }
                break;
        }
        return new sf60(this.curInfo);
    }

    /* JADX INFO: renamed from: g4 */
    public final boolean m218053g4() {
        return i9o0.m139137h(this);
    }

    /* JADX INFO: renamed from: h4 */
    public final void m218054h4(boolean visible) {
        d2m d2mVar = this.functions.get(this.curFunction);
        if (d2mVar != null) {
            boolean z = false;
            ((LiveVirtualVoiceFunctionPanelView) this.viewModel).setSupportExpand(d2mVar.mo113713e2() && visible);
            LiveVirtualVoiceFunctionPanelView liveVirtualVoiceFunctionPanelView = (LiveVirtualVoiceFunctionPanelView) this.viewModel;
            if (i9o0.m139137h(this) && visible) {
                z = true;
            }
            liveVirtualVoiceFunctionPanelView.setSwitchViewVisible(z);
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final void m218055i4() {
        for (Map.Entry<String, d2m> entry : this.functions.entrySet()) {
            try {
                if (entry.getValue() instanceof l6t) {
                    Object value = entry.getValue();
                    value.getClass();
                    m153097C2((l6t) value);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final void m218056j4() {
        d2m d2mVar = this.functions.get(this.curFunction);
        if (d2mVar != null) {
            ((LiveVirtualVoiceFunctionPanelView) this.viewModel).m78774z0(d2mVar.mo113707G0());
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        C22421c<T> c22421cM113231o2 = m113231o2(m213810E2().m183409O2().m188658d(), false);
        final Function1 function1 = new Function1() { // from class: l.kzu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return yzu.m218031K3(this.f129462a, (BLiveVoice) obj);
            }
        };
        c22421cM113231o2.map(new qcj() { // from class: l.qzu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yzu.m218034N3(function1, obj);
            }
        }).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.rzu
            @Override // p153l.y20
            public final void call(Object obj) {
                yzu.m218042W3(this.f165626a, (String) obj);
            }
        }));
        C22421c<T> c22421cM113231o3 = m113231o2(m213810E2().m183413Q2(), false);
        final Function1 function2 = new Function1() { // from class: l.szu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return yzu.m218038S3((hrk0.C17564a) obj);
            }
        };
        C22421c c22421cFilter = c22421cM113231o3.filter(new qcj() { // from class: l.tzu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yzu.m218032L3(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.uzu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return yzu.m218036P3(this.f181812a, (hrk0.C17564a) obj);
            }
        };
        C22421c map = c22421cFilter.map(new qcj() { // from class: l.vzu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yzu.m218040U3(function3, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: l.wzu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return yzu.m218037R3((BLiveMember) obj);
            }
        };
        map.map(new qcj() { // from class: l.xzu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yzu.m218030J3(function4, obj);
            }
        }).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.lzu
            @Override // p153l.y20
            public final void call(Object obj) {
                yzu.m218033M3(this.f134263a, (Boolean) obj);
            }
        }));
        m113231o2(m213810E2().f148282z.m170284r().m98261W0(), false).subscribe(dhw.m115829h(new y20() { // from class: l.pzu
            @Override // p153l.y20
            public final void call(Object obj) {
                yzu.m218041V3(this.f154979a, (LongLinkVirtualVoice.VoiceLiveTemplateMessage) obj);
            }
        }));
    }
}
