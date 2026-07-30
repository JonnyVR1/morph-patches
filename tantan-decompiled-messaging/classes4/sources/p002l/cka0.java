package p002l;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.LoopSelectFillData;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopQuestionAct;
import java.util.ArrayList;
import l.a5c0;
import l.dka0;
import l.e3c0;
import l.eqh0;
import l.lqa;
import l.n6c0;
import l.s7m;
import l.t100;
import l.xdl0;
import v.VList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cka0 implements s7m<bka0> {

    /* JADX INFO: renamed from: a */
    public TextView f8710a;

    /* JADX INFO: renamed from: b */
    public VList f8711b;

    /* JADX INFO: renamed from: c */
    public TextView f8712c;

    /* JADX INFO: renamed from: d */
    public ProfileLoopQuestionAct f8713d;

    /* JADX INFO: renamed from: e */
    public bka0 f8714e;

    /* JADX INFO: renamed from: f */
    public C0514b f8715f;

    /* JADX INFO: renamed from: g */
    public String f8716g;

    /* JADX INFO: renamed from: l.cka0$a */
    public class C0513a implements AdapterView.OnItemClickListener {
        public C0513a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            cka0.this.f8714e.m10414u0(i);
        }
    }

    /* JADX INFO: renamed from: l.cka0$b */
    public class C0514b extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public ArrayList<LoopSelectFillData> f8718a = new ArrayList<>();

        public C0514b() {
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoopSelectFillData getItem(int i) {
            return this.f8718a.get(i);
        }

        /* JADX INFO: renamed from: b */
        public void m11091b(ArrayList<LoopSelectFillData> arrayList) {
            this.f8718a.clear();
            this.f8718a.addAll(arrayList);
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f8718a.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            C0515c c0515c;
            if (view == null) {
                view = LayoutInflater.from(cka0.this.act()).inflate(lqa.w() ? n6c0.B : n6c0.A, viewGroup, false);
                c0515c = cka0.this.new C0515c();
                c0515c.f8720a = (TextView) view.findViewById(a5c0.Y);
                c0515c.f8721b = (ImageView) view.findViewById(a5c0.a);
                view.setTag(a5c0.z, c0515c);
            } else {
                c0515c = (C0515c) view.getTag(a5c0.z);
            }
            LoopSelectFillData item = getItem(i);
            c0515c.f8721b.setImageDrawable(cka0.this.f8713d.getDrawable(e3c0.n1));
            xdl0.M(c0515c.f8721b, item.m2065e() || item.m2066f());
            c0515c.f8720a.setText(item.m2063c());
            c0515c.f8720a.setTypeface(eqh0.c(3), 1);
            return view;
        }
    }

    /* JADX INFO: renamed from: l.cka0$c */
    public class C0515c {

        /* JADX INFO: renamed from: a */
        public TextView f8720a;

        /* JADX INFO: renamed from: b */
        public ImageView f8721b;

        public C0515c() {
        }
    }

    public cka0(ProfileLoopQuestionAct profileLoopQuestionAct) {
        this.f8713d = profileLoopQuestionAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m11082C0() {
        return this.f8713d;
    }

    /* JADX INFO: renamed from: c */
    public View m11083c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dka0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m11088i1(bka0 bka0Var) {
        this.f8714e = bka0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m11085e(ArrayList<LoopSelectFillData> arrayList) {
        this.f8715f.m11091b(arrayList);
    }

    /* JADX INFO: renamed from: f */
    public void m11086f(String str) {
        this.f8716g = str;
    }

    /* JADX INFO: renamed from: i */
    public void m11087i() {
        xdl0.M(this.f8711b, false);
        xdl0.M(this.f8712c, true);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m11083c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m11089r() {
        if (!TextUtils.isEmpty(this.f8716g)) {
            this.f8710a.setText(this.f8716g);
            xdl0.M(this.f8710a, true);
        }
        C0514b c0514b = new C0514b();
        this.f8715f = c0514b;
        this.f8711b.setAdapter(c0514b);
        this.f8711b.setOnItemClickListener(new C0513a());
        this.f8711b.setDivider(new ColorDrawable(0));
        boolean zW = lqa.w();
        VList vList = this.f8711b;
        if (zW) {
            xdl0.f0(vList, t100.y);
            this.f8711b.setDividerHeight(t100.j);
        } else {
            xdl0.f0(vList, t100.m);
            this.f8711b.setDividerHeight(0);
        }
    }

    public void destroy() {
    }
}
