package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceChatGroup;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceChatGroupApply;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.chatgroup.VoiceChatGroupInfoView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.chatgroup.bean.VoiceChatGroupInfo;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u001d\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010 \u001a\u0004\u0018\u00010\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\u0004J\u0011\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b)\u0010*R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00106\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u0010-\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R\"\u0010:\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u0010-\u001a\u0004\b8\u0010/\"\u0004\b9\u00101R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010E\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010-\u001a\u0004\bC\u0010/\"\u0004\bD\u00101R\"\u0010L\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010_\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010-\u001a\u0004\b]\u0010/\"\u0004\b^\u00101R\"\u0010c\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010=\u001a\u0004\ba\u0010?\"\u0004\bb\u0010AR\"\u0010i\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010m\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010d\u001a\u0004\bk\u0010f\"\u0004\bl\u0010hR\"\u0010t\u001a\u00020n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bo\u0010q\"\u0004\br\u0010sR\"\u0010z\u001a\u00020u8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010v\u001a\u0004\bj\u0010w\"\u0004\bx\u0010yR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R'\u0010\u0082\u0001\u001a\u0004\u0018\u00010}8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b4\u0010~\u001a\u0004\b`\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010\u0085\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bP\u0010\u0084\u0001¨\u0006\u0086\u0001"}, m88121d2 = {"Ll/g7n0;", "Ll/iam;", "Ll/b7n0;", "<init>", "()V", "", BaseSei.f14625Y, "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatGroup;", "voiceChatGroup", BaseSei.f14624X, "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatGroup;)V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatGroupApply;", "applies", "w", "(Ljava/util/List;)V", RXScreenCaptureService.KEY_INDEX, "", "applyId", "Ll/d3q;", "k", "(Ljava/lang/String;)Ll/d3q;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "f", "(Ll/b7n0;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/bean/VoiceChatGroupInfo;", "voiceChatGroupInfo", BaseSei.f14626Z, "(Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/bean/VoiceChatGroupInfo;)V", ResourceDirection.f39656v, "(Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatGroup;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "a", "Landroidx/constraintlayout/widget/ConstraintLayout;", "u", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_root", "b", "p", "set_container", "_container", "c", "get_header", "set_header", "_header", "Lv/VText;", Constants.INAPP_DATA_TAG, "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "n", "set_chat_info_container", "_chat_info_container", "Lv/VDraweeView;", "Lv/VDraweeView;", BLiveStormDanmakuGiftResourceType.f45294s, "()Lv/VDraweeView;", "set_group_profile", "(Lv/VDraweeView;)V", "_group_profile", "Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupInfoView;", "g", "Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupInfoView;", "q", "()Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupInfoView;", "set_group_info", "(Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupInfoView;)V", "_group_info", "Landroid/widget/ImageView;", "h", "Landroid/widget/ImageView;", "get_right_arrow", "()Landroid/widget/ImageView;", "set_right_arrow", "(Landroid/widget/ImageView;)V", "_right_arrow", "get_body", "set_body", "_body", "j", "get_apply_name", "set_apply_name", "_apply_name", "Landroid/view/View;", "get_split", "()Landroid/view/View;", "set_split", "(Landroid/view/View;)V", "_split", BLiveStormDanmakuGiftResourceType.f45292l, "get_indicator", "set_indicator", "_indicator", "Landroid/widget/LinearLayout;", "m", "Landroid/widget/LinearLayout;", "()Landroid/widget/LinearLayout;", "set_apply_list_empty", "(Landroid/widget/LinearLayout;)V", "_apply_list_empty", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "()Landroidx/recyclerview/widget/RecyclerView;", "set_apply_list", "(Landroidx/recyclerview/widget/RecyclerView;)V", "_apply_list", "o", "Ll/b7n0;", "Ll/c0s;", "Ll/c0s;", "()Ll/c0s;", "setDialog", "(Ll/c0s;)V", OMSTemplateType.dialog, "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "adapter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class g7n0 implements iam<b7n0> {

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
    public b7n0 presenter;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public c0s dialog;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final LiveBaseAdapter adapter = new LiveBaseAdapter();

    /* JADX INFO: renamed from: a */
    public static void m129343a(g7n0 g7n0Var, BLiveVoiceChatGroupApply bLiveVoiceChatGroupApply, View view) {
        b7n0 b7n0Var = g7n0Var.presenter;
        if (b7n0Var != null) {
            String str = bLiveVoiceChatGroupApply.f45340id;
            str.getClass();
            String str2 = bLiveVoiceChatGroupApply.mask.name;
            str2.getClass();
            b7n0Var.m102854O3(str, str2, b7n0Var.getAGREE_FROM_ITEM());
        }
    }

    /* JADX INFO: renamed from: b */
    public static Unit m129344b(g7n0 g7n0Var, View view) {
        view.getClass();
        g7n0Var.m129347i();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m129345c(View view) {
        view.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m129346d(g7n0 g7n0Var, View view) {
        view.getClass();
        Object tag = view.getTag();
        if (tag != null) {
            String str = (String) tag;
            if (!TextUtils.isEmpty(str)) {
                zrv.f205799a.m207701w0(view.getContext(), str);
                g7n0Var.m129347i();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    private final void m129347i() {
        ynp0.m216937n(this.dialog);
    }

    /* JADX INFO: renamed from: y */
    private final void m129348y() {
        czq.m113347c(m129359u(), new Function1() { // from class: l.d7n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g7n0.m129344b(this.f85537a, (View) obj);
            }
        });
        czq.m113347c(m129356p(), new Function1() { // from class: l.e7n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g7n0.m129345c((View) obj);
            }
        });
        RecyclerView recyclerViewM129353l = m129353l();
        b7n0 b7n0Var = this.presenter;
        b7n0Var.getClass();
        recyclerViewM129353l.setLayoutManager(new LinearLayoutManager(b7n0Var.act(), 1, false));
        m129353l().setAdapter(this.adapter);
        czq.m113347c(m129355n(), new Function1() { // from class: l.f7n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g7n0.m129346d(this.f97576a, (View) obj);
            }
        });
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        b7n0 b7n0Var = this.presenter;
        if (b7n0Var != null) {
            return b7n0Var.act();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m129349e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM133806b = h7n0.m133806b(this, inflater, parent);
        viewM133806b.getClass();
        return viewM133806b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable b7n0 presenter) {
        this.presenter = presenter;
    }

    @Override // p153l.iam
    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final c0s getDialog() {
        return this.dialog;
    }

    /* JADX INFO: renamed from: k */
    public final d3q<?> m129352k(String applyId) {
        for (d3q<?> d3qVar : this.adapter.m68538J()) {
            if ((d3qVar instanceof d6n0) && Intrinsics.m88377d(applyId, ((d6n0) d3qVar).getVoiceChatGroupApply().f45340id)) {
                return d3qVar;
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final RecyclerView m129353l() {
        RecyclerView recyclerView = this._apply_list;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m88391r("_apply_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final LinearLayout m129354m() {
        LinearLayout linearLayout = this._apply_list_empty;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_apply_list_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final ConstraintLayout m129355n() {
        ConstraintLayout constraintLayout = this._chat_info_container;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_chat_info_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final ConstraintLayout m129356p() {
        ConstraintLayout constraintLayout = this._container;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VoiceChatGroupInfoView m129357q() {
        VoiceChatGroupInfoView voiceChatGroupInfoView = this._group_info;
        if (voiceChatGroupInfoView != null) {
            return voiceChatGroupInfoView;
        }
        Intrinsics.m88391r("_group_info");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VDraweeView m129358s() {
        VDraweeView vDraweeView = this._group_profile;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_group_profile");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final ConstraintLayout m129359u() {
        ConstraintLayout constraintLayout = this._root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final void m129360v(@NotNull String applyId, @NotNull BLiveVoiceChatGroup voiceChatGroup) {
        applyId.getClass();
        voiceChatGroup.getClass();
        m129362x(voiceChatGroup);
        d3q<?> d3qVarM129352k = m129352k(applyId);
        if (d3qVarM129352k != null) {
            this.adapter.m68551W(d3qVarM129352k);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m129361w(List<? extends BLiveVoiceChatGroupApply> applies) {
        m129354m().setVisibility(applies.isEmpty() ? 0 : 8);
        m129353l().setVisibility(applies.isEmpty() ? 8 : 0);
        if (applies.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (final BLiveVoiceChatGroupApply bLiveVoiceChatGroupApply : applies) {
            d6n0 d6n0Var = new d6n0(bLiveVoiceChatGroupApply);
            d6n0Var.m114502K(new View.OnClickListener() { // from class: l.c7n0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g7n0.m129343a(this.f80124a, bLiveVoiceChatGroupApply, view);
                }
            });
            arrayList.add(d6n0Var);
        }
        this.adapter.m68554Z(arrayList);
    }

    /* JADX INFO: renamed from: x */
    public final void m129362x(BLiveVoiceChatGroup voiceChatGroup) {
        izs.m142868s("context_single_room", m129358s(), voiceChatGroup.chatGroupAvatar);
        m129357q().m79282b(voiceChatGroup, false);
        m129355n().setTag(voiceChatGroup.chatGroupId);
    }

    /* JADX INFO: renamed from: z */
    public final void m129363z(@NotNull VoiceChatGroupInfo voiceChatGroupInfo) {
        Act act;
        voiceChatGroupInfo.getClass();
        if (this.dialog == null && (act = getAct()) != null) {
            LayoutInflater layoutInflaterInflater = act.inflater();
            layoutInflaterInflater.getClass();
            this.dialog = new c0s(this.presenter, m129349e(layoutInflaterInflater, null));
            m129348y();
        }
        m129362x(voiceChatGroupInfo.getVoiceChatGroup());
        m129361w(voiceChatGroupInfo.getVoicechatGroupApplies());
        c0s c0sVar = this.dialog;
        if (c0sVar != null) {
            c0sVar.show();
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
