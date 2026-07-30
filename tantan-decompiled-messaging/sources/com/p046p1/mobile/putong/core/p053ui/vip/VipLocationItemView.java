package com.p046p1.mobile.putong.core.p053ui.vip;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.vip.VipLocationItemView;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.location.AbstractC13063a;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VText;
import p149l.e30;
import p149l.i0g0;
import p149l.pjl0;
import p149l.qib0;
import p149l.x2c0;

/* JADX INFO: loaded from: classes9.dex */
public class VipLocationItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VipLocationItemView f37065a;

    /* JADX INFO: renamed from: b */
    public ImageView f37066b;

    /* JADX INFO: renamed from: c */
    public VText f37067c;

    /* JADX INFO: renamed from: d */
    public VImage f37068d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.VipLocationItemView$a */
    public interface InterfaceC8946a {
        /* JADX INFO: renamed from: a */
        void mo56282a(MessageLocation messageLocation, VipLocationItemView vipLocationItemView);
    }

    public VipLocationItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m56277a(e30 e30Var, MessageLocation messageLocation, View view) {
        e30Var.call(messageLocation);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m56278b(boolean z, e30 e30Var, MessageLocation messageLocation, View view) {
        if (z || !NullChecker.m81303a(e30Var)) {
            return;
        }
        e30Var.call(messageLocation);
    }

    /* JADX INFO: renamed from: c */
    public final void m56279c(View view) {
        pjl0.m169909a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final Act m56280d() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: e */
    public void m56281e(final MessageLocation messageLocation, final e30<MessageLocation> e30Var, final e30<MessageLocation> e30Var2, InterfaceC8946a interfaceC8946a, final boolean z) {
        if (NullChecker.m81303a(qib0.f154687E.m78865q()) && TextUtils.isEmpty(messageLocation.address)) {
            this.f37067c.setText(i0g0.m133876p((int) Math.round(AbstractC13063a.m78856f(messageLocation.coordinates.first, qib0.f154687E.m78865q().m78831u(), messageLocation.coordinates.second, qib0.f154687E.m78865q().m78833x(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)), false));
        } else {
            this.f37067c.setText(TextUtils.isEmpty(messageLocation.address) ? m56280d().string(R$string.f18010On) : messageLocation.address);
        }
        if ((TextUtils.isEmpty(messageLocation.name) || TextUtils.isEmpty(messageLocation.address)) && NullChecker.m81303a(interfaceC8946a)) {
            interfaceC8946a.mo56282a(messageLocation, this);
        } else {
            this.f37067c.setText(messageLocation.address);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.njl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VipLocationItemView.m56278b(z, e30Var, messageLocation, view);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ojl0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return VipLocationItemView.m56277a(e30Var2, messageLocation, view);
            }
        });
        VImage vImage = this.f37068d;
        if (z) {
            vImage.setImageDrawable(m56280d().drawable(x2c0.f189153A));
        } else {
            vImage.setImageDrawable(m56280d().drawable(x2c0.f190762z));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56279c(this);
        this.f37067c.setTypeface(Typeface.DEFAULT_BOLD);
        this.f37065a.setBackground(new ColorDrawable(Color.parseColor("#ffffff")));
    }

    public VipLocationItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VipLocationItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
