package com.p051p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.feed.R$string;
import p153l.jz10;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class MusicMiddleBarView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f40240a;

    /* JADX INFO: renamed from: b */
    public String f40241b;

    public MusicMiddleBarView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m62387b(View view) {
        jz10.m147632a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final MusicCenterAct m62388c() {
        return (MusicCenterAct) getContext();
    }

    /* JADX INFO: renamed from: d */
    public final String m62389d(int i) {
        if (i == 0) {
            return m62388c().getString(R$string.f40014w0);
        }
        if (i != 1) {
            return i != 2 ? "" : m62388c().getString(R$string.f39860Z0);
        }
        return m62388c().getString(R$string.f40020x0);
    }

    /* JADX INFO: renamed from: e */
    public final String m62390e(int i) {
        if (i == 0) {
            return "hot";
        }
        if (i != 1) {
            return i != 2 ? "" : "local";
        }
        return "fav";
    }

    /* JADX INFO: renamed from: f */
    public void m62391f(final y20<String> y20Var) {
        setOnClickListener(new View.OnClickListener() { // from class: l.iz10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117653a.m62392g(y20Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m62392g(y20 y20Var, View view) {
        y20Var.call(this.f40241b);
    }

    /* JADX INFO: renamed from: h */
    public void m62393h(int i) {
        String strM62390e = m62390e(i);
        this.f40241b = strM62390e;
        boolean zEquals = TextUtils.equals(strM62390e, m62388c().f40211i);
        this.f40240a.setText(m62389d(i));
        this.f40240a.setTextColor(Color.parseColor(zEquals ? "#ff3a00" : "#7c7c7c"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m62387b(this);
    }

    public MusicMiddleBarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicMiddleBarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
