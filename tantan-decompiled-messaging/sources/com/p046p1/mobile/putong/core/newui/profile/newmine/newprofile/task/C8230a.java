package com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.task;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.MyTabTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p147v.VFrame;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;
import p149l.c3c0;
import p149l.dac0;
import p149l.f6c0;
import p149l.gfi0;
import p149l.qei0;
import p149l.rei0;
import p149l.s7m;
import p149l.t100;
import p149l.upa;
import p149l.vwb;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.task.a */
/* JADX INFO: loaded from: classes11.dex */
public class C8230a implements s7m<qei0> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f26676a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f26677b;

    /* JADX INFO: renamed from: c */
    public VFrame f26678c;

    /* JADX INFO: renamed from: d */
    public VImage f26679d;

    /* JADX INFO: renamed from: e */
    public VText f26680e;

    /* JADX INFO: renamed from: f */
    public TaskCenterAct f26681f;

    /* JADX INFO: renamed from: g */
    public qei0 f26682g;

    /* JADX INFO: renamed from: h */
    public a f26683h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.task.a$a */
    public static class a extends dac0<MyTabTask> {

        /* JADX INFO: renamed from: c */
        public final List<MyTabTask> f26684c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public final Map<String, MyTabTask> f26685d = new HashMap();

        /* JADX INFO: renamed from: e */
        public final Act f26686e;

        public a(Act act) {
            this.f26686e = act;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int mo28824C() {
            return this.f26684c.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return this.f26686e.inflater().inflate(f6c0.f96057w1, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, MyTabTask myTabTask, int i, int i2) {
            ((CommonTaskItemView) view).m43427k(this, myTabTask, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public MyTabTask getItem(int i) {
            return this.f26684c.get(i);
        }

        /* JADX INFO: renamed from: G */
        public boolean m43446G(String str, MyTabTask myTabTask) {
            boolean zEquals = myTabTask.equals(this.f26685d.get(str));
            if (!zEquals) {
                this.f26685d.put(str, myTabTask);
            }
            return zEquals;
        }

        /* JADX INFO: renamed from: H */
        public void m43447H(List<MyTabTask> list) {
            this.f26684c.clear();
            this.f26684c.addAll(list);
            notifyDataSetChanged();
        }
    }

    public C8230a(TaskCenterAct taskCenterAct) {
        this.f26681f = taskCenterAct;
    }

    /* JADX INFO: renamed from: r */
    private void m43437r() {
        this.f26676a.setTitle("任务中心");
        this.f26676a.setLeftIconAsBack(this.f26681f);
        this.f26676a.setBackgroundColor(Color.parseColor("#f7f7f7"));
        if (upa.m194847z()) {
            this.f26676a.setLeftIconResource(c3c0.f78523G1);
        }
        this.f26683h = new a(this.f26681f);
        this.f26677b.setLayoutManager(new LinearLayoutManager(this.f26681f));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.setIntrinsicHeight(t100.f167261j);
        shapeDrawable.getPaint().setColor(Color.parseColor("#f7f7f7"));
        this.f26677b.addItemDecoration(new gfi0(shapeDrawable));
        this.f26677b.setAdapter(this.f26683h);
        m43443f();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f26681f;
    }

    /* JADX INFO: renamed from: a */
    public View m43438a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rei0.m179049b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(qei0 qei0Var) {
        this.f26682g = qei0Var;
    }

    /* JADX INFO: renamed from: c */
    public void m43440c(List<MyTabTask> list) {
        if (vwb.m200296J(list)) {
            m43441d();
        } else {
            m43442e(false);
            this.f26683h.m43447H(list);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m43441d() {
        xdl0.m208344M(this.f26677b, false);
        xdl0.m208344M(this.f26678c, true);
        xdl0.m208344M(this.f26680e, true);
        xdl0.m208344M(this.f26679d, true);
        this.f26679d.setImageResource(x2c0.f190457pe);
        this.f26680e.setText("暂时没有更多任务");
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m43442e(boolean z) {
        xdl0.m208344M(this.f26677b, !z);
        xdl0.m208344M(this.f26678c, z);
        if (z) {
            xdl0.m208344M(this.f26680e, true);
            xdl0.m208344M(this.f26679d, true);
            this.f26680e.setText("当前网络不可用");
        }
    }

    /* JADX INFO: renamed from: f */
    public void m43443f() {
        xdl0.m208344M(this.f26677b, false);
        xdl0.m208344M(this.f26678c, true);
        xdl0.m208344M(this.f26680e, true);
        xdl0.m208344M(this.f26679d, false);
        this.f26680e.setText("加载中...");
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM43438a = m43438a(layoutInflater, viewGroup);
        m43437r();
        return viewM43438a;
    }
}
