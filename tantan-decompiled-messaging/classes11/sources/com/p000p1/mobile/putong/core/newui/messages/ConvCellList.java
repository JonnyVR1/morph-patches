package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Choreographer;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToLongFunction;
import l.j760;
import l.upa;
import l.vwb;
import l.zvf0;
import p009l.rd6;
import v.VList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConvCellList extends VList {

    /* JADX INFO: renamed from: f */
    public int f3409f;

    /* JADX INFO: renamed from: g */
    public final boolean f3410g;

    /* JADX INFO: renamed from: h */
    public long f3411h;

    /* JADX INFO: renamed from: i */
    public long f3412i;

    /* JADX INFO: renamed from: j */
    public long f3413j;

    /* JADX INFO: renamed from: k */
    public Choreographer.FrameCallback f3414k;

    /* JADX INFO: renamed from: l */
    public final List<Float> f3415l;

    public ConvCellList(Context context) {
        super(context);
        this.f3409f = -1;
        this.f3410g = NullChecker.a(upa.n()) && upa.n().monitorEnable;
        this.f3411h = 0L;
        this.f3412i = 0L;
        this.f3413j = 0L;
        this.f3415l = new ArrayList();
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m4688c(long j) {
        if (this.f3411h != 0) {
            this.f3412i++;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f3413j;
            if (jElapsedRealtime >= 1000) {
                this.f3415l.add(Float.valueOf(this.f3412i / (jElapsedRealtime / 1000.0f)));
                this.f3412i = 0L;
                this.f3413j = SystemClock.elapsedRealtime();
            }
        }
        this.f3411h = j;
        Choreographer.getInstance().postFrameCallback(this.f3414k);
    }

    /* JADX INFO: renamed from: d */
    public void m4689d() {
        if (this.f3410g) {
            rd6.m21505C("ConversationList average start");
            this.f3413j = SystemClock.elapsedRealtime();
            this.f3415l.clear();
            this.f3414k = new Choreographer.FrameCallback() { // from class: l.w26
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    this.f21858a.m4688c(j);
                }
            };
            Choreographer.getInstance().postFrameCallback(this.f3414k);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dispatchDraw(Canvas canvas) {
        int i = this.f3409f;
        if (i >= 0) {
            canvas.clipRect(0, i, canvas.getWidth(), canvas.getHeight());
        }
        super/*android.view.View*/.dispatchDraw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public void m4690e() {
        if (this.f3410g) {
            rd6.m21505C("ConversationList average stop");
            if (this.f3414k != null) {
                Choreographer.getInstance().removeFrameCallback(this.f3414k);
            }
            this.f3411h = 0L;
            this.f3412i = 0L;
            this.f3413j = 0L;
            if (vwb.J(this.f3415l)) {
                return;
            }
            zvf0.w("e_conversation_list_frame", "p_messages_view", new j760[]{vwb.Y("frame_average", Double.valueOf(this.f3415l.stream().mapToLong(new ToLongFunction() { // from class: l.v26
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return ((Float) obj).longValue();
                }
            }).summaryStatistics().getAverage()))});
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setClipHeight(int i) {
        if (this.f3409f != i) {
            this.f3409f = i;
            invalidate();
        }
    }

    public ConvCellList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3409f = -1;
        this.f3410g = NullChecker.a(upa.n()) && upa.n().monitorEnable;
        this.f3411h = 0L;
        this.f3412i = 0L;
        this.f3413j = 0L;
        this.f3415l = new ArrayList();
    }

    public ConvCellList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3409f = -1;
        this.f3410g = NullChecker.a(upa.n()) && upa.n().monitorEnable;
        this.f3411h = 0L;
        this.f3412i = 0L;
        this.f3413j = 0L;
        this.f3415l = new ArrayList();
    }
}
