package com.vivo.push.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: renamed from: com.vivo.push.util.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C14788i implements BaseNotifyLayoutAdapter {

    /* JADX INFO: renamed from: a */
    private Resources f61959a;

    /* JADX INFO: renamed from: b */
    private String f61960b;

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final int getNotificationLayout() {
        return this.f61959a.getIdentifier("push_notify", "layout", this.f61960b);
    }

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final int getSuitIconId() {
        if (C14789j.f61963c) {
            return this.f61959a.getIdentifier("notify_icon_rom30", "id", this.f61960b);
        }
        boolean z = C14789j.f61962b;
        Resources resources = this.f61959a;
        return z ? resources.getIdentifier("notify_icon_rom20", "id", this.f61960b) : resources.getIdentifier("notify_icon", "id", this.f61960b);
    }

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final int getTitleColor() {
        int iIntValue;
        try {
            iIntValue = ((Integer) C14805z.m86227a("com.android.internal.R$color", "vivo_notification_title_text_color")).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            iIntValue = 0;
        }
        if (iIntValue > 0) {
            return this.f61959a.getColor(iIntValue);
        }
        boolean z = C14789j.f61963c;
        if (z) {
            return -1;
        }
        if (!C14789j.f61962b) {
            return RoundedDrawable.DEFAULT_BORDER_COLOR;
        }
        if (z) {
            return Color.parseColor("#ff999999");
        }
        return -1;
    }

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final void init(Context context) {
        this.f61960b = context.getPackageName();
        this.f61959a = context.getResources();
    }
}
