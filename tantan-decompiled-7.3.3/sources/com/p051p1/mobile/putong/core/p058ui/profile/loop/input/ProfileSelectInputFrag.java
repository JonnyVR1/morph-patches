package com.p051p1.mobile.putong.core.p058ui.profile.loop.input;

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
import android.widget.ListAdapter;
import android.widget.TextView;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.data.HometownChinaItem;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.LoopSelectFillData;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VList;
import p151v.navigationbar.VNavigationBar;
import p153l.bnl0;
import p153l.gdc0;
import p153l.gta;
import p153l.j9c0;
import p153l.jyb;
import p153l.kbc0;
import p153l.sec0;
import p153l.xra;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileSelectInputFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public VList f34387A;

    /* JADX INFO: renamed from: B */
    public ProfileLoopActionLayout f34388B;

    /* JADX INFO: renamed from: C */
    public boolean f34389C;

    /* JADX INFO: renamed from: D */
    public C8843b f34390D;

    /* JADX INFO: renamed from: E */
    public AdapterView.OnItemClickListener f34391E;

    /* JADX INFO: renamed from: F */
    public String f34392F;

    /* JADX INFO: renamed from: z */
    public VNavigationBar f34393z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.ProfileSelectInputFrag$a */
    public static class C8842a {
        /* JADX INFO: renamed from: b */
        public static void m52887b(ProfileSelectInputFrag profileSelectInputFrag, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            profileSelectInputFrag.f34393z = (VNavigationBar) viewGroup.getChildAt(0);
            profileSelectInputFrag.f34387A = (VList) viewGroup.getChildAt(1);
            profileSelectInputFrag.f34388B = (ProfileLoopActionLayout) viewGroup.getChildAt(2);
        }

        /* JADX INFO: renamed from: c */
        public static View m52888c(ProfileSelectInputFrag profileSelectInputFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(sec0.f167507E, viewGroup, false);
            m52887b(profileSelectInputFrag, viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.ProfileSelectInputFrag$b */
    public class C8843b extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public ArrayList<LoopSelectFillData> f34394a = new ArrayList<>();

        public C8843b() {
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoopSelectFillData getItem(int i) {
            return this.f34394a.get(i);
        }

        /* JADX INFO: renamed from: b */
        public void m52890b(ArrayList<LoopSelectFillData> arrayList) {
            this.f34394a.clear();
            this.f34394a.addAll(arrayList);
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f34394a.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            C8844c c8844c;
            if (view == null) {
                view = LayoutInflater.from(ProfileSelectInputFrag.this.act()).inflate(sec0.f167598w, viewGroup, false);
                c8844c = new C8844c();
                c8844c.f34396a = (TextView) view.findViewById(gdc0.f103666Y);
                c8844c.f34397b = (ImageView) view.findViewById(gdc0.f103668a);
                c8844c.f34398c = view.findViewById(gdc0.f103697y);
                view.setTag(gdc0.f103698z, c8844c);
            } else {
                c8844c = (C8844c) view.getTag(gdc0.f103698z);
            }
            LoopSelectFillData item = getItem(i);
            if (i == 0 && TextUtils.equals(item.m52760c(), ProfileSelectInputFrag.this.getString(R$string.f28641V2))) {
                c8844c.f34396a.setTextColor(Color.parseColor("#e6000000"));
                c8844c.f34396a.setTypeface(Typeface.DEFAULT_BOLD);
                bnl0.m105525M0(c8844c.f34397b, true);
                c8844c.f34397b.setImageDrawable(ProfileSelectInputFrag.this.getResources().getDrawable(kbc0.f124907s));
            } else {
                c8844c.f34396a.setTypeface(Typeface.DEFAULT);
                bnl0.m105524M(c8844c.f34397b, item.m52762e());
                c8844c.f34397b.setImageDrawable(ProfileSelectInputFrag.this.getResources().getDrawable(kbc0.f124905r0));
            }
            if (item.m52763f()) {
                c8844c.f34398c.setBackgroundResource(kbc0.f124911t0);
                c8844c.f34396a.setTextColor(ProfileSelectInputFrag.this.act().getResources().getColor(j9c0.f118869f));
                bnl0.m105525M0(c8844c.f34397b, true);
                c8844c.f34397b.setImageDrawable(ProfileSelectInputFrag.this.getResources().getDrawable(kbc0.f124874h));
            } else {
                c8844c.f34398c.setBackgroundResource(kbc0.f124908s0);
                c8844c.f34396a.setTextColor(Color.parseColor("#cf000000"));
            }
            c8844c.f34396a.setText(item.m52760c());
            return view;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.ProfileSelectInputFrag$c */
    public static class C8844c {

        /* JADX INFO: renamed from: a */
        public TextView f34396a;

        /* JADX INFO: renamed from: b */
        public ImageView f34397b;

        /* JADX INFO: renamed from: c */
        public View f34398c;
    }

    /* JADX INFO: renamed from: W4 */
    private void m52876W4() {
        String stringExtra = act().getIntent().getStringExtra("loop_create_tag_info");
        this.f34389C = act().getIntent().getBooleanExtra("loop_is_oversea", false);
        C8843b c8843b = new C8843b();
        this.f34390D = c8843b;
        this.f34387A.setAdapter((ListAdapter) c8843b);
        if (m52879S4().m52864e2() == 0) {
            m52884Z4(stringExtra);
        }
        this.f34387A.setOnItemClickListener(this.f34391E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public /* synthetic */ void m52877X4(Bundle bundle) {
        m52876W4();
    }

    /* JADX INFO: renamed from: R4 */
    public View m52878R4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C8842a.m52888c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S4 */
    public ProfileLoopSelectInputAct m52879S4() {
        return (ProfileLoopSelectInputAct) act();
    }

    /* JADX INFO: renamed from: T4 */
    public final ArrayList<LoopSelectFillData> m52880T4(String str) {
        List<String> listM52656Q;
        LoopSelectFillData loopSelectFillData;
        ArrayList<LoopSelectFillData> arrayList = new ArrayList<>();
        if (xra.m212788g() && NullChecker.m82486a(LoopFragmentFactory.m52683u())) {
            LoopSelectFillData loopSelectFillData2 = null;
            if (!this.f34389C) {
                Iterator<HometownChinaItem> it = LoopFragmentFactory.m52683u().china.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        listM52656Q = null;
                        break;
                    }
                    HometownChinaItem next = it.next();
                    if (next.region.equals(str)) {
                        listM52656Q = next.subRegion;
                        break;
                    }
                }
            } else {
                listM52656Q = m52879S4().m52864e2() == 0 ? LoopFragmentFactory.m52656Q(jyb.m147473D(LoopFragmentFactory.m52683u().overseas)) : LoopFragmentFactory.m52683u().overseas.get(str);
            }
            if (NullChecker.m82486a(listM52656Q)) {
                ArrayList arrayList2 = new ArrayList();
                if (TextUtils.isEmpty(gta.m132210e().m132214d().mo34760Uc().profile.hometown)) {
                    arrayList2.add(gta.m132210e().m132214d().mo34760Uc().profile.hometown);
                }
                if (!jyb.m147479J(gta.m132210e().m132214d().mo34760Uc().profile.extensions.basic.country)) {
                    arrayList2.add(gta.m132210e().m132214d().mo34760Uc().profile.extensions.basic.country.get(0));
                }
                if (!jyb.m147479J(gta.m132210e().m132214d().mo34760Uc().profile.extensions.basic.province)) {
                    arrayList2.add(gta.m132210e().m132214d().mo34760Uc().profile.extensions.basic.province.get(0));
                }
                if (!jyb.m147479J(gta.m132210e().m132214d().mo34760Uc().profile.extensions.basic.city)) {
                    arrayList2.add(gta.m132210e().m132214d().mo34760Uc().profile.extensions.basic.city.get(0));
                }
                for (String str2 : listM52656Q) {
                    if (!this.f34389C || jyb.m147479J(LoopFragmentFactory.m52683u().overseas.get(str2))) {
                        loopSelectFillData = new LoopSelectFillData(str2);
                    } else {
                        loopSelectFillData = new LoopSelectFillData(str2, LoopSelectFillData.LoopSelectType.INPUT_ENTRY);
                        loopSelectFillData.m52767j();
                    }
                    if (arrayList2.contains(str2)) {
                        loopSelectFillData2 = loopSelectFillData;
                    } else {
                        arrayList.add(loopSelectFillData);
                    }
                }
                if (NullChecker.m82486a(loopSelectFillData2)) {
                    loopSelectFillData2.m52766i(true);
                    arrayList.add(0, loopSelectFillData2);
                    return arrayList;
                }
            }
        } else if (NullChecker.m82486a(LoopFragmentFactory.m52643D())) {
            List<String> list = LoopFragmentFactory.m52643D().hometown.get(str);
            if (!TextUtils.isEmpty(str)) {
                LoopSelectFillData loopSelectFillData3 = new LoopSelectFillData(str);
                loopSelectFillData3.m52766i(true);
                arrayList.add(loopSelectFillData3);
            }
            if (NullChecker.m82486a(list)) {
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
    public LoopSelectFillData m52881U4(int i) {
        return this.f34390D.getItem(i);
    }

    /* JADX INFO: renamed from: V4 */
    public String m52882V4() {
        return this.f34392F;
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m52883Y4(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: renamed from: Z4 */
    public void m52884Z4(String str) {
        this.f34392F = str;
        this.f34393z.setTitle(str);
        this.f34393z.setLeftIconOnClick(new View.OnClickListener() { // from class: l.vza0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186458a.m52883Y4(view);
            }
        });
        this.f34390D.m52890b(m52880T4(str));
    }

    /* JADX INFO: renamed from: a5 */
    public void m52885a5(AdapterView.OnItemClickListener onItemClickListener) {
        this.f34391E = onItemClickListener;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        creates(new y20() { // from class: l.uza0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181716a.m52877X4((Bundle) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m52878R4(layoutInflater, viewGroup);
    }
}
