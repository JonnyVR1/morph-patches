package p153l;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarryAddressSelectData;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import p151v.VList;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class u2x extends hzw<s2x> {

    /* JADX INFO: renamed from: c */
    public VText f177250c;

    /* JADX INFO: renamed from: d */
    public VList f177251d;

    /* JADX INFO: renamed from: e */
    public C20472b f177252e;

    /* JADX INFO: renamed from: f */
    public s2x f177253f;

    /* JADX INFO: renamed from: l.u2x$a */
    public class C20471a implements AdapterView.OnItemClickListener {
        public C20471a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            u2x.this.f177253f.m184152r0(i);
        }
    }

    /* JADX INFO: renamed from: l.u2x$b */
    public class C20472b extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public ArrayList<MarryAddressSelectData> f177255a = new ArrayList<>();

        /* JADX INFO: renamed from: b */
        public s2x f177256b;

        public C20472b(s2x s2xVar) {
            this.f177256b = s2xVar;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MarryAddressSelectData getItem(int i) {
            return this.f177255a.get(i);
        }

        /* JADX INFO: renamed from: b */
        public void m194314b(List<MarryAddressSelectData> list) {
            this.f177255a.clear();
            this.f177255a.addAll(list);
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f177255a.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            C20473c c20473c;
            if (view == null) {
                view = LayoutInflater.from(u2x.this.act()).inflate(sec0.f167567g0, viewGroup, false);
                c20473c = u2x.this.new C20473c();
                c20473c.f177258a = (TextView) view.findViewById(gdc0.f103666Y);
                c20473c.f177259b = (ImageView) view.findViewById(gdc0.f103668a);
                c20473c.f177260c = view.findViewById(gdc0.f103697y);
                view.setTag(gdc0.f103698z, c20473c);
            } else {
                c20473c = (C20473c) view.getTag(gdc0.f103698z);
            }
            MarryAddressSelectData item = getItem(i);
            c20473c.f177258a.setTypeface(Typeface.DEFAULT);
            bnl0.m105524M(c20473c.f177259b, item.showArrow());
            c20473c.f177259b.setImageDrawable(u2x.this.act().getResources().getDrawable(kbc0.f124905r0));
            boolean zIsSelected = item.isSelected();
            View view2 = c20473c.f177260c;
            if (zIsSelected) {
                view2.setBackgroundResource(kbc0.f124911t0);
                c20473c.f177258a.setTextColor(u2x.this.act().getResources().getColor(j9c0.f118869f));
                bnl0.m105525M0(c20473c.f177259b, true);
                c20473c.f177259b.setImageDrawable(u2x.this.act().getResources().getDrawable(kbc0.f124874h));
            } else {
                view2.setBackgroundResource(kbc0.f124908s0);
                c20473c.f177258a.setTextColor(Color.parseColor("#cf000000"));
            }
            c20473c.f177258a.setText(item.getShowText());
            return view;
        }
    }

    /* JADX INFO: renamed from: l.u2x$c */
    public class C20473c {

        /* JADX INFO: renamed from: a */
        public TextView f177258a;

        /* JADX INFO: renamed from: b */
        public ImageView f177259b;

        /* JADX INFO: renamed from: c */
        public View f177260c;

        public C20473c() {
        }
    }

    public u2x(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        super(act, marryEditProfileBaseMvpFrag);
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: c */
    public boolean mo95576c(MarrySeriesType marrySeriesType) {
        return this.f177253f.m184146k0();
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: e */
    public void mo95577e(MarrySeriesType marrySeriesType, User user) {
        MarryAddressSelectData marryAddressSelectDataM184148m0 = this.f177253f.m184148m0();
        if (marrySeriesType != MarrySeriesType.ADDRESS_HOMETOWN) {
            if (marrySeriesType == MarrySeriesType.ADDRESS_LIVE_NOW) {
                user.profile.extensions.basic.address = jyb.m147507f0(marryAddressSelectDataM184148m0.country, marryAddressSelectDataM184148m0.province, marryAddressSelectDataM184148m0.city);
                return;
            }
            return;
        }
        user.profile.extensions.basic.country = jyb.m147482M(marryAddressSelectDataM184148m0.country);
        user.profile.extensions.basic.province = jyb.m147482M(marryAddressSelectDataM184148m0.province);
        user.profile.extensions.basic.city = jyb.m147482M(marryAddressSelectDataM184148m0.city);
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: i */
    public void mo95578i(MarrySeriesType marrySeriesType, User user) {
        this.f177250c.setTypeface(lyh0.m156283c(3), 1);
        boolean zM48639d2 = act().m48639d2();
        VText vText = this.f177250c;
        if (zM48639d2) {
            vText.setText("来自");
        } else {
            vText.setText(marrySeriesType.getTitleName());
        }
        C20472b c20472b = new C20472b(this.f177253f);
        this.f177252e = c20472b;
        this.f177251d.setAdapter((ListAdapter) c20472b);
        this.f177251d.setOnItemClickListener(new C20471a());
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m194308l(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public View m194308l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return v2x.m199156b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(s2x s2xVar) {
        this.f177253f = s2xVar;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m194310n() {
        this.f177251d.setSelection(0);
    }

    /* JADX INFO: renamed from: p */
    public void m194311p() {
        this.f177252e.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: q */
    public void m194312q(List<MarryAddressSelectData> list, boolean z) {
        this.f177252e.m194314b(list);
        this.f177252e.notifyDataSetChanged();
        if (z) {
            this.f177251d.post(new Runnable() { // from class: l.t2x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f171828a.m194310n();
                }
            });
        }
    }
}
