package com.vivo.push.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: renamed from: com.vivo.push.util.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C14640i implements BaseNotifyLayoutAdapter {

    /* JADX INFO: renamed from: a */
    private Resources f61112a;

    /* JADX INFO: renamed from: b */
    private String f61113b;

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final int getNotificationLayout() {
        return this.f61112a.getIdentifier("push_notify", "layout", this.f61113b);
    }

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final int getSuitIconId() {
        if (C14641j.f61116c) {
            return this.f61112a.getIdentifier("notify_icon_rom30", "id", this.f61113b);
        }
        boolean z = C14641j.f61115b;
        Resources resources = this.f61112a;
        return z ? resources.getIdentifier("notify_icon_rom20", "id", this.f61113b) : resources.getIdentifier("notify_icon", "id", this.f61113b);
    }

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final int getTitleColor() {
        int iIntValue;
        try {
            iIntValue = ((Integer) C14657z.m85056a("com.android.internal.R$color", "vivo_notification_title_text_color")).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            iIntValue = 0;
        }
        if (iIntValue > 0) {
            return this.f61112a.getColor(iIntValue);
        }
        boolean z = C14641j.f61116c;
        if (z) {
            return -1;
        }
        if (!C14641j.f61115b) {
            return RoundedDrawable.DEFAULT_BORDER_COLOR;
        }
        if (z) {
            return Color.parseColor("#ff999999");
        }
        return -1;
    }

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final void init(Context context) {
        this.f61113b = context.getPackageName();
        this.f61112a = context.getResources();
    }
}
