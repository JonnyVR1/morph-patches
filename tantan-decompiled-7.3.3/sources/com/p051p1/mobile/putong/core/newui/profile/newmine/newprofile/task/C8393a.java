package com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.task;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.MyTabTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p151v.VFrame;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;
import p153l.bnl0;
import p153l.dbc0;
import p153l.goi0;
import p153l.gra;
import p153l.iam;
import p153l.ibc0;
import p153l.jic0;
import p153l.jyb;
import p153l.kec0;
import p153l.qa00;
import p153l.qni0;
import p153l.rni0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.task.a */
/* JADX INFO: loaded from: classes11.dex */
public class C8393a implements iam<qni0> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f27524a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f27525b;

    /* JADX INFO: renamed from: c */
    public VFrame f27526c;

    /* JADX INFO: renamed from: d */
    public VImage f27527d;

    /* JADX INFO: renamed from: e */
    public VText f27528e;

    /* JADX INFO: renamed from: f */
    public TaskCenterAct f27529f;

    /* JADX INFO: renamed from: g */
    public qni0 f27530g;

    /* JADX INFO: renamed from: h */
    public a f27531h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.task.a$a */
    public static class a extends jic0<MyTabTask> {

        /* JADX INFO: renamed from: c */
        public final List<MyTabTask> f27532c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public final Map<String, MyTabTask> f27533d = new HashMap();

        /* JADX INFO: renamed from: e */
        public final Act f27534e;

        public a(Act act) {
            this.f27534e = act;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int mo29823C() {
            return this.f27532c.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return this.f27534e.inflater().inflate(kec0.f126111w1, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, MyTabTask myTabTask, int i, int i2) {
            ((CommonTaskItemView) view).m44613k(this, myTabTask, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public MyTabTask getItem(int i) {
            return this.f27532c.get(i);
        }

        /* JADX INFO: renamed from: G */
        public boolean m44632G(String str, MyTabTask myTabTask) {
            boolean zEquals = myTabTask.equals(this.f27533d.get(str));
            if (!zEquals) {
                this.f27533d.put(str, myTabTask);
            }
            return zEquals;
        }

        /* JADX INFO: renamed from: H */
        public void m44633H(List<MyTabTask> list) {
            this.f27532c.clear();
            this.f27532c.addAll(list);
            notifyDataSetChanged();
        }
    }

    public C8393a(TaskCenterAct taskCenterAct) {
        this.f27529f = taskCenterAct;
    }

    /* JADX INFO: renamed from: r */
    private void m44623r() {
        this.f27524a.setTitle("任务中心");
        this.f27524a.setLeftIconAsBack(this.f27529f);
        this.f27524a.setBackgroundColor(Color.parseColor("#f7f7f7"));
        if (gra.m131778z()) {
            this.f27524a.setLeftIconResource(ibc0.f113798G1);
        }
        this.f27531h = new a(this.f27529f);
        this.f27525b.setLayoutManager(new LinearLayoutManager(this.f27529f));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.setIntrinsicHeight(qa00.f156323j);
        shapeDrawable.getPaint().setColor(Color.parseColor("#f7f7f7"));
        this.f27525b.addItemDecoration(new goi0(shapeDrawable));
        this.f27525b.setAdapter(this.f27531h);
        m44629f();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f27529f;
    }

    /* JADX INFO: renamed from: a */
    public View m44624a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rni0.m182236b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(qni0 qni0Var) {
        this.f27530g = qni0Var;
    }

    /* JADX INFO: renamed from: c */
    public void m44626c(List<MyTabTask> list) {
        if (jyb.m147479J(list)) {
            m44627d();
        } else {
            m44628e(false);
            this.f27531h.m44633H(list);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m44627d() {
        bnl0.m105524M(this.f27525b, false);
        bnl0.m105524M(this.f27526c, true);
        bnl0.m105524M(this.f27528e, true);
        bnl0.m105524M(this.f27527d, true);
        this.f27527d.setImageResource(dbc0.f86923df);
        this.f27528e.setText("暂时没有更多任务");
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m44628e(boolean z) {
        bnl0.m105524M(this.f27525b, !z);
        bnl0.m105524M(this.f27526c, z);
        if (z) {
            bnl0.m105524M(this.f27528e, true);
            bnl0.m105524M(this.f27527d, true);
            this.f27528e.setText("当前网络不可用");
        }
    }

    /* JADX INFO: renamed from: f */
    public void m44629f() {
        bnl0.m105524M(this.f27525b, false);
        bnl0.m105524M(this.f27526c, true);
        bnl0.m105524M(this.f27528e, true);
        bnl0.m105524M(this.f27527d, false);
        this.f27528e.setText("加载中...");
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM44624a = m44624a(layoutInflater, viewGroup);
        m44623r();
        return viewM44624a;
    }
}
