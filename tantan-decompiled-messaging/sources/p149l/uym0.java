package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveCoiceChatGroupApplyStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceChatGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceChatGroupApply;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.chatgroup.VoiceChatGroupInfoView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.chatgroup.bean.VoiceChatGroupInfo;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u001d\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u0004\u0018\u00010\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u0011\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b#\u0010\nJ\r\u0010$\u001a\u00020\u0005¢\u0006\u0004\b$\u0010\u0004J\r\u0010%\u001a\u00020\u0005¢\u0006\u0004\b%\u0010\u0004R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00101\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010(\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010=\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010(\u001a\u0004\b;\u0010*\"\u0004\b<\u0010,R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010H\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u00104\u001a\u0004\bF\u00106\"\u0004\bG\u00108R\"\u0010L\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010(\u001a\u0004\bJ\u0010*\"\u0004\bK\u0010,R\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010W\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010@\u001a\u0004\bU\u0010B\"\u0004\bV\u0010DR\"\u0010Z\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u00104\u001a\u0004\bX\u00106\"\u0004\bY\u00108R\"\u0010a\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010bR\u0018\u0010e\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010dR\"\u0010h\u001a\u00020f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010k¨\u0006l"}, m87232d2 = {"Ll/uym0;", "Ll/s7m;", "Ll/oym0;", "<init>", "()V", "", "F", "Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/bean/VoiceChatGroupInfo;", "voiceChatGroupInfo", b2s.C_ZONE, "(Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/bean/VoiceChatGroupInfo;)V", "j", "A", BaseSei.f13931Y, "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatGroupApply;", "applies", "", "k", "(Ljava/util/List;)Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "f", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", RXScreenCaptureService.KEY_INDEX, "(Ll/oym0;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "G", "B", BaseSei.f13932Z, "Landroidx/constraintlayout/widget/ConstraintLayout;", "a", "Landroidx/constraintlayout/widget/ConstraintLayout;", BaseSei.f13930X, "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_root", "b", "q", "set_container", "_container", "Lv/VText;", "c", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", Constants.INAPP_DATA_TAG, "w", "set_remind_view", "_remind_view", "Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupInfoView;", "e", "Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupInfoView;", ResourceDirection.f38808v, "()Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupInfoView;", "set_remind_group_info", "(Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupInfoView;)V", "_remind_group_info", "u", "set_remind_btn", "_remind_btn", "g", "m", "set_apply_container", "_apply_container", "Lv/VDraweeView;", "h", "Lv/VDraweeView;", BLiveStormDanmakuGiftResourceType.f44446s, "()Lv/VDraweeView;", "set_group_profile", "(Lv/VDraweeView;)V", "_group_profile", "n", "set_apply_group_info", "_apply_group_info", BLiveStormDanmakuGiftResourceType.f44444l, "set_apply_btn", "_apply_btn", "Lv/VImage;", "Lv/VImage;", "p", "()Lv/VImage;", "set_arrow", "(Lv/VImage;)V", "_arrow", "Ll/oym0;", "Ll/byr;", "Ll/byr;", OMSTemplateType.dialog, "", "Z", "isRemind", "()Z", "E", "(Z)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class uym0 implements s7m<oym0> {

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
    public oym0 presenter;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public byr dialog;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public boolean isRemind;

    /* JADX INFO: renamed from: F */
    private final void m196313F() {
        cxq.m109105c(m196337x(), new Function1() { // from class: l.pym0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return uym0.m196315b(this.f151864a, (View) obj);
            }
        });
        cxq.m109105c(m196332q(), new Function1() { // from class: l.qym0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return uym0.m196317d((View) obj);
            }
        });
        cxq.m109105c(m196334u(), new Function1() { // from class: l.rym0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return uym0.m196316c(this.f161566a, (View) obj);
            }
        });
        cxq.m109105c(m196328l(), new Function1() { // from class: l.sym0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return uym0.m196318e(this.f166968a, (View) obj);
            }
        });
        cxq.m109105c(m196329m(), new Function1() { // from class: l.tym0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return uym0.m196314a(this.f172610a, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static Unit m196314a(uym0 uym0Var, View view) {
        view.getClass();
        Object tag = view.getTag();
        if (tag != null) {
            ypv.f199493a.m199379w0(view.getContext(), (String) tag);
            uym0Var.m196319j();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m196315b(uym0 uym0Var, View view) {
        view.getClass();
        uym0Var.m196319j();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m196316c(uym0 uym0Var, View view) {
        view.getClass();
        oym0 oym0Var = uym0Var.presenter;
        if (oym0Var != null) {
            oym0Var.m166693S3();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m196317d(View view) {
        view.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static Unit m196318e(uym0 uym0Var, View view) {
        view.getClass();
        oym0 oym0Var = uym0Var.presenter;
        if (oym0Var != null) {
            oym0Var.m166692P3();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    private final void m196319j() {
        uep0.m193327n(this.dialog);
    }

    /* JADX INFO: renamed from: A */
    public final void m196320A() {
        m196329m().setVisibility(0);
        m196332q().setBackground(e16.m114377e(m196332q().getContext(), i3c0.f111035i1));
        m196328l().setVisibility(8);
        m196331p().setVisibility(0);
    }

    /* JADX INFO: renamed from: B */
    public final void m196321B() {
        m196336w().setVisibility(0);
        m196334u().setEnabled(!this.isRemind);
        m196332q().setBackground(this.isRemind ? e16.m114377e(m196332q().getContext(), i3c0.f111035i1) : e16.m114377e(m196332q().getContext(), i3c0.f111035i1));
        m196334u().setText(this.isRemind ? w8u.m202217t(R$string.f46898Pf) : w8u.m202217t(R$string.f46919Qf));
        m196334u().setBackground(this.isRemind ? e16.m114377e(m196332q().getContext(), i3c0.f110849S) : e16.m114377e(m196332q().getContext(), i3c0.f111118p0));
    }

    /* JADX INFO: renamed from: C */
    public final void m196322C(VoiceChatGroupInfo voiceChatGroupInfo) {
        BLiveVoiceChatGroup voiceChatGroup = voiceChatGroupInfo.getVoiceChatGroup();
        m196336w().setVisibility(8);
        m196329m().setVisibility(8);
        m196330n().m78099b(voiceChatGroup, false);
        m196335v().m78099b(voiceChatGroup, true);
        hxs.m133406s("context_single_room", m196333s(), voiceChatGroup.chatGroupAvatar);
        if (TextUtils.isEmpty(voiceChatGroup.chatGroupId)) {
            m196321B();
            return;
        }
        m196329m().setTag(voiceChatGroup.chatGroupId);
        if (voiceChatGroup.inChatGroup) {
            m196320A();
        } else if (TextUtils.equals(BLiveCoiceChatGroupApplyStatus.applying, m196327k(voiceChatGroupInfo.getVoicechatGroupApplies()))) {
            m196339z();
        } else {
            m196338y();
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        oym0 oym0Var = this.presenter;
        if (oym0Var != null) {
            return oym0Var.act();
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final void m196323E(boolean z) {
        this.isRemind = z;
    }

    /* JADX INFO: renamed from: G */
    public final void m196324G(@NotNull VoiceChatGroupInfo voiceChatGroupInfo) {
        Act act;
        voiceChatGroupInfo.getClass();
        if (this.dialog == null && (act = getAct()) != null) {
            LayoutInflater layoutInflaterInflater = act.inflater();
            layoutInflaterInflater.getClass();
            this.dialog = new byr(this.presenter, m196325f(layoutInflaterInflater, null));
            m196313F();
        }
        m196322C(voiceChatGroupInfo);
        byr byrVar = this.dialog;
        if (byrVar != null) {
            byrVar.show();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final View m196325f(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM200663b = vym0.m200663b(this, inflater, parent);
        viewM200663b.getClass();
        return viewM200663b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable oym0 presenter) {
        this.presenter = presenter;
    }

    @Override // p149l.s7m
    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final String m196327k(List<? extends BLiveVoiceChatGroupApply> applies) {
        for (BLiveVoiceChatGroupApply bLiveVoiceChatGroupApply : applies) {
            if (TextUtils.equals(bLiveVoiceChatGroupApply.userId, ypv.f199493a.m199309D0())) {
                String string = bLiveVoiceChatGroupApply.status.toString();
                string.getClass();
                return string;
            }
        }
        return "";
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VText m196328l() {
        VText vText = this._apply_btn;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_apply_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final ConstraintLayout m196329m() {
        ConstraintLayout constraintLayout = this._apply_container;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_apply_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VoiceChatGroupInfoView m196330n() {
        VoiceChatGroupInfoView voiceChatGroupInfoView = this._apply_group_info;
        if (voiceChatGroupInfoView != null) {
            return voiceChatGroupInfoView;
        }
        Intrinsics.m87502r("_apply_group_info");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VImage m196331p() {
        VImage vImage = this._arrow;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_arrow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final ConstraintLayout m196332q() {
        ConstraintLayout constraintLayout = this._container;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VDraweeView m196333s() {
        VDraweeView vDraweeView = this._group_profile;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_group_profile");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VText m196334u() {
        VText vText = this._remind_btn;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_remind_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VoiceChatGroupInfoView m196335v() {
        VoiceChatGroupInfoView voiceChatGroupInfoView = this._remind_group_info;
        if (voiceChatGroupInfoView != null) {
            return voiceChatGroupInfoView;
        }
        Intrinsics.m87502r("_remind_group_info");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final ConstraintLayout m196336w() {
        ConstraintLayout constraintLayout = this._remind_view;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_remind_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final ConstraintLayout m196337x() {
        ConstraintLayout constraintLayout = this._root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    /* JADX INFO: renamed from: y */
    public final void m196338y() {
        m196329m().setVisibility(0);
        m196332q().setBackground(e16.m114377e(m196332q().getContext(), i3c0.f111035i1));
        m196328l().setVisibility(0);
        m196331p().setVisibility(8);
        m196328l().setEnabled(true);
        m196328l().setText(w8u.m202217t(R$string.f46961Sf));
        m196328l().setBackground(e16.m114377e(m196332q().getContext(), i3c0.f111118p0));
    }

    /* JADX INFO: renamed from: z */
    public final void m196339z() {
        m196329m().setVisibility(0);
        m196332q().setBackground(e16.m114377e(m196332q().getContext(), i3c0.f111035i1));
        m196328l().setVisibility(0);
        m196331p().setVisibility(8);
        m196328l().setText(w8u.m202217t(R$string.f46940Rf));
        m196328l().setEnabled(false);
        m196328l().setBackground(e16.m114377e(m196332q().getContext(), i3c0.f110849S));
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
