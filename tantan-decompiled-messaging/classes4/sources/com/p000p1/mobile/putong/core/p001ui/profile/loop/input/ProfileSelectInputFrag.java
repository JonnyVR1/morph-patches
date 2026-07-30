package com.p000p1.mobile.putong.core.p001ui.profile.loop.input;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.LoopSelectFillData;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileLoopActionLayout;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.data.HometownChinaItem;
import com.p1.mobile.putong.core.profile.R;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l.a5c0;
import l.c1c0;
import l.e30;
import l.e3c0;
import l.lqa;
import l.n6c0;
import l.ura;
import l.vwb;
import l.xdl0;
import v.VList;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileSelectInputFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public VList f1361A;

    /* JADX INFO: renamed from: B */
    public ProfileLoopActionLayout f1362B;

    /* JADX INFO: renamed from: C */
    public boolean f1363C;

    /* JADX INFO: renamed from: D */
    public C0105b f1364D;

    /* JADX INFO: renamed from: E */
    public AdapterView.OnItemClickListener f1365E;

    /* JADX INFO: renamed from: F */
    public String f1366F;

    /* JADX INFO: renamed from: z */
    public VNavigationBar f1367z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.ProfileSelectInputFrag$a */
    public static class C0104a {
        /* JADX INFO: renamed from: b */
        public static void m2226b(ProfileSelectInputFrag profileSelectInputFrag, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            profileSelectInputFrag.f1367z = viewGroup.getChildAt(0);
            profileSelectInputFrag.f1361A = viewGroup.getChildAt(1);
            profileSelectInputFrag.f1362B = (ProfileLoopActionLayout) viewGroup.getChildAt(2);
        }

        /* JADX INFO: renamed from: c */
        public static View m2227c(ProfileSelectInputFrag profileSelectInputFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(n6c0.E, viewGroup, false);
            m2226b(profileSelectInputFrag, viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.ProfileSelectInputFrag$b */
    public class C0105b extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public ArrayList<LoopSelectFillData> f1368a = new ArrayList<>();

        public C0105b() {
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoopSelectFillData getItem(int i) {
            return this.f1368a.get(i);
        }

        /* JADX INFO: renamed from: b */
        public void m2229b(ArrayList<LoopSelectFillData> arrayList) {
            this.f1368a.clear();
            this.f1368a.addAll(arrayList);
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f1368a.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            C0106c c0106c;
            if (view == null) {
                view = LayoutInflater.from(ProfileSelectInputFrag.this.act()).inflate(n6c0.w, viewGroup, false);
                c0106c = new C0106c();
                c0106c.f1370a = (TextView) view.findViewById(a5c0.Y);
                c0106c.f1371b = (ImageView) view.findViewById(a5c0.a);
                c0106c.f1372c = view.findViewById(a5c0.y);
                view.setTag(a5c0.z, c0106c);
            } else {
                c0106c = (C0106c) view.getTag(a5c0.z);
            }
            LoopSelectFillData item = getItem(i);
            if (i == 0 && TextUtils.equals(item.m2063c(), ProfileSelectInputFrag.this.getString(R.string.V2))) {
                c0106c.f1370a.setTextColor(Color.parseColor("#e6000000"));
                c0106c.f1370a.setTypeface(Typeface.DEFAULT_BOLD);
                xdl0.M0(c0106c.f1371b, true);
                c0106c.f1371b.setImageDrawable(ProfileSelectInputFrag.this.getResources().getDrawable(e3c0.s));
            } else {
                c0106c.f1370a.setTypeface(Typeface.DEFAULT);
                xdl0.M(c0106c.f1371b, item.m2065e());
                c0106c.f1371b.setImageDrawable(ProfileSelectInputFrag.this.getResources().getDrawable(e3c0.r0));
            }
            if (item.m2066f()) {
                c0106c.f1372c.setBackgroundResource(e3c0.t0);
                c0106c.f1370a.setTextColor(ProfileSelectInputFrag.this.act().getResources().getColor(c1c0.f));
                xdl0.M0(c0106c.f1371b, true);
                c0106c.f1371b.setImageDrawable(ProfileSelectInputFrag.this.getResources().getDrawable(e3c0.h));
            } else {
                c0106c.f1372c.setBackgroundResource(e3c0.s0);
                c0106c.f1370a.setTextColor(Color.parseColor("#cf000000"));
            }
            c0106c.f1370a.setText(item.m2063c());
            return view;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.ProfileSelectInputFrag$c */
    public static class C0106c {

        /* JADX INFO: renamed from: a */
        public TextView f1370a;

        /* JADX INFO: renamed from: b */
        public ImageView f1371b;

        /* JADX INFO: renamed from: c */
        public View f1372c;
    }

    /* JADX INFO: renamed from: W4 */
    private void m2214W4() {
        String stringExtra = act().getIntent().getStringExtra("loop_create_tag_info");
        this.f1363C = act().getIntent().getBooleanExtra("loop_is_oversea", false);
        C0105b c0105b = new C0105b();
        this.f1364D = c0105b;
        this.f1361A.setAdapter(c0105b);
        if (m2217S4().m2192d2() == 0) {
            m2222Z4(stringExtra);
        }
        this.f1361A.setOnItemClickListener(this.f1365E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public /* synthetic */ void m2215X4(Bundle bundle) {
        m2214W4();
    }

    /* JADX INFO: renamed from: R4 */
    public View m2216R4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0104a.m2227c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S4 */
    public ProfileLoopSelectInputAct m2217S4() {
        return act();
    }

    /* JADX INFO: renamed from: T4 */
    public final ArrayList<LoopSelectFillData> m2218T4(String str) {
        List<String> listM1955Q;
        LoopSelectFillData loopSelectFillData;
        ArrayList<LoopSelectFillData> arrayList = new ArrayList<>();
        if (lqa.g() && NullChecker.a(LoopFragmentFactory.m1982u())) {
            LoopSelectFillData loopSelectFillData2 = null;
            if (!this.f1363C) {
                Iterator it = LoopFragmentFactory.m1982u().china.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        listM1955Q = null;
                        break;
                    }
                    HometownChinaItem hometownChinaItem = (HometownChinaItem) it.next();
                    if (hometownChinaItem.region.equals(str)) {
                        listM1955Q = hometownChinaItem.subRegion;
                        break;
                    }
                }
            } else {
                listM1955Q = m2217S4().m2192d2() == 0 ? LoopFragmentFactory.m1955Q(vwb.D(LoopFragmentFactory.m1982u().overseas)) : (List) LoopFragmentFactory.m1982u().overseas.get(str);
            }
            if (NullChecker.a(listM1955Q)) {
                ArrayList arrayList2 = new ArrayList();
                if (TextUtils.isEmpty(ura.e().d().Uc().profile.hometown)) {
                    arrayList2.add(ura.e().d().Uc().profile.hometown);
                }
                if (!vwb.J(ura.e().d().Uc().profile.extensions.basic.country)) {
                    arrayList2.add((String) ura.e().d().Uc().profile.extensions.basic.country.get(0));
                }
                if (!vwb.J(ura.e().d().Uc().profile.extensions.basic.province)) {
                    arrayList2.add((String) ura.e().d().Uc().profile.extensions.basic.province.get(0));
                }
                if (!vwb.J(ura.e().d().Uc().profile.extensions.basic.city)) {
                    arrayList2.add((String) ura.e().d().Uc().profile.extensions.basic.city.get(0));
                }
                for (String str2 : listM1955Q) {
                    if (!this.f1363C || vwb.J((Collection) LoopFragmentFactory.m1982u().overseas.get(str2))) {
                        loopSelectFillData = new LoopSelectFillData(str2);
                    } else {
                        loopSelectFillData = new LoopSelectFillData(str2, LoopSelectFillData.LoopSelectType.INPUT_ENTRY);
                        loopSelectFillData.m2070j();
                    }
                    if (arrayList2.contains(str2)) {
                        loopSelectFillData2 = loopSelectFillData;
                    } else {
                        arrayList.add(loopSelectFillData);
                    }
                }
                if (NullChecker.a(loopSelectFillData2)) {
                    loopSelectFillData2.m2069i(true);
                    arrayList.add(0, loopSelectFillData2);
                    return arrayList;
                }
            }
        } else if (NullChecker.a(LoopFragmentFactory.m1942D())) {
            List<String> list = (List) LoopFragmentFactory.m1942D().hometown.get(str);
            if (!TextUtils.isEmpty(str)) {
                LoopSelectFillData loopSelectFillData3 = new LoopSelectFillData(str);
                loopSelectFillData3.m2069i(true);
                arrayList.add(loopSelectFillData3);
            }
            if (NullChecker.a(list)) {
                for (String str3 : list) {
                    if (!TextUtils.equals(str3, str)) {
                        arrayList.add(new LoopSelectFillData(str3));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: U4 */
    public LoopSelectFillData m2219U4(int i) {
        return this.f1364D.getItem(i);
    }

    /* JADX INFO: renamed from: V4 */
    public String m2220V4() {
        return this.f1366F;
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m2221Y4(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: renamed from: Z4 */
    public void m2222Z4(String str) {
        this.f1366F = str;
        this.f1367z.setTitle(str);
        this.f1367z.setLeftIconOnClick(new View.OnClickListener() { // from class: l.rra0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18661a.m2221Y4(view);
            }
        });
        this.f1364D.m2229b(m2218T4(str));
    }

    /* JADX INFO: renamed from: a5 */
    public void m2223a5(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1365E = onItemClickListener;
    }

    /* JADX INFO: renamed from: d4 */
    public void m2224d4() {
        super.d4();
        creates(new e30() { // from class: l.qra0
            public final void call(Object obj) {
                this.f18190a.m2215X4((Bundle) obj);
            }
        });
    }

    public boolean disableAutoPV() {
        return true;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m2216R4(layoutInflater, viewGroup);
    }
}
