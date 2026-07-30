package com.p051p1.mobile.putong.live.livingroom.voice.membermanager.requestsettlein;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC0618v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSettle;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.bnl0;
import p153l.tjy;
import p153l.umy;
import p153l.yec0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 H2\u00020\u0001:\u0001IB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 R\"\u0010'\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006J"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/requestsettlein/MemberRequestSettleInView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Ll/tjy;", "memberAdapter", "k0", "(Ll/tjy;)V", "j0", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceSettle;", "newData", "setListData", "(Ljava/util/List;)V", "", "empty", "m0", "(Z)V", "", "position", "l0", "(ILjava/util/List;)V", "Landroid/view/View;", OMSTemplateModeType.view, "h0", "(Landroid/view/View;)V", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/requestsettlein/MemberRequestSettleInView;", "get_rootView", "()Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/requestsettlein/MemberRequestSettleInView;", "set_rootView", "(Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/requestsettlein/MemberRequestSettleInView;)V", "_rootView", "Lv/VRecyclerView;", "e", "Lv/VRecyclerView;", "get_recyclerView", "()Lv/VRecyclerView;", "set_recyclerView", "(Lv/VRecyclerView;)V", "_recyclerView", "Lv/VLinear;", "f", "Lv/VLinear;", "get_empty", "()Lv/VLinear;", "set_empty", "(Lv/VLinear;)V", "_empty", "Lv/VImage;", "g", "Lv/VImage;", "get_empty_icon", "()Lv/VImage;", "set_empty_icon", "(Lv/VImage;)V", "_empty_icon", "Lv/VText;", "h", "Lv/VText;", "get_empty_text", "()Lv/VText;", "set_empty_text", "(Lv/VText;)V", "_empty_text", "Companion", "a", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class MemberRequestSettleInView extends ConstraintLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public MemberRequestSettleInView _rootView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VRecyclerView _recyclerView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VLinear _empty;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VImage _empty_icon;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _empty_text;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.membermanager.requestsettlein.MemberRequestSettleInView$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/requestsettlein/MemberRequestSettleInView$a;", "", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/requestsettlein/MemberRequestSettleInView;", "a", "(Landroid/view/LayoutInflater;)Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/requestsettlein/MemberRequestSettleInView;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final MemberRequestSettleInView m79842a(@NotNull LayoutInflater inflater) {
            inflater.getClass();
            View viewInflate = inflater.inflate(yec0.f198935U3, (ViewGroup) null, false);
            viewInflate.getClass();
            return (MemberRequestSettleInView) viewInflate;
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public MemberRequestSettleInView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i0 */
    public static final MemberRequestSettleInView m79836i0(@NotNull LayoutInflater layoutInflater) {
        return INSTANCE.m79842a(layoutInflater);
    }

    @NotNull
    public final VLinear get_empty() {
        VLinear vLinear = this._empty;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_empty");
        return null;
    }

    @NotNull
    public final VImage get_empty_icon() {
        VImage vImage = this._empty_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_empty_icon");
        return null;
    }

    @NotNull
    public final VText get_empty_text() {
        VText vText = this._empty_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_empty_text");
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
    public final MemberRequestSettleInView get_rootView() {
        MemberRequestSettleInView memberRequestSettleInView = this._rootView;
        if (memberRequestSettleInView != null) {
            return memberRequestSettleInView;
        }
        Intrinsics.m88391r("_rootView");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m79837h0(View view) {
        umy.m196814a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m79838j0(@NotNull tjy memberAdapter) {
        memberAdapter.getClass();
        VRecyclerView vRecyclerView = get_recyclerView();
        vRecyclerView.setAdapter(memberAdapter);
        vRecyclerView.setHasFixedSize(true);
        vRecyclerView.setLayoutManager(new LinearLayoutManager(vRecyclerView.getContext()));
        RecyclerView.AbstractC0576l itemAnimator = vRecyclerView.getItemAnimator();
        itemAnimator.getClass();
        ((AbstractC0618v) itemAnimator).setSupportsChangeAnimations(false);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m79839k0(@NotNull tjy memberAdapter) {
        memberAdapter.getClass();
        m79838j0(memberAdapter);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m79840l0(int position, @NotNull List<? extends BLiveVoiceSettle> newData) {
        newData.getClass();
        bnl0.m105524M(get_empty(), newData.size() <= 1);
        bnl0.m105524M(get_recyclerView(), newData.size() > 1);
        if (get_recyclerView().getAdapter() != null) {
            RecyclerView.Adapter adapter = get_recyclerView().getAdapter();
            adapter.getClass();
            ((tjy) adapter).m191469H(position, newData);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m79841m0(boolean empty) {
        bnl0.m105524M(get_empty(), empty);
        bnl0.m105524M(get_recyclerView(), !empty);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79837h0(this);
    }

    public final void setListData(@NotNull List<? extends BLiveVoiceSettle> newData) {
        newData.getClass();
        if (get_recyclerView().getAdapter() != null) {
            RecyclerView.Adapter adapter = get_recyclerView().getAdapter();
            adapter.getClass();
            ((tjy) adapter).m191470I(newData);
        }
    }

    public final void set_empty(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._empty = vLinear;
    }

    public final void set_empty_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._empty_icon = vImage;
    }

    public final void set_empty_text(@NotNull VText vText) {
        vText.getClass();
        this._empty_text = vText;
    }

    public final void set_recyclerView(@NotNull VRecyclerView vRecyclerView) {
        vRecyclerView.getClass();
        this._recyclerView = vRecyclerView;
    }

    public final void set_rootView(@NotNull MemberRequestSettleInView memberRequestSettleInView) {
        memberRequestSettleInView.getClass();
        this._rootView = memberRequestSettleInView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MemberRequestSettleInView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ MemberRequestSettleInView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
