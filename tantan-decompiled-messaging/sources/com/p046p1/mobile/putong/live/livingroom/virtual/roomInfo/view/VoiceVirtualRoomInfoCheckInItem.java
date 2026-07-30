package com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraData;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomProfile;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSettleUser;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VoiceVirtualRoomInfoCheckInItem;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.p4p0;
import p149l.q4p0;
import p149l.s7p0;
import p149l.v25;
import p149l.w7p0;
import p149l.w8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001f\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001b\u0010E\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D¨\u0006F"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoCheckInItem;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "r", "()V", "onFinishInflate", "Lcom/p1/mobile/putong/live/base/data/BLiveExtraData;", "roomInfo", "Ll/s7p0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "l0", "(Lcom/p1/mobile/putong/live/base/data/BLiveExtraData;Ll/s7p0;)V", "b", "Landroid/view/View;", OMSTemplateModeType.view, "k0", "(Landroid/view/View;)V", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoCheckInItem;", "get_root", "()Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoCheckInItem;", "set_root", "(Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoCheckInItem;)V", "_root", "Lv/VText;", "e", "Lv/VText;", "get_summary", "()Lv/VText;", "set_summary", "(Lv/VText;)V", "_summary", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "get_iv_invite_settle", "()Landroid/widget/ImageView;", "set_iv_invite_settle", "(Landroid/widget/ImageView;)V", "_iv_invite_settle", "Lv/VRecyclerView;", "g", "Lv/VRecyclerView;", "get_recyclerView", "()Lv/VRecyclerView;", "set_recyclerView", "(Lv/VRecyclerView;)V", "_recyclerView", "Lv/VImage;", "h", "Lv/VImage;", "get_go_arrow", "()Lv/VImage;", "set_go_arrow", "(Lv/VImage;)V", "_go_arrow", "Ll/p4p0;", RXScreenCaptureService.KEY_INDEX, "Lkotlin/Lazy;", "getUserAdapter", "()Ll/p4p0;", "userAdapter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class VoiceVirtualRoomInfoCheckInItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VoiceVirtualRoomInfoCheckInItem _root;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _summary;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public ImageView _iv_invite_settle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VRecyclerView _recyclerView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VImage _go_arrow;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy userAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceVirtualRoomInfoCheckInItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.userAdapter = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.t7p0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VoiceVirtualRoomInfoCheckInItem.m77507i0();
            }
        });
    }

    private final p4p0 getUserAdapter() {
        return (p4p0) this.userAdapter.getValue();
    }

    /* JADX INFO: renamed from: h0 */
    public static void m77506h0(s7p0 s7p0Var, View view) {
        s7p0Var.mo124819h1();
    }

    /* JADX INFO: renamed from: i0 */
    public static p4p0 m77507i0() {
        return new p4p0();
    }

    /* JADX INFO: renamed from: j0 */
    public static void m77508j0(s7p0 s7p0Var, BLiveExtraData bLiveExtraData, View view) {
        s7p0Var.mo124812F(bLiveExtraData);
    }

    /* JADX INFO: renamed from: r */
    private final void m77509r() {
        get_recyclerView().setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        get_recyclerView().setAdapter(getUserAdapter());
    }

    /* JADX INFO: renamed from: b */
    public final void m77510b() {
        getUserAdapter().m167399e0();
    }

    @NotNull
    public final VImage get_go_arrow() {
        VImage vImage = this._go_arrow;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_go_arrow");
        return null;
    }

    @NotNull
    public final ImageView get_iv_invite_settle() {
        ImageView imageView = this._iv_invite_settle;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_iv_invite_settle");
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
    public final VoiceVirtualRoomInfoCheckInItem get_root() {
        VoiceVirtualRoomInfoCheckInItem voiceVirtualRoomInfoCheckInItem = this._root;
        if (voiceVirtualRoomInfoCheckInItem != null) {
            return voiceVirtualRoomInfoCheckInItem;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    @NotNull
    public final VText get_summary() {
        VText vText = this._summary;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_summary");
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m77511k0(View view) {
        w7p0.m202058a(this, view);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:17:0x00a6  */
    /* JADX INFO: renamed from: l0 */
    public final void m77512l0(@NotNull final BLiveExtraData roomInfo, @NotNull final s7p0 listener) {
        roomInfo.getClass();
        listener.getClass();
        BLiveVoiceRoomProfile bLiveVoiceRoomProfile = roomInfo.voiceRoomProfile;
        int i = bLiveVoiceRoomProfile.settleMembersLimit;
        int size = bLiveVoiceRoomProfile.settleMembers.size();
        get_summary().setText(w8u.m202219v(R$string.f46775Jk, Integer.valueOf(size), Integer.valueOf(i)));
        List<BLiveVoiceVirtualRoomSettleUser> list = roomInfo.voiceRoomProfile.settleMembers;
        list.getClass();
        List listTake = CollectionsKt.take(list, Math.min(size, 15));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
        int i2 = 0;
        for (Object obj : listTake) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            BLiveVoiceVirtualRoomSettleUser bLiveVoiceVirtualRoomSettleUser = (BLiveVoiceVirtualRoomSettleUser) obj;
            bLiveVoiceVirtualRoomSettleUser.getClass();
            arrayList.add(new v25(i2, bLiveVoiceVirtualRoomSettleUser, listener));
            i2 = i3;
        }
        getUserAdapter().m167400f0(arrayList);
        xdl0.m208329E0(get_go_arrow(), new View.OnClickListener() { // from class: l.u7p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceVirtualRoomInfoCheckInItem.m77508j0(listener, roomInfo, view);
            }
        });
        BLiveVoiceRoomProfile bLiveVoiceRoomProfile2 = roomInfo.voiceRoomProfile;
        if (!bLiveVoiceRoomProfile2.isSettled) {
            String str = bLiveVoiceRoomProfile2.identity;
            str.getClass();
            if (!q4p0.m172949a(str)) {
                String str2 = roomInfo.voiceRoomProfile.identity;
                str2.getClass();
                if (q4p0.m172950b(str2)) {
                    if (listener.mo124820h2()) {
                        xdl0.m208329E0(get_iv_invite_settle(), new View.OnClickListener() { // from class: l.v7p0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                VoiceVirtualRoomInfoCheckInItem.m77506h0(listener, view);
                            }
                        });
                        xdl0.m208344M(get_iv_invite_settle(), true);
                        return;
                    }
                }
            } else if (listener.mo124820h2()) {
                xdl0.m208329E0(get_iv_invite_settle(), new View.OnClickListener() { // from class: l.v7p0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        VoiceVirtualRoomInfoCheckInItem.m77506h0(listener, view);
                    }
                });
                xdl0.m208344M(get_iv_invite_settle(), true);
                return;
            }
        } else if (listener.mo124820h2()) {
            xdl0.m208329E0(get_iv_invite_settle(), new View.OnClickListener() { // from class: l.v7p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VoiceVirtualRoomInfoCheckInItem.m77506h0(listener, view);
                }
            });
            xdl0.m208344M(get_iv_invite_settle(), true);
            return;
        }
        xdl0.m208344M(get_iv_invite_settle(), false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77511k0(this);
        m77509r();
    }

    public final void set_go_arrow(@NotNull VImage vImage) {
        vImage.getClass();
        this._go_arrow = vImage;
    }

    public final void set_iv_invite_settle(@NotNull ImageView imageView) {
        imageView.getClass();
        this._iv_invite_settle = imageView;
    }

    public final void set_recyclerView(@NotNull VRecyclerView vRecyclerView) {
        vRecyclerView.getClass();
        this._recyclerView = vRecyclerView;
    }

    public final void set_root(@NotNull VoiceVirtualRoomInfoCheckInItem voiceVirtualRoomInfoCheckInItem) {
        voiceVirtualRoomInfoCheckInItem.getClass();
        this._root = voiceVirtualRoomInfoCheckInItem;
    }

    public final void set_summary(@NotNull VText vText) {
        vText.getClass();
        this._summary = vText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceVirtualRoomInfoCheckInItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceVirtualRoomInfoCheckInItem(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ VoiceVirtualRoomInfoCheckInItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
