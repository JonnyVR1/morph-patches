package com.p051p1.mobile.putong.live.base.arch.card.cardmodel.feed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.jdc0;
import p153l.l9c0;
import p153l.n3d0;
import p153l.vpn0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"¨\u0006&"}, m88121d2 = {"Lcom/p1/mobile/putong/live/base/arch/card/cardmodel/feed/VoiceShipLinkItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Ll/vpn0$a;", "itemData", "", "isWhiteTheme", "a", "(Ll/vpn0$a;Z)V", "Lv/VDraweeView;", "_avatar", "Lv/VDraweeView;", "get_avatar", "()Lv/VDraweeView;", "set_avatar", "(Lv/VDraweeView;)V", "Lv/VText;", "_name", "Lv/VText;", "get_name", "()Lv/VText;", "set_name", "(Lv/VText;)V", "_ship", "get_ship", "set_ship", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class VoiceShipLinkItemView extends LinearLayout {
    public VDraweeView _avatar;
    public VText _name;
    public VText _ship;

    public VoiceShipLinkItemView(@Nullable Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m68650a(@NotNull vpn0.C20899a itemData, boolean isWhiteTheme) {
        itemData.getClass();
        User user = itemData.getUser();
        if (user != null) {
            get_name().setText(user.name);
            List<Media> list = user.pictures;
            list.getClass();
            if (!list.isEmpty()) {
                izs.m142869t("context_livingAct", get_avatar(), user.pictures.get(0).url, bnl0.m105587w(47.0f));
            }
        }
        get_ship().setText(itemData.getFeedItem().relationship);
        get_name().setTextColor(isWhiteTheme ? n3d0.m161277a(l9c0.f130591d) : n3d0.m161277a(l9c0.f130593f));
        get_ship().setTextColor(isWhiteTheme ? n3d0.m161277a(l9c0.f130591d) : n3d0.m161277a(l9c0.f130593f));
    }

    @NotNull
    public final VDraweeView get_avatar() {
        VDraweeView vDraweeView = this._avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_avatar");
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
    public final VText get_ship() {
        VText vText = this._ship;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_ship");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(jdc0.f120203j);
        viewFindViewById.getClass();
        set_avatar((VDraweeView) viewFindViewById);
        View viewFindViewById2 = findViewById(jdc0.f120225q0);
        viewFindViewById2.getClass();
        set_name((VText) viewFindViewById2);
        View viewFindViewById3 = findViewById(jdc0.f120139H0);
        viewFindViewById3.getClass();
        set_ship((VText) viewFindViewById3);
    }

    public final void set_avatar(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._avatar = vDraweeView;
    }

    public final void set_name(@NotNull VText vText) {
        vText.getClass();
        this._name = vText;
    }

    public final void set_ship(@NotNull VText vText) {
        vText.getClass();
        this._ship = vText;
    }

    public VoiceShipLinkItemView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceShipLinkItemView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
