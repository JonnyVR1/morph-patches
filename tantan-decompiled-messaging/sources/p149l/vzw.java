package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarryAddressSelectData;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import p147v.VList;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class vzw extends iww<tzw> {

    /* JADX INFO: renamed from: c */
    public VText f183678c;

    /* JADX INFO: renamed from: d */
    public VList f183679d;

    /* JADX INFO: renamed from: e */
    public C20776b f183680e;

    /* JADX INFO: renamed from: f */
    public tzw f183681f;

    /* JADX INFO: renamed from: l.vzw$a */
    public class C20775a implements AdapterView.OnItemClickListener {
        public C20775a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            vzw.this.f183681f.m191225r0(i);
        }
    }

    /* JADX INFO: renamed from: l.vzw$b */
    public class C20776b extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public ArrayList<MarryAddressSelectData> f183683a = new ArrayList<>();

        /* JADX INFO: renamed from: b */
        public tzw f183684b;

        public C20776b(tzw tzwVar) {
            this.f183684b = tzwVar;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MarryAddressSelectData getItem(int i) {
            return this.f183683a.get(i);
        }

        /* JADX INFO: renamed from: b */
        public void m200797b(List<MarryAddressSelectData> list) {
            this.f183683a.clear();
            this.f183683a.addAll(list);
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f183683a.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            C20777c c20777c;
            if (view == null) {
                view = LayoutInflater.from(vzw.this.act()).inflate(n6c0.f137353g0, viewGroup, false);
                c20777c = vzw.this.new C20777c();
                c20777c.f183686a = (TextView) view.findViewById(a5c0.f67671Y);
                c20777c.f183687b = (ImageView) view.findViewById(a5c0.f67673a);
                c20777c.f183688c = view.findViewById(a5c0.f67702y);
                view.setTag(a5c0.f67703z, c20777c);
            } else {
                c20777c = (C20777c) view.getTag(a5c0.f67703z);
            }
            MarryAddressSelectData item = getItem(i);
            c20777c.f183686a.setTypeface(Typeface.DEFAULT);
            xdl0.m208344M(c20777c.f183687b, item.showArrow());
            c20777c.f183687b.setImageDrawable(vzw.this.act().getResources().getDrawable(e3c0.f89142r0));
            boolean zIsSelected = item.isSelected();
            View view2 = c20777c.f183688c;
            if (zIsSelected) {
                view2.setBackgroundResource(e3c0.f89148t0);
                c20777c.f183686a.setTextColor(vzw.this.act().getResources().getColor(c1c0.f78249f));
                xdl0.m208345M0(c20777c.f183687b, true);
                c20777c.f183687b.setImageDrawable(vzw.this.act().getResources().getDrawable(e3c0.f89111h));
            } else {
                view2.setBackgroundResource(e3c0.f89145s0);
                c20777c.f183686a.setTextColor(Color.parseColor("#cf000000"));
            }
            c20777c.f183686a.setText(item.getShowText());
            return view;
        }
    }

    /* JADX INFO: renamed from: l.vzw$c */
    public class C20777c {

        /* JADX INFO: renamed from: a */
        public TextView f183686a;

        /* JADX INFO: renamed from: b */
        public ImageView f183687b;

        /* JADX INFO: renamed from: c */
        public View f183688c;

        public C20777c() {
        }
    }

    public vzw(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        super(act, marryEditProfileBaseMvpFrag);
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: c */
    public boolean mo104516c(MarrySeriesType marrySeriesType) {
        return this.f183681f.m191219k0();
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: e */
    public void mo104517e(MarrySeriesType marrySeriesType, User user) {
        MarryAddressSelectData marryAddressSelectDataM191221m0 = this.f183681f.m191221m0();
        if (marrySeriesType != MarrySeriesType.ADDRESS_HOMETOWN) {
            if (marrySeriesType == MarrySeriesType.ADDRESS_LIVE_NOW) {
                user.profile.extensions.basic.address = vwb.m200324f0(marryAddressSelectDataM191221m0.country, marryAddressSelectDataM191221m0.province, marryAddressSelectDataM191221m0.city);
                return;
            }
            return;
        }
        user.profile.extensions.basic.country = vwb.m200299M(marryAddressSelectDataM191221m0.country);
        user.profile.extensions.basic.province = vwb.m200299M(marryAddressSelectDataM191221m0.province);
        user.profile.extensions.basic.city = vwb.m200299M(marryAddressSelectDataM191221m0.city);
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: i */
    public void mo104518i(MarrySeriesType marrySeriesType, User user) {
        this.f183678c.setTypeface(eqh0.m117752c(3), 1);
        boolean zM47456c2 = act().m47456c2();
        VText vText = this.f183678c;
        if (zM47456c2) {
            vText.setText("来自");
        } else {
            vText.setText(marrySeriesType.getTitleName());
        }
        C20776b c20776b = new C20776b(this.f183681f);
        this.f183680e = c20776b;
        this.f183679d.setAdapter((ListAdapter) c20776b);
        this.f183679d.setOnItemClickListener(new C20775a());
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m200791l(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public View m200791l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wzw.m206316b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(tzw tzwVar) {
        this.f183681f = tzwVar;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m200793n() {
        this.f183679d.setSelection(0);
    }

    /* JADX INFO: renamed from: p */
    public void m200794p() {
        this.f183680e.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: q */
    public void m200795q(List<MarryAddressSelectData> list, boolean z) {
        this.f183680e.m200797b(list);
        this.f183680e.notifyDataSetChanged();
        if (z) {
            this.f183679d.post(new Runnable() { // from class: l.uzw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f179039a.m200793n();
                }
            });
        }
    }
}
