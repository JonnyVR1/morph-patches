package p149l;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.TextCardData;
import com.p046p1.mobile.putong.core.data.TextQuickChatCardData;
import com.p046p1.mobile.putong.core.data.VideoChatSecondFloorSummary;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.newquickchat.secondfloor.QuickChatLoftAct;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0010J\u0019\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00130\u001ej\b\u0012\u0004\u0012\u00020\u0013`\u001f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010\u0010J1\u0010#\u001a\u00020\t2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u001ej\b\u0012\u0004\u0012\u00020\u0013`\u001f2\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b#\u0010$J1\u0010&\u001a\u00020\t2\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u001ej\b\u0012\u0004\u0012\u00020\u0013`\u001f2\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b&\u0010$R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R$\u00101\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, m87232d2 = {"Ll/wvb0;", "Ll/jq2;", "Ll/owb0;", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/QuickChatLoftAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/QuickChatLoftAct;)V", "Lcom/p1/mobile/putong/core/data/VideoChatSecondFloorSummary;", "videoChatSecondFloorSummary", "", "z0", "(Lcom/p1/mobile/putong/core/data/VideoChatSecondFloorSummary;)V", "viewModel", "m0", "(Ll/owb0;)V", "a0", "()V", "Z", "destroy", "Ll/etb0;", "data", "y0", "(Ll/etb0;)V", "n0", "", "isRefresh", "t0", "(Z)V", "Lcom/p1/mobile/putong/core/data/TextQuickChatCardData;", "originData", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "s0", "(Lcom/p1/mobile/putong/core/data/TextQuickChatCardData;)Ljava/util/ArrayList;", "x0", "A0", "(Ljava/util/ArrayList;Z)V", "cards", "o0", "a", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/QuickChatLoftAct;", "b", "Ll/owb0;", "quickChatLoftViewModel", "", "", "Lcom/p1/mobile/putong/data/User;", "c", "Ljava/util/Map;", "userMap", "Ll/fyb0;", Constants.INAPP_DATA_TAG, "Ll/fyb0;", "quickTaskProcessor", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class wvb0 extends jq2<owb0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final QuickChatLoftAct act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public owb0 quickChatLoftViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Map<String, ? extends User> userMap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public fyb0 quickTaskProcessor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wvb0(@NotNull QuickChatLoftAct quickChatLoftAct) {
        super(quickChatLoftAct);
        quickChatLoftAct.getClass();
        this.act = quickChatLoftAct;
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ void m205720C0(wvb0 wvb0Var, ArrayList arrayList, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        wvb0Var.m205734A0(arrayList, z);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m205723g0(wvb0 wvb0Var, VideoChatSecondFloorSummary videoChatSecondFloorSummary) {
        if (TextUtils.isEmpty(videoChatSecondFloorSummary.subtitle)) {
            videoChatSecondFloorSummary = null;
        }
        wvb0Var.m205733z0(videoChatSecondFloorSummary);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m205724h0(wvb0 wvb0Var, boolean z, TextQuickChatCardData textQuickChatCardData) {
        wvb0Var.m205734A0(wvb0Var.m205738s0(textQuickChatCardData), z);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m205726j0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static void m205727k0(wvb0 wvb0Var, Bundle bundle) {
        if (wxb0.m205980b()) {
            nvb0.m161582m(wvb0Var.act, "text_quick_chat");
            return;
        }
        if (wxb0.m205981c()) {
            nvb0.m161582m(wvb0Var.act, "voice_quick_chat");
            return;
        }
        String stringExtra = wvb0Var.act.getIntent().getStringExtra("start_type");
        if (stringExtra != null) {
            int iHashCode = stringExtra.hashCode();
            if (iHashCode == -1026894660) {
                if (stringExtra.equals("text_quick_chat")) {
                    if (wxb0.m205981c()) {
                        osi0.m165783g("正在语音闪聊匹配中");
                        return;
                    } else {
                        ((owb0) wvb0Var.viewModel).m166383x0("p_quickchat,quickchat_button");
                        return;
                    }
                }
                return;
            }
            if (iHashCode == 2114778007 && stringExtra.equals("voice_quick_chat")) {
                if (wxb0.m205980b()) {
                    osi0.m165783g("正在在线闪聊匹配中");
                } else {
                    ((owb0) wvb0Var.viewModel).m166386z();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static void m205728l0(wvb0 wvb0Var, Throwable th) {
        m205720C0(wvb0Var, wvb0Var.m205738s0(null), false, 2, null);
    }

    /* JADX INFO: renamed from: p0 */
    public static final Unit m205729p0(wvb0 wvb0Var, etb0 etb0Var) {
        etb0Var.getClass();
        ((owb0) wvb0Var.viewModel).m166374o0(etb0Var);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q0 */
    public static final void m205730q0(wvb0 wvb0Var, Boolean bool) {
        bool.getClass();
        wvb0Var.m205739t0(bool.booleanValue());
    }

    /* JADX INFO: renamed from: r0 */
    public static final void m205731r0(wvb0 wvb0Var) {
        ((owb0) wvb0Var.viewModel).m166378u0();
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m205732u0(wvb0 wvb0Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        wvb0Var.m205739t0(z);
    }

    /* JADX INFO: renamed from: z0 */
    private final void m205733z0(VideoChatSecondFloorSummary videoChatSecondFloorSummary) {
        if (videoChatSecondFloorSummary != null) {
            ((owb0) this.viewModel).m166375r0(videoChatSecondFloorSummary);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m205734A0(ArrayList<etb0> data, boolean isRefresh) {
        if (data.isEmpty()) {
            ((owb0) this.viewModel).m166378u0();
        } else {
            m205737o0(data, isRefresh);
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        CoreModule.f17545c.f19555C0.m210112u4();
        CoreModule.f17545c.f19570H0.m210361k5();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        m205732u0(this, false, 1, null);
        m205740x0();
        m205736n0();
    }

    @Override // p149l.q0m
    public void destroy() {
        fyb0 fyb0Var = this.quickTaskProcessor;
        if (fyb0Var != null) {
            fyb0Var.m123748k();
        }
        this.userMap = null;
    }

    @Override // p149l.jq2, p149l.q0m
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void mo51532C(@NotNull owb0 viewModel) {
        viewModel.getClass();
        super.mo51532C(viewModel);
        this.quickChatLoftViewModel = viewModel;
        OnlineMatchManager.m50143z().m50178j0();
    }

    /* JADX INFO: renamed from: n0 */
    public final void m205736n0() {
        creates(new e30() { // from class: l.ovb0
            @Override // p149l.e30
            public final void call(Object obj) {
                wvb0.m205727k0(this.f145795a, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public final void m205737o0(ArrayList<etb0> cards, boolean isRefresh) {
        fyb0 fyb0Var = this.quickTaskProcessor;
        if (fyb0Var == null) {
            fyb0 fyb0Var2 = new fyb0(cards, new Function1() { // from class: l.tvb0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return wvb0.m205729p0(this.f172276a, (etb0) obj);
                }
            }, nvb0.m161581l(), new e30() { // from class: l.uvb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    wvb0.m205730q0(this.f178522a, (Boolean) obj);
                }
            }, new d30() { // from class: l.vvb0
                @Override // p149l.d30
                public final void call() {
                    wvb0.m205731r0(this.f183206a);
                }
            });
            this.quickTaskProcessor = fyb0Var2;
            fyb0Var2.m123750m();
            String strPageId = this.act.pageId();
            fyb0 fyb0Var3 = this.quickTaskProcessor;
            zvf0.m220368A("e_quickchat_broadcast", strPageId, vwb.m200311Y("recommend_num", fyb0Var3 != null ? Integer.valueOf(fyb0Var3.m123749l()) : null));
            return;
        }
        if (isRefresh) {
            fyb0Var.m123751n(cards);
        } else {
            fyb0Var.m123747j(cards);
        }
        if (NullChecker.m81303a(Act.foreground_())) {
            Activity activity = Act.foreground_().f15343a.get();
            if (NullChecker.m81303a(activity) && (activity instanceof QuickChatLoftAct) && ((QuickChatLoftAct) activity).lifecycle_() == C4319c.f15548i) {
                zvf0.m220368A("e_quickchat_broadcast", this.act.pageId(), vwb.m200311Y("recommend_num", Integer.valueOf(cards.size())));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, java.util.Collection] */
    /* JADX INFO: renamed from: s0 */
    public final ArrayList<etb0> m205738s0(TextQuickChatCardData originData) {
        Object next;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new ArrayList();
        if (originData != null) {
            List<TextCardData> list = originData.cards;
            list.getClass();
            ArrayList<TextCardData> arrayList = new ArrayList();
            for (Object obj : list) {
                TextCardData textCardData = (TextCardData) obj;
                List<User> list2 = originData.users;
                list2.getClass();
                List<User> list3 = list2;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        if (TextUtils.equals(textCardData.userID, ((User) it.next()).f56011id)) {
                            arrayList.add(obj);
                            break;
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (TextCardData textCardData2 : arrayList) {
                List<User> list4 = originData.users;
                list4.getClass();
                Iterator<T> it2 = list4.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!TextUtils.equals(textCardData2.userID, ((User) next).f56011id));
                User user = (User) next;
                user.getClass();
                textCardData2.getClass();
                arrayList2.add(new etb0(user, textCardData2));
            }
            objectRef.element = CollectionsKt.toCollection(arrayList2, new ArrayList());
        }
        ArrayList<etb0> arrayList3 = (ArrayList) objectRef.element;
        return arrayList3 == null ? new ArrayList<>() : arrayList3;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m205739t0(final boolean isRefresh) {
        duringCreated(CoreModule.f17545c.f19656j2.m99159i3()).subscribe(mkd0.m154956H(new e30() { // from class: l.pvb0
            @Override // p149l.e30
            public final void call(Object obj) {
                wvb0.m205724h0(this.f151439a, isRefresh, (TextQuickChatCardData) obj);
            }
        }, new e30() { // from class: l.qvb0
            @Override // p149l.e30
            public final void call(Object obj) {
                wvb0.m205728l0(this.f156598a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public final void m205740x0() {
        if (nvb0.m161585q()) {
            CoreModule.f17545c.f19656j2.m99160j3();
            duringCreated(CoreModule.f17545c.f19656j2.f71926R.asObservable().distinctUntilChanged()).subscribe(mkd0.m154956H(new e30() { // from class: l.rvb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    wvb0.m205723g0(this.f161192a, (VideoChatSecondFloorSummary) obj);
                }
            }, new e30() { // from class: l.svb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    wvb0.m205726j0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m205741y0(@NotNull etb0 data) {
        data.getClass();
        fyb0 fyb0Var = this.quickTaskProcessor;
        if (fyb0Var != null) {
            fyb0Var.m123752o(data);
        }
    }
}
