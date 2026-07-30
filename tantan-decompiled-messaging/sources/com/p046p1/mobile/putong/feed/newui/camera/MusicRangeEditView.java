package com.p046p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.p046p1.mobile.putong.feed.newui.camera.widget.MusicRangeSeekView;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import p149l.cr10;
import p149l.d30;
import p149l.f30;
import p149l.ns10;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class MusicRangeEditView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f39394a;

    /* JADX INFO: renamed from: b */
    public ImageView f39395b;

    /* JADX INFO: renamed from: c */
    public MusicRangeSeekView f39396c;

    /* JADX INFO: renamed from: d */
    public cr10 f39397d;

    /* JADX INFO: renamed from: e */
    public d30 f39398e;

    /* JADX INFO: renamed from: f */
    public int f39399f;

    /* JADX INFO: renamed from: g */
    public int f39400g;

    /* JADX INFO: renamed from: h */
    public MusicContent f39401h;

    /* JADX INFO: renamed from: i */
    public Video f39402i;

    /* JADX INFO: renamed from: j */
    public int f39403j;

    /* JADX INFO: renamed from: k */
    public int f39404k;

    public MusicRangeEditView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m61213d(View view) {
        ns10.m160756a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m61214e() {
        this.f39396c.setListener(new f30() { // from class: l.ks10
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f124410a.m61215f((Integer) obj, (Integer) obj2);
            }
        });
        this.f39395b.setOnClickListener(new View.OnClickListener() { // from class: l.ls10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129799a.m61216g(view);
            }
        });
        this.f39394a.setOnClickListener(new View.OnClickListener() { // from class: l.ms10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135436a.m61217h(view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m61215f(Integer num, Integer num2) {
        this.f39399f = num.intValue();
        this.f39400g = num2.intValue();
        if (NullChecker.m81303a(this.f39397d)) {
            this.f39397d.mo61017a(this.f39399f, this.f39400g);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m61216g(View view) {
        if (NullChecker.m81303a(this.f39397d)) {
            this.f39397d.mo61017a(this.f39399f, this.f39400g);
        }
        xdl0.m208344M(this, false);
        if (NullChecker.m81303a(this.f39398e)) {
            this.f39398e.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m61217h(View view) {
        this.f39399f = this.f39403j;
        this.f39400g = this.f39404k;
        if (NullChecker.m81303a(this.f39397d)) {
            this.f39397d.mo61017a(this.f39403j, this.f39404k);
        }
        xdl0.m208344M(this, false);
        if (NullChecker.m81303a(this.f39398e)) {
            this.f39398e.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m61218i(Video video, MusicContent musicContent, long j) {
        this.f39401h = musicContent;
        this.f39402i = video;
        this.f39399f = 0;
        this.f39400g = 0;
        this.f39396c.setStartTime(0);
        this.f39396c.setMusicLength(musicContent.length);
        this.f39396c.setVideoLength((int) j);
    }

    /* JADX INFO: renamed from: j */
    public void m61219j() {
        if (this.f39401h == null || this.f39402i == null) {
            return;
        }
        int i = this.f39399f;
        this.f39403j = i;
        this.f39404k = this.f39400g;
        this.f39396c.setStartTime(i);
        xdl0.m208344M(this, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m61213d(this);
        m61214e();
    }

    public void setDismissListener(d30 d30Var) {
        this.f39398e = d30Var;
    }

    public MusicRangeEditView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicRangeEditView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
