package p149l;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
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
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopQuestionAct;
import java.util.ArrayList;
import p147v.VList;

/* JADX INFO: loaded from: classes4.dex */
public class cka0 implements s7m<bka0> {

    /* JADX INFO: renamed from: a */
    public TextView f81309a;

    /* JADX INFO: renamed from: b */
    public VList f81310b;

    /* JADX INFO: renamed from: c */
    public TextView f81311c;

    /* JADX INFO: renamed from: d */
    public ProfileLoopQuestionAct f81312d;

    /* JADX INFO: renamed from: e */
    public bka0 f81313e;

    /* JADX INFO: renamed from: f */
    public C16182b f81314f;

    /* JADX INFO: renamed from: g */
    public String f81315g;

    /* JADX INFO: renamed from: l.cka0$a */
    public class C16181a implements AdapterView.OnItemClickListener {
        public C16181a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            cka0.this.f81313e.m102290u0(i);
        }
    }

    /* JADX INFO: renamed from: l.cka0$b */
    public class C16182b extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public ArrayList<LoopSelectFillData> f81317a = new ArrayList<>();

        public C16182b() {
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoopSelectFillData getItem(int i) {
            return this.f81317a.get(i);
        }

        /* JADX INFO: renamed from: b */
        public void m107395b(ArrayList<LoopSelectFillData> arrayList) {
            this.f81317a.clear();
            this.f81317a.addAll(arrayList);
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f81317a.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            C16183c c16183c;
            if (view == null) {
                view = LayoutInflater.from(cka0.this.act()).inflate(lqa.m150985w() ? n6c0.f137287B : n6c0.f137285A, viewGroup, false);
                c16183c = cka0.this.new C16183c();
                c16183c.f81319a = (TextView) view.findViewById(a5c0.f67671Y);
                c16183c.f81320b = (ImageView) view.findViewById(a5c0.f67673a);
                view.setTag(a5c0.f67703z, c16183c);
            } else {
                c16183c = (C16183c) view.getTag(a5c0.f67703z);
            }
            LoopSelectFillData item = getItem(i);
            c16183c.f81320b.setImageDrawable(cka0.this.f81312d.getDrawable(e3c0.f89131n1));
            xdl0.m208344M(c16183c.f81320b, item.m51579e() || item.m51580f());
            c16183c.f81319a.setText(item.m51577c());
            c16183c.f81319a.setTypeface(eqh0.m117752c(3), 1);
            return view;
        }
    }

    /* JADX INFO: renamed from: l.cka0$c */
    public class C16183c {

        /* JADX INFO: renamed from: a */
        public TextView f81319a;

        /* JADX INFO: renamed from: b */
        public ImageView f81320b;

        public C16183c() {
        }
    }

    public cka0(ProfileLoopQuestionAct profileLoopQuestionAct) {
        this.f81312d = profileLoopQuestionAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f81312d;
    }

    /* JADX INFO: renamed from: c */
    public View m107388c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dka0.m112216b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(bka0 bka0Var) {
        this.f81313e = bka0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m107390e(ArrayList<LoopSelectFillData> arrayList) {
        this.f81314f.m107395b(arrayList);
    }

    /* JADX INFO: renamed from: f */
    public void m107391f(String str) {
        this.f81315g = str;
    }

    /* JADX INFO: renamed from: i */
    public void m107392i() {
        xdl0.m208344M(this.f81310b, false);
        xdl0.m208344M(this.f81311c, true);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m107388c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m107393r() {
        if (!TextUtils.isEmpty(this.f81315g)) {
            this.f81309a.setText(this.f81315g);
            xdl0.m208344M(this.f81309a, true);
        }
        C16182b c16182b = new C16182b();
        this.f81314f = c16182b;
        this.f81310b.setAdapter((ListAdapter) c16182b);
        this.f81310b.setOnItemClickListener(new C16181a());
        this.f81310b.setDivider(new ColorDrawable(0));
        boolean zM150985w = lqa.m150985w();
        VList vList = this.f81310b;
        if (zM150985w) {
            xdl0.m208374f0(vList, t100.f167276y);
            this.f81310b.setDividerHeight(t100.f167261j);
        } else {
            xdl0.m208374f0(vList, t100.f167264m);
            this.f81310b.setDividerHeight(0);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
