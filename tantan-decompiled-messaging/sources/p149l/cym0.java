package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceChatGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceChatGroupApply;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.chatgroup.VoiceChatGroupInfoView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.chatgroup.bean.VoiceChatGroupInfo;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u001d\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010 \u001a\u0004\u0018\u00010\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\u0004J\u0011\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b)\u0010*R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00106\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u0010-\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R\"\u0010:\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u0010-\u001a\u0004\b8\u0010/\"\u0004\b9\u00101R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010E\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010-\u001a\u0004\bC\u0010/\"\u0004\bD\u00101R\"\u0010L\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010_\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010-\u001a\u0004\b]\u0010/\"\u0004\b^\u00101R\"\u0010c\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010=\u001a\u0004\ba\u0010?\"\u0004\bb\u0010AR\"\u0010i\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010m\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010d\u001a\u0004\bk\u0010f\"\u0004\bl\u0010hR\"\u0010t\u001a\u00020n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bo\u0010q\"\u0004\br\u0010sR\"\u0010z\u001a\u00020u8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010v\u001a\u0004\bj\u0010w\"\u0004\bx\u0010yR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R'\u0010\u0082\u0001\u001a\u0004\u0018\u00010}8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b4\u0010~\u001a\u0004\b`\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010\u0085\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bP\u0010\u0084\u0001¨\u0006\u0086\u0001"}, m87232d2 = {"Ll/cym0;", "Ll/s7m;", "Ll/xxm0;", "<init>", "()V", "", BaseSei.f13931Y, "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatGroup;", "voiceChatGroup", BaseSei.f13930X, "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatGroup;)V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatGroupApply;", "applies", "w", "(Ljava/util/List;)V", RXScreenCaptureService.KEY_INDEX, "", "applyId", "Ll/d1q;", "k", "(Ljava/lang/String;)Ll/d1q;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "f", "(Ll/xxm0;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/bean/VoiceChatGroupInfo;", "voiceChatGroupInfo", BaseSei.f13932Z, "(Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/bean/VoiceChatGroupInfo;)V", ResourceDirection.f38808v, "(Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatGroup;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "a", "Landroidx/constraintlayout/widget/ConstraintLayout;", "u", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_root", "b", "p", "set_container", "_container", "c", "get_header", "set_header", "_header", "Lv/VText;", Constants.INAPP_DATA_TAG, "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "n", "set_chat_info_container", "_chat_info_container", "Lv/VDraweeView;", "Lv/VDraweeView;", BLiveStormDanmakuGiftResourceType.f44446s, "()Lv/VDraweeView;", "set_group_profile", "(Lv/VDraweeView;)V", "_group_profile", "Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupInfoView;", "g", "Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupInfoView;", "q", "()Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupInfoView;", "set_group_info", "(Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupInfoView;)V", "_group_info", "Landroid/widget/ImageView;", "h", "Landroid/widget/ImageView;", "get_right_arrow", "()Landroid/widget/ImageView;", "set_right_arrow", "(Landroid/widget/ImageView;)V", "_right_arrow", "get_body", "set_body", "_body", "j", "get_apply_name", "set_apply_name", "_apply_name", "Landroid/view/View;", "get_split", "()Landroid/view/View;", "set_split", "(Landroid/view/View;)V", "_split", BLiveStormDanmakuGiftResourceType.f44444l, "get_indicator", "set_indicator", "_indicator", "Landroid/widget/LinearLayout;", "m", "Landroid/widget/LinearLayout;", "()Landroid/widget/LinearLayout;", "set_apply_list_empty", "(Landroid/widget/LinearLayout;)V", "_apply_list_empty", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "()Landroidx/recyclerview/widget/RecyclerView;", "set_apply_list", "(Landroidx/recyclerview/widget/RecyclerView;)V", "_apply_list", "o", "Ll/xxm0;", "Ll/byr;", "Ll/byr;", "()Ll/byr;", "setDialog", "(Ll/byr;)V", OMSTemplateType.dialog, "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "adapter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class cym0 implements s7m<xxm0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public ConstraintLayout _root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public ConstraintLayout _container;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ConstraintLayout _header;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public ConstraintLayout _chat_info_container;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VDraweeView _group_profile;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VoiceChatGroupInfoView _group_info;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public ImageView _right_arrow;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public ConstraintLayout _body;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _apply_name;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public View _split;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public View _indicator;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public LinearLayout _apply_list_empty;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public RecyclerView _apply_list;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public xxm0 presenter;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public byr dialog;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final LiveBaseAdapter adapter = new LiveBaseAdapter();

    /* JADX INFO: renamed from: a */
    public static void m109333a(cym0 cym0Var, BLiveVoiceChatGroupApply bLiveVoiceChatGroupApply, View view) {
        xxm0 xxm0Var = cym0Var.presenter;
        if (xxm0Var != null) {
            String str = bLiveVoiceChatGroupApply.f44492id;
            str.getClass();
            String str2 = bLiveVoiceChatGroupApply.mask.name;
            str2.getClass();
            xxm0Var.m211517O3(str, str2, xxm0Var.getAGREE_FROM_ITEM());
        }
    }

    /* JADX INFO: renamed from: b */
    public static Unit m109334b(cym0 cym0Var, View view) {
        view.getClass();
        cym0Var.m109337i();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m109335c(View view) {
        view.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m109336d(cym0 cym0Var, View view) {
        view.getClass();
        Object tag = view.getTag();
        if (tag != null) {
            String str = (String) tag;
            if (!TextUtils.isEmpty(str)) {
                ypv.f199493a.m199379w0(view.getContext(), str);
                cym0Var.m109337i();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    private final void m109337i() {
        uep0.m193327n(this.dialog);
    }

    /* JADX INFO: renamed from: y */
    private final void m109338y() {
        cxq.m109105c(m109349u(), new Function1() { // from class: l.zxm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return cym0.m109334b(this.f205472a, (View) obj);
            }
        });
        cxq.m109105c(m109346p(), new Function1() { // from class: l.aym0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return cym0.m109335c((View) obj);
            }
        });
        RecyclerView recyclerViewM109343l = m109343l();
        xxm0 xxm0Var = this.presenter;
        xxm0Var.getClass();
        recyclerViewM109343l.setLayoutManager(new LinearLayoutManager(xxm0Var.act(), 1, false));
        m109343l().setAdapter(this.adapter);
        cxq.m109105c(m109345n(), new Function1() { // from class: l.bym0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return cym0.m109336d(this.f77944a, (View) obj);
            }
        });
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        xxm0 xxm0Var = this.presenter;
        if (xxm0Var != null) {
            return xxm0Var.act();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m109339e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM114082b = dym0.m114082b(this, inflater, parent);
        viewM114082b.getClass();
        return viewM114082b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable xxm0 presenter) {
        this.presenter = presenter;
    }

    @Override // p149l.s7m
    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final byr getDialog() {
        return this.dialog;
    }

    /* JADX INFO: renamed from: k */
    public final d1q<?> m109342k(String applyId) {
        for (d1q<?> d1qVar : this.adapter.m67355J()) {
            if ((d1qVar instanceof zwm0) && Intrinsics.m87488d(applyId, ((zwm0) d1qVar).getVoiceChatGroupApply().f44492id)) {
                return d1qVar;
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final RecyclerView m109343l() {
        RecyclerView recyclerView = this._apply_list;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m87502r("_apply_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final LinearLayout m109344m() {
        LinearLayout linearLayout = this._apply_list_empty;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_apply_list_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final ConstraintLayout m109345n() {
        ConstraintLayout constraintLayout = this._chat_info_container;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_chat_info_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final ConstraintLayout m109346p() {
        ConstraintLayout constraintLayout = this._container;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VoiceChatGroupInfoView m109347q() {
        VoiceChatGroupInfoView voiceChatGroupInfoView = this._group_info;
        if (voiceChatGroupInfoView != null) {
            return voiceChatGroupInfoView;
        }
        Intrinsics.m87502r("_group_info");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VDraweeView m109348s() {
        VDraweeView vDraweeView = this._group_profile;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_group_profile");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final ConstraintLayout m109349u() {
        ConstraintLayout constraintLayout = this._root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final void m109350v(@NotNull String applyId, @NotNull BLiveVoiceChatGroup voiceChatGroup) {
        applyId.getClass();
        voiceChatGroup.getClass();
        m109352x(voiceChatGroup);
        d1q<?> d1qVarM109342k = m109342k(applyId);
        if (d1qVarM109342k != null) {
            this.adapter.m67368W(d1qVarM109342k);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m109351w(List<? extends BLiveVoiceChatGroupApply> applies) {
        m109344m().setVisibility(applies.isEmpty() ? 0 : 8);
        m109343l().setVisibility(applies.isEmpty() ? 8 : 0);
        if (applies.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (final BLiveVoiceChatGroupApply bLiveVoiceChatGroupApply : applies) {
            zwm0 zwm0Var = new zwm0(bLiveVoiceChatGroupApply);
            zwm0Var.m220676K(new View.OnClickListener() { // from class: l.yxm0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cym0.m109333a(this.f200644a, bLiveVoiceChatGroupApply, view);
                }
            });
            arrayList.add(zwm0Var);
        }
        this.adapter.m67371Z(arrayList);
    }

    /* JADX INFO: renamed from: x */
    public final void m109352x(BLiveVoiceChatGroup voiceChatGroup) {
        hxs.m133406s("context_single_room", m109348s(), voiceChatGroup.chatGroupAvatar);
        m109347q().m78099b(voiceChatGroup, false);
        m109345n().setTag(voiceChatGroup.chatGroupId);
    }

    /* JADX INFO: renamed from: z */
    public final void m109353z(@NotNull VoiceChatGroupInfo voiceChatGroupInfo) {
        Act act;
        voiceChatGroupInfo.getClass();
        if (this.dialog == null && (act = getAct()) != null) {
            LayoutInflater layoutInflaterInflater = act.inflater();
            layoutInflaterInflater.getClass();
            this.dialog = new byr(this.presenter, m109339e(layoutInflaterInflater, null));
            m109338y();
        }
        m109352x(voiceChatGroupInfo.getVoiceChatGroup());
        m109351w(voiceChatGroupInfo.getVoicechatGroupApplies());
        byr byrVar = this.dialog;
        if (byrVar != null) {
            byrVar.show();
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
