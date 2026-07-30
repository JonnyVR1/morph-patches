package com.p046p1.mobile.putong.live.livingroom.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p147v.VRecyclerView;
import p149l.er3;
import p149l.i80;
import p149l.t100;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class LiveSettingView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public er3 f52047c;

    /* JADX INFO: renamed from: d */
    public final int f52048d;

    /* JADX INFO: renamed from: e */
    public final int f52049e;

    /* JADX INFO: renamed from: f */
    public final int f52050f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.LiveSettingView$a */
    public class C12934a extends GridLayoutManager.AbstractC0553c {
        public C12934a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            List<i80<View>> listM117811y = LiveSettingView.this.f52047c.m117811y();
            int i2 = i + 1;
            if (i2 == listM117811y.size()) {
                return 1;
            }
            final i80<View> i80Var = listM117811y.get(i);
            if (TextUtils.equals(i80Var.mo109668r1(), listM117811y.get(i2).mo109668r1())) {
                return 1;
            }
            return 4 - ((i - vwb.m200293G(listM117811y, new w9j() { // from class: l.cnt
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    i80 i80Var2 = (i80) obj;
                    return Boolean.valueOf(TextUtils.equals(i80Var.mo109668r1(), i80Var2.mo109668r1()) && i80Var2.isFirst());
                }
            })) % 4);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.LiveSettingView$b */
    public class C12935b extends RecyclerView.AbstractC0576n {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f52052a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Paint f52053b;

        public C12935b(float f, Paint paint) {
            this.f52052a = f;
            this.f52053b = paint;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            int iM208407w;
            List<i80<View>> listM117811y = LiveSettingView.this.f52047c.m117811y();
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            view.setTag(listM117811y.get(childAdapterPosition));
            int i = LiveSettingView.this.f52049e;
            if (childAdapterPosition >= 4) {
                int i2 = 0;
                while (true) {
                    if (i2 >= 4) {
                        iM208407w = 0;
                        break;
                    } else {
                        if (listM117811y.get(childAdapterPosition - i2).isFirst()) {
                            if (!LiveSettingView.this.m76592L()) {
                                iM208407w = xdl0.m208407w(20.0f);
                                break;
                            } else {
                                iM208407w = LiveSettingView.this.f52048d;
                                break;
                            }
                        }
                        i2++;
                    }
                }
            } else {
                iM208407w = LiveSettingView.this.m76592L() ? LiveSettingView.this.f52048d : xdl0.m208407w(20.0f);
            }
            if (childAdapterPosition < listM117811y.size()) {
                final i80<View> i80Var = listM117811y.get(childAdapterPosition);
                int iM200293G = vwb.m200293G(listM117811y, new w9j() { // from class: l.dnt
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        i80 i80Var2 = (i80) obj;
                        return Boolean.valueOf(TextUtils.equals(i80Var.mo109668r1(), i80Var2.mo109668r1()) && i80Var2.isFirst());
                    }
                });
                int i3 = childAdapterPosition + 1;
                if (i3 < listM117811y.size()) {
                    if (!TextUtils.equals(i80Var.mo109668r1(), listM117811y.get(i3).mo109668r1())) {
                        i = ((3 - ((childAdapterPosition - iM200293G) % 4)) * LiveSettingView.this.f52050f) + LiveSettingView.this.f52049e;
                    }
                }
            }
            rect.set(0, iM208407w, i, 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            if (LiveSettingView.this.m76592L()) {
                int paddingLeft = recyclerView.getPaddingLeft();
                for (int i = 0; i < recyclerView.getChildCount(); i++) {
                    View childAt = recyclerView.getChildAt(i);
                    i80 i80Var = (i80) childAt.getTag();
                    if (i80Var.isFirst()) {
                        canvas.drawText(i80Var.mo109668r1(), paddingLeft, ((childAt.getTop() + this.f52052a) - LiveSettingView.this.f52048d) + xdl0.m208407w(15.0f), this.f52053b);
                    }
                }
            }
        }
    }

    public LiveSettingView(Context context) {
        super(context);
        this.f52048d = xdl0.m208407w(57.0f);
        this.f52049e = xdl0.m208407w(25.0f);
        this.f52050f = ((xdl0.m208412y0() - getPaddingLeft()) - getPaddingRight()) / 4;
    }

    private void init() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 4);
        gridLayoutManager.m3326v(new C12934a());
        setLayoutManager(gridLayoutManager);
        Paint paint = new Paint(1);
        paint.setColor(-2130706433);
        paint.setTextSize(t100.m186890d(16.0f));
        Rect rect = new Rect();
        paint.getTextBounds("height", 0, 6, rect);
        addItemDecoration(new C12935b(rect.height(), paint));
        setAdapter(this.f52047c);
        setItemAnimator(null);
    }

    /* JADX INFO: renamed from: L */
    public final boolean m76592L() {
        return vwb.m200323f(this.f52047c.m117811y(), new w9j() { // from class: l.bnt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((i80) obj).isFirst());
            }
        }) > 1;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f52047c = new er3(getContext());
        init();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public er3 getAdapter() {
        return this.f52047c;
    }

    public LiveSettingView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52048d = xdl0.m208407w(57.0f);
        this.f52049e = xdl0.m208407w(25.0f);
        this.f52050f = ((xdl0.m208412y0() - getPaddingLeft()) - getPaddingRight()) / 4;
    }

    public LiveSettingView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52048d = xdl0.m208407w(57.0f);
        this.f52049e = xdl0.m208407w(25.0f);
        this.f52050f = ((xdl0.m208412y0() - getPaddingLeft()) - getPaddingRight()) / 4;
    }
}
