package com.p046p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.p046p1.mobile.putong.feed.newui.camera.widget.IVMusicRangeSeekView;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import p149l.cr10;
import p149l.d30;
import p149l.f30;
import p149l.f3c0;
import p149l.k5m;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class IVMusicRangeEditView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f39257a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f39258b;

    /* JADX INFO: renamed from: c */
    public ImageView f39259c;

    /* JADX INFO: renamed from: d */
    public TextView f39260d;

    /* JADX INFO: renamed from: e */
    public ImageView f39261e;

    /* JADX INFO: renamed from: f */
    public IVMusicRangeSeekView f39262f;

    /* JADX INFO: renamed from: g */
    public TextView f39263g;

    /* JADX INFO: renamed from: h */
    public TextView f39264h;

    /* JADX INFO: renamed from: i */
    public cr10 f39265i;

    /* JADX INFO: renamed from: j */
    public d30 f39266j;

    /* JADX INFO: renamed from: k */
    public int f39267k;

    /* JADX INFO: renamed from: l */
    public int f39268l;

    /* JADX INFO: renamed from: m */
    public int f39269m;

    /* JADX INFO: renamed from: n */
    public int f39270n;

    /* JADX INFO: renamed from: o */
    public MusicContent f39271o;

    /* JADX INFO: renamed from: p */
    public Video f39272p;

    public IVMusicRangeEditView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m60936e(View view) {
        k5m.m144542a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m60937f() {
        this.f39262f.setListener(new f30() { // from class: l.g5m
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f101172a.m60938g((Integer) obj, (Integer) obj2);
            }
        });
        this.f39261e.setOnClickListener(new View.OnClickListener() { // from class: l.h5m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105956a.m60939h(view);
            }
        });
        this.f39257a.setOnClickListener(new View.OnClickListener() { // from class: l.i5m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111623a.m60940i(view);
            }
        });
        this.f39259c.setOnClickListener(new View.OnClickListener() { // from class: l.j5m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116332a.m60941j(view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m60938g(Integer num, Integer num2) {
        this.f39267k = num.intValue();
        this.f39268l = num2.intValue();
        int i = this.f39269m;
        int i2 = this.f39267k;
        ImageView imageView = this.f39261e;
        if (i != i2) {
            imageView.setImageResource(f3c0.f94310D5);
        } else {
            imageView.setImageResource(f3c0.f94318E5);
        }
        if (NullChecker.m81303a(this.f39265i)) {
            this.f39265i.mo61017a(this.f39267k, this.f39268l);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m60939h(View view) {
        this.f39269m = this.f39267k;
        this.f39270n = this.f39268l;
        if (NullChecker.m81303a(this.f39265i)) {
            this.f39265i.mo61017a(this.f39269m, this.f39270n);
        }
        if (NullChecker.m81303a(this.f39266j)) {
            this.f39266j.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m60940i(View view) {
        if (NullChecker.m81303a(this.f39266j)) {
            this.f39266j.call();
        }
        if (NullChecker.m81303a(this.f39265i)) {
            this.f39265i.mo61017a(this.f39269m, this.f39270n);
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m60941j(View view) {
        if (NullChecker.m81303a(this.f39265i)) {
            this.f39265i.mo61017a(this.f39269m, this.f39270n);
        }
        if (NullChecker.m81303a(this.f39266j)) {
            this.f39266j.call();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m60942k(Video video, MusicContent musicContent, long j) {
        this.f39271o = musicContent;
        this.f39272p = video;
        this.f39269m = 0;
        this.f39270n = 0;
        this.f39260d.setText(musicContent.name);
        xdl0.m208413z(this.f39260d);
        this.f39264h.setText(String.format("已选取%s秒音频", Long.valueOf(video.length / 1000)));
        this.f39262f.setStartTime(0);
        this.f39262f.setMusicLength(musicContent.length);
        this.f39262f.setVideoLength((int) j);
    }

    /* JADX INFO: renamed from: l */
    public void m60943l() {
        if (this.f39271o == null || this.f39272p == null) {
            return;
        }
        this.f39262f.setStartTime(this.f39269m);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m60936e(this);
        m60937f();
    }

    public void setDismissListener(d30 d30Var) {
        this.f39266j = d30Var;
    }

    public IVMusicRangeEditView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IVMusicRangeEditView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
