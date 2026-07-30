package com.p046p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.feed.R$string;
import p149l.br10;
import p149l.e30;

/* JADX INFO: loaded from: classes12.dex */
public class MusicMiddleBarView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f39392a;

    /* JADX INFO: renamed from: b */
    public String f39393b;

    public MusicMiddleBarView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m61203b(View view) {
        br10.m103432a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final MusicCenterAct m61204c() {
        return (MusicCenterAct) getContext();
    }

    /* JADX INFO: renamed from: d */
    public final String m61205d(int i) {
        if (i == 0) {
            return m61204c().getString(R$string.f39166w0);
        }
        if (i != 1) {
            return i != 2 ? "" : m61204c().getString(R$string.f39012Z0);
        }
        return m61204c().getString(R$string.f39172x0);
    }

    /* JADX INFO: renamed from: e */
    public final String m61206e(int i) {
        if (i == 0) {
            return "hot";
        }
        if (i != 1) {
            return i != 2 ? "" : "local";
        }
        return "fav";
    }

    /* JADX INFO: renamed from: f */
    public void m61207f(final e30<String> e30Var) {
        setOnClickListener(new View.OnClickListener() { // from class: l.ar10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71226a.m61208g(e30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m61208g(e30 e30Var, View view) {
        e30Var.call(this.f39393b);
    }

    /* JADX INFO: renamed from: h */
    public void m61209h(int i) {
        String strM61206e = m61206e(i);
        this.f39393b = strM61206e;
        boolean zEquals = TextUtils.equals(strM61206e, m61204c().f39363i);
        this.f39392a.setText(m61205d(i));
        this.f39392a.setTextColor(Color.parseColor(zEquals ? "#ff3a00" : "#7c7c7c"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m61203b(this);
    }

    public MusicMiddleBarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicMiddleBarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
