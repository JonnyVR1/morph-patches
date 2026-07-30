package com.p051p1.mobile.putong.live.livingroom.voice.applymanager;

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
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p153l.bnl0;
import p153l.iam;
import p153l.obc0;
import p153l.stn0;
import p153l.utn0;
import p153l.xau;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceLiveApplyManagerEnterViewModel extends FrameLayout implements iam<stn0> {

    /* JADX INFO: renamed from: a */
    public ImageView f53685a;

    /* JADX INFO: renamed from: b */
    public TextView f53686b;

    /* JADX INFO: renamed from: c */
    public TextView f53687c;

    /* JADX INFO: renamed from: d */
    public stn0 f53688d;

    public VoiceLiveApplyManagerEnterViewModel(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m78861d(View view) {
        this.f53688d.m187884T3();
    }

    /* JADX INFO: renamed from: r */
    private void m78862r() {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.ttn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176086a.m78861d(view);
            }
        });
        bnl0.m105524M(this.f53687c, false);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo22061C0() {
        return this.f53688d.act();
    }

    /* JADX INFO: renamed from: b */
    public final void m78863b(View view) {
        utn0.m198067a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(stn0 stn0Var) {
        this.f53688d = stn0Var;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m78865e(boolean z) {
        m78866f(true);
        if (!z && bnl0.m105529O0(this.f53687c)) {
            bnl0.m105524M(this.f53687c, false);
        }
        this.f53685a.setImageResource(z ? obc0.f146287b9 : obc0.f146275a9);
        this.f53686b.setText(z ? xau.m209910t(R$string.f47895Wh) : xau.m209910t(R$string.f48482xf));
    }

    /* JADX INFO: renamed from: f */
    public void m78866f(boolean z) {
        bnl0.m105524M(this, z);
    }

    /* JADX INFO: renamed from: i */
    public boolean m78867i() {
        return bnl0.m105529O0(this.f53687c);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78863b(this);
        m78862r();
    }

    public void setCount(int i) {
        if (i <= 0 || !bnl0.m105529O0(this)) {
            bnl0.m105524M(this.f53687c, false);
        } else {
            bnl0.m105524M(this.f53687c, true);
            this.f53687c.setText(i > 99 ? "99+" : String.valueOf(i));
        }
    }

    public VoiceLiveApplyManagerEnterViewModel(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceLiveApplyManagerEnterViewModel(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
