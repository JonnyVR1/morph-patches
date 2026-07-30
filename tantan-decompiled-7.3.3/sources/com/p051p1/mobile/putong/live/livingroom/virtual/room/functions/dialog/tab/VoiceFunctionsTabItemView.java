package com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.tab;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceFunctionsDialogTabItemBindings;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bnl0;
import p153l.fgn0;
import p153l.n3d0;
import p153l.n9c0;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/tab/VoiceFunctionsTabItemView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceFunctionsDialogTabItemBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getColor", "()I", "Ll/fgn0;", "model", "", "c", "(Ll/fgn0;)V", "", "isSelected", "b", "(Z)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class VoiceFunctionsTabItemView extends LiveVoiceFunctionsDialogTabItemBindings {
    public /* synthetic */ VoiceFunctionsTabItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final int getColor() {
        return n3d0.m161277a(this.f49174b.isSelected() ? n9c0.f140856p1 : n9c0.f140847m1);
    }

    /* JADX INFO: renamed from: b */
    public final void m78519b(boolean isSelected) {
        this.f49174b.setSelected(isSelected);
        this.f49178f.setTextColor(getColor());
    }

    /* JADX INFO: renamed from: c */
    public final void m78520c(@NotNull fgn0 model) {
        model.getClass();
        bnl0.m105524M(this, true);
        this.f49176d.setImageDrawable(n3d0.m161278b(model.m125507c()));
        this.f49175c.setBackground(n3d0.m161278b(model.m125508d()));
        this.f49178f.setText(model.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
        bnl0.m105524M(this.f49177e, Intrinsics.m88377d(model.getType(), "auction") && !TextUtils.isEmpty(zrv.m221193k().m203677m7()));
        this.f49177e.setText(zrv.m221193k().m203677m7());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceFunctionsTabItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
