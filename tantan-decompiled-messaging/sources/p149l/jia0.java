package p149l;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.LoopSelectFillData;
import java.util.ArrayList;
import p147v.VImage;
import p147v.VList;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes4.dex */
public class jia0 implements s7m<hia0> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f118074a;

    /* JADX INFO: renamed from: b */
    public VList f118075b;

    /* JADX INFO: renamed from: c */
    public Context f118076c;

    /* JADX INFO: renamed from: d */
    public C17789b f118077d;

    /* JADX INFO: renamed from: e */
    public hia0 f118078e;

    /* JADX INFO: renamed from: l.jia0$a */
    public class C17788a implements AdapterView.OnItemClickListener {
        public C17788a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            jia0.this.f118078e.m131248n0(i);
        }
    }

    /* JADX INFO: renamed from: l.jia0$b */
    public class C17789b extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public ArrayList<LoopSelectFillData> f118080a = new ArrayList<>();

        public C17789b() {
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoopSelectFillData getItem(int i) {
            return this.f118080a.get(i);
        }

        /* JADX INFO: renamed from: b */
        public void m141649b(ArrayList<LoopSelectFillData> arrayList) {
            this.f118080a.clear();
            this.f118080a.addAll(arrayList);
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f118080a.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            C17790c c17790c;
            if (view == null) {
                view = LayoutInflater.from(jia0.this.act()).inflate(n6c0.f137285A, viewGroup, false);
                c17790c = jia0.this.new C17790c();
                c17790c.f118082a = (TextView) view.findViewById(a5c0.f67671Y);
                c17790c.f118083b = (ImageView) view.findViewById(a5c0.f67673a);
                c17790c.f118084c = (VImage) view.findViewById(a5c0.f67677c);
                c17790c.f118085d = view.findViewById(a5c0.f67702y);
                view.setTag(a5c0.f67703z, c17790c);
            } else {
                c17790c = (C17790c) view.getTag(a5c0.f67703z);
            }
            LoopSelectFillData item = getItem(i);
            c17790c.f118082a.setTextColor(jia0.this.act().getResources().getColor(c1c0.f78252i));
            boolean zM51579e = item.m51579e();
            TextView textView = c17790c.f118082a;
            if (zM51579e) {
                textView.setTypeface(Typeface.defaultFromStyle(1));
            } else {
                textView.setTypeface(Typeface.defaultFromStyle(0));
            }
            xdl0.m208344M(c17790c.f118083b, item.m51579e());
            c17790c.f118082a.setText(item.m51577c());
            xdl0.m208344M(c17790c.f118084c, !item.m51579e());
            c17790c.f118084c.setImageResource(item.m51580f() ? e3c0.f89111h : e3c0.f89107g);
            if (item.m51580f()) {
                c17790c.f118082a.setTextColor(jia0.this.act().getResources().getColor(c1c0.f78249f));
            }
            return view;
        }
    }

    /* JADX INFO: renamed from: l.jia0$c */
    public class C17790c {

        /* JADX INFO: renamed from: a */
        public TextView f118082a;

        /* JADX INFO: renamed from: b */
        public ImageView f118083b;

        /* JADX INFO: renamed from: c */
        public VImage f118084c;

        /* JADX INFO: renamed from: d */
        public View f118085d;

        public C17790c() {
        }
    }

    public jia0(Context context) {
        this.f118076c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m141642e(View view) {
        this.f118078e.m131244g0();
    }

    /* JADX INFO: renamed from: r */
    private void m141643r() {
        this.f118074a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.iia0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113382a.m141642e(view);
            }
        });
        C17789b c17789b = new C17789b();
        this.f118077d = c17789b;
        this.f118075b.setAdapter((ListAdapter) c17789b);
        this.f118075b.setOnItemClickListener(new C17788a());
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f118076c;
    }

    /* JADX INFO: renamed from: c */
    public View m141644c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kia0.m146056b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(hia0 hia0Var) {
        this.f118078e = hia0Var;
    }

    /* JADX INFO: renamed from: f */
    public void m141646f(ArrayList<LoopSelectFillData> arrayList) {
        this.f118077d.m141649b(arrayList);
    }

    /* JADX INFO: renamed from: i */
    public void m141647i(String str) {
        this.f118074a.setTitle(str);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM141644c = m141644c(layoutInflater, viewGroup);
        m141643r();
        return viewM141644c;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
