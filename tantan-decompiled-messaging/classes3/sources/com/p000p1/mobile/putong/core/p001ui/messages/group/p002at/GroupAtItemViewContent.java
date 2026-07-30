package com.p000p1.mobile.putong.core.p001ui.messages.group.p002at;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import l.c3c0;
import l.ibk;
import l.qib0;
import l.xdl0;
import p003l.gbk;
import p003l.nbk;
import p003l.tbk;
import p028v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GroupAtItemViewContent extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f1698a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f1699b;

    /* JADX INFO: renamed from: c */
    public TextView f1700c;

    /* JADX INFO: renamed from: d */
    public TextView f1701d;

    /* JADX INFO: renamed from: e */
    public gbk f1702e;

    /* JADX INFO: renamed from: f */
    public nbk f1703f;

    public GroupAtItemViewContent(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m2268b(View view) {
        ibk.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m2269c(View view) {
        if (NullChecker.a(this.f1702e)) {
            this.f1702e.mo4526a(this.f1703f);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m2270d(nbk nbkVar, int i) {
        this.f1703f = nbkVar;
        xdl0.M(this.f1698a, false);
        xdl0.M(this.f1701d, false);
        if (i == 0) {
            xdl0.M(this.f1698a, true);
            if (nbkVar.f5861d) {
                qib0.G.Z0(this.f1699b, tbk.m7716j(nbkVar.f5865h));
            } else {
                qib0.G.Z0(this.f1699b, nbkVar.f5860c);
            }
            this.f1700c.setText(nbkVar.f5859b);
            return;
        }
        if (i == 1) {
            xdl0.M(this.f1701d, true);
            this.f1701d.setText(nbkVar.f5863f);
        } else {
            xdl0.M(this.f1698a, true);
            qib0.G.Y0(this.f1699b, c3c0.H0);
            this.f1700c.setText(nbkVar.f5863f);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2268b(this);
        xdl0.E0(this.f1698a, new View.OnClickListener() { // from class: l.hbk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4162a.m2269c(view);
            }
        });
    }

    public void setItemClickListener(gbk gbkVar) {
        this.f1702e = gbkVar;
    }

    public GroupAtItemViewContent(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GroupAtItemViewContent(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
