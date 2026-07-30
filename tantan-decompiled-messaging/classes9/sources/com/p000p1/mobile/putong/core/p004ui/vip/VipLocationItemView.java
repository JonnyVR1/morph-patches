package com.p000p1.mobile.putong.core.p004ui.vip;

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
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.vip.VipLocationItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.MessageLocation;
import com.p1.mobile.putong.location.a;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.i0g0;
import l.pjl0;
import p006l.qib0;
import p006l.x2c0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VipLocationItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VipLocationItemView f6846a;

    /* JADX INFO: renamed from: b */
    public ImageView f6847b;

    /* JADX INFO: renamed from: c */
    public VText f6848c;

    /* JADX INFO: renamed from: d */
    public VImage f6849d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.VipLocationItemView$a */
    public interface InterfaceC0382a {
        /* JADX INFO: renamed from: a */
        void mo9716a(MessageLocation messageLocation, VipLocationItemView vipLocationItemView);
    }

    public VipLocationItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m9711a(e30 e30Var, MessageLocation messageLocation, View view) {
        e30Var.call(messageLocation);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m9712b(boolean z, e30 e30Var, MessageLocation messageLocation, View view) {
        if (z || !NullChecker.a(e30Var)) {
            return;
        }
        e30Var.call(messageLocation);
    }

    /* JADX INFO: renamed from: c */
    public final void m9713c(View view) {
        pjl0.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final Act m9714d() {
        return getContext();
    }

    /* JADX INFO: renamed from: e */
    public void m9715e(final MessageLocation messageLocation, final e30<MessageLocation> e30Var, final e30<MessageLocation> e30Var2, InterfaceC0382a interfaceC0382a, final boolean z) {
        if (NullChecker.a(qib0.f19778E.q()) && TextUtils.isEmpty(messageLocation.address)) {
            this.f6848c.setText(i0g0.p((int) Math.round(a.f(messageLocation.coordinates.first, qib0.f19778E.q().u(), messageLocation.coordinates.second, qib0.f19778E.q().x(), 0.0d, 0.0d)), false));
        } else {
            this.f6848c.setText(TextUtils.isEmpty(messageLocation.address) ? m9714d().string(R$string.f1999On) : messageLocation.address);
        }
        if ((TextUtils.isEmpty(messageLocation.name) || TextUtils.isEmpty(messageLocation.address)) && NullChecker.a(interfaceC0382a)) {
            interfaceC0382a.mo9716a(messageLocation, this);
        } else {
            this.f6848c.setText(messageLocation.address);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.njl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VipLocationItemView.m9712b(z, e30Var, messageLocation, view);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ojl0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return VipLocationItemView.m9711a(e30Var2, messageLocation, view);
            }
        });
        VImage vImage = this.f6849d;
        if (z) {
            vImage.setImageDrawable(m9714d().drawable(x2c0.f25689A));
        } else {
            vImage.setImageDrawable(m9714d().drawable(x2c0.f27298z));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9713c(this);
        this.f6848c.setTypeface(Typeface.DEFAULT_BOLD);
        this.f6846a.setBackground(new ColorDrawable(Color.parseColor("#ffffff")));
    }

    public VipLocationItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VipLocationItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
