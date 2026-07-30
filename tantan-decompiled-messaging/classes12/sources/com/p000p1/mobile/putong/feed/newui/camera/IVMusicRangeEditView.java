package com.p000p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.p000p1.mobile.putong.feed.newui.camera.widget.IVMusicRangeSeekView;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.f30;
import l.xdl0;
import p007l.cr10;
import p007l.f3c0;
import p007l.k5m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class IVMusicRangeEditView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f718a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f719b;

    /* JADX INFO: renamed from: c */
    public ImageView f720c;

    /* JADX INFO: renamed from: d */
    public TextView f721d;

    /* JADX INFO: renamed from: e */
    public ImageView f722e;

    /* JADX INFO: renamed from: f */
    public IVMusicRangeSeekView f723f;

    /* JADX INFO: renamed from: g */
    public TextView f724g;

    /* JADX INFO: renamed from: h */
    public TextView f725h;

    /* JADX INFO: renamed from: i */
    public cr10 f726i;

    /* JADX INFO: renamed from: j */
    public d30 f727j;

    /* JADX INFO: renamed from: k */
    public int f728k;

    /* JADX INFO: renamed from: l */
    public int f729l;

    /* JADX INFO: renamed from: m */
    public int f730m;

    /* JADX INFO: renamed from: n */
    public int f731n;

    /* JADX INFO: renamed from: o */
    public MusicContent f732o;

    /* JADX INFO: renamed from: p */
    public Video f733p;

    public IVMusicRangeEditView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m1862e(View view) {
        k5m.m11391a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m1863f() {
        this.f723f.setListener(new f30() { // from class: l.g5m
            public final void call(Object obj, Object obj2) {
                this.f8363a.m1864g((Integer) obj, (Integer) obj2);
            }
        });
        this.f722e.setOnClickListener(new View.OnClickListener() { // from class: l.h5m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8605a.m1865h(view);
            }
        });
        this.f718a.setOnClickListener(new View.OnClickListener() { // from class: l.i5m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8910a.m1866i(view);
            }
        });
        this.f720c.setOnClickListener(new View.OnClickListener() { // from class: l.j5m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9234a.m1867j(view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m1864g(Integer num, Integer num2) {
        this.f728k = num.intValue();
        this.f729l = num2.intValue();
        int i = this.f730m;
        int i2 = this.f728k;
        ImageView imageView = this.f722e;
        if (i != i2) {
            imageView.setImageResource(f3c0.f7593D5);
        } else {
            imageView.setImageResource(f3c0.f7601E5);
        }
        if (NullChecker.a(this.f726i)) {
            this.f726i.mo1947a(this.f728k, this.f729l);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m1865h(View view) {
        this.f730m = this.f728k;
        this.f731n = this.f729l;
        if (NullChecker.a(this.f726i)) {
            this.f726i.mo1947a(this.f730m, this.f731n);
        }
        if (NullChecker.a(this.f727j)) {
            this.f727j.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m1866i(View view) {
        if (NullChecker.a(this.f727j)) {
            this.f727j.call();
        }
        if (NullChecker.a(this.f726i)) {
            this.f726i.mo1947a(this.f730m, this.f731n);
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m1867j(View view) {
        if (NullChecker.a(this.f726i)) {
            this.f726i.mo1947a(this.f730m, this.f731n);
        }
        if (NullChecker.a(this.f727j)) {
            this.f727j.call();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m1868k(Video video, MusicContent musicContent, long j) {
        this.f732o = musicContent;
        this.f733p = video;
        this.f730m = 0;
        this.f731n = 0;
        this.f721d.setText(musicContent.name);
        xdl0.z(this.f721d);
        this.f725h.setText(String.format("已选取%s秒音频", Long.valueOf(video.length / 1000)));
        this.f723f.setStartTime(0);
        this.f723f.setMusicLength(musicContent.length);
        this.f723f.setVideoLength((int) j);
    }

    /* JADX INFO: renamed from: l */
    public void m1869l() {
        if (this.f732o == null || this.f733p == null) {
            return;
        }
        this.f723f.setStartTime(this.f730m);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1862e(this);
        m1863f();
    }

    public void setDismissListener(d30 d30Var) {
        this.f727j = d30Var;
    }

    public IVMusicRangeEditView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IVMusicRangeEditView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
