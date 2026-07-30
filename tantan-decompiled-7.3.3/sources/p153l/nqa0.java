package p153l;

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
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.LoopSelectFillData;
import java.util.ArrayList;
import p151v.VImage;
import p151v.VList;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes4.dex */
public class nqa0 implements iam<lqa0> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f143194a;

    /* JADX INFO: renamed from: b */
    public VList f143195b;

    /* JADX INFO: renamed from: c */
    public Context f143196c;

    /* JADX INFO: renamed from: d */
    public C18923b f143197d;

    /* JADX INFO: renamed from: e */
    public lqa0 f143198e;

    /* JADX INFO: renamed from: l.nqa0$a */
    public class C18922a implements AdapterView.OnItemClickListener {
        public C18922a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            nqa0.this.f143198e.m155344n0(i);
        }
    }

    /* JADX INFO: renamed from: l.nqa0$b */
    public class C18923b extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public ArrayList<LoopSelectFillData> f143200a = new ArrayList<>();

        public C18923b() {
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoopSelectFillData getItem(int i) {
            return this.f143200a.get(i);
        }

        /* JADX INFO: renamed from: b */
        public void m164303b(ArrayList<LoopSelectFillData> arrayList) {
            this.f143200a.clear();
            this.f143200a.addAll(arrayList);
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f143200a.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            C18924c c18924c;
            if (view == null) {
                view = LayoutInflater.from(nqa0.this.act()).inflate(sec0.f167499A, viewGroup, false);
                c18924c = nqa0.this.new C18924c();
                c18924c.f143202a = (TextView) view.findViewById(gdc0.f103666Y);
                c18924c.f143203b = (ImageView) view.findViewById(gdc0.f103668a);
                c18924c.f143204c = (VImage) view.findViewById(gdc0.f103672c);
                c18924c.f143205d = view.findViewById(gdc0.f103697y);
                view.setTag(gdc0.f103698z, c18924c);
            } else {
                c18924c = (C18924c) view.getTag(gdc0.f103698z);
            }
            LoopSelectFillData item = getItem(i);
            c18924c.f143202a.setTextColor(nqa0.this.act().getResources().getColor(j9c0.f118872i));
            boolean zM52762e = item.m52762e();
            TextView textView = c18924c.f143202a;
            if (zM52762e) {
                textView.setTypeface(Typeface.defaultFromStyle(1));
            } else {
                textView.setTypeface(Typeface.defaultFromStyle(0));
            }
            bnl0.m105524M(c18924c.f143203b, item.m52762e());
            c18924c.f143202a.setText(item.m52760c());
            bnl0.m105524M(c18924c.f143204c, !item.m52762e());
            c18924c.f143204c.setImageResource(item.m52763f() ? kbc0.f124874h : kbc0.f124870g);
            if (item.m52763f()) {
                c18924c.f143202a.setTextColor(nqa0.this.act().getResources().getColor(j9c0.f118869f));
            }
            return view;
        }
    }

    /* JADX INFO: renamed from: l.nqa0$c */
    public class C18924c {

        /* JADX INFO: renamed from: a */
        public TextView f143202a;

        /* JADX INFO: renamed from: b */
        public ImageView f143203b;

        /* JADX INFO: renamed from: c */
        public VImage f143204c;

        /* JADX INFO: renamed from: d */
        public View f143205d;

        public C18924c() {
        }
    }

    public nqa0(Context context) {
        this.f143196c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m164296e(View view) {
        this.f143198e.m155340g0();
    }

    /* JADX INFO: renamed from: r */
    private void m164297r() {
        this.f143194a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.mqa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138029a.m164296e(view);
            }
        });
        C18923b c18923b = new C18923b();
        this.f143197d = c18923b;
        this.f143195b.setAdapter((ListAdapter) c18923b);
        this.f143195b.setOnItemClickListener(new C18922a());
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f143196c;
    }

    /* JADX INFO: renamed from: c */
    public View m164298c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return oqa0.m168800b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(lqa0 lqa0Var) {
        this.f143198e = lqa0Var;
    }

    /* JADX INFO: renamed from: f */
    public void m164300f(ArrayList<LoopSelectFillData> arrayList) {
        this.f143197d.m164303b(arrayList);
    }

    /* JADX INFO: renamed from: i */
    public void m164301i(String str) {
        this.f143194a.setTitle(str);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM164298c = m164298c(layoutInflater, viewGroup);
        m164297r();
        return viewM164298c;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
