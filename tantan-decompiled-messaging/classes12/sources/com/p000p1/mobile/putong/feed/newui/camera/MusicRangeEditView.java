package com.p000p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MusicRangeSeekView;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.f30;
import l.xdl0;
import p007l.cr10;
import p007l.ns10;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MusicRangeEditView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f855a;

    /* JADX INFO: renamed from: b */
    public ImageView f856b;

    /* JADX INFO: renamed from: c */
    public MusicRangeSeekView f857c;

    /* JADX INFO: renamed from: d */
    public cr10 f858d;

    /* JADX INFO: renamed from: e */
    public d30 f859e;

    /* JADX INFO: renamed from: f */
    public int f860f;

    /* JADX INFO: renamed from: g */
    public int f861g;

    /* JADX INFO: renamed from: h */
    public MusicContent f862h;

    /* JADX INFO: renamed from: i */
    public Video f863i;

    /* JADX INFO: renamed from: j */
    public int f864j;

    /* JADX INFO: renamed from: k */
    public int f865k;

    public MusicRangeEditView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m2149d(View view) {
        ns10.m12303a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m2150e() {
        this.f857c.setListener(new f30() { // from class: l.ks10
            public final void call(Object obj, Object obj2) {
                this.f9783a.m2151f((Integer) obj, (Integer) obj2);
            }
        });
        this.f856b.setOnClickListener(new View.OnClickListener() { // from class: l.ls10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10126a.m2152g(view);
            }
        });
        this.f855a.setOnClickListener(new View.OnClickListener() { // from class: l.ms10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10551a.m2153h(view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m2151f(Integer num, Integer num2) {
        this.f860f = num.intValue();
        this.f861g = num2.intValue();
        if (NullChecker.a(this.f858d)) {
            this.f858d.mo1947a(this.f860f, this.f861g);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m2152g(View view) {
        if (NullChecker.a(this.f858d)) {
            this.f858d.mo1947a(this.f860f, this.f861g);
        }
        xdl0.M(this, false);
        if (NullChecker.a(this.f859e)) {
            this.f859e.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m2153h(View view) {
        this.f860f = this.f864j;
        this.f861g = this.f865k;
        if (NullChecker.a(this.f858d)) {
            this.f858d.mo1947a(this.f864j, this.f865k);
        }
        xdl0.M(this, false);
        if (NullChecker.a(this.f859e)) {
            this.f859e.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m2154i(Video video, MusicContent musicContent, long j) {
        this.f862h = musicContent;
        this.f863i = video;
        this.f860f = 0;
        this.f861g = 0;
        this.f857c.setStartTime(0);
        this.f857c.setMusicLength(musicContent.length);
        this.f857c.setVideoLength((int) j);
    }

    /* JADX INFO: renamed from: j */
    public void m2155j() {
        if (this.f862h == null || this.f863i == null) {
            return;
        }
        int i = this.f860f;
        this.f864j = i;
        this.f865k = this.f861g;
        this.f857c.setStartTime(i);
        xdl0.M(this, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2149d(this);
        m2150e();
    }

    public void setDismissListener(d30 d30Var) {
        this.f859e = d30Var;
    }

    public MusicRangeEditView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicRangeEditView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
