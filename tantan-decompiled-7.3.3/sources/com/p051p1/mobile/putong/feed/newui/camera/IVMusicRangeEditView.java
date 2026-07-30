package com.p051p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.p051p1.mobile.putong.feed.newui.camera.widget.IVMusicRangeSeekView;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import p153l.a8m;
import p153l.bnl0;
import p153l.kz10;
import p153l.lbc0;
import p153l.x20;
import p153l.z20;

/* JADX INFO: loaded from: classes13.dex */
public class IVMusicRangeEditView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f40105a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f40106b;

    /* JADX INFO: renamed from: c */
    public ImageView f40107c;

    /* JADX INFO: renamed from: d */
    public TextView f40108d;

    /* JADX INFO: renamed from: e */
    public ImageView f40109e;

    /* JADX INFO: renamed from: f */
    public IVMusicRangeSeekView f40110f;

    /* JADX INFO: renamed from: g */
    public TextView f40111g;

    /* JADX INFO: renamed from: h */
    public TextView f40112h;

    /* JADX INFO: renamed from: i */
    public kz10 f40113i;

    /* JADX INFO: renamed from: j */
    public x20 f40114j;

    /* JADX INFO: renamed from: k */
    public int f40115k;

    /* JADX INFO: renamed from: l */
    public int f40116l;

    /* JADX INFO: renamed from: m */
    public int f40117m;

    /* JADX INFO: renamed from: n */
    public int f40118n;

    /* JADX INFO: renamed from: o */
    public MusicContent f40119o;

    /* JADX INFO: renamed from: p */
    public Video f40120p;

    public IVMusicRangeEditView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m62120e(View view) {
        a8m.m96480a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m62121f() {
        this.f40110f.setListener(new z20() { // from class: l.w7m
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f187770a.m62122g((Integer) obj, (Integer) obj2);
            }
        });
        this.f40109e.setOnClickListener(new View.OnClickListener() { // from class: l.x7m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192733a.m62123h(view);
            }
        });
        this.f40105a.setOnClickListener(new View.OnClickListener() { // from class: l.y7m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197789a.m62124i(view);
            }
        });
        this.f40107c.setOnClickListener(new View.OnClickListener() { // from class: l.z7m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203255a.m62125j(view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m62122g(Integer num, Integer num2) {
        this.f40115k = num.intValue();
        this.f40116l = num2.intValue();
        int i = this.f40117m;
        int i2 = this.f40115k;
        ImageView imageView = this.f40109e;
        if (i != i2) {
            imageView.setImageResource(lbc0.f130828D5);
        } else {
            imageView.setImageResource(lbc0.f130836E5);
        }
        if (NullChecker.m82486a(this.f40113i)) {
            this.f40113i.mo62201a(this.f40115k, this.f40116l);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m62123h(View view) {
        this.f40117m = this.f40115k;
        this.f40118n = this.f40116l;
        if (NullChecker.m82486a(this.f40113i)) {
            this.f40113i.mo62201a(this.f40117m, this.f40118n);
        }
        if (NullChecker.m82486a(this.f40114j)) {
            this.f40114j.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m62124i(View view) {
        if (NullChecker.m82486a(this.f40114j)) {
            this.f40114j.call();
        }
        if (NullChecker.m82486a(this.f40113i)) {
            this.f40113i.mo62201a(this.f40117m, this.f40118n);
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m62125j(View view) {
        if (NullChecker.m82486a(this.f40113i)) {
            this.f40113i.mo62201a(this.f40117m, this.f40118n);
        }
        if (NullChecker.m82486a(this.f40114j)) {
            this.f40114j.call();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m62126k(Video video, MusicContent musicContent, long j) {
        this.f40119o = musicContent;
        this.f40120p = video;
        this.f40117m = 0;
        this.f40118n = 0;
        this.f40108d.setText(musicContent.name);
        bnl0.m105593z(this.f40108d);
        this.f40112h.setText(String.format("已选取%s秒音频", Long.valueOf(video.length / 1000)));
        this.f40110f.setStartTime(0);
        this.f40110f.setMusicLength(musicContent.length);
        this.f40110f.setVideoLength((int) j);
    }

    /* JADX INFO: renamed from: l */
    public void m62127l() {
        if (this.f40119o == null || this.f40120p == null) {
            return;
        }
        this.f40110f.setStartTime(this.f40117m);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m62120e(this);
        m62121f();
    }

    public void setDismissListener(x20 x20Var) {
        this.f40114j = x20Var;
    }

    public IVMusicRangeEditView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IVMusicRangeEditView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
