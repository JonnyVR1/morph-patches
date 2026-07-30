package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p147v.VDraweeView;
import p149l.hxs;
import p149l.j480;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class PkWinTimesViewInternal extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f51629a;

    /* JADX INFO: renamed from: b */
    public TextView f51630b;

    public PkWinTimesViewInternal(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m76132a(View view) {
        j480.m139617a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m76133b(boolean z, long j) {
        String str = "99+连胜";
        if (!z) {
            if (j < 2) {
                xdl0.m208344M(this, false);
                return;
            }
            hxs.m133406s("context_single_room", this.f51629a, "https://auto.tancdn.com/v1/images/eyJpZCI6IkZOTE9OUklLM0FGSVFaUDQ3N0pCT0UzTURYQUFTTjEyIiwidyI6MjE2LCJoIjo5MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE1ODczNTMxNjk5NTU3MzY4NDB9.png");
            if (j <= 99) {
                str = j + "连胜";
            }
            this.f51630b.setText(str);
            xdl0.m208344M(this, true);
            return;
        }
        if (j < 0) {
            xdl0.m208344M(this, true);
            hxs.m133408u("context_single_room", this.f51629a, "https://auto.tancdn.com/v1/images/eyJpZCI6IkJKUkJMQUZET1U1UEVOQVFOQ1JUSU0yNlpKWEhNSDEzIiwidyI6MjE2LCJoIjo5MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjM5MTY4MTgwOTE0Mjg0OTEwMDh9.png", t100.m186890d(72.0f), t100.m186890d(30.0f));
            this.f51630b.setText("连胜终结");
        } else {
            if (j < 2) {
                xdl0.m208344M(this, false);
                return;
            }
            xdl0.m208344M(this, true);
            hxs.m133408u("context_single_room", this.f51629a, "https://auto.tancdn.com/v1/images/eyJpZCI6IkZOTE9OUklLM0FGSVFaUDQ3N0pCT0UzTURYQUFTTjEyIiwidyI6MjE2LCJoIjo5MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE1ODczNTMxNjk5NTU3MzY4NDB9.png", t100.m186890d(72.0f), t100.m186890d(30.0f));
            if (j <= 99) {
                str = j + "连胜";
            }
            this.f51630b.setText(str);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76132a(this);
    }

    public PkWinTimesViewInternal(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PkWinTimesViewInternal(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
