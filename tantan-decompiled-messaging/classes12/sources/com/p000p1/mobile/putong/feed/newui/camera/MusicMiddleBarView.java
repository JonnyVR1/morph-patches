package com.p000p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.R$string;
import l.e30;
import p007l.br10;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MusicMiddleBarView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f853a;

    /* JADX INFO: renamed from: b */
    public String f854b;

    public MusicMiddleBarView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m2139b(View view) {
        br10.m9022a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final MusicCenterAct m2140c() {
        return (MusicCenterAct) getContext();
    }

    /* JADX INFO: renamed from: d */
    public final String m2141d(int i) {
        if (i == 0) {
            return m2140c().getString(R$string.f627w0);
        }
        if (i != 1) {
            return i != 2 ? "" : m2140c().getString(R$string.f473Z0);
        }
        return m2140c().getString(R$string.f633x0);
    }

    /* JADX INFO: renamed from: e */
    public final String m2142e(int i) {
        if (i == 0) {
            return "hot";
        }
        if (i != 1) {
            return i != 2 ? "" : "local";
        }
        return "fav";
    }

    /* JADX INFO: renamed from: f */
    public void m2143f(final e30<String> e30Var) {
        setOnClickListener(new View.OnClickListener() { // from class: l.ar10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5806a.m2144g(e30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m2144g(e30 e30Var, View view) {
        e30Var.call(this.f854b);
    }

    /* JADX INFO: renamed from: h */
    public void m2145h(int i) {
        String strM2142e = m2142e(i);
        this.f854b = strM2142e;
        boolean zEquals = TextUtils.equals(strM2142e, m2140c().f824i);
        this.f853a.setText(m2141d(i));
        this.f853a.setTextColor(Color.parseColor(zEquals ? "#ff3a00" : "#7c7c7c"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2139b(this);
    }

    public MusicMiddleBarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicMiddleBarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
