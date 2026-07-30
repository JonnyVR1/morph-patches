package p153l;

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
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.LoopSelectFillData;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopQuestionAct;
import java.util.ArrayList;
import p151v.VList;

/* JADX INFO: loaded from: classes4.dex */
public class gsa0 implements iam<fsa0> {

    /* JADX INFO: renamed from: a */
    public TextView f106250a;

    /* JADX INFO: renamed from: b */
    public VList f106251b;

    /* JADX INFO: renamed from: c */
    public TextView f106252c;

    /* JADX INFO: renamed from: d */
    public ProfileLoopQuestionAct f106253d;

    /* JADX INFO: renamed from: e */
    public fsa0 f106254e;

    /* JADX INFO: renamed from: f */
    public C17293b f106255f;

    /* JADX INFO: renamed from: g */
    public String f106256g;

    /* JADX INFO: renamed from: l.gsa0$a */
    public class C17292a implements AdapterView.OnItemClickListener {
        public C17292a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            gsa0.this.f106254e.m127071u0(i);
        }
    }

    /* JADX INFO: renamed from: l.gsa0$b */
    public class C17293b extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public ArrayList<LoopSelectFillData> f106258a = new ArrayList<>();

        public C17293b() {
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoopSelectFillData getItem(int i) {
            return this.f106258a.get(i);
        }

        /* JADX INFO: renamed from: b */
        public void m132011b(ArrayList<LoopSelectFillData> arrayList) {
            this.f106258a.clear();
            this.f106258a.addAll(arrayList);
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f106258a.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            C17294c c17294c;
            if (view == null) {
                view = LayoutInflater.from(gsa0.this.act()).inflate(xra.m212804w() ? sec0.f167501B : sec0.f167499A, viewGroup, false);
                c17294c = gsa0.this.new C17294c();
                c17294c.f106260a = (TextView) view.findViewById(gdc0.f103666Y);
                c17294c.f106261b = (ImageView) view.findViewById(gdc0.f103668a);
                view.setTag(gdc0.f103698z, c17294c);
            } else {
                c17294c = (C17294c) view.getTag(gdc0.f103698z);
            }
            LoopSelectFillData item = getItem(i);
            c17294c.f106261b.setImageDrawable(gsa0.this.f106253d.getDrawable(kbc0.f124894n1));
            bnl0.m105524M(c17294c.f106261b, item.m52762e() || item.m52763f());
            c17294c.f106260a.setText(item.m52760c());
            c17294c.f106260a.setTypeface(lyh0.m156283c(3), 1);
            return view;
        }
    }

    /* JADX INFO: renamed from: l.gsa0$c */
    public class C17294c {

        /* JADX INFO: renamed from: a */
        public TextView f106260a;

        /* JADX INFO: renamed from: b */
        public ImageView f106261b;

        public C17294c() {
        }
    }

    public gsa0(ProfileLoopQuestionAct profileLoopQuestionAct) {
        this.f106253d = profileLoopQuestionAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f106253d;
    }

    /* JADX INFO: renamed from: c */
    public View m132004c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hsa0.m136962b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(fsa0 fsa0Var) {
        this.f106254e = fsa0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m132006e(ArrayList<LoopSelectFillData> arrayList) {
        this.f106255f.m132011b(arrayList);
    }

    /* JADX INFO: renamed from: f */
    public void m132007f(String str) {
        this.f106256g = str;
    }

    /* JADX INFO: renamed from: i */
    public void m132008i() {
        bnl0.m105524M(this.f106251b, false);
        bnl0.m105524M(this.f106252c, true);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m132004c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m132009r() {
        if (!TextUtils.isEmpty(this.f106256g)) {
            this.f106250a.setText(this.f106256g);
            bnl0.m105524M(this.f106250a, true);
        }
        C17293b c17293b = new C17293b();
        this.f106255f = c17293b;
        this.f106251b.setAdapter((ListAdapter) c17293b);
        this.f106251b.setOnItemClickListener(new C17292a());
        this.f106251b.setDivider(new ColorDrawable(0));
        boolean zM212804w = xra.m212804w();
        VList vList = this.f106251b;
        if (zM212804w) {
            bnl0.m105554f0(vList, qa00.f156338y);
            this.f106251b.setDividerHeight(qa00.f156323j);
        } else {
            bnl0.m105554f0(vList, qa00.f156326m);
            this.f106251b.setDividerHeight(0);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
