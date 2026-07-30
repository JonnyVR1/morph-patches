package com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.tab;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceFunctionsDialogTabItemBindings;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b7n0;
import p149l.h1c0;
import p149l.kvc0;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/tab/VoiceFunctionsTabItemView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceFunctionsDialogTabItemBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getColor", "()I", "Ll/b7n0;", "model", "", "c", "(Ll/b7n0;)V", "", "isSelected", "b", "(Z)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class VoiceFunctionsTabItemView extends LiveVoiceFunctionsDialogTabItemBindings {
    public /* synthetic */ VoiceFunctionsTabItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final int getColor() {
        return kvc0.m147352a(this.f48326b.isSelected() ? h1c0.f105395p1 : h1c0.f105386m1);
    }

    /* JADX INFO: renamed from: b */
    public final void m77336b(boolean isSelected) {
        this.f48326b.setSelected(isSelected);
        this.f48330f.setTextColor(getColor());
    }

    /* JADX INFO: renamed from: c */
    public final void m77337c(@NotNull b7n0 model) {
        model.getClass();
        xdl0.m208344M(this, true);
        this.f48328d.setImageDrawable(kvc0.m147353b(model.m100688c()));
        this.f48327c.setBackground(kvc0.m147353b(model.m100689d()));
        this.f48330f.setText(model.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
        xdl0.m208344M(this.f48329e, Intrinsics.m87488d(model.getType(), "auction") && !TextUtils.isEmpty(ypv.m215672k().m195890m7()));
        this.f48329e.setText(ypv.m215672k().m195890m7());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceFunctionsTabItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
