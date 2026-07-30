package com.p051p1.mobile.putong.core.p058ui.vip;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.vip.VipLocationItemView;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.location.AbstractC13226a;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VText;
import p153l.dbc0;
import p153l.q8g0;
import p153l.tsl0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class VipLocationItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VipLocationItemView f37913a;

    /* JADX INFO: renamed from: b */
    public ImageView f37914b;

    /* JADX INFO: renamed from: c */
    public VText f37915c;

    /* JADX INFO: renamed from: d */
    public VImage f37916d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.VipLocationItemView$a */
    public interface InterfaceC9109a {
        /* JADX INFO: renamed from: a */
        void mo57465a(MessageLocation messageLocation, VipLocationItemView vipLocationItemView);
    }

    public VipLocationItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m57460a(y20 y20Var, MessageLocation messageLocation, View view) {
        y20Var.call(messageLocation);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m57461b(boolean z, y20 y20Var, MessageLocation messageLocation, View view) {
        if (z || !NullChecker.m82486a(y20Var)) {
            return;
        }
        y20Var.call(messageLocation);
    }

    /* JADX INFO: renamed from: c */
    public final void m57462c(View view) {
        tsl0.m192617a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final Act m57463d() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: e */
    public void m57464e(final MessageLocation messageLocation, final y20<MessageLocation> y20Var, final y20<MessageLocation> y20Var2, InterfaceC9109a interfaceC9109a, final boolean z) {
        if (NullChecker.m82486a(uqb0.f180370E.m80048q()) && TextUtils.isEmpty(messageLocation.address)) {
            this.f37915c.setText(q8g0.m175811p((int) Math.round(AbstractC13226a.m80039f(messageLocation.coordinates.first, uqb0.f180370E.m80048q().m80014u(), messageLocation.coordinates.second, uqb0.f180370E.m80048q().m80016x(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)), false));
        } else {
            this.f37915c.setText(TextUtils.isEmpty(messageLocation.address) ? m57463d().string(R$string.f19439lo) : messageLocation.address);
        }
        if ((TextUtils.isEmpty(messageLocation.name) || TextUtils.isEmpty(messageLocation.address)) && NullChecker.m82486a(interfaceC9109a)) {
            interfaceC9109a.mo57465a(messageLocation, this);
        } else {
            this.f37915c.setText(messageLocation.address);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.rsl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VipLocationItemView.m57461b(z, y20Var, messageLocation, view);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ssl0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return VipLocationItemView.m57460a(y20Var2, messageLocation, view);
            }
        });
        VImage vImage = this.f37916d;
        if (z) {
            vImage.setImageDrawable(m57463d().drawable(dbc0.f86008B));
        } else {
            vImage.setImageDrawable(m57463d().drawable(dbc0.f85976A));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57462c(this);
        this.f37915c.setTypeface(Typeface.DEFAULT_BOLD);
        this.f37913a.setBackground(new ColorDrawable(Color.parseColor("#ffffff")));
    }

    public VipLocationItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VipLocationItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
