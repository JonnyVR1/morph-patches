package p153l;

import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTab;
import com.p051p1.mobile.putong.live.external.intl.voicesquare.base.LiveBaseQuickChatPageView;
import com.p051p1.mobile.putong.live.external.intl.voicesquare.common.VoiceRoomSquareCommonViewModel;
import com.p051p1.mobile.putong.live.external.square.api.ModelData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B/\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u0010J\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010'J\u001b\u0010)\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030(0\u0001H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010,J\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006@"}, m88121d2 = {"Ll/hro0;", "Ll/eyr;", "Lcom/p1/mobile/putong/live/external/intl/voicesquare/common/VoiceRoomSquareCommonViewModel;", "Ll/c8o;", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;", "Ll/ner;", "lifecycleProvider", "voiceTab", "", "isWhiteTeme", "Ll/y20;", "action", "<init>", "(Ll/ner;Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;ZLl/y20;)V", "", "a0", "()V", "", "position", "", "Lcom/p1/mobile/putong/live/external/intl/voicesquare/base/LiveBaseQuickChatPageView;", "contentViewList", "isSwipeRefresh", "g0", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;ILjava/util/List;Z)V", "q0", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;Ljava/util/List;)V", "j0", "(ILjava/util/List;)V", "k0", "enable", "n0", "(Z)V", "f0", "()Z", "Landroid/view/View;", "A", "()Landroid/view/View;", "p0", "()Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;", "Ll/iam;", "m", "()Ll/eyr;", "I", "()Ljava/lang/Boolean;", "Ll/hk4;", "o0", "()Ll/hk4;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;", "getVoiceTab", "e", "Z", "f", "Ll/y20;", "getAction", "()Ll/y20;", "g", "Ll/hk4;", "cardContext", "Ll/vuo0;", "h", "Ll/vuo0;", "netPlug", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class hro0 extends eyr<VoiceRoomSquareCommonViewModel> implements c8o<BLiveVoiceTab> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final BLiveVoiceTab voiceTab;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean isWhiteTeme;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final y20<Boolean> action;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final hk4 cardContext;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final vuo0 netPlug;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hro0(@Nullable ner nerVar, @NotNull BLiveVoiceTab bLiveVoiceTab, boolean z, @NotNull y20<Boolean> y20Var) {
        super(nerVar);
        bLiveVoiceTab.getClass();
        y20Var.getClass();
        this.voiceTab = bLiveVoiceTab;
        this.isWhiteTeme = z;
        this.action = y20Var;
        hk4 hk4Var = new hk4(this);
        hk4Var.pageStyle = z ? 1 : 0;
        this.cardContext = hk4Var;
        this.netPlug = new vuo0(bLiveVoiceTab, this);
    }

    /* JADX INFO: renamed from: l0 */
    public static Unit m136906l0(hro0 hro0Var, ModelData modelData) {
        modelData.getClass();
        modelData.isLoading();
        modelData.isComplete();
        if (modelData.isError()) {
            hro0Var.f96493a.call();
            o1j0.m165651y(tbs.f172988a.getString(R$string.f44998a0));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m0 */
    public static Unit m136907m0(hro0 hro0Var, ModelData modelData) {
        modelData.getClass();
        if (modelData.isSuccess()) {
            hro0Var.f96494b.call();
            ((VoiceRoomSquareCommonViewModel) hro0Var.viewModel).m71602s(hro0Var.netPlug.m202856J());
        }
        return Unit.INSTANCE;
    }

    @Override // p153l.c8o
    @NotNull
    /* JADX INFO: renamed from: A */
    public View mo108373A() {
        View rootView = ((VoiceRoomSquareCommonViewModel) this.viewModel).getRootView();
        rootView.getClass();
        return rootView;
    }

    @Override // p153l.c8o
    @NotNull
    /* JADX INFO: renamed from: I */
    public Boolean mo108375I() {
        return Boolean.valueOf(((VoiceRoomSquareCommonViewModel) this.viewModel).m71599p());
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        this.netPlug.m202865d0(this.isWhiteTeme);
        this.netPlug.observe(new Function1() { // from class: l.fro0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return hro0.m136906l0(this.f100442a, (ModelData) obj);
            }
        });
        this.netPlug.observe(new Function1() { // from class: l.gro0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return hro0.m136907m0(this.f106097a, (ModelData) obj);
            }
        });
    }

    @Override // p153l.eyr
    /* JADX INFO: renamed from: f0 */
    public boolean mo123230f0() {
        return ((VoiceRoomSquareCommonViewModel) this.viewModel).m71600q();
    }

    @Override // p153l.eyr
    /* JADX INFO: renamed from: g0 */
    public void mo123231g0(@NotNull BLiveVoiceTab voiceTab, int position, @NotNull List<LiveBaseQuickChatPageView> contentViewList, boolean isSwipeRefresh) {
        voiceTab.getClass();
        contentViewList.getClass();
        super.mo123231g0(voiceTab, position, contentViewList, isSwipeRefresh);
        this.netPlug.m202858L();
        m123229e0(voiceTab.f45361id);
    }

    @Override // p153l.eyr
    /* JADX INFO: renamed from: j0 */
    public void mo123234j0(int position, @NotNull List<LiveBaseQuickChatPageView> contentViewList) {
        contentViewList.getClass();
        this.netPlug.m202862X();
    }

    @Override // p153l.eyr
    /* JADX INFO: renamed from: k0 */
    public void mo123235k0() {
        ((VoiceRoomSquareCommonViewModel) this.viewModel).m71603u();
    }

    /* JADX INFO: renamed from: n0 */
    public final void m136908n0(boolean enable) {
        this.action.call(Boolean.valueOf(enable));
    }

    @NotNull
    /* JADX INFO: renamed from: o0, reason: from getter */
    public final hk4 getCardContext() {
        return this.cardContext;
    }

    @Override // p153l.c8o
    @NotNull
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceTab mo108374H() {
        BLiveVoiceTab voiceTab = ((VoiceRoomSquareCommonViewModel) this.viewModel).getVoiceTab();
        voiceTab.getClass();
        return voiceTab;
    }

    /* JADX INFO: renamed from: q0 */
    public void m136911q0(@NotNull BLiveVoiceTab voiceTab, @NotNull List<LiveBaseQuickChatPageView> contentViewList) {
        voiceTab.getClass();
        contentViewList.getClass();
        this.netPlug.m202861Q();
    }

    @Override // p153l.c8o
    @NotNull
    /* JADX INFO: renamed from: m */
    public eyr<? extends iam<?>> mo108376m() {
        return this;
    }
}
