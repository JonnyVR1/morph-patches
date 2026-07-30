package com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.address;

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
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarryAddressSelectData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VList;
import p147v.navigationbar.VNavigationBar;
import p149l.a5c0;
import p149l.c1c0;
import p149l.d30;
import p149l.e3c0;
import p149l.n6c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class MarryAddressSelectFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public VList f30407A;

    /* JADX INFO: renamed from: B */
    public InterfaceC8447b f30408B;

    /* JADX INFO: renamed from: C */
    public C8449d f30409C;

    /* JADX INFO: renamed from: D */
    public MarryAddressSelectData f30410D;

    /* JADX INFO: renamed from: E */
    public d30 f30411E;

    /* JADX INFO: renamed from: z */
    public VNavigationBar f30412z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.loop.address.MarryAddressSelectFrag$a */
    public class C8446a implements AdapterView.OnItemClickListener {
        public C8446a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (NullChecker.m81303a(MarryAddressSelectFrag.this.f30408B)) {
                MarryAddressSelectFrag.this.f30408B.mo47473a(i);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.loop.address.MarryAddressSelectFrag$b */
    public interface InterfaceC8447b {
        /* JADX INFO: renamed from: a */
        void mo47473a(int i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.loop.address.MarryAddressSelectFrag$c */
    public static class C8448c {
        /* JADX INFO: renamed from: b */
        public static void m47487b(MarryAddressSelectFrag marryAddressSelectFrag, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            marryAddressSelectFrag.f30412z = (VNavigationBar) viewGroup.getChildAt(0);
            marryAddressSelectFrag.f30407A = (VList) viewGroup.getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m47488c(MarryAddressSelectFrag marryAddressSelectFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(n6c0.f137299H, viewGroup, false);
            m47487b(marryAddressSelectFrag, viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.loop.address.MarryAddressSelectFrag$d */
    public class C8449d extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public ArrayList<MarryAddressSelectData> f30414a = new ArrayList<>();

        public C8449d() {
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MarryAddressSelectData getItem(int i) {
            return this.f30414a.get(i);
        }

        /* JADX INFO: renamed from: b */
        public void m47490b(List<MarryAddressSelectData> list) {
            this.f30414a.clear();
            this.f30414a.addAll(list);
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f30414a.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            C8450e c8450e;
            if (view == null) {
                view = LayoutInflater.from(MarryAddressSelectFrag.this.act()).inflate(n6c0.f137357i0, viewGroup, false);
                c8450e = new C8450e();
                c8450e.f30416a = (TextView) view.findViewById(a5c0.f67671Y);
                c8450e.f30417b = (ImageView) view.findViewById(a5c0.f67673a);
                c8450e.f30418c = view.findViewById(a5c0.f67702y);
                view.setTag(a5c0.f67703z, c8450e);
            } else {
                c8450e = (C8450e) view.getTag(a5c0.f67703z);
            }
            MarryAddressSelectData item = getItem(i);
            c8450e.f30416a.setTypeface(Typeface.DEFAULT);
            xdl0.m208344M(c8450e.f30417b, item.showArrow());
            c8450e.f30417b.setImageDrawable(MarryAddressSelectFrag.this.getResources().getDrawable(e3c0.f89142r0));
            boolean zIsSelected = item.isSelected();
            View view2 = c8450e.f30418c;
            if (zIsSelected) {
                view2.setBackgroundResource(e3c0.f89148t0);
                c8450e.f30416a.setTextColor(MarryAddressSelectFrag.this.act().getResources().getColor(c1c0.f78249f));
                xdl0.m208345M0(c8450e.f30417b, true);
                c8450e.f30417b.setImageDrawable(MarryAddressSelectFrag.this.getResources().getDrawable(e3c0.f89111h));
            } else {
                view2.setBackgroundResource(e3c0.f89145s0);
                c8450e.f30416a.setTextColor(Color.parseColor("#cf000000"));
            }
            c8450e.f30416a.setText(item.getShowText());
            return view;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.loop.address.MarryAddressSelectFrag$e */
    public static class C8450e {

        /* JADX INFO: renamed from: a */
        public TextView f30416a;

        /* JADX INFO: renamed from: b */
        public ImageView f30417b;

        /* JADX INFO: renamed from: c */
        public View f30418c;
    }

    public MarryAddressSelectFrag(d30 d30Var) {
        this.f30411E = d30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public /* synthetic */ void m47481S4(View view) {
        if (NullChecker.m81303a(this.f30411E)) {
            this.f30411E.call();
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public View m47482Q4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C8448c.m47488c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R4 */
    public MarryAddressSelectData m47483R4(int i) {
        return this.f30409C.f30414a.get(i);
    }

    /* JADX INFO: renamed from: T4 */
    public void m47484T4(MarryAddressSelectData marryAddressSelectData) {
        C8449d c8449d;
        this.f30410D = marryAddressSelectData;
        if (this.f30407A == null || (c8449d = this.f30409C) == null) {
            return;
        }
        c8449d.m47490b(marryAddressSelectData.getNextList());
        this.f30412z.setTitle(marryAddressSelectData.getShowText());
    }

    /* JADX INFO: renamed from: U4 */
    public void m47485U4(InterfaceC8447b interfaceC8447b) {
        this.f30408B = interfaceC8447b;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        if (this.f30409C == null) {
            C8449d c8449d = new C8449d();
            this.f30409C = c8449d;
            this.f30407A.setAdapter((ListAdapter) c8449d);
            this.f30407A.setOnItemClickListener(new C8446a());
        }
        MarryAddressSelectData marryAddressSelectData = this.f30410D;
        if (marryAddressSelectData != null) {
            this.f30412z.setTitle(marryAddressSelectData.getShowText());
            this.f30409C.m47490b(this.f30410D.getNextList());
        }
        xdl0.m208329E0(this.f30412z, new View.OnClickListener() { // from class: l.mvw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136002a.m47481S4(view);
            }
        });
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m47482Q4(layoutInflater, viewGroup);
    }
}
