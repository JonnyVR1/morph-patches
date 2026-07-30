package p003l;

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
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarryAddressSelectData;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import l.a5c0;
import l.c1c0;
import l.e3c0;
import l.n6c0;
import l.vwb;
import l.wzw;
import l.xdl0;
import p028v.VList;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class vzw extends iww<tzw> {

    /* JADX INFO: renamed from: c */
    public VText f8463c;

    /* JADX INFO: renamed from: d */
    public VList f8464d;

    /* JADX INFO: renamed from: e */
    public C0606b f8465e;

    /* JADX INFO: renamed from: f */
    public tzw f8466f;

    /* JADX INFO: renamed from: l.vzw$a */
    public class C0605a implements AdapterView.OnItemClickListener {
        public C0605a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            vzw.this.f8466f.m8062r0(i);
        }
    }

    /* JADX INFO: renamed from: l.vzw$b */
    public class C0606b extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public ArrayList<MarryAddressSelectData> f8468a = new ArrayList<>();

        /* JADX INFO: renamed from: b */
        public tzw f8469b;

        public C0606b(tzw tzwVar) {
            this.f8469b = tzwVar;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MarryAddressSelectData getItem(int i) {
            return this.f8468a.get(i);
        }

        /* JADX INFO: renamed from: b */
        public void m8427b(List<MarryAddressSelectData> list) {
            this.f8468a.clear();
            this.f8468a.addAll(list);
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f8468a.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            C0607c c0607c;
            if (view == null) {
                view = LayoutInflater.from(vzw.this.act()).inflate(n6c0.g0, viewGroup, false);
                c0607c = vzw.this.new C0607c();
                c0607c.f8471a = (TextView) view.findViewById(a5c0.Y);
                c0607c.f8472b = (ImageView) view.findViewById(a5c0.a);
                c0607c.f8473c = view.findViewById(a5c0.y);
                view.setTag(a5c0.z, c0607c);
            } else {
                c0607c = (C0607c) view.getTag(a5c0.z);
            }
            MarryAddressSelectData item = getItem(i);
            c0607c.f8471a.setTypeface(Typeface.DEFAULT);
            xdl0.M(c0607c.f8472b, item.showArrow());
            c0607c.f8472b.setImageDrawable(vzw.this.act().getResources().getDrawable(e3c0.r0));
            boolean zIsSelected = item.isSelected();
            View view2 = c0607c.f8473c;
            if (zIsSelected) {
                view2.setBackgroundResource(e3c0.t0);
                c0607c.f8471a.setTextColor(vzw.this.act().getResources().getColor(c1c0.f));
                xdl0.M0(c0607c.f8472b, true);
                c0607c.f8472b.setImageDrawable(vzw.this.act().getResources().getDrawable(e3c0.h));
            } else {
                view2.setBackgroundResource(e3c0.s0);
                c0607c.f8471a.setTextColor(Color.parseColor("#cf000000"));
            }
            c0607c.f8471a.setText(item.getShowText());
            return view;
        }
    }

    /* JADX INFO: renamed from: l.vzw$c */
    public class C0607c {

        /* JADX INFO: renamed from: a */
        public TextView f8471a;

        /* JADX INFO: renamed from: b */
        public ImageView f8472b;

        /* JADX INFO: renamed from: c */
        public View f8473c;

        public C0607c() {
        }
    }

    public vzw(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        super(act, marryEditProfileBaseMvpFrag);
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: c */
    public boolean mo3208c(MarrySeriesType marrySeriesType) {
        return this.f8466f.m8056k0();
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: e */
    public void mo3209e(MarrySeriesType marrySeriesType, User user) {
        MarryAddressSelectData marryAddressSelectDataM8058m0 = this.f8466f.m8058m0();
        if (marrySeriesType != MarrySeriesType.ADDRESS_HOMETOWN) {
            if (marrySeriesType == MarrySeriesType.ADDRESS_LIVE_NOW) {
                user.profile.extensions.basic.address = vwb.f0(new String[]{marryAddressSelectDataM8058m0.country, marryAddressSelectDataM8058m0.province, marryAddressSelectDataM8058m0.city});
                return;
            }
            return;
        }
        user.profile.extensions.basic.country = vwb.M(marryAddressSelectDataM8058m0.country);
        user.profile.extensions.basic.province = vwb.M(marryAddressSelectDataM8058m0.province);
        user.profile.extensions.basic.city = vwb.M(marryAddressSelectDataM8058m0.city);
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: i */
    public void mo3210i(MarrySeriesType marrySeriesType, User user) {
        this.f8463c.setTypeface(eqh0.m3924c(3), 1);
        boolean zM503c2 = act().m503c2();
        AppCompatTextView appCompatTextView = this.f8463c;
        if (zM503c2) {
            appCompatTextView.setText("来自");
        } else {
            appCompatTextView.setText(marrySeriesType.getTitleName());
        }
        C0606b c0606b = new C0606b(this.f8466f);
        this.f8465e = c0606b;
        this.f8464d.setAdapter((ListAdapter) c0606b);
        this.f8464d.setOnItemClickListener(new C0605a());
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m8421l(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public View m8421l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wzw.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m8420i1(tzw tzwVar) {
        this.f8466f = tzwVar;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m8423n() {
        this.f8464d.setSelection(0);
    }

    /* JADX INFO: renamed from: p */
    public void m8424p() {
        this.f8465e.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: q */
    public void m8425q(List<MarryAddressSelectData> list, boolean z) {
        this.f8465e.m8427b(list);
        this.f8465e.notifyDataSetChanged();
        if (z) {
            this.f8464d.post(new Runnable() { // from class: l.uzw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8140a.m8423n();
                }
            });
        }
    }
}
