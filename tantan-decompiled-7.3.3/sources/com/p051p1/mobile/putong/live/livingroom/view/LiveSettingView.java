package com.p051p1.mobile.putong.live.livingroom.view;

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
import p151v.VRecyclerView;
import p153l.bnl0;
import p153l.ds3;
import p153l.e80;
import p153l.jyb;
import p153l.qa00;
import p153l.qcj;

/* JADX INFO: loaded from: classes5.dex */
public class LiveSettingView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public ds3 f52895c;

    /* JADX INFO: renamed from: d */
    public final int f52896d;

    /* JADX INFO: renamed from: e */
    public final int f52897e;

    /* JADX INFO: renamed from: f */
    public final int f52898f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.LiveSettingView$a */
    public class C13097a extends GridLayoutManager.AbstractC0554c {
        public C13097a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            List<e80<View>> listM117718y = LiveSettingView.this.f52895c.m117718y();
            int i2 = i + 1;
            if (i2 == listM117718y.size()) {
                return 1;
            }
            final e80<View> e80Var = listM117718y.get(i);
            if (TextUtils.equals(e80Var.mo113886r1(), listM117718y.get(i2).mo113886r1())) {
                return 1;
            }
            return 4 - ((i - jyb.m147476G(listM117718y, new qcj() { // from class: l.ept
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    e80 e80Var2 = (e80) obj;
                    return Boolean.valueOf(TextUtils.equals(e80Var.mo113886r1(), e80Var2.mo113886r1()) && e80Var2.isFirst());
                }
            })) % 4);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.LiveSettingView$b */
    public class C13098b extends RecyclerView.AbstractC0578n {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f52900a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Paint f52901b;

        public C13098b(float f, Paint paint) {
            this.f52900a = f;
            this.f52901b = paint;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            int iM105587w;
            List<e80<View>> listM117718y = LiveSettingView.this.f52895c.m117718y();
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            view.setTag(listM117718y.get(childAdapterPosition));
            int i = LiveSettingView.this.f52897e;
            if (childAdapterPosition >= 4) {
                int i2 = 0;
                while (true) {
                    if (i2 >= 4) {
                        iM105587w = 0;
                        break;
                    } else {
                        if (listM117718y.get(childAdapterPosition - i2).isFirst()) {
                            if (!LiveSettingView.this.m77775L()) {
                                iM105587w = bnl0.m105587w(20.0f);
                                break;
                            } else {
                                iM105587w = LiveSettingView.this.f52896d;
                                break;
                            }
                        }
                        i2++;
                    }
                }
            } else {
                iM105587w = LiveSettingView.this.m77775L() ? LiveSettingView.this.f52896d : bnl0.m105587w(20.0f);
            }
            if (childAdapterPosition < listM117718y.size()) {
                final e80<View> e80Var = listM117718y.get(childAdapterPosition);
                int iM147476G = jyb.m147476G(listM117718y, new qcj() { // from class: l.fpt
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        e80 e80Var2 = (e80) obj;
                        return Boolean.valueOf(TextUtils.equals(e80Var.mo113886r1(), e80Var2.mo113886r1()) && e80Var2.isFirst());
                    }
                });
                int i3 = childAdapterPosition + 1;
                if (i3 < listM117718y.size()) {
                    if (!TextUtils.equals(e80Var.mo113886r1(), listM117718y.get(i3).mo113886r1())) {
                        i = ((3 - ((childAdapterPosition - iM147476G) % 4)) * LiveSettingView.this.f52898f) + LiveSettingView.this.f52897e;
                    }
                }
            }
            rect.set(0, iM105587w, i, 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            if (LiveSettingView.this.m77775L()) {
                int paddingLeft = recyclerView.getPaddingLeft();
                for (int i = 0; i < recyclerView.getChildCount(); i++) {
                    View childAt = recyclerView.getChildAt(i);
                    e80 e80Var = (e80) childAt.getTag();
                    if (e80Var.isFirst()) {
                        canvas.drawText(e80Var.mo113886r1(), paddingLeft, ((childAt.getTop() + this.f52900a) - LiveSettingView.this.f52896d) + bnl0.m105587w(15.0f), this.f52901b);
                    }
                }
            }
        }
    }

    public LiveSettingView(Context context) {
        super(context);
        this.f52896d = bnl0.m105587w(57.0f);
        this.f52897e = bnl0.m105587w(25.0f);
        this.f52898f = ((bnl0.m105592y0() - getPaddingLeft()) - getPaddingRight()) / 4;
    }

    private void init() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 4);
        gridLayoutManager.m3327v(new C13097a());
        setLayoutManager(gridLayoutManager);
        Paint paint = new Paint(1);
        paint.setColor(-2130706433);
        paint.setTextSize(qa00.m175859d(16.0f));
        Rect rect = new Rect();
        paint.getTextBounds("height", 0, 6, rect);
        addItemDecoration(new C13098b(rect.height(), paint));
        setAdapter(this.f52895c);
        setItemAnimator(null);
    }

    /* JADX INFO: renamed from: L */
    public final boolean m77775L() {
        return jyb.m147506f(this.f52895c.m117718y(), new qcj() { // from class: l.dpt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((e80) obj).isFirst());
            }
        }) > 1;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f52895c = new ds3(getContext());
        init();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public ds3 getAdapter() {
        return this.f52895c;
    }

    public LiveSettingView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52896d = bnl0.m105587w(57.0f);
        this.f52897e = bnl0.m105587w(25.0f);
        this.f52898f = ((bnl0.m105592y0() - getPaddingLeft()) - getPaddingRight()) / 4;
    }

    public LiveSettingView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52896d = bnl0.m105587w(57.0f);
        this.f52897e = bnl0.m105587w(25.0f);
        this.f52898f = ((bnl0.m105592y0() - getPaddingLeft()) - getPaddingRight()) / 4;
    }
}
