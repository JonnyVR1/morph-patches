package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveScrapBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveScrapBubble;
import com.p051p1.mobile.putong.live.base.data.BLiveScrapTabData;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.scrap.bean.ScrapDialogEventData;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.C12995a;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u0000 _2\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u00020\u0004:\u0001`B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ@\u0010$\u001a\u00020\t2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001d2#\u0010#\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\t0\u001f¢\u0006\u0004\b$\u0010%J@\u0010&\u001a\u00020\t2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001d2#\u0010#\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\t0\u001f¢\u0006\u0004\b&\u0010%J\u0017\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u000eH\u0016¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\t¢\u0006\u0004\b*\u0010\u000bJ\r\u0010,\u001a\u00020+¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020+¢\u0006\u0004\b.\u0010-J\r\u0010/\u001a\u00020\u0015¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020+¢\u0006\u0004\b1\u0010-J\r\u00102\u001a\u00020\u0019¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\t2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\t2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b8\u00107J\u000f\u00109\u001a\u00020\tH\u0002¢\u0006\u0004\b9\u0010\u000bJ\u000f\u0010:\u001a\u00020\tH\u0002¢\u0006\u0004\b:\u0010\u000bJ\u000f\u0010;\u001a\u00020\tH\u0002¢\u0006\u0004\b;\u0010\u000bJ\u000f\u0010<\u001a\u00020\tH\u0002¢\u0006\u0004\b<\u0010\u000bJ\u0017\u0010?\u001a\u00020\t2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u001f\u0010B\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u000eH\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0015H\u0002¢\u0006\u0004\bD\u00100J\u0017\u0010F\u001a\u00020\t2\u0006\u0010E\u001a\u00020\u0019H\u0002¢\u0006\u0004\bF\u0010\u001cJ\u0011\u0010G\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001e\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001e\u0010S\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010PR\u0016\u0010V\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Y\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010[\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010XR\u001c\u0010^\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\\\u0010X\u0012\u0004\b]\u0010\u000b¨\u0006a"}, m88121d2 = {"Ll/nce0;", "Ll/y8s;", "Ll/oo2;", "Ll/ece0;", "Ll/sce0$a;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", Constants.KEY_T, "()V", "a4", "", "Ll/sce0;", "d4", "()Ljava/util/List;", "Lcom/p1/mobile/putong/live/base/data/BLiveScrapBrief;", "selectedScrapBrief", "n4", "(Lcom/p1/mobile/putong/live/base/data/BLiveScrapBrief;)V", "", "targetSchemeUrl", "m4", "(Ljava/lang/String;)V", "", "targetWebDialogHeight", "o4", "(I)V", "Lkotlin/Function0;", "noNeedHandle", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "selectedScrapInfo", "refreshTabAction", "k4", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "l4", "newSelectedItemModel", BaseSei.f14626Z, "(Ll/sce0;)V", "j4", "", "s4", "()Z", "t4", "c4", "()Ljava/lang/String;", "u4", "g4", "()I", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/scrap/bean/ScrapDialogEventData;", "scrapDialogEventData", "q4", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/scrap/bean/ScrapDialogEventData;)V", "v4", "w4", "Z3", "r4", "i4", "", "error", "h4", "(Ljava/lang/Throwable;)V", "oldSelectedItemModel", "p4", "(Ll/sce0;Ll/sce0;)V", "b4", "scrapTab", "x4", "f4", "()Ll/sce0;", "Ll/cyj;", "j", "Lkotlin/Lazy;", "e4", "()Ll/cyj;", "scrapUseCase", "k", "Ljava/util/List;", "giftScrapItemModelList", BLiveStormDanmakuGiftResourceType.f45292l, "rightScrapItemModelList", "m", "Z", "isFirstUpdate", "n", "I", "rightSelectedItemPosition", "o", "giftSelectedItemPosition", "p", "getCurrentScrapTab$annotations", "currentScrapTab", "Companion", "a", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class nce0 extends y8s<oo2, ece0> implements sce0.InterfaceC20016a {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Lazy scrapUseCase;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public List<? extends sce0> giftScrapItemModelList;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public List<? extends sce0> rightScrapItemModelList;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean isFirstUpdate;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public int rightSelectedItemPosition;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int giftSelectedItemPosition;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int currentScrapTab;

    public nce0(@Nullable dum<?> dumVar) {
        super(dumVar);
        this.scrapUseCase = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.hce0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return nce0.m162523V3();
            }
        });
        this.isFirstUpdate = true;
        this.currentScrapTab = 1;
    }

    /* JADX INFO: renamed from: S3 */
    public static void m162520S3(nce0 nce0Var, ScrapDialogEventData scrapDialogEventData, Unit unit) {
        nce0Var.m162549v4(scrapDialogEventData);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m162521T3(nce0 nce0Var, Throwable th) {
        th.getClass();
        nce0Var.m162535h4(th);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m162522U3(nce0 nce0Var, BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        nce0Var.m162536i4();
    }

    /* JADX INFO: renamed from: V3 */
    public static cyj m162523V3() {
        return new cyj();
    }

    /* JADX INFO: renamed from: W3 */
    public static Unit m162524W3(nce0 nce0Var, boolean z, int i) {
        if (z) {
            nce0Var.giftSelectedItemPosition = i;
            nce0Var.m162551x4(1);
        } else {
            nce0Var.rightSelectedItemPosition = i;
            nce0Var.m162551x4(2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static void m162525X3(nce0 nce0Var, Throwable th) {
        nce0Var.m162550w4();
    }

    /* JADX INFO: renamed from: Y3 */
    public static void m162526Y3(nce0 nce0Var, ScrapDialogEventData scrapDialogEventData) {
        scrapDialogEventData.getClass();
        nce0Var.m162544q4(scrapDialogEventData);
    }

    /* JADX INFO: renamed from: Z3 */
    private final void m162527Z3() {
        this.isFirstUpdate = true;
        this.currentScrapTab = 1;
        this.giftSelectedItemPosition = 0;
        this.rightSelectedItemPosition = 0;
        this.giftScrapItemModelList = null;
        this.rightScrapItemModelList = null;
    }

    /* JADX INFO: renamed from: a4 */
    public final void m162528a4() {
        m162527Z3();
        m162532e4().m113185c();
    }

    /* JADX INFO: renamed from: b4 */
    public final String m162529b4() {
        BLiveScrapBubble bLiveScrapBubble;
        BLiveScrapBubble bLiveScrapBubble2;
        boolean zM162548u4 = m162548u4();
        if (zM162548u4) {
            BLiveScrapTabData bLiveScrapTabDataM113189g = m162532e4().getRightScrapTabData();
            if (bLiveScrapTabDataM113189g == null || (bLiveScrapBubble2 = bLiveScrapTabDataM113189g.bubble) == null) {
                return "";
            }
            String str = bLiveScrapBubble2.scheme;
            str.getClass();
            return str;
        }
        if (zM162548u4) {
            nbr.m162172a();
            return null;
        }
        BLiveScrapTabData bLiveScrapTabDataM113188f = m162532e4().getGiftScrapTabData();
        if (bLiveScrapTabDataM113188f == null || (bLiveScrapBubble = bLiveScrapTabDataM113188f.bubble) == null) {
            return "";
        }
        String str2 = bLiveScrapBubble.scheme;
        str2.getClass();
        return str2;
    }

    @NotNull
    /* JADX INFO: renamed from: c4 */
    public final String m162530c4() {
        BLiveScrapBubble bLiveScrapBubble;
        BLiveScrapBubble bLiveScrapBubble2;
        boolean zM162548u4 = m162548u4();
        if (zM162548u4) {
            BLiveScrapTabData bLiveScrapTabDataM113189g = m162532e4().getRightScrapTabData();
            if (bLiveScrapTabDataM113189g == null || (bLiveScrapBubble2 = bLiveScrapTabDataM113189g.bubble) == null) {
                return "";
            }
            String str = bLiveScrapBubble2.title;
            str.getClass();
            return str;
        }
        if (zM162548u4) {
            nbr.m162172a();
            return null;
        }
        BLiveScrapTabData bLiveScrapTabDataM113188f = m162532e4().getGiftScrapTabData();
        if (bLiveScrapTabDataM113188f == null || (bLiveScrapBubble = bLiveScrapTabDataM113188f.bubble) == null) {
            return "";
        }
        String str2 = bLiveScrapBubble.title;
        str2.getClass();
        return str2;
    }

    @NotNull
    /* JADX INFO: renamed from: d4 */
    public final List<sce0> m162531d4() {
        if (this.isFirstUpdate) {
            this.isFirstUpdate = false;
            m162545r4();
        }
        if (m162548u4()) {
            List<? extends sce0> list = this.rightScrapItemModelList;
            if (list != null) {
                for (sce0 sce0Var : list) {
                    BLiveScrapBrief bLiveScrapBrief = sce0Var.f167249b;
                    bLiveScrapBrief.isRightTabScrap = true;
                    bLiveScrapBrief.isSelected = false;
                    if (sce0Var == list.get(this.rightSelectedItemPosition)) {
                        sce0Var.f167249b.isSelected = true;
                    }
                }
            }
            List list2 = this.rightScrapItemModelList;
            list2.getClass();
            return list2;
        }
        List<? extends sce0> list3 = this.giftScrapItemModelList;
        if (list3 != null) {
            for (sce0 sce0Var2 : list3) {
                BLiveScrapBrief bLiveScrapBrief2 = sce0Var2.f167249b;
                bLiveScrapBrief2.isRightTabScrap = false;
                bLiveScrapBrief2.isSelected = false;
                if (sce0Var2 == list3.get(this.giftSelectedItemPosition)) {
                    sce0Var2.f167249b.isSelected = true;
                }
            }
        }
        List list4 = this.giftScrapItemModelList;
        list4.getClass();
        return list4;
    }

    /* JADX INFO: renamed from: e4 */
    public final cyj m162532e4() {
        return (cyj) this.scrapUseCase.getValue();
    }

    /* JADX INFO: renamed from: f4 */
    public final sce0 m162533f4() {
        boolean zM162548u4 = m162548u4();
        if (zM162548u4) {
            List<? extends sce0> list = this.rightScrapItemModelList;
            if (list != null && this.rightSelectedItemPosition < list.size()) {
                return list.get(this.rightSelectedItemPosition);
            }
        } else {
            if (zM162548u4) {
                nbr.m162172a();
                return null;
            }
            List<? extends sce0> list2 = this.giftScrapItemModelList;
            if (list2 != null && this.giftSelectedItemPosition < list2.size()) {
                return list2.get(this.giftSelectedItemPosition);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g4 */
    public final int m162534g4() {
        return m162548u4() ? this.rightSelectedItemPosition : this.giftSelectedItemPosition;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m162535h4(Throwable error) {
        if (error instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) error;
            if (coreService.code == 40099) {
                o1j0.m165651y(coreService.metaMessage);
            }
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final void m162536i4() {
        sce0 sce0VarM162533f4 = m162533f4();
        sce0VarM162533f4.getClass();
        GiftTrayData giftTrayDataM75333k = GiftTrayData.m75333k(sce0VarM162533f4.f167249b.itemId, "live");
        if (!TextUtils.isEmpty(giftTrayDataM75333k.f50967y)) {
            m213811F2().GiftTraysEvent.addGiftTrayDataToList().mo199273j(new C12995a.a(702).m75452f(giftTrayDataM75333k).m75451e());
        }
        ece0 ece0Var = (ece0) this.viewModel;
        if (ece0Var != null) {
            ece0Var.m120333U0();
        }
        m213811F2().GiftDialogEventGroup.dismissGiftDialog().mo199273j(702);
    }

    /* JADX INFO: renamed from: j4 */
    public final void m162537j4() {
        if (m162529b4().length() == 0) {
            return;
        }
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(200).m103154e(m162529b4()).m103152c());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m162538k4(@NotNull Function0<Unit> noNeedHandle, @NotNull Function1<? super BLiveScrapBrief, Unit> refreshTabAction) {
        noNeedHandle.getClass();
        refreshTabAction.getClass();
        if (this.currentScrapTab == 1) {
            noNeedHandle.invoke();
            return;
        }
        m162551x4(1);
        sce0 sce0VarM162533f4 = m162533f4();
        refreshTabAction.invoke(sce0VarM162533f4 != null ? sce0VarM162533f4.f167249b : null);
    }

    /* JADX INFO: renamed from: l4 */
    public final void m162539l4(@NotNull Function0<Unit> noNeedHandle, @NotNull Function1<? super BLiveScrapBrief, Unit> refreshTabAction) {
        noNeedHandle.getClass();
        refreshTabAction.getClass();
        if (this.currentScrapTab == 2) {
            noNeedHandle.invoke();
            return;
        }
        m162551x4(2);
        sce0 sce0VarM162533f4 = m162533f4();
        refreshTabAction.invoke(sce0VarM162533f4 != null ? sce0VarM162533f4.f167249b : null);
    }

    /* JADX INFO: renamed from: m4 */
    public final void m162540m4(@NotNull String targetSchemeUrl) {
        targetSchemeUrl.getClass();
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(702).m103154e(targetSchemeUrl).m103152c());
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, l.oo2] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, l.oo2] */
    /* JADX INFO: renamed from: n4 */
    public final void m162541n4(@NotNull BLiveScrapBrief selectedScrapBrief) {
        selectedScrapBrief.getClass();
        if (m213810E2() == 0) {
            return;
        }
        cyj cyjVarM162532e4 = m162532e4();
        String str = m162548u4() ? "rightTab" : "scrapTab";
        String str2 = selectedScrapBrief.itemId;
        str2.getClass();
        String str3 = selectedScrapBrief.targetItem.itemId;
        str3.getClass();
        ?? M213810E2 = m213810E2();
        M213810E2.getClass();
        String strMo118362A0 = M213810E2.mo118362A0();
        strMo118362A0.getClass();
        ?? M213810E3 = m213810E2();
        M213810E3.getClass();
        String strM202194o = M213810E3.m202194o();
        strM202194o.getClass();
        ?? M213810E4 = m213810E2();
        M213810E4.getClass();
        String strM202191k = M213810E4.m202191k();
        strM202191k.getClass();
        ?? M213810E5 = m213810E2();
        M213810E5.getClass();
        String str4 = M213810E5.m168532l0().f56859id;
        str4.getClass();
        duringCreated(cyjVarM162532e4.m113186d(str, str2, str3, strMo118362A0, strM202194o, strM202191k, str4)).subscribe(dhw.m115826e(new y20() { // from class: l.lce0
            @Override // p153l.y20
            public final void call(Object obj) {
                nce0.m162522U3(this.f131354a, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.mce0
            @Override // p153l.y20
            public final void call(Object obj) {
                nce0.m162521T3(this.f135807a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o4 */
    public final void m162542o4(int targetWebDialogHeight) {
        m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(702).m174141B(efv.f93859p).m174146t(80).m174145s(qa00.m175859d(10.0f)).m174140A(bnl0.m105592y0(), targetWebDialogHeight).m174143q());
    }

    /* JADX INFO: renamed from: p4 */
    public final void m162543p4(sce0 newSelectedItemModel, sce0 oldSelectedItemModel) {
        if (oldSelectedItemModel == newSelectedItemModel) {
            return;
        }
        oldSelectedItemModel.f167249b.isSelected = false;
        newSelectedItemModel.f167249b.isSelected = true;
        ece0 ece0Var = (ece0) this.viewModel;
        if (ece0Var != null) {
            ece0Var.m120339X0(oldSelectedItemModel);
            ece0Var.m120339X0(newSelectedItemModel);
            BLiveScrapBrief bLiveScrapBrief = newSelectedItemModel.f167249b;
            bLiveScrapBrief.getClass();
            ece0Var.m120337W0(bLiveScrapBrief);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.oo2] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, l.oo2] */
    /* JADX INFO: renamed from: q4 */
    public final void m162544q4(final ScrapDialogEventData scrapDialogEventData) {
        if (this.viewModel == 0) {
            Act act = this.f196918e.f90815a;
            act.getClass();
            mo52715C(new ece0(act, this));
        }
        cyj cyjVarM162532e4 = m162532e4();
        ?? M213810E2 = m213810E2();
        M213810E2.getClass();
        String strMo118362A0 = M213810E2.mo118362A0();
        strMo118362A0.getClass();
        ?? M213810E3 = m213810E2();
        M213810E3.getClass();
        String strM202194o = M213810E3.m202194o();
        strM202194o.getClass();
        ?? M213810E4 = m213810E2();
        M213810E4.getClass();
        String strM202191k = M213810E4.m202191k();
        strM202191k.getClass();
        ?? M213810E5 = m213810E2();
        M213810E5.getClass();
        String str = M213810E5.m168532l0().f56859id;
        str.getClass();
        duringCreated(cyjVarM162532e4.m113190h(strMo118362A0, strM202194o, strM202191k, str)).subscribe(dhw.m115826e(new y20() { // from class: l.ice0
            @Override // p153l.y20
            public final void call(Object obj) {
                nce0.m162520S3(this.f114403a, scrapDialogEventData, (Unit) obj);
            }
        }, new y20() { // from class: l.jce0
            @Override // p153l.y20
            public final void call(Object obj) {
                nce0.m162525X3(this.f120045a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r4 */
    public final void m162545r4() {
        BLiveScrapTabData bLiveScrapTabDataM113189g = m162532e4().getRightScrapTabData();
        if (bLiveScrapTabDataM113189g != null) {
            this.rightScrapItemModelList = qbe0.m176024b(bLiveScrapTabDataM113189g.scrapBriefs);
        }
        List<? extends sce0> list = this.rightScrapItemModelList;
        if (list != null) {
            for (sce0 sce0Var : list) {
                sce0Var.m185377K(this);
                sce0Var.f167249b.isRightTabScrap = m162548u4();
            }
        }
        BLiveScrapTabData bLiveScrapTabDataM113188f = m162532e4().getGiftScrapTabData();
        if (bLiveScrapTabDataM113188f != null) {
            this.giftScrapItemModelList = qbe0.m176024b(bLiveScrapTabDataM113188f.scrapBriefs);
        }
        List<? extends sce0> list2 = this.giftScrapItemModelList;
        if (list2 != null) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                ((sce0) it.next()).m185377K(this);
            }
        }
    }

    /* JADX INFO: renamed from: s4 */
    public final boolean m162546s4() {
        return m162532e4().getGiftScrapTabData() != null;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().ScrapInfoDialogEvent.show().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.gce0
            @Override // p153l.y20
            public final void call(Object obj) {
                nce0.m162526Y3(this.f103562a, (ScrapDialogEventData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final boolean m162547t4() {
        return m162532e4().getRightScrapTabData() != null;
    }

    /* JADX INFO: renamed from: u4 */
    public final boolean m162548u4() {
        return this.currentScrapTab == 2;
    }

    /* JADX INFO: renamed from: v4 */
    public final void m162549v4(ScrapDialogEventData scrapDialogEventData) {
        if (yj5.m216388a(m162532e4().getGiftScrapTabData()) && yj5.m216388a(m162532e4().getRightScrapTabData())) {
            m162550w4();
            return;
        }
        String str = scrapDialogEventData.targetScrapId;
        if (str == null || str.length() == 0) {
            this.giftSelectedItemPosition = 0;
            this.rightSelectedItemPosition = 0;
            ece0 ece0Var = (ece0) this.viewModel;
            if (ece0Var != null) {
                ece0Var.m120327R0(m162532e4().m113187e());
                return;
            }
            return;
        }
        cyj cyjVarM162532e4 = m162532e4();
        String str2 = scrapDialogEventData.targetScrapId;
        str2.getClass();
        BLiveScrapBrief bLiveScrapBriefM113192j = cyjVarM162532e4.m113192j(str2, new Function2() { // from class: l.kce0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return nce0.m162524W3(this.f125059a, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue());
            }
        });
        ece0 ece0Var2 = (ece0) this.viewModel;
        if (ece0Var2 != null) {
            ece0Var2.m120327R0(bLiveScrapBriefM113192j);
        }
    }

    /* JADX INFO: renamed from: w4 */
    public final void m162550w4() {
        ece0 ece0Var = (ece0) this.viewModel;
        if (ece0Var != null) {
            ece0Var.m120329S0();
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final void m162551x4(int scrapTab) {
        this.currentScrapTab = scrapTab;
    }

    @Override // p153l.sce0.InterfaceC20016a
    /* JADX INFO: renamed from: z */
    public void mo162552z(@NotNull sce0 newSelectedItemModel) {
        newSelectedItemModel.getClass();
        if (m162548u4()) {
            List<? extends sce0> list = this.rightScrapItemModelList;
            list.getClass();
            m162543p4(newSelectedItemModel, list.get(this.rightSelectedItemPosition));
            List<? extends sce0> list2 = this.rightScrapItemModelList;
            list2.getClass();
            this.rightSelectedItemPosition = list2.indexOf(newSelectedItemModel);
            return;
        }
        List<? extends sce0> list3 = this.giftScrapItemModelList;
        list3.getClass();
        m162543p4(newSelectedItemModel, list3.get(this.giftSelectedItemPosition));
        List<? extends sce0> list4 = this.giftScrapItemModelList;
        list4.getClass();
        this.giftSelectedItemPosition = list4.indexOf(newSelectedItemModel);
    }
}
