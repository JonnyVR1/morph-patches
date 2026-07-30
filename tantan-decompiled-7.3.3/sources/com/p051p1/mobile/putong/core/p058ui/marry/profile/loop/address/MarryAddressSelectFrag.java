package com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.address;

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
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarryAddressSelectData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VList;
import p151v.navigationbar.VNavigationBar;
import p153l.bnl0;
import p153l.gdc0;
import p153l.j9c0;
import p153l.kbc0;
import p153l.sec0;
import p153l.x20;

/* JADX INFO: loaded from: classes3.dex */
public class MarryAddressSelectFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public VList f31255A;

    /* JADX INFO: renamed from: B */
    public InterfaceC8610b f31256B;

    /* JADX INFO: renamed from: C */
    public C8612d f31257C;

    /* JADX INFO: renamed from: D */
    public MarryAddressSelectData f31258D;

    /* JADX INFO: renamed from: E */
    public x20 f31259E;

    /* JADX INFO: renamed from: z */
    public VNavigationBar f31260z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.loop.address.MarryAddressSelectFrag$a */
    public class C8609a implements AdapterView.OnItemClickListener {
        public C8609a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (NullChecker.m82486a(MarryAddressSelectFrag.this.f31256B)) {
                MarryAddressSelectFrag.this.f31256B.mo48656a(i);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.loop.address.MarryAddressSelectFrag$b */
    public interface InterfaceC8610b {
        /* JADX INFO: renamed from: a */
        void mo48656a(int i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.loop.address.MarryAddressSelectFrag$c */
    public static class C8611c {
        /* JADX INFO: renamed from: b */
        public static void m48670b(MarryAddressSelectFrag marryAddressSelectFrag, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            marryAddressSelectFrag.f31260z = (VNavigationBar) viewGroup.getChildAt(0);
            marryAddressSelectFrag.f31255A = (VList) viewGroup.getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m48671c(MarryAddressSelectFrag marryAddressSelectFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(sec0.f167513H, viewGroup, false);
            m48670b(marryAddressSelectFrag, viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.loop.address.MarryAddressSelectFrag$d */
    public class C8612d extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public ArrayList<MarryAddressSelectData> f31262a = new ArrayList<>();

        public C8612d() {
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MarryAddressSelectData getItem(int i) {
            return this.f31262a.get(i);
        }

        /* JADX INFO: renamed from: b */
        public void m48673b(List<MarryAddressSelectData> list) {
            this.f31262a.clear();
            this.f31262a.addAll(list);
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f31262a.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            C8613e c8613e;
            if (view == null) {
                view = LayoutInflater.from(MarryAddressSelectFrag.this.act()).inflate(sec0.f167571i0, viewGroup, false);
                c8613e = new C8613e();
                c8613e.f31264a = (TextView) view.findViewById(gdc0.f103666Y);
                c8613e.f31265b = (ImageView) view.findViewById(gdc0.f103668a);
                c8613e.f31266c = view.findViewById(gdc0.f103697y);
                view.setTag(gdc0.f103698z, c8613e);
            } else {
                c8613e = (C8613e) view.getTag(gdc0.f103698z);
            }
            MarryAddressSelectData item = getItem(i);
            c8613e.f31264a.setTypeface(Typeface.DEFAULT);
            bnl0.m105524M(c8613e.f31265b, item.showArrow());
            c8613e.f31265b.setImageDrawable(MarryAddressSelectFrag.this.getResources().getDrawable(kbc0.f124905r0));
            boolean zIsSelected = item.isSelected();
            View view2 = c8613e.f31266c;
            if (zIsSelected) {
                view2.setBackgroundResource(kbc0.f124911t0);
                c8613e.f31264a.setTextColor(MarryAddressSelectFrag.this.act().getResources().getColor(j9c0.f118869f));
                bnl0.m105525M0(c8613e.f31265b, true);
                c8613e.f31265b.setImageDrawable(MarryAddressSelectFrag.this.getResources().getDrawable(kbc0.f124874h));
            } else {
                view2.setBackgroundResource(kbc0.f124908s0);
                c8613e.f31264a.setTextColor(Color.parseColor("#cf000000"));
            }
            c8613e.f31264a.setText(item.getShowText());
            return view;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.loop.address.MarryAddressSelectFrag$e */
    public static class C8613e {

        /* JADX INFO: renamed from: a */
        public TextView f31264a;

        /* JADX INFO: renamed from: b */
        public ImageView f31265b;

        /* JADX INFO: renamed from: c */
        public View f31266c;
    }

    public MarryAddressSelectFrag(x20 x20Var) {
        this.f31259E = x20Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public /* synthetic */ void m48664S4(View view) {
        if (NullChecker.m82486a(this.f31259E)) {
            this.f31259E.call();
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public View m48665Q4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C8611c.m48671c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R4 */
    public MarryAddressSelectData m48666R4(int i) {
        return this.f31257C.f31262a.get(i);
    }

    /* JADX INFO: renamed from: T4 */
    public void m48667T4(MarryAddressSelectData marryAddressSelectData) {
        C8612d c8612d;
        this.f31258D = marryAddressSelectData;
        if (this.f31255A == null || (c8612d = this.f31257C) == null) {
            return;
        }
        c8612d.m48673b(marryAddressSelectData.getNextList());
        this.f31260z.setTitle(marryAddressSelectData.getShowText());
    }

    /* JADX INFO: renamed from: U4 */
    public void m48668U4(InterfaceC8610b interfaceC8610b) {
        this.f31256B = interfaceC8610b;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        if (this.f31257C == null) {
            C8612d c8612d = new C8612d();
            this.f31257C = c8612d;
            this.f31255A.setAdapter((ListAdapter) c8612d);
            this.f31255A.setOnItemClickListener(new C8609a());
        }
        MarryAddressSelectData marryAddressSelectData = this.f31258D;
        if (marryAddressSelectData != null) {
            this.f31260z.setTitle(marryAddressSelectData.getShowText());
            this.f31257C.m48673b(this.f31258D.getNextList());
        }
        bnl0.m105509E0(this.f31260z, new View.OnClickListener() { // from class: l.lyw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134141a.m48664S4(view);
            }
        });
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m48665Q4(layoutInflater, viewGroup);
    }
}
