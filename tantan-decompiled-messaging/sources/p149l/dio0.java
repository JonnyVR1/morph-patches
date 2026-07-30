package p149l;

import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTab;
import com.p046p1.mobile.putong.live.external.intl.voicesquare.base.LiveBaseQuickChatPageView;
import com.p046p1.mobile.putong.live.external.intl.voicesquare.common.VoiceRoomSquareCommonViewModel;
import com.p046p1.mobile.putong.live.external.square.api.ModelData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B/\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u0010J\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010'J\u001b\u0010)\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030(0\u0001H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010,J\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006@"}, m87232d2 = {"Ll/dio0;", "Ll/dwr;", "Lcom/p1/mobile/putong/live/external/intl/voicesquare/common/VoiceRoomSquareCommonViewModel;", "Ll/c6o;", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;", "Ll/mcr;", "lifecycleProvider", "voiceTab", "", "isWhiteTeme", "Ll/e30;", "action", "<init>", "(Ll/mcr;Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;ZLl/e30;)V", "", "a0", "()V", "", "position", "", "Lcom/p1/mobile/putong/live/external/intl/voicesquare/base/LiveBaseQuickChatPageView;", "contentViewList", "isSwipeRefresh", "g0", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;ILjava/util/List;Z)V", "q0", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;Ljava/util/List;)V", "j0", "(ILjava/util/List;)V", "k0", "enable", "n0", "(Z)V", "f0", "()Z", "Landroid/view/View;", "A", "()Landroid/view/View;", "p0", "()Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;", "Ll/s7m;", "m", "()Ll/dwr;", "I", "()Ljava/lang/Boolean;", "Ll/ij4;", "o0", "()Ll/ij4;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;", "getVoiceTab", "e", "Z", "f", "Ll/e30;", "getAction", "()Ll/e30;", "g", "Ll/ij4;", "cardContext", "Ll/rlo0;", "h", "Ll/rlo0;", "netPlug", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class dio0 extends dwr<VoiceRoomSquareCommonViewModel> implements c6o<BLiveVoiceTab> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final BLiveVoiceTab voiceTab;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean isWhiteTeme;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final e30<Boolean> action;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final ij4 cardContext;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final rlo0 netPlug;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dio0(@Nullable mcr mcrVar, @NotNull BLiveVoiceTab bLiveVoiceTab, boolean z, @NotNull e30<Boolean> e30Var) {
        super(mcrVar);
        bLiveVoiceTab.getClass();
        e30Var.getClass();
        this.voiceTab = bLiveVoiceTab;
        this.isWhiteTeme = z;
        this.action = e30Var;
        ij4 ij4Var = new ij4(this);
        ij4Var.pageStyle = z ? 1 : 0;
        this.cardContext = ij4Var;
        this.netPlug = new rlo0(bLiveVoiceTab, this);
    }

    /* JADX INFO: renamed from: l0 */
    public static Unit m111897l0(dio0 dio0Var, ModelData modelData) {
        modelData.getClass();
        modelData.isLoading();
        modelData.isComplete();
        if (modelData.isError()) {
            dio0Var.f88204a.call();
            lsi0.m151595y(s9s.f163227a.getString(R$string.f44150a0));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m0 */
    public static Unit m111898m0(dio0 dio0Var, ModelData modelData) {
        modelData.getClass();
        if (modelData.isSuccess()) {
            dio0Var.f88205b.call();
            ((VoiceRoomSquareCommonViewModel) dio0Var.viewModel).m70419s(dio0Var.netPlug.m179857J());
        }
        return Unit.INSTANCE;
    }

    @Override // p149l.c6o
    @NotNull
    /* JADX INFO: renamed from: A */
    public View mo105486A() {
        View rootView = ((VoiceRoomSquareCommonViewModel) this.viewModel).getRootView();
        rootView.getClass();
        return rootView;
    }

    @Override // p149l.c6o
    @NotNull
    /* JADX INFO: renamed from: I */
    public Boolean mo105488I() {
        return Boolean.valueOf(((VoiceRoomSquareCommonViewModel) this.viewModel).m70416p());
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        this.netPlug.m179866d0(this.isWhiteTeme);
        this.netPlug.observe(new Function1() { // from class: l.bio0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dio0.m111897l0(this.f75783a, (ModelData) obj);
            }
        });
        this.netPlug.observe(new Function1() { // from class: l.cio0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dio0.m111898m0(this.f81104a, (ModelData) obj);
            }
        });
    }

    @Override // p149l.dwr
    /* JADX INFO: renamed from: f0 */
    public boolean mo111899f0() {
        return ((VoiceRoomSquareCommonViewModel) this.viewModel).m70417q();
    }

    @Override // p149l.dwr
    /* JADX INFO: renamed from: g0 */
    public void mo111900g0(@NotNull BLiveVoiceTab voiceTab, int position, @NotNull List<LiveBaseQuickChatPageView> contentViewList, boolean isSwipeRefresh) {
        voiceTab.getClass();
        contentViewList.getClass();
        super.mo111900g0(voiceTab, position, contentViewList, isSwipeRefresh);
        this.netPlug.m179859L();
        m113939e0(voiceTab.f44513id);
    }

    @Override // p149l.dwr
    /* JADX INFO: renamed from: j0 */
    public void mo111901j0(int position, @NotNull List<LiveBaseQuickChatPageView> contentViewList) {
        contentViewList.getClass();
        this.netPlug.m179863X();
    }

    @Override // p149l.dwr
    /* JADX INFO: renamed from: k0 */
    public void mo111902k0() {
        ((VoiceRoomSquareCommonViewModel) this.viewModel).m70420u();
    }

    /* JADX INFO: renamed from: n0 */
    public final void m111903n0(boolean enable) {
        this.action.call(Boolean.valueOf(enable));
    }

    @NotNull
    /* JADX INFO: renamed from: o0, reason: from getter */
    public final ij4 getCardContext() {
        return this.cardContext;
    }

    @Override // p149l.c6o
    @NotNull
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceTab mo105487H() {
        BLiveVoiceTab voiceTab = ((VoiceRoomSquareCommonViewModel) this.viewModel).getVoiceTab();
        voiceTab.getClass();
        return voiceTab;
    }

    /* JADX INFO: renamed from: q0 */
    public void m111906q0(@NotNull BLiveVoiceTab voiceTab, @NotNull List<LiveBaseQuickChatPageView> contentViewList) {
        voiceTab.getClass();
        contentViewList.getClass();
        this.netPlug.m179862Q();
    }

    @Override // p149l.c6o
    @NotNull
    /* JADX INFO: renamed from: m */
    public dwr<? extends s7m<?>> mo105489m() {
        return this;
    }
}
