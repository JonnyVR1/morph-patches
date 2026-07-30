package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.izs;
import p153l.pc80;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
public class PkWinTimesViewInternal extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f52477a;

    /* JADX INFO: renamed from: b */
    public TextView f52478b;

    public PkWinTimesViewInternal(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m77315a(View view) {
        pc80.m171639a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m77316b(boolean z, long j) {
        String str = "99+连胜";
        if (!z) {
            if (j < 2) {
                bnl0.m105524M(this, false);
                return;
            }
            izs.m142868s("context_single_room", this.f52477a, "https://auto.tancdn.com/v1/images/eyJpZCI6IkZOTE9OUklLM0FGSVFaUDQ3N0pCT0UzTURYQUFTTjEyIiwidyI6MjE2LCJoIjo5MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE1ODczNTMxNjk5NTU3MzY4NDB9.png");
            if (j <= 99) {
                str = j + "连胜";
            }
            this.f52478b.setText(str);
            bnl0.m105524M(this, true);
            return;
        }
        if (j < 0) {
            bnl0.m105524M(this, true);
            izs.m142870u("context_single_room", this.f52477a, "https://auto.tancdn.com/v1/images/eyJpZCI6IkJKUkJMQUZET1U1UEVOQVFOQ1JUSU0yNlpKWEhNSDEzIiwidyI6MjE2LCJoIjo5MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjM5MTY4MTgwOTE0Mjg0OTEwMDh9.png", qa00.m175859d(72.0f), qa00.m175859d(30.0f));
            this.f52478b.setText("连胜终结");
        } else {
            if (j < 2) {
                bnl0.m105524M(this, false);
                return;
            }
            bnl0.m105524M(this, true);
            izs.m142870u("context_single_room", this.f52477a, "https://auto.tancdn.com/v1/images/eyJpZCI6IkZOTE9OUklLM0FGSVFaUDQ3N0pCT0UzTURYQUFTTjEyIiwidyI6MjE2LCJoIjo5MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE1ODczNTMxNjk5NTU3MzY4NDB9.png", qa00.m175859d(72.0f), qa00.m175859d(30.0f));
            if (j <= 99) {
                str = j + "连胜";
            }
            this.f52478b.setText(str);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77315a(this);
    }

    public PkWinTimesViewInternal(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PkWinTimesViewInternal(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
