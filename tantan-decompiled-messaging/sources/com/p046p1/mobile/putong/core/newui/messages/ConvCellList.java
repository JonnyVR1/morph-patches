package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Choreographer;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToLongFunction;
import p147v.VList;
import p149l.rd6;
import p149l.upa;
import p149l.vwb;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConvCellList extends VList {

    /* JADX INFO: renamed from: f */
    public int f24631f;

    /* JADX INFO: renamed from: g */
    public final boolean f24632g;

    /* JADX INFO: renamed from: h */
    public long f24633h;

    /* JADX INFO: renamed from: i */
    public long f24634i;

    /* JADX INFO: renamed from: j */
    public long f24635j;

    /* JADX INFO: renamed from: k */
    public Choreographer.FrameCallback f24636k;

    /* JADX INFO: renamed from: l */
    public final List<Float> f24637l;

    public ConvCellList(Context context) {
        super(context);
        this.f24631f = -1;
        this.f24632g = NullChecker.m81303a(upa.m194787n()) && upa.m194787n().monitorEnable;
        this.f24633h = 0L;
        this.f24634i = 0L;
        this.f24635j = 0L;
        this.f24637l = new ArrayList();
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m40595c(long j) {
        if (this.f24633h != 0) {
            this.f24634i++;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f24635j;
            if (jElapsedRealtime >= 1000) {
                this.f24637l.add(Float.valueOf(this.f24634i / (jElapsedRealtime / 1000.0f)));
                this.f24634i = 0L;
                this.f24635j = SystemClock.elapsedRealtime();
            }
        }
        this.f24633h = j;
        Choreographer.getInstance().postFrameCallback(this.f24636k);
    }

    /* JADX INFO: renamed from: d */
    public void m40596d() {
        if (this.f24632g) {
            rd6.m178864C("ConversationList average start");
            this.f24635j = SystemClock.elapsedRealtime();
            this.f24637l.clear();
            this.f24636k = new Choreographer.FrameCallback() { // from class: l.w26
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    this.f184091a.m40595c(j);
                }
            };
            Choreographer.getInstance().postFrameCallback(this.f24636k);
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i = this.f24631f;
        if (i >= 0) {
            canvas.clipRect(0, i, canvas.getWidth(), canvas.getHeight());
        }
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public void m40597e() {
        if (this.f24632g) {
            rd6.m178864C("ConversationList average stop");
            if (this.f24636k != null) {
                Choreographer.getInstance().removeFrameCallback(this.f24636k);
            }
            this.f24633h = 0L;
            this.f24634i = 0L;
            this.f24635j = 0L;
            if (vwb.m200296J(this.f24637l)) {
                return;
            }
            zvf0.m220401w("e_conversation_list_frame", OMSDialogPositon.p_messages_view, vwb.m200311Y("frame_average", Double.valueOf(this.f24637l.stream().mapToLong(new ToLongFunction() { // from class: l.v26
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return ((Float) obj).longValue();
                }
            }).summaryStatistics().getAverage())));
        }
    }

    public void setClipHeight(int i) {
        if (this.f24631f != i) {
            this.f24631f = i;
            invalidate();
        }
    }

    public ConvCellList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24631f = -1;
        this.f24632g = NullChecker.m81303a(upa.m194787n()) && upa.m194787n().monitorEnable;
        this.f24633h = 0L;
        this.f24634i = 0L;
        this.f24635j = 0L;
        this.f24637l = new ArrayList();
    }

    public ConvCellList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24631f = -1;
        this.f24632g = NullChecker.m81303a(upa.m194787n()) && upa.m194787n().monitorEnable;
        this.f24633h = 0L;
        this.f24634i = 0L;
        this.f24635j = 0L;
        this.f24637l = new ArrayList();
    }
}
