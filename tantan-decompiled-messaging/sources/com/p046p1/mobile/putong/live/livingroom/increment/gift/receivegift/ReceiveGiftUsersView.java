package com.p046p1.mobile.putong.live.livingroom.increment.gift.receivegift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.receivegift.ReceiveGiftUsersView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.h1c0;
import p149l.kvc0;
import p149l.lgc0;
import p149l.lsi0;
import p149l.mlj;
import p149l.mnj;
import p149l.ngc0;
import p149l.qfc0;
import p149l.s7m;
import p149l.sfc0;
import p149l.tfc0;
import p149l.wfc0;
import p149l.x4s;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\u0089\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0005*\u0001c\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\u0016J\u0011\u0010\"\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000eH\u0014¢\u0006\u0004\b$\u0010\u0016J\r\u0010%\u001a\u00020\u000e¢\u0006\u0004\b%\u0010\u0016J\u0015\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0011¢\u0006\u0004\b'\u0010\u0014J-\u0010.\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*2\u0006\u0010-\u001a\u00020\b¢\u0006\u0004\b.\u0010/J\u001b\u00100\u001a\u00020\u000e2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*¢\u0006\u0004\b0\u00101J\u0013\u00103\u001a\b\u0012\u0004\u0012\u0002020*¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u0011¢\u0006\u0004\b6\u0010\u0014J\r\u00107\u001a\u00020\u000e¢\u0006\u0004\b7\u0010\u0016J\r\u00108\u001a\u00020\u0011¢\u0006\u0004\b8\u00109R\"\u0010@\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010^\u001a\u00020[8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010b\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010.R\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010e¨\u0006g"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUsersView;", "Lv/VLinear;", "Ll/s7m;", "Ll/lgc0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "Q", "(Landroid/view/View;)V", "", "isAudience", "b0", "(Z)V", "d0", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "R", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "W", "(Ll/lgc0;)V", "inflateView", "destroy", "C0", "()Landroid/content/Context;", "onFinishInflate", "r", "isSelect", "c0", "Ll/mnj;", "extraInfo", "", "Ll/mlj;", "list", "from", "Z", "(Ll/mnj;Ljava/util/List;I)V", "e0", "(Ljava/util/List;)V", "Ll/tfc0;", "getCurrentDataList", "()Ljava/util/List;", "isPacketPanel", "X", "a0", "Y", "()Z", "c", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUsersView;", "get_root", "()Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUsersView;", "set_root", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUsersView;)V", "_root", "Lv/VRecyclerView;", Constants.INAPP_DATA_TAG, "Lv/VRecyclerView;", "get_recyclerView", "()Lv/VRecyclerView;", "set_recyclerView", "(Lv/VRecyclerView;)V", "_recyclerView", "Lv/VText;", "e", "Lv/VText;", "get_all", "()Lv/VText;", "set_all", "(Lv/VText;)V", "_all", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftAudienceView;", "f", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftAudienceView;", "get_audienceView", "()Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftAudienceView;", "set_audienceView", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftAudienceView;)V", "_audienceView", "g", "Ll/lgc0;", "Ll/qfc0;", "h", "Ll/qfc0;", "adapter", RXScreenCaptureService.KEY_INDEX, "Ll/mnj;", "j", "isPacketMode", "com/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUsersView$a", "k", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUsersView$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ReceiveGiftUsersView extends VLinear implements s7m<lgc0> {

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
    public lgc0 presenter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public qfc0 adapter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public mnj extraInfo;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean isPacketMode;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final C12818a listener;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.receivegift.ReceiveGiftUsersView$a */
    @Metadata(m87231d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0004¨\u0006\r"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUsersView$a", "Ll/wfc0;", "", Constants.INAPP_DATA_TAG, "()Z", "", "c", "()V", "Ll/tfc0;", "model", "a", "(Ll/tfc0;)V", "b", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12818a implements wfc0 {
        public C12818a() {
        }

        @Override // p149l.wfc0
        /* JADX INFO: renamed from: a */
        public void mo73995a(tfc0 model) {
            model.getClass();
            qfc0 qfc0Var = ReceiveGiftUsersView.this.adapter;
            if (qfc0Var == null) {
                Intrinsics.m87502r("adapter");
                qfc0Var = null;
            }
            qfc0Var.m174285j0(model);
            ReceiveGiftUsersView.this.m73992d0();
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2, l.lh20] */
        @Override // p149l.wfc0
        /* JADX INFO: renamed from: b */
        public boolean mo73996b() {
            lgc0 lgc0Var = ReceiveGiftUsersView.this.presenter;
            if (lgc0Var != null) {
                return x4s.m207012b(lgc0Var.m206027E2().mo149813j().liveMode);
            }
            return false;
        }

        @Override // p149l.wfc0
        /* JADX INFO: renamed from: c */
        public void mo73997c() {
            ReceiveGiftUsersView.this.m73992d0();
            ReceiveGiftUsersView receiveGiftUsersView = ReceiveGiftUsersView.this;
            qfc0 qfc0Var = receiveGiftUsersView.adapter;
            if (qfc0Var == null) {
                Intrinsics.m87502r("adapter");
                qfc0Var = null;
            }
            receiveGiftUsersView.m73991c0(qfc0Var.m174284i0());
        }

        /* JADX INFO: renamed from: d */
        public boolean m73998d() {
            qfc0 qfc0Var = ReceiveGiftUsersView.this.adapter;
            if (qfc0Var == null) {
                Intrinsics.m87502r("adapter");
                qfc0Var = null;
            }
            return qfc0Var.m174284i0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ReceiveGiftUsersView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.listener = new C12818a();
    }

    /* JADX INFO: renamed from: P */
    public static void m73979P(ReceiveGiftUsersView receiveGiftUsersView, View view) {
        if (receiveGiftUsersView.isPacketMode && ypv.f199493a.m199315H()) {
            lsi0.m151593w(R$string.f46710H);
            return;
        }
        boolean zM73998d = receiveGiftUsersView.listener.m73998d();
        qfc0 qfc0Var = receiveGiftUsersView.adapter;
        if (qfc0Var == null) {
            Intrinsics.m87502r("adapter");
            qfc0Var = null;
        }
        boolean z = !zM73998d;
        qfc0Var.m174286k0(z);
        receiveGiftUsersView.m73991c0(z);
        receiveGiftUsersView.m73992d0();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: Q */
    public final void m73983Q(View view) {
        ngc0.m159293a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final View m73984R(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM159294b = ngc0.m159294b(this, inflater, parent);
        viewM159294b.getClass();
        return viewM159294b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable lgc0 presenter) {
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: X */
    public final void m73986X(boolean isPacketPanel) {
        this.isPacketMode = isPacketPanel;
        qfc0 qfc0Var = this.adapter;
        qfc0 qfc0Var2 = null;
        if (qfc0Var == null) {
            Intrinsics.m87502r("adapter");
            qfc0Var = null;
        }
        qfc0Var.m174283h0(isPacketPanel);
        qfc0 qfc0Var3 = this.adapter;
        if (qfc0Var3 == null) {
            Intrinsics.m87502r("adapter");
        } else {
            qfc0Var2 = qfc0Var3;
        }
        m73991c0(qfc0Var2.m174284i0());
        if (isPacketPanel) {
            return;
        }
        m73992d0();
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m73987Y() {
        return xdl0.m208349O0(get_recyclerView());
    }

    /* JADX INFO: renamed from: Z */
    public final void m73988Z(@NotNull mnj extraInfo, @Nullable List<? extends mlj> list, int from) {
        extraInfo.getClass();
        this.extraInfo = extraInfo;
        sfc0 sfc0Var = sfc0.INSTANCE;
        List<mlj> listM183908b = sfc0Var.m183908b(extraInfo, list, this.presenter);
        boolean zM155519h = extraInfo.m155519h();
        m73990b0(zM155519h);
        if (zM155519h) {
            get_audienceView().m73971s(extraInfo);
            return;
        }
        boolean z = true;
        if (!ypv.f199493a.m199315H() && from == 800) {
            z = false;
        }
        List<tfc0> listM183909d = sfc0Var.m183909d(extraInfo, listM183908b, this.isPacketMode, this.listener, z);
        qfc0 qfc0Var = this.adapter;
        qfc0 qfc0Var2 = null;
        if (qfc0Var == null) {
            Intrinsics.m87502r("adapter");
            qfc0Var = null;
        }
        qfc0Var.m174287l0(listM183909d);
        qfc0 qfc0Var3 = this.adapter;
        if (qfc0Var3 == null) {
            Intrinsics.m87502r("adapter");
        } else {
            qfc0Var2 = qfc0Var3;
        }
        m73991c0(qfc0Var2.m174284i0());
    }

    /* JADX INFO: renamed from: a0 */
    public final void m73989a0() {
        this.isPacketMode = false;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m73990b0(boolean isAudience) {
        xdl0.m208344M(get_audienceView(), isAudience);
        xdl0.m208344M(get_recyclerView(), !isAudience);
        xdl0.m208344M(get_all(), (isAudience || this.isPacketMode) ? false : true);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m73991c0(boolean isSelect) {
        get_all().setSelected(isSelect);
        get_all().setTextColor(isSelect ? -1 : kvc0.m147352a(h1c0.f105383l1));
    }

    /* JADX INFO: renamed from: d0 */
    public final void m73992d0() {
        lgc0 lgc0Var;
        qfc0 qfc0Var = this.adapter;
        if (qfc0Var == null) {
            Intrinsics.m87502r("adapter");
            qfc0Var = null;
        }
        tfc0 tfc0VarM174282g0 = qfc0Var.m174282g0();
        if (tfc0VarM174282g0 == null || (lgc0Var = this.presenter) == null) {
            return;
        }
        mlj callInfo = tfc0VarM174282g0.getCallInfo();
        mnj mnjVar = this.extraInfo;
        lgc0Var.m149772T3(callInfo, mnjVar != null ? mnjVar.m155513b() : null);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e0 */
    public final void m73993e0(@NotNull List<? extends mlj> list) {
        list.getClass();
        mnj mnjVar = this.extraInfo;
        if (mnjVar != null) {
            sfc0 sfc0Var = sfc0.INSTANCE;
            List<tfc0> listM183909d = sfc0Var.m183909d(mnjVar, sfc0Var.m183908b(mnjVar, list, this.presenter), this.isPacketMode, this.listener, false);
            qfc0 qfc0Var = this.adapter;
            qfc0 qfc0Var2 = null;
            if (qfc0Var == null) {
                Intrinsics.m87502r("adapter");
                qfc0Var = null;
            }
            qfc0Var.m174287l0(listM183909d);
            qfc0 qfc0Var3 = this.adapter;
            if (qfc0Var3 == null) {
                Intrinsics.m87502r("adapter");
            } else {
                qfc0Var2 = qfc0Var3;
            }
            m73991c0(qfc0Var2.m174284i0());
        }
    }

    @NotNull
    public final List<tfc0> getCurrentDataList() {
        qfc0 qfc0Var = this.adapter;
        if (qfc0Var == null) {
            Intrinsics.m87502r("adapter");
            qfc0Var = null;
        }
        return qfc0Var.m174280e0();
    }

    @NotNull
    public final VText get_all() {
        VText vText = this._all;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_all");
        return null;
    }

    @NotNull
    public final ReceiveGiftAudienceView get_audienceView() {
        ReceiveGiftAudienceView receiveGiftAudienceView = this._audienceView;
        if (receiveGiftAudienceView != null) {
            return receiveGiftAudienceView;
        }
        Intrinsics.m87502r("_audienceView");
        return null;
    }

    @NotNull
    public final VRecyclerView get_recyclerView() {
        VRecyclerView vRecyclerView = this._recyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m87502r("_recyclerView");
        return null;
    }

    @NotNull
    public final ReceiveGiftUsersView get_root() {
        ReceiveGiftUsersView receiveGiftUsersView = this._root;
        if (receiveGiftUsersView != null) {
            return receiveGiftUsersView;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
        inflater.getClass();
        parent.getClass();
        return m73984R(inflater, parent);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73983Q(this);
        m73994r();
    }

    /* JADX INFO: renamed from: r */
    public final void m73994r() {
        this.adapter = new qfc0();
        VRecyclerView vRecyclerView = get_recyclerView();
        qfc0 qfc0Var = this.adapter;
        if (qfc0Var == null) {
            Intrinsics.m87502r("adapter");
            qfc0Var = null;
        }
        vRecyclerView.setAdapter(qfc0Var);
        VRecyclerView vRecyclerView2 = get_recyclerView();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        vRecyclerView2.setLayoutManager(linearLayoutManager);
        get_all().setOnClickListener(new View.OnClickListener() { // from class: l.mgc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReceiveGiftUsersView.m73979P(this.f133667a, view);
            }
        });
        xdl0.m208329E0(this, null);
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
