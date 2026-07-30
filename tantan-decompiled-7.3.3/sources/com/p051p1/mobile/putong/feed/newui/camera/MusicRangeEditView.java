package com.p051p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.p051p1.mobile.putong.feed.newui.camera.widget.MusicRangeSeekView;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import p153l.bnl0;
import p153l.kz10;
import p153l.v020;
import p153l.x20;
import p153l.z20;

/* JADX INFO: loaded from: classes13.dex */
public class MusicRangeEditView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f40242a;

    /* JADX INFO: renamed from: b */
    public ImageView f40243b;

    /* JADX INFO: renamed from: c */
    public MusicRangeSeekView f40244c;

    /* JADX INFO: renamed from: d */
    public kz10 f40245d;

    /* JADX INFO: renamed from: e */
    public x20 f40246e;

    /* JADX INFO: renamed from: f */
    public int f40247f;

    /* JADX INFO: renamed from: g */
    public int f40248g;

    /* JADX INFO: renamed from: h */
    public MusicContent f40249h;

    /* JADX INFO: renamed from: i */
    public Video f40250i;

    /* JADX INFO: renamed from: j */
    public int f40251j;

    /* JADX INFO: renamed from: k */
    public int f40252k;

    public MusicRangeEditView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m62397d(View view) {
        v020.m198879a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m62398e() {
        this.f40244c.setListener(new z20() { // from class: l.s020
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f165657a.m62399f((Integer) obj, (Integer) obj2);
            }
        });
        this.f40243b.setOnClickListener(new View.OnClickListener() { // from class: l.t020
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171443a.m62400g(view);
            }
        });
        this.f40242a.setOnClickListener(new View.OnClickListener() { // from class: l.u020
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176843a.m62401h(view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m62399f(Integer num, Integer num2) {
        this.f40247f = num.intValue();
        this.f40248g = num2.intValue();
        if (NullChecker.m82486a(this.f40245d)) {
            this.f40245d.mo62201a(this.f40247f, this.f40248g);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m62400g(View view) {
        if (NullChecker.m82486a(this.f40245d)) {
            this.f40245d.mo62201a(this.f40247f, this.f40248g);
        }
        bnl0.m105524M(this, false);
        if (NullChecker.m82486a(this.f40246e)) {
            this.f40246e.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m62401h(View view) {
        this.f40247f = this.f40251j;
        this.f40248g = this.f40252k;
        if (NullChecker.m82486a(this.f40245d)) {
            this.f40245d.mo62201a(this.f40251j, this.f40252k);
        }
        bnl0.m105524M(this, false);
        if (NullChecker.m82486a(this.f40246e)) {
            this.f40246e.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m62402i(Video video, MusicContent musicContent, long j) {
        this.f40249h = musicContent;
        this.f40250i = video;
        this.f40247f = 0;
        this.f40248g = 0;
        this.f40244c.setStartTime(0);
        this.f40244c.setMusicLength(musicContent.length);
        this.f40244c.setVideoLength((int) j);
    }

    /* JADX INFO: renamed from: j */
    public void m62403j() {
        if (this.f40249h == null || this.f40250i == null) {
            return;
        }
        int i = this.f40247f;
        this.f40251j = i;
        this.f40252k = this.f40248g;
        this.f40244c.setStartTime(i);
        bnl0.m105524M(this, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m62397d(this);
        m62398e();
    }

    public void setDismissListener(x20 x20Var) {
        this.f40246e = x20Var;
    }

    public MusicRangeEditView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicRangeEditView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
