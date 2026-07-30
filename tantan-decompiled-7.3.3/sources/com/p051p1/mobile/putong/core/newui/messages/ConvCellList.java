package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Choreographer;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToLongFunction;
import p151v.VList;
import p153l.gra;
import p153l.i4g0;
import p153l.jyb;
import p153l.ue6;

/* JADX INFO: loaded from: classes11.dex */
public class ConvCellList extends VList {

    /* JADX INFO: renamed from: f */
    public int f25373f;

    /* JADX INFO: renamed from: g */
    public final boolean f25374g;

    /* JADX INFO: renamed from: h */
    public long f25375h;

    /* JADX INFO: renamed from: i */
    public long f25376i;

    /* JADX INFO: renamed from: j */
    public long f25377j;

    /* JADX INFO: renamed from: k */
    public Choreographer.FrameCallback f25378k;

    /* JADX INFO: renamed from: l */
    public final List<Float> f25379l;

    public ConvCellList(Context context) {
        super(context);
        this.f25373f = -1;
        this.f25374g = NullChecker.m82486a(gra.m131718n()) && gra.m131718n().monitorEnable;
        this.f25375h = 0L;
        this.f25376i = 0L;
        this.f25377j = 0L;
        this.f25379l = new ArrayList();
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m41606c(long j) {
        if (this.f25375h != 0) {
            this.f25376i++;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f25377j;
            if (jElapsedRealtime >= 1000) {
                this.f25379l.add(Float.valueOf(this.f25376i / (jElapsedRealtime / 1000.0f)));
                this.f25376i = 0L;
                this.f25377j = SystemClock.elapsedRealtime();
            }
        }
        this.f25375h = j;
        Choreographer.getInstance().postFrameCallback(this.f25378k);
    }

    /* JADX INFO: renamed from: d */
    public void m41607d() {
        if (this.f25374g) {
            ue6.m195658C("ConversationList average start");
            this.f25377j = SystemClock.elapsedRealtime();
            this.f25379l.clear();
            this.f25378k = new Choreographer.FrameCallback() { // from class: l.b46
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    this.f74861a.m41606c(j);
                }
            };
            Choreographer.getInstance().postFrameCallback(this.f25378k);
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i = this.f25373f;
        if (i >= 0) {
            canvas.clipRect(0, i, canvas.getWidth(), canvas.getHeight());
        }
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public void m41608e() {
        if (this.f25374g) {
            ue6.m195658C("ConversationList average stop");
            if (this.f25378k != null) {
                Choreographer.getInstance().removeFrameCallback(this.f25378k);
            }
            this.f25375h = 0L;
            this.f25376i = 0L;
            this.f25377j = 0L;
            if (jyb.m147479J(this.f25379l)) {
                return;
            }
            i4g0.m138525w("e_conversation_list_frame", OMSDialogPositon.p_messages_view, jyb.m147494Y("frame_average", Double.valueOf(this.f25379l.stream().mapToLong(new ToLongFunction() { // from class: l.a46
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return ((Float) obj).longValue();
                }
            }).summaryStatistics().getAverage())));
        }
    }

    public void setClipHeight(int i) {
        if (this.f25373f != i) {
            this.f25373f = i;
            invalidate();
        }
    }

    public ConvCellList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25373f = -1;
        this.f25374g = NullChecker.m82486a(gra.m131718n()) && gra.m131718n().monitorEnable;
        this.f25375h = 0L;
        this.f25376i = 0L;
        this.f25377j = 0L;
        this.f25379l = new ArrayList();
    }

    public ConvCellList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25373f = -1;
        this.f25374g = NullChecker.m82486a(gra.m131718n()) && gra.m131718n().monitorEnable;
        this.f25375h = 0L;
        this.f25376i = 0L;
        this.f25377j = 0L;
        this.f25379l = new ArrayList();
    }
}
