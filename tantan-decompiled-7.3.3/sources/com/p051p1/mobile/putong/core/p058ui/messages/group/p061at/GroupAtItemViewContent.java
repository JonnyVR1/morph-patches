package com.p051p1.mobile.putong.core.p058ui.messages.group.p061at;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.dek;
import p153l.ibc0;
import p153l.jek;
import p153l.uqb0;
import p153l.wdk;
import p153l.ydk;

/* JADX INFO: loaded from: classes3.dex */
public class GroupAtItemViewContent extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f32655a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f32656b;

    /* JADX INFO: renamed from: c */
    public TextView f32657c;

    /* JADX INFO: renamed from: d */
    public TextView f32658d;

    /* JADX INFO: renamed from: e */
    public wdk f32659e;

    /* JADX INFO: renamed from: f */
    public dek f32660f;

    public GroupAtItemViewContent(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m50334b(View view) {
        ydk.m215247a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m50335c(View view) {
        if (NullChecker.m82486a(this.f32659e)) {
            this.f32659e.mo150913a(this.f32660f);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m50336d(dek dekVar, int i) {
        this.f32660f = dekVar;
        bnl0.m105524M(this.f32655a, false);
        bnl0.m105524M(this.f32658d, false);
        if (i == 0) {
            bnl0.m105524M(this.f32655a, true);
            if (dekVar.f88039d) {
                uqb0.f180374G.m127140Z0(this.f32656b, jek.m144578j(dekVar.f88043h));
            } else {
                uqb0.f180374G.m127140Z0(this.f32656b, dekVar.f88038c);
            }
            this.f32657c.setText(dekVar.f88037b);
            return;
        }
        if (i == 1) {
            bnl0.m105524M(this.f32658d, true);
            this.f32658d.setText(dekVar.f88041f);
        } else {
            bnl0.m105524M(this.f32655a, true);
            uqb0.f180374G.m127138Y0(this.f32656b, ibc0.f113806H0);
            this.f32657c.setText(dekVar.f88041f);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50334b(this);
        bnl0.m105509E0(this.f32655a, new View.OnClickListener() { // from class: l.xdk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193605a.m50335c(view);
            }
        });
    }

    public void setItemClickListener(wdk wdkVar) {
        this.f32659e = wdkVar;
    }

    public GroupAtItemViewContent(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GroupAtItemViewContent(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
