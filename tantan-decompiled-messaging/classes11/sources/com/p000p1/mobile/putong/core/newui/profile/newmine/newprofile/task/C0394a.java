package com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.task;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.MyTabTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.c3c0;
import l.dac0;
import l.f6c0;
import l.rei0;
import l.s7m;
import l.t100;
import l.upa;
import l.vwb;
import l.x2c0;
import l.xdl0;
import p009l.gfi0;
import p009l.qei0;
import v.VFrame;
import v.VImage;
import v.VRecyclerView;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.task.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0394a implements s7m<qei0> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f5454a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f5455b;

    /* JADX INFO: renamed from: c */
    public VFrame f5456c;

    /* JADX INFO: renamed from: d */
    public VImage f5457d;

    /* JADX INFO: renamed from: e */
    public VText f5458e;

    /* JADX INFO: renamed from: f */
    public TaskCenterAct f5459f;

    /* JADX INFO: renamed from: g */
    public qei0 f5460g;

    /* JADX INFO: renamed from: h */
    public a f5461h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.task.a$a */
    public static class a extends dac0<MyTabTask> {

        /* JADX INFO: renamed from: c */
        public final List<MyTabTask> f5462c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public final Map<String, MyTabTask> f5463d = new HashMap();

        /* JADX INFO: renamed from: e */
        public final Act f5464e;

        public a(Act act) {
            this.f5464e = act;
        }

        /* JADX INFO: renamed from: C */
        public int m7688C() {
            return this.f5462c.size();
        }

        /* JADX INFO: renamed from: D */
        public View m7689D(ViewGroup viewGroup, int i) {
            return this.f5464e.inflater().inflate(f6c0.w1, viewGroup, false);
        }

        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void m7687A(View view, MyTabTask myTabTask, int i, int i2) {
            ((CommonTaskItemView) view).m7666k(this, myTabTask, false);
        }

        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public MyTabTask getItem(int i) {
            return this.f5462c.get(i);
        }

        /* JADX INFO: renamed from: G */
        public boolean m7692G(String str, MyTabTask myTabTask) {
            boolean zEquals = myTabTask.equals(this.f5463d.get(str));
            if (!zEquals) {
                this.f5463d.put(str, myTabTask);
            }
            return zEquals;
        }

        /* JADX INFO: renamed from: H */
        public void m7693H(List<MyTabTask> list) {
            this.f5462c.clear();
            this.f5462c.addAll(list);
            notifyDataSetChanged();
        }
    }

    public C0394a(TaskCenterAct taskCenterAct) {
        this.f5459f = taskCenterAct;
    }

    /* JADX INFO: renamed from: r */
    private void m7678r() {
        this.f5454a.setTitle("任务中心");
        this.f5454a.setLeftIconAsBack(this.f5459f);
        this.f5454a.setBackgroundColor(Color.parseColor("#f7f7f7"));
        if (upa.z()) {
            this.f5454a.setLeftIconResource(c3c0.G1);
        }
        this.f5461h = new a(this.f5459f);
        this.f5455b.setLayoutManager(new LinearLayoutManager(this.f5459f));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.setIntrinsicHeight(t100.j);
        shapeDrawable.getPaint().setColor(Color.parseColor("#f7f7f7"));
        this.f5455b.addItemDecoration(new gfi0(shapeDrawable));
        this.f5455b.setAdapter(this.f5461h);
        m7685f();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m7679C0() {
        return this.f5459f;
    }

    /* JADX INFO: renamed from: a */
    public View m7680a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rei0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m7686i1(qei0 qei0Var) {
        this.f5460g = qei0Var;
    }

    /* JADX INFO: renamed from: c */
    public void m7682c(List<MyTabTask> list) {
        if (vwb.J(list)) {
            m7683d();
        } else {
            m7684e(false);
            this.f5461h.m7693H(list);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m7683d() {
        xdl0.M(this.f5455b, false);
        xdl0.M(this.f5456c, true);
        xdl0.M(this.f5458e, true);
        xdl0.M(this.f5457d, true);
        this.f5457d.setImageResource(x2c0.pe);
        this.f5458e.setText("暂时没有更多任务");
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m7684e(boolean z) {
        xdl0.M(this.f5455b, !z);
        xdl0.M(this.f5456c, z);
        if (z) {
            xdl0.M(this.f5458e, true);
            xdl0.M(this.f5457d, true);
            this.f5458e.setText("当前网络不可用");
        }
    }

    /* JADX INFO: renamed from: f */
    public void m7685f() {
        xdl0.M(this.f5455b, false);
        xdl0.M(this.f5456c, true);
        xdl0.M(this.f5458e, true);
        xdl0.M(this.f5457d, false);
        this.f5458e.setText("加载中...");
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM7680a = m7680a(layoutInflater, viewGroup);
        m7678r();
        return viewM7680a;
    }
}
