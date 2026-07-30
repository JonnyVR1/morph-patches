package com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.address;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarryAddressSelectData;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.a5c0;
import l.c1c0;
import l.e3c0;
import l.n6c0;
import l.xdl0;
import p003l.d30;
import p028v.VList;
import p028v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MarryAddressSelectFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public VList f298A;

    /* JADX INFO: renamed from: B */
    public InterfaceC0030b f299B;

    /* JADX INFO: renamed from: C */
    public C0032d f300C;

    /* JADX INFO: renamed from: D */
    public MarryAddressSelectData f301D;

    /* JADX INFO: renamed from: E */
    public d30 f302E;

    /* JADX INFO: renamed from: z */
    public VNavigationBar f303z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.loop.address.MarryAddressSelectFrag$a */
    public class C0029a implements AdapterView.OnItemClickListener {
        public C0029a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (NullChecker.a(MarryAddressSelectFrag.this.f299B)) {
                MarryAddressSelectFrag.this.f299B.mo520a(i);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.loop.address.MarryAddressSelectFrag$b */
    public interface InterfaceC0030b {
        /* JADX INFO: renamed from: a */
        void mo520a(int i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.loop.address.MarryAddressSelectFrag$c */
    public static class C0031c {
        /* JADX INFO: renamed from: b */
        public static void m535b(MarryAddressSelectFrag marryAddressSelectFrag, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            marryAddressSelectFrag.f303z = (VNavigationBar) viewGroup.getChildAt(0);
            marryAddressSelectFrag.f298A = (VList) viewGroup.getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m536c(MarryAddressSelectFrag marryAddressSelectFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(n6c0.H, viewGroup, false);
            m535b(marryAddressSelectFrag, viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.loop.address.MarryAddressSelectFrag$d */
    public class C0032d extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public ArrayList<MarryAddressSelectData> f305a = new ArrayList<>();

        public C0032d() {
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MarryAddressSelectData getItem(int i) {
            return this.f305a.get(i);
        }

        /* JADX INFO: renamed from: b */
        public void m538b(List<MarryAddressSelectData> list) {
            this.f305a.clear();
            this.f305a.addAll(list);
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f305a.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            C0033e c0033e;
            if (view == null) {
                view = LayoutInflater.from(MarryAddressSelectFrag.this.act()).inflate(n6c0.i0, viewGroup, false);
                c0033e = new C0033e();
                c0033e.f307a = (TextView) view.findViewById(a5c0.Y);
                c0033e.f308b = (ImageView) view.findViewById(a5c0.a);
                c0033e.f309c = view.findViewById(a5c0.y);
                view.setTag(a5c0.z, c0033e);
            } else {
                c0033e = (C0033e) view.getTag(a5c0.z);
            }
            MarryAddressSelectData item = getItem(i);
            c0033e.f307a.setTypeface(Typeface.DEFAULT);
            xdl0.M(c0033e.f308b, item.showArrow());
            c0033e.f308b.setImageDrawable(MarryAddressSelectFrag.this.getResources().getDrawable(e3c0.r0));
            boolean zIsSelected = item.isSelected();
            View view2 = c0033e.f309c;
            if (zIsSelected) {
                view2.setBackgroundResource(e3c0.t0);
                c0033e.f307a.setTextColor(MarryAddressSelectFrag.this.act().getResources().getColor(c1c0.f));
                xdl0.M0(c0033e.f308b, true);
                c0033e.f308b.setImageDrawable(MarryAddressSelectFrag.this.getResources().getDrawable(e3c0.h));
            } else {
                view2.setBackgroundResource(e3c0.s0);
                c0033e.f307a.setTextColor(Color.parseColor("#cf000000"));
            }
            c0033e.f307a.setText(item.getShowText());
            return view;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.loop.address.MarryAddressSelectFrag$e */
    public static class C0033e {

        /* JADX INFO: renamed from: a */
        public TextView f307a;

        /* JADX INFO: renamed from: b */
        public ImageView f308b;

        /* JADX INFO: renamed from: c */
        public View f309c;
    }

    public MarryAddressSelectFrag(d30 d30Var) {
        this.f302E = d30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public /* synthetic */ void m528S4(View view) {
        if (NullChecker.a(this.f302E)) {
            this.f302E.call();
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public View m529Q4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0031c.m536c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R4 */
    public MarryAddressSelectData m530R4(int i) {
        return this.f300C.f305a.get(i);
    }

    /* JADX INFO: renamed from: T4 */
    public void m531T4(MarryAddressSelectData marryAddressSelectData) {
        C0032d c0032d;
        this.f301D = marryAddressSelectData;
        if (this.f298A == null || (c0032d = this.f300C) == null) {
            return;
        }
        c0032d.m538b(marryAddressSelectData.getNextList());
        this.f303z.setTitle(marryAddressSelectData.getShowText());
    }

    /* JADX INFO: renamed from: U4 */
    public void m532U4(InterfaceC0030b interfaceC0030b) {
        this.f299B = interfaceC0030b;
    }

    /* JADX INFO: renamed from: g4 */
    public void m533g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        if (this.f300C == null) {
            C0032d c0032d = new C0032d();
            this.f300C = c0032d;
            this.f298A.setAdapter((ListAdapter) c0032d);
            this.f298A.setOnItemClickListener(new C0029a());
        }
        MarryAddressSelectData marryAddressSelectData = this.f301D;
        if (marryAddressSelectData != null) {
            this.f303z.setTitle(marryAddressSelectData.getShowText());
            this.f300C.m538b(this.f301D.getNextList());
        }
        xdl0.E0(this.f303z, new View.OnClickListener() { // from class: l.mvw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5783a.m528S4(view);
            }
        });
    }

    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m529Q4(layoutInflater, viewGroup);
    }
}
