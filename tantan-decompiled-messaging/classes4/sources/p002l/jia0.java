package p002l;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.LoopSelectFillData;
import java.util.ArrayList;
import l.a5c0;
import l.c1c0;
import l.e3c0;
import l.kia0;
import l.n6c0;
import l.s7m;
import l.xdl0;
import v.VImage;
import v.VList;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jia0 implements s7m<hia0> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f13787a;

    /* JADX INFO: renamed from: b */
    public VList f13788b;

    /* JADX INFO: renamed from: c */
    public Context f13789c;

    /* JADX INFO: renamed from: d */
    public C0635b f13790d;

    /* JADX INFO: renamed from: e */
    public hia0 f13791e;

    /* JADX INFO: renamed from: l.jia0$a */
    public class C0634a implements AdapterView.OnItemClickListener {
        public C0634a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            jia0.this.f13791e.m14384n0(i);
        }
    }

    /* JADX INFO: renamed from: l.jia0$b */
    public class C0635b extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public ArrayList<LoopSelectFillData> f13793a = new ArrayList<>();

        public C0635b() {
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoopSelectFillData getItem(int i) {
            return this.f13793a.get(i);
        }

        /* JADX INFO: renamed from: b */
        public void m15969b(ArrayList<LoopSelectFillData> arrayList) {
            this.f13793a.clear();
            this.f13793a.addAll(arrayList);
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f13793a.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            C0636c c0636c;
            if (view == null) {
                view = LayoutInflater.from(jia0.this.act()).inflate(n6c0.A, viewGroup, false);
                c0636c = jia0.this.new C0636c();
                c0636c.f13795a = (TextView) view.findViewById(a5c0.Y);
                c0636c.f13796b = (ImageView) view.findViewById(a5c0.a);
                c0636c.f13797c = view.findViewById(a5c0.c);
                c0636c.f13798d = view.findViewById(a5c0.y);
                view.setTag(a5c0.z, c0636c);
            } else {
                c0636c = (C0636c) view.getTag(a5c0.z);
            }
            LoopSelectFillData item = getItem(i);
            c0636c.f13795a.setTextColor(jia0.this.act().getResources().getColor(c1c0.i));
            boolean zM2065e = item.m2065e();
            TextView textView = c0636c.f13795a;
            if (zM2065e) {
                textView.setTypeface(Typeface.defaultFromStyle(1));
            } else {
                textView.setTypeface(Typeface.defaultFromStyle(0));
            }
            xdl0.M(c0636c.f13796b, item.m2065e());
            c0636c.f13795a.setText(item.m2063c());
            xdl0.M(c0636c.f13797c, !item.m2065e());
            c0636c.f13797c.setImageResource(item.m2066f() ? e3c0.h : e3c0.g);
            if (item.m2066f()) {
                c0636c.f13795a.setTextColor(jia0.this.act().getResources().getColor(c1c0.f));
            }
            return view;
        }
    }

    /* JADX INFO: renamed from: l.jia0$c */
    public class C0636c {

        /* JADX INFO: renamed from: a */
        public TextView f13795a;

        /* JADX INFO: renamed from: b */
        public ImageView f13796b;

        /* JADX INFO: renamed from: c */
        public VImage f13797c;

        /* JADX INFO: renamed from: d */
        public View f13798d;

        public C0636c() {
        }
    }

    public jia0(Context context) {
        this.f13789c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m15960e(View view) {
        this.f13791e.m14380g0();
    }

    /* JADX INFO: renamed from: r */
    private void m15961r() {
        this.f13787a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.iia0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13262a.m15960e(view);
            }
        });
        C0635b c0635b = new C0635b();
        this.f13790d = c0635b;
        this.f13788b.setAdapter(c0635b);
        this.f13788b.setOnItemClickListener(new C0634a());
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m15962C0() {
        return this.f13789c;
    }

    /* JADX INFO: renamed from: c */
    public View m15963c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kia0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m15967i1(hia0 hia0Var) {
        this.f13791e = hia0Var;
    }

    /* JADX INFO: renamed from: f */
    public void m15965f(ArrayList<LoopSelectFillData> arrayList) {
        this.f13790d.m15969b(arrayList);
    }

    /* JADX INFO: renamed from: i */
    public void m15966i(String str) {
        this.f13787a.setTitle(str);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM15963c = m15963c(layoutInflater, viewGroup);
        m15961r();
        return viewM15963c;
    }

    public void destroy() {
    }
}
