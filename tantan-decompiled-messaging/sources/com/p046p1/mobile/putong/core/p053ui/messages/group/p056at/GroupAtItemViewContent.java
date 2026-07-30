package com.p046p1.mobile.putong.core.p053ui.messages.group.p056at;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p149l.c3c0;
import p149l.gbk;
import p149l.ibk;
import p149l.nbk;
import p149l.qib0;
import p149l.tbk;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class GroupAtItemViewContent extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f31807a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f31808b;

    /* JADX INFO: renamed from: c */
    public TextView f31809c;

    /* JADX INFO: renamed from: d */
    public TextView f31810d;

    /* JADX INFO: renamed from: e */
    public gbk f31811e;

    /* JADX INFO: renamed from: f */
    public nbk f31812f;

    public GroupAtItemViewContent(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m49151b(View view) {
        ibk.m135259a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m49152c(View view) {
        if (NullChecker.m81303a(this.f31811e)) {
            this.f31811e.mo125146a(this.f31812f);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m49153d(nbk nbkVar, int i) {
        this.f31812f = nbkVar;
        xdl0.m208344M(this.f31807a, false);
        xdl0.m208344M(this.f31810d, false);
        if (i == 0) {
            xdl0.m208344M(this.f31807a, true);
            if (nbkVar.f138041d) {
                qib0.f154691G.m102356Z0(this.f31808b, tbk.m187863j(nbkVar.f138045h));
            } else {
                qib0.f154691G.m102356Z0(this.f31808b, nbkVar.f138040c);
            }
            this.f31809c.setText(nbkVar.f138039b);
            return;
        }
        if (i == 1) {
            xdl0.m208344M(this.f31810d, true);
            this.f31810d.setText(nbkVar.f138043f);
        } else {
            xdl0.m208344M(this.f31807a, true);
            qib0.f154691G.m102354Y0(this.f31808b, c3c0.f78531H0);
            this.f31809c.setText(nbkVar.f138043f);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49151b(this);
        xdl0.m208329E0(this.f31807a, new View.OnClickListener() { // from class: l.hbk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106941a.m49152c(view);
            }
        });
    }

    public void setItemClickListener(gbk gbkVar) {
        this.f31811e = gbkVar;
    }

    public GroupAtItemViewContent(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GroupAtItemViewContent(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
