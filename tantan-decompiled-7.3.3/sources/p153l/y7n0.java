package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveCoiceChatGroupApplyStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceChatGroup;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceChatGroupApply;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.chatgroup.VoiceChatGroupInfoView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.chatgroup.bean.VoiceChatGroupInfo;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u001d\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u0004\u0018\u00010\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u0011\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b#\u0010\nJ\r\u0010$\u001a\u00020\u0005¢\u0006\u0004\b$\u0010\u0004J\r\u0010%\u001a\u00020\u0005¢\u0006\u0004\b%\u0010\u0004R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00101\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010(\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010=\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010(\u001a\u0004\b;\u0010*\"\u0004\b<\u0010,R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010H\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u00104\u001a\u0004\bF\u00106\"\u0004\bG\u00108R\"\u0010L\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010(\u001a\u0004\bJ\u0010*\"\u0004\bK\u0010,R\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010W\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010@\u001a\u0004\bU\u0010B\"\u0004\bV\u0010DR\"\u0010Z\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u00104\u001a\u0004\bX\u00106\"\u0004\bY\u00108R\"\u0010a\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010bR\u0018\u0010e\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010dR\"\u0010h\u001a\u00020f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010k¨\u0006l"}, m88121d2 = {"Ll/y7n0;", "Ll/iam;", "Ll/s7n0;", "<init>", "()V", "", "F", "Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/bean/VoiceChatGroupInfo;", "voiceChatGroupInfo", c4s.C_ZONE, "(Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/bean/VoiceChatGroupInfo;)V", "j", "A", BaseSei.f14625Y, "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatGroupApply;", "applies", "", "k", "(Ljava/util/List;)Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "f", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", RXScreenCaptureService.KEY_INDEX, "(Ll/s7n0;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "G", "B", BaseSei.f14626Z, "Landroidx/constraintlayout/widget/ConstraintLayout;", "a", "Landroidx/constraintlayout/widget/ConstraintLayout;", BaseSei.f14624X, "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_root", "b", "q", "set_container", "_container", "Lv/VText;", "c", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", Constants.INAPP_DATA_TAG, "w", "set_remind_view", "_remind_view", "Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupInfoView;", "e", "Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupInfoView;", ResourceDirection.f39656v, "()Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupInfoView;", "set_remind_group_info", "(Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupInfoView;)V", "_remind_group_info", "u", "set_remind_btn", "_remind_btn", "g", "m", "set_apply_container", "_apply_container", "Lv/VDraweeView;", "h", "Lv/VDraweeView;", BLiveStormDanmakuGiftResourceType.f45294s, "()Lv/VDraweeView;", "set_group_profile", "(Lv/VDraweeView;)V", "_group_profile", "n", "set_apply_group_info", "_apply_group_info", BLiveStormDanmakuGiftResourceType.f45292l, "set_apply_btn", "_apply_btn", "Lv/VImage;", "Lv/VImage;", "p", "()Lv/VImage;", "set_arrow", "(Lv/VImage;)V", "_arrow", "Ll/s7n0;", "Ll/c0s;", "Ll/c0s;", OMSTemplateType.dialog, "", "Z", "isRemind", "()Z", "E", "(Z)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class y7n0 implements iam<s7n0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public ConstraintLayout _root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public ConstraintLayout _container;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ConstraintLayout _remind_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VoiceChatGroupInfoView _remind_group_info;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _remind_btn;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public ConstraintLayout _apply_container;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VDraweeView _group_profile;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VoiceChatGroupInfoView _apply_group_info;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _apply_btn;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VImage _arrow;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public s7n0 presenter;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public c0s dialog;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public boolean isRemind;

    /* JADX INFO: renamed from: F */
    private final void m214563F() {
        czq.m113347c(m214587x(), new Function1() { // from class: l.t7n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y7n0.m214565b(this.f172457a, (View) obj);
            }
        });
        czq.m113347c(m214582q(), new Function1() { // from class: l.u7n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y7n0.m214567d((View) obj);
            }
        });
        czq.m113347c(m214584u(), new Function1() { // from class: l.v7n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y7n0.m214566c(this.f182787a, (View) obj);
            }
        });
        czq.m113347c(m214578l(), new Function1() { // from class: l.w7n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y7n0.m214568e(this.f187772a, (View) obj);
            }
        });
        czq.m113347c(m214579m(), new Function1() { // from class: l.x7n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y7n0.m214564a(this.f192736a, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static Unit m214564a(y7n0 y7n0Var, View view) {
        view.getClass();
        Object tag = view.getTag();
        if (tag != null) {
            zrv.f205799a.m207701w0(view.getContext(), (String) tag);
            y7n0Var.m214569j();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m214565b(y7n0 y7n0Var, View view) {
        view.getClass();
        y7n0Var.m214569j();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m214566c(y7n0 y7n0Var, View view) {
        view.getClass();
        s7n0 s7n0Var = y7n0Var.presenter;
        if (s7n0Var != null) {
            s7n0Var.m185035S3();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m214567d(View view) {
        view.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static Unit m214568e(y7n0 y7n0Var, View view) {
        view.getClass();
        s7n0 s7n0Var = y7n0Var.presenter;
        if (s7n0Var != null) {
            s7n0Var.m185034P3();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    private final void m214569j() {
        ynp0.m216937n(this.dialog);
    }

    /* JADX INFO: renamed from: A */
    public final void m214570A() {
        m214579m().setVisibility(0);
        m214582q().setBackground(j26.m143192e(m214582q().getContext(), obc0.f146363i1));
        m214578l().setVisibility(8);
        m214581p().setVisibility(0);
    }

    /* JADX INFO: renamed from: B */
    public final void m214571B() {
        m214586w().setVisibility(0);
        m214584u().setEnabled(!this.isRemind);
        m214582q().setBackground(this.isRemind ? j26.m143192e(m214582q().getContext(), obc0.f146363i1) : j26.m143192e(m214582q().getContext(), obc0.f146363i1));
        m214584u().setText(this.isRemind ? xau.m209910t(R$string.f47746Pf) : xau.m209910t(R$string.f47767Qf));
        m214584u().setBackground(this.isRemind ? j26.m143192e(m214582q().getContext(), obc0.f146177S) : j26.m143192e(m214582q().getContext(), obc0.f146446p0));
    }

    /* JADX INFO: renamed from: C */
    public final void m214572C(VoiceChatGroupInfo voiceChatGroupInfo) {
        BLiveVoiceChatGroup voiceChatGroup = voiceChatGroupInfo.getVoiceChatGroup();
        m214586w().setVisibility(8);
        m214579m().setVisibility(8);
        m214580n().m79282b(voiceChatGroup, false);
        m214585v().m79282b(voiceChatGroup, true);
        izs.m142868s("context_single_room", m214583s(), voiceChatGroup.chatGroupAvatar);
        if (TextUtils.isEmpty(voiceChatGroup.chatGroupId)) {
            m214571B();
            return;
        }
        m214579m().setTag(voiceChatGroup.chatGroupId);
        if (voiceChatGroup.inChatGroup) {
            m214570A();
        } else if (TextUtils.equals(BLiveCoiceChatGroupApplyStatus.applying, m214577k(voiceChatGroupInfo.getVoicechatGroupApplies()))) {
            m214589z();
        } else {
            m214588y();
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        s7n0 s7n0Var = this.presenter;
        if (s7n0Var != null) {
            return s7n0Var.act();
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final void m214573E(boolean z) {
        this.isRemind = z;
    }

    /* JADX INFO: renamed from: G */
    public final void m214574G(@NotNull VoiceChatGroupInfo voiceChatGroupInfo) {
        Act act;
        voiceChatGroupInfo.getClass();
        if (this.dialog == null && (act = getAct()) != null) {
            LayoutInflater layoutInflaterInflater = act.inflater();
            layoutInflaterInflater.getClass();
            this.dialog = new c0s(this.presenter, m214575f(layoutInflaterInflater, null));
            m214563F();
        }
        m214572C(voiceChatGroupInfo);
        c0s c0sVar = this.dialog;
        if (c0sVar != null) {
            c0sVar.show();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final View m214575f(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM218904b = z7n0.m218904b(this, inflater, parent);
        viewM218904b.getClass();
        return viewM218904b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable s7n0 presenter) {
        this.presenter = presenter;
    }

    @Override // p153l.iam
    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final String m214577k(List<? extends BLiveVoiceChatGroupApply> applies) {
        for (BLiveVoiceChatGroupApply bLiveVoiceChatGroupApply : applies) {
            if (TextUtils.equals(bLiveVoiceChatGroupApply.userId, zrv.f205799a.m207631D0())) {
                String string = bLiveVoiceChatGroupApply.status.toString();
                string.getClass();
                return string;
            }
        }
        return "";
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VText m214578l() {
        VText vText = this._apply_btn;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_apply_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final ConstraintLayout m214579m() {
        ConstraintLayout constraintLayout = this._apply_container;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_apply_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VoiceChatGroupInfoView m214580n() {
        VoiceChatGroupInfoView voiceChatGroupInfoView = this._apply_group_info;
        if (voiceChatGroupInfoView != null) {
            return voiceChatGroupInfoView;
        }
        Intrinsics.m88391r("_apply_group_info");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VImage m214581p() {
        VImage vImage = this._arrow;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_arrow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final ConstraintLayout m214582q() {
        ConstraintLayout constraintLayout = this._container;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VDraweeView m214583s() {
        VDraweeView vDraweeView = this._group_profile;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_group_profile");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VText m214584u() {
        VText vText = this._remind_btn;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_remind_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VoiceChatGroupInfoView m214585v() {
        VoiceChatGroupInfoView voiceChatGroupInfoView = this._remind_group_info;
        if (voiceChatGroupInfoView != null) {
            return voiceChatGroupInfoView;
        }
        Intrinsics.m88391r("_remind_group_info");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final ConstraintLayout m214586w() {
        ConstraintLayout constraintLayout = this._remind_view;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_remind_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final ConstraintLayout m214587x() {
        ConstraintLayout constraintLayout = this._root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    /* JADX INFO: renamed from: y */
    public final void m214588y() {
        m214579m().setVisibility(0);
        m214582q().setBackground(j26.m143192e(m214582q().getContext(), obc0.f146363i1));
        m214578l().setVisibility(0);
        m214581p().setVisibility(8);
        m214578l().setEnabled(true);
        m214578l().setText(xau.m209910t(R$string.f47809Sf));
        m214578l().setBackground(j26.m143192e(m214582q().getContext(), obc0.f146446p0));
    }

    /* JADX INFO: renamed from: z */
    public final void m214589z() {
        m214579m().setVisibility(0);
        m214582q().setBackground(j26.m143192e(m214582q().getContext(), obc0.f146363i1));
        m214578l().setVisibility(0);
        m214581p().setVisibility(8);
        m214578l().setText(xau.m209910t(R$string.f47788Rf));
        m214578l().setEnabled(false);
        m214578l().setBackground(j26.m143192e(m214582q().getContext(), obc0.f146177S));
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
