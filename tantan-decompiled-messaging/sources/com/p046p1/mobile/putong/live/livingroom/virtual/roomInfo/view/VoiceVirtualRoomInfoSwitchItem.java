package com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraData;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VoiceVirtualRoomInfoSwitchItem;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VFrame;
import p147v.VText;
import p149l.h1c0;
import p149l.o9p0;
import p149l.pul0;
import p149l.s7p0;
import p149l.xdl0;
import p149l.xh0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u0017J\r\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\fJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"R\"\u0010)\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006B"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoSwitchItem;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveExtraData;", "roomInfo", "Ll/s7p0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "r0", "(Lcom/p1/mobile/putong/live/base/data/BLiveExtraData;Ll/s7p0;)V", "p0", "", "free", "o0", "(ZLl/s7p0;)V", "checked", "q0", "t0", "u0", "isOpen", "setSwitchOn", "(Z)V", "Landroid/view/View;", OMSTemplateModeType.view, "n0", "(Landroid/view/View;)V", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoSwitchItem;", "get_root", "()Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoSwitchItem;", "set_root", "(Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoSwitchItem;)V", "_root", "Lv/VText;", "e", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "Lv/VFrame;", "f", "Lv/VFrame;", "get_fl_switcher", "()Lv/VFrame;", "set_fl_switcher", "(Lv/VFrame;)V", "_fl_switcher", "Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VirtualSwitchButton;", "g", "Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VirtualSwitchButton;", "get_switcher", "()Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VirtualSwitchButton;", "set_switcher", "(Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VirtualSwitchButton;)V", "_switcher", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class VoiceVirtualRoomInfoSwitchItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VoiceVirtualRoomInfoSwitchItem _root;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VFrame _fl_switcher;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VirtualSwitchButton _switcher;

    public /* synthetic */ VoiceVirtualRoomInfoSwitchItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m77513h0(s7p0 s7p0Var, VoiceVirtualRoomInfoSwitchItem voiceVirtualRoomInfoSwitchItem, View view) {
        s7p0Var.mo124811E0(!voiceVirtualRoomInfoSwitchItem.get_switcher().m77503b());
    }

    /* JADX INFO: renamed from: i0 */
    public static void m77514i0(final VoiceVirtualRoomInfoSwitchItem voiceVirtualRoomInfoSwitchItem, final s7p0 s7p0Var, View view) {
        if (voiceVirtualRoomInfoSwitchItem.get_switcher().m77503b()) {
            s7p0Var.mo124818g2(!voiceVirtualRoomInfoSwitchItem.get_switcher().m77503b());
        } else {
            new xh0.C21150a(voiceVirtualRoomInfoSwitchItem.getContext()).m208740s("设置为私人群？").m208731j("设为私人群后，本群将不会被推荐给其他人。仅入驻成员或通过邀请可进入本群").m208737p(h1c0.f105394p0).m208739r("确认").m208736o(new View.OnClickListener() { // from class: l.n9p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    VoiceVirtualRoomInfoSwitchItem.m77519s0(s7p0Var, voiceVirtualRoomInfoSwitchItem, view2);
                }
            }).m208725d(h1c0.f105343X0).m208727f("取消").m208722a().m208721g();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static void m77516k0(VoiceVirtualRoomInfoSwitchItem voiceVirtualRoomInfoSwitchItem, s7p0 s7p0Var, View view) {
        voiceVirtualRoomInfoSwitchItem.get_switcher().m77505d(!voiceVirtualRoomInfoSwitchItem.get_switcher().m77503b(), true);
        s7p0Var.mo124831y0(voiceVirtualRoomInfoSwitchItem.get_switcher().m77503b());
    }

    /* JADX INFO: renamed from: l0 */
    public static void m77517l0(s7p0 s7p0Var, VoiceVirtualRoomInfoSwitchItem voiceVirtualRoomInfoSwitchItem, View view) {
        s7p0Var.mo124813J1(!voiceVirtualRoomInfoSwitchItem.get_switcher().m77503b());
        pul0.m171461s(voiceVirtualRoomInfoSwitchItem.get_switcher().m77503b());
    }

    /* JADX INFO: renamed from: m0 */
    public static void m77518m0(VoiceVirtualRoomInfoSwitchItem voiceVirtualRoomInfoSwitchItem, s7p0 s7p0Var, View view) {
        voiceVirtualRoomInfoSwitchItem.get_switcher().m77505d(!voiceVirtualRoomInfoSwitchItem.get_switcher().m77503b(), true);
        s7p0Var.mo124814Q(voiceVirtualRoomInfoSwitchItem.get_switcher().m77503b());
    }

    /* JADX INFO: renamed from: s0 */
    public static final void m77519s0(s7p0 s7p0Var, VoiceVirtualRoomInfoSwitchItem voiceVirtualRoomInfoSwitchItem, View view) {
        s7p0Var.mo124818g2(!voiceVirtualRoomInfoSwitchItem.get_switcher().m77503b());
        pul0.m171462t(voiceVirtualRoomInfoSwitchItem.get_switcher().m77503b());
    }

    @NotNull
    public final VFrame get_fl_switcher() {
        VFrame vFrame = this._fl_switcher;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_fl_switcher");
        return null;
    }

    @NotNull
    public final VoiceVirtualRoomInfoSwitchItem get_root() {
        VoiceVirtualRoomInfoSwitchItem voiceVirtualRoomInfoSwitchItem = this._root;
        if (voiceVirtualRoomInfoSwitchItem != null) {
            return voiceVirtualRoomInfoSwitchItem;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    @NotNull
    public final VirtualSwitchButton get_switcher() {
        VirtualSwitchButton virtualSwitchButton = this._switcher;
        if (virtualSwitchButton != null) {
            return virtualSwitchButton;
        }
        Intrinsics.m87502r("_switcher");
        return null;
    }

    @NotNull
    public final VText get_title() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m77520n0(View view) {
        o9p0.m163210a(this, view);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m77521o0(boolean free, @NotNull final s7p0 listener) {
        listener.getClass();
        get_title().setText("上麦免审");
        get_switcher().setCheckedWithoutAnim(free);
        xdl0.m208329E0(get_fl_switcher(), new View.OnClickListener() { // from class: l.j9p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceVirtualRoomInfoSwitchItem.m77513h0(listener, this, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77520n0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m77522p0(@NotNull BLiveExtraData roomInfo, @NotNull final s7p0 listener) {
        roomInfo.getClass();
        listener.getClass();
        get_title().setText("入驻免审");
        get_switcher().setCheckedWithoutAnim(roomInfo.voiceRoomProfile.freeSettle);
        xdl0.m208329E0(get_fl_switcher(), new View.OnClickListener() { // from class: l.i9p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceVirtualRoomInfoSwitchItem.m77517l0(listener, this, view);
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public final void m77523q0(boolean checked, @NotNull final s7p0 listener) {
        listener.getClass();
        get_title().setText("展示送礼特效");
        get_switcher().setCheckedWithoutAnim(checked);
        xdl0.m208329E0(get_fl_switcher(), new View.OnClickListener() { // from class: l.l9p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceVirtualRoomInfoSwitchItem.m77518m0(this.f127135a, listener, view);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final void m77524r0(@NotNull BLiveExtraData roomInfo, @NotNull final s7p0 listener) {
        roomInfo.getClass();
        listener.getClass();
        get_title().setText("设为私密群");
        get_switcher().setCheckedWithoutAnim(roomInfo.voiceRoomProfile.isPersonal);
        xdl0.m208329E0(get_fl_switcher(), new View.OnClickListener() { // from class: l.m9p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceVirtualRoomInfoSwitchItem.m77514i0(this.f132789a, listener, view);
            }
        });
    }

    public final void setSwitchOn(boolean isOpen) {
        get_switcher().m77505d(isOpen, true);
    }

    public final void set_fl_switcher(@NotNull VFrame vFrame) {
        vFrame.getClass();
        this._fl_switcher = vFrame;
    }

    public final void set_root(@NotNull VoiceVirtualRoomInfoSwitchItem voiceVirtualRoomInfoSwitchItem) {
        voiceVirtualRoomInfoSwitchItem.getClass();
        this._root = voiceVirtualRoomInfoSwitchItem;
    }

    public final void set_switcher(@NotNull VirtualSwitchButton virtualSwitchButton) {
        virtualSwitchButton.getClass();
        this._switcher = virtualSwitchButton;
    }

    public final void set_title(@NotNull VText vText) {
        vText.getClass();
        this._title = vText;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m77525t0(boolean checked, @NotNull final s7p0 listener) {
        listener.getClass();
        get_title().setText("置顶聊天");
        get_switcher().setCheckedWithoutAnim(checked);
        xdl0.m208329E0(get_fl_switcher(), new View.OnClickListener() { // from class: l.k9p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceVirtualRoomInfoSwitchItem.m77516k0(this.f122058a, listener, view);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final void m77526u0() {
        get_switcher().setCheckedWithoutAnim(false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceVirtualRoomInfoSwitchItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceVirtualRoomInfoSwitchItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceVirtualRoomInfoSwitchItem(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
