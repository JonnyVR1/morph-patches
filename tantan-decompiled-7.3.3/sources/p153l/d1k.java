package p153l;

import com.core.glcore.util.ErrorCode;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\fJ\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001e\u0010\u0010R \u0010#\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010'\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, m88121d2 = {"Ll/d1k;", "Ll/y8s;", "Ll/rwn0;", "Ll/r0k;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", "menuType", "", "d4", "(I)V", "state", "c4", "R3", "()V", p7f.GPS_DIRECTION_TRUE, "e4", "", "Ll/u0k;", "a4", "()Ljava/util/List;", "", "helpUrl", "height", "b4", "(Ljava/lang/String;I)V", "j", "I", "getCurrentMenu$annotations", "currentMenu", "Ll/k2k;", "k", "Ll/k2k;", "giftWallPagePresenter", "Ll/jpx;", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/jpx;", "medalLabelPagePresenter", "m", "Ljava/lang/String;", "toUserId", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class d1k extends y8s<rwn0, r0k> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int currentMenu;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public k2k<?, ?> giftWallPagePresenter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public jpx<?, ?> medalLabelPagePresenter;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public String toUserId;

    public d1k(@Nullable dum<? extends rwn0> dumVar) {
        super(dumVar);
        this.toUserId = "";
        dumVar.getClass();
        mo52715C(new r0k(dumVar.f90815a, this));
    }

    /* JADX INFO: renamed from: S3 */
    public static int m113577S3(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: renamed from: T3 */
    public static void m113578T3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: U3 */
    public static Unit m113579U3(d1k d1kVar, vxj0 vxj0Var) {
        ((r0k) d1kVar.viewModel).mo73021p();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static void m113580V3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W3 */
    public static void m113581W3(int i, uwl uwlVar) {
        if (uwlVar instanceof s0k) {
            s0k s0kVar = (s0k) uwlVar;
            if (s0kVar.mo146525T3() == i) {
                s0kVar.m183960U3();
            }
        }
    }

    /* JADX INFO: renamed from: X3 */
    public static void m113582X3(ArrayList arrayList, uwl uwlVar) {
        if (uwlVar instanceof s0k) {
            arrayList.add(((s0k) uwlVar).mo146524S3());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public static Unit m113583Y3(d1k d1kVar, pf60 pf60Var) {
        F f = pf60Var.f152156a;
        f.getClass();
        String str = (String) f;
        d1kVar.toUserId = str;
        k2k<?, ?> k2kVar = d1kVar.giftWallPagePresenter;
        if (k2kVar != null) {
            k2kVar.m147977d4(str);
        }
        jpx<?, ?> jpxVar = d1kVar.medalLabelPagePresenter;
        if (jpxVar != null) {
            jpxVar.m146531f4(d1kVar.toUserId);
        }
        S s = pf60Var.f152157b;
        s.getClass();
        d1kVar.m113586d4(((Integer) s).intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static int m113584Z3(u0k u0kVar, u0k u0kVar2) {
        u0kVar.getClass();
        u0kVar2.getClass();
        return u0kVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() - u0kVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String();
    }

    /* JADX INFO: renamed from: c4 */
    private final void m113585c4(final int state) {
        HashMap<String, uwl> map = this.f130285b;
        if (map == null) {
            return;
        }
        jyb.m147537z(map.values(), new y20() { // from class: l.c1k
            @Override // p153l.y20
            public final void call(Object obj) {
                d1k.m113581W3(state, (uwl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d4 */
    private final void m113586d4(int menuType) {
        ((r0k) this.viewModel).m179238W(menuType);
        m113589e4(menuType);
        j1k.m143139a(zrv.f205799a.m207631D0());
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: R3 */
    public void mo103124R3() {
        super.mo103124R3();
        dum<? extends T> dumVar = this.f196918e;
        this.giftWallPagePresenter = (k2k) m153103z2(new k2k(dumVar, new g2k(dumVar.f90815a)));
        dum<? extends T> dumVar2 = this.f196918e;
        this.medalLabelPagePresenter = (jpx) m153103z2(new jpx(dumVar2, new epx(dumVar2.f90815a)));
        k2k<?, ?> k2kVar = this.giftWallPagePresenter;
        if (k2kVar != null) {
            k2kVar.m147977d4(this.toUserId);
        }
        jpx<?, ?> jpxVar = this.medalLabelPagePresenter;
        if (jpxVar != null) {
            jpxVar.m146531f4(this.toUserId);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        C22421c<T> c22421cDuringCreated = duringCreated(m213811F2().GiftWallDialogEvent.closeLocalGiftWallDialog().m199270g());
        final Function1 function1 = new Function1() { // from class: l.y0k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d1k.m113579U3(this.f197016a, (vxj0) obj);
            }
        };
        c22421cDuringCreated.subscribe(new y20() { // from class: l.z0k
            @Override // p153l.y20
            public final void call(Object obj) {
                d1k.m113578T3(function1, obj);
            }
        });
        C22421c<T> c22421cDuringCreated2 = duringCreated(m213811F2().GiftWallDialogEvent.showLocalGiftWallDialog().m199270g());
        final Function1 function2 = new Function1() { // from class: l.a1k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d1k.m113583Y3(this.f67819a, (pf60) obj);
            }
        };
        c22421cDuringCreated2.subscribe(new y20() { // from class: l.b1k
            @Override // p153l.y20
            public final void call(Object obj) {
                d1k.m113580V3(function2, obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: a4 */
    public final List<u0k> m113587a4() {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(this.f130285b.values(), new y20() { // from class: l.v0k
            @Override // p153l.y20
            public final void call(Object obj) {
                d1k.m113582X3(arrayList, (uwl) obj);
            }
        });
        final Function2 function2 = new Function2() { // from class: l.w0k
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(d1k.m113584Z3((u0k) obj, (u0k) obj2));
            }
        };
        jyb.m147478I(arrayList, new Comparator() { // from class: l.x0k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return d1k.m113577S3(function2, obj, obj2);
            }
        });
        return CollectionsKt.toList(arrayList);
    }

    /* JADX INFO: renamed from: b4 */
    public final void m113588b4(@NotNull String helpUrl, int height) {
        helpUrl.getClass();
        m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(ErrorCode.RENDER_TARGET_FAILED).m174141B(helpUrl).m174142p(CommonH5Builder.BgType.TRAN_BG).m174146t(80).m174145s(24).m174140A(bnl0.m105592y0(), height).m174143q());
    }

    /* JADX INFO: renamed from: e4 */
    public final void m113589e4(int menuType) {
        this.currentMenu = menuType;
        m113585c4(menuType);
    }
}
