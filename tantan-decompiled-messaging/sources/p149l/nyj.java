package p149l;

import com.core.glcore.util.ErrorCode;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
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
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\fJ\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001e\u0010\u0010R \u0010#\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010'\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, m87232d2 = {"Ll/nyj;", "Ll/x6s;", "Ll/nnn0;", "Ll/byj;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", "menuType", "", "d4", "(I)V", "state", "c4", "R3", "()V", j6f.GPS_DIRECTION_TRUE, "e4", "", "Ll/eyj;", "a4", "()Ljava/util/List;", "", "helpUrl", "height", "b4", "(Ljava/lang/String;I)V", "j", "I", "getCurrentMenu$annotations", "currentMenu", "Ll/uzj;", "k", "Ll/uzj;", "giftWallPagePresenter", "Ll/lgx;", BLiveStormDanmakuGiftResourceType.f44444l, "Ll/lgx;", "medalLabelPagePresenter", "m", "Ljava/lang/String;", "toUserId", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class nyj extends x6s<nnn0, byj> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int currentMenu;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public uzj<?, ?> giftWallPagePresenter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public lgx<?, ?> medalLabelPagePresenter;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public String toUserId;

    public nyj(@Nullable bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        this.toUserId = "";
        bsmVar.getClass();
        mo51532C(new byj(bsmVar.f77095a, this));
    }

    /* JADX INFO: renamed from: S3 */
    public static int m162014S3(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: renamed from: T3 */
    public static void m162015T3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: U3 */
    public static Unit m162016U3(nyj nyjVar, soj0 soj0Var) {
        ((byj) nyjVar.viewModel).mo71838p();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static void m162017V3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W3 */
    public static void m162018W3(int i, gul gulVar) {
        if (gulVar instanceof cyj) {
            cyj cyjVar = (cyj) gulVar;
            if (cyjVar.mo109318T3() == i) {
                cyjVar.m109319U3();
            }
        }
    }

    /* JADX INFO: renamed from: X3 */
    public static void m162019X3(ArrayList arrayList, gul gulVar) {
        if (gulVar instanceof cyj) {
            arrayList.add(((cyj) gulVar).mo109317S3());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public static Unit m162020Y3(nyj nyjVar, j760 j760Var) {
        F f = j760Var.f116564a;
        f.getClass();
        String str = (String) f;
        nyjVar.toUserId = str;
        uzj<?, ?> uzjVar = nyjVar.giftWallPagePresenter;
        if (uzjVar != null) {
            uzjVar.m196429d4(str);
        }
        lgx<?, ?> lgxVar = nyjVar.medalLabelPagePresenter;
        if (lgxVar != null) {
            lgxVar.m149797f4(nyjVar.toUserId);
        }
        S s = j760Var.f116565b;
        s.getClass();
        nyjVar.m162023d4(((Integer) s).intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static int m162021Z3(eyj eyjVar, eyj eyjVar2) {
        eyjVar.getClass();
        eyjVar2.getClass();
        return eyjVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() - eyjVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String();
    }

    /* JADX INFO: renamed from: c4 */
    private final void m162022c4(final int state) {
        HashMap<String, gul> map = this.f121122b;
        if (map == null) {
            return;
        }
        vwb.m200354z(map.values(), new e30() { // from class: l.myj
            @Override // p149l.e30
            public final void call(Object obj) {
                nyj.m162018W3(state, (gul) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d4 */
    private final void m162023d4(int menuType) {
        ((byj) this.viewModel).m104488W(menuType);
        m162026e4(menuType);
        tyj.m191048a(ypv.f199493a.m199309D0());
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: R3 */
    public void mo96985R3() {
        super.mo96985R3();
        bsm<? extends T> bsmVar = this.f188512e;
        this.giftWallPagePresenter = (uzj) m144512z2(new uzj(bsmVar, new qzj(bsmVar.f77095a)));
        bsm<? extends T> bsmVar2 = this.f188512e;
        this.medalLabelPagePresenter = (lgx) m144512z2(new lgx(bsmVar2, new ggx(bsmVar2.f77095a)));
        uzj<?, ?> uzjVar = this.giftWallPagePresenter;
        if (uzjVar != null) {
            uzjVar.m196429d4(this.toUserId);
        }
        lgx<?, ?> lgxVar = this.medalLabelPagePresenter;
        if (lgxVar != null) {
            lgxVar.m149797f4(this.toUserId);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        C22306c<T> c22306cDuringCreated = duringCreated(m206028F2().GiftWallDialogEvent.closeLocalGiftWallDialog().m172460g());
        final Function1 function1 = new Function1() { // from class: l.iyj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return nyj.m162016U3(this.f115461a, (soj0) obj);
            }
        };
        c22306cDuringCreated.subscribe(new e30() { // from class: l.jyj
            @Override // p149l.e30
            public final void call(Object obj) {
                nyj.m162015T3(function1, obj);
            }
        });
        C22306c<T> c22306cDuringCreated2 = duringCreated(m206028F2().GiftWallDialogEvent.showLocalGiftWallDialog().m172460g());
        final Function1 function2 = new Function1() { // from class: l.kyj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return nyj.m162020Y3(this.f125311a, (j760) obj);
            }
        };
        c22306cDuringCreated2.subscribe(new e30() { // from class: l.lyj
            @Override // p149l.e30
            public final void call(Object obj) {
                nyj.m162017V3(function2, obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: a4 */
    public final List<eyj> m162024a4() {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(this.f121122b.values(), new e30() { // from class: l.fyj
            @Override // p149l.e30
            public final void call(Object obj) {
                nyj.m162019X3(arrayList, (gul) obj);
            }
        });
        final Function2 function2 = new Function2() { // from class: l.gyj
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(nyj.m162021Z3((eyj) obj, (eyj) obj2));
            }
        };
        vwb.m200295I(arrayList, new Comparator() { // from class: l.hyj
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return nyj.m162014S3(function2, obj, obj2);
            }
        });
        return CollectionsKt.toList(arrayList);
    }

    /* JADX INFO: renamed from: b4 */
    public final void m162025b4(@NotNull String helpUrl, int height) {
        helpUrl.getClass();
        m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(ErrorCode.RENDER_TARGET_FAILED).m142598B(helpUrl).m142599p(CommonH5Builder.BgType.TRAN_BG).m142603t(80).m142602s(24).m142597A(xdl0.m208412y0(), height).m142600q());
    }

    /* JADX INFO: renamed from: e4 */
    public final void m162026e4(int menuType) {
        this.currentMenu = menuType;
        m162022c4(menuType);
    }
}
