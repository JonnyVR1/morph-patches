package p153l;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.TextCardData;
import com.p051p1.mobile.putong.core.data.TextQuickChatCardData;
import com.p051p1.mobile.putong.core.data.VideoChatSecondFloorSummary;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.newquickchat.secondfloor.QuickChatLoftAct;
import com.p051p1.mobile.putong.data.User;
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

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0010J\u0019\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00130\u001ej\b\u0012\u0004\u0012\u00020\u0013`\u001f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010\u0010J1\u0010#\u001a\u00020\t2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u001ej\b\u0012\u0004\u0012\u00020\u0013`\u001f2\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b#\u0010$J1\u0010&\u001a\u00020\t2\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u001ej\b\u0012\u0004\u0012\u00020\u0013`\u001f2\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b&\u0010$R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R$\u00101\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, m88121d2 = {"Ll/a4c0;", "Ll/ar2;", "Ll/s4c0;", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/QuickChatLoftAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/QuickChatLoftAct;)V", "Lcom/p1/mobile/putong/core/data/VideoChatSecondFloorSummary;", "videoChatSecondFloorSummary", "", "z0", "(Lcom/p1/mobile/putong/core/data/VideoChatSecondFloorSummary;)V", "viewModel", "m0", "(Ll/s4c0;)V", "a0", "()V", "Z", "destroy", "Ll/i1c0;", "data", "y0", "(Ll/i1c0;)V", "n0", "", "isRefresh", "t0", "(Z)V", "Lcom/p1/mobile/putong/core/data/TextQuickChatCardData;", "originData", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "s0", "(Lcom/p1/mobile/putong/core/data/TextQuickChatCardData;)Ljava/util/ArrayList;", "x0", "A0", "(Ljava/util/ArrayList;Z)V", "cards", "o0", "a", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/QuickChatLoftAct;", "b", "Ll/s4c0;", "quickChatLoftViewModel", "", "", "Lcom/p1/mobile/putong/data/User;", "c", "Ljava/util/Map;", "userMap", "Ll/j6c0;", Constants.INAPP_DATA_TAG, "Ll/j6c0;", "quickTaskProcessor", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class a4c0 extends ar2<s4c0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final QuickChatLoftAct act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public s4c0 quickChatLoftViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Map<String, ? extends User> userMap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public j6c0 quickTaskProcessor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4c0(@NotNull QuickChatLoftAct quickChatLoftAct) {
        super(quickChatLoftAct);
        quickChatLoftAct.getClass();
        this.act = quickChatLoftAct;
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ void m95886C0(a4c0 a4c0Var, ArrayList arrayList, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        a4c0Var.m95900A0(arrayList, z);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m95889g0(a4c0 a4c0Var, VideoChatSecondFloorSummary videoChatSecondFloorSummary) {
        if (TextUtils.isEmpty(videoChatSecondFloorSummary.subtitle)) {
            videoChatSecondFloorSummary = null;
        }
        a4c0Var.m95899z0(videoChatSecondFloorSummary);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m95890h0(a4c0 a4c0Var, boolean z, TextQuickChatCardData textQuickChatCardData) {
        a4c0Var.m95900A0(a4c0Var.m95904s0(textQuickChatCardData), z);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m95892j0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static void m95893k0(a4c0 a4c0Var, Bundle bundle) {
        if (a6c0.m96322b()) {
            r3c0.m179591m(a4c0Var.act, "text_quick_chat");
            return;
        }
        if (a6c0.m96323c()) {
            r3c0.m179591m(a4c0Var.act, "voice_quick_chat");
            return;
        }
        String stringExtra = a4c0Var.act.getIntent().getStringExtra("start_type");
        if (stringExtra != null) {
            int iHashCode = stringExtra.hashCode();
            if (iHashCode == -1026894660) {
                if (stringExtra.equals("text_quick_chat")) {
                    if (a6c0.m96323c()) {
                        r1j0.m179420g("正在语音闪聊匹配中");
                        return;
                    } else {
                        ((s4c0) a4c0Var.viewModel).m184523x0("p_quickchat,quickchat_button");
                        return;
                    }
                }
                return;
            }
            if (iHashCode == 2114778007 && stringExtra.equals("voice_quick_chat")) {
                if (a6c0.m96322b()) {
                    r1j0.m179420g("正在在线闪聊匹配中");
                } else {
                    ((s4c0) a4c0Var.viewModel).m184526z();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static void m95894l0(a4c0 a4c0Var, Throwable th) {
        m95886C0(a4c0Var, a4c0Var.m95904s0(null), false, 2, null);
    }

    /* JADX INFO: renamed from: p0 */
    public static final Unit m95895p0(a4c0 a4c0Var, i1c0 i1c0Var) {
        i1c0Var.getClass();
        ((s4c0) a4c0Var.viewModel).m184514o0(i1c0Var);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q0 */
    public static final void m95896q0(a4c0 a4c0Var, Boolean bool) {
        bool.getClass();
        a4c0Var.m95905t0(bool.booleanValue());
    }

    /* JADX INFO: renamed from: r0 */
    public static final void m95897r0(a4c0 a4c0Var) {
        ((s4c0) a4c0Var.viewModel).m184518u0();
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m95898u0(a4c0 a4c0Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        a4c0Var.m95905t0(z);
    }

    /* JADX INFO: renamed from: z0 */
    private final void m95899z0(VideoChatSecondFloorSummary videoChatSecondFloorSummary) {
        if (videoChatSecondFloorSummary != null) {
            ((s4c0) this.viewModel).m184515r0(videoChatSecondFloorSummary);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m95900A0(ArrayList<i1c0> data, boolean isRefresh) {
        if (data.isEmpty()) {
            ((s4c0) this.viewModel).m184518u0();
        } else {
            m95903o0(data, isRefresh);
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        CoreModule.f18264c.f20297C0.m146425v4();
        CoreModule.f18264c.f20312H0.m155449k5();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        m95898u0(this, false, 1, null);
        m95906x0();
        m95902n0();
    }

    @Override // p153l.k3m
    public void destroy() {
        j6c0 j6c0Var = this.quickTaskProcessor;
        if (j6c0Var != null) {
            j6c0Var.m143648k();
        }
        this.userMap = null;
    }

    @Override // p153l.ar2, p153l.k3m
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void mo52715C(@NotNull s4c0 viewModel) {
        viewModel.getClass();
        super.mo52715C(viewModel);
        this.quickChatLoftViewModel = viewModel;
        OnlineMatchManager.m51326z().m51361j0();
    }

    /* JADX INFO: renamed from: n0 */
    public final void m95902n0() {
        creates(new y20() { // from class: l.s3c0
            @Override // p153l.y20
            public final void call(Object obj) {
                a4c0.m95893k0(this.f165992a, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public final void m95903o0(ArrayList<i1c0> cards, boolean isRefresh) {
        j6c0 j6c0Var = this.quickTaskProcessor;
        if (j6c0Var == null) {
            j6c0 j6c0Var2 = new j6c0(cards, new Function1() { // from class: l.x3c0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return a4c0.m95895p0(this.f192244a, (i1c0) obj);
                }
            }, r3c0.m179590l(), new y20() { // from class: l.y3c0
                @Override // p153l.y20
                public final void call(Object obj) {
                    a4c0.m95896q0(this.f197341a, (Boolean) obj);
                }
            }, new x20() { // from class: l.z3c0
                @Override // p153l.x20
                public final void call() {
                    a4c0.m95897r0(this.f202818a);
                }
            });
            this.quickTaskProcessor = j6c0Var2;
            j6c0Var2.m143650m();
            String strPageId = this.act.pageId();
            j6c0 j6c0Var3 = this.quickTaskProcessor;
            i4g0.m138492A("e_quickchat_broadcast", strPageId, jyb.m147494Y("recommend_num", j6c0Var3 != null ? Integer.valueOf(j6c0Var3.m143649l()) : null));
            return;
        }
        if (isRefresh) {
            j6c0Var.m143651n(cards);
        } else {
            j6c0Var.m143647j(cards);
        }
        if (NullChecker.m82486a(Act.foreground_())) {
            Activity activity = Act.foreground_().f16062a.get();
            if (NullChecker.m82486a(activity) && (activity instanceof QuickChatLoftAct) && ((QuickChatLoftAct) activity).lifecycle_() == C4470c.f16267i) {
                i4g0.m138492A("e_quickchat_broadcast", this.act.pageId(), jyb.m147494Y("recommend_num", Integer.valueOf(cards.size())));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, java.util.Collection] */
    /* JADX INFO: renamed from: s0 */
    public final ArrayList<i1c0> m95904s0(TextQuickChatCardData originData) {
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
                        if (TextUtils.equals(textCardData.userID, ((User) it.next()).f56859id)) {
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
                } while (!TextUtils.equals(textCardData2.userID, ((User) next).f56859id));
                User user = (User) next;
                user.getClass();
                textCardData2.getClass();
                arrayList2.add(new i1c0(user, textCardData2));
            }
            objectRef.element = CollectionsKt.toCollection(arrayList2, new ArrayList());
        }
        ArrayList<i1c0> arrayList3 = (ArrayList) objectRef.element;
        return arrayList3 == null ? new ArrayList<>() : arrayList3;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m95905t0(final boolean isRefresh) {
        duringCreated(CoreModule.f18264c.f20398j2.m119265i3()).subscribe(psd0.m173597H(new y20() { // from class: l.t3c0
            @Override // p153l.y20
            public final void call(Object obj) {
                a4c0.m95890h0(this.f171914a, isRefresh, (TextQuickChatCardData) obj);
            }
        }, new y20() { // from class: l.u3c0
            @Override // p153l.y20
            public final void call(Object obj) {
                a4c0.m95894l0(this.f177333a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public final void m95906x0() {
        if (r3c0.m179594q()) {
            CoreModule.f18264c.f20398j2.m119266j3();
            duringCreated(CoreModule.f18264c.f20398j2.f91949R.asObservable().distinctUntilChanged()).subscribe(psd0.m173597H(new y20() { // from class: l.v3c0
                @Override // p153l.y20
                public final void call(Object obj) {
                    a4c0.m95889g0(this.f182178a, (VideoChatSecondFloorSummary) obj);
                }
            }, new y20() { // from class: l.w3c0
                @Override // p153l.y20
                public final void call(Object obj) {
                    a4c0.m95892j0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m95907y0(@NotNull i1c0 data) {
        data.getClass();
        j6c0 j6c0Var = this.quickTaskProcessor;
        if (j6c0Var != null) {
            j6c0Var.m143652o(data);
        }
    }
}
