package com.p051p1.mobile.putong.live.livingroom.increment.gift.receivegift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VFrame;
import p151v.VText;
import p153l.cqj;
import p153l.qa00;
import p153l.vnc0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u001b\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006,"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftAudienceView;", "Lv/VFrame;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Ll/cqj;", "extraInfo", BLiveStormDanmakuGiftResourceType.f45294s, "(Ll/cqj;)V", "Landroid/view/View;", OMSTemplateModeType.view, "p", "(Landroid/view/View;)V", "a", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftAudienceView;", "get_root", "()Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftAudienceView;", "set_root", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftAudienceView;)V", "_root", "Lcom/p1/mobile/putong/live/livingroom/common/avatar/CommonAnimMaskAvatarView;", "b", "Lcom/p1/mobile/putong/live/livingroom/common/avatar/CommonAnimMaskAvatarView;", "get_head", "()Lcom/p1/mobile/putong/live/livingroom/common/avatar/CommonAnimMaskAvatarView;", "set_head", "(Lcom/p1/mobile/putong/live/livingroom/common/avatar/CommonAnimMaskAvatarView;)V", "_head", "Lv/VText;", "c", "Lv/VText;", "get_name", "()Lv/VText;", "set_name", "(Lv/VText;)V", "_name", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ReceiveGiftAudienceView extends VFrame {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public ReceiveGiftAudienceView _root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public CommonAnimMaskAvatarView _head;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _name;

    public /* synthetic */ ReceiveGiftAudienceView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @NotNull
    public final CommonAnimMaskAvatarView get_head() {
        CommonAnimMaskAvatarView commonAnimMaskAvatarView = this._head;
        if (commonAnimMaskAvatarView != null) {
            return commonAnimMaskAvatarView;
        }
        Intrinsics.m88391r("_head");
        return null;
    }

    @NotNull
    public final VText get_name() {
        VText vText = this._name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_name");
        return null;
    }

    @NotNull
    public final ReceiveGiftAudienceView get_root() {
        ReceiveGiftAudienceView receiveGiftAudienceView = this._root;
        if (receiveGiftAudienceView != null) {
            return receiveGiftAudienceView;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75153p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m75153p(View view) {
        vnc0.m201971a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public final void m75154s(@NotNull cqj extraInfo) {
        extraInfo.getClass();
        get_head().setMaskAvatarData(new CommonAnimMaskAvatarView.C12880a().m73297d("context_single_room").m73296c(extraInfo.m111918g().f82885a ? extraInfo.m111918g().f82886b.avatar : extraInfo.m111918g().f82889e.f107999c).m73298e(qa00.f156333t).m73294a());
        get_name().setText(extraInfo.m111918g().f82889e.f107998b);
    }

    public final void set_head(@NotNull CommonAnimMaskAvatarView commonAnimMaskAvatarView) {
        commonAnimMaskAvatarView.getClass();
        this._head = commonAnimMaskAvatarView;
    }

    public final void set_name(@NotNull VText vText) {
        vText.getClass();
        this._name = vText;
    }

    public final void set_root(@NotNull ReceiveGiftAudienceView receiveGiftAudienceView) {
        receiveGiftAudienceView.getClass();
        this._root = receiveGiftAudienceView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ReceiveGiftAudienceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ReceiveGiftAudienceView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ReceiveGiftAudienceView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
