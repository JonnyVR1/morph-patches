package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveScrapBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveScrapBubble;
import com.p046p1.mobile.putong.live.base.data.BLiveScrapTabData;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.scrap.bean.ScrapDialogEventData;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.C12832a;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
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
@Metadata(m87231d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u0000 _2\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u00020\u0004:\u0001`B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ@\u0010$\u001a\u00020\t2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001d2#\u0010#\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\t0\u001f¢\u0006\u0004\b$\u0010%J@\u0010&\u001a\u00020\t2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001d2#\u0010#\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\t0\u001f¢\u0006\u0004\b&\u0010%J\u0017\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u000eH\u0016¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\t¢\u0006\u0004\b*\u0010\u000bJ\r\u0010,\u001a\u00020+¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020+¢\u0006\u0004\b.\u0010-J\r\u0010/\u001a\u00020\u0015¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020+¢\u0006\u0004\b1\u0010-J\r\u00102\u001a\u00020\u0019¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\t2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\t2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b8\u00107J\u000f\u00109\u001a\u00020\tH\u0002¢\u0006\u0004\b9\u0010\u000bJ\u000f\u0010:\u001a\u00020\tH\u0002¢\u0006\u0004\b:\u0010\u000bJ\u000f\u0010;\u001a\u00020\tH\u0002¢\u0006\u0004\b;\u0010\u000bJ\u000f\u0010<\u001a\u00020\tH\u0002¢\u0006\u0004\b<\u0010\u000bJ\u0017\u0010?\u001a\u00020\t2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u001f\u0010B\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u000eH\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0015H\u0002¢\u0006\u0004\bD\u00100J\u0017\u0010F\u001a\u00020\t2\u0006\u0010E\u001a\u00020\u0019H\u0002¢\u0006\u0004\bF\u0010\u001cJ\u0011\u0010G\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001e\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001e\u0010S\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010PR\u0016\u0010V\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Y\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010[\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010XR\u001c\u0010^\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\\\u0010X\u0012\u0004\b]\u0010\u000b¨\u0006a"}, m87232d2 = {"Ll/j4e0;", "Ll/x6s;", "Ll/ho2;", "Ll/a4e0;", "Ll/o4e0$a;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "a4", "", "Ll/o4e0;", "d4", "()Ljava/util/List;", "Lcom/p1/mobile/putong/live/base/data/BLiveScrapBrief;", "selectedScrapBrief", "n4", "(Lcom/p1/mobile/putong/live/base/data/BLiveScrapBrief;)V", "", "targetSchemeUrl", "m4", "(Ljava/lang/String;)V", "", "targetWebDialogHeight", "o4", "(I)V", "Lkotlin/Function0;", "noNeedHandle", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "selectedScrapInfo", "refreshTabAction", "k4", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "l4", "newSelectedItemModel", BaseSei.f13932Z, "(Ll/o4e0;)V", "j4", "", "s4", "()Z", "t4", "c4", "()Ljava/lang/String;", "u4", "g4", "()I", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/scrap/bean/ScrapDialogEventData;", "scrapDialogEventData", "q4", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/scrap/bean/ScrapDialogEventData;)V", "v4", "w4", "Z3", "r4", "i4", "", "error", "h4", "(Ljava/lang/Throwable;)V", "oldSelectedItemModel", "p4", "(Ll/o4e0;Ll/o4e0;)V", "b4", "scrapTab", "x4", "f4", "()Ll/o4e0;", "Ll/mvj;", "j", "Lkotlin/Lazy;", "e4", "()Ll/mvj;", "scrapUseCase", "k", "Ljava/util/List;", "giftScrapItemModelList", BLiveStormDanmakuGiftResourceType.f44444l, "rightScrapItemModelList", "m", "Z", "isFirstUpdate", "n", "I", "rightSelectedItemPosition", "o", "giftSelectedItemPosition", "p", "getCurrentScrapTab$annotations", "currentScrapTab", "Companion", "a", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class j4e0 extends x6s<ho2, a4e0> implements o4e0.InterfaceC18839a {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Lazy scrapUseCase;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public List<? extends o4e0> giftScrapItemModelList;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public List<? extends o4e0> rightScrapItemModelList;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean isFirstUpdate;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public int rightSelectedItemPosition;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int giftSelectedItemPosition;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int currentScrapTab;

    public j4e0(@Nullable bsm<?> bsmVar) {
        super(bsmVar);
        this.scrapUseCase = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.d4e0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j4e0.m139651V3();
            }
        });
        this.isFirstUpdate = true;
        this.currentScrapTab = 1;
    }

    /* JADX INFO: renamed from: S3 */
    public static void m139648S3(j4e0 j4e0Var, ScrapDialogEventData scrapDialogEventData, Unit unit) {
        j4e0Var.m139677v4(scrapDialogEventData);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m139649T3(j4e0 j4e0Var, Throwable th) {
        th.getClass();
        j4e0Var.m139663h4(th);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m139650U3(j4e0 j4e0Var, BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        j4e0Var.m139664i4();
    }

    /* JADX INFO: renamed from: V3 */
    public static mvj m139651V3() {
        return new mvj();
    }

    /* JADX INFO: renamed from: W3 */
    public static Unit m139652W3(j4e0 j4e0Var, boolean z, int i) {
        if (z) {
            j4e0Var.giftSelectedItemPosition = i;
            j4e0Var.m139679x4(1);
        } else {
            j4e0Var.rightSelectedItemPosition = i;
            j4e0Var.m139679x4(2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static void m139653X3(j4e0 j4e0Var, Throwable th) {
        j4e0Var.m139678w4();
    }

    /* JADX INFO: renamed from: Y3 */
    public static void m139654Y3(j4e0 j4e0Var, ScrapDialogEventData scrapDialogEventData) {
        scrapDialogEventData.getClass();
        j4e0Var.m139672q4(scrapDialogEventData);
    }

    /* JADX INFO: renamed from: Z3 */
    private final void m139655Z3() {
        this.isFirstUpdate = true;
        this.currentScrapTab = 1;
        this.giftSelectedItemPosition = 0;
        this.rightSelectedItemPosition = 0;
        this.giftScrapItemModelList = null;
        this.rightScrapItemModelList = null;
    }

    /* JADX INFO: renamed from: a4 */
    public final void m139656a4() {
        m139655Z3();
        m139660e4().m156518c();
    }

    /* JADX INFO: renamed from: b4 */
    public final String m139657b4() {
        BLiveScrapBubble bLiveScrapBubble;
        BLiveScrapBubble bLiveScrapBubble2;
        boolean zM139676u4 = m139676u4();
        if (zM139676u4) {
            BLiveScrapTabData bLiveScrapTabDataM156522g = m139660e4().getRightScrapTabData();
            if (bLiveScrapTabDataM156522g == null || (bLiveScrapBubble2 = bLiveScrapTabDataM156522g.bubble) == null) {
                return "";
            }
            String str = bLiveScrapBubble2.scheme;
            str.getClass();
            return str;
        }
        if (zM139676u4) {
            l9r.m149037a();
            return null;
        }
        BLiveScrapTabData bLiveScrapTabDataM156521f = m139660e4().getGiftScrapTabData();
        if (bLiveScrapTabDataM156521f == null || (bLiveScrapBubble = bLiveScrapTabDataM156521f.bubble) == null) {
            return "";
        }
        String str2 = bLiveScrapBubble.scheme;
        str2.getClass();
        return str2;
    }

    @NotNull
    /* JADX INFO: renamed from: c4 */
    public final String m139658c4() {
        BLiveScrapBubble bLiveScrapBubble;
        BLiveScrapBubble bLiveScrapBubble2;
        boolean zM139676u4 = m139676u4();
        if (zM139676u4) {
            BLiveScrapTabData bLiveScrapTabDataM156522g = m139660e4().getRightScrapTabData();
            if (bLiveScrapTabDataM156522g == null || (bLiveScrapBubble2 = bLiveScrapTabDataM156522g.bubble) == null) {
                return "";
            }
            String str = bLiveScrapBubble2.title;
            str.getClass();
            return str;
        }
        if (zM139676u4) {
            l9r.m149037a();
            return null;
        }
        BLiveScrapTabData bLiveScrapTabDataM156521f = m139660e4().getGiftScrapTabData();
        if (bLiveScrapTabDataM156521f == null || (bLiveScrapBubble = bLiveScrapTabDataM156521f.bubble) == null) {
            return "";
        }
        String str2 = bLiveScrapBubble.title;
        str2.getClass();
        return str2;
    }

    @NotNull
    /* JADX INFO: renamed from: d4 */
    public final List<o4e0> m139659d4() {
        if (this.isFirstUpdate) {
            this.isFirstUpdate = false;
            m139673r4();
        }
        if (m139676u4()) {
            List<? extends o4e0> list = this.rightScrapItemModelList;
            if (list != null) {
                for (o4e0 o4e0Var : list) {
                    BLiveScrapBrief bLiveScrapBrief = o4e0Var.f141767b;
                    bLiveScrapBrief.isRightTabScrap = true;
                    bLiveScrapBrief.isSelected = false;
                    if (o4e0Var == list.get(this.rightSelectedItemPosition)) {
                        o4e0Var.f141767b.isSelected = true;
                    }
                }
            }
            List list2 = this.rightScrapItemModelList;
            list2.getClass();
            return list2;
        }
        List<? extends o4e0> list3 = this.giftScrapItemModelList;
        if (list3 != null) {
            for (o4e0 o4e0Var2 : list3) {
                BLiveScrapBrief bLiveScrapBrief2 = o4e0Var2.f141767b;
                bLiveScrapBrief2.isRightTabScrap = false;
                bLiveScrapBrief2.isSelected = false;
                if (o4e0Var2 == list3.get(this.giftSelectedItemPosition)) {
                    o4e0Var2.f141767b.isSelected = true;
                }
            }
        }
        List list4 = this.giftScrapItemModelList;
        list4.getClass();
        return list4;
    }

    /* JADX INFO: renamed from: e4 */
    public final mvj m139660e4() {
        return (mvj) this.scrapUseCase.getValue();
    }

    /* JADX INFO: renamed from: f4 */
    public final o4e0 m139661f4() {
        boolean zM139676u4 = m139676u4();
        if (zM139676u4) {
            List<? extends o4e0> list = this.rightScrapItemModelList;
            if (list != null && this.rightSelectedItemPosition < list.size()) {
                return list.get(this.rightSelectedItemPosition);
            }
        } else {
            if (zM139676u4) {
                l9r.m149037a();
                return null;
            }
            List<? extends o4e0> list2 = this.giftScrapItemModelList;
            if (list2 != null && this.giftSelectedItemPosition < list2.size()) {
                return list2.get(this.giftSelectedItemPosition);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g4 */
    public final int m139662g4() {
        return m139676u4() ? this.rightSelectedItemPosition : this.giftSelectedItemPosition;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m139663h4(Throwable error) {
        if (error instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) error;
            if (coreService.code == 40099) {
                lsi0.m151595y(coreService.metaMessage);
            }
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final void m139664i4() {
        o4e0 o4e0VarM139661f4 = m139661f4();
        o4e0VarM139661f4.getClass();
        GiftTrayData giftTrayDataM74150k = GiftTrayData.m74150k(o4e0VarM139661f4.f141767b.itemId, "live");
        if (!TextUtils.isEmpty(giftTrayDataM74150k.f50119y)) {
            m206028F2().GiftTraysEvent.addGiftTrayDataToList().mo172463j(new C12832a.a(702).m74269f(giftTrayDataM74150k).m74268e());
        }
        a4e0 a4e0Var = (a4e0) this.viewModel;
        if (a4e0Var != null) {
            a4e0Var.m94877U0();
        }
        m206028F2().GiftDialogEventGroup.dismissGiftDialog().mo172463j(702);
    }

    /* JADX INFO: renamed from: j4 */
    public final void m139665j4() {
        if (m139657b4().length() == 0) {
            return;
        }
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(200).m206701e(m139657b4()).m206699c());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m139666k4(@NotNull Function0<Unit> noNeedHandle, @NotNull Function1<? super BLiveScrapBrief, Unit> refreshTabAction) {
        noNeedHandle.getClass();
        refreshTabAction.getClass();
        if (this.currentScrapTab == 1) {
            noNeedHandle.invoke();
            return;
        }
        m139679x4(1);
        o4e0 o4e0VarM139661f4 = m139661f4();
        refreshTabAction.invoke(o4e0VarM139661f4 != null ? o4e0VarM139661f4.f141767b : null);
    }

    /* JADX INFO: renamed from: l4 */
    public final void m139667l4(@NotNull Function0<Unit> noNeedHandle, @NotNull Function1<? super BLiveScrapBrief, Unit> refreshTabAction) {
        noNeedHandle.getClass();
        refreshTabAction.getClass();
        if (this.currentScrapTab == 2) {
            noNeedHandle.invoke();
            return;
        }
        m139679x4(2);
        o4e0 o4e0VarM139661f4 = m139661f4();
        refreshTabAction.invoke(o4e0VarM139661f4 != null ? o4e0VarM139661f4.f141767b : null);
    }

    /* JADX INFO: renamed from: m4 */
    public final void m139668m4(@NotNull String targetSchemeUrl) {
        targetSchemeUrl.getClass();
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(702).m206701e(targetSchemeUrl).m206699c());
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, l.ho2] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, l.ho2] */
    /* JADX INFO: renamed from: n4 */
    public final void m139669n4(@NotNull BLiveScrapBrief selectedScrapBrief) {
        selectedScrapBrief.getClass();
        if (m206027E2() == 0) {
            return;
        }
        mvj mvjVarM139660e4 = m139660e4();
        String str = m139676u4() ? "rightTab" : "scrapTab";
        String str2 = selectedScrapBrief.itemId;
        str2.getClass();
        String str3 = selectedScrapBrief.targetItem.itemId;
        str3.getClass();
        ?? M206027E2 = m206027E2();
        M206027E2.getClass();
        String strMo132054A0 = M206027E2.mo132054A0();
        strMo132054A0.getClass();
        ?? M206027E3 = m206027E2();
        M206027E3.getClass();
        String strM149818o = M206027E3.m149818o();
        strM149818o.getClass();
        ?? M206027E4 = m206027E2();
        M206027E4.getClass();
        String strM149814k = M206027E4.m149814k();
        strM149814k.getClass();
        ?? M206027E5 = m206027E2();
        M206027E5.getClass();
        String str4 = M206027E5.m132146l0().f56011id;
        str4.getClass();
        duringCreated(mvjVarM139660e4.m156519d(str, str2, str3, strMo132054A0, strM149818o, strM149814k, str4)).subscribe(ffw.m121194e(new e30() { // from class: l.h4e0
            @Override // p149l.e30
            public final void call(Object obj) {
                j4e0.m139650U3(this.f105832a, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.i4e0
            @Override // p149l.e30
            public final void call(Object obj) {
                j4e0.m139649T3(this.f111435a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o4 */
    public final void m139670o4(int targetWebDialogHeight) {
        m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(702).m142598B(ddv.f85666p).m142603t(80).m142602s(t100.m186890d(10.0f)).m142597A(xdl0.m208412y0(), targetWebDialogHeight).m142600q());
    }

    /* JADX INFO: renamed from: p4 */
    public final void m139671p4(o4e0 newSelectedItemModel, o4e0 oldSelectedItemModel) {
        if (oldSelectedItemModel == newSelectedItemModel) {
            return;
        }
        oldSelectedItemModel.f141767b.isSelected = false;
        newSelectedItemModel.f141767b.isSelected = true;
        a4e0 a4e0Var = (a4e0) this.viewModel;
        if (a4e0Var != null) {
            a4e0Var.m94883X0(oldSelectedItemModel);
            a4e0Var.m94883X0(newSelectedItemModel);
            BLiveScrapBrief bLiveScrapBrief = newSelectedItemModel.f141767b;
            bLiveScrapBrief.getClass();
            a4e0Var.m94881W0(bLiveScrapBrief);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.ho2] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, l.ho2] */
    /* JADX INFO: renamed from: q4 */
    public final void m139672q4(final ScrapDialogEventData scrapDialogEventData) {
        if (this.viewModel == 0) {
            Act act = this.f188512e.f77095a;
            act.getClass();
            mo51532C(new a4e0(act, this));
        }
        mvj mvjVarM139660e4 = m139660e4();
        ?? M206027E2 = m206027E2();
        M206027E2.getClass();
        String strMo132054A0 = M206027E2.mo132054A0();
        strMo132054A0.getClass();
        ?? M206027E3 = m206027E2();
        M206027E3.getClass();
        String strM149818o = M206027E3.m149818o();
        strM149818o.getClass();
        ?? M206027E4 = m206027E2();
        M206027E4.getClass();
        String strM149814k = M206027E4.m149814k();
        strM149814k.getClass();
        ?? M206027E5 = m206027E2();
        M206027E5.getClass();
        String str = M206027E5.m132146l0().f56011id;
        str.getClass();
        duringCreated(mvjVarM139660e4.m156523h(strMo132054A0, strM149818o, strM149814k, str)).subscribe(ffw.m121194e(new e30() { // from class: l.e4e0
            @Override // p149l.e30
            public final void call(Object obj) {
                j4e0.m139648S3(this.f89272a, scrapDialogEventData, (Unit) obj);
            }
        }, new e30() { // from class: l.f4e0
            @Override // p149l.e30
            public final void call(Object obj) {
                j4e0.m139653X3(this.f94808a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r4 */
    public final void m139673r4() {
        BLiveScrapTabData bLiveScrapTabDataM156522g = m139660e4().getRightScrapTabData();
        if (bLiveScrapTabDataM156522g != null) {
            this.rightScrapItemModelList = m3e0.m152840b(bLiveScrapTabDataM156522g.scrapBriefs);
        }
        List<? extends o4e0> list = this.rightScrapItemModelList;
        if (list != null) {
            for (o4e0 o4e0Var : list) {
                o4e0Var.m162562K(this);
                o4e0Var.f141767b.isRightTabScrap = m139676u4();
            }
        }
        BLiveScrapTabData bLiveScrapTabDataM156521f = m139660e4().getGiftScrapTabData();
        if (bLiveScrapTabDataM156521f != null) {
            this.giftScrapItemModelList = m3e0.m152840b(bLiveScrapTabDataM156521f.scrapBriefs);
        }
        List<? extends o4e0> list2 = this.giftScrapItemModelList;
        if (list2 != null) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                ((o4e0) it.next()).m162562K(this);
            }
        }
    }

    /* JADX INFO: renamed from: s4 */
    public final boolean m139674s4() {
        return m139660e4().getGiftScrapTabData() != null;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().ScrapInfoDialogEvent.show().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.c4e0
            @Override // p149l.e30
            public final void call(Object obj) {
                j4e0.m139654Y3(this.f79264a, (ScrapDialogEventData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final boolean m139675t4() {
        return m139660e4().getRightScrapTabData() != null;
    }

    /* JADX INFO: renamed from: u4 */
    public final boolean m139676u4() {
        return this.currentScrapTab == 2;
    }

    /* JADX INFO: renamed from: v4 */
    public final void m139677v4(ScrapDialogEventData scrapDialogEventData) {
        if (xi5.m208914a(m139660e4().getGiftScrapTabData()) && xi5.m208914a(m139660e4().getRightScrapTabData())) {
            m139678w4();
            return;
        }
        String str = scrapDialogEventData.targetScrapId;
        if (str == null || str.length() == 0) {
            this.giftSelectedItemPosition = 0;
            this.rightSelectedItemPosition = 0;
            a4e0 a4e0Var = (a4e0) this.viewModel;
            if (a4e0Var != null) {
                a4e0Var.m94871R0(m139660e4().m156520e());
                return;
            }
            return;
        }
        mvj mvjVarM139660e4 = m139660e4();
        String str2 = scrapDialogEventData.targetScrapId;
        str2.getClass();
        BLiveScrapBrief bLiveScrapBriefM156525j = mvjVarM139660e4.m156525j(str2, new Function2() { // from class: l.g4e0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return j4e0.m139652W3(this.f100562a, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue());
            }
        });
        a4e0 a4e0Var2 = (a4e0) this.viewModel;
        if (a4e0Var2 != null) {
            a4e0Var2.m94871R0(bLiveScrapBriefM156525j);
        }
    }

    /* JADX INFO: renamed from: w4 */
    public final void m139678w4() {
        a4e0 a4e0Var = (a4e0) this.viewModel;
        if (a4e0Var != null) {
            a4e0Var.m94873S0();
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final void m139679x4(int scrapTab) {
        this.currentScrapTab = scrapTab;
    }

    @Override // p149l.o4e0.InterfaceC18839a
    /* JADX INFO: renamed from: z */
    public void mo139680z(@NotNull o4e0 newSelectedItemModel) {
        newSelectedItemModel.getClass();
        if (m139676u4()) {
            List<? extends o4e0> list = this.rightScrapItemModelList;
            list.getClass();
            m139671p4(newSelectedItemModel, list.get(this.rightSelectedItemPosition));
            List<? extends o4e0> list2 = this.rightScrapItemModelList;
            list2.getClass();
            this.rightSelectedItemPosition = list2.indexOf(newSelectedItemModel);
            return;
        }
        List<? extends o4e0> list3 = this.giftScrapItemModelList;
        list3.getClass();
        m139671p4(newSelectedItemModel, list3.get(this.giftSelectedItemPosition));
        List<? extends o4e0> list4 = this.giftScrapItemModelList;
        list4.getClass();
        this.giftSelectedItemPosition = list4.indexOf(newSelectedItemModel);
    }
}
