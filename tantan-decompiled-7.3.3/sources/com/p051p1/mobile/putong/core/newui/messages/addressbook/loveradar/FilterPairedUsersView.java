package com.p051p1.mobile.putong.core.newui.messages.addressbook.loveradar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.FateRadar;
import com.p051p1.mobile.putong.core.data.FilterConditionsStatusItem;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.Interest;
import com.p051p1.mobile.putong.data.Profile;
import java.util.ArrayList;
import java.util.List;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.gj40;
import p153l.jyb;
import p153l.mmi;
import p153l.qcj;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class FilterPairedUsersView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VFrame f26123a;

    /* JADX INFO: renamed from: b */
    public VImage f26124b;

    /* JADX INFO: renamed from: c */
    public VFrame f26125c;

    /* JADX INFO: renamed from: d */
    public VImage f26126d;

    /* JADX INFO: renamed from: e */
    public VLinear f26127e;

    /* JADX INFO: renamed from: f */
    public VFrame f26128f;

    /* JADX INFO: renamed from: g */
    public VText f26129g;

    /* JADX INFO: renamed from: h */
    public VFrame f26130h;

    /* JADX INFO: renamed from: i */
    public VText f26131i;

    /* JADX INFO: renamed from: j */
    public VFrame f26132j;

    /* JADX INFO: renamed from: k */
    public VText f26133k;

    /* JADX INFO: renamed from: l */
    public y20<String> f26134l;

    /* JADX INFO: renamed from: m */
    public FateRadar f26135m;

    /* JADX INFO: renamed from: n */
    public boolean f26136n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.FilterPairedUsersView$a */
    public class ViewOnClickListenerC8304a implements View.OnClickListener {
        public ViewOnClickListenerC8304a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FilterPairedUsersView.this.m42913e();
            if (FilterPairedUsersView.this.f26134l != null) {
                FilterPairedUsersView.this.f26134l.call("system");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.FilterPairedUsersView$b */
    public class ViewOnClickListenerC8305b implements View.OnClickListener {
        public ViewOnClickListenerC8305b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FilterPairedUsersView.this.m42912d();
            if (FilterPairedUsersView.this.f26134l != null) {
                FilterPairedUsersView.this.f26134l.call("custom");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.FilterPairedUsersView$c */
    public class C8306c implements qcj<String, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f26139a;

        public C8306c(List list) {
            this.f26139a = list;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(String str) {
            return Boolean.valueOf(this.f26139a.contains(str));
        }
    }

    public FilterPairedUsersView(Context context) {
        super(context);
        this.f26136n = false;
    }

    private static List<String> getMeNewTags() {
        Extensions extensions;
        Interest interest;
        Profile profile = CoreModule.f18264c.f20381e0.m116600p9().profile;
        return (profile == null || (extensions = profile.extensions) == null || (interest = extensions.interest) == null || jyb.m147479J(interest.tags)) ? new ArrayList() : CoreModule.f18264c.f20381e0.m116600p9().profile.extensions.interest.tags;
    }

    /* JADX INFO: renamed from: b */
    public final void m42910b(View view) {
        mmi.m159060a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m42911c(FateRadar fateRadar) {
        this.f26135m = fateRadar;
    }

    /* JADX INFO: renamed from: d */
    public void m42912d() {
        bnl0.m105525M0(this.f26126d, true);
        bnl0.m105525M0(this.f26124b, false);
        bnl0.m105524M(this.f26132j, this.f26136n);
        bnl0.m105524M(this.f26127e, true);
        this.f26129g.setText(getSearchOtherStatus());
        this.f26131i.setText(getSearchOtherFeature());
        this.f26133k.setText(getMeSelectedInterest());
    }

    /* JADX INFO: renamed from: e */
    public void m42913e() {
        bnl0.m105525M0(this.f26126d, false);
        bnl0.m105525M0(this.f26124b, true);
        bnl0.m105524M(this.f26127e, false);
    }

    public String getMeSelectedInterest() {
        if (this.f26135m == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        List<NewTags> listM130460b = gj40.m130415o().m130431P(jyb.m147522n(this.f26135m.searchConditions.customItems.selectedInterest, new C8306c(getMeNewTags()))).m130460b();
        for (int i = 0; i < listM130460b.size(); i++) {
            NewTags newTags = listM130460b.get(i);
            if (sb.length() == 0) {
                sb.append(newTags.name);
            } else {
                sb.append("、");
                sb.append(newTags.name);
            }
        }
        return sb.length() == 0 ? "不限" : sb.toString();
    }

    public String getSearchOtherFeature() {
        if (this.f26135m == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        List<FilterConditionsStatusItem> list = this.f26135m.searchConditions.customItems.feature;
        for (int i = 0; i < list.size(); i++) {
            FilterConditionsStatusItem filterConditionsStatusItem = list.get(i);
            if (filterConditionsStatusItem.selected) {
                if (sb.length() == 0) {
                    sb.append(filterConditionsStatusItem.value);
                } else {
                    sb.append("、");
                    sb.append(filterConditionsStatusItem.value);
                }
            }
        }
        return sb.length() == 0 ? "不限" : sb.toString();
    }

    public String getSearchOtherStatus() {
        if (this.f26135m == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        List<FilterConditionsStatusItem> list = this.f26135m.searchConditions.customItems.status;
        for (int i = 0; i < list.size(); i++) {
            FilterConditionsStatusItem filterConditionsStatusItem = list.get(i);
            if (filterConditionsStatusItem.selected) {
                if (sb.length() == 0) {
                    sb.append(filterConditionsStatusItem.value);
                } else {
                    sb.append("、");
                    sb.append(filterConditionsStatusItem.value);
                }
            }
        }
        return sb.length() == 0 ? "不限" : sb.toString();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42910b(this);
        bnl0.m105509E0(this.f26123a, new ViewOnClickListenerC8304a());
        bnl0.m105509E0(this.f26125c, new ViewOnClickListenerC8305b());
    }

    public void setAfterChangeStateListener(y20<String> y20Var) {
        this.f26134l = y20Var;
    }

    public void setShowInterest(boolean z) {
        this.f26136n = z;
    }

    public FilterPairedUsersView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26136n = false;
    }

    public FilterPairedUsersView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26136n = false;
    }
}
