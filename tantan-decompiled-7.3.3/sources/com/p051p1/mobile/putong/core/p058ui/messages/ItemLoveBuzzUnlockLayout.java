package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.User;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.ux6;
import p153l.z7q;

/* JADX INFO: loaded from: classes3.dex */
public class ItemLoveBuzzUnlockLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f31959a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f31960b;

    /* JADX INFO: renamed from: c */
    public VText f31961c;

    /* JADX INFO: renamed from: d */
    public VText f31962d;

    public ItemLoveBuzzUnlockLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m49476a(View view) {
        z7q.m218915a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m49477b(User user, Message message) {
        CoreModule.f18273l.m143406b().mo36135xp(this.f31960b, ux6.m198403a(user).profileSmall(), 0);
        this.f31961c.setText(String.format(getContext().getString(R$string.f21862x3), "50%"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49476a(this);
    }

    public ItemLoveBuzzUnlockLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemLoveBuzzUnlockLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
