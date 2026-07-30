package com.p046p1.mobile.putong.core.p053ui.profile.loop.input;

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
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.data.HometownChinaItem;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.LoopSelectFillData;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopActionLayout;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VList;
import p147v.navigationbar.VNavigationBar;
import p149l.a5c0;
import p149l.c1c0;
import p149l.e30;
import p149l.e3c0;
import p149l.lqa;
import p149l.n6c0;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileSelectInputFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public VList f33539A;

    /* JADX INFO: renamed from: B */
    public ProfileLoopActionLayout f33540B;

    /* JADX INFO: renamed from: C */
    public boolean f33541C;

    /* JADX INFO: renamed from: D */
    public C8680b f33542D;

    /* JADX INFO: renamed from: E */
    public AdapterView.OnItemClickListener f33543E;

    /* JADX INFO: renamed from: F */
    public String f33544F;

    /* JADX INFO: renamed from: z */
    public VNavigationBar f33545z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.ProfileSelectInputFrag$a */
    public static class C8679a {
        /* JADX INFO: renamed from: b */
        public static void m51704b(ProfileSelectInputFrag profileSelectInputFrag, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            profileSelectInputFrag.f33545z = (VNavigationBar) viewGroup.getChildAt(0);
            profileSelectInputFrag.f33539A = (VList) viewGroup.getChildAt(1);
            profileSelectInputFrag.f33540B = (ProfileLoopActionLayout) viewGroup.getChildAt(2);
        }

        /* JADX INFO: renamed from: c */
        public static View m51705c(ProfileSelectInputFrag profileSelectInputFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(n6c0.f137293E, viewGroup, false);
            m51704b(profileSelectInputFrag, viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.ProfileSelectInputFrag$b */
    public class C8680b extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public ArrayList<LoopSelectFillData> f33546a = new ArrayList<>();

        public C8680b() {
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoopSelectFillData getItem(int i) {
            return this.f33546a.get(i);
        }

        /* JADX INFO: renamed from: b */
        public void m51707b(ArrayList<LoopSelectFillData> arrayList) {
            this.f33546a.clear();
            this.f33546a.addAll(arrayList);
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f33546a.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            C8681c c8681c;
            if (view == null) {
                view = LayoutInflater.from(ProfileSelectInputFrag.this.act()).inflate(n6c0.f137384w, viewGroup, false);
                c8681c = new C8681c();
                c8681c.f33548a = (TextView) view.findViewById(a5c0.f67671Y);
                c8681c.f33549b = (ImageView) view.findViewById(a5c0.f67673a);
                c8681c.f33550c = view.findViewById(a5c0.f67702y);
                view.setTag(a5c0.f67703z, c8681c);
            } else {
                c8681c = (C8681c) view.getTag(a5c0.f67703z);
            }
            LoopSelectFillData item = getItem(i);
            if (i == 0 && TextUtils.equals(item.m51577c(), ProfileSelectInputFrag.this.getString(R$string.f27793V2))) {
                c8681c.f33548a.setTextColor(Color.parseColor("#e6000000"));
                c8681c.f33548a.setTypeface(Typeface.DEFAULT_BOLD);
                xdl0.m208345M0(c8681c.f33549b, true);
                c8681c.f33549b.setImageDrawable(ProfileSelectInputFrag.this.getResources().getDrawable(e3c0.f89144s));
            } else {
                c8681c.f33548a.setTypeface(Typeface.DEFAULT);
                xdl0.m208344M(c8681c.f33549b, item.m51579e());
                c8681c.f33549b.setImageDrawable(ProfileSelectInputFrag.this.getResources().getDrawable(e3c0.f89142r0));
            }
            if (item.m51580f()) {
                c8681c.f33550c.setBackgroundResource(e3c0.f89148t0);
                c8681c.f33548a.setTextColor(ProfileSelectInputFrag.this.act().getResources().getColor(c1c0.f78249f));
                xdl0.m208345M0(c8681c.f33549b, true);
                c8681c.f33549b.setImageDrawable(ProfileSelectInputFrag.this.getResources().getDrawable(e3c0.f89111h));
            } else {
                c8681c.f33550c.setBackgroundResource(e3c0.f89145s0);
                c8681c.f33548a.setTextColor(Color.parseColor("#cf000000"));
            }
            c8681c.f33548a.setText(item.m51577c());
            return view;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.input.ProfileSelectInputFrag$c */
    public static class C8681c {

        /* JADX INFO: renamed from: a */
        public TextView f33548a;

        /* JADX INFO: renamed from: b */
        public ImageView f33549b;

        /* JADX INFO: renamed from: c */
        public View f33550c;
    }

    /* JADX INFO: renamed from: W4 */
    private void m51693W4() {
        String stringExtra = act().getIntent().getStringExtra("loop_create_tag_info");
        this.f33541C = act().getIntent().getBooleanExtra("loop_is_oversea", false);
        C8680b c8680b = new C8680b();
        this.f33542D = c8680b;
        this.f33539A.setAdapter((ListAdapter) c8680b);
        if (m51696S4().m51681d2() == 0) {
            m51701Z4(stringExtra);
        }
        this.f33539A.setOnItemClickListener(this.f33543E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public /* synthetic */ void m51694X4(Bundle bundle) {
        m51693W4();
    }

    /* JADX INFO: renamed from: R4 */
    public View m51695R4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C8679a.m51705c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S4 */
    public ProfileLoopSelectInputAct m51696S4() {
        return (ProfileLoopSelectInputAct) act();
    }

    /* JADX INFO: renamed from: T4 */
    public final ArrayList<LoopSelectFillData> m51697T4(String str) {
        List<String> listM51473Q;
        LoopSelectFillData loopSelectFillData;
        ArrayList<LoopSelectFillData> arrayList = new ArrayList<>();
        if (lqa.m150969g() && NullChecker.m81303a(LoopFragmentFactory.m51500u())) {
            LoopSelectFillData loopSelectFillData2 = null;
            if (!this.f33541C) {
                Iterator<HometownChinaItem> it = LoopFragmentFactory.m51500u().china.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        listM51473Q = null;
                        break;
                    }
                    HometownChinaItem next = it.next();
                    if (next.region.equals(str)) {
                        listM51473Q = next.subRegion;
                        break;
                    }
                }
            } else {
                listM51473Q = m51696S4().m51681d2() == 0 ? LoopFragmentFactory.m51473Q(vwb.m200290D(LoopFragmentFactory.m51500u().overseas)) : LoopFragmentFactory.m51500u().overseas.get(str);
            }
            if (NullChecker.m81303a(listM51473Q)) {
                ArrayList arrayList2 = new ArrayList();
                if (TextUtils.isEmpty(ura.m195053e().m195057d().mo33757Uc().profile.hometown)) {
                    arrayList2.add(ura.m195053e().m195057d().mo33757Uc().profile.hometown);
                }
                if (!vwb.m200296J(ura.m195053e().m195057d().mo33757Uc().profile.extensions.basic.country)) {
                    arrayList2.add(ura.m195053e().m195057d().mo33757Uc().profile.extensions.basic.country.get(0));
                }
                if (!vwb.m200296J(ura.m195053e().m195057d().mo33757Uc().profile.extensions.basic.province)) {
                    arrayList2.add(ura.m195053e().m195057d().mo33757Uc().profile.extensions.basic.province.get(0));
                }
                if (!vwb.m200296J(ura.m195053e().m195057d().mo33757Uc().profile.extensions.basic.city)) {
                    arrayList2.add(ura.m195053e().m195057d().mo33757Uc().profile.extensions.basic.city.get(0));
                }
                for (String str2 : listM51473Q) {
                    if (!this.f33541C || vwb.m200296J(LoopFragmentFactory.m51500u().overseas.get(str2))) {
                        loopSelectFillData = new LoopSelectFillData(str2);
                    } else {
                        loopSelectFillData = new LoopSelectFillData(str2, LoopSelectFillData.LoopSelectType.INPUT_ENTRY);
                        loopSelectFillData.m51584j();
                    }
                    if (arrayList2.contains(str2)) {
                        loopSelectFillData2 = loopSelectFillData;
                    } else {
                        arrayList.add(loopSelectFillData);
                    }
                }
                if (NullChecker.m81303a(loopSelectFillData2)) {
                    loopSelectFillData2.m51583i(true);
                    arrayList.add(0, loopSelectFillData2);
                    return arrayList;
                }
            }
        } else if (NullChecker.m81303a(LoopFragmentFactory.m51460D())) {
            List<String> list = LoopFragmentFactory.m51460D().hometown.get(str);
            if (!TextUtils.isEmpty(str)) {
                LoopSelectFillData loopSelectFillData3 = new LoopSelectFillData(str);
                loopSelectFillData3.m51583i(true);
                arrayList.add(loopSelectFillData3);
            }
            if (NullChecker.m81303a(list)) {
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
    public LoopSelectFillData m51698U4(int i) {
        return this.f33542D.getItem(i);
    }

    /* JADX INFO: renamed from: V4 */
    public String m51699V4() {
        return this.f33544F;
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m51700Y4(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: renamed from: Z4 */
    public void m51701Z4(String str) {
        this.f33544F = str;
        this.f33545z.setTitle(str);
        this.f33545z.setLeftIconOnClick(new View.OnClickListener() { // from class: l.rra0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160733a.m51700Y4(view);
            }
        });
        this.f33542D.m51707b(m51697T4(str));
    }

    /* JADX INFO: renamed from: a5 */
    public void m51702a5(AdapterView.OnItemClickListener onItemClickListener) {
        this.f33543E = onItemClickListener;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        creates(new e30() { // from class: l.qra0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155976a.m51694X4((Bundle) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m51695R4(layoutInflater, viewGroup);
    }
}
