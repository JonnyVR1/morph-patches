package com.p051p1.mobile.putong.live.livingroom.increment.gift.receivegift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.receivegift.ReceiveGiftUsersView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.aoc0;
import p153l.bnl0;
import p153l.coj;
import p153l.cqj;
import p153l.doc0;
import p153l.iam;
import p153l.n3d0;
import p153l.n9c0;
import p153l.o1j0;
import p153l.soc0;
import p153l.uoc0;
import p153l.xnc0;
import p153l.y6s;
import p153l.znc0;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000\u0089\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0005*\u0001c\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\u0016J\u0011\u0010\"\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000eH\u0014¢\u0006\u0004\b$\u0010\u0016J\r\u0010%\u001a\u00020\u000e¢\u0006\u0004\b%\u0010\u0016J\u0015\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0011¢\u0006\u0004\b'\u0010\u0014J-\u0010.\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*2\u0006\u0010-\u001a\u00020\b¢\u0006\u0004\b.\u0010/J\u001b\u00100\u001a\u00020\u000e2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*¢\u0006\u0004\b0\u00101J\u0013\u00103\u001a\b\u0012\u0004\u0012\u0002020*¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u0011¢\u0006\u0004\b6\u0010\u0014J\r\u00107\u001a\u00020\u000e¢\u0006\u0004\b7\u0010\u0016J\r\u00108\u001a\u00020\u0011¢\u0006\u0004\b8\u00109R\"\u0010@\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010^\u001a\u00020[8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010b\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010.R\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010e¨\u0006g"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUsersView;", "Lv/VLinear;", "Ll/iam;", "Ll/soc0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "Q", "(Landroid/view/View;)V", "", "isAudience", "b0", "(Z)V", "d0", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "R", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "W", "(Ll/soc0;)V", "inflateView", "destroy", "C0", "()Landroid/content/Context;", "onFinishInflate", "r", "isSelect", "c0", "Ll/cqj;", "extraInfo", "", "Ll/coj;", "list", "from", "Z", "(Ll/cqj;Ljava/util/List;I)V", "e0", "(Ljava/util/List;)V", "Ll/aoc0;", "getCurrentDataList", "()Ljava/util/List;", "isPacketPanel", "X", "a0", "Y", "()Z", "c", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUsersView;", "get_root", "()Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUsersView;", "set_root", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUsersView;)V", "_root", "Lv/VRecyclerView;", Constants.INAPP_DATA_TAG, "Lv/VRecyclerView;", "get_recyclerView", "()Lv/VRecyclerView;", "set_recyclerView", "(Lv/VRecyclerView;)V", "_recyclerView", "Lv/VText;", "e", "Lv/VText;", "get_all", "()Lv/VText;", "set_all", "(Lv/VText;)V", "_all", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftAudienceView;", "f", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftAudienceView;", "get_audienceView", "()Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftAudienceView;", "set_audienceView", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftAudienceView;)V", "_audienceView", "g", "Ll/soc0;", "Ll/xnc0;", "h", "Ll/xnc0;", "adapter", RXScreenCaptureService.KEY_INDEX, "Ll/cqj;", "j", "isPacketMode", "com/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUsersView$a", "k", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUsersView$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ReceiveGiftUsersView extends VLinear implements iam<soc0> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ReceiveGiftUsersView _root;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VRecyclerView _recyclerView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _all;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public ReceiveGiftAudienceView _audienceView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public soc0 presenter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public xnc0 adapter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public cqj extraInfo;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean isPacketMode;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final C12981a listener;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.receivegift.ReceiveGiftUsersView$a */
    @Metadata(m88120d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0004¨\u0006\r"}, m88121d2 = {"com/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUsersView$a", "Ll/doc0;", "", Constants.INAPP_DATA_TAG, "()Z", "", "c", "()V", "Ll/aoc0;", "model", "a", "(Ll/aoc0;)V", "b", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C12981a implements doc0 {
        public C12981a() {
        }

        @Override // p153l.doc0
        /* JADX INFO: renamed from: a */
        public void mo75178a(aoc0 model) {
            model.getClass();
            xnc0 xnc0Var = ReceiveGiftUsersView.this.adapter;
            if (xnc0Var == null) {
                Intrinsics.m88391r("adapter");
                xnc0Var = null;
            }
            xnc0Var.m212139j0(model);
            ReceiveGiftUsersView.this.m75175d0();
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2, l.vp20] */
        @Override // p153l.doc0
        /* JADX INFO: renamed from: b */
        public boolean mo75179b() {
            soc0 soc0Var = ReceiveGiftUsersView.this.presenter;
            if (soc0Var != null) {
                return y6s.m214494b(soc0Var.m213810E2().mo183435j().liveMode);
            }
            return false;
        }

        @Override // p153l.doc0
        /* JADX INFO: renamed from: c */
        public void mo75180c() {
            ReceiveGiftUsersView.this.m75175d0();
            ReceiveGiftUsersView receiveGiftUsersView = ReceiveGiftUsersView.this;
            xnc0 xnc0Var = receiveGiftUsersView.adapter;
            if (xnc0Var == null) {
                Intrinsics.m88391r("adapter");
                xnc0Var = null;
            }
            receiveGiftUsersView.m75174c0(xnc0Var.m212138i0());
        }

        /* JADX INFO: renamed from: d */
        public boolean m75181d() {
            xnc0 xnc0Var = ReceiveGiftUsersView.this.adapter;
            if (xnc0Var == null) {
                Intrinsics.m88391r("adapter");
                xnc0Var = null;
            }
            return xnc0Var.m212138i0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ReceiveGiftUsersView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.listener = new C12981a();
    }

    /* JADX INFO: renamed from: P */
    public static void m75162P(ReceiveGiftUsersView receiveGiftUsersView, View view) {
        if (receiveGiftUsersView.isPacketMode && zrv.f205799a.m207637H()) {
            o1j0.m165649w(R$string.f47558H);
            return;
        }
        boolean zM75181d = receiveGiftUsersView.listener.m75181d();
        xnc0 xnc0Var = receiveGiftUsersView.adapter;
        if (xnc0Var == null) {
            Intrinsics.m88391r("adapter");
            xnc0Var = null;
        }
        boolean z = !zM75181d;
        xnc0Var.m212140k0(z);
        receiveGiftUsersView.m75174c0(z);
        receiveGiftUsersView.m75175d0();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: Q */
    public final void m75166Q(View view) {
        uoc0.m196972a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final View m75167R(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM196973b = uoc0.m196973b(this, inflater, parent);
        viewM196973b.getClass();
        return viewM196973b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable soc0 presenter) {
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: X */
    public final void m75169X(boolean isPacketPanel) {
        this.isPacketMode = isPacketPanel;
        xnc0 xnc0Var = this.adapter;
        xnc0 xnc0Var2 = null;
        if (xnc0Var == null) {
            Intrinsics.m88391r("adapter");
            xnc0Var = null;
        }
        xnc0Var.m212137h0(isPacketPanel);
        xnc0 xnc0Var3 = this.adapter;
        if (xnc0Var3 == null) {
            Intrinsics.m88391r("adapter");
        } else {
            xnc0Var2 = xnc0Var3;
        }
        m75174c0(xnc0Var2.m212138i0());
        if (isPacketPanel) {
            return;
        }
        m75175d0();
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m75170Y() {
        return bnl0.m105529O0(get_recyclerView());
    }

    /* JADX INFO: renamed from: Z */
    public final void m75171Z(@NotNull cqj extraInfo, @Nullable List<? extends coj> list, int from) {
        extraInfo.getClass();
        this.extraInfo = extraInfo;
        znc0 znc0Var = znc0.INSTANCE;
        List<coj> listM220591b = znc0Var.m220591b(extraInfo, list, this.presenter);
        boolean zM111919h = extraInfo.m111919h();
        m75173b0(zM111919h);
        if (zM111919h) {
            get_audienceView().m75154s(extraInfo);
            return;
        }
        boolean z = true;
        if (!zrv.f205799a.m207637H() && from == 800) {
            z = false;
        }
        List<aoc0> listM220592d = znc0Var.m220592d(extraInfo, listM220591b, this.isPacketMode, this.listener, z);
        xnc0 xnc0Var = this.adapter;
        xnc0 xnc0Var2 = null;
        if (xnc0Var == null) {
            Intrinsics.m88391r("adapter");
            xnc0Var = null;
        }
        xnc0Var.m212141l0(listM220592d);
        xnc0 xnc0Var3 = this.adapter;
        if (xnc0Var3 == null) {
            Intrinsics.m88391r("adapter");
        } else {
            xnc0Var2 = xnc0Var3;
        }
        m75174c0(xnc0Var2.m212138i0());
    }

    /* JADX INFO: renamed from: a0 */
    public final void m75172a0() {
        this.isPacketMode = false;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m75173b0(boolean isAudience) {
        bnl0.m105524M(get_audienceView(), isAudience);
        bnl0.m105524M(get_recyclerView(), !isAudience);
        bnl0.m105524M(get_all(), (isAudience || this.isPacketMode) ? false : true);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m75174c0(boolean isSelect) {
        get_all().setSelected(isSelect);
        get_all().setTextColor(isSelect ? -1 : n3d0.m161277a(n9c0.f140844l1));
    }

    /* JADX INFO: renamed from: d0 */
    public final void m75175d0() {
        soc0 soc0Var;
        xnc0 xnc0Var = this.adapter;
        if (xnc0Var == null) {
            Intrinsics.m88391r("adapter");
            xnc0Var = null;
        }
        aoc0 aoc0VarM212136g0 = xnc0Var.m212136g0();
        if (aoc0VarM212136g0 == null || (soc0Var = this.presenter) == null) {
            return;
        }
        coj callInfo = aoc0VarM212136g0.getCallInfo();
        cqj cqjVar = this.extraInfo;
        soc0Var.m187188T3(callInfo, cqjVar != null ? cqjVar.m111913b() : null);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e0 */
    public final void m75176e0(@NotNull List<? extends coj> list) {
        list.getClass();
        cqj cqjVar = this.extraInfo;
        if (cqjVar != null) {
            znc0 znc0Var = znc0.INSTANCE;
            List<aoc0> listM220592d = znc0Var.m220592d(cqjVar, znc0Var.m220591b(cqjVar, list, this.presenter), this.isPacketMode, this.listener, false);
            xnc0 xnc0Var = this.adapter;
            xnc0 xnc0Var2 = null;
            if (xnc0Var == null) {
                Intrinsics.m88391r("adapter");
                xnc0Var = null;
            }
            xnc0Var.m212141l0(listM220592d);
            xnc0 xnc0Var3 = this.adapter;
            if (xnc0Var3 == null) {
                Intrinsics.m88391r("adapter");
            } else {
                xnc0Var2 = xnc0Var3;
            }
            m75174c0(xnc0Var2.m212138i0());
        }
    }

    @NotNull
    public final List<aoc0> getCurrentDataList() {
        xnc0 xnc0Var = this.adapter;
        if (xnc0Var == null) {
            Intrinsics.m88391r("adapter");
            xnc0Var = null;
        }
        return xnc0Var.m212134e0();
    }

    @NotNull
    public final VText get_all() {
        VText vText = this._all;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_all");
        return null;
    }

    @NotNull
    public final ReceiveGiftAudienceView get_audienceView() {
        ReceiveGiftAudienceView receiveGiftAudienceView = this._audienceView;
        if (receiveGiftAudienceView != null) {
            return receiveGiftAudienceView;
        }
        Intrinsics.m88391r("_audienceView");
        return null;
    }

    @NotNull
    public final VRecyclerView get_recyclerView() {
        VRecyclerView vRecyclerView = this._recyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m88391r("_recyclerView");
        return null;
    }

    @NotNull
    public final ReceiveGiftUsersView get_root() {
        ReceiveGiftUsersView receiveGiftUsersView = this._root;
        if (receiveGiftUsersView != null) {
            return receiveGiftUsersView;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
        inflater.getClass();
        parent.getClass();
        return m75167R(inflater, parent);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75166Q(this);
        m75177r();
    }

    /* JADX INFO: renamed from: r */
    public final void m75177r() {
        this.adapter = new xnc0();
        VRecyclerView vRecyclerView = get_recyclerView();
        xnc0 xnc0Var = this.adapter;
        if (xnc0Var == null) {
            Intrinsics.m88391r("adapter");
            xnc0Var = null;
        }
        vRecyclerView.setAdapter(xnc0Var);
        VRecyclerView vRecyclerView2 = get_recyclerView();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        vRecyclerView2.setLayoutManager(linearLayoutManager);
        get_all().setOnClickListener(new View.OnClickListener() { // from class: l.toc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReceiveGiftUsersView.m75162P(this.f175375a, view);
            }
        });
        bnl0.m105509E0(this, null);
    }

    public final void set_all(@NotNull VText vText) {
        vText.getClass();
        this._all = vText;
    }

    public final void set_audienceView(@NotNull ReceiveGiftAudienceView receiveGiftAudienceView) {
        receiveGiftAudienceView.getClass();
        this._audienceView = receiveGiftAudienceView;
    }

    public final void set_recyclerView(@NotNull VRecyclerView vRecyclerView) {
        vRecyclerView.getClass();
        this._recyclerView = vRecyclerView;
    }

    public final void set_root(@NotNull ReceiveGiftUsersView receiveGiftUsersView) {
        receiveGiftUsersView.getClass();
        this._root = receiveGiftUsersView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ReceiveGiftUsersView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ReceiveGiftUsersView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ ReceiveGiftUsersView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
