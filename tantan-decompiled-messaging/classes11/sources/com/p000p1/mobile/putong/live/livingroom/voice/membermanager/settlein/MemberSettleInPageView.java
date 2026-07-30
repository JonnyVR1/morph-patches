package com.p000p1.mobile.putong.live.livingroom.voice.membermanager.settlein;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.v;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSettle;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.eey;
import l.t6c0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.way;
import v.VImage;
import v.VLinear;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 D2\u00020\u0001:\u0001EB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006F"}, d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/settlein/MemberSettleInPageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Ll/way;", "memberAdapter", "k0", "(Ll/way;)V", "j0", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceSettle;", "newData", "setListData", "(Ljava/util/List;)V", "", "empty", "l0", "(Z)V", "Landroid/view/View;", "view", "h0", "(Landroid/view/View;)V", "d", "Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/settlein/MemberSettleInPageView;", "get_rootView", "()Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/settlein/MemberSettleInPageView;", "set_rootView", "(Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/settlein/MemberSettleInPageView;)V", "_rootView", "Lv/VRecyclerView;", "e", "Lv/VRecyclerView;", "get_recyclerView", "()Lv/VRecyclerView;", "set_recyclerView", "(Lv/VRecyclerView;)V", "_recyclerView", "Lv/VLinear;", "f", "Lv/VLinear;", "get_empty", "()Lv/VLinear;", "set_empty", "(Lv/VLinear;)V", "_empty", "Lv/VImage;", "g", "Lv/VImage;", "get_empty_icon", "()Lv/VImage;", "set_empty_icon", "(Lv/VImage;)V", "_empty_icon", "Lv/VText;", "h", "Lv/VText;", "get_empty_text", "()Lv/VText;", "set_empty_text", "(Lv/VText;)V", "_empty_text", "Companion", "a", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MemberSettleInPageView extends ConstraintLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public MemberSettleInPageView _rootView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VRecyclerView _recyclerView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VLinear _empty;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VImage _empty_icon;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _empty_text;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.membermanager.settlein.MemberSettleInPageView$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/settlein/MemberSettleInPageView$a;", "", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/settlein/MemberSettleInPageView;", "a", "(Landroid/view/LayoutInflater;)Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/settlein/MemberSettleInPageView;", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final MemberSettleInPageView m8897a(@NotNull LayoutInflater inflater) {
            inflater.getClass();
            Object objInflate = inflater.inflate(t6c0.V3, (ViewGroup) null, false);
            objInflate.getClass();
            return (MemberSettleInPageView) objInflate;
        }

        public Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public MemberSettleInPageView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i0 */
    public static final MemberSettleInPageView m8892i0(@NotNull LayoutInflater layoutInflater) {
        return INSTANCE.m8897a(layoutInflater);
    }

    @NotNull
    public final VLinear get_empty() {
        VLinear vLinear = this._empty;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_empty");
        return null;
    }

    @NotNull
    public final VImage get_empty_icon() {
        VImage vImage = this._empty_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_empty_icon");
        return null;
    }

    @NotNull
    public final VText get_empty_text() {
        VText vText = this._empty_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_empty_text");
        return null;
    }

    @NotNull
    public final VRecyclerView get_recyclerView() {
        VRecyclerView vRecyclerView = this._recyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.r("_recyclerView");
        return null;
    }

    @NotNull
    public final MemberSettleInPageView get_rootView() {
        MemberSettleInPageView memberSettleInPageView = this._rootView;
        if (memberSettleInPageView != null) {
            return memberSettleInPageView;
        }
        Intrinsics.r("_rootView");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m8893h0(View view) {
        eey.a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m8894j0(@NotNull way memberAdapter) {
        memberAdapter.getClass();
        VRecyclerView vRecyclerView = get_recyclerView();
        vRecyclerView.setAdapter(memberAdapter);
        vRecyclerView.setHasFixedSize(true);
        vRecyclerView.setLayoutManager(new LinearLayoutManager(vRecyclerView.getContext()));
        v itemAnimator = vRecyclerView.getItemAnimator();
        itemAnimator.getClass();
        itemAnimator.setSupportsChangeAnimations(false);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m8895k0(@NotNull way memberAdapter) {
        memberAdapter.getClass();
        m8894j0(memberAdapter);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m8896l0(boolean empty) {
        xdl0.M(get_empty(), empty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8893h0(this);
    }

    public final void setListData(@NotNull List<? extends BLiveVoiceSettle> newData) {
        newData.getClass();
        if (get_recyclerView().getAdapter() != null) {
            way adapter = get_recyclerView().getAdapter();
            adapter.getClass();
            adapter.m24041I(newData);
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

    public final void set_rootView(@NotNull MemberSettleInPageView memberSettleInPageView) {
        memberSettleInPageView.getClass();
        this._rootView = memberSettleInPageView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MemberSettleInPageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ MemberSettleInPageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
