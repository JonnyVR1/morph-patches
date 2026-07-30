package com.p046p1.mobile.putong.live.livingroom.voice.applymanager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p149l.i3c0;
import p149l.okn0;
import p149l.qkn0;
import p149l.s7m;
import p149l.w8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceLiveApplyManagerEnterViewModel extends FrameLayout implements s7m<okn0> {

    /* JADX INFO: renamed from: a */
    public ImageView f52837a;

    /* JADX INFO: renamed from: b */
    public TextView f52838b;

    /* JADX INFO: renamed from: c */
    public TextView f52839c;

    /* JADX INFO: renamed from: d */
    public okn0 f52840d;

    public VoiceLiveApplyManagerEnterViewModel(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m77678d(View view) {
        this.f52840d.m164877T3();
    }

    /* JADX INFO: renamed from: r */
    private void m77679r() {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.pkn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150011a.m77678d(view);
            }
        });
        xdl0.m208344M(this.f52839c, false);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo21062C0() {
        return this.f52840d.act();
    }

    /* JADX INFO: renamed from: b */
    public final void m77680b(View view) {
        qkn0.m175378a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(okn0 okn0Var) {
        this.f52840d = okn0Var;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m77682e(boolean z) {
        m77683f(true);
        if (!z && xdl0.m208349O0(this.f52839c)) {
            xdl0.m208344M(this.f52839c, false);
        }
        this.f52837a.setImageResource(z ? i3c0.f110959b9 : i3c0.f110947a9);
        this.f52838b.setText(z ? w8u.m202217t(R$string.f47047Wh) : w8u.m202217t(R$string.f47634xf));
    }

    /* JADX INFO: renamed from: f */
    public void m77683f(boolean z) {
        xdl0.m208344M(this, z);
    }

    /* JADX INFO: renamed from: i */
    public boolean m77684i() {
        return xdl0.m208349O0(this.f52839c);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77680b(this);
        m77679r();
    }

    public void setCount(int i) {
        if (i <= 0 || !xdl0.m208349O0(this)) {
            xdl0.m208344M(this.f52839c, false);
        } else {
            xdl0.m208344M(this.f52839c, true);
            this.f52839c.setText(i > 99 ? "99+" : String.valueOf(i));
        }
    }

    public VoiceLiveApplyManagerEnterViewModel(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceLiveApplyManagerEnterViewModel(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
